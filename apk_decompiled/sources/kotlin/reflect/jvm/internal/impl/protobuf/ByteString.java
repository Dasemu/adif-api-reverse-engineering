package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class ByteString implements Iterable<Byte> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final ByteString EMPTY = new LiteralByteString(new byte[0]);

    /* loaded from: classes3.dex */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i4 = i >>> 1;
        return balancedConcat(it, i4).concat(balancedConcat(it, i - i4));
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i4) {
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i, bArr2, 0, i4);
        return new LiteralByteString(bArr2);
    }

    public static ByteString copyFromUtf8(String str) {
        try {
            return new LiteralByteString(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException("UTF-8 not supported?", e4);
        }
    }

    public static Output newOutput() {
        return new Output(128);
    }

    public ByteString concat(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (size + size2 < 2147483647L) {
            return RopeByteString.concatenate(this, byteString);
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public void copyTo(byte[] bArr, int i, int i4, int i5) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i4 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i4);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i5 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i5);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i6 = i + i5;
        if (i6 > size()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i6);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i7 = i4 + i5;
        if (i7 <= bArr.length) {
            if (i5 > 0) {
                copyToInternal(bArr, i, i4, i5);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i7);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public abstract void copyToInternal(byte[] bArr, int i, int i4, int i5);

    public abstract int getTreeDepth();

    public abstract boolean isBalanced();

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Iterable
    public abstract Iterator<Byte> iterator();

    public abstract CodedInputStream newCodedInput();

    public abstract int partialHash(int i, int i4, int i5);

    public abstract int partialIsValidUtf8(int i, int i4, int i5);

    public abstract int peekCachedHashCode();

    public abstract int size();

    public byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String toString(String str) throws UnsupportedEncodingException;

    public String toStringUtf8() {
        try {
            return toString("UTF-8");
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException("UTF-8 not supported?", e4);
        }
    }

    public void writeTo(OutputStream outputStream, int i, int i4) throws IOException {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i4 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i4);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i5 = i + i4;
        if (i5 <= size()) {
            if (i4 > 0) {
                writeToInternal(outputStream, i, i4);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i5);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i, int i4) throws IOException;

    /* loaded from: classes3.dex */
    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        public Output(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.initialCapacity = i;
            this.flushedBuffers = new ArrayList<>();
            this.buffer = new byte[i];
        }

        private byte[] copyArray(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        private void flushFullBuffer(int i) {
            this.flushedBuffers.add(new LiteralByteString(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i >= bArr.length) {
                this.flushedBuffers.add(new LiteralByteString(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i > 0) {
                this.flushedBuffers.add(new LiteralByteString(copyArray(bArr, i)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized ByteString toByteString() {
            flushLastBuffer();
            return ByteString.copyFrom(this.flushedBuffers);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            try {
                if (this.bufferPos == this.buffer.length) {
                    flushFullBuffer(1);
                }
                byte[] bArr = this.buffer;
                int i4 = this.bufferPos;
                this.bufferPos = i4 + 1;
                bArr[i4] = (byte) i;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i4) {
            try {
                byte[] bArr2 = this.buffer;
                int length = bArr2.length;
                int i5 = this.bufferPos;
                if (i4 <= length - i5) {
                    System.arraycopy(bArr, i, bArr2, i5, i4);
                    this.bufferPos += i4;
                } else {
                    int length2 = bArr2.length - i5;
                    System.arraycopy(bArr, i, bArr2, i5, length2);
                    int i6 = i4 - length2;
                    flushFullBuffer(i6);
                    System.arraycopy(bArr, i + length2, this.buffer, 0, i6);
                    this.bufferPos = i6;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        ?? r02;
        if (!(iterable instanceof Collection)) {
            r02 = new ArrayList();
            Iterator<ByteString> it = iterable.iterator();
            while (it.hasNext()) {
                r02.add(it.next());
            }
        } else {
            r02 = (Collection) iterable;
        }
        if (r02.isEmpty()) {
            return EMPTY;
        }
        return balancedConcat(r02.iterator(), r02.size());
    }
}
