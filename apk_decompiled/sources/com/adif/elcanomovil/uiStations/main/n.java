package com.adif.elcanomovil.uiStations.main;

import com.adif.elcanomovil.domain.entities.DataType;
import com.adif.elcanomovil.domain.usecases.favorites.GetStationIsFavoriteUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes2.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public MutableStateFlow f5290a;

    /* renamed from: b, reason: collision with root package name */
    public int f5291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StationsPageServicesViewModel f5292c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(StationsPageServicesViewModel stationsPageServicesViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5292c = stationsPageServicesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f5292c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        MutableStateFlow mutableStateFlow;
        GetStationIsFavoriteUseCase getStationIsFavoriteUseCase;
        MutableStateFlow mutableStateFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5291b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StationsPageServicesViewModel stationsPageServicesViewModel = this.f5292c;
            str = stationsPageServicesViewModel.currentStationCode;
            if (str != null) {
                mutableStateFlow = stationsPageServicesViewModel._isFavourite;
                getStationIsFavoriteUseCase = stationsPageServicesViewModel.getStationIsFavoriteUseCase;
                DataType dataType = DataType.INFO;
                this.f5290a = mutableStateFlow;
                this.f5291b = 1;
                obj = getStationIsFavoriteUseCase.invoke(str, null, dataType, true, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableStateFlow2 = mutableStateFlow;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mutableStateFlow2 = this.f5290a;
        ResultKt.throwOnFailure(obj);
        mutableStateFlow2.setValue(obj);
        return Unit.INSTANCE;
    }
}
