package androidx.recyclerview.widget;

import O.C0056b;
import a.AbstractC0105a;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3936a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3937b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3938c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3939d;

    /* renamed from: e, reason: collision with root package name */
    public int f3940e;

    /* renamed from: f, reason: collision with root package name */
    public int f3941f;

    /* renamed from: g, reason: collision with root package name */
    public x0 f3942g;
    public final /* synthetic */ RecyclerView h;

    public y0(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f3936a = arrayList;
        this.f3937b = null;
        this.f3938c = new ArrayList();
        this.f3939d = Collections.unmodifiableList(arrayList);
        this.f3940e = 2;
        this.f3941f = 2;
    }

    public final void a(I0 i02, boolean z3) {
        RecyclerView.m(i02);
        View view = i02.itemView;
        RecyclerView recyclerView = this.h;
        K0 k02 = recyclerView.f3699o0;
        if (k02 != null) {
            J0 j02 = k02.f3559e;
            O.X.j(view, j02 != null ? (C0056b) j02.f3557e.remove(view) : null);
        }
        if (z3) {
            ArrayList arrayList = recyclerView.f3698o;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            AbstractC0220h0 abstractC0220h0 = recyclerView.f3694m;
            if (abstractC0220h0 != null) {
                abstractC0220h0.onViewRecycled(i02);
            }
            if (recyclerView.f3686h0 != null) {
                recyclerView.f3684g.F(i02);
            }
            if (RecyclerView.f3642B0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + i02);
            }
        }
        i02.mBindingAdapter = null;
        i02.mOwnerRecyclerView = null;
        x0 c4 = c();
        c4.getClass();
        int itemViewType = i02.getItemViewType();
        ArrayList arrayList2 = c4.a(itemViewType).f3923a;
        if (((w0) c4.f3931a.get(itemViewType)).f3924b <= arrayList2.size()) {
            AbstractC0105a.f(i02.itemView);
        } else {
            if (RecyclerView.A0 && arrayList2.contains(i02)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            i02.resetInternal();
            arrayList2.add(i02);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.f3686h0.b()) {
            return !recyclerView.f3686h0.f3515g ? i : recyclerView.f3680e.g(i, 0);
        }
        StringBuilder t2 = C.w.t(i, "invalid position ", ". State item count is ");
        t2.append(recyclerView.f3686h0.b());
        t2.append(recyclerView.D());
        throw new IndexOutOfBoundsException(t2.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.x0, java.lang.Object] */
    public final x0 c() {
        if (this.f3942g == null) {
            ?? obj = new Object();
            obj.f3931a = new SparseArray();
            obj.f3932b = 0;
            obj.f3933c = Collections.newSetFromMap(new IdentityHashMap());
            this.f3942g = obj;
            d();
        }
        return this.f3942g;
    }

    public final void d() {
        RecyclerView recyclerView;
        AbstractC0220h0 abstractC0220h0;
        x0 x0Var = this.f3942g;
        if (x0Var == null || (abstractC0220h0 = (recyclerView = this.h).f3694m) == null || !recyclerView.f3705s) {
            return;
        }
        x0Var.f3933c.add(abstractC0220h0);
    }

    public final void e(AbstractC0220h0 abstractC0220h0, boolean z3) {
        x0 x0Var = this.f3942g;
        if (x0Var == null) {
            return;
        }
        Set set = x0Var.f3933c;
        set.remove(abstractC0220h0);
        if (set.size() != 0 || z3) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = x0Var.f3931a;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((w0) sparseArray.get(sparseArray.keyAt(i))).f3923a;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                AbstractC0105a.f(((I0) arrayList.get(i4)).itemView);
            }
            i++;
        }
    }

    public final void f() {
        ArrayList arrayList = this.f3938c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.f3646G0) {
            Z2.y yVar = this.h.f3685g0;
            int[] iArr = (int[]) yVar.f2314d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            yVar.f2313c = 0;
        }
    }

    public final void g(int i) {
        if (RecyclerView.f3642B0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f3938c;
        I0 i02 = (I0) arrayList.get(i);
        if (RecyclerView.f3642B0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + i02);
        }
        a(i02, true);
        arrayList.remove(i);
    }

    public final void h(View view) {
        I0 N3 = RecyclerView.N(view);
        boolean isTmpDetached = N3.isTmpDetached();
        RecyclerView recyclerView = this.h;
        if (isTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (N3.isScrap()) {
            N3.unScrap();
        } else if (N3.wasReturnedFromScrap()) {
            N3.clearReturnedFromScrapFlag();
        }
        i(N3);
        if (recyclerView.f3661M == null || N3.isRecyclable()) {
            return;
        }
        recyclerView.f3661M.d(N3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00dc, code lost:
    
        r4 = r4 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(androidx.recyclerview.widget.I0 r12) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.y0.i(androidx.recyclerview.widget.I0):void");
    }

    public final void j(View view) {
        AbstractC0230m0 abstractC0230m0;
        I0 N3 = RecyclerView.N(view);
        boolean hasAnyOfTheFlags = N3.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.h;
        if (!hasAnyOfTheFlags && N3.isUpdated() && (abstractC0230m0 = recyclerView.f3661M) != null) {
            C0237q c0237q = (C0237q) abstractC0230m0;
            if (N3.getUnmodifiedPayloads().isEmpty() && c0237q.f3874g && !N3.isInvalid()) {
                if (this.f3937b == null) {
                    this.f3937b = new ArrayList();
                }
                N3.setScrapContainer(this, true);
                this.f3937b.add(N3);
                return;
            }
        }
        if (N3.isInvalid() && !N3.isRemoved() && !recyclerView.f3694m.hasStableIds()) {
            throw new IllegalArgumentException(C.w.j(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        N3.setScrapContainer(this, false);
        this.f3936a.add(N3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x04a5, code lost:
    
        if ((r12 + r8) >= r31) goto L243;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0086  */
    /* JADX WARN: Type inference failed for: r2v31, types: [O.u, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.I0 k(int r30, long r31) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.y0.k(int, long):androidx.recyclerview.widget.I0");
    }

    public final void l(I0 i02) {
        if (i02.mInChangeScrap) {
            this.f3937b.remove(i02);
        } else {
            this.f3936a.remove(i02);
        }
        i02.mScrapContainer = null;
        i02.mInChangeScrap = false;
        i02.clearReturnedFromScrapFlag();
    }

    public final void m() {
        AbstractC0238q0 abstractC0238q0 = this.h.f3696n;
        this.f3941f = this.f3940e + (abstractC0238q0 != null ? abstractC0238q0.f3890j : 0);
        ArrayList arrayList = this.f3938c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f3941f; size--) {
            g(size);
        }
    }
}
