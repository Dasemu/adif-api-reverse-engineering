package com.adif.elcanomovil.uiMoreAdif.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.commonViews.HeaderView;
import com.adif.elcanomovil.uiMoreAdif.R;

/* loaded from: classes2.dex */
public final class FragmentHelpBinding {
    public final HeaderView headerViewAbout;
    public final RecyclerView optionsRecyclerView;
    private final LinearLayout rootView;

    private FragmentHelpBinding(LinearLayout linearLayout, HeaderView headerView, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.headerViewAbout = headerView;
        this.optionsRecyclerView = recyclerView;
    }

    public static FragmentHelpBinding bind(View view) {
        int i = R.id.header_view_about;
        HeaderView headerView = (HeaderView) AbstractC0105a.t(view, i);
        if (headerView != null) {
            i = R.id.options_recyclerView;
            RecyclerView recyclerView = (RecyclerView) AbstractC0105a.t(view, i);
            if (recyclerView != null) {
                return new FragmentHelpBinding((LinearLayout) view, headerView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentHelpBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentHelpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_help, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
