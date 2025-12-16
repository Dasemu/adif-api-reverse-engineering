package com.adif.elcanomovil.uiSubscriptions.create;

import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes3.dex */
public final class s extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionCreationViewModel f5352b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(SubscriptionCreationViewModel subscriptionCreationViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5352b = subscriptionCreationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.f5352b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Subscription subscription;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5351a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SubscriptionCreationViewModel subscriptionCreationViewModel = this.f5352b;
            subscriptionCreationViewModel.reallyActionPressed = true;
            subscription = subscriptionCreationViewModel.subscriptionData;
            if (subscription != null) {
                CoroutineDispatcher io = Dispatchers.getIO();
                r rVar = new r(subscriptionCreationViewModel, subscription, null);
                this.f5351a = 1;
                if (BuildersKt.withContext(io, rVar, this) == coroutine_suspended) {
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
