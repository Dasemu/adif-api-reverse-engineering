package com.adif.elcanomovil.uiSubscriptions.home;

import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.MuteSubscriptionsUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final class s extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionHomeViewModel f5390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5391c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f5393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f5394f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f5395g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(SubscriptionHomeViewModel subscriptionHomeViewModel, String str, String str2, String str3, String str4, String str5, String str6, Continuation continuation) {
        super(2, continuation);
        this.f5390b = subscriptionHomeViewModel;
        this.f5391c = str;
        this.f5392d = str2;
        this.f5393e = str3;
        this.f5394f = str4;
        this.f5395g = str5;
        this.h = str6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.f5390b, this.f5391c, this.f5392d, this.f5393e, this.f5394f, this.f5395g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MuteSubscriptionsUseCase muteSubscriptionsUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5389a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SubscriptionHomeViewModel subscriptionHomeViewModel = this.f5390b;
            muteSubscriptionsUseCase = subscriptionHomeViewModel.muteSubscriptionsUseCase;
            Flow<AsyncResult<Unit>> invoke = muteSubscriptionsUseCase.invoke(this.f5391c, this.f5392d, this.f5393e, this.f5394f, this.f5395g, this.h);
            h hVar = new h(subscriptionHomeViewModel, 2);
            this.f5389a = 1;
            if (invoke.collect(hVar, this) == coroutine_suspended) {
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
