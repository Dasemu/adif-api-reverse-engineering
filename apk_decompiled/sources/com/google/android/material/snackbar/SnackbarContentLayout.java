package com.google.android.material.snackbar;

import O.X;
import a.AbstractC0106b;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.adif.elcanomovil.R;
import i2.AbstractC0396a;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f5754a;

    /* renamed from: b, reason: collision with root package name */
    public Button f5755b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f5756c;

    /* renamed from: d, reason: collision with root package name */
    public int f5757d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5756c = AbstractC0106b.F(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0396a.f6816b);
    }

    public final boolean a(int i, int i4, int i5) {
        boolean z3;
        if (i != getOrientation()) {
            setOrientation(i);
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f5754a.getPaddingTop() == i4 && this.f5754a.getPaddingBottom() == i5) {
            return z3;
        }
        TextView textView = this.f5754a;
        WeakHashMap weakHashMap = X.f1226a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i4, textView.getPaddingEnd(), i5);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i4, textView.getPaddingRight(), i5);
        return true;
    }

    public Button getActionView() {
        return this.f5755b;
    }

    public TextView getMessageView() {
        return this.f5754a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f5754a = (TextView) findViewById(R.id.snackbar_text);
        this.f5755b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f5754a.getLayout();
        boolean z3 = layout != null && layout.getLineCount() > 1;
        if (!z3 || this.f5757d <= 0 || this.f5755b.getMeasuredWidth() <= this.f5757d) {
            if (!z3) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i4);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f5757d = i;
    }
}
