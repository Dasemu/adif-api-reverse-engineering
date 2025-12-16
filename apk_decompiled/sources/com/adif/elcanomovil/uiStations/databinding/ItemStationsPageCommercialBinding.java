package com.adif.elcanomovil.uiStations.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.uiStations.R;

/* loaded from: classes2.dex */
public final class ItemStationsPageCommercialBinding {
    public final ConstraintLayout layout;
    public final LinearLayoutCompat linearLayoutCompat;
    public final TextView name;
    public final AppCompatImageView offerIcon;
    private final ConstraintLayout rootView;
    public final AppCompatImageView serviceIcon;
    public final TextView type;

    private ItemStationsPageCommercialBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayoutCompat linearLayoutCompat, TextView textView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TextView textView2) {
        this.rootView = constraintLayout;
        this.layout = constraintLayout2;
        this.linearLayoutCompat = linearLayoutCompat;
        this.name = textView;
        this.offerIcon = appCompatImageView;
        this.serviceIcon = appCompatImageView2;
        this.type = textView2;
    }

    public static ItemStationsPageCommercialBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) AbstractC0105a.t(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.name;
            TextView textView = (TextView) AbstractC0105a.t(view, i);
            if (textView != null) {
                i = R.id.offer_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC0105a.t(view, i);
                if (appCompatImageView != null) {
                    i = R.id.service_icon;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) AbstractC0105a.t(view, i);
                    if (appCompatImageView2 != null) {
                        i = R.id.type;
                        TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                        if (textView2 != null) {
                            return new ItemStationsPageCommercialBinding(constraintLayout, constraintLayout, linearLayoutCompat, textView, appCompatImageView, appCompatImageView2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemStationsPageCommercialBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemStationsPageCommercialBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_stations_page_commercial, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
