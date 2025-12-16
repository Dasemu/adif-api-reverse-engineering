package com.adif.elcanomovil.commonViews.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.adif.elcanomovil.commonViews.R;

/* loaded from: classes.dex */
public final class FragmentDialogLoadingBinding {
    public final LinearLayout containerDialog;
    public final TextView dialogMessage;
    public final ProgressBar progressBar2;
    private final LinearLayout rootView;

    private FragmentDialogLoadingBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, ProgressBar progressBar) {
        this.rootView = linearLayout;
        this.containerDialog = linearLayout2;
        this.dialogMessage = textView;
        this.progressBar2 = progressBar;
    }

    public static FragmentDialogLoadingBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.dialog_message;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            i = R.id.progressBar2;
            ProgressBar progressBar = (ProgressBar) AbstractC0105a.t(view, i);
            if (progressBar != null) {
                return new FragmentDialogLoadingBinding(linearLayout, linearLayout, textView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentDialogLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDialogLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_dialog_loading, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
