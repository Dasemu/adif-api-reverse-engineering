package androidx.viewpager2.adapter;

import C.w;
import H2.m;
import android.view.ViewParent;
import androidx.fragment.app.AbstractC0158l0;
import androidx.fragment.app.C0135a;
import androidx.fragment.app.K;
import androidx.lifecycle.B;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public H0.b f4071a;

    /* renamed from: b, reason: collision with root package name */
    public m f4072b;

    /* renamed from: c, reason: collision with root package name */
    public c f4073c;

    /* renamed from: d, reason: collision with root package name */
    public ViewPager2 f4074d;

    /* renamed from: e, reason: collision with root package name */
    public long f4075e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f4076f;

    public d(f fVar) {
        this.f4076f = fVar;
    }

    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    public final void b(boolean z3) {
        int currentItem;
        K k4;
        f fVar = this.f4076f;
        if (fVar.shouldDelayFragmentTransactions() || this.f4074d.getScrollState() != 0 || fVar.mFragments.g() == 0 || fVar.getItemCount() == 0 || (currentItem = this.f4074d.getCurrentItem()) >= fVar.getItemCount()) {
            return;
        }
        long itemId = fVar.getItemId(currentItem);
        if ((itemId != this.f4075e || z3) && (k4 = (K) fVar.mFragments.b(itemId)) != null && k4.isAdded()) {
            this.f4075e = itemId;
            AbstractC0158l0 abstractC0158l0 = fVar.mFragmentManager;
            abstractC0158l0.getClass();
            C0135a c0135a = new C0135a(abstractC0158l0);
            ArrayList arrayList = new ArrayList();
            K k5 = null;
            for (int i = 0; i < fVar.mFragments.g(); i++) {
                long d4 = fVar.mFragments.d(i);
                K k6 = (K) fVar.mFragments.h(i);
                if (k6.isAdded()) {
                    if (d4 != this.f4075e) {
                        c0135a.h(k6, B.f3283d);
                        b bVar = fVar.mFragmentEventDispatcher;
                        bVar.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = bVar.f4069a.iterator();
                        if (it.hasNext()) {
                            throw w.g(it);
                        }
                        arrayList.add(arrayList2);
                    } else {
                        k5 = k6;
                    }
                    k6.setMenuVisibility(d4 == this.f4075e);
                }
            }
            if (k5 != null) {
                c0135a.h(k5, B.f3284e);
                b bVar2 = fVar.mFragmentEventDispatcher;
                bVar2.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = bVar2.f4069a.iterator();
                if (it2.hasNext()) {
                    throw w.g(it2);
                }
                arrayList.add(arrayList3);
            }
            if (c0135a.f3257a.isEmpty()) {
                return;
            }
            if (c0135a.f3263g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c0135a.h = false;
            c0135a.f3084q.B(c0135a, false);
            Collections.reverse(arrayList);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                List list = (List) it3.next();
                fVar.mFragmentEventDispatcher.getClass();
                b.a(list);
            }
        }
    }
}
