package com.adif.elcanomovil.uiDepartures.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.commonViews.EmptyCirculationsView;
import com.adif.elcanomovil.uiDepartures.R;
import com.adif.elcanomovil.uiDepartures.views.OneWayCirculationHeaderView;
import com.adif.elcanomovil.uiDepartures.views.StationHeaderView;

/* loaded from: classes2.dex */
public final class FragmentCirculationBinding {
    public final OneWayCirculationHeaderView circulationHeader;
    public final RecyclerView circulations;
    public final FrameLayout circulationsContainer;
    public final EmptyCirculationsView empty;
    public final TextView loadingMore;
    public final EmptyCirculationsView loadingView;
    private final LinearLayout rootView;
    public final NestedScrollView scrollable;
    public final StationHeaderView stationHeader;

    private FragmentCirculationBinding(LinearLayout linearLayout, OneWayCirculationHeaderView oneWayCirculationHeaderView, RecyclerView recyclerView, FrameLayout frameLayout, EmptyCirculationsView emptyCirculationsView, TextView textView, EmptyCirculationsView emptyCirculationsView2, NestedScrollView nestedScrollView, StationHeaderView stationHeaderView) {
        this.rootView = linearLayout;
        this.circulationHeader = oneWayCirculationHeaderView;
        this.circulations = recyclerView;
        this.circulationsContainer = frameLayout;
        this.empty = emptyCirculationsView;
        this.loadingMore = textView;
        this.loadingView = emptyCirculationsView2;
        this.scrollable = nestedScrollView;
        this.stationHeader = stationHeaderView;
    }

    public static FragmentCirculationBinding bind(View view) {
        int i = R.id.circulation_header;
        OneWayCirculationHeaderView oneWayCirculationHeaderView = (OneWayCirculationHeaderView) AbstractC0105a.t(view, i);
        if (oneWayCirculationHeaderView != null) {
            i = R.id.circulations;
            RecyclerView recyclerView = (RecyclerView) AbstractC0105a.t(view, i);
            if (recyclerView != null) {
                i = R.id.circulationsContainer;
                FrameLayout frameLayout = (FrameLayout) AbstractC0105a.t(view, i);
                if (frameLayout != null) {
                    i = R.id.empty;
                    EmptyCirculationsView emptyCirculationsView = (EmptyCirculationsView) AbstractC0105a.t(view, i);
                    if (emptyCirculationsView != null) {
                        i = R.id.loadingMore;
                        TextView textView = (TextView) AbstractC0105a.t(view, i);
                        if (textView != null) {
                            i = R.id.loadingView;
                            EmptyCirculationsView emptyCirculationsView2 = (EmptyCirculationsView) AbstractC0105a.t(view, i);
                            if (emptyCirculationsView2 != null) {
                                i = R.id.scrollable;
                                NestedScrollView nestedScrollView = (NestedScrollView) AbstractC0105a.t(view, i);
                                if (nestedScrollView != null) {
                                    i = R.id.station_header;
                                    StationHeaderView stationHeaderView = (StationHeaderView) AbstractC0105a.t(view, i);
                                    if (stationHeaderView != null) {
                                        return new FragmentCirculationBinding((LinearLayout) view, oneWayCirculationHeaderView, recyclerView, frameLayout, emptyCirculationsView, textView, emptyCirculationsView2, nestedScrollView, stationHeaderView);
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

    public static FragmentCirculationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCirculationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_circulation, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
