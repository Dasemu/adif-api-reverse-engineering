package com.adif.elcanomovil.uiSubscriptions.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.uiSubscriptions.R;

/* loaded from: classes3.dex */
public final class ViewSubscriptionTrainBinding {
    public final ImageView directionArrow;
    private final ConstraintLayout rootView;
    public final ImageView searchTo;
    public final TextView stationBackground;
    public final TextView stationToBackground;
    public final TextView textViewInfo;
    public final LinearLayout textViewInfoTrain;
    public final TextView textViewMyStation;
    public final TextView textViewTitle;
    public final TextView trainNumber;
    public final TextView trainOperator;
    public final TextView trainType;

    private ViewSubscriptionTrainBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = constraintLayout;
        this.directionArrow = imageView;
        this.searchTo = imageView2;
        this.stationBackground = textView;
        this.stationToBackground = textView2;
        this.textViewInfo = textView3;
        this.textViewInfoTrain = linearLayout;
        this.textViewMyStation = textView4;
        this.textViewTitle = textView5;
        this.trainNumber = textView6;
        this.trainOperator = textView7;
        this.trainType = textView8;
    }

    public static ViewSubscriptionTrainBinding bind(View view) {
        int i = R.id.direction_arrow;
        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
        if (imageView != null) {
            i = R.id.search_to;
            ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
            if (imageView2 != null) {
                i = R.id.station_background;
                TextView textView = (TextView) AbstractC0105a.t(view, i);
                if (textView != null) {
                    i = R.id.station_to_background;
                    TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                    if (textView2 != null) {
                        i = R.id.text_view_info;
                        TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                        if (textView3 != null) {
                            i = R.id.textViewInfoTrain;
                            LinearLayout linearLayout = (LinearLayout) AbstractC0105a.t(view, i);
                            if (linearLayout != null) {
                                i = R.id.textViewMyStation;
                                TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                                if (textView4 != null) {
                                    i = R.id.textView_title;
                                    TextView textView5 = (TextView) AbstractC0105a.t(view, i);
                                    if (textView5 != null) {
                                        i = R.id.train_number;
                                        TextView textView6 = (TextView) AbstractC0105a.t(view, i);
                                        if (textView6 != null) {
                                            i = R.id.train_operator;
                                            TextView textView7 = (TextView) AbstractC0105a.t(view, i);
                                            if (textView7 != null) {
                                                i = R.id.train_type;
                                                TextView textView8 = (TextView) AbstractC0105a.t(view, i);
                                                if (textView8 != null) {
                                                    return new ViewSubscriptionTrainBinding((ConstraintLayout) view, imageView, imageView2, textView, textView2, textView3, linearLayout, textView4, textView5, textView6, textView7, textView8);
                                                }
                                            }
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

    public static ViewSubscriptionTrainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewSubscriptionTrainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.view_subscription_train, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
