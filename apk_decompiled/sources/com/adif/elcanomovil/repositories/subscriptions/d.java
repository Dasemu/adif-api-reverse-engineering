package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.domain.entities.subscription.SubscriptionType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4723a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultSubscriptionsRepository f4725c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SubscriptionType f4726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4728f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f4729g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f4730j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f4731k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f4732l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f4733m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f4734n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f4735o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SubscriptionType subscriptionType, DefaultSubscriptionsRepository defaultSubscriptionsRepository, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Continuation continuation) {
        super(2, continuation);
        this.f4725c = defaultSubscriptionsRepository;
        this.f4726d = subscriptionType;
        this.f4727e = str;
        this.f4728f = str2;
        this.f4729g = str3;
        this.h = str4;
        this.i = str5;
        this.f4730j = str6;
        this.f4731k = str7;
        this.f4732l = str8;
        this.f4733m = str9;
        this.f4734n = str10;
        this.f4735o = str11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        String str = this.f4734n;
        String str2 = this.f4735o;
        d dVar = new d(this.f4726d, this.f4725c, this.f4727e, this.f4728f, this.f4729g, this.h, this.i, this.f4730j, this.f4731k, this.f4732l, this.f4733m, str, str2, continuation);
        dVar.f4724b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|2|(1:(1:(5:(1:(1:(3:9|10|11)(2:13|14))(1:15))(1:19)|16|17|10|11)(6:20|21|22|23|24|(5:26|(2:28|29)|17|10|11)(1:30)))(1:37))(1:47)|38|39|40|41|(3:43|24|(0)(0))|29|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ec, code lost:
    
        if (r0 == r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0101, code lost:
    
        if (r4.emit(r0, r24) == r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f0, code lost:
    
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0069, code lost:
    
        if (r0.emit(r9, r24) == r2) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:16:0x002c, B:24:0x00b6, B:26:0x00c0, B:30:0x00d3), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:16:0x002c, B:24:0x00b6, B:26:0x00c0, B:30:0x00d3), top: B:2:0x000e }] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.subscriptions.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
