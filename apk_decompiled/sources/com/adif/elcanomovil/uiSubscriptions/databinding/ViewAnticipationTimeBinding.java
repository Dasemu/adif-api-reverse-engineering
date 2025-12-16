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
public final class ViewAnticipationTimeBinding {
    public final DayView anticipationTimeOne;
    public final DayView anticipationTimeThree;
    public final DayView anticipationTimeTwo;
    public final ImageView imageView2;
    public final ConstraintLayout listAnticipationTime;
    private final ConstraintLayout rootView;
    public final TextView textViewActicipationTime;

    private ViewAnticipationTimeBinding(ConstraintLayout constraintLayout, DayView dayView, DayView dayView2, DayView dayView3, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView) {
        this.rootView = constraintLayout;
        this.anticipationTimeOne = dayView;
        this.anticipationTimeThree = dayView2;
        this.anticipationTimeTwo = dayView3;
        this.imageView2 = imageView;
        this.listAnticipationTime = constraintLayout2;
        this.textViewActicipationTime = textView;
    }

    public static ViewAnticipationTimeBinding bind(View view) {
        int i = R.id.anticipation_time_one;
        DayView dayView = (DayView) AbstractC0105a.t(view, i);
        if (dayView != null) {
            i = R.id.anticipation_time_three;
            DayView dayView2 = (DayView) AbstractC0105a.t(view, i);
            if (dayView2 != null) {
                i = R.id.anticipation_time_two;
                DayView dayView3 = (DayView) AbstractC0105a.t(view, i);
                if (dayView3 != null) {
                    i = R.id.imageView2;
                    ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                    if (imageView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = R.id.text_view_acticipation_time;
                        TextView textView = (TextView) AbstractC0105a.t(view, i);
                        if (textView != null) {
                            return new ViewAnticipationTimeBinding(constraintLayout, dayView, dayView2, dayView3, imageView, constraintLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewAnticipationTimeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewAnticipationTimeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.view_anticipation_time, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
