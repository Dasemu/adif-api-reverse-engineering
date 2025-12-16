package com.adif.elcanomovil.commonViews.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.R;

/* loaded from: classes.dex */
public final class ViewDayBinding {
    public final Button buttonOnclick;
    public final ConstraintLayout containerDayView;
    public final FrameLayout dayBackground;
    public final TextView dayTitle;
    public final AppCompatImageView disableView;
    private final ConstraintLayout rootView;

    private ViewDayBinding(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, FrameLayout frameLayout, TextView textView, AppCompatImageView appCompatImageView) {
        this.rootView = constraintLayout;
        this.buttonOnclick = button;
        this.containerDayView = constraintLayout2;
        this.dayBackground = frameLayout;
        this.dayTitle = textView;
        this.disableView = appCompatImageView;
    }

    public static ViewDayBinding bind(View view) {
        int i = R.id.button_onclick;
        Button button = (Button) AbstractC0105a.t(view, i);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.day_background;
            FrameLayout frameLayout = (FrameLayout) AbstractC0105a.t(view, i);
            if (frameLayout != null) {
                i = R.id.dayTitle;
                TextView textView = (TextView) AbstractC0105a.t(view, i);
                if (textView != null) {
                    i = R.id.disableView;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC0105a.t(view, i);
                    if (appCompatImageView != null) {
                        return new ViewDayBinding(constraintLayout, button, constraintLayout, frameLayout, textView, appCompatImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewDayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewDayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.view_day, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
