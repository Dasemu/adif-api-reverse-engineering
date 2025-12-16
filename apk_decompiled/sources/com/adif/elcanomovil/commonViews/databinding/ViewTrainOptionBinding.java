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
public final class ViewTrainOptionBinding {
    private final ConstraintLayout rootView;
    public final TextView trainOptionFrom;
    public final TextView trainOptionFromStation;
    public final TextView trainOptionFromStationTime;
    public final ImageView trainOptionIcon;
    public final TextView trainOptionNumber;
    public final TextView trainOptionTitle;
    public final TextView trainOptionTo;
    public final TextView trainOptionToStation;
    public final TextView trainOptionToStationTime;

    private ViewTrainOptionBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, ImageView imageView, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = constraintLayout;
        this.trainOptionFrom = textView;
        this.trainOptionFromStation = textView2;
        this.trainOptionFromStationTime = textView3;
        this.trainOptionIcon = imageView;
        this.trainOptionNumber = textView4;
        this.trainOptionTitle = textView5;
        this.trainOptionTo = textView6;
        this.trainOptionToStation = textView7;
        this.trainOptionToStationTime = textView8;
    }

    public static ViewTrainOptionBinding bind(View view) {
        int i = R.id.trainOptionFrom;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            i = R.id.trainOptionFromStation;
            TextView textView2 = (TextView) AbstractC0105a.t(view, i);
            if (textView2 != null) {
                i = R.id.trainOptionFromStationTime;
                TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                if (textView3 != null) {
                    i = R.id.trainOptionIcon;
                    ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                    if (imageView != null) {
                        i = R.id.trainOptionNumber;
                        TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                        if (textView4 != null) {
                            i = R.id.trainOptionTitle;
                            TextView textView5 = (TextView) AbstractC0105a.t(view, i);
                            if (textView5 != null) {
                                i = R.id.trainOptionTo;
                                TextView textView6 = (TextView) AbstractC0105a.t(view, i);
                                if (textView6 != null) {
                                    i = R.id.trainOptionToStation;
                                    TextView textView7 = (TextView) AbstractC0105a.t(view, i);
                                    if (textView7 != null) {
                                        i = R.id.trainOptionToStationTime;
                                        TextView textView8 = (TextView) AbstractC0105a.t(view, i);
                                        if (textView8 != null) {
                                            return new ViewTrainOptionBinding((ConstraintLayout) view, textView, textView2, textView3, imageView, textView4, textView5, textView6, textView7, textView8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewTrainOptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewTrainOptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.view_train_option, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
