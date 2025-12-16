package H2;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class i implements F0.h {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f709a;

    /* renamed from: b, reason: collision with root package name */
    public int f710b;

    /* renamed from: c, reason: collision with root package name */
    public int f711c;

    public i(TabLayout tabLayout) {
        this.f709a = new WeakReference(tabLayout);
    }

    @Override // F0.h
    public final void a(int i) {
        this.f710b = this.f711c;
        this.f711c = i;
        TabLayout tabLayout = (TabLayout) this.f709a.get();
        if (tabLayout != null) {
            tabLayout.f5782T = this.f711c;
        }
    }

    @Override // F0.h
    public final void b(int i) {
        TabLayout tabLayout = (TabLayout) this.f709a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        int i4 = this.f711c;
        tabLayout.k(tabLayout.g(i), i4 == 0 || (i4 == 2 && this.f710b == 0));
    }

    @Override // F0.h
    public final void c(int i, float f2) {
        boolean z3;
        TabLayout tabLayout = (TabLayout) this.f709a.get();
        if (tabLayout != null) {
            int i4 = this.f711c;
            boolean z4 = true;
            if (i4 != 2 || this.f710b == 1) {
                z3 = true;
            } else {
                z3 = true;
                z4 = false;
            }
            if (i4 == 2 && this.f710b == 0) {
                z3 = false;
            }
            tabLayout.m(i, f2, z4, z3, false);
        }
    }
}
