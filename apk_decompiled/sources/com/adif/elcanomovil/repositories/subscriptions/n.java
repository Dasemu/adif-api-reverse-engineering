package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import com.adif.elcanomovil.serviceStorage.database.SubscriptionsDao;
import com.adif.elcanomovil.serviceStorage.model.subscriptions.SubscriptionEntity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultSubscriptionsRepository f4781b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Subscription f4782c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Subscription subscription, DefaultSubscriptionsRepository defaultSubscriptionsRepository, Continuation continuation) {
        super(2, continuation);
        this.f4781b = defaultSubscriptionsRepository;
        this.f4782c = subscription;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f4782c, this.f4781b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SubscriptionsDao subscriptionsDao;
        SubscriptionMapper subscriptionMapper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4780a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DefaultSubscriptionsRepository defaultSubscriptionsRepository = this.f4781b;
            subscriptionsDao = defaultSubscriptionsRepository.subscriptionsDao;
            subscriptionMapper = defaultSubscriptionsRepository.subscriptionMapper;
            SubscriptionEntity domainToEntity = subscriptionMapper.domainToEntity(this.f4782c);
            this.f4780a = 1;
            if (subscriptionsDao.insert(domainToEntity, this) == coroutine_suspended) {
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
