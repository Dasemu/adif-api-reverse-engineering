package k3;

import i3.o;
import kotlin.jvm.internal.Intrinsics;
import r3.B;
import r3.C0576h;
import r3.G;
import r3.K;
import r3.q;

/* loaded from: classes3.dex */
public final class b implements G {

    /* renamed from: a, reason: collision with root package name */
    public final q f7100a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f7102c;

    public b(o oVar) {
        this.f7102c = oVar;
        this.f7100a = new q(((B) oVar.f6896e).f8242a.timeout());
    }

    @Override // r3.G, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f7101b) {
            return;
        }
        this.f7101b = true;
        ((B) this.f7102c.f6896e).Q("0\r\n\r\n");
        o.i(this.f7102c, this.f7100a);
        this.f7102c.f6892a = 3;
    }

    @Override // r3.G, java.io.Flushable
    public final synchronized void flush() {
        if (this.f7101b) {
            return;
        }
        ((B) this.f7102c.f6896e).flush();
    }

    @Override // r3.G
    public final K timeout() {
        return this.f7100a;
    }

    @Override // r3.G
    public final void z(C0576h source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f7101b) {
            throw new IllegalStateException("closed");
        }
        if (j4 == 0) {
            return;
        }
        o oVar = this.f7102c;
        B b4 = (B) oVar.f6896e;
        if (b4.f8244c) {
            throw new IllegalStateException("closed");
        }
        b4.f8243b.l0(j4);
        b4.d();
        B b5 = (B) oVar.f6896e;
        b5.Q("\r\n");
        b5.z(source, j4);
        b5.Q("\r\n");
    }
}
