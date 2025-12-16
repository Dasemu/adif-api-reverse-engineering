package I2;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f862a;

    /* renamed from: b, reason: collision with root package name */
    public final q f863b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f864c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f865d;

    public r(q qVar) {
        this.f862a = qVar.f843a;
        this.f863b = qVar;
        this.f864c = qVar.getContext();
        this.f865d = qVar.f849g;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public k h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof l;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(P.k kVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z3) {
    }

    public final void q() {
        this.f863b.f(false);
    }

    public void r() {
    }

    public void s() {
    }
}
