package com.google.firebase.crashlytics.internal.metadata;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class QueueFile implements Closeable {
    static final int HEADER_LENGTH = 16;
    private static final int INITIAL_LENGTH = 4096;
    private static final Logger LOGGER = Logger.getLogger(QueueFile.class.getName());
    private final byte[] buffer;
    private int elementCount;
    int fileLength;
    private Element first;
    private Element last;
    private final RandomAccessFile raf;

    /* loaded from: classes3.dex */
    public static class Element {
        static final int HEADER_LENGTH = 4;
        static final Element NULL = new Element(0, 0);
        final int length;
        final int position;

        public Element(int i, int i4) {
            this.position = i;
            this.length = i4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append("[position = ");
            sb.append(this.position);
            sb.append(", length = ");
            return com.google.android.gms.measurement.internal.a.m(sb, this.length, "]");
        }
    }

    /* loaded from: classes3.dex */
    public final class ElementInputStream extends InputStream {
        private int position;
        private int remaining;

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i4) throws IOException {
            QueueFile.nonNull(bArr, "buffer");
            if ((i | i4) >= 0 && i4 <= bArr.length - i) {
                int i5 = this.remaining;
                if (i5 <= 0) {
                    return -1;
                }
                if (i4 > i5) {
                    i4 = i5;
                }
                QueueFile.this.ringRead(this.position, bArr, i, i4);
                this.position = QueueFile.this.wrapPosition(this.position + i4);
                this.remaining -= i4;
                return i4;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        private ElementInputStream(Element element) {
            this.position = QueueFile.this.wrapPosition(element.position + 4);
            this.remaining = element.length;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.remaining == 0) {
                return -1;
            }
            QueueFile.this.raf.seek(this.position);
            int read = QueueFile.this.raf.read();
            this.position = QueueFile.this.wrapPosition(this.position + 1);
            this.remaining--;
            return read;
        }
    }

    /* loaded from: classes3.dex */
    public interface ElementReader {
        void read(InputStream inputStream, int i) throws IOException;
    }

    public QueueFile(File file) throws IOException {
        this.buffer = new byte[16];
        if (!file.exists()) {
            initialize(file);
        }
        this.raf = open(file);
        readHeader();
    }

    private void expandIfNecessary(int i) throws IOException {
        int i4 = i + 4;
        int remainingBytes = remainingBytes();
        if (remainingBytes >= i4) {
            return;
        }
        int i5 = this.fileLength;
        do {
            remainingBytes += i5;
            i5 <<= 1;
        } while (remainingBytes < i4);
        setLength(i5);
        Element element = this.last;
        int wrapPosition = wrapPosition(element.position + 4 + element.length);
        if (wrapPosition < this.first.position) {
            FileChannel channel = this.raf.getChannel();
            channel.position(this.fileLength);
            long j4 = wrapPosition - 4;
            if (channel.transferTo(16L, j4, channel) != j4) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i6 = this.last.position;
        int i7 = this.first.position;
        if (i6 < i7) {
            int i8 = (this.fileLength + i6) - 16;
            writeHeader(i5, this.elementCount, i7, i8);
            this.last = new Element(i8, this.last.length);
        } else {
            writeHeader(i5, this.elementCount, i7, i6);
        }
        this.fileLength = i5;
    }

    private static void initialize(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile open = open(file2);
        try {
            open.setLength(4096L);
            open.seek(0L);
            byte[] bArr = new byte[16];
            writeInts(bArr, 4096, 0, 0, 0);
            open.write(bArr);
            open.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            open.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T nonNull(T t2, String str) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile open(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private Element readElement(int i) throws IOException {
        if (i == 0) {
            return Element.NULL;
        }
        this.raf.seek(i);
        return new Element(i, this.raf.readInt());
    }

    private void readHeader() throws IOException {
        this.raf.seek(0L);
        this.raf.readFully(this.buffer);
        int readInt = readInt(this.buffer, 0);
        this.fileLength = readInt;
        if (readInt > this.raf.length()) {
            throw new IOException("File is truncated. Expected length: " + this.fileLength + ", Actual length: " + this.raf.length());
        }
        this.elementCount = readInt(this.buffer, 4);
        int readInt2 = readInt(this.buffer, 8);
        int readInt3 = readInt(this.buffer, 12);
        this.first = readElement(readInt2);
        this.last = readElement(readInt3);
    }

    private static int readInt(byte[] bArr, int i) {
        return ((bArr[i] & UByte.MAX_VALUE) << 24) + ((bArr[i + 1] & UByte.MAX_VALUE) << 16) + ((bArr[i + 2] & UByte.MAX_VALUE) << 8) + (bArr[i + 3] & UByte.MAX_VALUE);
    }

    private int remainingBytes() {
        return this.fileLength - usedBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ringRead(int i, byte[] bArr, int i4, int i5) throws IOException {
        int wrapPosition = wrapPosition(i);
        int i6 = wrapPosition + i5;
        int i7 = this.fileLength;
        if (i6 <= i7) {
            this.raf.seek(wrapPosition);
            this.raf.readFully(bArr, i4, i5);
            return;
        }
        int i8 = i7 - wrapPosition;
        this.raf.seek(wrapPosition);
        this.raf.readFully(bArr, i4, i8);
        this.raf.seek(16L);
        this.raf.readFully(bArr, i4 + i8, i5 - i8);
    }

    private void ringWrite(int i, byte[] bArr, int i4, int i5) throws IOException {
        int wrapPosition = wrapPosition(i);
        int i6 = wrapPosition + i5;
        int i7 = this.fileLength;
        if (i6 <= i7) {
            this.raf.seek(wrapPosition);
            this.raf.write(bArr, i4, i5);
            return;
        }
        int i8 = i7 - wrapPosition;
        this.raf.seek(wrapPosition);
        this.raf.write(bArr, i4, i8);
        this.raf.seek(16L);
        this.raf.write(bArr, i4 + i8, i5 - i8);
    }

    private void setLength(int i) throws IOException {
        this.raf.setLength(i);
        this.raf.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int wrapPosition(int i) {
        int i4 = this.fileLength;
        return i < i4 ? i : (i + 16) - i4;
    }

    private void writeHeader(int i, int i4, int i5, int i6) throws IOException {
        writeInts(this.buffer, i, i4, i5, i6);
        this.raf.seek(0L);
        this.raf.write(this.buffer);
    }

    private static void writeInt(byte[] bArr, int i, int i4) {
        bArr[i] = (byte) (i4 >> 24);
        bArr[i + 1] = (byte) (i4 >> 16);
        bArr[i + 2] = (byte) (i4 >> 8);
        bArr[i + 3] = (byte) i4;
    }

    private static void writeInts(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i4 : iArr) {
            writeInt(bArr, i, i4);
            i += 4;
        }
    }

    public void add(byte[] bArr) throws IOException {
        add(bArr, 0, bArr.length);
    }

    public synchronized void clear() throws IOException {
        try {
            writeHeader(4096, 0, 0, 0);
            this.elementCount = 0;
            Element element = Element.NULL;
            this.first = element;
            this.last = element;
            if (this.fileLength > 4096) {
                setLength(4096);
            }
            this.fileLength = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.raf.close();
    }

    public synchronized void forEach(ElementReader elementReader) throws IOException {
        int i = this.first.position;
        for (int i4 = 0; i4 < this.elementCount; i4++) {
            Element readElement = readElement(i);
            elementReader.read(new ElementInputStream(readElement), readElement.length);
            i = wrapPosition(readElement.position + 4 + readElement.length);
        }
    }

    public boolean hasSpaceFor(int i, int i4) {
        return (usedBytes() + 4) + i <= i4;
    }

    public synchronized boolean isEmpty() {
        return this.elementCount == 0;
    }

    public synchronized byte[] peek() throws IOException {
        if (isEmpty()) {
            return null;
        }
        Element element = this.first;
        int i = element.length;
        byte[] bArr = new byte[i];
        ringRead(element.position + 4, bArr, 0, i);
        return bArr;
    }

    public synchronized void remove() throws IOException {
        try {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.elementCount == 1) {
                clear();
            } else {
                Element element = this.first;
                int wrapPosition = wrapPosition(element.position + 4 + element.length);
                ringRead(wrapPosition, this.buffer, 0, 4);
                int readInt = readInt(this.buffer, 0);
                writeHeader(this.fileLength, this.elementCount - 1, wrapPosition, this.last.position);
                this.elementCount--;
                this.first = new Element(wrapPosition, readInt);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int size() {
        return this.elementCount;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.fileLength);
        sb.append(", size=");
        sb.append(this.elementCount);
        sb.append(", first=");
        sb.append(this.first);
        sb.append(", last=");
        sb.append(this.last);
        sb.append(", element lengths=[");
        try {
            forEach(new ElementReader() { // from class: com.google.firebase.crashlytics.internal.metadata.QueueFile.1
                boolean first = true;

                @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
                public void read(InputStream inputStream, int i) throws IOException {
                    if (this.first) {
                        this.first = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i);
                }
            });
        } catch (IOException e4) {
            LOGGER.log(Level.WARNING, "read error", (Throwable) e4);
        }
        sb.append("]]");
        return sb.toString();
    }

    public int usedBytes() {
        if (this.elementCount == 0) {
            return 16;
        }
        Element element = this.last;
        int i = element.position;
        int i4 = this.first.position;
        return i >= i4 ? (i - i4) + 4 + element.length + 16 : (((i + 4) + element.length) + this.fileLength) - i4;
    }

    public synchronized void add(byte[] bArr, int i, int i4) throws IOException {
        int wrapPosition;
        try {
            nonNull(bArr, "buffer");
            if ((i | i4) >= 0 && i4 <= bArr.length - i) {
                expandIfNecessary(i4);
                boolean isEmpty = isEmpty();
                if (isEmpty) {
                    wrapPosition = 16;
                } else {
                    Element element = this.last;
                    wrapPosition = wrapPosition(element.position + 4 + element.length);
                }
                Element element2 = new Element(wrapPosition, i4);
                writeInt(this.buffer, 0, i4);
                ringWrite(element2.position, this.buffer, 0, 4);
                ringWrite(element2.position + 4, bArr, i, i4);
                writeHeader(this.fileLength, this.elementCount + 1, isEmpty ? element2.position : this.first.position, element2.position);
                this.last = element2;
                this.elementCount++;
                if (isEmpty) {
                    this.first = element2;
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public QueueFile(RandomAccessFile randomAccessFile) throws IOException {
        this.buffer = new byte[16];
        this.raf = randomAccessFile;
        readHeader();
    }

    public synchronized void peek(ElementReader elementReader) throws IOException {
        if (this.elementCount > 0) {
            elementReader.read(new ElementInputStream(this.first), this.first.length);
        }
    }
}
