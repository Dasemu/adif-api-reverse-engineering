package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0212d0 extends t0 {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f3802a;

    /* renamed from: b, reason: collision with root package name */
    public final L0 f3803b = new L0(this);

    /* renamed from: c, reason: collision with root package name */
    public C0206a0 f3804c;

    /* renamed from: d, reason: collision with root package name */
    public C0206a0 f3805d;

    public static int c(View view, AbstractC0208b0 abstractC0208b0) {
        return ((abstractC0208b0.c(view) / 2) + abstractC0208b0.e(view)) - ((abstractC0208b0.l() / 2) + abstractC0208b0.k());
    }

    public static View d(AbstractC0238q0 abstractC0238q0, AbstractC0208b0 abstractC0208b0) {
        int v3 = abstractC0238q0.v();
        View view = null;
        if (v3 == 0) {
            return null;
        }
        int l4 = (abstractC0208b0.l() / 2) + abstractC0208b0.k();
        int i = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < v3; i4++) {
            View u3 = abstractC0238q0.u(i4);
            int abs = Math.abs(((abstractC0208b0.c(u3) / 2) + abstractC0208b0.e(u3)) - l4);
            if (abs < i) {
                view = u3;
                i = abs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3802a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        L0 l02 = this.f3803b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f3689j0;
            if (arrayList != null) {
                arrayList.remove(l02);
            }
            this.f3802a.setOnFlingListener(null);
        }
        this.f3802a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f3802a.k(l02);
            this.f3802a.setOnFlingListener(this);
            new Scroller(this.f3802a.getContext(), new DecelerateInterpolator());
            h();
        }
    }

    public final int[] b(AbstractC0238q0 abstractC0238q0, View view) {
        int[] iArr = new int[2];
        if (abstractC0238q0.d()) {
            iArr[0] = c(view, f(abstractC0238q0));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0238q0.e()) {
            iArr[1] = c(view, g(abstractC0238q0));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public View e(AbstractC0238q0 abstractC0238q0) {
        if (abstractC0238q0.e()) {
            return d(abstractC0238q0, g(abstractC0238q0));
        }
        if (abstractC0238q0.d()) {
            return d(abstractC0238q0, f(abstractC0238q0));
        }
        return null;
    }

    public final AbstractC0208b0 f(AbstractC0238q0 abstractC0238q0) {
        C0206a0 c0206a0 = this.f3805d;
        if (c0206a0 == null || ((AbstractC0238q0) c0206a0.f3794b) != abstractC0238q0) {
            this.f3805d = new C0206a0(abstractC0238q0, 0);
        }
        return this.f3805d;
    }

    public final AbstractC0208b0 g(AbstractC0238q0 abstractC0238q0) {
        C0206a0 c0206a0 = this.f3804c;
        if (c0206a0 == null || ((AbstractC0238q0) c0206a0.f3794b) != abstractC0238q0) {
            this.f3804c = new C0206a0(abstractC0238q0, 1);
        }
        return this.f3804c;
    }

    public final void h() {
        AbstractC0238q0 layoutManager;
        View e4;
        RecyclerView recyclerView = this.f3802a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (e4 = e(layoutManager)) == null) {
            return;
        }
        int[] b4 = b(layoutManager, e4);
        int i = b4[0];
        if (i == 0 && b4[1] == 0) {
            return;
        }
        this.f3802a.l0(i, b4[1], false);
    }
}
