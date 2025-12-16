package g0;

import C.w;
import android.util.Log;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: e, reason: collision with root package name */
    public static final ByteOrder f6682e = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: f, reason: collision with root package name */
    public static final ByteOrder f6683f = ByteOrder.BIG_ENDIAN;

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f6684a;

    /* renamed from: b, reason: collision with root package name */
    public ByteOrder f6685b;

    /* renamed from: c, reason: collision with root package name */
    public int f6686c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f6687d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(byte[] r2) {
        /*
            r1 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r2)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 0
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.b.<init>(byte[]):void");
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f6684a.available();
    }

    public final void d(int i) {
        int i4 = 0;
        while (i4 < i) {
            DataInputStream dataInputStream = this.f6684a;
            int i5 = i - i4;
            int skip = (int) dataInputStream.skip(i5);
            if (skip <= 0) {
                if (this.f6687d == null) {
                    this.f6687d = new byte[8192];
                }
                skip = dataInputStream.read(this.f6687d, 0, Math.min(8192, i5));
                if (skip == -1) {
                    throw new EOFException(w.i(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i4 += skip;
        }
        this.f6686c += i4;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f6686c++;
        return this.f6684a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f6686c++;
        return this.f6684a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f6686c++;
        int read = this.f6684a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f6686c += 2;
        return this.f6684a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i4) {
        this.f6686c += i4;
        this.f6684a.readFully(bArr, i, i4);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f6686c += 4;
        DataInputStream dataInputStream = this.f6684a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f6685b;
        if (byteOrder == f6682e) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == f6683f) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f6685b);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f6686c += 8;
        DataInputStream dataInputStream = this.f6684a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f6685b;
        if (byteOrder == f6682e) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == f6683f) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        throw new IOException("Invalid byte order: " + this.f6685b);
    }

    @Override // java.io.DataInput
    public final short readShort() {
        int i;
        this.f6686c += 2;
        DataInputStream dataInputStream = this.f6684a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f6685b;
        if (byteOrder == f6682e) {
            i = (read2 << 8) + read;
        } else {
            if (byteOrder != f6683f) {
                throw new IOException("Invalid byte order: " + this.f6685b);
            }
            i = (read << 8) + read2;
        }
        return (short) i;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f6686c += 2;
        return this.f6684a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f6686c++;
        return this.f6684a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f6686c += 2;
        DataInputStream dataInputStream = this.f6684a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f6685b;
        if (byteOrder == f6682e) {
            return (read2 << 8) + read;
        }
        if (byteOrder == f6683f) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f6685b);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public b(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f6685b = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f6684a = dataInputStream;
        dataInputStream.mark(0);
        this.f6686c = 0;
        this.f6685b = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        int read = this.f6684a.read(bArr, i, i4);
        this.f6686c += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f6686c += bArr.length;
        this.f6684a.readFully(bArr);
    }
}
