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
public final class WidgetMainHeaderBinding {
    public final LinearLayout linearLayout2;
    private final LinearLayout rootView;
    public final LinearLayout rowContainer;
    public final TextView station;
    public final TextView stationto;
    public final TextView tvTypeOfTrain;
    public final ImageView widgetHeaderDirection;
    public final ImageView widgetHeaderRefreshStation;
    public final ImageView widgetHeaderSwitchStations;
    public final TextView widgetHeaderUpdated;
    public final TextView widgetHeaderUpdatedTime;

    private WidgetMainHeaderBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.linearLayout2 = linearLayout2;
        this.rowContainer = linearLayout3;
        this.station = textView;
        this.stationto = textView2;
        this.tvTypeOfTrain = textView3;
        this.widgetHeaderDirection = imageView;
        this.widgetHeaderRefreshStation = imageView2;
        this.widgetHeaderSwitchStations = imageView3;
        this.widgetHeaderUpdated = textView4;
        this.widgetHeaderUpdatedTime = textView5;
    }

    public static WidgetMainHeaderBinding bind(View view) {
        int i = R.id.linearLayout2;
        LinearLayout linearLayout = (LinearLayout) AbstractC0105a.t(view, i);
        if (linearLayout != null) {
            LinearLayout linearLayout2 = (LinearLayout) view;
            i = R.id.station;
            TextView textView = (TextView) AbstractC0105a.t(view, i);
            if (textView != null) {
                i = R.id.stationto;
                TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                if (textView2 != null) {
                    i = R.id.tv_typeOfTrain;
                    TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                    if (textView3 != null) {
                        i = R.id.widget_header_direction;
                        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                        if (imageView != null) {
                            i = R.id.widget_header_refresh_station;
                            ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
                            if (imageView2 != null) {
                                i = R.id.widget_header_switch_stations;
                                ImageView imageView3 = (ImageView) AbstractC0105a.t(view, i);
                                if (imageView3 != null) {
                                    i = R.id.widget_header_updated;
                                    TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                                    if (textView4 != null) {
                                        i = R.id.widget_header_updated_time;
                                        TextView textView5 = (TextView) AbstractC0105a.t(view, i);
                                        if (textView5 != null) {
                                            return new WidgetMainHeaderBinding(linearLayout2, linearLayout, linearLayout2, textView, textView2, textView3, imageView, imageView2, imageView3, textView4, textView5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static WidgetMainHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WidgetMainHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.widget_main_header, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
