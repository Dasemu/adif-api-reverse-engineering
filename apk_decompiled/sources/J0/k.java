package J0;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class k extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f944a;

    /* renamed from: b, reason: collision with root package name */
    public int f945b = 1073741824;

    public k(InputStream inputStream) {
        this.f944a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f945b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f944a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.f944a.read();
        if (read == -1) {
            this.f945b = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j4) {
        return this.f944a.skip(j4);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.f944a.read(bArr);
        if (read == -1) {
            this.f945b = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        int read = this.f944a.read(bArr, i, i4);
        if (read == -1) {
            this.f945b = 0;
        }
        return read;
    }
}
