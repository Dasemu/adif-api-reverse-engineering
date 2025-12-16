package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import kotlin.KotlinVersion;
import kotlin.io.ConstantsKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* loaded from: classes3.dex */
public final class CodedOutputStream {
    private final byte[] buffer;
    private final int limit;
    private final OutputStream output;
    private int totalBytesWritten = 0;
    private int position = 0;

    /* loaded from: classes3.dex */
    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.output = outputStream;
        this.buffer = bArr;
        this.limit = bArr.length;
    }

    public static int computeBoolSize(int i, boolean z3) {
        return computeBoolSizeNoTag(z3) + computeTagSize(i);
    }

    public static int computeBoolSizeNoTag(boolean z3) {
        return 1;
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeBytesSize(int i, ByteString byteString) {
        return computeBytesSizeNoTag(byteString) + computeTagSize(i);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return byteString.size() + computeRawVarint32Size(byteString.size());
    }

    public static int computeDoubleSize(int i, double d4) {
        return computeDoubleSizeNoTag(d4) + computeTagSize(i);
    }

    public static int computeDoubleSizeNoTag(double d4) {
        return 8;
    }

    public static int computeEnumSize(int i, int i4) {
        return computeEnumSizeNoTag(i4) + computeTagSize(i);
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeInt32SizeNoTag(i);
    }

    public static int computeFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeFixed64SizeNoTag(long j4) {
        return 8;
    }

    public static int computeFloatSize(int i, float f2) {
        return computeFloatSizeNoTag(f2) + computeTagSize(i);
    }

    public static int computeFloatSizeNoTag(float f2) {
        return 4;
    }

    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i, int i4) {
        return computeInt32SizeNoTag(i4) + computeTagSize(i);
    }

    public static int computeInt32SizeNoTag(int i) {
        if (i >= 0) {
            return computeRawVarint32Size(i);
        }
        return 10;
    }

    public static int computeInt64SizeNoTag(long j4) {
        return computeRawVarint64Size(j4);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        int serializedSize = lazyFieldLite.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeMessageSize(int i, MessageLite messageLite) {
        return computeMessageSizeNoTag(messageLite) + computeTagSize(i);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computePreferredBufferSize(int i) {
        return i > 4096 ? ConstantsKt.DEFAULT_BLOCK_SIZE : i;
    }

    public static int computeRawVarint32Size(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j4) {
        if (((-128) & j4) == 0) {
            return 1;
        }
        if (((-16384) & j4) == 0) {
            return 2;
        }
        if (((-2097152) & j4) == 0) {
            return 3;
        }
        if (((-268435456) & j4) == 0) {
            return 4;
        }
        if (((-34359738368L) & j4) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j4) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j4) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j4) == 0) {
            return 8;
        }
        return (j4 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeSFixed64SizeNoTag(long j4) {
        return 8;
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeRawVarint32Size(encodeZigZag32(i));
    }

    public static int computeSInt64Size(int i, long j4) {
        return computeSInt64SizeNoTag(j4) + computeTagSize(i);
    }

    public static int computeSInt64SizeNoTag(long j4) {
        return computeRawVarint64Size(encodeZigZag64(j4));
    }

    public static int computeStringSizeNoTag(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return computeRawVarint32Size(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException("UTF-8 not supported.", e4);
        }
    }

    public static int computeTagSize(int i) {
        return computeRawVarint32Size(WireFormat.makeTag(i, 0));
    }

    public static int computeUInt32SizeNoTag(int i) {
        return computeRawVarint32Size(i);
    }

    public static int computeUInt64SizeNoTag(long j4) {
        return computeRawVarint64Size(j4);
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j4) {
        return (j4 >> 63) ^ (j4 << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    private void refreshBuffer() throws IOException {
        OutputStream outputStream = this.output;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.buffer, 0, this.position);
        this.position = 0;
    }

    public void flush() throws IOException {
        if (this.output != null) {
            refreshBuffer();
        }
    }

    public void writeBool(int i, boolean z3) throws IOException {
        writeTag(i, 0);
        writeBoolNoTag(z3);
    }

    public void writeBoolNoTag(boolean z3) throws IOException {
        writeRawByte(z3 ? 1 : 0);
    }

    public void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeBytes(int i, ByteString byteString) throws IOException {
        writeTag(i, 2);
        writeBytesNoTag(byteString);
    }

    public void writeBytesNoTag(ByteString byteString) throws IOException {
        writeRawVarint32(byteString.size());
        writeRawBytes(byteString);
    }

    public void writeDouble(int i, double d4) throws IOException {
        writeTag(i, 1);
        writeDoubleNoTag(d4);
    }

    public void writeDoubleNoTag(double d4) throws IOException {
        writeRawLittleEndian64(Double.doubleToRawLongBits(d4));
    }

    public void writeEnum(int i, int i4) throws IOException {
        writeTag(i, 0);
        writeEnumNoTag(i4);
    }

    public void writeEnumNoTag(int i) throws IOException {
        writeInt32NoTag(i);
    }

    public void writeFixed32NoTag(int i) throws IOException {
        writeRawLittleEndian32(i);
    }

    public void writeFixed64NoTag(long j4) throws IOException {
        writeRawLittleEndian64(j4);
    }

    public void writeFloat(int i, float f2) throws IOException {
        writeTag(i, 5);
        writeFloatNoTag(f2);
    }

    public void writeFloatNoTag(float f2) throws IOException {
        writeRawLittleEndian32(Float.floatToRawIntBits(f2));
    }

    public void writeGroup(int i, MessageLite messageLite) throws IOException {
        writeTag(i, 3);
        writeGroupNoTag(messageLite);
        writeTag(i, 4);
    }

    public void writeGroupNoTag(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    public void writeInt32(int i, int i4) throws IOException {
        writeTag(i, 0);
        writeInt32NoTag(i4);
    }

    public void writeInt32NoTag(int i) throws IOException {
        if (i >= 0) {
            writeRawVarint32(i);
        } else {
            writeRawVarint64(i);
        }
    }

    public void writeInt64NoTag(long j4) throws IOException {
        writeRawVarint64(j4);
    }

    public void writeMessage(int i, MessageLite messageLite) throws IOException {
        writeTag(i, 2);
        writeMessageNoTag(messageLite);
    }

    public void writeMessageNoTag(MessageLite messageLite) throws IOException {
        writeRawVarint32(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    public void writeMessageSetExtension(int i, MessageLite messageLite) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeMessage(3, messageLite);
        writeTag(1, 4);
    }

    public void writeRawByte(byte b4) throws IOException {
        if (this.position == this.limit) {
            refreshBuffer();
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = b4;
        this.totalBytesWritten++;
    }

    public void writeRawBytes(ByteString byteString) throws IOException {
        writeRawBytes(byteString, 0, byteString.size());
    }

    public void writeRawLittleEndian32(int i) throws IOException {
        writeRawByte(i & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public void writeRawLittleEndian64(long j4) throws IOException {
        writeRawByte(((int) j4) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j4 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j4 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j4 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j4 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j4 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j4 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j4 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public void writeRawVarint32(int i) throws IOException {
        while ((i & (-128)) != 0) {
            writeRawByte((i & WorkQueueKt.MASK) | 128);
            i >>>= 7;
        }
        writeRawByte(i);
    }

    public void writeRawVarint64(long j4) throws IOException {
        while (((-128) & j4) != 0) {
            writeRawByte((((int) j4) & WorkQueueKt.MASK) | 128);
            j4 >>>= 7;
        }
        writeRawByte((int) j4);
    }

    public void writeSFixed32NoTag(int i) throws IOException {
        writeRawLittleEndian32(i);
    }

    public void writeSFixed64NoTag(long j4) throws IOException {
        writeRawLittleEndian64(j4);
    }

    public void writeSInt32NoTag(int i) throws IOException {
        writeRawVarint32(encodeZigZag32(i));
    }

    public void writeSInt64(int i, long j4) throws IOException {
        writeTag(i, 0);
        writeSInt64NoTag(j4);
    }

    public void writeSInt64NoTag(long j4) throws IOException {
        writeRawVarint64(encodeZigZag64(j4));
    }

    public void writeStringNoTag(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        writeRawVarint32(bytes.length);
        writeRawBytes(bytes);
    }

    public void writeTag(int i, int i4) throws IOException {
        writeRawVarint32(WireFormat.makeTag(i, i4));
    }

    public void writeUInt32(int i, int i4) throws IOException {
        writeTag(i, 0);
        writeUInt32NoTag(i4);
    }

    public void writeUInt32NoTag(int i) throws IOException {
        writeRawVarint32(i);
    }

    public void writeUInt64NoTag(long j4) throws IOException {
        writeRawVarint64(j4);
    }

    public void writeRawBytes(byte[] bArr) throws IOException {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawBytes(byte[] bArr, int i, int i4) throws IOException {
        int i5 = this.limit;
        int i6 = this.position;
        if (i5 - i6 >= i4) {
            System.arraycopy(bArr, i, this.buffer, i6, i4);
            this.position += i4;
            this.totalBytesWritten += i4;
            return;
        }
        int i7 = i5 - i6;
        System.arraycopy(bArr, i, this.buffer, i6, i7);
        int i8 = i + i7;
        int i9 = i4 - i7;
        this.position = this.limit;
        this.totalBytesWritten += i7;
        refreshBuffer();
        if (i9 <= this.limit) {
            System.arraycopy(bArr, i8, this.buffer, 0, i9);
            this.position = i9;
        } else {
            this.output.write(bArr, i8, i9);
        }
        this.totalBytesWritten += i9;
    }

    public void writeRawByte(int i) throws IOException {
        writeRawByte((byte) i);
    }

    public void writeRawBytes(ByteString byteString, int i, int i4) throws IOException {
        int i5 = this.limit;
        int i6 = this.position;
        if (i5 - i6 >= i4) {
            byteString.copyTo(this.buffer, i, i6, i4);
            this.position += i4;
            this.totalBytesWritten += i4;
            return;
        }
        int i7 = i5 - i6;
        byteString.copyTo(this.buffer, i, i6, i7);
        int i8 = i + i7;
        int i9 = i4 - i7;
        this.position = this.limit;
        this.totalBytesWritten += i7;
        refreshBuffer();
        if (i9 <= this.limit) {
            byteString.copyTo(this.buffer, i8, 0, i9);
            this.position = i9;
        } else {
            byteString.writeTo(this.output, i8, i9);
        }
        this.totalBytesWritten += i9;
    }
}
