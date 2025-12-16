package com.adif.elcanomovil.uiAvisa.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.uiAvisa.R;

/* loaded from: classes.dex */
public final class ItemStationsListBinding {
    private final ConstraintLayout rootView;
    public final ImageView stationOptionIcon;
    public final TextView stationOptionTitle;

    private ItemStationsListBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.stationOptionIcon = imageView;
        this.stationOptionTitle = textView;
    }

    public static ItemStationsListBinding bind(View view) {
        int i = R.id.stationOptionIcon;
        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
        if (imageView != null) {
            i = R.id.stationOptionTitle;
            TextView textView = (TextView) AbstractC0105a.t(view, i);
            if (textView != null) {
                return new ItemStationsListBinding((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemStationsListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemStationsListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_stations_list, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
