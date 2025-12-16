package com.adif.elcanomovil.uiSubscriptions.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.DayView;
import com.adif.elcanomovil.uiSubscriptions.R;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* loaded from: classes3.dex */
public final class ItemSubscriptionBinding {
    public final ConstraintLayout containerSubscriptionItem;
    public final DayView dayFive;
    public final DayView dayFour;
    public final DayView dayOne;
    public final DayView daySeven;
    public final DayView daySix;
    public final DayView dayThree;
    public final DayView dayTwo;
    public final ImageView directionArrow;
    public final ImageView imageView;
    public final ImageView imageViewCalendar;
    public final ConstraintLayout listDays;
    private final ConstraintLayout rootView;
    public final TextView station;
    public final TextView stationTo;
    public final SwitchMaterial switchActiveSubscripition;
    public final TextView textViewDuration;
    public final TextView textViewFor;
    public final TextView textViewFrom;
    public final LinearLayout textViewInfoTrain;
    public final TextView textViewTime;
    public final TextView textViewTrainPrefix;
    public final TextView trainNumber;
    public final TextView trainOperator;
    public final TextView trainType;

    private ItemSubscriptionBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, DayView dayView, DayView dayView2, DayView dayView3, DayView dayView4, DayView dayView5, DayView dayView6, DayView dayView7, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout3, TextView textView, TextView textView2, SwitchMaterial switchMaterial, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10) {
        this.rootView = constraintLayout;
        this.containerSubscriptionItem = constraintLayout2;
        this.dayFive = dayView;
        this.dayFour = dayView2;
        this.dayOne = dayView3;
        this.daySeven = dayView4;
        this.daySix = dayView5;
        this.dayThree = dayView6;
        this.dayTwo = dayView7;
        this.directionArrow = imageView;
        this.imageView = imageView2;
        this.imageViewCalendar = imageView3;
        this.listDays = constraintLayout3;
        this.station = textView;
        this.stationTo = textView2;
        this.switchActiveSubscripition = switchMaterial;
        this.textViewDuration = textView3;
        this.textViewFor = textView4;
        this.textViewFrom = textView5;
        this.textViewInfoTrain = linearLayout;
        this.textViewTime = textView6;
        this.textViewTrainPrefix = textView7;
        this.trainNumber = textView8;
        this.trainOperator = textView9;
        this.trainType = textView10;
    }

    public static ItemSubscriptionBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.day_five;
        DayView dayView = (DayView) AbstractC0105a.t(view, i);
        if (dayView != null) {
            i = R.id.day_four;
            DayView dayView2 = (DayView) AbstractC0105a.t(view, i);
            if (dayView2 != null) {
                i = R.id.day_one;
                DayView dayView3 = (DayView) AbstractC0105a.t(view, i);
                if (dayView3 != null) {
                    i = R.id.day_seven;
                    DayView dayView4 = (DayView) AbstractC0105a.t(view, i);
                    if (dayView4 != null) {
                        i = R.id.day_six;
                        DayView dayView5 = (DayView) AbstractC0105a.t(view, i);
                        if (dayView5 != null) {
                            i = R.id.day_three;
                            DayView dayView6 = (DayView) AbstractC0105a.t(view, i);
                            if (dayView6 != null) {
                                i = R.id.day_two;
                                DayView dayView7 = (DayView) AbstractC0105a.t(view, i);
                                if (dayView7 != null) {
                                    i = R.id.direction_arrow;
                                    ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                                    if (imageView != null) {
                                        i = R.id.imageView;
                                        ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
                                        if (imageView2 != null) {
                                            i = R.id.imageViewCalendar;
                                            ImageView imageView3 = (ImageView) AbstractC0105a.t(view, i);
                                            if (imageView3 != null) {
                                                i = R.id.list_days;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) AbstractC0105a.t(view, i);
                                                if (constraintLayout2 != null) {
                                                    i = R.id.station;
                                                    TextView textView = (TextView) AbstractC0105a.t(view, i);
                                                    if (textView != null) {
                                                        i = R.id.stationTo;
                                                        TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                                                        if (textView2 != null) {
                                                            i = R.id.switchActiveSubscripition;
                                                            SwitchMaterial switchMaterial = (SwitchMaterial) AbstractC0105a.t(view, i);
                                                            if (switchMaterial != null) {
                                                                i = R.id.textViewDuration;
                                                                TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                                                                if (textView3 != null) {
                                                                    i = R.id.textViewFor;
                                                                    TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                                                                    if (textView4 != null) {
                                                                        i = R.id.textViewFrom;
                                                                        TextView textView5 = (TextView) AbstractC0105a.t(view, i);
                                                                        if (textView5 != null) {
                                                                            i = R.id.textViewInfoTrain;
                                                                            LinearLayout linearLayout = (LinearLayout) AbstractC0105a.t(view, i);
                                                                            if (linearLayout != null) {
                                                                                i = R.id.textViewTime;
                                                                                TextView textView6 = (TextView) AbstractC0105a.t(view, i);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.textViewTrainPrefix;
                                                                                    TextView textView7 = (TextView) AbstractC0105a.t(view, i);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.train_number;
                                                                                        TextView textView8 = (TextView) AbstractC0105a.t(view, i);
                                                                                        if (textView8 != null) {
                                                                                            i = R.id.train_operator;
                                                                                            TextView textView9 = (TextView) AbstractC0105a.t(view, i);
                                                                                            if (textView9 != null) {
                                                                                                i = R.id.train_type;
                                                                                                TextView textView10 = (TextView) AbstractC0105a.t(view, i);
                                                                                                if (textView10 != null) {
                                                                                                    return new ItemSubscriptionBinding(constraintLayout, constraintLayout, dayView, dayView2, dayView3, dayView4, dayView5, dayView6, dayView7, imageView, imageView2, imageView3, constraintLayout2, textView, textView2, switchMaterial, textView3, textView4, textView5, linearLayout, textView6, textView7, textView8, textView9, textView10);
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

    public static ItemSubscriptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSubscriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_subscription, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
