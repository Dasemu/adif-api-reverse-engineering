package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* loaded from: classes3.dex */
public final class CodedInputStream {
    private final byte[] buffer;
    private final boolean bufferIsImmutable;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final InputStream input;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private RefillCallback refillCallback;
    private int sizeLimit;
    private int totalBytesRetired;

    /* loaded from: classes3.dex */
    public interface RefillCallback {
        void onRefill();
    }

    private CodedInputStream(InputStream inputStream) {
        this.enableAliasing = false;
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
        this.bufferSize = 0;
        this.bufferPos = 0;
        this.totalBytesRetired = 0;
        this.input = inputStream;
        this.bufferIsImmutable = false;
    }

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    private void ensureAvailable(int i) throws IOException {
        if (this.bufferSize - this.bufferPos < i) {
            refillBuffer(i);
        }
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return new CodedInputStream(inputStream);
    }

    private byte[] readRawBytesSlowPath(int i) throws IOException {
        if (i <= 0) {
            if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i4 = this.totalBytesRetired;
        int i5 = this.bufferPos;
        int i6 = i4 + i5 + i;
        int i7 = this.currentLimit;
        if (i6 > i7) {
            skipRawBytes((i7 - i4) - i5);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i < 4096) {
            byte[] bArr = new byte[i];
            int i8 = this.bufferSize - i5;
            System.arraycopy(this.buffer, i5, bArr, 0, i8);
            this.bufferPos = this.bufferSize;
            int i9 = i - i8;
            ensureAvailable(i9);
            System.arraycopy(this.buffer, 0, bArr, i8, i9);
            this.bufferPos = i9;
            return bArr;
        }
        int i10 = this.bufferSize;
        this.totalBytesRetired = i4 + i10;
        this.bufferPos = 0;
        this.bufferSize = 0;
        int i11 = i10 - i5;
        int i12 = i - i11;
        ArrayList arrayList = new ArrayList();
        while (i12 > 0) {
            int min = Math.min(i12, ConstantsKt.DEFAULT_BLOCK_SIZE);
            byte[] bArr2 = new byte[min];
            int i13 = 0;
            while (i13 < min) {
                InputStream inputStream = this.input;
                int read = inputStream == null ? -1 : inputStream.read(bArr2, i13, min - i13);
                if (read == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += read;
                i13 += read;
            }
            i12 -= min;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(this.buffer, i5, bArr3, 0, i11);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr4 = (byte[]) it.next();
            System.arraycopy(bArr4, 0, bArr3, i11, bArr4.length);
            i11 += bArr4.length;
        }
        return bArr3;
    }

    private void recomputeBufferSizeAfterLimit() {
        int i = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i;
        int i4 = this.totalBytesRetired + i;
        int i5 = this.currentLimit;
        if (i4 <= i5) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i6 = i4 - i5;
        this.bufferSizeAfterLimit = i6;
        this.bufferSize = i - i6;
    }

    private void refillBuffer(int i) throws IOException {
        if (!tryRefillBuffer(i)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private void skipRawBytesSlowPath(int i) throws IOException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i4 = this.totalBytesRetired;
        int i5 = this.bufferPos;
        int i6 = i4 + i5 + i;
        int i7 = this.currentLimit;
        if (i6 > i7) {
            skipRawBytes((i7 - i4) - i5);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i8 = this.bufferSize;
        int i9 = i8 - i5;
        this.bufferPos = i8;
        refillBuffer(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.bufferSize;
            if (i10 <= i11) {
                this.bufferPos = i10;
                return;
            } else {
                i9 += i11;
                this.bufferPos = i11;
                refillBuffer(1);
            }
        }
    }

    private boolean tryRefillBuffer(int i) throws IOException {
        int i4 = this.bufferPos;
        if (i4 + i <= this.bufferSize) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.totalBytesRetired + i4 + i > this.currentLimit) {
            return false;
        }
        RefillCallback refillCallback = this.refillCallback;
        if (refillCallback != null) {
            refillCallback.onRefill();
        }
        if (this.input != null) {
            int i5 = this.bufferPos;
            if (i5 > 0) {
                int i6 = this.bufferSize;
                if (i6 > i5) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i5, bArr, 0, i6 - i5);
                }
                this.totalBytesRetired += i5;
                this.bufferSize -= i5;
                this.bufferPos = 0;
            }
            InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i7 = this.bufferSize;
            int read = inputStream.read(bArr2, i7, bArr2.length - i7);
            if (read == 0 || read < -1 || read > this.buffer.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(read);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (read > 0) {
                this.bufferSize += read;
                if ((this.totalBytesRetired + i) - this.sizeLimit > 0) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                recomputeBufferSizeAfterLimit();
                if (this.bufferSize >= i) {
                    return true;
                }
                return tryRefillBuffer(i);
            }
        }
        return false;
    }

    public void checkLastTagWas(int i) throws InvalidProtocolBufferException {
        if (this.lastTag != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public int getBytesUntilLimit() {
        int i = this.currentLimit;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.totalBytesRetired + this.bufferPos);
    }

    public boolean isAtEnd() throws IOException {
        return this.bufferPos == this.bufferSize && !tryRefillBuffer(1);
    }

    public void popLimit(int i) {
        this.currentLimit = i;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i4 = this.totalBytesRetired + this.bufferPos + i;
        int i5 = this.currentLimit;
        if (i4 > i5) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.currentLimit = i4;
        recomputeBufferSizeAfterLimit();
        return i5;
    }

    public boolean readBool() throws IOException {
        return readRawVarint64() != 0;
    }

    public ByteString readBytes() throws IOException {
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i4 = this.bufferPos;
        if (readRawVarint32 > i - i4 || readRawVarint32 <= 0) {
            return readRawVarint32 == 0 ? ByteString.EMPTY : new LiteralByteString(readRawBytesSlowPath(readRawVarint32));
        }
        ByteString boundedByteString = (this.bufferIsImmutable && this.enableAliasing) ? new BoundedByteString(this.buffer, this.bufferPos, readRawVarint32) : ByteString.copyFrom(this.buffer, i4, readRawVarint32);
        this.bufferPos += readRawVarint32;
        return boundedByteString;
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i4 = this.recursionDepth;
        if (i4 >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        this.recursionDepth = i4 + 1;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i, 4));
        this.recursionDepth--;
    }

    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth < this.recursionLimit) {
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(pushLimit);
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public byte readRawByte() throws IOException {
        if (this.bufferPos == this.bufferSize) {
            refillBuffer(1);
        }
        byte[] bArr = this.buffer;
        int i = this.bufferPos;
        this.bufferPos = i + 1;
        return bArr[i];
    }

    public int readRawLittleEndian32() throws IOException {
        int i = this.bufferPos;
        if (this.bufferSize - i < 4) {
            refillBuffer(4);
            i = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i + 4;
        return (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16) | ((bArr[i + 3] & UByte.MAX_VALUE) << 24);
    }

    public long readRawLittleEndian64() throws IOException {
        int i = this.bufferPos;
        if (this.bufferSize - i < 8) {
            refillBuffer(8);
            i = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public int readRawVarint32() throws IOException {
        int i;
        int i4 = this.bufferPos;
        int i5 = this.bufferSize;
        if (i5 != i4) {
            byte[] bArr = this.buffer;
            int i6 = i4 + 1;
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                this.bufferPos = i6;
                return b4;
            }
            if (i5 - i6 >= 9) {
                int i7 = i4 + 2;
                int i8 = (bArr[i6] << 7) ^ b4;
                long j4 = i8;
                if (j4 < 0) {
                    i = (int) ((-128) ^ j4);
                } else {
                    int i9 = i4 + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    long j5 = i10;
                    if (j5 >= 0) {
                        i = (int) (16256 ^ j5);
                    } else {
                        int i11 = i4 + 4;
                        long j6 = i10 ^ (bArr[i9] << 21);
                        if (j6 < 0) {
                            i = (int) ((-2080896) ^ j6);
                        } else {
                            i9 = i4 + 5;
                            int i12 = (int) ((r1 ^ (r3 << 28)) ^ 266354560);
                            if (bArr[i11] < 0) {
                                i11 = i4 + 6;
                                if (bArr[i9] < 0) {
                                    i9 = i4 + 7;
                                    if (bArr[i11] < 0) {
                                        i11 = i4 + 8;
                                        if (bArr[i9] < 0) {
                                            i9 = i4 + 9;
                                            if (bArr[i11] < 0) {
                                                int i13 = i4 + 10;
                                                if (bArr[i9] >= 0) {
                                                    i7 = i13;
                                                    i = i12;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i12;
                            }
                            i = i12;
                        }
                        i7 = i11;
                    }
                    i7 = i9;
                }
                this.bufferPos = i7;
                return i;
            }
        }
        return (int) readRawVarint64SlowPath();
    }

    public long readRawVarint64() throws IOException {
        long j4;
        long j5;
        long j6;
        int i = this.bufferPos;
        int i4 = this.bufferSize;
        if (i4 != i) {
            byte[] bArr = this.buffer;
            int i5 = i + 1;
            byte b4 = bArr[i];
            if (b4 >= 0) {
                this.bufferPos = i5;
                return b4;
            }
            if (i4 - i5 >= 9) {
                int i6 = i + 2;
                long j7 = (bArr[i5] << 7) ^ b4;
                if (j7 >= 0) {
                    int i7 = i + 3;
                    long j8 = j7 ^ (bArr[i6] << 14);
                    if (j8 >= 0) {
                        j6 = 16256;
                    } else {
                        i6 = i + 4;
                        j7 = j8 ^ (bArr[i7] << 21);
                        if (j7 < 0) {
                            j5 = -2080896;
                        } else {
                            i7 = i + 5;
                            j8 = j7 ^ (bArr[i6] << 28);
                            if (j8 >= 0) {
                                j6 = 266354560;
                            } else {
                                i6 = i + 6;
                                j7 = j8 ^ (bArr[i7] << 35);
                                if (j7 < 0) {
                                    j5 = -34093383808L;
                                } else {
                                    i7 = i + 7;
                                    j8 = j7 ^ (bArr[i6] << 42);
                                    if (j8 >= 0) {
                                        j6 = 4363953127296L;
                                    } else {
                                        i6 = i + 8;
                                        j7 = j8 ^ (bArr[i7] << 49);
                                        if (j7 < 0) {
                                            j5 = -558586000294016L;
                                        } else {
                                            i7 = i + 9;
                                            long j9 = (j7 ^ (bArr[i6] << 56)) ^ 71499008037633920L;
                                            if (j9 >= 0) {
                                                j4 = j9;
                                                i6 = i7;
                                                this.bufferPos = i6;
                                                return j4;
                                            }
                                            i6 = i + 10;
                                            if (bArr[i7] >= 0) {
                                                j4 = j9;
                                                this.bufferPos = i6;
                                                return j4;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j4 = j8 ^ j6;
                    i6 = i7;
                    this.bufferPos = i6;
                    return j4;
                }
                j5 = -128;
                j4 = j7 ^ j5;
                this.bufferPos = i6;
                return j4;
            }
        }
        return readRawVarint64SlowPath();
    }

    public long readRawVarint64SlowPath() throws IOException {
        long j4 = 0;
        for (int i = 0; i < 64; i += 7) {
            j4 |= (r3 & ByteCompanionObject.MAX_VALUE) << i;
            if ((readRawByte() & ByteCompanionObject.MIN_VALUE) == 0) {
                return j4;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public int readSInt32() throws IOException {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() throws IOException {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() throws IOException {
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i4 = this.bufferPos;
        if (readRawVarint32 > i - i4 || readRawVarint32 <= 0) {
            return readRawVarint32 == 0 ? "" : new String(readRawBytesSlowPath(readRawVarint32), "UTF-8");
        }
        String str = new String(this.buffer, i4, readRawVarint32, "UTF-8");
        this.bufferPos += readRawVarint32;
        return str;
    }

    public String readStringRequireUtf8() throws IOException {
        byte[] readRawBytesSlowPath;
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferPos;
        if (readRawVarint32 <= this.bufferSize - i && readRawVarint32 > 0) {
            readRawBytesSlowPath = this.buffer;
            this.bufferPos = i + readRawVarint32;
        } else {
            if (readRawVarint32 == 0) {
                return "";
            }
            readRawBytesSlowPath = readRawBytesSlowPath(readRawVarint32);
            i = 0;
        }
        if (Utf8.isValidUtf8(readRawBytesSlowPath, i, i + readRawVarint32)) {
            return new String(readRawBytesSlowPath, i, readRawVarint32, "UTF-8");
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.lastTag = readRawVarint32;
        if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
            return this.lastTag;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    public boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            long readInt64 = readInt64();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeUInt64NoTag(readInt64);
            return true;
        }
        if (tagWireType == 1) {
            long readRawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
            return true;
        }
        if (tagWireType == 2) {
            ByteString readBytes = readBytes();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeBytesNoTag(readBytes);
            return true;
        }
        if (tagWireType == 3) {
            codedOutputStream.writeRawVarint32(i);
            skipMessage(codedOutputStream);
            int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
            checkLastTagWas(makeTag);
            codedOutputStream.writeRawVarint32(makeTag);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int readRawLittleEndian32 = readRawLittleEndian32();
        codedOutputStream.writeRawVarint32(i);
        codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
        return true;
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
        } while (skipField(readTag, codedOutputStream));
    }

    public void skipRawBytes(int i) throws IOException {
        int i4 = this.bufferSize;
        int i5 = this.bufferPos;
        if (i > i4 - i5 || i < 0) {
            skipRawBytesSlowPath(i);
        } else {
            this.bufferPos = i5 + i;
        }
    }

    public static CodedInputStream newInstance(LiteralByteString literalByteString) {
        CodedInputStream codedInputStream = new CodedInputStream(literalByteString);
        try {
            codedInputStream.pushLimit(literalByteString.size());
            return codedInputStream;
        } catch (InvalidProtocolBufferException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth < this.recursionLimit) {
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(pushLimit);
            return parsePartialFrom;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    private CodedInputStream(LiteralByteString literalByteString) {
        this.enableAliasing = false;
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = literalByteString.bytes;
        int offsetIntoBytes = literalByteString.getOffsetIntoBytes();
        this.bufferPos = offsetIntoBytes;
        this.bufferSize = offsetIntoBytes + literalByteString.size();
        this.totalBytesRetired = -this.bufferPos;
        this.input = null;
        this.bufferIsImmutable = true;
    }

    public static int readRawVarint32(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i4 = i & WorkQueueKt.MASK;
        int i5 = 7;
        while (i5 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i4 |= (read & WorkQueueKt.MASK) << i5;
            if ((read & 128) == 0) {
                return i4;
            }
            i5 += 7;
        }
        while (i5 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((read2 & 128) == 0) {
                return i4;
            }
            i5 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }
}
