package com.adif.elcanomovil.widget.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.adif.elcanomovil.commonViews.databinding.LoadingEmptyOrErrorCommonViewBinding;
import com.adif.elcanomovil.uiDepartures.views.StationHeaderView;
import com.adif.elcanomovil.widget.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes3.dex */
public final class WidgetConfigurationFragmentBinding {
    public final MaterialButton creationWidgetButton;
    public final LoadingEmptyOrErrorCommonViewBinding empty;
    private final RelativeLayout rootView;
    public final StationHeaderView stationHeader;
    public final Toolbar toolbar;

    private WidgetConfigurationFragmentBinding(RelativeLayout relativeLayout, MaterialButton materialButton, LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding, StationHeaderView stationHeaderView, Toolbar toolbar) {
        this.rootView = relativeLayout;
        this.creationWidgetButton = materialButton;
        this.empty = loadingEmptyOrErrorCommonViewBinding;
        this.stationHeader = stationHeaderView;
        this.toolbar = toolbar;
    }

    public static WidgetConfigurationFragmentBinding bind(View view) {
        View t2;
        int i = R.id.creationWidgetButton;
        MaterialButton materialButton = (MaterialButton) AbstractC0105a.t(view, i);
        if (materialButton != null && (t2 = AbstractC0105a.t(view, (i = R.id.empty))) != null) {
            LoadingEmptyOrErrorCommonViewBinding bind = LoadingEmptyOrErrorCommonViewBinding.bind(t2);
            i = R.id.station_header;
            StationHeaderView stationHeaderView = (StationHeaderView) AbstractC0105a.t(view, i);
            if (stationHeaderView != null) {
                i = R.id.toolbar;
                Toolbar toolbar = (Toolbar) AbstractC0105a.t(view, i);
                if (toolbar != null) {
                    return new WidgetConfigurationFragmentBinding((RelativeLayout) view, materialButton, bind, stationHeaderView, toolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static WidgetConfigurationFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WidgetConfigurationFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.widget_configuration_fragment, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
