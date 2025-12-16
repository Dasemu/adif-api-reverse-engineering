package f0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: classes.dex */
public final class k implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f6466a;

    public k(TransformationMethod transformationMethod) {
        this.f6466a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f6466a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || d0.h.a().b() != 1) {
            return charSequence;
        }
        d0.h a2 = d0.h.a();
        a2.getClass();
        return a2.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z3, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f6466a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z3, i, rect);
        }
    }
}
