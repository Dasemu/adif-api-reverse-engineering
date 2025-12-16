package I2;

import a.AbstractC0106b;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.CheckableImageButton;
import i2.AbstractC0396a;

/* renamed from: I2.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0053d extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f806e;

    /* renamed from: f, reason: collision with root package name */
    public final int f807f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f808g;
    public final TimeInterpolator h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final D1.a f809j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0050a f810k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f811l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f812m;

    public C0053d(q qVar) {
        super(qVar);
        this.f809j = new D1.a(this, 3);
        this.f810k = new ViewOnFocusChangeListenerC0050a(this, 0);
        this.f806e = AbstractC0106b.E(qVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f807f = AbstractC0106b.E(qVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f808g = AbstractC0106b.F(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0396a.f6815a);
        this.h = AbstractC0106b.F(qVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0396a.f6818d);
    }

    @Override // I2.r
    public final void a() {
        if (this.f863b.p != null) {
            return;
        }
        t(u());
    }

    @Override // I2.r
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // I2.r
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // I2.r
    public final View.OnFocusChangeListener e() {
        return this.f810k;
    }

    @Override // I2.r
    public final View.OnClickListener f() {
        return this.f809j;
    }

    @Override // I2.r
    public final View.OnFocusChangeListener g() {
        return this.f810k;
    }

    @Override // I2.r
    public final void m(EditText editText) {
        this.i = editText;
        this.f862a.setEndIconVisible(u());
    }

    @Override // I2.r
    public final void p(boolean z3) {
        if (this.f863b.p == null) {
            return;
        }
        t(z3);
    }

    @Override // I2.r
    public final void r() {
        final int i = 1;
        final int i4 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f807f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: I2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0053d f803b;

            {
                this.f803b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i;
                C0053d c0053d = this.f803b;
                c0053d.getClass();
                switch (i5) {
                    case 0:
                        c0053d.f865d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0053d.f865d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        TimeInterpolator timeInterpolator = this.f808g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i5 = this.f806e;
        ofFloat2.setDuration(i5);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: I2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0053d f803b;

            {
                this.f803b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i52 = i4;
                C0053d c0053d = this.f803b;
                c0053d.getClass();
                switch (i52) {
                    case 0:
                        c0053d.f865d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0053d.f865d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f811l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f811l.addListener(new C0052c(this, i4));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i5);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: I2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0053d f803b;

            {
                this.f803b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i52 = i4;
                C0053d c0053d = this.f803b;
                c0053d.getClass();
                switch (i52) {
                    case 0:
                        c0053d.f865d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0053d.f865d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        this.f812m = ofFloat3;
        ofFloat3.addListener(new C0052c(this, i));
    }

    @Override // I2.r
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new F2.f(this, 1));
        }
    }

    public final void t(boolean z3) {
        boolean z4 = this.f863b.d() == z3;
        if (z3 && !this.f811l.isRunning()) {
            this.f812m.cancel();
            this.f811l.start();
            if (z4) {
                this.f811l.end();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f811l.cancel();
        this.f812m.start();
        if (z4) {
            this.f812m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.f865d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
