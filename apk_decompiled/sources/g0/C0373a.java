package g0;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f6680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f6681b;

    public C0373a(f fVar) {
        this.f6681b = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j4, byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        if (j4 < 0) {
            return -1;
        }
        try {
            long j5 = this.f6680a;
            f fVar = this.f6681b;
            if (j5 != j4) {
                if (j5 >= 0 && j4 >= j5 + fVar.f6684a.available()) {
                    return -1;
                }
                fVar.e(j4);
                this.f6680a = j4;
            }
            if (i4 > fVar.f6684a.available()) {
                i4 = fVar.f6684a.available();
            }
            int read = fVar.read(bArr, i, i4);
            if (read >= 0) {
                this.f6680a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f6680a = -1L;
        return -1;
    }
}
