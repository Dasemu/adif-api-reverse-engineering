package r2;

import C.w;
import C0.e;
import C0.f;
import F.j;
import F.q;
import R0.h;
import a.AbstractC0105a;
import a.AbstractC0106b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h2.AbstractC0379a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m.C0482q;
import m3.d;
import m3.l;
import x2.m;

/* loaded from: classes3.dex */
public final class c extends C0482q {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f8219e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f8220f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f8221g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8222j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f8223k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f8224l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f8225m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8226n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f8227o;
    public ColorStateList p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f8228q;

    /* renamed from: r, reason: collision with root package name */
    public int f8229r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f8230s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8231t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f8232u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f8233v;

    /* renamed from: w, reason: collision with root package name */
    public final f f8234w;

    /* renamed from: x, reason: collision with root package name */
    public final C0567a f8235x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f8217y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f8218z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f8215A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f8216B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public c(Context context, AttributeSet attributeSet) {
        super(K2.a.a(context, attributeSet, R.attr.checkboxStyle, 2132018310), attributeSet, R.attr.checkboxStyle);
        this.f8219e = new LinkedHashSet();
        this.f8220f = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = q.f503a;
        Drawable a2 = j.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.f286a = a2;
        a2.setCallback(fVar.f285f);
        new e(fVar.f286a.getConstantState());
        this.f8234w = fVar;
        this.f8235x = new C0567a(this);
        Context context3 = getContext();
        this.f8224l = U.c.a(this);
        this.f8227o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        h i = m.i(context3, attributeSet, AbstractC0379a.p, R.attr.checkboxStyle, 2132018310, new int[0]);
        this.f8225m = i.f(2);
        Drawable drawable = this.f8224l;
        TypedArray typedArray = (TypedArray) i.f1414b;
        if (drawable != null && l.U(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == f8216B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f8224l = AbstractC0106b.m(context3, R.drawable.mtrl_checkbox_button);
                this.f8226n = true;
                if (this.f8225m == null) {
                    this.f8225m = AbstractC0106b.m(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.p = AbstractC0105a.v(context3, i, 3);
        this.f8228q = m.j(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.h = typedArray.getBoolean(10, false);
        this.i = typedArray.getBoolean(6, true);
        this.f8222j = typedArray.getBoolean(9, false);
        this.f8223k = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        i.n();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f8229r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f8221g == null) {
            int t2 = d.t(this, R.attr.colorControlActivated);
            int t4 = d.t(this, R.attr.colorError);
            int t5 = d.t(this, R.attr.colorSurface);
            int t6 = d.t(this, R.attr.colorOnSurface);
            this.f8221g = new ColorStateList(f8215A, new int[]{d.y(1.0f, t5, t4), d.y(1.0f, t5, t2), d.y(0.54f, t5, t6), d.y(0.38f, t5, t6), d.y(0.38f, t5, t6)});
        }
        return this.f8221g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f8227o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        B0.q qVar;
        Drawable drawable = this.f8224l;
        ColorStateList colorStateList3 = this.f8227o;
        PorterDuff.Mode b4 = U.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b4 != null) {
                H.a.i(drawable, b4);
            }
        }
        this.f8224l = drawable;
        Drawable drawable2 = this.f8225m;
        ColorStateList colorStateList4 = this.p;
        PorterDuff.Mode mode = this.f8228q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                H.a.i(drawable2, mode);
            }
        }
        this.f8225m = drawable2;
        if (this.f8226n) {
            f fVar = this.f8234w;
            if (fVar != null) {
                Drawable drawable3 = fVar.f286a;
                C0567a c0567a = this.f8235x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (c0567a.f8212a == null) {
                        c0567a.f8212a = new C0.b(c0567a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0567a.f8212a);
                }
                ArrayList arrayList = fVar.f284e;
                C0.d dVar = fVar.f281b;
                if (arrayList != null && c0567a != null) {
                    arrayList.remove(c0567a);
                    if (fVar.f284e.size() == 0 && (qVar = fVar.f283d) != null) {
                        dVar.f277b.removeListener(qVar);
                        fVar.f283d = null;
                    }
                }
                Drawable drawable4 = fVar.f286a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (c0567a.f8212a == null) {
                        c0567a.f8212a = new C0.b(c0567a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0567a.f8212a);
                } else if (c0567a != null) {
                    if (fVar.f284e == null) {
                        fVar.f284e = new ArrayList();
                    }
                    if (!fVar.f284e.contains(c0567a)) {
                        fVar.f284e.add(c0567a);
                        if (fVar.f283d == null) {
                            fVar.f283d = new B0.q(fVar, 1);
                        }
                        dVar.f277b.addListener(fVar.f283d);
                    }
                }
            }
            Drawable drawable5 = this.f8224l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f8224l).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable6 = this.f8224l;
        if (drawable6 != null && (colorStateList2 = this.f8227o) != null) {
            H.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f8225m;
        if (drawable7 != null && (colorStateList = this.p) != null) {
            H.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f8224l;
        Drawable drawable9 = this.f8225m;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f2 = intrinsicWidth / intrinsicHeight;
                if (f2 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f8224l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f8225m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f8228q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f8227o;
    }

    public int getCheckedState() {
        return this.f8229r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f8223k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f8229r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.f8227o == null && this.p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f8217y);
        }
        if (this.f8222j) {
            View.mergeDrawableStates(onCreateDrawableState, f8218z);
        }
        int i4 = 0;
        while (true) {
            if (i4 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i5 = onCreateDrawableState[i4];
            if (i5 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i5 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i4] = 16842912;
                break;
            }
            i4++;
        }
        this.f8230s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a2;
        if (!this.i || !TextUtils.isEmpty(getText()) || (a2 = U.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a2.getIntrinsicWidth()) / 2) * (m.g(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, BitmapDescriptorFactory.HUE_RED);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a2.getBounds();
            H.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f8222j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f8223k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0568b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0568b c0568b = (C0568b) parcelable;
        super.onRestoreInstanceState(c0568b.getSuperState());
        setCheckedState(c0568b.f8214a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, r2.b, android.os.Parcelable] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f8214a = getCheckedState();
        return baseSavedState;
    }

    @Override // m.C0482q, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0106b.m(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f8225m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC0106b.m(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.p == colorStateList) {
            return;
        }
        this.p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f8228q == mode) {
            return;
        }
        this.f8228q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f8227o == colorStateList) {
            return;
        }
        this.f8227o = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z3) {
        this.i = z3;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        setCheckedState(z3 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f8229r != i) {
            this.f8229r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f8232u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f8231t) {
                return;
            }
            this.f8231t = true;
            LinkedHashSet linkedHashSet = this.f8220f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw w.g(it);
                }
            }
            if (this.f8229r != 2 && (onCheckedChangeListener = this.f8233v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f8231t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f8223k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z3) {
        if (this.f8222j == z3) {
            return;
        }
        this.f8222j = z3;
        refreshDrawableState();
        Iterator it = this.f8219e.iterator();
        if (it.hasNext()) {
            throw w.g(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f8233v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f8232u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.h = z3;
        if (z3) {
            U.b.c(this, getMaterialThemeColorsTintList());
        } else {
            U.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // m.C0482q, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f8224l = drawable;
        this.f8226n = false;
        a();
    }
}
