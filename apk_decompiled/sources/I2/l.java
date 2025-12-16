package I2;

import O.X;
import a.AbstractC0106b;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.textfield.TextInputLayout;
import i2.AbstractC0396a;
import java.util.WeakHashMap;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes3.dex */
public final class l extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f824e;

    /* renamed from: f, reason: collision with root package name */
    public final int f825f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f826g;
    public AutoCompleteTextView h;
    public final D1.a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0050a f827j;

    /* renamed from: k, reason: collision with root package name */
    public final k f828k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f829l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f830m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f831n;

    /* renamed from: o, reason: collision with root package name */
    public long f832o;
    public AccessibilityManager p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f833q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f834r;

    public l(q qVar) {
        super(qVar);
        this.i = new D1.a(this, 4);
        this.f827j = new ViewOnFocusChangeListenerC0050a(this, 1);
        this.f828k = new k(this, 0);
        this.f832o = LongCompanionObject.MAX_VALUE;
        this.f825f = AbstractC0106b.E(qVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f824e = AbstractC0106b.E(qVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f826g = AbstractC0106b.F(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0396a.f6815a);
    }

    @Override // I2.r
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && m3.l.E(this.h) && !this.f865d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new F2.f(this, 2));
    }

    @Override // I2.r
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // I2.r
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // I2.r
    public final View.OnFocusChangeListener e() {
        return this.f827j;
    }

    @Override // I2.r
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // I2.r
    public final k h() {
        return this.f828k;
    }

    @Override // I2.r
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // I2.r
    public final boolean j() {
        return this.f829l;
    }

    @Override // I2.r
    public final boolean l() {
        return this.f831n;
    }

    @Override // I2.r
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new i(this, 0));
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: I2.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = l.this;
                lVar.f830m = true;
                lVar.f832o = System.currentTimeMillis();
                lVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f862a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!m3.l.E(editText) && this.p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = X.f1226a;
            this.f865d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // I2.r
    public final void n(P.k kVar) {
        if (!m3.l.E(this.h)) {
            kVar.h(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f1341a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // I2.r
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || m3.l.E(this.h)) {
            return;
        }
        boolean z3 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f831n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z3) {
            u();
            this.f830m = true;
            this.f832o = System.currentTimeMillis();
        }
    }

    @Override // I2.r
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        TimeInterpolator timeInterpolator = this.f826g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f825f);
        ofFloat.addUpdateListener(new h(this));
        this.f834r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f824e);
        ofFloat2.addUpdateListener(new h(this));
        this.f833q = ofFloat2;
        ofFloat2.addListener(new B0.q(this, 3));
        this.p = (AccessibilityManager) this.f864c.getSystemService("accessibility");
    }

    @Override // I2.r
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z3) {
        if (this.f831n != z3) {
            this.f831n = z3;
            this.f834r.cancel();
            this.f833q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f832o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f830m = false;
        }
        if (this.f830m) {
            this.f830m = false;
            return;
        }
        t(!this.f831n);
        if (!this.f831n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
