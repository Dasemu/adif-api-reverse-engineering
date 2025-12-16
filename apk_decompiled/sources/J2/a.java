package J2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.adif.elcanomovil.R;
import h2.AbstractC0379a;
import m.W;
import m3.l;

/* loaded from: classes3.dex */
public final class a extends W {
    public static int h(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i4 = 0; i4 < iArr.length && i < 0; i4++) {
            int i5 = iArr[i4];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i5, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            } else {
                i = typedArray.getDimensionPixelSize(i5, -1);
            }
        }
        return i;
    }

    @Override // m.W, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (l.U(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, AbstractC0379a.f6770s);
            int h = h(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h >= 0) {
                setLineHeight(h);
            }
        }
    }
}
