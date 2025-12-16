package com.adif.elcanomovil.uiSubscriptions.home;

import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.DeleteSubscriptionsUseCase;
import java.util.ArrayList;
import java.util.Iterator;
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
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionHomeViewModel f5378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5379c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5380d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(SubscriptionHomeViewModel subscriptionHomeViewModel, boolean z3, int i, Continuation continuation) {
        super(2, continuation);
        this.f5378b = subscriptionHomeViewModel;
        this.f5379c = z3;
        this.f5380d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f5378b, this.f5379c, this.f5380d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        int i;
        DeleteSubscriptionsUseCase deleteSubscriptionsUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.f5377a;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            SubscriptionHomeViewModel subscriptionHomeViewModel = this.f5378b;
            AsyncResult asyncResult = (AsyncResult) subscriptionHomeViewModel.getUserListSubscriptions().d();
            if (asyncResult != null && (list = (List) asyncResult.getData()) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    i = this.f5380d;
                    if (!hasNext) {
                        break;
                    }
                    Object next = it.next();
                    if (((Subscription) next).getId() == i) {
                        arrayList.add(next);
                    }
                }
                deleteSubscriptionsUseCase = subscriptionHomeViewModel.deleteSubscriptionsUseCase;
                Flow<AsyncResult<Unit>> invoke = deleteSubscriptionsUseCase.invoke((Subscription) CollectionsKt.first((List) arrayList), this.f5379c);
                k kVar = new k(subscriptionHomeViewModel, i);
                this.f5377a = 1;
                if (invoke.collect(kVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
