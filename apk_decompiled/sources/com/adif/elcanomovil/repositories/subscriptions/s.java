package com.adif.elcanomovil.repositories.subscriptions;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class s extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4812a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultSubscriptionsRepository f4814c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4817f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f4818g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(DefaultSubscriptionsRepository defaultSubscriptionsRepository, String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        super(2, continuation);
        this.f4814c = defaultSubscriptionsRepository;
        this.f4815d = str;
        this.f4816e = str2;
        this.f4817f = str3;
        this.f4818g = str4;
        this.h = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        s sVar = new s(this.f4814c, this.f4815d, this.f4816e, this.f4817f, this.f4818g, this.h, continuation);
        sVar.f4813b = obj;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(1:2)|(1:(1:(4:(1:(1:(3:9|10|11)(2:13|14))(1:15))(1:17)|16|10|11)(5:18|19|20|21|(4:23|(2:25|26)|10|11)(1:27)))(1:29))(1:40)|30|31|32|(3:34|21|(0)(0))|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e0, code lost:
    
        if (r2.emit(r0, r26) == r8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e5, code lost:
    
        r0 = com.adif.elcanomovil.domain.entities.utils.AsyncResult.INSTANCE.error(r0, null);
        r26.f4813b = null;
        r26.f4812a = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
    
        if (r2.emit(r0, r26) != r8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0065, code lost:
    
        if (r0.emit(r4, r26) == r8) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8 A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:16:0x002e, B:19:0x0041, B:21:0x00ae, B:23:0x00b8, B:27:0x00c9), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:16:0x002e, B:19:0x0041, B:21:0x00ae, B:23:0x00b8, B:27:0x00c9), top: B:2:0x0010 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.adif.elcanomovil.repositories.subscriptions.DefaultSubscriptionsRepository] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.subscriptions.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
