package com.adif.elcanomovil.uiAvisa.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.adif.elcanomovil.uiAvisa.R;

/* loaded from: classes.dex */
public final class ButtonWithDrawableFullWidthBinding {
    private final View rootView;
    public final TextView text;

    private ButtonWithDrawableFullWidthBinding(View view, TextView textView) {
        this.rootView = view;
        this.text = textView;
    }

    public static ButtonWithDrawableFullWidthBinding bind(View view) {
        int i = R.id.text;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            return new ButtonWithDrawableFullWidthBinding(view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ButtonWithDrawableFullWidthBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.button_with_drawable_full_width, viewGroup);
        return bind(viewGroup);
    }

    public View getRoot() {
        return this.rootView;
    }
}
