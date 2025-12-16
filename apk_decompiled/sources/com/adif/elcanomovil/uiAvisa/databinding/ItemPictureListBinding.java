package com.adif.elcanomovil.uiAvisa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.adif.elcanomovil.uiAvisa.R;

/* loaded from: classes.dex */
public final class ItemPictureListBinding {
    private final ImageView rootView;

    private ItemPictureListBinding(ImageView imageView) {
        this.rootView = imageView;
    }

    public static ItemPictureListBinding bind(View view) {
        if (view != null) {
            return new ItemPictureListBinding((ImageView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static ItemPictureListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemPictureListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_picture_list, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ImageView getRoot() {
        return this.rootView;
    }
}
