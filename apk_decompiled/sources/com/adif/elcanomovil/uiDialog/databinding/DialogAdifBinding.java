package com.adif.elcanomovil.uiDialog.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.uiDialog.R;

/* loaded from: classes2.dex */
public final class DialogAdifBinding {
    public final ConstraintLayout containerButtons;
    public final TextView header;
    public final TextView message;
    public final AppCompatButton negative;
    public final AppCompatButton neutral;
    public final AppCompatButton positive;
    private final ConstraintLayout rootView;
    public final ScrollView scroll;
    public final TextView title;

    private DialogAdifBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatButton appCompatButton3, ScrollView scrollView, TextView textView3) {
        this.rootView = constraintLayout;
        this.containerButtons = constraintLayout2;
        this.header = textView;
        this.message = textView2;
        this.negative = appCompatButton;
        this.neutral = appCompatButton2;
        this.positive = appCompatButton3;
        this.scroll = scrollView;
        this.title = textView3;
    }

    public static DialogAdifBinding bind(View view) {
        int i = R.id.containerButtons;
        ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC0105a.t(view, i);
        if (constraintLayout != null) {
            i = R.id.header;
            TextView textView = (TextView) AbstractC0105a.t(view, i);
            if (textView != null) {
                i = R.id.message;
                TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                if (textView2 != null) {
                    i = R.id.negative;
                    AppCompatButton appCompatButton = (AppCompatButton) AbstractC0105a.t(view, i);
                    if (appCompatButton != null) {
                        i = R.id.neutral;
                        AppCompatButton appCompatButton2 = (AppCompatButton) AbstractC0105a.t(view, i);
                        if (appCompatButton2 != null) {
                            i = R.id.positive;
                            AppCompatButton appCompatButton3 = (AppCompatButton) AbstractC0105a.t(view, i);
                            if (appCompatButton3 != null) {
                                i = R.id.scroll;
                                ScrollView scrollView = (ScrollView) AbstractC0105a.t(view, i);
                                if (scrollView != null) {
                                    i = R.id.title;
                                    TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                                    if (textView3 != null) {
                                        return new DialogAdifBinding((ConstraintLayout) view, constraintLayout, textView, textView2, appCompatButton, appCompatButton2, appCompatButton3, scrollView, textView3);
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

    public static DialogAdifBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogAdifBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.dialog_adif, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
