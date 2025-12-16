package com.adif.elcanomovil.uiAvisa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.adif.elcanomovil.uiAvisa.R;

/* loaded from: classes.dex */
public final class FragmentStationsMapBinding {
    private final LinearLayout rootView;

    private FragmentStationsMapBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static FragmentStationsMapBinding bind(View view) {
        if (view != null) {
            return new FragmentStationsMapBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static FragmentStationsMapBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentStationsMapBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stations_map, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
