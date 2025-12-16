package com.adif.elcanomovil.commonViews.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.adif.elcanomovil.commonViews.R;

/* loaded from: classes.dex */
public final class ViewEmptySelectStationOrTrainBinding {
    public final ImageView icon;
    public final TextView message;
    private final LinearLayout rootView;
    public final TextView title;

    private ViewEmptySelectStationOrTrainBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.icon = imageView;
        this.message = textView;
        this.title = textView2;
    }

    public static ViewEmptySelectStationOrTrainBinding bind(View view) {
        int i = R.id.icon;
        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
        if (imageView != null) {
            i = R.id.message;
            TextView textView = (TextView) AbstractC0105a.t(view, i);
            if (textView != null) {
                i = R.id.title;
                TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                if (textView2 != null) {
                    return new ViewEmptySelectStationOrTrainBinding((LinearLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewEmptySelectStationOrTrainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewEmptySelectStationOrTrainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.view_empty_select_station_or_train, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
