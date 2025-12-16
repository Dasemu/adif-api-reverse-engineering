package com.adif.elcanomovil.uiHome.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.adif.elcanomovil.uiHome.R;
import com.adif.elcanomovil.uiHome.views.HomeMapView;

/* loaded from: classes2.dex */
public final class FragmentHomeBinding {
    public final FrameLayout frameFakeTab;
    public final FakeTabViewBinding frameFakeTabInclude;
    public final ViewHomeDetailBinding layoutHomeDetail;
    public final HomeMapView layoutHomeMap;
    private final CoordinatorLayout rootView;

    private FragmentHomeBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, FakeTabViewBinding fakeTabViewBinding, ViewHomeDetailBinding viewHomeDetailBinding, HomeMapView homeMapView) {
        this.rootView = coordinatorLayout;
        this.frameFakeTab = frameLayout;
        this.frameFakeTabInclude = fakeTabViewBinding;
        this.layoutHomeDetail = viewHomeDetailBinding;
        this.layoutHomeMap = homeMapView;
    }

    public static FragmentHomeBinding bind(View view) {
        View t2;
        int i = R.id.frameFakeTab;
        FrameLayout frameLayout = (FrameLayout) AbstractC0105a.t(view, i);
        if (frameLayout != null && (t2 = AbstractC0105a.t(view, (i = R.id.frameFakeTabInclude))) != null) {
            FakeTabViewBinding bind = FakeTabViewBinding.bind(t2);
            i = R.id.layoutHomeDetail;
            View t4 = AbstractC0105a.t(view, i);
            if (t4 != null) {
                ViewHomeDetailBinding bind2 = ViewHomeDetailBinding.bind(t4);
                i = R.id.layoutHomeMap;
                HomeMapView homeMapView = (HomeMapView) AbstractC0105a.t(view, i);
                if (homeMapView != null) {
                    return new FragmentHomeBinding((CoordinatorLayout) view, frameLayout, bind, bind2, homeMapView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentHomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}
