package com.google.android.material.internal;

import F.j;
import F.q;
import F0.g;
import H.a;
import O.X;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import l.o;
import l.z;
import m.C0483q0;
import m.W0;
import x2.d;

/* loaded from: classes3.dex */
public class NavigationMenuItemView extends d implements z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f5721G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f5722A;

    /* renamed from: B, reason: collision with root package name */
    public o f5723B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f5724C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f5725D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f5726E;

    /* renamed from: F, reason: collision with root package name */
    public final g f5727F;

    /* renamed from: v, reason: collision with root package name */
    public int f5728v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5729w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5730x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f5731y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f5732z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5731y = true;
        g gVar = new g(this, 6);
        this.f5727F = gVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.adif.elcanomovil.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.adif.elcanomovil.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.adif.elcanomovil.R.id.design_menu_item_text);
        this.f5732z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        X.j(checkedTextView, gVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f5722A == null) {
                this.f5722A = (FrameLayout) ((ViewStub) findViewById(com.adif.elcanomovil.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f5722A.removeAllViews();
            this.f5722A.addView(view);
        }
    }

    @Override // l.z
    public final void b(o oVar) {
        StateListDrawable stateListDrawable;
        this.f5723B = oVar;
        int i = oVar.f7268a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(oVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.adif.elcanomovil.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f5721G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = X.f1226a;
            setBackground(stateListDrawable);
        }
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setTitle(oVar.f7272e);
        setIcon(oVar.getIcon());
        setActionView(oVar.getActionView());
        setContentDescription(oVar.f7281q);
        W0.a(this, oVar.f7282r);
        o oVar2 = this.f5723B;
        CharSequence charSequence = oVar2.f7272e;
        CheckedTextView checkedTextView = this.f5732z;
        if (charSequence == null && oVar2.getIcon() == null && this.f5723B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f5722A;
            if (frameLayout != null) {
                C0483q0 c0483q0 = (C0483q0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0483q0).width = -1;
                this.f5722A.setLayoutParams(c0483q0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f5722A;
        if (frameLayout2 != null) {
            C0483q0 c0483q02 = (C0483q0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0483q02).width = -2;
            this.f5722A.setLayoutParams(c0483q02);
        }
    }

    @Override // l.z
    public o getItemData() {
        return this.f5723B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        o oVar = this.f5723B;
        if (oVar != null && oVar.isCheckable() && this.f5723B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f5721G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z3) {
        refreshDrawableState();
        if (this.f5730x != z3) {
            this.f5730x = z3;
            this.f5727F.h(this.f5732z, 2048);
        }
    }

    public void setChecked(boolean z3) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f5732z;
        checkedTextView.setChecked(z3);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z3 && this.f5731y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f5725D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.h(drawable, this.f5724C);
            }
            int i = this.f5728v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f5729w) {
            if (this.f5726E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = q.f503a;
                Drawable a2 = j.a(resources, com.adif.elcanomovil.R.drawable.navigation_empty_icon, theme);
                this.f5726E = a2;
                if (a2 != null) {
                    int i4 = this.f5728v;
                    a2.setBounds(0, 0, i4, i4);
                }
            }
            drawable = this.f5726E;
        }
        this.f5732z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f5732z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f5728v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f5724C = colorStateList;
        this.f5725D = colorStateList != null;
        o oVar = this.f5723B;
        if (oVar != null) {
            setIcon(oVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f5732z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z3) {
        this.f5729w = z3;
    }

    public void setTextAppearance(int i) {
        this.f5732z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f5732z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f5732z.setText(charSequence);
    }
}
