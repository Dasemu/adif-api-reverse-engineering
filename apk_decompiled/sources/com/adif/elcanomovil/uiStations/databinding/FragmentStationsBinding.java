package com.adif.elcanomovil.uiStations.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.adif.elcanomovil.uiStations.R;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class FragmentStationsBinding {
    public final ViewPager2 pager;
    private final ConstraintLayout rootView;
    public final ImageView search;
    public final View separator;
    public final TextView stationsStationName;
    public final TabLayout tabLayout;

    private FragmentStationsBinding(ConstraintLayout constraintLayout, ViewPager2 viewPager2, ImageView imageView, View view, TextView textView, TabLayout tabLayout) {
        this.rootView = constraintLayout;
        this.pager = viewPager2;
        this.search = imageView;
        this.separator = view;
        this.stationsStationName = textView;
        this.tabLayout = tabLayout;
    }

    public static FragmentStationsBinding bind(View view) {
        View t2;
        int i = R.id.pager;
        ViewPager2 viewPager2 = (ViewPager2) AbstractC0105a.t(view, i);
        if (viewPager2 != null) {
            i = R.id.search;
            ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
            if (imageView != null && (t2 = AbstractC0105a.t(view, (i = R.id.separator))) != null) {
                i = R.id.stations_station_name;
                TextView textView = (TextView) AbstractC0105a.t(view, i);
                if (textView != null) {
                    i = R.id.tab_layout;
                    TabLayout tabLayout = (TabLayout) AbstractC0105a.t(view, i);
                    if (tabLayout != null) {
                        return new FragmentStationsBinding((ConstraintLayout) view, viewPager2, imageView, t2, textView, tabLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentStationsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentStationsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stations, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
