package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.domain.providers.LocationStatusProvider;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow;

/* loaded from: classes2.dex */
public final class q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f5093b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5093b = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new q(this.f5093b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LocationStatusProvider locationStatusProvider;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5092a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HomeViewModel homeViewModel = this.f5093b;
            locationStatusProvider = homeViewModel.locationStatusProvider;
            SharedFlow<Boolean> locationStatus = locationStatusProvider.getLocationStatus();
            C1.b bVar = new C1.b(homeViewModel, 10);
            this.f5092a = 1;
            if (locationStatus.collect(bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
