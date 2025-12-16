package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.domain.entities.subscription.Destination;
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
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4760a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4761b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4762c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Subscription f4763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4765f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f4766g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f4767j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f4768k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DefaultSubscriptionsRepository f4769l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Subscription subscription, DefaultSubscriptionsRepository defaultSubscriptionsRepository, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Continuation continuation) {
        super(2, continuation);
        this.f4761b = str;
        this.f4762c = str2;
        this.f4763d = subscription;
        this.f4764e = str3;
        this.f4765f = str4;
        this.f4766g = str5;
        this.h = str6;
        this.i = str7;
        this.f4767j = str8;
        this.f4768k = str9;
        this.f4769l = defaultSubscriptionsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        String str = this.f4768k;
        return new l(this.f4763d, this.f4769l, this.f4761b, this.f4762c, this.f4764e, this.f4765f, this.f4766g, this.h, this.i, this.f4767j, str, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SubscriptionsDao subscriptionsDao;
        SubscriptionMapper subscriptionMapper;
        Destination destination;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4760a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Subscription subscription = this.f4763d;
            String str = this.f4761b;
            if (str != null) {
                subscription.getOrigin().setId(Integer.parseInt(str));
            }
            String str2 = this.f4762c;
            if (str2 != null && (destination = subscription.getDestination()) != null) {
                destination.setId(Integer.parseInt(str2));
            }
            subscription.setTimeStart(this.f4764e);
            String str3 = this.f4765f;
            if (str3 == null) {
                str3 = "";
            }
            subscription.setTimeCenter(str3);
            subscription.setTimeEnd(this.f4766g);
            String str4 = this.h;
            if (str4 == null) {
                str4 = "";
            }
            subscription.setRepeats(str4);
            String str5 = this.i;
            if (str5 == null) {
                str5 = "";
            }
            subscription.setSubscriptionType(str5);
            String str6 = this.f4767j;
            if (str6 == null) {
                str6 = "";
            }
            subscription.setOperator(str6);
            String str7 = this.f4768k;
            subscription.setCommercialProduct(str7 != null ? str7 : "");
            DefaultSubscriptionsRepository defaultSubscriptionsRepository = this.f4769l;
            subscriptionsDao = defaultSubscriptionsRepository.subscriptionsDao;
            subscriptionMapper = defaultSubscriptionsRepository.subscriptionMapper;
            SubscriptionEntity domainToEntity = subscriptionMapper.domainToEntity(subscription);
            this.f4760a = 1;
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
