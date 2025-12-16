package com.adif.elcanomovil.uiTrain.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.uiTrain.R;

/* loaded from: classes3.dex */
public final class TrainCompositionViewBinding {
    public final ImageView ivTrainDirection;
    public final ConstraintLayout parent;
    private final ConstraintLayout rootView;
    public final RecyclerView rvComposition;
    public final View vShadow;

    private TrainCompositionViewBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, RecyclerView recyclerView, View view) {
        this.rootView = constraintLayout;
        this.ivTrainDirection = imageView;
        this.parent = constraintLayout2;
        this.rvComposition = recyclerView;
        this.vShadow = view;
    }

    public static TrainCompositionViewBinding bind(View view) {
        View t2;
        int i = R.id.iv_train_direction;
        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.rv_composition;
            RecyclerView recyclerView = (RecyclerView) AbstractC0105a.t(view, i);
            if (recyclerView != null && (t2 = AbstractC0105a.t(view, (i = R.id.v_shadow))) != null) {
                return new TrainCompositionViewBinding(constraintLayout, imageView, constraintLayout, recyclerView, t2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static TrainCompositionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static TrainCompositionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.train_composition_view, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
