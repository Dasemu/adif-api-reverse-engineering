package com.adif.elcanomovil.commonViews.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.R;

/* loaded from: classes.dex */
public final class ItemExplanationsBinding {
    public final ImageView icon;
    private final ConstraintLayout rootView;
    public final TextView title;

    private ItemExplanationsBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.icon = imageView;
        this.title = textView;
    }

    public static ItemExplanationsBinding bind(View view) {
        int i = R.id.icon;
        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
        if (imageView != null) {
            i = R.id.title;
            TextView textView = (TextView) AbstractC0105a.t(view, i);
            if (textView != null) {
                return new ItemExplanationsBinding((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemExplanationsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemExplanationsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_explanations, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
