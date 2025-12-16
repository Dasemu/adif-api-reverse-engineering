package H2;

import O.X;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.AbstractC0224j0;
import androidx.recyclerview.widget.C0207b;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class m extends AbstractC0224j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f727b;

    public /* synthetic */ m(Object obj, int i) {
        this.f726a = i;
        this.f727b = obj;
    }

    @Override // androidx.recyclerview.widget.AbstractC0224j0
    public final void a() {
        switch (this.f726a) {
            case 0:
                ((o) this.f727b).b();
                return;
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.f727b;
                recyclerView.l(null);
                recyclerView.f3686h0.f3514f = true;
                recyclerView.a0(true);
                if (recyclerView.f3680e.j()) {
                    return;
                }
                recyclerView.requestLayout();
                return;
            default:
                ((androidx.viewpager2.adapter.d) this.f727b).b(true);
                return;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0224j0
    public final void b(int i, int i4, Object obj) {
        switch (this.f726a) {
            case 0:
                ((o) this.f727b).b();
                return;
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.f727b;
                recyclerView.l(null);
                C0207b c0207b = recyclerView.f3680e;
                if (i4 < 1) {
                    c0207b.getClass();
                    return;
                }
                ArrayList arrayList = (ArrayList) c0207b.f3789c;
                arrayList.add(c0207b.l(4, i, i4, obj));
                c0207b.f3787a |= 4;
                if (arrayList.size() == 1) {
                    g();
                    return;
                }
                return;
            default:
                a();
                return;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0224j0
    public final void c(int i, int i4) {
        switch (this.f726a) {
            case 0:
                ((o) this.f727b).b();
                return;
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.f727b;
                recyclerView.l(null);
                C0207b c0207b = recyclerView.f3680e;
                if (i4 < 1) {
                    c0207b.getClass();
                    return;
                }
                ArrayList arrayList = (ArrayList) c0207b.f3789c;
                arrayList.add(c0207b.l(1, i, i4, null));
                c0207b.f3787a |= 1;
                if (arrayList.size() == 1) {
                    g();
                    return;
                }
                return;
            default:
                a();
                return;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0224j0
    public final void d(int i, int i4) {
        switch (this.f726a) {
            case 0:
                ((o) this.f727b).b();
                return;
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.f727b;
                recyclerView.l(null);
                C0207b c0207b = recyclerView.f3680e;
                c0207b.getClass();
                if (i == i4) {
                    return;
                }
                ArrayList arrayList = (ArrayList) c0207b.f3789c;
                arrayList.add(c0207b.l(8, i, i4, null));
                c0207b.f3787a |= 8;
                if (arrayList.size() == 1) {
                    g();
                    return;
                }
                return;
            default:
                a();
                return;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0224j0
    public final void e(int i, int i4) {
        switch (this.f726a) {
            case 0:
                ((o) this.f727b).b();
                return;
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.f727b;
                recyclerView.l(null);
                C0207b c0207b = recyclerView.f3680e;
                if (i4 < 1) {
                    c0207b.getClass();
                    return;
                }
                ArrayList arrayList = (ArrayList) c0207b.f3789c;
                arrayList.add(c0207b.l(2, i, i4, null));
                c0207b.f3787a |= 2;
                if (arrayList.size() == 1) {
                    g();
                    return;
                }
                return;
            default:
                a();
                return;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0224j0
    public void f() {
        AbstractC0220h0 abstractC0220h0;
        switch (this.f726a) {
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.f727b;
                if (recyclerView.f3678d == null || (abstractC0220h0 = recyclerView.f3694m) == null || !abstractC0220h0.canRestoreState()) {
                    return;
                }
                recyclerView.requestLayout();
                return;
            default:
                return;
        }
    }

    public void g() {
        boolean z3 = RecyclerView.f3645F0;
        RecyclerView recyclerView = (RecyclerView) this.f727b;
        if (z3 && recyclerView.f3707t && recyclerView.f3705s) {
            WeakHashMap weakHashMap = X.f1226a;
            recyclerView.postOnAnimation(recyclerView.i);
        } else {
            recyclerView.f3650A = true;
            recyclerView.requestLayout();
        }
    }
}
