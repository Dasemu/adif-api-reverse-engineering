package I2;

import O.X;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class A implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f796c;

    public A(TextInputLayout textInputLayout, EditText editText) {
        this.f796c = textInputLayout;
        this.f795b = editText;
        this.f794a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f796c;
        textInputLayout.u(!textInputLayout.A0, false);
        if (textInputLayout.f5851k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f5866s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f795b;
        int lineCount = editText.getLineCount();
        int i = this.f794a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = X.f1226a;
                int minimumHeight = editText.getMinimumHeight();
                int i4 = textInputLayout.f5869t0;
                if (minimumHeight != i4) {
                    editText.setMinimumHeight(i4);
                }
            }
            this.f794a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i5) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i5) {
    }
}
