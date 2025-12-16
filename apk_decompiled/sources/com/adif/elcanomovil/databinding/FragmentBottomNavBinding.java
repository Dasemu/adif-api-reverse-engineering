package com.adif.elcanomovil.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import com.adif.elcanomovil.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* loaded from: classes.dex */
public final class FragmentBottomNavBinding {
    public final FragmentContainerView bottomNavHostFragment;
    public final LinearLayout bottomNavRoot;
    public final BottomNavigationView bottomNavigationView;
    private final LinearLayout rootView;

    private FragmentBottomNavBinding(LinearLayout linearLayout, FragmentContainerView fragmentContainerView, LinearLayout linearLayout2, BottomNavigationView bottomNavigationView) {
        this.rootView = linearLayout;
        this.bottomNavHostFragment = fragmentContainerView;
        this.bottomNavRoot = linearLayout2;
        this.bottomNavigationView = bottomNavigationView;
    }

    public static FragmentBottomNavBinding bind(View view) {
        int i = R.id.bottom_nav_host_fragment;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) AbstractC0105a.t(view, R.id.bottom_nav_host_fragment);
        if (fragmentContainerView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            BottomNavigationView bottomNavigationView = (BottomNavigationView) AbstractC0105a.t(view, R.id.bottom_navigation_view);
            if (bottomNavigationView != null) {
                return new FragmentBottomNavBinding(linearLayout, fragmentContainerView, linearLayout, bottomNavigationView);
            }
            i = R.id.bottom_navigation_view;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentBottomNavBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBottomNavBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_bottom_nav, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
