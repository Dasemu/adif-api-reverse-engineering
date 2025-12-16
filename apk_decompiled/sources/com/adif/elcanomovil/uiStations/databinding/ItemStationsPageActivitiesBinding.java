package com.adif.elcanomovil.uiStations.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.adif.elcanomovil.uiStations.R;

/* loaded from: classes2.dex */
public final class ItemStationsPageActivitiesBinding {
    public final TextView arrowLink;
    public final TextView date;
    public final TextView description;
    public final Guideline guideline;
    public final ConstraintLayout layout;
    public final LinearLayoutCompat linearLayoutCompat;
    public final TextView name;
    private final ConstraintLayout rootView;
    public final AppCompatImageView serviceIcon;

    private ItemStationsPageActivitiesBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, Guideline guideline, ConstraintLayout constraintLayout2, LinearLayoutCompat linearLayoutCompat, TextView textView4, AppCompatImageView appCompatImageView) {
        this.rootView = constraintLayout;
        this.arrowLink = textView;
        this.date = textView2;
        this.description = textView3;
        this.guideline = guideline;
        this.layout = constraintLayout2;
        this.linearLayoutCompat = linearLayoutCompat;
        this.name = textView4;
        this.serviceIcon = appCompatImageView;
    }

    public static ItemStationsPageActivitiesBinding bind(View view) {
        int i = R.id.arrow_link;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            i = R.id.date;
            TextView textView2 = (TextView) AbstractC0105a.t(view, i);
            if (textView2 != null) {
                i = R.id.description;
                TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                if (textView3 != null) {
                    i = R.id.guideline;
                    Guideline guideline = (Guideline) AbstractC0105a.t(view, i);
                    if (guideline != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = R.id.linearLayoutCompat;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) AbstractC0105a.t(view, i);
                        if (linearLayoutCompat != null) {
                            i = R.id.name;
                            TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                            if (textView4 != null) {
                                i = R.id.service_icon;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC0105a.t(view, i);
                                if (appCompatImageView != null) {
                                    return new ItemStationsPageActivitiesBinding(constraintLayout, textView, textView2, textView3, guideline, constraintLayout, linearLayoutCompat, textView4, appCompatImageView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemStationsPageActivitiesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemStationsPageActivitiesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_stations_page_activities, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
