package com.adif.elcanomovil.uiDepartures.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.adif.elcanomovil.uiDepartures.R;

/* loaded from: classes2.dex */
public final class ViewCirculationHeaderBinding {
    public final Guideline guideline20;
    public final Guideline guideline75;
    public final Guideline guideline90;
    public final TextView platform;
    private final ConstraintLayout rootView;
    public final TextView station;
    public final TextView time;
    public final TextView type;

    private ViewCirculationHeaderBinding(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.guideline20 = guideline;
        this.guideline75 = guideline2;
        this.guideline90 = guideline3;
        this.platform = textView;
        this.station = textView2;
        this.time = textView3;
        this.type = textView4;
    }

    public static ViewCirculationHeaderBinding bind(View view) {
        int i = R.id.guideline20;
        Guideline guideline = (Guideline) AbstractC0105a.t(view, i);
        if (guideline != null) {
            i = R.id.guideline75;
            Guideline guideline2 = (Guideline) AbstractC0105a.t(view, i);
            if (guideline2 != null) {
                i = R.id.guideline90;
                Guideline guideline3 = (Guideline) AbstractC0105a.t(view, i);
                if (guideline3 != null) {
                    i = R.id.platform;
                    TextView textView = (TextView) AbstractC0105a.t(view, i);
                    if (textView != null) {
                        i = R.id.station;
                        TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                        if (textView2 != null) {
                            i = R.id.time;
                            TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                            if (textView3 != null) {
                                i = R.id.type;
                                TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                                if (textView4 != null) {
                                    return new ViewCirculationHeaderBinding((ConstraintLayout) view, guideline, guideline2, guideline3, textView, textView2, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewCirculationHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewCirculationHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.view_circulation_header, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
