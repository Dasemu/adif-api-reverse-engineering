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
public final class ItemOptionBinding {
    public final ImageView arrowYellow;
    public final ImageView icon;
    private final ConstraintLayout rootView;
    public final TextView title;

    private ItemOptionBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.rootView = constraintLayout;
        this.arrowYellow = imageView;
        this.icon = imageView2;
        this.title = textView;
    }

    public static ItemOptionBinding bind(View view) {
        int i = R.id.arrow_yellow;
        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
        if (imageView != null) {
            i = R.id.icon;
            ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
            if (imageView2 != null) {
                i = R.id.title;
                TextView textView = (TextView) AbstractC0105a.t(view, i);
                if (textView != null) {
                    return new ItemOptionBinding((ConstraintLayout) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemOptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemOptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_option, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
