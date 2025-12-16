package com.adif.elcanomovil.uiHome.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.adif.elcanomovil.uiHome.R;

/* loaded from: classes2.dex */
public final class ViewHomeMapBinding {
    public final ConstraintLayout layoutHomeMap;
    public final FragmentContainerView map;
    private final ConstraintLayout rootView;

    private ViewHomeMapBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FragmentContainerView fragmentContainerView) {
        this.rootView = constraintLayout;
        this.layoutHomeMap = constraintLayout2;
        this.map = fragmentContainerView;
    }

    public static ViewHomeMapBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.map;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) AbstractC0105a.t(view, i);
        if (fragmentContainerView != null) {
            return new ViewHomeMapBinding(constraintLayout, constraintLayout, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewHomeMapBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewHomeMapBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.view_home_map, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
