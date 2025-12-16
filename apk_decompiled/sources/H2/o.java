package H2;

import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.viewpager2.widget.ViewPager2;
import com.adif.elcanomovil.uiDepartures.main.DeparturesFragment;
import com.adif.elcanomovil.uiStations.main.StationsFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final TabLayout f731a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f732b;

    /* renamed from: c, reason: collision with root package name */
    public final I2.k f733c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0220h0 f734d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f735e;

    public o(TabLayout tabLayout, ViewPager2 viewPager2, I2.k kVar) {
        this.f731a = tabLayout;
        this.f732b = viewPager2;
        this.f733c = kVar;
    }

    public final void a() {
        if (this.f735e) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        ViewPager2 viewPager2 = this.f732b;
        AbstractC0220h0 adapter = viewPager2.getAdapter();
        this.f734d = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f735e = true;
        TabLayout tabLayout = this.f731a;
        ((ArrayList) viewPager2.f4080c.f632b).add(new n(tabLayout));
        tabLayout.a(new l(viewPager2, 1));
        this.f734d.registerAdapterDataObserver(new m(this, 0));
        b();
        tabLayout.m(viewPager2.getCurrentItem(), BitmapDescriptorFactory.HUE_RED, true, true, true);
    }

    public final void b() {
        TabLayout tabLayout = this.f731a;
        tabLayout.j();
        AbstractC0220h0 abstractC0220h0 = this.f734d;
        if (abstractC0220h0 != null) {
            int itemCount = abstractC0220h0.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                h h = tabLayout.h();
                I2.k kVar = this.f733c;
                int i4 = kVar.f822a;
                Object obj = kVar.f823b;
                switch (i4) {
                    case 10:
                        DeparturesFragment.configureTabLayout$lambda$0((DeparturesFragment) obj, h, i);
                        break;
                    default:
                        StationsFragment.configureTabLayout$lambda$0((StationsFragment) obj, h, i);
                        break;
                }
                tabLayout.b(h, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.f732b.getCurrentItem(), tabLayout.getTabCount() - 1);
                if (min != tabLayout.getSelectedTabPosition()) {
                    tabLayout.k(tabLayout.g(min), true);
                }
            }
        }
    }
}
