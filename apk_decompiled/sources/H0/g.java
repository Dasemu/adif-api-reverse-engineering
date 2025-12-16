package H0;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class g extends j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f649b;

    public /* synthetic */ g(ViewPager2 viewPager2, int i) {
        this.f648a = i;
        this.f649b = viewPager2;
    }

    @Override // H0.j
    public void a(int i) {
        switch (this.f648a) {
            case 0:
                if (i == 0) {
                    this.f649b.d();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // H0.j
    public final void c(int i) {
        switch (this.f648a) {
            case 0:
                ViewPager2 viewPager2 = this.f649b;
                if (viewPager2.f4081d != i) {
                    viewPager2.f4081d = i;
                    viewPager2.f4094t.q();
                    return;
                }
                return;
            default:
                ViewPager2 viewPager22 = this.f649b;
                viewPager22.clearFocus();
                if (viewPager22.hasFocus()) {
                    viewPager22.f4085j.requestFocus(2);
                    return;
                }
                return;
        }
    }
}
