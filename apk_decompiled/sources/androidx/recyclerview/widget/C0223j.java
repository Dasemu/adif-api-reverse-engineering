package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223j {

    /* renamed from: a, reason: collision with root package name */
    public final C0216f0 f3826a;

    /* renamed from: e, reason: collision with root package name */
    public View f3830e;

    /* renamed from: d, reason: collision with root package name */
    public int f3829d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C0221i f3827b = new C0221i();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3828c = new ArrayList();

    public C0223j(C0216f0 c0216f0) {
        this.f3826a = c0216f0;
    }

    public final void a(View view, int i, boolean z3) {
        RecyclerView recyclerView = this.f3826a.f3809a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f3827b.e(childCount, z3);
        if (z3) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        I0 N3 = RecyclerView.N(view);
        AbstractC0220h0 abstractC0220h0 = recyclerView.f3694m;
        if (abstractC0220h0 != null && N3 != null) {
            abstractC0220h0.onViewAttachedToWindow(N3);
        }
        ArrayList arrayList = recyclerView.f3652C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC0241s0) recyclerView.f3652C.get(size)).a(view);
            }
        }
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z3) {
        RecyclerView recyclerView = this.f3826a.f3809a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f3827b.e(childCount, z3);
        if (z3) {
            i(view);
        }
        I0 N3 = RecyclerView.N(view);
        if (N3 != null) {
            if (!N3.isTmpDetached() && !N3.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(N3);
                throw new IllegalArgumentException(C.w.j(recyclerView, sb));
            }
            if (RecyclerView.f3642B0) {
                Log.d("RecyclerView", "reAttach " + N3);
            }
            N3.clearTmpDetachFlag();
        } else if (RecyclerView.A0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(C.w.j(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int f2 = f(i);
        this.f3827b.g(f2);
        RecyclerView recyclerView = this.f3826a.f3809a;
        View childAt = recyclerView.getChildAt(f2);
        if (childAt != null) {
            I0 N3 = RecyclerView.N(childAt);
            if (N3 != null) {
                if (N3.isTmpDetached() && !N3.shouldIgnore()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(N3);
                    throw new IllegalArgumentException(C.w.j(recyclerView, sb));
                }
                if (RecyclerView.f3642B0) {
                    Log.d("RecyclerView", "tmpDetach " + N3);
                }
                N3.addFlags(256);
            }
        } else if (RecyclerView.A0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(f2);
            throw new IllegalArgumentException(C.w.j(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(f2);
    }

    public final View d(int i) {
        return this.f3826a.f3809a.getChildAt(f(i));
    }

    public final int e() {
        return this.f3826a.f3809a.getChildCount() - this.f3828c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f3826a.f3809a.getChildCount();
        int i4 = i;
        while (i4 < childCount) {
            C0221i c0221i = this.f3827b;
            int b4 = i - (i4 - c0221i.b(i4));
            if (b4 == 0) {
                while (c0221i.d(i4)) {
                    i4++;
                }
                return i4;
            }
            i4 += b4;
        }
        return -1;
    }

    public final View g(int i) {
        return this.f3826a.f3809a.getChildAt(i);
    }

    public final int h() {
        return this.f3826a.f3809a.getChildCount();
    }

    public final void i(View view) {
        this.f3828c.add(view);
        C0216f0 c0216f0 = this.f3826a;
        I0 N3 = RecyclerView.N(view);
        if (N3 != null) {
            N3.onEnteredHiddenState(c0216f0.f3809a);
        }
    }

    public final void j(View view) {
        if (this.f3828c.remove(view)) {
            C0216f0 c0216f0 = this.f3826a;
            I0 N3 = RecyclerView.N(view);
            if (N3 != null) {
                N3.onLeftHiddenState(c0216f0.f3809a);
            }
        }
    }

    public final String toString() {
        return this.f3827b.toString() + ", hidden list:" + this.f3828c.size();
    }
}
