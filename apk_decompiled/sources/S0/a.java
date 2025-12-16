package S0;

import androidx.lifecycle.C;
import androidx.lifecycle.J;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class a implements q {

    /* renamed from: a, reason: collision with root package name */
    public final C f1441a;

    /* renamed from: b, reason: collision with root package name */
    public final Job f1442b;

    public a(C c4, Job job) {
        this.f1441a = c4;
        this.f1442b = job;
    }

    @Override // S0.q
    public final void complete() {
        this.f1441a.c(this);
    }

    @Override // androidx.lifecycle.InterfaceC0192m
    public final void e(J j4) {
        Job.DefaultImpls.cancel$default(this.f1442b, (CancellationException) null, 1, (Object) null);
    }

    @Override // S0.q
    public final void start() {
        this.f1441a.a(this);
    }
}
