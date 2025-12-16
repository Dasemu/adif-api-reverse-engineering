package com.adif.elcanomovil.commonViews.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.R;

/* loaded from: classes.dex */
public final class ViewStationOptionBinding {
    private final ConstraintLayout rootView;
    public final View stationOptionDisabledView;
    public final TextView stationOptionDistance;
    public final ImageView stationOptionIcon;
    public final TextView stationOptionSubtitle;
    public final TextView stationOptionTitle;

    private ViewStationOptionBinding(ConstraintLayout constraintLayout, View view, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.stationOptionDisabledView = view;
        this.stationOptionDistance = textView;
        this.stationOptionIcon = imageView;
        this.stationOptionSubtitle = textView2;
        this.stationOptionTitle = textView3;
    }

    public static ViewStationOptionBinding bind(View view) {
        int i = R.id.stationOptionDisabledView;
        View t2 = AbstractC0105a.t(view, i);
        if (t2 != null) {
            i = R.id.stationOptionDistance;
            TextView textView = (TextView) AbstractC0105a.t(view, i);
            if (textView != null) {
                i = R.id.stationOptionIcon;
                ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                if (imageView != null) {
                    i = R.id.stationOptionSubtitle;
                    TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                    if (textView2 != null) {
                        i = R.id.stationOptionTitle;
                        TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                        if (textView3 != null) {
                            return new ViewStationOptionBinding((ConstraintLayout) view, t2, textView, imageView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewStationOptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewStationOptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.view_station_option, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
