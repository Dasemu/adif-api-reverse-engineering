package com.adif.elcanomovil.uiAvisa.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.adif.elcanomovil.uiAvisa.R;

/* loaded from: classes.dex */
public final class LayoutEmptyListResultsBinding {
    public final Button actionButtonRetrys;
    public final TextView emptyMessageTextvieww;
    public final ImageView emptyResultsImageview;
    public final TextView emptyTitleTextvieww;
    private final LinearLayout rootView;

    private LayoutEmptyListResultsBinding(LinearLayout linearLayout, Button button, TextView textView, ImageView imageView, TextView textView2) {
        this.rootView = linearLayout;
        this.actionButtonRetrys = button;
        this.emptyMessageTextvieww = textView;
        this.emptyResultsImageview = imageView;
        this.emptyTitleTextvieww = textView2;
    }

    public static LayoutEmptyListResultsBinding bind(View view) {
        int i = R.id.action_button_retrys;
        Button button = (Button) AbstractC0105a.t(view, i);
        if (button != null) {
            i = R.id.empty_message_textvieww;
            TextView textView = (TextView) AbstractC0105a.t(view, i);
            if (textView != null) {
                i = R.id.empty_results_imageview;
                ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                if (imageView != null) {
                    i = R.id.empty_title_textvieww;
                    TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                    if (textView2 != null) {
                        return new LayoutEmptyListResultsBinding((LinearLayout) view, button, textView, imageView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LayoutEmptyListResultsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutEmptyListResultsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.layout_empty_list_results, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
