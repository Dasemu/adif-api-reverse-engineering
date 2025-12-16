package f0;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import m3.l;

/* renamed from: f0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344h extends l {

    /* renamed from: a, reason: collision with root package name */
    public final C0343g f6460a;

    public C0344h(TextView textView) {
        this.f6460a = new C0343g(textView);
    }

    @Override // m3.l
    public final boolean F() {
        return this.f6460a.f6459c;
    }

    @Override // m3.l
    public final void W(boolean z3) {
        if (d0.h.f6123k != null) {
            this.f6460a.W(z3);
        }
    }

    @Override // m3.l
    public final void X(boolean z3) {
        boolean z4 = d0.h.f6123k != null;
        C0343g c0343g = this.f6460a;
        if (z4) {
            c0343g.X(z3);
        } else {
            c0343g.f6459c = z3;
        }
    }

    @Override // m3.l
    public final TransformationMethod e0(TransformationMethod transformationMethod) {
        return !(d0.h.f6123k != null) ? transformationMethod : this.f6460a.e0(transformationMethod);
    }

    @Override // m3.l
    public final InputFilter[] u(InputFilter[] inputFilterArr) {
        return !(d0.h.f6123k != null) ? inputFilterArr : this.f6460a.u(inputFilterArr);
    }
}
