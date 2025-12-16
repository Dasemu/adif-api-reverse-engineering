package S0;

import androidx.lifecycle.C;
import androidx.lifecycle.J;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class u implements q {

    /* renamed from: a, reason: collision with root package name */
    public final I0.p f1527a;

    /* renamed from: b, reason: collision with root package name */
    public final j f1528b;

    /* renamed from: c, reason: collision with root package name */
    public final U0.a f1529c;

    /* renamed from: d, reason: collision with root package name */
    public final C f1530d;

    /* renamed from: e, reason: collision with root package name */
    public final Job f1531e;

    public u(I0.p pVar, j jVar, U0.a aVar, C c4, Job job) {
        this.f1527a = pVar;
        this.f1528b = jVar;
        this.f1529c = aVar;
        this.f1530d = c4;
        this.f1531e = job;
    }

    @Override // androidx.lifecycle.InterfaceC0192m
    public final void e(J j4) {
        Job launch$default;
        w c4 = W0.f.c(this.f1529c.f1775b);
        synchronized (c4) {
            try {
                Job job = c4.f1534b;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                launch$default = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain().getImmediate(), null, new v(c4, null), 2, null);
                c4.f1534b = launch$default;
                c4.f1533a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // S0.q
    public final void s() {
        U0.a aVar = this.f1529c;
        if (aVar.f1775b.isAttachedToWindow()) {
            return;
        }
        w c4 = W0.f.c(aVar.f1775b);
        u uVar = c4.f1535c;
        if (uVar != null) {
            Job.DefaultImpls.cancel$default(uVar.f1531e, (CancellationException) null, 1, (Object) null);
            C c5 = uVar.f1530d;
            U0.a aVar2 = uVar.f1529c;
            if (aVar2 != null) {
                c5.c(aVar2);
            }
            c5.c(uVar);
        }
        c4.f1535c = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // S0.q
    public final void start() {
        C c4 = this.f1530d;
        c4.a(this);
        U0.a aVar = this.f1529c;
        if (aVar != null) {
            c4.c(aVar);
            c4.a(aVar);
        }
        w c5 = W0.f.c(aVar.f1775b);
        u uVar = c5.f1535c;
        if (uVar != null) {
            Job.DefaultImpls.cancel$default(uVar.f1531e, (CancellationException) null, 1, (Object) null);
            C c6 = uVar.f1530d;
            U0.a aVar2 = uVar.f1529c;
            if (aVar2 != null) {
                c6.c(aVar2);
            }
            c6.c(uVar);
        }
        c5.f1535c = this;
    }
}
