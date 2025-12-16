package com.google.android.material.theme;

import I2.x;
import K2.a;
import U.b;
import a.AbstractC0105a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.adif.elcanomovil.R;
import com.google.android.material.button.MaterialButton;
import g.J;
import h2.AbstractC0379a;
import m.C0442A;
import m.C0480p;
import m.C0482q;
import m.W;
import m3.l;
import r2.c;
import x2.m;

/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends J {
    @Override // g.J
    public final C0480p a(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    @Override // g.J
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.J
    public final C0482q c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [m.A, android.widget.CompoundButton, android.view.View, A2.a] */
    @Override // g.J
    public final C0442A d(Context context, AttributeSet attributeSet) {
        ?? c0442a = new C0442A(a.a(context, attributeSet, R.attr.radioButtonStyle, 2132018311), attributeSet);
        Context context2 = c0442a.getContext();
        TypedArray h = m.h(context2, attributeSet, AbstractC0379a.f6768q, R.attr.radioButtonStyle, 2132018311, new int[0]);
        if (h.hasValue(0)) {
            b.c(c0442a, AbstractC0105a.w(context2, h, 0));
        }
        c0442a.f80f = h.getBoolean(1, false);
        h.recycle();
        return c0442a;
    }

    @Override // g.J
    public final W e(Context context, AttributeSet attributeSet) {
        W w3 = new W(a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = w3.getContext();
        if (l.U(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0379a.f6771t;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int h = J2.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0379a.f6770s);
                    int h4 = J2.a.h(w3.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (h4 >= 0) {
                        w3.setLineHeight(h4);
                    }
                }
            }
        }
        return w3;
    }
}
