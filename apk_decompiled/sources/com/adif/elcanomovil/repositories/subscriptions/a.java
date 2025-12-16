package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.serviceNetworking.subscriptions.SubscriptionsService;
import com.adif.elcanomovil.serviceNetworking.subscriptions.models.SubscriptionRequest;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultSubscriptionsRepository f4704b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SubscriptionRequest f4705c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DefaultSubscriptionsRepository defaultSubscriptionsRepository, SubscriptionRequest subscriptionRequest, Continuation continuation) {
        super(2, continuation);
        this.f4704b = defaultSubscriptionsRepository;
        this.f4705c = subscriptionRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f4704b, this.f4705c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SubscriptionsService subscriptionsService;
        String str;
        String pushId;
        String deviceId;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4703a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        DefaultSubscriptionsRepository defaultSubscriptionsRepository = this.f4704b;
        subscriptionsService = defaultSubscriptionsRepository.subscriptionsService;
        str = defaultSubscriptionsRepository.header;
        pushId = defaultSubscriptionsRepository.getPushId();
        deviceId = defaultSubscriptionsRepository.getDeviceId();
        str2 = defaultSubscriptionsRepository.headerAuth;
        this.f4703a = 1;
        Object createJourneySubscription = subscriptionsService.createJourneySubscription(str, pushId, deviceId, str2, this.f4705c, this);
        return createJourneySubscription == coroutine_suspended ? coroutine_suspended : createJourneySubscription;
    }
}
