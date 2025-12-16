package com.adif.elcanomovil.commonViews.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.R;

/* loaded from: classes.dex */
public final class ViewInfoBinding {
    public final Button actionButtonRetry;
    public final ConstraintLayout containerViewInfo;
    public final ImageView imageViewInfo;
    private final ConstraintLayout rootView;
    public final TextView textViewMsg;
    public final TextView textViewTitle;

    private ViewInfoBinding(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.actionButtonRetry = button;
        this.containerViewInfo = constraintLayout2;
        this.imageViewInfo = imageView;
        this.textViewMsg = textView;
        this.textViewTitle = textView2;
    }

    public static ViewInfoBinding bind(View view) {
        int i = R.id.action_button_retry;
        Button button = (Button) AbstractC0105a.t(view, i);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.imageViewInfo;
            ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
            if (imageView != null) {
                i = R.id.textViewMsg;
                TextView textView = (TextView) AbstractC0105a.t(view, i);
                if (textView != null) {
                    i = R.id.textViewTitle;
                    TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                    if (textView2 != null) {
                        return new ViewInfoBinding(constraintLayout, button, constraintLayout, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.view_info, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
