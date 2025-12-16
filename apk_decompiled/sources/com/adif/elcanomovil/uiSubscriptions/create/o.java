package com.adif.elcanomovil.uiSubscriptions.create;

import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.DeleteSubscriptionsUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final class o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionCreationViewModel f5345b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(SubscriptionCreationViewModel subscriptionCreationViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5345b = subscriptionCreationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f5345b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Subscription subscription;
        DeleteSubscriptionsUseCase deleteSubscriptionsUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5344a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SubscriptionCreationViewModel subscriptionCreationViewModel = this.f5345b;
            subscriptionCreationViewModel.reallyActionPressed = true;
            subscription = subscriptionCreationViewModel.subscriptionData;
            if (subscription != null) {
                deleteSubscriptionsUseCase = subscriptionCreationViewModel.deleteSubscriptionsUseCase;
                Flow<AsyncResult<Unit>> invoke = deleteSubscriptionsUseCase.invoke(subscription, false);
                l lVar = new l(subscriptionCreationViewModel, 2);
                this.f5344a = 1;
                if (invoke.collect(lVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
