package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.domain.entities.subscription.SubscriptionType;
import com.adif.elcanomovil.serviceNetworking.subscriptions.models.SubscriptionCreateTrainRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public SubscriptionCreateTrainRequest f4710a;

    /* renamed from: b, reason: collision with root package name */
    public int f4711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SubscriptionType f4712c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4715f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f4716g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f4717j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f4718k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DefaultSubscriptionsRepository f4719l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f4720m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f4721n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f4722o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SubscriptionType subscriptionType, DefaultSubscriptionsRepository defaultSubscriptionsRepository, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Continuation continuation) {
        super(2, continuation);
        this.f4712c = subscriptionType;
        this.f4713d = str;
        this.f4714e = str2;
        this.f4715f = str3;
        this.f4716g = str4;
        this.h = str5;
        this.i = str6;
        this.f4717j = str7;
        this.f4718k = str8;
        this.f4719l = defaultSubscriptionsRepository;
        this.f4720m = str9;
        this.f4721n = str10;
        this.f4722o = str11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        String str = this.f4721n;
        String str2 = this.f4722o;
        return new c(this.f4712c, this.f4719l, this.f4713d, this.f4714e, this.f4715f, this.f4716g, this.h, this.i, this.f4717j, this.f4718k, this.f4720m, str, str2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0099, code lost:
    
        if (r0 != r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e3, code lost:
    
        if (r0 == r7) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.subscriptions.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
