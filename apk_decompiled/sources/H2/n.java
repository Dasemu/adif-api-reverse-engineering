package H2;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class n extends H0.j {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f728a;

    /* renamed from: c, reason: collision with root package name */
    public int f730c = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f729b = 0;

    public n(TabLayout tabLayout) {
        this.f728a = new WeakReference(tabLayout);
    }

    @Override // H0.j
    public final void a(int i) {
        this.f729b = this.f730c;
        this.f730c = i;
        TabLayout tabLayout = (TabLayout) this.f728a.get();
        if (tabLayout != null) {
            tabLayout.f5782T = this.f730c;
        }
    }

    @Override // H0.j
    public final void b(int i, float f2, int i4) {
        boolean z3;
        TabLayout tabLayout = (TabLayout) this.f728a.get();
        if (tabLayout != null) {
            int i5 = this.f730c;
            boolean z4 = true;
            if (i5 != 2 || this.f729b == 1) {
                z3 = true;
            } else {
                z3 = true;
                z4 = false;
            }
            if (i5 == 2 && this.f729b == 0) {
                z3 = false;
            }
            tabLayout.m(i, f2, z4, z3, false);
        }
    }

    @Override // H0.j
    public final void c(int i) {
        TabLayout tabLayout = (TabLayout) this.f728a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        int i4 = this.f730c;
        tabLayout.k(tabLayout.g(i), i4 == 0 || (i4 == 2 && this.f729b == 0));
    }
}
