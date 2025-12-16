package com.adif.elcanomovil.repositories.subscriptions;

import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4796a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4797b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultSubscriptionsRepository f4798c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Subscription f4799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f4802g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f4803j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f4804k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f4805l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f4806m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f4807n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(DefaultSubscriptionsRepository defaultSubscriptionsRepository, Subscription subscription, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Continuation continuation) {
        super(2, continuation);
        this.f4798c = defaultSubscriptionsRepository;
        this.f4799d = subscription;
        this.f4800e = str;
        this.f4801f = str2;
        this.f4802g = str3;
        this.h = str4;
        this.i = str5;
        this.f4803j = str6;
        this.f4804k = str7;
        this.f4805l = str8;
        this.f4806m = str9;
        this.f4807n = str10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        q qVar = new q(this.f4798c, this.f4799d, this.f4800e, this.f4801f, this.f4802g, this.h, this.i, this.f4803j, this.f4804k, this.f4805l, this.f4806m, this.f4807n, continuation);
        qVar.f4797b = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:1|(1:(5:(5:(1:(1:(3:8|9|10)(2:12|13))(1:14))(1:23)|15|16|9|10)(10:24|25|26|27|28|29|30|(4:32|33|34|(2:36|37))(2:39|(1:41))|9|10)|20|(1:22)|9|10)(1:49))(2:78|(2:80|81))|50|51|52|53|54|55|56|57|58|59|60|61|62|(1:64)|28|29|30|(0)(0)|9|10|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:(1:(1:(3:8|9|10)(2:12|13))(1:14))(1:23)|15|16|9|10) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r13 = r15;
        r15 = r2;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fd, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fe, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ff, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011e, code lost:
    
        r13 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0121, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0122, code lost:
    
        r13 = r15;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0125, code lost:
    
        r15 = r7;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0127, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0128, code lost:
    
        r2 = null;
        r13 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012c, code lost:
    
        r2 = null;
        r13 = r15;
        r15 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1 A[Catch: all -> 0x00fe, TRY_LEAVE, TryCatch #6 {all -> 0x00fe, blocks: (B:29:0x00c7, B:32:0x00d1), top: B:28:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101 A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #4 {all -> 0x00fc, blocks: (B:34:0x00ec, B:39:0x0101), top: B:30:0x00cf }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.subscriptions.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
