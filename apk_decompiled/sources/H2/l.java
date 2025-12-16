package H2;

import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes3.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f724a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f725b;

    public /* synthetic */ l(ViewGroup viewGroup, int i) {
        this.f724a = i;
        this.f725b = viewGroup;
    }

    private final void a(h hVar) {
    }

    private final void b(h hVar) {
    }

    private final void c(h hVar) {
    }

    private final void d(h hVar) {
    }

    @Override // H2.d
    public final void onTabReselected(h hVar) {
        int i = this.f724a;
    }

    @Override // H2.d
    public final void onTabSelected(h hVar) {
        switch (this.f724a) {
            case 0:
                ((ViewPager) this.f725b).setCurrentItem(hVar.f705b);
                return;
            default:
                ((ViewPager2) this.f725b).b(hVar.f705b);
                return;
        }
    }

    @Override // H2.d
    public final void onTabUnselected(h hVar) {
        int i = this.f724a;
    }
}
