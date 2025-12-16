package com.adif.elcanomovil.uiDialog.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.uiDialog.R;

/* loaded from: classes2.dex */
public final class ItemSingleLogoBinding {
    public final ImageView icon;
    private final ConstraintLayout rootView;

    private ItemSingleLogoBinding(ConstraintLayout constraintLayout, ImageView imageView) {
        this.rootView = constraintLayout;
        this.icon = imageView;
    }

    public static ItemSingleLogoBinding bind(View view) {
        int i = R.id.icon;
        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
        if (imageView != null) {
            return new ItemSingleLogoBinding((ConstraintLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemSingleLogoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSingleLogoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_single_logo, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
