package com.adif.elcanomovil.uiSubscriptions.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.TrainTypeSelector;
import com.adif.elcanomovil.uiSubscriptions.R;

/* loaded from: classes3.dex */
public final class ViewSubscriptionJourneyBinding {
    public final ImageView imageView3;
    private final ConstraintLayout rootView;
    public final ImageView search;
    public final ImageView searchTo;
    public final TextView station;
    public final TextView stationTo;
    public final ImageButton switchStations;
    public final TextClock textViewDateFrom;
    public final TextView textViewFrom;
    public final TextView textViewTitle;
    public final TrainTypeSelector trainSelector;

    private ViewSubscriptionJourneyBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, ImageButton imageButton, TextClock textClock, TextView textView3, TextView textView4, TrainTypeSelector trainTypeSelector) {
        this.rootView = constraintLayout;
        this.imageView3 = imageView;
        this.search = imageView2;
        this.searchTo = imageView3;
        this.station = textView;
        this.stationTo = textView2;
        this.switchStations = imageButton;
        this.textViewDateFrom = textClock;
        this.textViewFrom = textView3;
        this.textViewTitle = textView4;
        this.trainSelector = trainTypeSelector;
    }

    public static ViewSubscriptionJourneyBinding bind(View view) {
        int i = R.id.imageView3;
        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
        if (imageView != null) {
            i = R.id.search;
            ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
            if (imageView2 != null) {
                i = R.id.search_to;
                ImageView imageView3 = (ImageView) AbstractC0105a.t(view, i);
                if (imageView3 != null) {
                    i = R.id.station;
                    TextView textView = (TextView) AbstractC0105a.t(view, i);
                    if (textView != null) {
                        i = R.id.station_to;
                        TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                        if (textView2 != null) {
                            i = R.id.switch_stations;
                            ImageButton imageButton = (ImageButton) AbstractC0105a.t(view, i);
                            if (imageButton != null) {
                                i = R.id.textViewDateFrom;
                                TextClock textClock = (TextClock) AbstractC0105a.t(view, i);
                                if (textClock != null) {
                                    i = R.id.text_view_from;
                                    TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                                    if (textView3 != null) {
                                        i = R.id.textView_title;
                                        TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                                        if (textView4 != null) {
                                            i = R.id.train_selector;
                                            TrainTypeSelector trainTypeSelector = (TrainTypeSelector) AbstractC0105a.t(view, i);
                                            if (trainTypeSelector != null) {
                                                return new ViewSubscriptionJourneyBinding((ConstraintLayout) view, imageView, imageView2, imageView3, textView, textView2, imageButton, textClock, textView3, textView4, trainTypeSelector);
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

    public static ViewSubscriptionJourneyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewSubscriptionJourneyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.view_subscription_journey, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
