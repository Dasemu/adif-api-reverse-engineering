package com.adif.elcanomovil.uiAvisa.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.adif.elcanomovil.uiAvisa.R;

/* loaded from: classes.dex */
public final class MarkerWindowMapBinding {
    public final RelativeLayout layoutInformacion;
    public final ImageView mapMarkerIconArrow;
    public final TextView mePosition;
    private final RelativeLayout rootView;
    public final TextView stationTextView;
    public final TextView textViewFar;

    private MarkerWindowMapBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = relativeLayout;
        this.layoutInformacion = relativeLayout2;
        this.mapMarkerIconArrow = imageView;
        this.mePosition = textView;
        this.stationTextView = textView2;
        this.textViewFar = textView3;
    }

    public static MarkerWindowMapBinding bind(View view) {
        int i = R.id.layoutInformacion;
        RelativeLayout relativeLayout = (RelativeLayout) AbstractC0105a.t(view, i);
        if (relativeLayout != null) {
            i = R.id.map_marker_icon_arrow;
            ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
            if (imageView != null) {
                i = R.id.mePosition;
                TextView textView = (TextView) AbstractC0105a.t(view, i);
                if (textView != null) {
                    i = R.id.stationTextView;
                    TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                    if (textView2 != null) {
                        i = R.id.textViewFar;
                        TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                        if (textView3 != null) {
                            return new MarkerWindowMapBinding((RelativeLayout) view, relativeLayout, imageView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static MarkerWindowMapBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MarkerWindowMapBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.marker_window_map, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
