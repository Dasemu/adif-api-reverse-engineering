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
public final class ItemWidgetCirculationAvldmdBinding {
    public final TextView action;
    public final TextView delayedTime;
    public final ImageView indicatorLeft;
    public final ImageView indicatorRight;
    public final LinearLayout itemRow;
    public final TextView notesObservation;
    public final TextView number;
    public final TextView operator;
    public final TextView platform;
    public final LinearLayout platformAvldmd;
    public final TextView product;
    private final LinearLayout rootView;
    public final TextView station;
    public final ImageView suppressedTrain;
    public final TextView time;
    public final LinearLayout trainInfoAvldmd;

    private ItemWidgetCirculationAvldmdBinding(LinearLayout linearLayout, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, LinearLayout linearLayout3, TextView textView7, TextView textView8, ImageView imageView3, TextView textView9, LinearLayout linearLayout4) {
        this.rootView = linearLayout;
        this.action = textView;
        this.delayedTime = textView2;
        this.indicatorLeft = imageView;
        this.indicatorRight = imageView2;
        this.itemRow = linearLayout2;
        this.notesObservation = textView3;
        this.number = textView4;
        this.operator = textView5;
        this.platform = textView6;
        this.platformAvldmd = linearLayout3;
        this.product = textView7;
        this.station = textView8;
        this.suppressedTrain = imageView3;
        this.time = textView9;
        this.trainInfoAvldmd = linearLayout4;
    }

    public static ItemWidgetCirculationAvldmdBinding bind(View view) {
        int i = R.id.action;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            i = R.id.delayed_time;
            TextView textView2 = (TextView) AbstractC0105a.t(view, i);
            if (textView2 != null) {
                i = R.id.indicator_left;
                ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                if (imageView != null) {
                    i = R.id.indicator_right;
                    ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
                    if (imageView2 != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        i = R.id.notes_observation;
                        TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                        if (textView3 != null) {
                            i = R.id.number;
                            TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                            if (textView4 != null) {
                                i = R.id.operator;
                                TextView textView5 = (TextView) AbstractC0105a.t(view, i);
                                if (textView5 != null) {
                                    i = R.id.platform;
                                    TextView textView6 = (TextView) AbstractC0105a.t(view, i);
                                    if (textView6 != null) {
                                        i = R.id.platform_avldmd;
                                        LinearLayout linearLayout2 = (LinearLayout) AbstractC0105a.t(view, i);
                                        if (linearLayout2 != null) {
                                            i = R.id.product;
                                            TextView textView7 = (TextView) AbstractC0105a.t(view, i);
                                            if (textView7 != null) {
                                                i = R.id.station;
                                                TextView textView8 = (TextView) AbstractC0105a.t(view, i);
                                                if (textView8 != null) {
                                                    i = R.id.suppressed_train;
                                                    ImageView imageView3 = (ImageView) AbstractC0105a.t(view, i);
                                                    if (imageView3 != null) {
                                                        i = R.id.time;
                                                        TextView textView9 = (TextView) AbstractC0105a.t(view, i);
                                                        if (textView9 != null) {
                                                            i = R.id.train_info_avldmd;
                                                            LinearLayout linearLayout3 = (LinearLayout) AbstractC0105a.t(view, i);
                                                            if (linearLayout3 != null) {
                                                                return new ItemWidgetCirculationAvldmdBinding(linearLayout, textView, textView2, imageView, imageView2, linearLayout, textView3, textView4, textView5, textView6, linearLayout2, textView7, textView8, imageView3, textView9, linearLayout3);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemWidgetCirculationAvldmdBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemWidgetCirculationAvldmdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_widget_circulation_avldmd, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
