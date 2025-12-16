package com.adif.elcanomovil.uiDepartures.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.uiDepartures.R;

/* loaded from: classes2.dex */
public final class ItemCategoryListBinding {
    private final ConstraintLayout rootView;
    public final ImageView stationCategoryIcon;
    public final TextView stationCategoryTitle;

    private ItemCategoryListBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.stationCategoryIcon = imageView;
        this.stationCategoryTitle = textView;
    }

    public static ItemCategoryListBinding bind(View view) {
        int i = R.id.stationCategoryIcon;
        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
        if (imageView != null) {
            i = R.id.stationCategoryTitle;
            TextView textView = (TextView) AbstractC0105a.t(view, i);
            if (textView != null) {
                return new ItemCategoryListBinding((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemCategoryListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemCategoryListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_category_list, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
