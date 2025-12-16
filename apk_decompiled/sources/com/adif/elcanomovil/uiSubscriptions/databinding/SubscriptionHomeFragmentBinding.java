package com.adif.elcanomovil.uiSubscriptions.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.commonViews.HeaderView;
import com.adif.elcanomovil.commonViews.InfoView;
import com.adif.elcanomovil.uiSubscriptions.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class SubscriptionHomeFragmentBinding {
    public final InfoView emptyView;
    public final Button fab;
    public final HeaderView headerSubscriptionHome;
    private final ConstraintLayout rootView;
    public final ShimmerFrameLayout shimmerViewContainer;
    public final RecyclerView subscriptionRecyclerview;

    private SubscriptionHomeFragmentBinding(ConstraintLayout constraintLayout, InfoView infoView, Button button, HeaderView headerView, ShimmerFrameLayout shimmerFrameLayout, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.emptyView = infoView;
        this.fab = button;
        this.headerSubscriptionHome = headerView;
        this.shimmerViewContainer = shimmerFrameLayout;
        this.subscriptionRecyclerview = recyclerView;
    }

    public static SubscriptionHomeFragmentBinding bind(View view) {
        int i = R.id.empty_view;
        InfoView infoView = (InfoView) AbstractC0105a.t(view, i);
        if (infoView != null) {
            i = R.id.fab;
            Button button = (Button) AbstractC0105a.t(view, i);
            if (button != null) {
                i = R.id.headerSubscriptionHome;
                HeaderView headerView = (HeaderView) AbstractC0105a.t(view, i);
                if (headerView != null) {
                    i = R.id.shimmer_view_container;
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) AbstractC0105a.t(view, i);
                    if (shimmerFrameLayout != null) {
                        i = R.id.subscription_recyclerview;
                        RecyclerView recyclerView = (RecyclerView) AbstractC0105a.t(view, i);
                        if (recyclerView != null) {
                            return new SubscriptionHomeFragmentBinding((ConstraintLayout) view, infoView, button, headerView, shimmerFrameLayout, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static SubscriptionHomeFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SubscriptionHomeFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.subscription_home_fragment, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
