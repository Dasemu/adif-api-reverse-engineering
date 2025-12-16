package com.adif.elcanomovil.uiTrain.main;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final class u extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Flow f5459a;

    /* renamed from: b, reason: collision with root package name */
    public int f5460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TrainSituationViewModel f5461c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f5463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f5464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f5465g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(TrainSituationViewModel trainSituationViewModel, String str, String str2, String str3, String str4, String str5, Long l4, Continuation continuation) {
        super(2, continuation);
        this.f5461c = trainSituationViewModel;
        this.f5462d = str;
        this.f5463e = str2;
        this.f5464f = str3;
        this.f5465g = str4;
        this.h = str5;
        this.i = l4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new u(this.f5461c, this.f5462d, this.f5463e, this.f5464f, this.f5465g, this.h, this.i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00de, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collect(r0, r17) == r8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e0, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c7, code lost:
    
        if (r0 == r8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        if (r0 == r8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r4 == r8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r6 == r8) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiTrain.main.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
