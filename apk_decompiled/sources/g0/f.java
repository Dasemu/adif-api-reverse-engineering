package g0;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f6684a.mark(Integer.MAX_VALUE);
    }

    public final void e(long j4) {
        int i = this.f6686c;
        if (i > j4) {
            this.f6686c = 0;
            this.f6684a.reset();
        } else {
            j4 -= i;
        }
        d((int) j4);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f6684a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
