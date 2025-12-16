package com.adif.elcanomovil.uiSelectTrain.main;

import com.adif.elcanomovil.commonViews.includeViews.LoadingEmptyOrErrorView;
import com.adif.elcanomovil.uiSelectTrain.R;
import com.adif.elcanomovil.uiSelectTrain.entities.TrainSituationViewData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectTrainFragment f5229a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SelectTrainFragment selectTrainFragment) {
        super(1);
        this.f5229a = selectTrainFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrainSituationViewData trainSituationViewData = (TrainSituationViewData) obj;
        boolean z3 = trainSituationViewData instanceof TrainSituationViewData.Data;
        SelectTrainFragment selectTrainFragment = this.f5229a;
        if (z3) {
            selectTrainFragment.updateVisibility(LoadingEmptyOrErrorView.Status.HIDDEN, null, null);
            selectTrainFragment.updatedSelectedTrainViews(((TrainSituationViewData.Data) trainSituationViewData).getResults(), true);
        } else if (Intrinsics.areEqual(trainSituationViewData, TrainSituationViewData.Empty.INSTANCE)) {
            selectTrainFragment.updateVisibility(LoadingEmptyOrErrorView.Status.INIT, selectTrainFragment.getString(R.string.select_train_no_search_title), selectTrainFragment.getString(R.string.select_train_no_search_subtitle));
        } else if (Intrinsics.areEqual(trainSituationViewData, TrainSituationViewData.Error.INSTANCE)) {
            selectTrainFragment.updateVisibility(LoadingEmptyOrErrorView.Status.ERROR, selectTrainFragment.getString(R.string.train_situation_no_results_title_error), selectTrainFragment.getString(R.string.generic_error_message));
        } else if (Intrinsics.areEqual(trainSituationViewData, TrainSituationViewData.Loading.INSTANCE)) {
            selectTrainFragment.updateVisibility(LoadingEmptyOrErrorView.Status.LOADING, selectTrainFragment.getString(R.string.common_loading), null);
        }
        return Unit.INSTANCE;
    }
}
