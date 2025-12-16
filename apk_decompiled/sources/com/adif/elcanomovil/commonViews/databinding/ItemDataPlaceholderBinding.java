package com.adif.elcanomovil.commonViews.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.adif.elcanomovil.commonViews.R;

/* loaded from: classes.dex */
public final class ItemDataPlaceholderBinding {
    private final RelativeLayout rootView;
    public final View status;

    private ItemDataPlaceholderBinding(RelativeLayout relativeLayout, View view) {
        this.rootView = relativeLayout;
        this.status = view;
    }

    public static ItemDataPlaceholderBinding bind(View view) {
        int i = R.id.status;
        View t2 = AbstractC0105a.t(view, i);
        if (t2 != null) {
            return new ItemDataPlaceholderBinding((RelativeLayout) view, t2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemDataPlaceholderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDataPlaceholderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_data_placeholder, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
