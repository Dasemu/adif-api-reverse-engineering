package com.adif.elcanomovil.uiAvisa.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.adif.elcanomovil.uiAvisa.R;

/* loaded from: classes.dex */
public final class FragmentStationSelectorBinding {
    public final FrameLayout fragmentContainer;
    private final LinearLayout rootView;

    private FragmentStationSelectorBinding(LinearLayout linearLayout, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.fragmentContainer = frameLayout;
    }

    public static FragmentStationSelectorBinding bind(View view) {
        int i = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) AbstractC0105a.t(view, i);
        if (frameLayout != null) {
            return new FragmentStationSelectorBinding((LinearLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentStationSelectorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentStationSelectorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_station_selector, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
