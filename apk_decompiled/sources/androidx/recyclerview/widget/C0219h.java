package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219h {

    /* renamed from: a, reason: collision with root package name */
    public final C0209c f3819a;

    /* renamed from: b, reason: collision with root package name */
    public int f3820b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f3821c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f3822d = -1;

    public C0219h(C0209c c0209c) {
        this.f3819a = c0209c;
    }

    public final void a() {
        int i = this.f3820b;
        if (i == 0) {
            return;
        }
        C0209c c0209c = this.f3819a;
        if (i == 1) {
            c0209c.d(this.f3821c, this.f3822d);
        } else if (i == 2) {
            c0209c.e(this.f3821c, this.f3822d);
        } else if (i == 3) {
            ((Z) c0209c.f3796a).notifyItemRangeChanged(this.f3821c, this.f3822d, null);
        }
        this.f3820b = 0;
    }

    public final void b(int i, int i4) {
        int i5;
        int i6;
        int i7;
        if (this.f3820b == 3 && i <= (i6 = this.f3822d + (i5 = this.f3821c)) && (i7 = i + i4) >= i5) {
            this.f3821c = Math.min(i, i5);
            this.f3822d = Math.max(i6, i7) - this.f3821c;
        } else {
            a();
            this.f3821c = i;
            this.f3822d = i4;
            this.f3820b = 3;
        }
    }

    public final void c(int i, int i4) {
        a();
        ((Z) this.f3819a.f3796a).notifyItemMoved(i, i4);
    }
}
