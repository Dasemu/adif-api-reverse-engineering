package com.adif.elcanomovil.repositories.subscriptions;

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

/* loaded from: classes.dex */
public final class m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4772c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Subscription f4773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f4776g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f4777j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f4778k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DefaultSubscriptionsRepository f4779l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Subscription subscription, DefaultSubscriptionsRepository defaultSubscriptionsRepository, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Continuation continuation) {
        super(2, continuation);
        this.f4771b = str;
        this.f4772c = str2;
        this.f4773d = subscription;
        this.f4774e = str3;
        this.f4775f = str4;
        this.f4776g = str5;
        this.h = str6;
        this.i = str7;
        this.f4777j = str8;
        this.f4778k = str9;
        this.f4779l = defaultSubscriptionsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        String str = this.f4778k;
        return new m(this.f4773d, this.f4779l, this.f4771b, this.f4772c, this.f4774e, this.f4775f, this.f4776g, this.h, this.i, this.f4777j, str, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4770a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io = Dispatchers.getIO();
            DefaultSubscriptionsRepository defaultSubscriptionsRepository = this.f4779l;
            String str = this.f4777j;
            String str2 = this.f4778k;
            l lVar = new l(this.f4773d, defaultSubscriptionsRepository, this.f4771b, this.f4772c, this.f4774e, this.f4775f, this.f4776g, this.h, this.i, str, str2, null);
            this.f4770a = 1;
            if (BuildersKt.withContext(io, lVar, this) == coroutine_suspended) {
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
