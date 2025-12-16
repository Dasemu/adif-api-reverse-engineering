package I2;

import O.X;
import a.AbstractC0105a;
import a.AbstractC0106b;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.textfield.TextInputLayout;
import i2.AbstractC0396a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.W;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f872A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f873B;

    /* renamed from: a, reason: collision with root package name */
    public final int f874a;

    /* renamed from: b, reason: collision with root package name */
    public final int f875b;

    /* renamed from: c, reason: collision with root package name */
    public final int f876c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f877d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f878e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f879f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f880g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f881j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f882k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f883l;

    /* renamed from: m, reason: collision with root package name */
    public final float f884m;

    /* renamed from: n, reason: collision with root package name */
    public int f885n;

    /* renamed from: o, reason: collision with root package name */
    public int f886o;
    public CharSequence p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f887q;

    /* renamed from: r, reason: collision with root package name */
    public W f888r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f889s;

    /* renamed from: t, reason: collision with root package name */
    public int f890t;

    /* renamed from: u, reason: collision with root package name */
    public int f891u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f892v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f893w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f894x;

    /* renamed from: y, reason: collision with root package name */
    public W f895y;

    /* renamed from: z, reason: collision with root package name */
    public int f896z;

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f880g = context;
        this.h = textInputLayout;
        this.f884m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f874a = AbstractC0106b.E(context, R.attr.motionDurationShort4, 217);
        this.f875b = AbstractC0106b.E(context, R.attr.motionDurationMedium4, 167);
        this.f876c = AbstractC0106b.E(context, R.attr.motionDurationShort4, 167);
        this.f877d = AbstractC0106b.F(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0396a.f6818d);
        LinearInterpolator linearInterpolator = AbstractC0396a.f6815a;
        this.f878e = AbstractC0106b.F(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f879f = AbstractC0106b.F(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(W w3, int i) {
        if (this.i == null && this.f882k == null) {
            Context context = this.f880g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f882k = new FrameLayout(context);
            this.i.addView(this.f882k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f882k.setVisibility(0);
            this.f882k.addView(w3);
        } else {
            this.i.addView(w3, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f881j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f880g;
                boolean H3 = AbstractC0105a.H(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = X.f1226a;
                int paddingStart = editText.getPaddingStart();
                if (H3) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (H3) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (H3) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f883l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z3, W w3, int i, int i4, int i5) {
        if (w3 == null || !z3) {
            return;
        }
        if (i == i5 || i == i4) {
            boolean z4 = i5 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(w3, (Property<W, Float>) View.ALPHA, z4 ? 1.0f : 0.0f);
            int i6 = this.f876c;
            ofFloat.setDuration(z4 ? this.f875b : i6);
            ofFloat.setInterpolator(z4 ? this.f878e : this.f879f);
            if (i == i5 && i4 != 0) {
                ofFloat.setStartDelay(i6);
            }
            arrayList.add(ofFloat);
            if (i5 != i || i4 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(w3, (Property<W, Float>) View.TRANSLATION_Y, -this.f884m, BitmapDescriptorFactory.HUE_RED);
            ofFloat2.setDuration(this.f874a);
            ofFloat2.setInterpolator(this.f877d);
            ofFloat2.setStartDelay(i6);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f888r;
        }
        if (i != 2) {
            return null;
        }
        return this.f895y;
    }

    public final void f() {
        this.p = null;
        c();
        if (this.f885n == 1) {
            if (!this.f894x || TextUtils.isEmpty(this.f893w)) {
                this.f886o = 0;
            } else {
                this.f886o = 2;
            }
        }
        i(this.f885n, this.f886o, h(this.f888r, ""));
    }

    public final void g(W w3, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f882k) != null) {
            frameLayout.removeView(w3);
        } else {
            linearLayout.removeView(w3);
        }
        int i4 = this.f881j - 1;
        this.f881j = i4;
        LinearLayout linearLayout2 = this.i;
        if (i4 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(W w3, CharSequence charSequence) {
        WeakHashMap weakHashMap = X.f1226a;
        TextInputLayout textInputLayout = this.h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f886o == this.f885n && w3 != null && TextUtils.equals(w3.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i, int i4, boolean z3) {
        TextView e4;
        TextView e5;
        u uVar = this;
        if (i == i4) {
            return;
        }
        if (z3) {
            AnimatorSet animatorSet = new AnimatorSet();
            uVar.f883l = animatorSet;
            ArrayList arrayList = new ArrayList();
            uVar.d(arrayList, uVar.f894x, uVar.f895y, 2, i, i4);
            uVar.d(arrayList, uVar.f887q, uVar.f888r, 1, i, i4);
            int size = arrayList.size();
            long j4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Animator animator = (Animator) arrayList.get(i5);
                j4 = Math.max(j4, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j4);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            s sVar = new s(this, i4, e(i), i, uVar.e(i4));
            uVar = this;
            animatorSet.addListener(sVar);
            animatorSet.start();
        } else if (i != i4) {
            if (i4 != 0 && (e5 = uVar.e(i4)) != null) {
                e5.setVisibility(0);
                e5.setAlpha(1.0f);
            }
            if (i != 0 && (e4 = e(i)) != null) {
                e4.setVisibility(4);
                if (i == 1) {
                    e4.setText((CharSequence) null);
                }
            }
            uVar.f885n = i4;
        }
        TextInputLayout textInputLayout = uVar.h;
        textInputLayout.r();
        textInputLayout.u(z3, false);
        textInputLayout.x();
    }
}
