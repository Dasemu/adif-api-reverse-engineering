package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.measurement.internal.a;

/* loaded from: classes3.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i, int i4, int i5, int i6) {
        if (i == 0) {
            return i4;
        }
        if (i == 1) {
            return i5;
        }
        if (i == 2) {
            return i6;
        }
        throw new IllegalStateException(a.l(i, "Unknown color scheme: "));
    }

    public final void zaa(Resources resources, int i, int i4) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i5 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i5);
        setMinWidth(i5);
        int i6 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark;
        int i7 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light;
        int zab = zab(i4, i6, i7, i7);
        int i8 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark;
        int i9 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light;
        int zab2 = zab(i4, i8, i9, i9);
        if (i == 0 || i == 1) {
            zab = zab2;
        } else if (i != 2) {
            throw new IllegalStateException(a.l(i, "Unknown button size: "));
        }
        Drawable drawable = resources.getDrawable(zab);
        H.a.h(drawable, resources.getColorStateList(com.google.android.gms.base.R.color.common_google_signin_btn_tint));
        H.a.i(drawable, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawable);
        int i10 = com.google.android.gms.base.R.color.common_google_signin_btn_text_dark;
        int i11 = com.google.android.gms.base.R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i4, i10, i11, i11))));
        if (i == 0) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text_long));
        } else {
            if (i != 2) {
                throw new IllegalStateException(a.l(i, "Unknown button size: "));
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
