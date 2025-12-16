package com.adif.elcanomovil.uiDepartures.main.oneway;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4979a;

    /* renamed from: b, reason: collision with root package name */
    public int f4980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CirculationsViewModel f4981c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CirculationsViewModel circulationsViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4981c = circulationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f4981c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0036, code lost:
    
        r2 = r12.isCercanias;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0045, code lost:
    
        r3 = com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModelKt.getToDataType(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x012e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiDepartures.main.oneway.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
