package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.domain.entities.CirculationType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public CirculationType f5000a;

    /* renamed from: b, reason: collision with root package name */
    public int f5001b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CirculationsViewModel f5002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CirculationsViewModel circulationsViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5002c = circulationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f5002c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x015d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiDepartures.main.oneway.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
