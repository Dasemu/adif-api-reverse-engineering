package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3796a;

    public /* synthetic */ C0209c(Object obj) {
        this.f3796a = obj;
    }

    public boolean a(int i, int i4) {
        androidx.fragment.app.D0 d02 = (androidx.fragment.app.D0) this.f3796a;
        Object obj = d02.f2990c.get(i);
        Object obj2 = d02.f2991d.get(i4);
        if (obj != null && obj2 != null) {
            return ((AbstractC0211d) ((C0217g) d02.f2993f).f3811b.f491c).a(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public boolean b(int i, int i4) {
        androidx.fragment.app.D0 d02 = (androidx.fragment.app.D0) this.f3796a;
        Object obj = d02.f2990c.get(i);
        Object obj2 = d02.f2991d.get(i4);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : ((AbstractC0211d) ((C0217g) d02.f2993f).f3811b.f491c).b(obj, obj2);
    }

    public void c(int i, int i4) {
        androidx.fragment.app.D0 d02 = (androidx.fragment.app.D0) this.f3796a;
        Object obj = d02.f2990c.get(i);
        Object obj2 = d02.f2991d.get(i4);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        Object obj3 = ((C0217g) d02.f2993f).f3811b.f491c;
    }

    public void d(int i, int i4) {
        ((Z) this.f3796a).notifyItemRangeInserted(i, i4);
    }

    public void e(int i, int i4) {
        ((Z) this.f3796a).notifyItemRangeRemoved(i, i4);
    }
}
