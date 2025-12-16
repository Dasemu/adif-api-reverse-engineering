package I2;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.adif.elcanomovil.R;

/* loaded from: classes3.dex */
public final class y extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f908e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f909f;

    /* renamed from: g, reason: collision with root package name */
    public final D1.a f910g;

    public y(q qVar, int i) {
        super(qVar);
        this.f908e = R.drawable.design_password_eye;
        this.f910g = new D1.a(this, 5);
        if (i != 0) {
            this.f908e = i;
        }
    }

    @Override // I2.r
    public final void b() {
        q();
    }

    @Override // I2.r
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // I2.r
    public final int d() {
        return this.f908e;
    }

    @Override // I2.r
    public final View.OnClickListener f() {
        return this.f910g;
    }

    @Override // I2.r
    public final boolean k() {
        return true;
    }

    @Override // I2.r
    public final boolean l() {
        EditText editText = this.f909f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // I2.r
    public final void m(EditText editText) {
        this.f909f = editText;
        q();
    }

    @Override // I2.r
    public final void r() {
        EditText editText = this.f909f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f909f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // I2.r
    public final void s() {
        EditText editText = this.f909f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
