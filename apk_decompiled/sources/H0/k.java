package H0;

import P.t;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class k implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A.j f652b;

    public /* synthetic */ k(A.j jVar, int i) {
        this.f651a = i;
        this.f652b = jVar;
    }

    @Override // P.t
    public final boolean d(View view) {
        switch (this.f651a) {
            case 0:
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = (ViewPager2) this.f652b.f30d;
                if (viewPager2.f4092r) {
                    viewPager2.c(currentItem);
                }
                return true;
            default:
                int currentItem2 = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager22 = (ViewPager2) this.f652b.f30d;
                if (viewPager22.f4092r) {
                    viewPager22.c(currentItem2);
                }
                return true;
        }
    }
}
