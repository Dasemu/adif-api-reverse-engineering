package I2;

import a.AbstractC0105a;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.adif.elcanomovil.R;
import com.google.android.material.textfield.TextInputLayout;
import h2.AbstractC0379a;
import java.util.List;
import java.util.Locale;
import m.C0480p;
import m.C0496x0;

/* loaded from: classes3.dex */
public final class x extends C0480p {

    /* renamed from: e, reason: collision with root package name */
    public final C0496x0 f902e;

    /* renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f903f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f904g;
    public final int h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f905j;

    /* renamed from: k, reason: collision with root package name */
    public int f906k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f907l;

    public x(Context context, AttributeSet attributeSet) {
        super(K2.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f904g = new Rect();
        Context context2 = getContext();
        TypedArray h = x2.m.h(context2, attributeSet, AbstractC0379a.f6763k, R.attr.autoCompleteTextViewStyle, 2132018018, new int[0]);
        if (h.hasValue(0) && h.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.h = h.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.i = h.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (h.hasValue(2)) {
            this.f905j = ColorStateList.valueOf(h.getColor(2, 0));
        }
        this.f906k = h.getColor(4, 0);
        this.f907l = AbstractC0105a.w(context2, h, 5);
        this.f903f = (AccessibilityManager) context2.getSystemService("accessibility");
        C0496x0 c0496x0 = new C0496x0(context2, null, R.attr.listPopupWindowStyle);
        this.f902e = c0496x0;
        c0496x0.f7781y = true;
        c0496x0.f7782z.setFocusable(true);
        c0496x0.f7772o = this;
        c0496x0.f7782z.setInputMethodMode(2);
        c0496x0.p(getAdapter());
        c0496x0.p = new v(this, 0);
        if (h.hasValue(6)) {
            setSimpleItems(h.getResourceId(6, 0));
        }
        h.recycle();
    }

    public static void a(x xVar, Object obj) {
        xVar.setText(xVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f903f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f902e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f905j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b4 = b();
        return (b4 == null || !b4.f5815E) ? super.getHint() : b4.getHint();
    }

    public float getPopupElevation() {
        return this.i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f906k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f907l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b4 = b();
        if (b4 != null && b4.f5815E && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f902e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b4 = b();
            int i5 = 0;
            if (adapter != null && b4 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0496x0 c0496x0 = this.f902e;
                int min = Math.min(adapter.getCount(), Math.max(0, !c0496x0.f7782z.isShowing() ? -1 : c0496x0.f7762c.getSelectedItemPosition()) + 15);
                View view = null;
                int i6 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i5) {
                        view = null;
                        i5 = itemViewType;
                    }
                    view = adapter.getView(max, view, b4);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i6 = Math.max(i6, view.getMeasuredWidth());
                }
                Drawable background = c0496x0.f7782z.getBackground();
                if (background != null) {
                    Rect rect = this.f904g;
                    background.getPadding(rect);
                    i6 += rect.left + rect.right;
                }
                i5 = b4.getEndIconView().getMeasuredWidth() + i6;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i5), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z3);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.f902e.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0496x0 c0496x0 = this.f902e;
        if (c0496x0 != null) {
            c0496x0.h(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f905j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof E2.g) {
            ((E2.g) dropDownBackground).j(this.f905j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f902e.f7773q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout b4 = b();
        if (b4 != null) {
            b4.s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f906k = i;
        if (getAdapter() instanceof w) {
            ((w) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f907l = colorStateList;
        if (getAdapter() instanceof w) {
            ((w) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f902e.c();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new w(this, getContext(), this.h, strArr));
    }
}
