package com.adif.elcanomovil.uiStations.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.uiStations.R;

/* loaded from: classes2.dex */
public final class ItemStationsPageCommercialOfferBinding {
    public final AppCompatImageView appCompatImageView;
    public final TextView description;
    public final AppCompatImageView icon;
    public final ConstraintLayout layout;
    private final ConstraintLayout rootView;

    private ItemStationsPageCommercialOfferBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.appCompatImageView = appCompatImageView;
        this.description = textView;
        this.icon = appCompatImageView2;
        this.layout = constraintLayout2;
    }

    public static ItemStationsPageCommercialOfferBinding bind(View view) {
        int i = R.id.appCompatImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC0105a.t(view, i);
        if (appCompatImageView != null) {
            i = R.id.description;
            TextView textView = (TextView) AbstractC0105a.t(view, i);
            if (textView != null) {
                i = R.id.icon;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) AbstractC0105a.t(view, i);
                if (appCompatImageView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new ItemStationsPageCommercialOfferBinding(constraintLayout, appCompatImageView, textView, appCompatImageView2, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemStationsPageCommercialOfferBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemStationsPageCommercialOfferBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_stations_page_commercial_offer, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
