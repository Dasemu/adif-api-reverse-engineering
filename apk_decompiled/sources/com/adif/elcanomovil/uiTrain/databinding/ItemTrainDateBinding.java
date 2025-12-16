package com.adif.elcanomovil.uiTrain.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.adif.elcanomovil.uiTrain.R;

/* loaded from: classes3.dex */
public final class ItemTrainDateBinding {
    public final TextView formattedDate;
    public final Guideline guideline20;
    private final ConstraintLayout rootView;
    public final ImageView trainViewInStation;

    private ItemTrainDateBinding(ConstraintLayout constraintLayout, TextView textView, Guideline guideline, ImageView imageView) {
        this.rootView = constraintLayout;
        this.formattedDate = textView;
        this.guideline20 = guideline;
        this.trainViewInStation = imageView;
    }

    public static ItemTrainDateBinding bind(View view) {
        int i = R.id.formatted_date;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            i = R.id.guideline20;
            Guideline guideline = (Guideline) AbstractC0105a.t(view, i);
            if (guideline != null) {
                i = R.id.train_view_inStation;
                ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                if (imageView != null) {
                    return new ItemTrainDateBinding((ConstraintLayout) view, textView, guideline, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemTrainDateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemTrainDateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_train_date, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
