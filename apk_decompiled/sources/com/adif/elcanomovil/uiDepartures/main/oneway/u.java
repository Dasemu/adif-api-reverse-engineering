package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationToUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes2.dex */
public final class u extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CirculationsViewModel f5029b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(CirculationsViewModel circulationsViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5029b = circulationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new u(this.f5029b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        GetLastDeparturesArrivalsStationUseCase getLastDeparturesArrivalsStationUseCase;
        GetLastDeparturesArrivalsStationToUseCase getLastDeparturesArrivalsStationToUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5028a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CirculationsViewModel circulationsViewModel = this.f5029b;
            mutableStateFlow = circulationsViewModel.isShowExpandedFlow;
            mutableStateFlow2 = circulationsViewModel.isShowCorporateStopsFlow;
            mutableStateFlow3 = circulationsViewModel.isCercaniasFlow;
            mutableStateFlow4 = circulationsViewModel.hasBothTrafficFlow;
            getLastDeparturesArrivalsStationUseCase = circulationsViewModel.getLastDeparturesArrivalsStationUseCase;
            Flow<String> asFlow = getLastDeparturesArrivalsStationUseCase.asFlow();
            getLastDeparturesArrivalsStationToUseCase = circulationsViewModel.getLastDeparturesArrivalsStationToUseCase;
            Flow debounce = FlowKt.debounce(circulationsViewModel.combine(mutableStateFlow, mutableStateFlow2, mutableStateFlow3, mutableStateFlow4, asFlow, getLastDeparturesArrivalsStationToUseCase.asFlow(), new r(circulationsViewModel, null)), 500L);
            t tVar = new t(circulationsViewModel);
            this.f5028a = 1;
            if (debounce.collect(tVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
