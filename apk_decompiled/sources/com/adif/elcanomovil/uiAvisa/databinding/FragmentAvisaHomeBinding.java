package com.adif.elcanomovil.uiAvisa.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.commonViews.HeaderView;
import com.adif.elcanomovil.commonViews.InfoView;
import com.adif.elcanomovil.uiAvisa.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class FragmentAvisaHomeBinding {
    public final InfoView emptyView;
    public final MaterialButton fab;
    public final HeaderView headerAvisaHome;
    public final RecyclerView issuesRecyclerview;
    public final ProgressBar loadingView;
    public final ConstraintLayout loadingViewContainer;
    private final ConstraintLayout rootView;
    public final TextView title;

    private FragmentAvisaHomeBinding(ConstraintLayout constraintLayout, InfoView infoView, MaterialButton materialButton, HeaderView headerView, RecyclerView recyclerView, ProgressBar progressBar, ConstraintLayout constraintLayout2, TextView textView) {
        this.rootView = constraintLayout;
        this.emptyView = infoView;
        this.fab = materialButton;
        this.headerAvisaHome = headerView;
        this.issuesRecyclerview = recyclerView;
        this.loadingView = progressBar;
        this.loadingViewContainer = constraintLayout2;
        this.title = textView;
    }

    public static FragmentAvisaHomeBinding bind(View view) {
        int i = R.id.empty_view;
        InfoView infoView = (InfoView) AbstractC0105a.t(view, i);
        if (infoView != null) {
            i = R.id.fab;
            MaterialButton materialButton = (MaterialButton) AbstractC0105a.t(view, i);
            if (materialButton != null) {
                i = R.id.headerAvisaHome;
                HeaderView headerView = (HeaderView) AbstractC0105a.t(view, i);
                if (headerView != null) {
                    i = R.id.issues_recyclerview;
                    RecyclerView recyclerView = (RecyclerView) AbstractC0105a.t(view, i);
                    if (recyclerView != null) {
                        i = R.id.loading_view;
                        ProgressBar progressBar = (ProgressBar) AbstractC0105a.t(view, i);
                        if (progressBar != null) {
                            i = R.id.loading_view_container;
                            ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC0105a.t(view, i);
                            if (constraintLayout != null) {
                                i = R.id.title;
                                TextView textView = (TextView) AbstractC0105a.t(view, i);
                                if (textView != null) {
                                    return new FragmentAvisaHomeBinding((ConstraintLayout) view, infoView, materialButton, headerView, recyclerView, progressBar, constraintLayout, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentAvisaHomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAvisaHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_avisa_home, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
