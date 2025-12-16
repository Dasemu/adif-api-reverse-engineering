package com.adif.elcanomovil.uiSubscriptions.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.DayView;
import com.adif.elcanomovil.uiSubscriptions.R;

/* loaded from: classes3.dex */
public final class ViewRepetitionDaysBinding {
    public final DayView dayFive;
    public final DayView dayFour;
    public final DayView dayOne;
    public final DayView daySeven;
    public final DayView daySix;
    public final DayView dayThree;
    public final DayView dayTwo;
    public final ImageView imageView2;
    public final ConstraintLayout listDays;
    private final ConstraintLayout rootView;
    public final TextView textViewDays;

    private ViewRepetitionDaysBinding(ConstraintLayout constraintLayout, DayView dayView, DayView dayView2, DayView dayView3, DayView dayView4, DayView dayView5, DayView dayView6, DayView dayView7, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView) {
        this.rootView = constraintLayout;
        this.dayFive = dayView;
        this.dayFour = dayView2;
        this.dayOne = dayView3;
        this.daySeven = dayView4;
        this.daySix = dayView5;
        this.dayThree = dayView6;
        this.dayTwo = dayView7;
        this.imageView2 = imageView;
        this.listDays = constraintLayout2;
        this.textViewDays = textView;
    }

    public static ViewRepetitionDaysBinding bind(View view) {
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
                                    i = R.id.imageView2;
                                    ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                                    if (imageView != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i = R.id.text_view_days;
                                        TextView textView = (TextView) AbstractC0105a.t(view, i);
                                        if (textView != null) {
                                            return new ViewRepetitionDaysBinding(constraintLayout, dayView, dayView2, dayView3, dayView4, dayView5, dayView6, dayView7, imageView, constraintLayout, textView);
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

    public static ViewRepetitionDaysBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewRepetitionDaysBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.view_repetition_days, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
