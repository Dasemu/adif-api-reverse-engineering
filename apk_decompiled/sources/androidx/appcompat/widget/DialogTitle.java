package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import f.AbstractC0336a;
import m.W;

/* loaded from: classes.dex */
public class DialogTitle extends W {
    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // m.W, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i4) {
        int lineCount;
        super.onMeasure(i, i4);
        Layout layout = getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        setSingleLine(false);
        setMaxLines(2);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0336a.f6441w, R.attr.textAppearanceMedium, R.style.TextAppearance.Medium);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
        super.onMeasure(i, i4);
    }
}
