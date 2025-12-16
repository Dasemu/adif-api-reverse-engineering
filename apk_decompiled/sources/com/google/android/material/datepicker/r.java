package com.google.android.material.datepicker;

import O.G;
import O.X;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.R;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class r extends I0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f5707a;

    /* renamed from: b, reason: collision with root package name */
    public final MaterialCalendarGridView f5708b;

    public r(LinearLayout linearLayout, boolean z3) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f5707a = textView;
        WeakHashMap weakHashMap = X.f1226a;
        new G(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.f5708b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z3) {
            return;
        }
        textView.setVisibility(8);
    }
}
