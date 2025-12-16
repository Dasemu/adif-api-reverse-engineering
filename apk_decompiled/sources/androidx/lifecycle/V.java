package androidx.lifecycle;

/* loaded from: classes.dex */
public final class V implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final Q f3328a;

    /* renamed from: b, reason: collision with root package name */
    public final C0191l f3329b;

    /* renamed from: c, reason: collision with root package name */
    public int f3330c = -1;

    public V(Q q4, C0191l c0191l) {
        this.f3328a = q4;
        this.f3329b = c0191l;
    }

    @Override // androidx.lifecycle.Y
    public final void onChanged(Object obj) {
        int i = this.f3330c;
        int i4 = this.f3328a.f3318g;
        if (i != i4) {
            this.f3330c = i4;
            this.f3329b.onChanged(obj);
        }
    }
}
