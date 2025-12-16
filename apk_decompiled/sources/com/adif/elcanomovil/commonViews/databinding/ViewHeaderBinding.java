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
public final class ViewHeaderBinding {
    public final Button buttonClose;
    public final Button buttonOnback;
    public final ConstraintLayout containerView;
    public final TextView headerTitle;
    public final ImageView onBackIcon;
    public final ImageView onCloseIcon;
    private final ConstraintLayout rootView;

    private ViewHeaderBinding(ConstraintLayout constraintLayout, Button button, Button button2, ConstraintLayout constraintLayout2, TextView textView, ImageView imageView, ImageView imageView2) {
        this.rootView = constraintLayout;
        this.buttonClose = button;
        this.buttonOnback = button2;
        this.containerView = constraintLayout2;
        this.headerTitle = textView;
        this.onBackIcon = imageView;
        this.onCloseIcon = imageView2;
    }

    public static ViewHeaderBinding bind(View view) {
        int i = R.id.button_close;
        Button button = (Button) AbstractC0105a.t(view, i);
        if (button != null) {
            i = R.id.button_onback;
            Button button2 = (Button) AbstractC0105a.t(view, i);
            if (button2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.headerTitle;
                TextView textView = (TextView) AbstractC0105a.t(view, i);
                if (textView != null) {
                    i = R.id.onBackIcon;
                    ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                    if (imageView != null) {
                        i = R.id.onCloseIcon;
                        ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
                        if (imageView2 != null) {
                            return new ViewHeaderBinding(constraintLayout, button, button2, constraintLayout, textView, imageView, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.view_header, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
