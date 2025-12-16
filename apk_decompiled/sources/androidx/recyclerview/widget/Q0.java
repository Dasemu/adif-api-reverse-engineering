package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3631a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f3632b = IntCompanionObject.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f3633c = IntCompanionObject.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f3634d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f3635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f3636f;

    public Q0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f3636f = staggeredGridLayoutManager;
        this.f3635e = i;
    }

    public final void a() {
        View view = (View) this.f3631a.get(r0.size() - 1);
        N0 n02 = (N0) view.getLayoutParams();
        this.f3633c = this.f3636f.f3741r.b(view);
        n02.getClass();
    }

    public final void b() {
        this.f3631a.clear();
        this.f3632b = IntCompanionObject.MIN_VALUE;
        this.f3633c = IntCompanionObject.MIN_VALUE;
        this.f3634d = 0;
    }

    public final int c() {
        return this.f3636f.f3746w ? e(r1.size() - 1, -1) : e(0, this.f3631a.size());
    }

    public final int d() {
        return this.f3636f.f3746w ? e(0, this.f3631a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i, int i4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3636f;
        int k4 = staggeredGridLayoutManager.f3741r.k();
        int g4 = staggeredGridLayoutManager.f3741r.g();
        int i5 = i4 > i ? 1 : -1;
        while (i != i4) {
            View view = (View) this.f3631a.get(i);
            int e4 = staggeredGridLayoutManager.f3741r.e(view);
            int b4 = staggeredGridLayoutManager.f3741r.b(view);
            boolean z3 = e4 <= g4;
            boolean z4 = b4 >= k4;
            if (z3 && z4 && (e4 < k4 || b4 > g4)) {
                return AbstractC0238q0.L(view);
            }
            i += i5;
        }
        return -1;
    }

    public final int f(int i) {
        int i4 = this.f3633c;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (this.f3631a.size() == 0) {
            return i;
        }
        a();
        return this.f3633c;
    }

    public final View g(int i, int i4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3636f;
        ArrayList arrayList = this.f3631a;
        View view = null;
        if (i4 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f3746w && AbstractC0238q0.L(view2) >= i) || ((!staggeredGridLayoutManager.f3746w && AbstractC0238q0.L(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            View view3 = (View) arrayList.get(i5);
            if ((staggeredGridLayoutManager.f3746w && AbstractC0238q0.L(view3) <= i) || ((!staggeredGridLayoutManager.f3746w && AbstractC0238q0.L(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i5++;
            view = view3;
        }
        return view;
    }

    public final int h(int i) {
        int i4 = this.f3632b;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (this.f3631a.size() == 0) {
            return i;
        }
        View view = (View) this.f3631a.get(0);
        N0 n02 = (N0) view.getLayoutParams();
        this.f3632b = this.f3636f.f3741r.e(view);
        n02.getClass();
        return this.f3632b;
    }
}
