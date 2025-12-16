package com.adif.elcanomovil.uiHome.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.StationOptionView;
import com.adif.elcanomovil.uiHome.R;

/* loaded from: classes2.dex */
public final class ViewStationNearBinding {
    public final TextView nearStationInfo;
    public final TextView nearStationSubtitle;
    public final TextView nearStationTitle;
    public final TextView permissionStatusTextView;
    private final ConstraintLayout rootView;
    public final StationOptionView stationInfoArrivals;
    public final StationOptionView stationInfoComercial;
    public final StationOptionView stationInfoDepartures;
    public final StationOptionView stationInfoDetails;
    public final ProgressBar stationOptionsLoading;

    private ViewStationNearBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, StationOptionView stationOptionView, StationOptionView stationOptionView2, StationOptionView stationOptionView3, StationOptionView stationOptionView4, ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.nearStationInfo = textView;
        this.nearStationSubtitle = textView2;
        this.nearStationTitle = textView3;
        this.permissionStatusTextView = textView4;
        this.stationInfoArrivals = stationOptionView;
        this.stationInfoComercial = stationOptionView2;
        this.stationInfoDepartures = stationOptionView3;
        this.stationInfoDetails = stationOptionView4;
        this.stationOptionsLoading = progressBar;
    }

    public static ViewStationNearBinding bind(View view) {
        int i = R.id.nearStationInfo;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            i = R.id.nearStationSubtitle;
            TextView textView2 = (TextView) AbstractC0105a.t(view, i);
            if (textView2 != null) {
                i = R.id.nearStationTitle;
                TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                if (textView3 != null) {
                    i = R.id.permissionStatusTextView;
                    TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                    if (textView4 != null) {
                        i = R.id.stationInfoArrivals;
                        StationOptionView stationOptionView = (StationOptionView) AbstractC0105a.t(view, i);
                        if (stationOptionView != null) {
                            i = R.id.stationInfoComercial;
                            StationOptionView stationOptionView2 = (StationOptionView) AbstractC0105a.t(view, i);
                            if (stationOptionView2 != null) {
                                i = R.id.stationInfoDepartures;
                                StationOptionView stationOptionView3 = (StationOptionView) AbstractC0105a.t(view, i);
                                if (stationOptionView3 != null) {
                                    i = R.id.stationInfoDetails;
                                    StationOptionView stationOptionView4 = (StationOptionView) AbstractC0105a.t(view, i);
                                    if (stationOptionView4 != null) {
                                        i = R.id.stationOptionsLoading;
                                        ProgressBar progressBar = (ProgressBar) AbstractC0105a.t(view, i);
                                        if (progressBar != null) {
                                            return new ViewStationNearBinding((ConstraintLayout) view, textView, textView2, textView3, textView4, stationOptionView, stationOptionView2, stationOptionView3, stationOptionView4, progressBar);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewStationNearBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewStationNearBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.view_station_near, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
