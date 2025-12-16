package com.adif.elcanomovil.uiSelectStation.main;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectStationViewModel f5212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavArguments.StationSelectionType f5213c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(SelectStationViewModel selectStationViewModel, NavArguments.StationSelectionType stationSelectionType, Continuation continuation) {
        super(2, continuation);
        this.f5212b = selectStationViewModel;
        this.f5213c = stationSelectionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f5212b, this.f5213c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadUserStations;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5211a;
        SelectStationViewModel selectStationViewModel = this.f5212b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f5211a = 1;
            loadUserStations = selectStationViewModel.loadUserStations(this.f5213c, this);
            if (loadUserStations == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        selectStationViewModel.observeClosestStation();
        selectStationViewModel.observeRecentSearches();
        selectStationViewModel.showUpdateMainSearch();
        return Unit.INSTANCE;
    }
}
