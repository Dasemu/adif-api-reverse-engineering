package com.adif.elcanomovil.uiDepartures.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.adif.elcanomovil.commonViews.databinding.CorporateCirculationInfoBinding;
import com.adif.elcanomovil.uiDepartures.R;

/* loaded from: classes2.dex */
public final class ItemCirculationTrainsBinding {
    public final TextView action;
    public final ConstraintLayout clMainInfo;
    public final CorporateCirculationInfoBinding corporateInfo;
    public final TextView delayedTime;
    public final Guideline guideline20;
    public final Guideline guideline75;
    public final Guideline guideline90;
    public final View indicatorLeft;
    public final View indicatorRight;
    public final ImageView logo;
    public final TextView notes;
    public final TextView number;
    public final TextView operator;
    public final TextView platform;
    public final TextView product;
    private final ConstraintLayout rootView;
    public final TextView station;
    public final LinearLayout stationContainer;
    public final ImageView suppressedTrain;
    public final TextView time;
    public final TextView warning;

    private ItemCirculationTrainsBinding(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, CorporateCirculationInfoBinding corporateCirculationInfoBinding, TextView textView2, Guideline guideline, Guideline guideline2, Guideline guideline3, View view, View view2, ImageView imageView, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, LinearLayout linearLayout, ImageView imageView2, TextView textView9, TextView textView10) {
        this.rootView = constraintLayout;
        this.action = textView;
        this.clMainInfo = constraintLayout2;
        this.corporateInfo = corporateCirculationInfoBinding;
        this.delayedTime = textView2;
        this.guideline20 = guideline;
        this.guideline75 = guideline2;
        this.guideline90 = guideline3;
        this.indicatorLeft = view;
        this.indicatorRight = view2;
        this.logo = imageView;
        this.notes = textView3;
        this.number = textView4;
        this.operator = textView5;
        this.platform = textView6;
        this.product = textView7;
        this.station = textView8;
        this.stationContainer = linearLayout;
        this.suppressedTrain = imageView2;
        this.time = textView9;
        this.warning = textView10;
    }

    public static ItemCirculationTrainsBinding bind(View view) {
        View t2;
        View t4;
        View t5;
        int i = R.id.action;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            i = R.id.cl_main_info;
            ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC0105a.t(view, i);
            if (constraintLayout != null && (t2 = AbstractC0105a.t(view, (i = R.id.corporate_info))) != null) {
                CorporateCirculationInfoBinding bind = CorporateCirculationInfoBinding.bind(t2);
                i = R.id.delayed_time;
                TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                if (textView2 != null) {
                    i = R.id.guideline20;
                    Guideline guideline = (Guideline) AbstractC0105a.t(view, i);
                    if (guideline != null) {
                        i = R.id.guideline75;
                        Guideline guideline2 = (Guideline) AbstractC0105a.t(view, i);
                        if (guideline2 != null) {
                            i = R.id.guideline90;
                            Guideline guideline3 = (Guideline) AbstractC0105a.t(view, i);
                            if (guideline3 != null && (t4 = AbstractC0105a.t(view, (i = R.id.indicator_left))) != null && (t5 = AbstractC0105a.t(view, (i = R.id.indicator_right))) != null) {
                                i = R.id.logo;
                                ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                                if (imageView != null) {
                                    i = R.id.notes;
                                    TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                                    if (textView3 != null) {
                                        i = R.id.number;
                                        TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                                        if (textView4 != null) {
                                            i = R.id.operator;
                                            TextView textView5 = (TextView) AbstractC0105a.t(view, i);
                                            if (textView5 != null) {
                                                i = R.id.platform;
                                                TextView textView6 = (TextView) AbstractC0105a.t(view, i);
                                                if (textView6 != null) {
                                                    i = R.id.product;
                                                    TextView textView7 = (TextView) AbstractC0105a.t(view, i);
                                                    if (textView7 != null) {
                                                        i = R.id.station;
                                                        TextView textView8 = (TextView) AbstractC0105a.t(view, i);
                                                        if (textView8 != null) {
                                                            i = R.id.station_container;
                                                            LinearLayout linearLayout = (LinearLayout) AbstractC0105a.t(view, i);
                                                            if (linearLayout != null) {
                                                                i = R.id.suppressed_train;
                                                                ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
                                                                if (imageView2 != null) {
                                                                    i = R.id.time;
                                                                    TextView textView9 = (TextView) AbstractC0105a.t(view, i);
                                                                    if (textView9 != null) {
                                                                        i = R.id.warning;
                                                                        TextView textView10 = (TextView) AbstractC0105a.t(view, i);
                                                                        if (textView10 != null) {
                                                                            return new ItemCirculationTrainsBinding((ConstraintLayout) view, textView, constraintLayout, bind, textView2, guideline, guideline2, guideline3, t4, t5, imageView, textView3, textView4, textView5, textView6, textView7, textView8, linearLayout, imageView2, textView9, textView10);
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

    public static ItemCirculationTrainsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemCirculationTrainsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_circulation_trains, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
