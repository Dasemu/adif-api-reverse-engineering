package com.adif.elcanomovil.uiSubscriptions.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.HeaderView;
import com.adif.elcanomovil.commonViews.InfoView;
import com.adif.elcanomovil.uiSubscriptions.R;
import com.adif.elcanomovil.uiSubscriptions.create.views.JourneyView;
import com.adif.elcanomovil.uiSubscriptions.create.views.TrainView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes3.dex */
public final class SubscriptionCreationFragmentBinding {
    public final ViewAnticipationTimeBinding anticipationTime;
    public final ConstraintLayout containerAnticipationTime;
    public final ConstraintLayout containerCreation;
    public final ConstraintLayout containerRepetitionTime;
    public final InfoView emptyView;
    public final MaterialButton fab;
    public final JourneyView headerJourneyView;
    public final HeaderView headerSubscriptionHome;
    public final TrainView headerTrainView;
    public final ConstraintLayout layoutProgressSubscription;
    public final ProgressBar progressSubscription;
    public final ViewRepetitionDaysBinding repetitionTime;
    private final ConstraintLayout rootView;

    private SubscriptionCreationFragmentBinding(ConstraintLayout constraintLayout, ViewAnticipationTimeBinding viewAnticipationTimeBinding, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, InfoView infoView, MaterialButton materialButton, JourneyView journeyView, HeaderView headerView, TrainView trainView, ConstraintLayout constraintLayout5, ProgressBar progressBar, ViewRepetitionDaysBinding viewRepetitionDaysBinding) {
        this.rootView = constraintLayout;
        this.anticipationTime = viewAnticipationTimeBinding;
        this.containerAnticipationTime = constraintLayout2;
        this.containerCreation = constraintLayout3;
        this.containerRepetitionTime = constraintLayout4;
        this.emptyView = infoView;
        this.fab = materialButton;
        this.headerJourneyView = journeyView;
        this.headerSubscriptionHome = headerView;
        this.headerTrainView = trainView;
        this.layoutProgressSubscription = constraintLayout5;
        this.progressSubscription = progressBar;
        this.repetitionTime = viewRepetitionDaysBinding;
    }

    public static SubscriptionCreationFragmentBinding bind(View view) {
        View t2;
        int i = R.id.anticipation_time;
        View t4 = AbstractC0105a.t(view, i);
        if (t4 != null) {
            ViewAnticipationTimeBinding bind = ViewAnticipationTimeBinding.bind(t4);
            i = R.id.container_anticipation_time;
            ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC0105a.t(view, i);
            if (constraintLayout != null) {
                i = R.id.container_creation;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) AbstractC0105a.t(view, i);
                if (constraintLayout2 != null) {
                    i = R.id.container_repetition_time;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) AbstractC0105a.t(view, i);
                    if (constraintLayout3 != null) {
                        i = R.id.empty_view;
                        InfoView infoView = (InfoView) AbstractC0105a.t(view, i);
                        if (infoView != null) {
                            i = R.id.fab;
                            MaterialButton materialButton = (MaterialButton) AbstractC0105a.t(view, i);
                            if (materialButton != null) {
                                i = R.id.headerJourneyView;
                                JourneyView journeyView = (JourneyView) AbstractC0105a.t(view, i);
                                if (journeyView != null) {
                                    i = R.id.headerSubscriptionHome;
                                    HeaderView headerView = (HeaderView) AbstractC0105a.t(view, i);
                                    if (headerView != null) {
                                        i = R.id.headerTrainView;
                                        TrainView trainView = (TrainView) AbstractC0105a.t(view, i);
                                        if (trainView != null) {
                                            i = R.id.layoutProgressSubscription;
                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) AbstractC0105a.t(view, i);
                                            if (constraintLayout4 != null) {
                                                i = R.id.progressSubscription;
                                                ProgressBar progressBar = (ProgressBar) AbstractC0105a.t(view, i);
                                                if (progressBar != null && (t2 = AbstractC0105a.t(view, (i = R.id.repetition_time))) != null) {
                                                    return new SubscriptionCreationFragmentBinding((ConstraintLayout) view, bind, constraintLayout, constraintLayout2, constraintLayout3, infoView, materialButton, journeyView, headerView, trainView, constraintLayout4, progressBar, ViewRepetitionDaysBinding.bind(t2));
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

    public static SubscriptionCreationFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SubscriptionCreationFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.subscription_creation_fragment, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
