package com.adif.elcanomovil.uiDepartures.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.adif.elcanomovil.commonViews.StationOptionView;
import com.adif.elcanomovil.uiDepartures.R;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class FragmentDeparturesBinding {
    public final ViewPager2 pager;
    private final ConstraintLayout rootView;
    public final View separator;
    public final StationOptionView stationComercial;
    public final StationOptionView stationInfo;
    public final LinearLayout stationOptions;
    public final TabLayout tabLayout;

    private FragmentDeparturesBinding(ConstraintLayout constraintLayout, ViewPager2 viewPager2, View view, StationOptionView stationOptionView, StationOptionView stationOptionView2, LinearLayout linearLayout, TabLayout tabLayout) {
        this.rootView = constraintLayout;
        this.pager = viewPager2;
        this.separator = view;
        this.stationComercial = stationOptionView;
        this.stationInfo = stationOptionView2;
        this.stationOptions = linearLayout;
        this.tabLayout = tabLayout;
    }

    public static FragmentDeparturesBinding bind(View view) {
        int i = R.id.pager;
        ViewPager2 viewPager2 = (ViewPager2) AbstractC0105a.t(view, i);
        if (viewPager2 != null) {
            View t2 = AbstractC0105a.t(view, R.id.separator);
            StationOptionView stationOptionView = (StationOptionView) AbstractC0105a.t(view, R.id.station_comercial);
            StationOptionView stationOptionView2 = (StationOptionView) AbstractC0105a.t(view, R.id.station_info);
            LinearLayout linearLayout = (LinearLayout) AbstractC0105a.t(view, R.id.station_options);
            i = R.id.tab_layout;
            TabLayout tabLayout = (TabLayout) AbstractC0105a.t(view, i);
            if (tabLayout != null) {
                return new FragmentDeparturesBinding((ConstraintLayout) view, viewPager2, t2, stationOptionView, stationOptionView2, linearLayout, tabLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentDeparturesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDeparturesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_departures, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
