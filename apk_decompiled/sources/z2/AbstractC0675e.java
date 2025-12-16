package z2;

import B0.C0023a;
import B0.x;
import O.X;
import a.AbstractC0106b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i2.AbstractC0396a;
import java.util.HashSet;
import java.util.WeakHashMap;
import k2.C0417a;
import l.InterfaceC0418A;
import l.m;
import l.o;

/* renamed from: z2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0675e extends ViewGroup implements InterfaceC0418A {

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f9052F = {R.attr.state_checked};

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f9053G = {-16842910};

    /* renamed from: A, reason: collision with root package name */
    public E2.k f9054A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f9055B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f9056C;

    /* renamed from: D, reason: collision with root package name */
    public C0677g f9057D;

    /* renamed from: E, reason: collision with root package name */
    public m f9058E;

    /* renamed from: a, reason: collision with root package name */
    public final C0023a f9059a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f9060b;

    /* renamed from: c, reason: collision with root package name */
    public final N.d f9061c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f9062d;

    /* renamed from: e, reason: collision with root package name */
    public int f9063e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC0673c[] f9064f;

    /* renamed from: g, reason: collision with root package name */
    public int f9065g;
    public int h;
    public ColorStateList i;

    /* renamed from: j, reason: collision with root package name */
    public int f9066j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f9067k;

    /* renamed from: l, reason: collision with root package name */
    public final ColorStateList f9068l;

    /* renamed from: m, reason: collision with root package name */
    public int f9069m;

    /* renamed from: n, reason: collision with root package name */
    public int f9070n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9071o;
    public Drawable p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f9072q;

    /* renamed from: r, reason: collision with root package name */
    public int f9073r;

    /* renamed from: s, reason: collision with root package name */
    public final SparseArray f9074s;

    /* renamed from: t, reason: collision with root package name */
    public int f9075t;

    /* renamed from: u, reason: collision with root package name */
    public int f9076u;

    /* renamed from: v, reason: collision with root package name */
    public int f9077v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9078w;

    /* renamed from: x, reason: collision with root package name */
    public int f9079x;

    /* renamed from: y, reason: collision with root package name */
    public int f9080y;

    /* renamed from: z, reason: collision with root package name */
    public int f9081z;

    public AbstractC0675e(Context context) {
        super(context);
        int i = 5;
        this.f9061c = new N.d(5);
        this.f9062d = new SparseArray(5);
        this.f9065g = 0;
        this.h = 0;
        this.f9074s = new SparseArray(5);
        this.f9075t = -1;
        this.f9076u = -1;
        this.f9077v = -1;
        this.f9055B = false;
        this.f9068l = c();
        if (isInEditMode()) {
            this.f9059a = null;
        } else {
            C0023a c0023a = new C0023a();
            this.f9059a = c0023a;
            c0023a.R(0);
            c0023a.F(AbstractC0106b.E(getContext(), com.adif.elcanomovil.R.attr.motionDurationMedium4, getResources().getInteger(com.adif.elcanomovil.R.integer.material_motion_duration_long_1)));
            c0023a.H(AbstractC0106b.F(getContext(), com.adif.elcanomovil.R.attr.motionEasingStandard, AbstractC0396a.f6816b));
            c0023a.N(new x());
        }
        this.f9060b = new com.google.android.material.datepicker.j((n2.b) this, i);
        WeakHashMap weakHashMap = X.f1226a;
        setImportantForAccessibility(1);
    }

    private AbstractC0673c getNewItem() {
        AbstractC0673c abstractC0673c = (AbstractC0673c) this.f9061c.a();
        return abstractC0673c == null ? new AbstractC0673c(getContext()) : abstractC0673c;
    }

    private void setBadgeIfNeeded(AbstractC0673c abstractC0673c) {
        C0417a c0417a;
        int id = abstractC0673c.getId();
        if (id == -1 || (c0417a = (C0417a) this.f9074s.get(id)) == null) {
            return;
        }
        abstractC0673c.setBadge(c0417a);
    }

    @Override // l.InterfaceC0418A
    public final void a(m mVar) {
        this.f9058E = mVar;
    }

    public final void b() {
        removeAllViews();
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                if (abstractC0673c != null) {
                    this.f9061c.c(abstractC0673c);
                    if (abstractC0673c.f9026F != null) {
                        ImageView imageView = abstractC0673c.f9038n;
                        if (imageView != null) {
                            abstractC0673c.setClipChildren(true);
                            abstractC0673c.setClipToPadding(true);
                            C0417a c0417a = abstractC0673c.f9026F;
                            if (c0417a != null) {
                                if (c0417a.d() != null) {
                                    c0417a.d().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(c0417a);
                                }
                            }
                        }
                        abstractC0673c.f9026F = null;
                    }
                    abstractC0673c.f9043t = null;
                    abstractC0673c.f9049z = BitmapDescriptorFactory.HUE_RED;
                    abstractC0673c.f9027a = false;
                }
            }
        }
        if (this.f9058E.f7246f.size() == 0) {
            this.f9065g = 0;
            this.h = 0;
            this.f9064f = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f9058E.f7246f.size(); i++) {
            hashSet.add(Integer.valueOf(this.f9058E.getItem(i).getItemId()));
        }
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f9074s;
            if (i4 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i4);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i4++;
        }
        this.f9064f = new AbstractC0673c[this.f9058E.f7246f.size()];
        int i5 = this.f9063e;
        boolean z3 = i5 != -1 ? i5 == 0 : this.f9058E.l().size() > 3;
        for (int i6 = 0; i6 < this.f9058E.f7246f.size(); i6++) {
            this.f9057D.f9085b = true;
            this.f9058E.getItem(i6).setCheckable(true);
            this.f9057D.f9085b = false;
            AbstractC0673c newItem = getNewItem();
            this.f9064f[i6] = newItem;
            newItem.setIconTintList(this.i);
            newItem.setIconSize(this.f9066j);
            newItem.setTextColor(this.f9068l);
            newItem.setTextAppearanceInactive(this.f9069m);
            newItem.setTextAppearanceActive(this.f9070n);
            newItem.setTextAppearanceActiveBoldEnabled(this.f9071o);
            newItem.setTextColor(this.f9067k);
            int i7 = this.f9075t;
            if (i7 != -1) {
                newItem.setItemPaddingTop(i7);
            }
            int i8 = this.f9076u;
            if (i8 != -1) {
                newItem.setItemPaddingBottom(i8);
            }
            int i9 = this.f9077v;
            if (i9 != -1) {
                newItem.setActiveIndicatorLabelPadding(i9);
            }
            newItem.setActiveIndicatorWidth(this.f9079x);
            newItem.setActiveIndicatorHeight(this.f9080y);
            newItem.setActiveIndicatorMarginHorizontal(this.f9081z);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.f9055B);
            newItem.setActiveIndicatorEnabled(this.f9078w);
            Drawable drawable = this.p;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f9073r);
            }
            newItem.setItemRippleColor(this.f9072q);
            newItem.setShifting(z3);
            newItem.setLabelVisibilityMode(this.f9063e);
            o oVar = (o) this.f9058E.getItem(i6);
            newItem.b(oVar);
            newItem.setItemPosition(i6);
            SparseArray sparseArray2 = this.f9062d;
            int i10 = oVar.f7268a;
            newItem.setOnTouchListener((View.OnTouchListener) sparseArray2.get(i10));
            newItem.setOnClickListener(this.f9060b);
            int i11 = this.f9065g;
            if (i11 != 0 && i10 == i11) {
                this.h = i6;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f9058E.f7246f.size() - 1, this.h);
        this.h = min;
        this.f9058E.getItem(min).setChecked(true);
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = D.h.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.adif.elcanomovil.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = f9053G;
        return new ColorStateList(new int[][]{iArr, f9052F, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    public final E2.g d() {
        if (this.f9054A == null || this.f9056C == null) {
            return null;
        }
        E2.g gVar = new E2.g(this.f9054A);
        gVar.j(this.f9056C);
        return gVar;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f9077v;
    }

    public SparseArray<C0417a> getBadgeDrawables() {
        return this.f9074s;
    }

    public ColorStateList getIconTintList() {
        return this.i;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f9056C;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f9078w;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f9080y;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f9081z;
    }

    public E2.k getItemActiveIndicatorShapeAppearance() {
        return this.f9054A;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f9079x;
    }

    public Drawable getItemBackground() {
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        return (abstractC0673cArr == null || abstractC0673cArr.length <= 0) ? this.p : abstractC0673cArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f9073r;
    }

    public int getItemIconSize() {
        return this.f9066j;
    }

    public int getItemPaddingBottom() {
        return this.f9076u;
    }

    public int getItemPaddingTop() {
        return this.f9075t;
    }

    public ColorStateList getItemRippleColor() {
        return this.f9072q;
    }

    public int getItemTextAppearanceActive() {
        return this.f9070n;
    }

    public int getItemTextAppearanceInactive() {
        return this.f9069m;
    }

    public ColorStateList getItemTextColor() {
        return this.f9067k;
    }

    public int getLabelVisibilityMode() {
        return this.f9063e;
    }

    public m getMenu() {
        return this.f9058E;
    }

    public int getSelectedItemId() {
        return this.f9065g;
    }

    public int getSelectedItemPosition() {
        return this.h;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) A.a.s(1, this.f9058E.l().size(), 1).f7b);
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f9077v = i;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setActiveIndicatorLabelPadding(i);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.i = colorStateList;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f9056C = colorStateList;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z3) {
        this.f9078w = z3;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setActiveIndicatorEnabled(z3);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f9080y = i;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f9081z = i;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z3) {
        this.f9055B = z3;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setActiveIndicatorResizeable(z3);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(E2.k kVar) {
        this.f9054A = kVar;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f9079x = i;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.p = drawable;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f9073r = i;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f9066j = i;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.f9076u = i;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.f9075t = i;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f9072q = colorStateList;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f9070n = i;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f9067k;
                if (colorStateList != null) {
                    abstractC0673c.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z3) {
        this.f9071o = z3;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setTextAppearanceActiveBoldEnabled(z3);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f9069m = i;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f9067k;
                if (colorStateList != null) {
                    abstractC0673c.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f9067k = colorStateList;
        AbstractC0673c[] abstractC0673cArr = this.f9064f;
        if (abstractC0673cArr != null) {
            for (AbstractC0673c abstractC0673c : abstractC0673cArr) {
                abstractC0673c.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f9063e = i;
    }

    public void setPresenter(C0677g c0677g) {
        this.f9057D = c0677g;
    }
}
