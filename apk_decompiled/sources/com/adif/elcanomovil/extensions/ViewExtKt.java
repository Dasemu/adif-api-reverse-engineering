package com.adif.elcanomovil.extensions;

import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0007\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0007¨\u0006\t"}, d2 = {"addLeftDrawable", "", "Landroid/widget/TextView;", "drawable", "", "clearDrawables", "setLeftIcon", "Lcom/google/android/material/button/MaterialButton;", "setRightIcon", "common-resources_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewExtKt {
    public static final void addLeftDrawable(TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
    }

    public static final void clearDrawables(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    public static final void setLeftIcon(MaterialButton materialButton) {
        Intrinsics.checkNotNullParameter(materialButton, "<this>");
        materialButton.setCompoundDrawablesRelative(materialButton.getIcon(), null, null, null);
    }

    public static final void setRightIcon(MaterialButton materialButton) {
        Intrinsics.checkNotNullParameter(materialButton, "<this>");
        materialButton.setCompoundDrawablesRelative(null, null, materialButton.getIcon(), null);
    }
}
