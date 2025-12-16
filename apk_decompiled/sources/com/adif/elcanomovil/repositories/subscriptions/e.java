package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.serviceNetworking.subscriptions.SubscriptionsService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultSubscriptionsRepository f4737b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4738c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DefaultSubscriptionsRepository defaultSubscriptionsRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.f4737b = defaultSubscriptionsRepository;
        this.f4738c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f4737b, this.f4738c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SubscriptionsService subscriptionsService;
        String str;
        String pushId;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4736a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        DefaultSubscriptionsRepository defaultSubscriptionsRepository = this.f4737b;
        subscriptionsService = defaultSubscriptionsRepository.subscriptionsService;
        str = defaultSubscriptionsRepository.header;
        pushId = defaultSubscriptionsRepository.getPushId();
        str2 = defaultSubscriptionsRepository.headerAuth;
        this.f4736a = 1;
        Object unregisterSubscription = subscriptionsService.unregisterSubscription(this.f4738c, str, pushId, str2, this);
        return unregisterSubscription == coroutine_suspended ? coroutine_suspended : unregisterSubscription;
    }
}
