package com.adif.elcanomovil.uiStations.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.uiStations.R;

/* loaded from: classes2.dex */
public final class ExpandableItemStationsPageCommercialBinding {
    public final ImageView headerArrow;
    public final ConstraintLayout headerLayout;
    public final TextView headerText;
    private final LinearLayoutCompat rootView;
    public final RecyclerView rv;

    private ExpandableItemStationsPageCommercialBinding(LinearLayoutCompat linearLayoutCompat, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, RecyclerView recyclerView) {
        this.rootView = linearLayoutCompat;
        this.headerArrow = imageView;
        this.headerLayout = constraintLayout;
        this.headerText = textView;
        this.rv = recyclerView;
    }

    public static ExpandableItemStationsPageCommercialBinding bind(View view) {
        int i = R.id.header_arrow;
        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
        if (imageView != null) {
            i = R.id.header_layout;
            ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC0105a.t(view, i);
            if (constraintLayout != null) {
                i = R.id.header_text;
                TextView textView = (TextView) AbstractC0105a.t(view, i);
                if (textView != null) {
                    i = R.id.rv;
                    RecyclerView recyclerView = (RecyclerView) AbstractC0105a.t(view, i);
                    if (recyclerView != null) {
                        return new ExpandableItemStationsPageCommercialBinding((LinearLayoutCompat) view, imageView, constraintLayout, textView, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ExpandableItemStationsPageCommercialBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ExpandableItemStationsPageCommercialBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.expandable_item_stations_page_commercial, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
