package com.adif.elcanomovil.uiStations.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.commonViews.EmptyCirculationsView;
import com.adif.elcanomovil.uiStations.R;

/* loaded from: classes2.dex */
public final class FragmentStationsPageActivitiesBinding {
    public final EmptyCirculationsView loadingEmptyOrErrorCommonView;
    private final NestedScrollView rootView;
    public final RecyclerView rvActivities;
    public final LinearLayoutCompat viewNotEmptyStation;

    private FragmentStationsPageActivitiesBinding(NestedScrollView nestedScrollView, EmptyCirculationsView emptyCirculationsView, RecyclerView recyclerView, LinearLayoutCompat linearLayoutCompat) {
        this.rootView = nestedScrollView;
        this.loadingEmptyOrErrorCommonView = emptyCirculationsView;
        this.rvActivities = recyclerView;
        this.viewNotEmptyStation = linearLayoutCompat;
    }

    public static FragmentStationsPageActivitiesBinding bind(View view) {
        int i = R.id.loading_empty_or_error_common_view;
        EmptyCirculationsView emptyCirculationsView = (EmptyCirculationsView) AbstractC0105a.t(view, i);
        if (emptyCirculationsView != null) {
            i = R.id.rv_activities;
            RecyclerView recyclerView = (RecyclerView) AbstractC0105a.t(view, i);
            if (recyclerView != null) {
                i = R.id.view_not_empty_station;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) AbstractC0105a.t(view, i);
                if (linearLayoutCompat != null) {
                    return new FragmentStationsPageActivitiesBinding((NestedScrollView) view, emptyCirculationsView, recyclerView, linearLayoutCompat);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentStationsPageActivitiesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentStationsPageActivitiesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stations_page_activities, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
