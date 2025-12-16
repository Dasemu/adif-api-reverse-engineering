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
public final class ItemWidgetCirculationCercaniasBinding {
    public final ImageView accessibility;
    public final ImageView indicatorLeft;
    public final ImageView indicatorRight;
    public final LinearLayout itemRow;
    public final TextView line;
    public final LinearLayout lineCercanias;
    public final ImageView logo;
    public final TextView notesObservation;
    public final TextView platform;
    public final LinearLayout platformCercanias;
    private final LinearLayout rootView;
    public final TextView station;
    public final TextView time;

    private ItemWidgetCirculationCercaniasBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout2, TextView textView, LinearLayout linearLayout3, ImageView imageView4, TextView textView2, TextView textView3, LinearLayout linearLayout4, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.accessibility = imageView;
        this.indicatorLeft = imageView2;
        this.indicatorRight = imageView3;
        this.itemRow = linearLayout2;
        this.line = textView;
        this.lineCercanias = linearLayout3;
        this.logo = imageView4;
        this.notesObservation = textView2;
        this.platform = textView3;
        this.platformCercanias = linearLayout4;
        this.station = textView4;
        this.time = textView5;
    }

    public static ItemWidgetCirculationCercaniasBinding bind(View view) {
        int i = R.id.accessibility;
        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
        if (imageView != null) {
            i = R.id.indicator_left;
            ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
            if (imageView2 != null) {
                i = R.id.indicator_right;
                ImageView imageView3 = (ImageView) AbstractC0105a.t(view, i);
                if (imageView3 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i = R.id.line;
                    TextView textView = (TextView) AbstractC0105a.t(view, i);
                    if (textView != null) {
                        i = R.id.line_cercanias;
                        LinearLayout linearLayout2 = (LinearLayout) AbstractC0105a.t(view, i);
                        if (linearLayout2 != null) {
                            i = R.id.logo;
                            ImageView imageView4 = (ImageView) AbstractC0105a.t(view, i);
                            if (imageView4 != null) {
                                i = R.id.notes_observation;
                                TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                                if (textView2 != null) {
                                    i = R.id.platform;
                                    TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                                    if (textView3 != null) {
                                        i = R.id.platform_cercanias;
                                        LinearLayout linearLayout3 = (LinearLayout) AbstractC0105a.t(view, i);
                                        if (linearLayout3 != null) {
                                            i = R.id.station;
                                            TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                                            if (textView4 != null) {
                                                i = R.id.time;
                                                TextView textView5 = (TextView) AbstractC0105a.t(view, i);
                                                if (textView5 != null) {
                                                    return new ItemWidgetCirculationCercaniasBinding(linearLayout, imageView, imageView2, imageView3, linearLayout, textView, linearLayout2, imageView4, textView2, textView3, linearLayout3, textView4, textView5);
                                                }
                                            }
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

    public static ItemWidgetCirculationCercaniasBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemWidgetCirculationCercaniasBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_widget_circulation_cercanias, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
