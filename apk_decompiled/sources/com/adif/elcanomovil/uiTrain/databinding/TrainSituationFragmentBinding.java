package com.adif.elcanomovil.uiTrain.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.commonViews.databinding.LoadingEmptyOrErrorCommonViewBinding;
import com.adif.elcanomovil.uiTrain.R;
import com.adif.elcanomovil.uiTrain.main.TrainCompositionView;

/* loaded from: classes3.dex */
public final class TrainSituationFragmentBinding {
    public final ImageButton buttonOnback;
    public final ConstraintLayout clStations;
    public final ImageView corporateOptions;
    public final TextView departureDate;
    public final ImageView directionArrow;
    public final TextView estimatedStationFrom;
    public final TextView estimatedStationTo;
    public final ImageView favourite;
    public final ImageView imageView;
    public final LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorView;
    public final ImageView observations;
    private final ConstraintLayout rootView;
    public final RecyclerView rvSteps;
    public final HeaderTrainSituationBinding rvStepsHeader;
    public final NestedScrollView scrollView;
    public final ImageView share;
    public final TextView stationFrom;
    public final TextView stationFromPlatformHeader;
    public final TextView stationFromPlatformNumber;
    public final LinearLayout stationOptions;
    public final TextView stationTo;
    public final TextView stationToPlatform;
    public final TextView stationToPlatformHeader;
    public final TextView timeDelayedStationFrom;
    public final TextView timeDelayedStationTo;
    public final TextView timeStationFrom;
    public final TextView timeStationTo;
    public final TrainCompositionView trainComposition;
    public final TextView trainNumber;
    public final TextView trainOperator;
    public final ConstraintLayout trainSearch;
    public final TextView trainType;
    public final TextView tvHintText;
    public final ImageView twitter;

    private TrainSituationFragmentBinding(ConstraintLayout constraintLayout, ImageButton imageButton, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, TextView textView3, ImageView imageView3, ImageView imageView4, LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding, ImageView imageView5, RecyclerView recyclerView, HeaderTrainSituationBinding headerTrainSituationBinding, NestedScrollView nestedScrollView, ImageView imageView6, TextView textView4, TextView textView5, TextView textView6, LinearLayout linearLayout, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TrainCompositionView trainCompositionView, TextView textView14, TextView textView15, ConstraintLayout constraintLayout3, TextView textView16, TextView textView17, ImageView imageView7) {
        this.rootView = constraintLayout;
        this.buttonOnback = imageButton;
        this.clStations = constraintLayout2;
        this.corporateOptions = imageView;
        this.departureDate = textView;
        this.directionArrow = imageView2;
        this.estimatedStationFrom = textView2;
        this.estimatedStationTo = textView3;
        this.favourite = imageView3;
        this.imageView = imageView4;
        this.loadingEmptyOrErrorView = loadingEmptyOrErrorCommonViewBinding;
        this.observations = imageView5;
        this.rvSteps = recyclerView;
        this.rvStepsHeader = headerTrainSituationBinding;
        this.scrollView = nestedScrollView;
        this.share = imageView6;
        this.stationFrom = textView4;
        this.stationFromPlatformHeader = textView5;
        this.stationFromPlatformNumber = textView6;
        this.stationOptions = linearLayout;
        this.stationTo = textView7;
        this.stationToPlatform = textView8;
        this.stationToPlatformHeader = textView9;
        this.timeDelayedStationFrom = textView10;
        this.timeDelayedStationTo = textView11;
        this.timeStationFrom = textView12;
        this.timeStationTo = textView13;
        this.trainComposition = trainCompositionView;
        this.trainNumber = textView14;
        this.trainOperator = textView15;
        this.trainSearch = constraintLayout3;
        this.trainType = textView16;
        this.tvHintText = textView17;
        this.twitter = imageView7;
    }

