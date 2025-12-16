package com.adif.elcanomovil.uiSubscriptions.create;

import androidx.lifecycle.X;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.uiSubscriptions.create.views.data.SubscriptionCreateViewData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionCreationViewModel f5322b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5323c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SubscriptionCreationViewModel subscriptionCreationViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.f5322b = subscriptionCreationViewModel;
        this.f5323c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f5322b, this.f5323c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetStationByIdUseCase getStationByIdUseCase;
        X x3;
        X x4;
        X x5;
        X x6;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5321a;
        SubscriptionCreationViewModel subscriptionCreationViewModel = this.f5322b;
        String str = this.f5323c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            getStationByIdUseCase = subscriptionCreationViewModel.getStationByIdUseCase;
            this.f5321a = 1;
            obj = getStationByIdUseCase.invoke(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Station station = (Station) obj;
        String shortName = station != null ? station.getShortName() : null;
        x3 = subscriptionCreationViewModel._viewData;
        SubscriptionCreateViewData subscriptionCreateViewData = (SubscriptionCreateViewData) x3.d();
        if (subscriptionCreateViewData != null) {
            if (shortName == null) {
                shortName = str;
            }
            subscriptionCreateViewData.setStationToName(shortName);
        }
        x4 = subscriptionCreationViewModel._viewData;
        SubscriptionCreateViewData subscriptionCreateViewData2 = (SubscriptionCreateViewData) x4.d();
        if (subscriptionCreateViewData2 != null) {
            subscriptionCreateViewData2.setStationToCode(str);
        }
        x5 = subscriptionCreationViewModel._viewData;
        x6 = subscriptionCreationViewModel._viewData;
        x5.k(x6.d());
        return Unit.INSTANCE;
    }
}
