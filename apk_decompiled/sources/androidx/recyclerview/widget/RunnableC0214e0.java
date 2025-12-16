package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0214e0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3807b;

    public /* synthetic */ RunnableC0214e0(RecyclerView recyclerView, int i) {
        this.f3806a = i;
        this.f3807b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f3807b;
        switch (this.f3806a) {
            case 0:
                if (!recyclerView.f3709u || recyclerView.isLayoutRequested()) {
                    return;
                }
                if (!recyclerView.f3705s) {
                    recyclerView.requestLayout();
                    return;
                } else if (recyclerView.f3715x) {
                    recyclerView.f3713w = true;
                    return;
                } else {
                    recyclerView.q();
                    return;
                }
            default:
                AbstractC0230m0 abstractC0230m0 = recyclerView.f3661M;
                if (abstractC0230m0 != null) {
                    C0237q c0237q = (C0237q) abstractC0230m0;
                    ArrayList arrayList = c0237q.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0237q.f3875j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0237q.f3876k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0237q.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j4 = c0237q.f3848d;
                            if (hasNext) {
                                I0 i02 = (I0) it.next();
                                View view = i02.itemView;
                                ViewPropertyAnimator animate = view.animate();
                                c0237q.f3881q.add(i02);
                                animate.setDuration(j4).alpha(BitmapDescriptorFactory.HUE_RED).setListener(new C0227l(c0237q, i02, animate, view)).start();
                                arrayList = arrayList;
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0237q.f3878m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0225k runnableC0225k = new RunnableC0225k(c0237q, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0225k.run();
                                    } else {
                                        View view2 = ((C0235p) arrayList5.get(0)).f3864a.itemView;
                                        WeakHashMap weakHashMap = O.X.f1226a;
                                        view2.postOnAnimationDelayed(runnableC0225k, j4);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0237q.f3879n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0225k runnableC0225k2 = new RunnableC0225k(c0237q, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0225k2.run();
                                    } else {
                                        View view3 = ((C0233o) arrayList6.get(0)).f3856a.itemView;
                                        WeakHashMap weakHashMap2 = O.X.f1226a;
                                        view3.postOnAnimationDelayed(runnableC0225k2, j4);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0237q.f3877l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0225k runnableC0225k3 = new RunnableC0225k(c0237q, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0225k3.run();
                                    } else {
                                        if (isEmpty) {
                                            j4 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0237q.f3849e : 0L, isEmpty3 ? 0L : c0237q.f3850f) + j4;
                                        View view4 = ((I0) arrayList7.get(0)).itemView;
                                        WeakHashMap weakHashMap3 = O.X.f1226a;
                                        view4.postOnAnimationDelayed(runnableC0225k3, max);
                                    }
                                }
                            }
                        }
                    }
                }
                recyclerView.f3697n0 = false;
                return;
        }
    }
}
