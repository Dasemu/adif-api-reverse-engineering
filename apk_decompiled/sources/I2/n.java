package I2;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f836a;

    public n(q qVar) {
        this.f836a = qVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        q qVar = this.f836a;
        if (qVar.f858s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = qVar.f858s;
        m mVar = qVar.f861v;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (qVar.f858s.getOnFocusChangeListener() == qVar.b().e()) {
                qVar.f858s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        qVar.f858s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        qVar.b().m(qVar.f858s);
        qVar.j(qVar.b());
    }
}
