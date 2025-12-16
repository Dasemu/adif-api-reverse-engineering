package com.adif.elcanomovil.widget.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.adif.elcanomovil.widget.R;

/* loaded from: classes3.dex */
public final class ItemWidgetEmptyBinding {
    public final Button actionButton;
    public final TextView emptySubtitle;
    public final TextView emptyTitle;
    public final ImageView imageView;
    private final LinearLayout rootView;

    private ItemWidgetEmptyBinding(LinearLayout linearLayout, Button button, TextView textView, TextView textView2, ImageView imageView) {
        this.rootView = linearLayout;
        this.actionButton = button;
        this.emptySubtitle = textView;
        this.emptyTitle = textView2;
        this.imageView = imageView;
    }

    public static ItemWidgetEmptyBinding bind(View view) {
        int i = R.id.action_button;
        Button button = (Button) AbstractC0105a.t(view, i);
        if (button != null) {
            i = R.id.empty_subtitle;
            TextView textView = (TextView) AbstractC0105a.t(view, i);
            if (textView != null) {
                i = R.id.empty_title;
                TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                if (textView2 != null) {
                    i = R.id.imageView;
                    ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                    if (imageView != null) {
                        return new ItemWidgetEmptyBinding((LinearLayout) view, button, textView, textView2, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemWidgetEmptyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemWidgetEmptyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_widget_empty, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
