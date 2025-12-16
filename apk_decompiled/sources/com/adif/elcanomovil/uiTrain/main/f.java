package com.adif.elcanomovil.uiTrain.main;

import android.content.Context;
import com.adif.elcanomovil.commonViews.includeViews.LoadingEmptyOrErrorView;
import com.adif.elcanomovil.uiTrain.R;
import com.adif.elcanomovil.uiTrain.entities.TrainInfo;
import com.adif.elcanomovil.uiTrain.main.TrainSituationViewData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TrainSituationFragment f5408a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TrainSituationFragment trainSituationFragment) {
        super(1);
        this.f5408a = trainSituationFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        TrainInfo trainInfo;
        TrainSituationViewData trainSituationViewData = (TrainSituationViewData) obj;
        boolean z3 = trainSituationViewData instanceof TrainSituationViewData.Data;
        TrainSituationFragment trainSituationFragment = this.f5408a;
        if (z3) {
            List<TrainInfo> results = ((TrainSituationViewData.Data) trainSituationViewData).getResults();
            if (results == null || (trainInfo = results.get(0)) == null) {
                unit = null;
            } else {
                trainSituationFragment.updateResults(trainInfo);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                LoadingEmptyOrErrorView.Status status = LoadingEmptyOrErrorView.Status.EMPTY;
                Context context = trainSituationFragment.getContext();
                String string = context != null ? context.getString(R.string.train_situation_no_results_title) : null;
                Context context2 = trainSituationFragment.getContext();
                trainSituationFragment.updateVisibility(status, string, context2 != null ? context2.getString(R.string.select_train_no_results_subtitle) : null);
            }
        } else if (trainSituationViewData instanceof TrainSituationViewData.Error) {
            LoadingEmptyOrErrorView.Status status2 = LoadingEmptyOrErrorView.Status.ERROR;
            Context context3 = trainSituationFragment.getContext();
            String string2 = context3 != null ? context3.getString(R.string.train_situation_no_results_title_error) : null;
            Context context4 = trainSituationFragment.getContext();
            trainSituationFragment.updateVisibility(status2, string2, context4 != null ? context4.getString(R.string.generic_error_message) : null);
        } else if (Intrinsics.areEqual(trainSituationViewData, TrainSituationViewData.Loading.INSTANCE)) {
            trainSituationFragment.updateVisibility(LoadingEmptyOrErrorView.Status.LOADING, trainSituationFragment.getString(R.string.common_loading), null);
        }
        return Unit.INSTANCE;
    }
}
