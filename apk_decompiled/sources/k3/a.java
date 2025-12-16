package k3;

import i3.l;
import i3.o;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import r3.C;
import r3.C0576h;
import r3.I;
import r3.K;
import r3.q;

/* loaded from: classes3.dex */
public abstract class a implements I {

    /* renamed from: a, reason: collision with root package name */
    public final q f7097a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f7099c;

    public a(o oVar) {
        this.f7099c = oVar;
        this.f7097a = new q(((C) oVar.f6895d).f8245a.timeout());
    }

    public final void d() {
        o oVar = this.f7099c;
        int i = oVar.f6892a;
        if (i == 6) {
            return;
        }
        if (i == 5) {
            o.i(oVar, this.f7097a);
            oVar.f6892a = 6;
        } else {
            throw new IllegalStateException("state: " + oVar.f6892a);
        }
    }

    @Override // r3.I
    public long read(C0576h sink, long j4) {
        o oVar = this.f7099c;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            return ((C) oVar.f6895d).read(sink, j4);
        } catch (IOException e4) {
            ((l) oVar.f6894c).k();
            this.d();
            throw e4;
        }
    }

    @Override // r3.I
    public final K timeout() {
        return this.f7097a;
    }
}
