package k3;

import i3.o;
import kotlin.jvm.internal.Intrinsics;
import r3.B;
import r3.C0576h;
import r3.G;
import r3.K;
import r3.q;

/* loaded from: classes3.dex */
public final class e implements G {

    /* renamed from: a, reason: collision with root package name */
    public final q f7109a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7110b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f7111c;

    public e(o oVar) {
        this.f7111c = oVar;
        this.f7109a = new q(((B) oVar.f6896e).f8242a.timeout());
    }

    @Override // r3.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7110b) {
            return;
        }
        this.f7110b = true;
        o oVar = this.f7111c;
        o.i(oVar, this.f7109a);
        oVar.f6892a = 3;
    }

    @Override // r3.G, java.io.Flushable
    public final void flush() {
        if (this.f7110b) {
            return;
        }
        ((B) this.f7111c.f6896e).flush();
    }

    @Override // r3.G
    public final K timeout() {
        return this.f7109a;
    }

    @Override // r3.G
    public final void z(C0576h source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f7110b) {
            throw new IllegalStateException("closed");
        }
        long j5 = source.f8284b;
        byte[] bArr = f3.c.f6469a;
        if (j4 < 0 || 0 > j5 || j5 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((B) this.f7111c.f6896e).z(source, j4);
    }
}
