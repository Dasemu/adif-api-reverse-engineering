package com.adif.elcanomovil.uiAvisa.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.uiAvisa.R;

/* loaded from: classes.dex */
public final class GridPicturesBinding {
    public final TextView gridEmptyLabel;
    public final LinearLayout gridFixedlayout;
    public final ImageView gridImage1;
    public final ImageView gridImage2;
    public final ImageView gridImage3;
    public final ImageView gridImage4;
    public final RecyclerView gridRecyclerview;
    private final FrameLayout rootView;

    private GridPicturesBinding(FrameLayout frameLayout, TextView textView, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.gridEmptyLabel = textView;
        this.gridFixedlayout = linearLayout;
        this.gridImage1 = imageView;
        this.gridImage2 = imageView2;
        this.gridImage3 = imageView3;
        this.gridImage4 = imageView4;
        this.gridRecyclerview = recyclerView;
    }

    public static GridPicturesBinding bind(View view) {
        int i = R.id.grid_emptyLabel;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            i = R.id.grid_fixedlayout;
            LinearLayout linearLayout = (LinearLayout) AbstractC0105a.t(view, i);
            if (linearLayout != null) {
                i = R.id.grid_image_1;
                ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                if (imageView != null) {
                    i = R.id.grid_image_2;
                    ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
                    if (imageView2 != null) {
                        i = R.id.grid_image_3;
                        ImageView imageView3 = (ImageView) AbstractC0105a.t(view, i);
                        if (imageView3 != null) {
                            i = R.id.grid_image_4;
                            ImageView imageView4 = (ImageView) AbstractC0105a.t(view, i);
                            if (imageView4 != null) {
                                i = R.id.grid_recyclerview;
                                RecyclerView recyclerView = (RecyclerView) AbstractC0105a.t(view, i);
                                if (recyclerView != null) {
                                    return new GridPicturesBinding((FrameLayout) view, textView, linearLayout, imageView, imageView2, imageView3, imageView4, recyclerView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static GridPicturesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GridPicturesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.grid_pictures, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
