package com.google.android.material.datepicker;

import a.AbstractC0105a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.adif.elcanomovil.R;
import h2.AbstractC0379a;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final E2.e f5641a;

    /* renamed from: b, reason: collision with root package name */
    public final E2.e f5642b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(m3.l.V(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, AbstractC0379a.f6766n);
        E2.e.g(context, obtainStyledAttributes.getResourceId(4, 0));
        E2.e.g(context, obtainStyledAttributes.getResourceId(2, 0));
        E2.e.g(context, obtainStyledAttributes.getResourceId(3, 0));
        E2.e.g(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList w3 = AbstractC0105a.w(context, obtainStyledAttributes, 7);
        this.f5641a = E2.e.g(context, obtainStyledAttributes.getResourceId(9, 0));
        E2.e.g(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f5642b = E2.e.g(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(w3.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
