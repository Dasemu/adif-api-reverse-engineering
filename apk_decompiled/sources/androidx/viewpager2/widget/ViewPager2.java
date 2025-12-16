package androidx.viewpager2.widget;

import A.a;
import A.j;
import H0.b;
import H0.c;
import H0.d;
import H0.e;
import H0.f;
import H0.g;
import H0.i;
import H0.k;
import H0.l;
import H0.m;
import H0.n;
import H0.o;
import H0.p;
import O.S;
import O.X;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.AbstractC0230m0;
import androidx.recyclerview.widget.AbstractC0238q0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.io.ConstantsKt;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f4078a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f4079b;

    /* renamed from: c, reason: collision with root package name */
    public final b f4080c;

    /* renamed from: d, reason: collision with root package name */
    public int f4081d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4082e;

    /* renamed from: f, reason: collision with root package name */
    public final f f4083f;

    /* renamed from: g, reason: collision with root package name */
    public final i f4084g;
    public int h;
    public Parcelable i;

    /* renamed from: j, reason: collision with root package name */
    public final n f4085j;

    /* renamed from: k, reason: collision with root package name */
    public final m f4086k;

    /* renamed from: l, reason: collision with root package name */
    public final e f4087l;

    /* renamed from: m, reason: collision with root package name */
    public final b f4088m;

    /* renamed from: n, reason: collision with root package name */
    public final a f4089n;

    /* renamed from: o, reason: collision with root package name */
    public final c f4090o;
    public AbstractC0230m0 p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4091q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4092r;

    /* renamed from: s, reason: collision with root package name */
    public int f4093s;

    /* renamed from: t, reason: collision with root package name */
    public final j f4094t;

    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.Object, H0.c] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, A.j] */
    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4078a = new Rect();
        this.f4079b = new Rect();
        b bVar = new b();
        this.f4080c = bVar;
        int i = 0;
        this.f4082e = false;
        this.f4083f = new f(this, i);
        this.h = -1;
        this.p = null;
        this.f4091q = false;
        int i4 = 1;
        this.f4092r = true;
        this.f4093s = -1;
        ?? obj = new Object();
        obj.f30d = this;
        obj.f27a = new k(obj, i);
        obj.f28b = new k(obj, i4);
        this.f4094t = obj;
        n nVar = new n(this, context);
        this.f4085j = nVar;
        WeakHashMap weakHashMap = X.f1226a;
        nVar.setId(View.generateViewId());
        this.f4085j.setDescendantFocusability(131072);
        i iVar = new i(this);
        this.f4084g = iVar;
        this.f4085j.setLayoutManager(iVar);
        this.f4085j.setScrollingTouchSlop(1);
        int[] iArr = G0.a.f567a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        S.d(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.f4085j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            n nVar2 = this.f4085j;
            Object obj2 = new Object();
            if (nVar2.f3652C == null) {
                nVar2.f3652C = new ArrayList();
            }
            nVar2.f3652C.add(obj2);
            e eVar = new e(this);
            this.f4087l = eVar;
            this.f4089n = new a(eVar, 5);
            m mVar = new m(this);
            this.f4086k = mVar;
            mVar.a(this.f4085j);
            this.f4085j.k(this.f4087l);
            b bVar2 = new b();
            this.f4088m = bVar2;
            this.f4087l.f636a = bVar2;
            g gVar = new g(this, i);
            g gVar2 = new g(this, i4);
            ((ArrayList) bVar2.f632b).add(gVar);
            ((ArrayList) this.f4088m.f632b).add(gVar2);
            j jVar = this.f4094t;
            n nVar3 = this.f4085j;
            jVar.getClass();
            nVar3.setImportantForAccessibility(2);
            jVar.f29c = new f(jVar, i4);
            ViewPager2 viewPager2 = (ViewPager2) jVar.f30d;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.f4088m.f632b).add(bVar);
            ?? obj3 = new Object();
            this.f4090o = obj3;
            ((ArrayList) this.f4088m.f632b).add(obj3);
            n nVar4 = this.f4085j;
            attachViewToParent(nVar4, 0, nVar4.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a() {
        AbstractC0220h0 adapter;
        if (this.h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.f) {
                ((androidx.viewpager2.adapter.f) adapter).restoreState(parcelable);
            }
            this.i = null;
        }
        int max = Math.max(0, Math.min(this.h, adapter.getItemCount() - 1));
        this.f4081d = max;
        this.h = -1;
        this.f4085j.j0(max);
        this.f4094t.q();
    }

    public final void b(int i) {
        Object obj = this.f4089n.f7b;
        c(i);
    }

    public final void c(int i) {
        AbstractC0220h0 adapter = getAdapter();
        if (adapter == null) {
            if (this.h != -1) {
                this.h = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
        int i4 = this.f4081d;
        if ((min == i4 && this.f4087l.f641f == 0) || min == i4) {
            return;
        }
        double d4 = i4;
        this.f4081d = min;
        this.f4094t.q();
        e eVar = this.f4087l;
        if (eVar.f641f != 0) {
            eVar.d();
            d dVar = eVar.f642g;
            d4 = dVar.f633a + dVar.f634b;
        }
        e eVar2 = this.f4087l;
        eVar2.getClass();
        eVar2.f640e = 2;
        boolean z3 = eVar2.i != min;
        eVar2.i = min;
        eVar2.b(2);
        if (z3) {
            eVar2.a(min);
        }
        double d5 = min;
        if (Math.abs(d5 - d4) <= 3.0d) {
            this.f4085j.m0(min);
            return;
        }
        this.f4085j.j0(d5 > d4 ? min - 3 : min + 3);
        n nVar = this.f4085j;
        nVar.post(new p(min, nVar));
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f4085j.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f4085j.canScrollVertically(i);
    }

    public final void d() {
        m mVar = this.f4086k;
        if (mVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View e4 = mVar.e(this.f4084g);
        if (e4 == null) {
            return;
        }
        this.f4084g.getClass();
        int L3 = AbstractC0238q0.L(e4);
        if (L3 != this.f4081d && getScrollState() == 0) {
            this.f4088m.c(L3);
        }
        this.f4082e = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof o) {
            int i = ((o) parcelable).f655a;
            sparseArray.put(this.f4085j.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f4094t.getClass();
        this.f4094t.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public AbstractC0220h0 getAdapter() {
        return this.f4085j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f4081d;
    }

    public int getItemDecorationCount() {
        return this.f4085j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f4093s;
    }

    public int getOrientation() {
        return this.f4084g.p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        n nVar = this.f4085j;
        if (getOrientation() == 0) {
            height = nVar.getWidth() - nVar.getPaddingLeft();
            paddingBottom = nVar.getPaddingRight();
        } else {
            height = nVar.getHeight() - nVar.getPaddingTop();
            paddingBottom = nVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f4087l.f641f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i4;
        int itemCount;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.f4094t.f30d;
        if (viewPager2.getAdapter() == null) {
            i = 0;
            i4 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            i = viewPager2.getAdapter().getItemCount();
            i4 = 1;
        } else {
            i4 = viewPager2.getAdapter().getItemCount();
            i = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) a.s(i, i4, 0).f7b);
        AbstractC0220h0 adapter = viewPager2.getAdapter();
        if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !viewPager2.f4092r) {
            return;
        }
        if (viewPager2.f4081d > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.f4081d < itemCount - 1) {
            accessibilityNodeInfo.addAction(ConstantsKt.DEFAULT_BLOCK_SIZE);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        int measuredWidth = this.f4085j.getMeasuredWidth();
        int measuredHeight = this.f4085j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f4078a;
        rect.left = paddingLeft;
        rect.right = (i5 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i6 - i4) - getPaddingBottom();
        Rect rect2 = this.f4079b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f4085j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f4082e) {
            d();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        measureChild(this.f4085j, i, i4);
        int measuredWidth = this.f4085j.getMeasuredWidth();
        int measuredHeight = this.f4085j.getMeasuredHeight();
        int measuredState = this.f4085j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.getSuperState());
        this.h = oVar.f656b;
        this.i = oVar.f657c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, H0.o] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f655a = this.f4085j.getId();
        int i = this.h;
        if (i == -1) {
            i = this.f4081d;
        }
        baseSavedState.f656b = i;
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            baseSavedState.f657c = parcelable;
            return baseSavedState;
        }
        AbstractC0220h0 adapter = this.f4085j.getAdapter();
        if (adapter instanceof androidx.viewpager2.adapter.f) {
            baseSavedState.f657c = ((androidx.viewpager2.adapter.f) adapter).saveState();
        }
        return baseSavedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.f4094t.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        j jVar = this.f4094t;
        jVar.getClass();
        if (i != 8192 && i != 4096) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = (ViewPager2) jVar.f30d;
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.f4092r) {
            viewPager2.c(currentItem);
        }
        return true;
    }

    public void setAdapter(AbstractC0220h0 abstractC0220h0) {
        AbstractC0220h0 adapter = this.f4085j.getAdapter();
        j jVar = this.f4094t;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver((f) jVar.f29c);
        } else {
            jVar.getClass();
        }
        f fVar = this.f4083f;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(fVar);
        }
        this.f4085j.setAdapter(abstractC0220h0);
        this.f4081d = 0;
        a();
        j jVar2 = this.f4094t;
        jVar2.q();
        if (abstractC0220h0 != null) {
            abstractC0220h0.registerAdapterDataObserver((f) jVar2.f29c);
        }
        if (abstractC0220h0 != null) {
            abstractC0220h0.registerAdapterDataObserver(fVar);
        }
    }

    public void setCurrentItem(int i) {
        b(i);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f4094t.q();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f4093s = i;
        this.f4085j.requestLayout();
    }

    public void setOrientation(int i) {
        this.f4084g.j1(i);
        this.f4094t.q();
    }

    public void setPageTransformer(l lVar) {
        if (lVar != null) {
            if (!this.f4091q) {
                this.p = this.f4085j.getItemAnimator();
                this.f4091q = true;
            }
            this.f4085j.setItemAnimator(null);
        } else if (this.f4091q) {
            this.f4085j.setItemAnimator(this.p);
            this.p = null;
            this.f4091q = false;
        }
        this.f4090o.getClass();
        if (lVar == null) {
            return;
        }
        this.f4090o.getClass();
        this.f4090o.getClass();
    }

    public void setUserInputEnabled(boolean z3) {
        this.f4092r = z3;
        this.f4094t.q();
    }
}