    public static TrainSituationFragmentBinding bind(View view) {
        View t2;
        View t4;
        int i = R.id.button_onback;
        ImageButton imageButton = (ImageButton) AbstractC0105a.t(view, i);
        if (imageButton != null) {
            i = R.id.cl_stations;
            ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC0105a.t(view, i);
            if (constraintLayout != null) {
                i = R.id.corporate_options;
                ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                if (imageView != null) {
                    i = R.id.departure_date;
                    TextView textView = (TextView) AbstractC0105a.t(view, i);
                    if (textView != null) {
                        i = R.id.direction_arrow;
                        ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
                        if (imageView2 != null) {
                            i = R.id.estimated_station_from;
                            TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                            if (textView2 != null) {
                                i = R.id.estimated_station_to;
                                TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                                if (textView3 != null) {
                                    i = R.id.favourite;
                                    ImageView imageView3 = (ImageView) AbstractC0105a.t(view, i);
                                    if (imageView3 != null) {
                                        i = R.id.imageView;
                                        ImageView imageView4 = (ImageView) AbstractC0105a.t(view, i);
                                        if (imageView4 != null && (t2 = AbstractC0105a.t(view, (i = R.id.loading_empty_or_error_view))) != null) {
                                            LoadingEmptyOrErrorCommonViewBinding bind = LoadingEmptyOrErrorCommonViewBinding.bind(t2);
                                            i = R.id.observations;
                                            ImageView imageView5 = (ImageView) AbstractC0105a.t(view, i);
                                            if (imageView5 != null) {
                                                i = R.id.rv_steps;
                                                RecyclerView recyclerView = (RecyclerView) AbstractC0105a.t(view, i);
                                                if (recyclerView != null && (t4 = AbstractC0105a.t(view, (i = R.id.rv_steps_header))) != null) {
                                                    HeaderTrainSituationBinding bind2 = HeaderTrainSituationBinding.bind(t4);
                                                    i = R.id.scroll_view;
                                                    NestedScrollView nestedScrollView = (NestedScrollView) AbstractC0105a.t(view, i);
                                                    if (nestedScrollView != null) {
                                                        i = R.id.share;
                                                        ImageView imageView6 = (ImageView) AbstractC0105a.t(view, i);
                                                        if (imageView6 != null) {
                                                            i = R.id.station_from;
                                                            TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                                                            if (textView4 != null) {
                                                                i = R.id.station_from_platform_header;
                                                                TextView textView5 = (TextView) AbstractC0105a.t(view, i);
                                                                if (textView5 != null) {
                                                                    i = R.id.station_from_platform_number;
                                                                    TextView textView6 = (TextView) AbstractC0105a.t(view, i);
                                                                    if (textView6 != null) {
                                                                        i = R.id.station_options;
                                                                        LinearLayout linearLayout = (LinearLayout) AbstractC0105a.t(view, i);
                                                                        if (linearLayout != null) {
                                                                            i = R.id.station_to;
                                                                            TextView textView7 = (TextView) AbstractC0105a.t(view, i);
                                                                            if (textView7 != null) {
                                                                                i = R.id.station_to_platform;
                                                                                TextView textView8 = (TextView) AbstractC0105a.t(view, i);
                                                                                if (textView8 != null) {
                                                                                    i = R.id.station_to_platform_header;
                                                                                    TextView textView9 = (TextView) AbstractC0105a.t(view, i);
                                                                                    if (textView9 != null) {
                                                                                        i = R.id.time_delayed_station_from;
                                                                                        TextView textView10 = (TextView) AbstractC0105a.t(view, i);
                                                                                        if (textView10 != null) {
                                                                                            i = R.id.time_delayed_station_to;
                                                                                            TextView textView11 = (TextView) AbstractC0105a.t(view, i);
                                                                                            if (textView11 != null) {
                                                                                                i = R.id.time_station_from;
                                                                                                TextView textView12 = (TextView) AbstractC0105a.t(view, i);
                                                                                                if (textView12 != null) {
                                                                                                    i = R.id.time_station_to;
                                                                                                    TextView textView13 = (TextView) AbstractC0105a.t(view, i);
                                                                                                    if (textView13 != null) {
                                                                                                        i = R.id.train_composition;
                                                                                                        TrainCompositionView trainCompositionView = (TrainCompositionView) AbstractC0105a.t(view, i);
                                                                                                        if (trainCompositionView != null) {
                                                                                                            i = R.id.train_number;
                                                                                                            TextView textView14 = (TextView) AbstractC0105a.t(view, i);
                                                                                                            if (textView14 != null) {
                                                                                                                i = R.id.train_operator;
                                                                                                                TextView textView15 = (TextView) AbstractC0105a.t(view, i);
                                                                                                                if (textView15 != null) {
                                                                                                                    i = R.id.train_search;
                                                                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) AbstractC0105a.t(view, i);
                                                                                                                    if (constraintLayout2 != null) {
                                                                                                                        i = R.id.train_type;
                                                                                                                        TextView textView16 = (TextView) AbstractC0105a.t(view, i);
                                                                                                                        if (textView16 != null) {
                                                                                                                            i = R.id.tv_hintText;
                                                                                                                            TextView textView17 = (TextView) AbstractC0105a.t(view, i);
                                                                                                                            if (textView17 != null) {
                                                                                                                                i = R.id.twitter;
                                                                                                                                ImageView imageView7 = (ImageView) AbstractC0105a.t(view, i);
                                                                                                                                if (imageView7 != null) {
                                                                                                                                    return new TrainSituationFragmentBinding((ConstraintLayout) view, imageButton, constraintLayout, imageView, textView, imageView2, textView2, textView3, imageView3, imageView4, bind, imageView5, recyclerView, bind2, nestedScrollView, imageView6, textView4, textView5, textView6, linearLayout, textView7, textView8, textView9, textView10, textView11, textView12, textView13, trainCompositionView, textView14, textView15, constraintLayout2, textView16, textView17, imageView7);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static TrainSituationFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static TrainSituationFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.train_situation_fragment, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
