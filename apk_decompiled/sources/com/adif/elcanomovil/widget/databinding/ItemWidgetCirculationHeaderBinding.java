package com.adif.elcanomovil.widget.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.adif.elcanomovil.widget.R;

/* loaded from: classes3.dex */
public final class ItemWidgetCirculationHeaderBinding {
    public final TextView headerCirculationType;
    public final TextView headerDestinationStation;
    public final TextView headerTime;
    public final ImageView indicatorRight;
    public final LinearLayout llPlatform;
    public final LinearLayout llTrainOrLine;
    public final TextView platform;
    private final LinearLayout rootView;

    private ItemWidgetCirculationHeaderBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView4) {
        this.rootView = linearLayout;
        this.headerCirculationType = textView;
        this.headerDestinationStation = textView2;
        this.headerTime = textView3;
        this.indicatorRight = imageView;
        this.llPlatform = linearLayout2;
        this.llTrainOrLine = linearLayout3;
        this.platform = textView4;
    }

    public static ItemWidgetCirculationHeaderBinding bind(View view) {
        int i = R.id.header_circulation_type;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            i = R.id.header_destination_station;
            TextView textView2 = (TextView) AbstractC0105a.t(view, i);
            if (textView2 != null) {
                i = R.id.header_time;
                TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                if (textView3 != null) {
                    i = R.id.indicator_right;
                    ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                    if (imageView != null) {
                        i = R.id.ll_platform;
                        LinearLayout linearLayout = (LinearLayout) AbstractC0105a.t(view, i);
                        if (linearLayout != null) {
                            i = R.id.ll_trainOrLine;
                            LinearLayout linearLayout2 = (LinearLayout) AbstractC0105a.t(view, i);
                            if (linearLayout2 != null) {
                                i = R.id.platform;
                                TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                                if (textView4 != null) {
                                    return new ItemWidgetCirculationHeaderBinding((LinearLayout) view, textView, textView2, textView3, imageView, linearLayout, linearLayout2, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemWidgetCirculationHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemWidgetCirculationHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_widget_circulation_header, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
