package k3;

import C.w;
import i3.l;
import i3.o;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import r3.C0576h;

/* loaded from: classes3.dex */
public final class d extends a {

    /* renamed from: d, reason: collision with root package name */
    public long f7107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f7108e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o oVar, long j4) {
        super(oVar);
        this.f7108e = oVar;
        this.f7107d = j4;
        if (j4 == 0) {
            d();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7098b) {
            return;
        }
        if (this.f7107d != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!f3.c.g(this)) {
                ((l) this.f7108e.f6894c).k();
                d();
            }
        }
        this.f7098b = true;
    }

    @Override // k3.a, r3.I
    public final long read(C0576h sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(w.l("byteCount < 0: ", j4).toString());
        }
        if (this.f7098b) {
            throw new IllegalStateException("closed");
        }
        long j5 = this.f7107d;
        if (j5 == 0) {
            return -1L;
        }
        long read = super.read(sink, Math.min(j5, j4));
        if (read == -1) {
            ((l) this.f7108e.f6894c).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            d();
            throw protocolException;
        }
        long j6 = this.f7107d - read;
        this.f7107d = j6;
        if (j6 == 0) {
            d();
        }
        return read;
    }
}
