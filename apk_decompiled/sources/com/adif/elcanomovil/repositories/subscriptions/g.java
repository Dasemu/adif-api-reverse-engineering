package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.serviceStorage.model.subscriptions.SubscriptionEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4744a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4745b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f4746c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultSubscriptionsRepository f4747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, DefaultSubscriptionsRepository defaultSubscriptionsRepository, Continuation continuation) {
        super(2, continuation);
        this.f4746c = list;
        this.f4747d = defaultSubscriptionsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = new g(this.f4746c, this.f4747d, continuation);
        gVar.f4745b = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int collectionSizeOrDefault;
        SubscriptionMapper subscriptionMapper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4744a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f4745b;
            List<SubscriptionEntity> list = this.f4746c;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (SubscriptionEntity subscriptionEntity : list) {
                subscriptionMapper = this.f4747d.subscriptionMapper;
                arrayList.add(subscriptionMapper.entityToDomain(subscriptionEntity));
            }
            this.f4744a = 1;
            if (flowCollector.emit(arrayList, this) == coroutine_suspended) {
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
