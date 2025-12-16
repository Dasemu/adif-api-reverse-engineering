package com.adif.elcanomovil.uiSelectTrain.main;

import android.content.Context;
import com.adif.elcanomovil.commonViews.includeViews.LoadingEmptyOrErrorView;
import com.adif.elcanomovil.uiSelectTrain.R;
import com.adif.elcanomovil.uiSelectTrain.entities.TrainSituationViewData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectTrainFragment f5228a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SelectTrainFragment selectTrainFragment) {
        super(1);
        this.f5228a = selectTrainFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrainSituationViewData trainSituationViewData = (TrainSituationViewData) obj;
        boolean z3 = trainSituationViewData instanceof TrainSituationViewData.Data;
        SelectTrainFragment selectTrainFragment = this.f5228a;
        if (z3) {
            selectTrainFragment.updateVisibility(LoadingEmptyOrErrorView.Status.HIDDEN, null, null);
            selectTrainFragment.updatedSelectedTrainViews(((TrainSituationViewData.Data) trainSituationViewData).getResults(), false);
        } else if (Intrinsics.areEqual(trainSituationViewData, TrainSituationViewData.Empty.INSTANCE)) {
            selectTrainFragment.updateVisibility(LoadingEmptyOrErrorView.Status.EMPTY, selectTrainFragment.getString(R.string.select_train_no_results_title), selectTrainFragment.getString(R.string.select_train_no_results_subtitle));
        } else if (Intrinsics.areEqual(trainSituationViewData, TrainSituationViewData.Error.INSTANCE)) {
            LoadingEmptyOrErrorView.Status status = LoadingEmptyOrErrorView.Status.ERROR;
            String string = selectTrainFragment.getString(R.string.train_situation_no_results_title_error);
            Context context = selectTrainFragment.getContext();
            selectTrainFragment.updateVisibility(status, string, context != null ? context.getString(R.string.generic_error_message) : null);
        } else if (Intrinsics.areEqual(trainSituationViewData, TrainSituationViewData.Loading.INSTANCE)) {
            selectTrainFragment.updateVisibility(LoadingEmptyOrErrorView.Status.LOADING, selectTrainFragment.getString(R.string.common_loading), null);
        }
        return Unit.INSTANCE;
    }
}
