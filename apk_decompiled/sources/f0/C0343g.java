package f0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import m3.l;

/* renamed from: f0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343g extends l {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f6457a;

    /* renamed from: b, reason: collision with root package name */
    public final C0341e f6458b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6459c = true;

    public C0343g(TextView textView) {
        this.f6457a = textView;
        this.f6458b = new C0341e(textView);
    }

    @Override // m3.l
    public final boolean F() {
        return this.f6459c;
    }

    @Override // m3.l
    public final void W(boolean z3) {
        if (z3) {
            TextView textView = this.f6457a;
            textView.setTransformationMethod(e0(textView.getTransformationMethod()));
        }
    }

    @Override // m3.l
    public final void X(boolean z3) {
        this.f6459c = z3;
        TextView textView = this.f6457a;
        textView.setTransformationMethod(e0(textView.getTransformationMethod()));
        textView.setFilters(u(textView.getFilters()));
    }

    @Override // m3.l
    public final TransformationMethod e0(TransformationMethod transformationMethod) {
        return this.f6459c ? ((transformationMethod instanceof k) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new k(transformationMethod) : transformationMethod instanceof k ? ((k) transformationMethod).f6466a : transformationMethod;
    }

    @Override // m3.l
    public final InputFilter[] u(InputFilter[] inputFilterArr) {
        if (!this.f6459c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C0341e) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                if (sparseArray.indexOfKey(i5) < 0) {
                    inputFilterArr2[i4] = inputFilterArr[i5];
                    i4++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i6 = 0;
        while (true) {
            C0341e c0341e = this.f6458b;
            if (i6 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0341e;
                return inputFilterArr3;
            }
            if (inputFilterArr[i6] == c0341e) {
                return inputFilterArr;
            }
            i6++;
        }
    }
}
