package F0;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import m.C0496x0;

/* loaded from: classes.dex */
public final class i extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f530b;

    public /* synthetic */ i(Object obj, int i) {
        this.f529a = i;
        this.f530b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f529a) {
            case 0:
                ((ViewPager) this.f530b).e();
                return;
            case 1:
                ((TabLayout) this.f530b).i();
                return;
            default:
                C0496x0 c0496x0 = (C0496x0) this.f530b;
                if (c0496x0.f7782z.isShowing()) {
                    c0496x0.c();
                    return;
                }
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f529a) {
            case 0:
                ((ViewPager) this.f530b).e();
                return;
            case 1:
                ((TabLayout) this.f530b).i();
                return;
            default:
                ((C0496x0) this.f530b).dismiss();
                return;
        }
    }
}
