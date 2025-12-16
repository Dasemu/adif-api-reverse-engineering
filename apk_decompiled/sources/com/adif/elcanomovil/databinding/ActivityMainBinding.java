package com.adif.elcanomovil.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.adif.elcanomovil.R;

/* loaded from: classes.dex */
public final class ActivityMainBinding {
    public final FragmentContainerView navHostFragment;
    private final FragmentContainerView rootView;

    private ActivityMainBinding(FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2) {
        this.rootView = fragmentContainerView;
        this.navHostFragment = fragmentContainerView2;
    }

    public static ActivityMainBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new ActivityMainBinding(fragmentContainerView, fragmentContainerView);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FragmentContainerView getRoot() {
        return this.rootView;
    }
}
