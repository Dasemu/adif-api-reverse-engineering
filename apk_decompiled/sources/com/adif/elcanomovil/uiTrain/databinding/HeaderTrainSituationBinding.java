package com.adif.elcanomovil.uiTrain.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.adif.elcanomovil.uiTrain.R;

/* loaded from: classes3.dex */
public final class HeaderTrainSituationBinding {
    public final FrameLayout flPlatform;
    public final Guideline guideline20;
    public final Guideline guideline90;
    public final LinearLayout linearLayout;
    public final LinearLayout linearLayout2;
    public final TextView platform;
    private final ConstraintLayout rootView;
    public final TextView station;

    private HeaderTrainSituationBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, Guideline guideline, Guideline guideline2, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.flPlatform = frameLayout;
        this.guideline20 = guideline;
        this.guideline90 = guideline2;
        this.linearLayout = linearLayout;
        this.linearLayout2 = linearLayout2;
        this.platform = textView;
        this.station = textView2;
    }

    public static HeaderTrainSituationBinding bind(View view) {
        int i = R.id.fl_platform;
        FrameLayout frameLayout = (FrameLayout) AbstractC0105a.t(view, i);
        if (frameLayout != null) {
            i = R.id.guideline20;
            Guideline guideline = (Guideline) AbstractC0105a.t(view, i);
            if (guideline != null) {
                i = R.id.guideline90;
                Guideline guideline2 = (Guideline) AbstractC0105a.t(view, i);
                if (guideline2 != null) {
                    i = R.id.linearLayout;
                    LinearLayout linearLayout = (LinearLayout) AbstractC0105a.t(view, i);
                    if (linearLayout != null) {
                        i = R.id.linearLayout2;
                        LinearLayout linearLayout2 = (LinearLayout) AbstractC0105a.t(view, i);
                        if (linearLayout2 != null) {
                            i = R.id.platform;
                            TextView textView = (TextView) AbstractC0105a.t(view, i);
                            if (textView != null) {
                                i = R.id.station;
                                TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                                if (textView2 != null) {
                                    return new HeaderTrainSituationBinding((ConstraintLayout) view, frameLayout, guideline, guideline2, linearLayout, linearLayout2, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static HeaderTrainSituationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HeaderTrainSituationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.header_train_situation, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
