package m;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import f.AbstractC0336a;

/* renamed from: m.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0491v {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f7749a;

    /* renamed from: b, reason: collision with root package name */
    public final A.a f7750b;

    public C0491v(TextView textView) {
        this.f7749a = textView;
        this.f7750b = new A.a(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((m3.l) this.f7750b.f7b).u(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f7749a.getContext().obtainStyledAttributes(attributeSet, AbstractC0336a.i, i, 0);
        try {
            boolean z3 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            d(z3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z3) {
        ((m3.l) this.f7750b.f7b).W(z3);
    }

    public final void d(boolean z3) {
        ((m3.l) this.f7750b.f7b).X(z3);
    }
}
