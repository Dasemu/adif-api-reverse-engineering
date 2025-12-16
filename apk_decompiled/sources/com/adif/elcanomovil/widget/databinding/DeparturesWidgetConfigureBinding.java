package com.adif.elcanomovil.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.adif.elcanomovil.widget.R;

/* loaded from: classes3.dex */
public final class DeparturesWidgetConfigureBinding {
    public final FragmentContainerView navHostWidgetFragment;
    private final FragmentContainerView rootView;

    private DeparturesWidgetConfigureBinding(FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2) {
        this.rootView = fragmentContainerView;
        this.navHostWidgetFragment = fragmentContainerView2;
    }

    public static DeparturesWidgetConfigureBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new DeparturesWidgetConfigureBinding(fragmentContainerView, fragmentContainerView);
    }

    public static DeparturesWidgetConfigureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DeparturesWidgetConfigureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.departures_widget_configure, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FragmentContainerView getRoot() {
        return this.rootView;
    }
}
