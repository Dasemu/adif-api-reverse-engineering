package com.adif.elcanomovil.main;

import android.content.Intent;
import com.adif.elcanomovil.domain.entities.deeplink.DeepLinkResult;
import com.adif.elcanomovil.domain.usecases.DynamicLinkUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainViewModel f4570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Intent f4571c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(MainViewModel mainViewModel, Intent intent, Continuation continuation) {
        super(2, continuation);
        this.f4570b = mainViewModel;
        this.f4571c = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new v(this.f4570b, this.f4571c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DynamicLinkUseCase dynamicLinkUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4569a;
        MainViewModel mainViewModel = this.f4570b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            dynamicLinkUseCase = mainViewModel.dynamicLinkUseCase;
            this.f4569a = 1;
            obj = dynamicLinkUseCase.handleLink(this.f4571c, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        DeepLinkResult deepLinkResult = (DeepLinkResult) obj;
        if (deepLinkResult == null) {
            return Unit.INSTANCE;
        }
        if (deepLinkResult instanceof DeepLinkResult.Departures) {
            DeepLinkResult.Departures departures = (DeepLinkResult.Departures) deepLinkResult;
            mainViewModel.navigateToDepartures(departures.getOrigin(), departures.getDestination(), departures.getCirculationType(), departures.getIsCercanias());
        } else if (deepLinkResult instanceof DeepLinkResult.Train) {
            mainViewModel.navigateToTrainDetails(((DeepLinkResult.Train) deepLinkResult).getTrainCirculation().getCommercialNumber());
        }
        return Unit.INSTANCE;
    }
}
