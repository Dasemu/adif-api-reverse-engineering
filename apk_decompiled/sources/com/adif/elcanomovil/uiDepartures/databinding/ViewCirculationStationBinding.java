package com.adif.elcanomovil.uiDepartures.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.adif.elcanomovil.uiDepartures.R;
import com.adif.elcanomovil.uiDepartures.views.TrainTypeSelector;

/* loaded from: classes2.dex */
public final class ViewCirculationStationBinding {
    public final ImageView adif;
    public final TextView circulationType;
    public final ImageView directionArrow;
    public final ImageView favourite;
    public final TextView filters;
    public final Guideline guideline20;
    public final ImageView indicator;
    public final ImageView observations;
    private final ConstraintLayout rootView;
    public final ImageView search;
    public final ImageView searchTo;
    public final View separator;
    public final ImageView share;
    public final TextView station;
    public final TextView stationTo;
    public final LinearLayout stations;
    public final ImageButton switchStations;
    public final TrainTypeSelector trainSelector;
    public final ImageView twitter;

    private ViewCirculationStationBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, ImageView imageView3, TextView textView2, Guideline guideline, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, View view, ImageView imageView8, TextView textView3, TextView textView4, LinearLayout linearLayout, ImageButton imageButton, TrainTypeSelector trainTypeSelector, ImageView imageView9) {
        this.rootView = constraintLayout;
        this.adif = imageView;
        this.circulationType = textView;
        this.directionArrow = imageView2;
        this.favourite = imageView3;
        this.filters = textView2;
        this.guideline20 = guideline;
        this.indicator = imageView4;
        this.observations = imageView5;
        this.search = imageView6;
        this.searchTo = imageView7;
        this.separator = view;
        this.share = imageView8;
        this.station = textView3;
        this.stationTo = textView4;
        this.stations = linearLayout;
        this.switchStations = imageButton;
        this.trainSelector = trainTypeSelector;
        this.twitter = imageView9;
    }

    public static ViewCirculationStationBinding bind(View view) {
        ImageView imageView = (ImageView) AbstractC0105a.t(view, R.id.adif);
        TextView textView = (TextView) AbstractC0105a.t(view, R.id.circulationType);
        ImageView imageView2 = (ImageView) AbstractC0105a.t(view, R.id.direction_arrow);
        ImageView imageView3 = (ImageView) AbstractC0105a.t(view, R.id.favourite);
        TextView textView2 = (TextView) AbstractC0105a.t(view, R.id.filters);
        Guideline guideline = (Guideline) AbstractC0105a.t(view, R.id.guideline20);
        ImageView imageView4 = (ImageView) AbstractC0105a.t(view, R.id.indicator);
        ImageView imageView5 = (ImageView) AbstractC0105a.t(view, R.id.observations);
        ImageView imageView6 = (ImageView) AbstractC0105a.t(view, R.id.search);
        ImageView imageView7 = (ImageView) AbstractC0105a.t(view, R.id.search_to);
        View t2 = AbstractC0105a.t(view, R.id.separator);
        ImageView imageView8 = (ImageView) AbstractC0105a.t(view, R.id.share);
        int i = R.id.station;
        TextView textView3 = (TextView) AbstractC0105a.t(view, i);
        if (textView3 != null) {
            i = R.id.station_to;
            TextView textView4 = (TextView) AbstractC0105a.t(view, i);
            if (textView4 != null) {
                return new ViewCirculationStationBinding((ConstraintLayout) view, imageView, textView, imageView2, imageView3, textView2, guideline, imageView4, imageView5, imageView6, imageView7, t2, imageView8, textView3, textView4, (LinearLayout) AbstractC0105a.t(view, R.id.stations), (ImageButton) AbstractC0105a.t(view, R.id.switch_stations), (TrainTypeSelector) AbstractC0105a.t(view, R.id.train_selector), (ImageView) AbstractC0105a.t(view, R.id.twitter));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewCirculationStationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewCirculationStationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.view_circulation_station, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
