package H0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.AbstractC0238q0;
import androidx.recyclerview.widget.E0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y0;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class i extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f650E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ViewPager2 viewPager2) {
        super(1);
        this.f650E = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void I0(E0 e02, int[] iArr) {
        ViewPager2 viewPager2 = this.f650E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.I0(e02, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void Z(y0 y0Var, E0 e02, P.k kVar) {
        super.Z(y0Var, e02, kVar);
        this.f650E.f4094t.getClass();
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final void b0(y0 y0Var, E0 e02, View view, P.k kVar) {
        int i;
        int i4;
        ViewPager2 viewPager2 = (ViewPager2) this.f650E.f4094t.f30d;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.f4084g.getClass();
            i = AbstractC0238q0.L(view);
        } else {
            i = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.f4084g.getClass();
            i4 = AbstractC0238q0.L(view);
        } else {
            i4 = 0;
        }
        kVar.i(P.j.a(false, i, 1, i4, 1));
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final boolean m0(y0 y0Var, E0 e02, int i, Bundle bundle) {
        this.f650E.f4094t.getClass();
        return super.m0(y0Var, e02, i, bundle);
    }

    @Override // androidx.recyclerview.widget.AbstractC0238q0
    public final boolean s0(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
        return false;
    }
}
