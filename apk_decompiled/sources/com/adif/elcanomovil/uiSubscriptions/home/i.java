package com.adif.elcanomovil.uiSubscriptions.home;

import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.ActiveSubscriptionsUseCase;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionHomeViewModel f5370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5371c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SubscriptionHomeViewModel subscriptionHomeViewModel, int i, Continuation continuation) {
        super(2, continuation);
        this.f5370b = subscriptionHomeViewModel;
        this.f5371c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f5370b, this.f5371c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        ActiveSubscriptionsUseCase activeSubscriptionsUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5369a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SubscriptionHomeViewModel subscriptionHomeViewModel = this.f5370b;
            AsyncResult asyncResult = (AsyncResult) subscriptionHomeViewModel.getUserListSubscriptions().d();
            if (asyncResult != null && (list = (List) asyncResult.getData()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((Subscription) obj2).getId() == this.f5371c) {
                        arrayList.add(obj2);
                    }
                }
                Subscription subscription = (Subscription) CollectionsKt.first((List) arrayList);
                activeSubscriptionsUseCase = subscriptionHomeViewModel.activeSubscriptionsUseCase;
                Flow<AsyncResult<Unit>> invoke = activeSubscriptionsUseCase.invoke(subscription);
                h hVar = new h(subscriptionHomeViewModel, 0);
                this.f5369a = 1;
                if (invoke.collect(hVar, this) == coroutine_suspended) {
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
