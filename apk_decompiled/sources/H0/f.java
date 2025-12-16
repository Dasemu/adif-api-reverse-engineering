package H0;

import androidx.recyclerview.widget.AbstractC0224j0;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class f extends AbstractC0224j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f646a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f647b;

    public /* synthetic */ f(Object obj, int i) {
        this.f646a = i;
        this.f647b = obj;
    }

    @Override // androidx.recyclerview.widget.AbstractC0224j0
    public final void a() {
        switch (this.f646a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.f647b;
                viewPager2.f4082e = true;
                viewPager2.f4087l.f645l = true;
                return;
            default:
                ((A.j) this.f647b).q();
                return;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0224j0
    public final void b(int i, int i4, Object obj) {
        a();
    }

    @Override // androidx.recyclerview.widget.AbstractC0224j0
    public final void c(int i, int i4) {
        a();
    }

    @Override // androidx.recyclerview.widget.AbstractC0224j0
    public final void d(int i, int i4) {
        a();
    }

    @Override // androidx.recyclerview.widget.AbstractC0224j0
    public final void e(int i, int i4) {
        a();
    }
}
