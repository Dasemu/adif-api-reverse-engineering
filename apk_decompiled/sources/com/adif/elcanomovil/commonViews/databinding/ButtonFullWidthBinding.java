package com.adif.elcanomovil.commonViews.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.adif.elcanomovil.commonViews.R;

/* loaded from: classes.dex */
public final class ButtonFullWidthBinding {
    private final View rootView;
    public final TextView text;

    private ButtonFullWidthBinding(View view, TextView textView) {
        this.rootView = view;
        this.text = textView;
    }

    public static ButtonFullWidthBinding bind(View view) {
        int i = R.id.text;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            return new ButtonFullWidthBinding(view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ButtonFullWidthBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.button_full_width, viewGroup);
        return bind(viewGroup);
    }

    public View getRoot() {
        return this.rootView;
    }
}
