package com.adif.elcanomovil.uiSelectTrain.main;

import com.adif.elcanomovil.uiSelectTrain.entities.TrainSituationViewData;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes2.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectTrainViewModel f5264a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SelectTrainViewModel selectTrainViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5264a = selectTrainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f5264a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        List list;
        List list2;
        TrainSituationViewData data;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SelectTrainViewModel selectTrainViewModel = this.f5264a;
        mutableStateFlow = selectTrainViewModel._savedSearchData;
        list = selectTrainViewModel.userLastSearches;
        if (list.size() == 0) {
            data = TrainSituationViewData.Empty.INSTANCE;
        } else {
            list2 = selectTrainViewModel.userLastSearches;
            data = new TrainSituationViewData.Data(CollectionsKt.reversed(list2));
        }
        mutableStateFlow.setValue(data);
        return Unit.INSTANCE;
    }
}
