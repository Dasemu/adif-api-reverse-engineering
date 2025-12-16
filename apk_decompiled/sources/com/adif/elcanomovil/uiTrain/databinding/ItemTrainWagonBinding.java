package com.adif.elcanomovil.uiTrain.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.uiTrain.R;

/* loaded from: classes3.dex */
public final class ItemTrainWagonBinding {
    private final ConstraintLayout rootView;
    public final ImageView wagonCafeteria;
    public final TextView wagonNumber;
    public final ImageView wagonSrc;

    private ItemTrainWagonBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2) {
        this.rootView = constraintLayout;
        this.wagonCafeteria = imageView;
        this.wagonNumber = textView;
        this.wagonSrc = imageView2;
    }

    public static ItemTrainWagonBinding bind(View view) {
        int i = R.id.wagon_cafeteria;
        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
        if (imageView != null) {
            i = R.id.wagon_number;
            TextView textView = (TextView) AbstractC0105a.t(view, i);
            if (textView != null) {
                i = R.id.wagon_src;
                ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
                if (imageView2 != null) {
                    return new ItemTrainWagonBinding((ConstraintLayout) view, imageView, textView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemTrainWagonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemTrainWagonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_train_wagon, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
