package com.adif.elcanomovil.uiAvisa.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.adif.elcanomovil.uiAvisa.R;

/* loaded from: classes.dex */
public final class DialogTextLayoutBinding {
    public final Button button;
    public final Button button2;
    public final Guideline guidelineH1;
    public final Guideline guidelineH2;
    public final Guideline guidelineV1;
    public final Guideline guidelineV2;
    public final ConstraintLayout linearLayout;
    private final ConstraintLayout rootView;
    public final TextView textViewBlock;
    public final TextView textViewTitle;
    public final View view5;

    private DialogTextLayoutBinding(ConstraintLayout constraintLayout, Button button, Button button2, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, View view) {
        this.rootView = constraintLayout;
        this.button = button;
        this.button2 = button2;
        this.guidelineH1 = guideline;
        this.guidelineH2 = guideline2;
        this.guidelineV1 = guideline3;
        this.guidelineV2 = guideline4;
        this.linearLayout = constraintLayout2;
        this.textViewBlock = textView;
        this.textViewTitle = textView2;
        this.view5 = view;
    }

    public static DialogTextLayoutBinding bind(View view) {
        View t2;
        int i = R.id.button;
        Button button = (Button) AbstractC0105a.t(view, i);
        if (button != null) {
            i = R.id.button2;
            Button button2 = (Button) AbstractC0105a.t(view, i);
            if (button2 != null) {
                i = R.id.guidelineH1;
                Guideline guideline = (Guideline) AbstractC0105a.t(view, i);
                if (guideline != null) {
                    i = R.id.guidelineH2;
                    Guideline guideline2 = (Guideline) AbstractC0105a.t(view, i);
                    if (guideline2 != null) {
                        i = R.id.guidelineV1;
                        Guideline guideline3 = (Guideline) AbstractC0105a.t(view, i);
                        if (guideline3 != null) {
                            i = R.id.guidelineV2;
                            Guideline guideline4 = (Guideline) AbstractC0105a.t(view, i);
                            if (guideline4 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i = R.id.textViewBlock;
                                TextView textView = (TextView) AbstractC0105a.t(view, i);
                                if (textView != null) {
                                    i = R.id.textViewTitle;
                                    TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                                    if (textView2 != null && (t2 = AbstractC0105a.t(view, (i = R.id.view5))) != null) {
                                        return new DialogTextLayoutBinding(constraintLayout, button, button2, guideline, guideline2, guideline3, guideline4, constraintLayout, textView, textView2, t2);
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

    public static DialogTextLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogTextLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.dialog_text_layout, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
