package com.adif.elcanomovil.uiTrain.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.adif.elcanomovil.commonViews.databinding.CorporateCirculationInfoBinding;
import com.adif.elcanomovil.uiTrain.R;
import com.adif.elcanomovil.uiTrain.main.TrainCompositionView;

/* loaded from: classes3.dex */
public final class ItemTrainSituationBinding {
    public final CorporateCirculationInfoBinding corporate;
    public final TextView delayedTime;
    public final FrameLayout flPlatform;
    public final Guideline guideline20;
    public final Guideline guideline90;
    public final View indicatorLeft;
    public final View indicatorRight;
    public final LinearLayout linearLayout;
    public final LinearLayout linearLayout2;
    public final TextView notes;
    public final ImageView pathViewArrival;
    public final ImageView pathViewDeparture;
    public final ImageView pathViewFirstStation;
    public final ImageView pathViewLastStation;
    public final TextView platform;
    private final ConstraintLayout rootView;
    public final TextView state;
    public final TextView station;
    public final AppCompatImageView stationDot;
    public final ImageView suppressedTrain;
    public final TextView time;
    public final TrainCompositionView trainComposition;
    public final AppCompatImageView trainDepartured;
    public final AppCompatImageView trainViewArriving;
    public final AppCompatImageView trainViewInStation;
    public final TextView warning;

    private ItemTrainSituationBinding(ConstraintLayout constraintLayout, CorporateCirculationInfoBinding corporateCirculationInfoBinding, TextView textView, FrameLayout frameLayout, Guideline guideline, Guideline guideline2, View view, View view2, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView3, TextView textView4, TextView textView5, AppCompatImageView appCompatImageView, ImageView imageView5, TextView textView6, TrainCompositionView trainCompositionView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, TextView textView7) {
        this.rootView = constraintLayout;
        this.corporate = corporateCirculationInfoBinding;
        this.delayedTime = textView;
        this.flPlatform = frameLayout;
        this.guideline20 = guideline;
        this.guideline90 = guideline2;
        this.indicatorLeft = view;
        this.indicatorRight = view2;
        this.linearLayout = linearLayout;
        this.linearLayout2 = linearLayout2;
        this.notes = textView2;
        this.pathViewArrival = imageView;
        this.pathViewDeparture = imageView2;
        this.pathViewFirstStation = imageView3;
        this.pathViewLastStation = imageView4;
        this.platform = textView3;
        this.state = textView4;
        this.station = textView5;
        this.stationDot = appCompatImageView;
        this.suppressedTrain = imageView5;
        this.time = textView6;
        this.trainComposition = trainCompositionView;
        this.trainDepartured = appCompatImageView2;
        this.trainViewArriving = appCompatImageView3;
        this.trainViewInStation = appCompatImageView4;
        this.warning = textView7;
    }

    public static ItemTrainSituationBinding bind(View view) {
        View t2;
        View t4;
        int i = R.id.corporate;
        View t5 = AbstractC0105a.t(view, i);
        if (t5 != null) {
            CorporateCirculationInfoBinding bind = CorporateCirculationInfoBinding.bind(t5);
            i = R.id.delayed_time;
            TextView textView = (TextView) AbstractC0105a.t(view, i);
            if (textView != null) {
                i = R.id.fl_platform;
                FrameLayout frameLayout = (FrameLayout) AbstractC0105a.t(view, i);
                if (frameLayout != null) {
                    i = R.id.guideline20;
                    Guideline guideline = (Guideline) AbstractC0105a.t(view, i);
                    if (guideline != null) {
                        i = R.id.guideline90;
                        Guideline guideline2 = (Guideline) AbstractC0105a.t(view, i);
                        if (guideline2 != null && (t2 = AbstractC0105a.t(view, (i = R.id.indicator_left))) != null && (t4 = AbstractC0105a.t(view, (i = R.id.indicator_right))) != null) {
                            i = R.id.linearLayout;
                            LinearLayout linearLayout = (LinearLayout) AbstractC0105a.t(view, i);
                            if (linearLayout != null) {
                                i = R.id.linearLayout2;
                                LinearLayout linearLayout2 = (LinearLayout) AbstractC0105a.t(view, i);
                                if (linearLayout2 != null) {
                                    i = R.id.notes;
                                    TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                                    if (textView2 != null) {
                                        i = R.id.path_view_arrival;
                                        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                                        if (imageView != null) {
                                            i = R.id.path_view_departure;
                                            ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
                                            if (imageView2 != null) {
                                                i = R.id.path_view_first_station;
                                                ImageView imageView3 = (ImageView) AbstractC0105a.t(view, i);
                                                if (imageView3 != null) {
                                                    i = R.id.path_view_last_station;
                                                    ImageView imageView4 = (ImageView) AbstractC0105a.t(view, i);
                                                    if (imageView4 != null) {
                                                        i = R.id.platform;
                                                        TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                                                        if (textView3 != null) {
                                                            i = R.id.state;
                                                            TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                                                            if (textView4 != null) {
                                                                i = R.id.station;
                                                                TextView textView5 = (TextView) AbstractC0105a.t(view, i);
                                                                if (textView5 != null) {
                                                                    i = R.id.station_dot;
                                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC0105a.t(view, i);
                                                                    if (appCompatImageView != null) {
                                                                        i = R.id.suppressed_train;
                                                                        ImageView imageView5 = (ImageView) AbstractC0105a.t(view, i);
                                                                        if (imageView5 != null) {
                                                                            i = R.id.time;
                                                                            TextView textView6 = (TextView) AbstractC0105a.t(view, i);
                                                                            if (textView6 != null) {
                                                                                i = R.id.train_composition;
                                                                                TrainCompositionView trainCompositionView = (TrainCompositionView) AbstractC0105a.t(view, i);
                                                                                if (trainCompositionView != null) {
                                                                                    i = R.id.train_departured;
                                                                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) AbstractC0105a.t(view, i);
                                                                                    if (appCompatImageView2 != null) {
                                                                                        i = R.id.train_view_arriving;
                                                                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) AbstractC0105a.t(view, i);
                                                                                        if (appCompatImageView3 != null) {
                                                                                            i = R.id.train_view_inStation;
                                                                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) AbstractC0105a.t(view, i);
                                                                                            if (appCompatImageView4 != null) {
                                                                                                i = R.id.warning;
                                                                                                TextView textView7 = (TextView) AbstractC0105a.t(view, i);
                                                                                                if (textView7 != null) {
                                                                                                    return new ItemTrainSituationBinding((ConstraintLayout) view, bind, textView, frameLayout, guideline, guideline2, t2, t4, linearLayout, linearLayout2, textView2, imageView, imageView2, imageView3, imageView4, textView3, textView4, textView5, appCompatImageView, imageView5, textView6, trainCompositionView, appCompatImageView2, appCompatImageView3, appCompatImageView4, textView7);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemTrainSituationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemTrainSituationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_train_situation, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
