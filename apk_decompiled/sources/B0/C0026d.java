package B0;

import android.view.ViewGroup;

/* renamed from: B0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026d extends y {

    /* renamed from: a, reason: collision with root package name */
    public boolean f124a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f125b;

    public C0026d(ViewGroup viewGroup) {
        this.f125b = viewGroup;
    }

    @Override // B0.y, B0.v
    public final void b() {
        H.b(this.f125b, false);
    }

    @Override // B0.y, B0.v
    public final void c(x xVar) {
        if (!this.f124a) {
            H.b(this.f125b, false);
        }
        xVar.A(this);
    }

    @Override // B0.y, B0.v
    public final void d() {
        H.b(this.f125b, true);
    }

    @Override // B0.y, B0.v
    public final void e(x xVar) {
        H.b(this.f125b, false);
        this.f124a = true;
    }
}
