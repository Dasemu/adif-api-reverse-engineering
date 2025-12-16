package I2;

import O.X;
import a.AbstractC0105a;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.adif.elcanomovil.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import m.W;

/* loaded from: classes3.dex */
public final class z extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f911a;

    /* renamed from: b, reason: collision with root package name */
    public final W f912b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f913c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f914d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f915e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f916f;

    /* renamed from: g, reason: collision with root package name */
    public int f917g;
    public ImageView.ScaleType h;
    public View.OnLongClickListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f918j;

    public z(TextInputLayout textInputLayout, R0.h hVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f911a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f914d = checkableImageButton;
        W w3 = new W(getContext(), null);
        this.f912b = w3;
        if (AbstractC0105a.H(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        AbstractC0105a.P(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0105a.P(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) hVar.f1414b;
        if (typedArray.hasValue(69)) {
            this.f915e = AbstractC0105a.v(getContext(), hVar, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f916f = x2.m.j(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(hVar.f(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f917g) {
            this.f917g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType l4 = AbstractC0105a.l(typedArray.getInt(68, -1));
            this.h = l4;
            checkableImageButton.setScaleType(l4);
        }
        w3.setVisibility(8);
        w3.setId(R.id.textinput_prefix_text);
        w3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = X.f1226a;
        w3.setAccessibilityLiveRegion(1);
        w3.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            w3.setTextColor(hVar.e(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f913c = TextUtils.isEmpty(text2) ? null : text2;
        w3.setText(text2);
        e();
        addView(checkableImageButton);
        addView(w3);
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.f914d;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = X.f1226a;
        return this.f912b.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f914d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f915e;
            PorterDuff.Mode mode = this.f916f;
            TextInputLayout textInputLayout = this.f911a;
            AbstractC0105a.b(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            AbstractC0105a.N(textInputLayout, checkableImageButton, this.f915e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        AbstractC0105a.P(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0105a.P(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z3) {
        CheckableImageButton checkableImageButton = this.f914d;
        if ((checkableImageButton.getVisibility() == 0) != z3) {
            checkableImageButton.setVisibility(z3 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f911a.f5839d;
        if (editText == null) {
            return;
        }
        if (this.f914d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = X.f1226a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = X.f1226a;
        this.f912b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.f913c == null || this.f918j) ? 8 : 0;
        setVisibility((this.f914d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f912b.setVisibility(i);
        this.f911a.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        d();
    }
}
