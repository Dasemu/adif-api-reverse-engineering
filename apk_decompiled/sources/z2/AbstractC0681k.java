package z2;

import O.X;
import a.AbstractC0105a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.adif.elcanomovil.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import h2.AbstractC0379a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C0412i;
import l.InterfaceC0418A;
import l.y;
import m3.l;
import x2.m;

/* renamed from: z2.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0681k extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final C0674d f9088a;

    /* renamed from: b, reason: collision with root package name */
    public final n2.b f9089b;

    /* renamed from: c, reason: collision with root package name */
    public final C0677g f9090c;

    /* renamed from: d, reason: collision with root package name */
    public C0412i f9091d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0679i f9092e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0678h f9093f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [l.y, z2.g, java.lang.Object] */
    public AbstractC0681k(Context context, AttributeSet attributeSet) {
        super(K2.a.a(context, attributeSet, R.attr.bottomNavigationStyle, 2132018084), attributeSet, R.attr.bottomNavigationStyle);
        ?? obj = new Object();
        obj.f9085b = false;
        this.f9090c = obj;
        Context context2 = getContext();
        R0.h i = m.i(context2, attributeSet, AbstractC0379a.f6774w, R.attr.bottomNavigationStyle, 2132018084, 12, 10);
        C0674d c0674d = new C0674d(context2, getClass(), getMaxItemCount());
        this.f9088a = c0674d;
        n2.b bVar = new n2.b(context2);
        this.f9089b = bVar;
        obj.f9084a = bVar;
        obj.f9086c = 1;
        bVar.setPresenter(obj);
        c0674d.b(obj, c0674d.f7241a);
        getContext();
        obj.f9084a.f9058E = c0674d;
        TypedArray typedArray = (TypedArray) i.f1414b;
        if (typedArray.hasValue(6)) {
            bVar.setIconTintList(i.e(6));
        } else {
            bVar.setIconTintList(bVar.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(12)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(12, 0));
        }
        if (typedArray.hasValue(10)) {
            setItemTextAppearanceActive(typedArray.getResourceId(10, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(11, true));
        if (typedArray.hasValue(13)) {
            setItemTextColor(i.e(13));
        }
        Drawable background = getBackground();
        ColorStateList p = l.p(background);
        if (background == null || p != null) {
            E2.g gVar = new E2.g(E2.k.b(context2, attributeSet, R.attr.bottomNavigationStyle, 2132018084).a());
            if (p != null) {
                gVar.j(p);
            }
            gVar.h(context2);
            WeakHashMap weakHashMap = X.f1226a;
            setBackground(gVar);
        }
        if (typedArray.hasValue(8)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(8, 0));
        }
        if (typedArray.hasValue(7)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(7, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        H.a.h(getBackground().mutate(), AbstractC0105a.v(context2, i, 1));
        setLabelVisibilityMode(typedArray.getInteger(14, -1));
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            bVar.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(AbstractC0105a.v(context2, i, 9));
        }
        int resourceId2 = typedArray.getResourceId(3, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, AbstractC0379a.f6773v);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(AbstractC0105a.w(context2, obtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(E2.k.a(context2, obtainStyledAttributes.getResourceId(4, 0), 0, new E2.a(0)).a());
            obtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(15)) {
            int resourceId3 = typedArray.getResourceId(15, 0);
            obj.f9085b = true;
            getMenuInflater().inflate(resourceId3, c0674d);
            obj.f9085b = false;
            obj.h(true);
        }
        i.n();
        addView(bVar);
        c0674d.f7245e = new h3.d((BottomNavigationView) this, 11);
    }

    private MenuInflater getMenuInflater() {
        if (this.f9091d == null) {
            this.f9091d = new C0412i(getContext());
        }
        return this.f9091d;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f9089b.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f9089b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f9089b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f9089b.getItemActiveIndicatorMarginHorizontal();
    }

    public E2.k getItemActiveIndicatorShapeAppearance() {
        return this.f9089b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f9089b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f9089b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f9089b.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f9089b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f9089b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f9089b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f9089b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f9089b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f9089b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f9089b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f9089b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f9089b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f9088a;
    }

    public InterfaceC0418A getMenuView() {
        return this.f9089b;
    }

    public C0677g getPresenter() {
        return this.f9090c;
    }

    public int getSelectedItemId() {
        return this.f9089b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof E2.g) {
            m3.d.H(this, (E2.g) background);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0680j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0680j c0680j = (C0680j) parcelable;
        super.onRestoreInstanceState(c0680j.f1880a);
        Bundle bundle = c0680j.f9087c;
        C0674d c0674d = this.f9088a;
        c0674d.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = c0674d.f7258u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id = yVar.getId();
                    if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        yVar.d(parcelable2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, W.b, z2.j] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable k4;
        ?? bVar = new W.b(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        bVar.f9087c = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9088a.f7258u;
        if (copyOnWriteArrayList.isEmpty()) {
            return bVar;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = yVar.getId();
                if (id > 0 && (k4 = yVar.k()) != null) {
                    sparseArray.put(id, k4);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return bVar;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f9089b.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof E2.g) {
            ((E2.g) background).i(f2);
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f9089b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z3) {
        this.f9089b.setItemActiveIndicatorEnabled(z3);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f9089b.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f9089b.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(E2.k kVar) {
        this.f9089b.setItemActiveIndicatorShapeAppearance(kVar);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f9089b.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.f9089b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.f9089b.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.f9089b.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f9089b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.f9089b.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.f9089b.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f9089b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f9089b.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z3) {
        this.f9089b.setItemTextAppearanceActiveBoldEnabled(z3);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f9089b.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f9089b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        n2.b bVar = this.f9089b;
        if (bVar.getLabelVisibilityMode() != i) {
            bVar.setLabelVisibilityMode(i);
            this.f9090c.h(false);
        }
    }

    public void setOnItemReselectedListener(InterfaceC0678h interfaceC0678h) {
        this.f9093f = interfaceC0678h;
    }

    public void setOnItemSelectedListener(InterfaceC0679i interfaceC0679i) {
        this.f9092e = interfaceC0679i;
    }

    public void setSelectedItemId(int i) {
        C0674d c0674d = this.f9088a;
        MenuItem findItem = c0674d.findItem(i);
        if (findItem == null || c0674d.q(findItem, this.f9090c, 0)) {
            return;
        }
        findItem.setChecked(true);
    }
}
