package androidx.lifecycle;

/* loaded from: classes.dex */
public final class O extends P implements H {

    /* renamed from: e, reason: collision with root package name */
    public final J f3305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q f3306f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Q q4, J j4, Y y3) {
        super(q4, y3);
        this.f3306f = q4;
        this.f3305e = j4;
    }

    @Override // androidx.lifecycle.P
    public final void b() {
        this.f3305e.getLifecycle().c(this);
    }

    @Override // androidx.lifecycle.P
    public final boolean c(J j4) {
        return this.f3305e == j4;
    }

    @Override // androidx.lifecycle.P
    public final boolean f() {
        return this.f3305e.getLifecycle().b().a(B.f3283d);
    }

    @Override // androidx.lifecycle.H
    public final void onStateChanged(J j4, A a2) {
        J j5 = this.f3305e;
        B b4 = j5.getLifecycle().b();
        if (b4 == B.f3280a) {
            this.f3306f.i(this.f3307a);
            return;
        }
        B b5 = null;
        while (b5 != b4) {
            a(f());
            b5 = b4;
            b4 = j5.getLifecycle().b();
        }
    }
}
