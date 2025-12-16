package com.adif.elcanomovil.uiMoreAdif.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.uiMoreAdif.R;

/* loaded from: classes2.dex */
public final class FragmentMoreAdifBinding {
    public final RecyclerView optionsRecyclerView;
    private final LinearLayout rootView;
    public final ImageView stationOptionIcon;

    private FragmentMoreAdifBinding(LinearLayout linearLayout, RecyclerView recyclerView, ImageView imageView) {
        this.rootView = linearLayout;
        this.optionsRecyclerView = recyclerView;
        this.stationOptionIcon = imageView;
    }

    public static FragmentMoreAdifBinding bind(View view) {
        int i = R.id.options_recyclerView;
        RecyclerView recyclerView = (RecyclerView) AbstractC0105a.t(view, i);
        if (recyclerView != null) {
            i = R.id.stationOptionIcon;
            ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
            if (imageView != null) {
                return new FragmentMoreAdifBinding((LinearLayout) view, recyclerView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentMoreAdifBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMoreAdifBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_more_adif, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
