package com.adif.elcanomovil.commonViews.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.adif.elcanomovil.commonViews.R;

/* loaded from: classes.dex */
public final class ItemCirculationDateBinding {
    private final TextView rootView;
    public final TextView widgetHeaderDate;

    private ItemCirculationDateBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.widgetHeaderDate = textView2;
    }

    public static ItemCirculationDateBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new ItemCirculationDateBinding(textView, textView);
    }

    public static ItemCirculationDateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemCirculationDateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_circulation_date, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}
