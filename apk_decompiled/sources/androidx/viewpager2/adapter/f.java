package androidx.viewpager2.adapter;

import C.w;
import H2.m;
import O.X;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0158l0;
import androidx.fragment.app.C0135a;
import androidx.fragment.app.J;
import androidx.fragment.app.K;
import androidx.fragment.app.Q;
import androidx.fragment.app.Y;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.lifecycle.C0194o;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.I0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import s.C0581a;

/* loaded from: classes.dex */
public abstract class f extends AbstractC0220h0 {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final String KEY_PREFIX_FRAGMENT = "f#";
    private static final String KEY_PREFIX_STATE = "s#";
    b mFragmentEventDispatcher;
    final AbstractC0158l0 mFragmentManager;
    private d mFragmentMaxLifecycleEnforcer;
    final s.g mFragments;
    private boolean mHasStaleFragments;
    boolean mIsInGracePeriod;
    private final s.g mItemIdToViewHolder;
    final C mLifecycle;
    private final s.g mSavedStates;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, androidx.viewpager2.adapter.b] */
    public f(K k4) {
        AbstractC0158l0 childFragmentManager = k4.getChildFragmentManager();
        C lifecycle = k4.getLifecycle();
        this.mFragments = new s.g();
        this.mSavedStates = new s.g();
        this.mItemIdToViewHolder = new s.g();
        ?? obj = new Object();
        obj.f4069a = new CopyOnWriteArrayList();
        this.mFragmentEventDispatcher = obj;
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = childFragmentManager;
        this.mLifecycle = lifecycle;
        super.setHasStableIds(true);
    }

    public final Long a(int i) {
        Long l4 = null;
        for (int i4 = 0; i4 < this.mItemIdToViewHolder.g(); i4++) {
            if (((Integer) this.mItemIdToViewHolder.h(i4)).intValue() == i) {
                if (l4 != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                l4 = Long.valueOf(this.mItemIdToViewHolder.d(i4));
            }
        }
        return l4;
    }

    public void addViewToContainer(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public final void b(long j4) {
        ViewParent parent;
        K k4 = (K) this.mFragments.b(j4);
        if (k4 == null) {
            return;
        }
        if (k4.getView() != null && (parent = k4.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j4)) {
            this.mSavedStates.f(j4);
        }
        if (!k4.isAdded()) {
            this.mFragments.f(j4);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            this.mHasStaleFragments = true;
            return;
        }
        if (k4.isAdded() && containsItem(j4)) {
            b bVar = this.mFragmentEventDispatcher;
            bVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = bVar.f4069a.iterator();
            if (it.hasNext()) {
                throw w.g(it);
            }
            J b02 = this.mFragmentManager.b0(k4);
            this.mFragmentEventDispatcher.getClass();
            b.a(arrayList);
            this.mSavedStates.e(j4, b02);
        }
        b bVar2 = this.mFragmentEventDispatcher;
        bVar2.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = bVar2.f4069a.iterator();
        if (it2.hasNext()) {
            throw w.g(it2);
        }
        try {
            AbstractC0158l0 abstractC0158l0 = this.mFragmentManager;
            abstractC0158l0.getClass();
            C0135a c0135a = new C0135a(abstractC0158l0);
            c0135a.g(k4);
            if (c0135a.f3263g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c0135a.h = false;
            c0135a.f3084q.B(c0135a, false);
            this.mFragments.f(j4);
        } finally {
            this.mFragmentEventDispatcher.getClass();
            b.a(arrayList2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, R0.h] */
    public final void c(K k4, FrameLayout frameLayout) {
        AbstractC0158l0 abstractC0158l0 = this.mFragmentManager;
        ?? cb = new Object();
        cb.f1415c = this;
        cb.f1413a = k4;
        cb.f1414b = frameLayout;
        Q q4 = abstractC0158l0.f3170o;
        q4.getClass();
        Intrinsics.checkNotNullParameter(cb, "cb");
        ((CopyOnWriteArrayList) q4.f3067b).add(new Y(cb));
    }

    public boolean containsItem(long j4) {
        return j4 >= 0 && j4 < ((long) getItemCount());
    }

    public abstract K createFragment(int i);

    public void gcFragments() {
        K k4;
        View view;
        if (!this.mHasStaleFragments || shouldDelayFragmentTransactions()) {
            return;
        }
        s.f fVar = new s.f(0);
        for (int i = 0; i < this.mFragments.g(); i++) {
            long d4 = this.mFragments.d(i);
            if (!containsItem(d4)) {
                fVar.add(Long.valueOf(d4));
                this.mItemIdToViewHolder.f(d4);
            }
        }
        if (!this.mIsInGracePeriod) {
            this.mHasStaleFragments = false;
            for (int i4 = 0; i4 < this.mFragments.g(); i4++) {
                long d5 = this.mFragments.d(i4);
                if (this.mItemIdToViewHolder.c(d5) < 0 && ((k4 = (K) this.mFragments.b(d5)) == null || (view = k4.getView()) == null || view.getParent() == null)) {
                    fVar.add(Long.valueOf(d5));
                }
            }
        }
        C0581a c0581a = new C0581a(fVar);
        while (c0581a.hasNext()) {
            b(((Long) c0581a.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (this.mFragmentMaxLifecycleEnforcer != null) {
            throw new IllegalArgumentException();
        }
        d dVar = new d(this);
        this.mFragmentMaxLifecycleEnforcer = dVar;
        ViewPager2 a2 = d.a(recyclerView);
        dVar.f4074d = a2;
        H0.b bVar = new H0.b(dVar);
        dVar.f4071a = bVar;
        ((ArrayList) a2.f4080c.f632b).add(bVar);
        m mVar = new m(dVar, 2);
        dVar.f4072b = mVar;
        registerAdapterDataObserver(mVar);
        c cVar = new c(dVar);
        dVar.f4073c = cVar;
        this.mLifecycle.a(cVar);
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        d dVar = this.mFragmentMaxLifecycleEnforcer;
        dVar.getClass();
        ViewPager2 a2 = d.a(recyclerView);
        ((ArrayList) a2.f4080c.f632b).remove(dVar.f4071a);
        m mVar = dVar.f4072b;
        f fVar = dVar.f4076f;
        fVar.unregisterAdapterDataObserver(mVar);
        fVar.mLifecycle.c(dVar.f4073c);
        dVar.f4074d = null;
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public final boolean onFailedToRecycleView(g gVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public final void onViewRecycled(g gVar) {
        Long a2 = a(((FrameLayout) gVar.itemView).getId());
        if (a2 != null) {
            b(a2.longValue());
            this.mItemIdToViewHolder.f(a2.longValue());
        }
    }

    public void placeFragmentInViewHolder(g gVar) {
        K k4 = (K) this.mFragments.b(gVar.getItemId());
        if (k4 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) gVar.itemView;
        View view = k4.getView();
        if (!k4.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (k4.isAdded() && view == null) {
            c(k4, frameLayout);
            return;
        }
        if (k4.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                addViewToContainer(view, frameLayout);
                return;
            }
            return;
        }
        if (k4.isAdded()) {
            addViewToContainer(view, frameLayout);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            if (this.mFragmentManager.J) {
                return;
            }
            this.mLifecycle.a(new C0194o(this, gVar));
            return;
        }
        c(k4, frameLayout);
        b bVar = this.mFragmentEventDispatcher;
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = bVar.f4069a.iterator();
        if (it.hasNext()) {
            throw w.g(it);
        }
        try {
            k4.setMenuVisibility(false);
            AbstractC0158l0 abstractC0158l0 = this.mFragmentManager;
            abstractC0158l0.getClass();
            C0135a c0135a = new C0135a(abstractC0158l0);
            c0135a.c(0, k4, "f" + gVar.getItemId(), 1);
            c0135a.h(k4, B.f3283d);
            if (c0135a.f3263g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c0135a.h = false;
            c0135a.f3084q.B(c0135a, false);
            this.mFragmentMaxLifecycleEnforcer.b(false);
        } finally {
            this.mFragmentEventDispatcher.getClass();
            b.a(arrayList);
        }
    }

    public void registerFragmentTransactionCallback(e eVar) {
        this.mFragmentEventDispatcher.f4069a.add(eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected key in savedState: ".concat(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void restoreState(android.os.Parcelable r9) {
        /*
            r8 = this;
            s.g r0 = r8.mSavedStates
            int r0 = r0.g()
            if (r0 != 0) goto Lf2
            s.g r0 = r8.mFragments
            int r0 = r0.g()
            if (r0 != 0) goto Lf2
            android.os.Bundle r9 = (android.os.Bundle) r9
            java.lang.ClassLoader r0 = r9.getClassLoader()
            if (r0 != 0) goto L23
            java.lang.Class r0 = r8.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r9.setClassLoader(r0)
        L23:
            java.util.Set r0 = r9.keySet()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto Lc3
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "f#"
            boolean r3 = r1.startsWith(r3)
            r4 = 2
            if (r3 == 0) goto L48
            int r3 = r1.length()
            if (r3 <= r4) goto L48
            goto L49
        L48:
            r2 = 0
        L49:
            if (r2 == 0) goto L8e
            java.lang.String r2 = r1.substring(r4)
            long r2 = java.lang.Long.parseLong(r2)
            androidx.fragment.app.l0 r4 = r8.mFragmentManager
            r4.getClass()
            java.lang.String r5 = r9.getString(r1)
            r6 = 0
            if (r5 != 0) goto L60
            goto L69
        L60:
            androidx.fragment.app.u0 r7 = r4.f3160c
            androidx.fragment.app.K r7 = r7.b(r5)
            if (r7 == 0) goto L6f
            r6 = r7
        L69:
            s.g r1 = r8.mFragments
            r1.e(r2, r6)
            goto L2b
        L6f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Fragment no longer exists for key "
            r9.<init>(r0)
            r9.append(r1)
            java.lang.String r0 = ": unique id "
            r9.append(r0)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            r4.j0(r8)
            throw r6
        L8e:
            java.lang.String r2 = "s#"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto Lb7
            int r2 = r1.length()
            if (r2 <= r4) goto Lb7
            java.lang.String r2 = r1.substring(r4)
            long r2 = java.lang.Long.parseLong(r2)
            android.os.Parcelable r1 = r9.getParcelable(r1)
            androidx.fragment.app.J r1 = (androidx.fragment.app.J) r1
            boolean r4 = r8.containsItem(r2)
            if (r4 == 0) goto L2b
            s.g r4 = r8.mSavedStates
            r4.e(r2, r1)
            goto L2b
        Lb7:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Unexpected key in savedState: "
            java.lang.String r9 = r9.concat(r1)
            r8.<init>(r9)
            throw r8
        Lc3:
            s.g r9 = r8.mFragments
            int r9 = r9.g()
            if (r9 != 0) goto Lcc
            return
        Lcc:
            r8.mHasStaleFragments = r2
            r8.mIsInGracePeriod = r2
            r8.gcFragments()
            android.os.Handler r9 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r9.<init>(r0)
            androidx.viewpager2.adapter.a r0 = new androidx.viewpager2.adapter.a
            r0.<init>(r8)
            androidx.lifecycle.C r8 = r8.mLifecycle
            androidx.lifecycle.o r1 = new androidx.lifecycle.o
            r2 = 4
            r1.<init>(r2, r9, r0)
            r8.a(r1)
            r1 = 10000(0x2710, double:4.9407E-320)
            r9.postDelayed(r0, r1)
            return
        Lf2:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Expected the adapter to be 'fresh' while restoring state."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.adapter.f.restoreState(android.os.Parcelable):void");
    }

    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.mSavedStates.g() + this.mFragments.g());
        for (int i = 0; i < this.mFragments.g(); i++) {
            long d4 = this.mFragments.d(i);
            K k4 = (K) this.mFragments.b(d4);
            if (k4 != null && k4.isAdded()) {
                this.mFragmentManager.W(bundle, w.l(KEY_PREFIX_FRAGMENT, d4), k4);
            }
        }
        for (int i4 = 0; i4 < this.mSavedStates.g(); i4++) {
            long d5 = this.mSavedStates.d(i4);
            if (containsItem(d5)) {
                bundle.putParcelable(w.l(KEY_PREFIX_STATE, d5), (Parcelable) this.mSavedStates.b(d5));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public final void setHasStableIds(boolean z3) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.Q();
    }

    public void unregisterFragmentTransactionCallback(e eVar) {
        this.mFragmentEventDispatcher.f4069a.remove(eVar);
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public final void onBindViewHolder(g gVar, int i) {
        long itemId = gVar.getItemId();
        int id = ((FrameLayout) gVar.itemView).getId();
        Long a2 = a(id);
        if (a2 != null && a2.longValue() != itemId) {
            b(a2.longValue());
            this.mItemIdToViewHolder.f(a2.longValue());
        }
        this.mItemIdToViewHolder.e(itemId, Integer.valueOf(id));
        long itemId2 = getItemId(i);
        if (this.mFragments.c(itemId2) < 0) {
            K createFragment = createFragment(i);
            createFragment.setInitialSavedState((J) this.mSavedStates.b(itemId2));
            this.mFragments.e(itemId2, createFragment);
        }
        FrameLayout frameLayout = (FrameLayout) gVar.itemView;
        WeakHashMap weakHashMap = X.f1226a;
        if (frameLayout.isAttachedToWindow()) {
            placeFragmentInViewHolder(gVar);
        }
        gcFragments();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.recyclerview.widget.I0, androidx.viewpager2.adapter.g] */
    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public final g onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i4 = g.f4077a;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap weakHashMap = X.f1226a;
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new I0(frameLayout);
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public final void onViewAttachedToWindow(g gVar) {
        placeFragmentInViewHolder(gVar);
        gcFragments();
    }
}
