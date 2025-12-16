package com.adif.elcanomovil.uiDepartures.main.oneway;

import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class c extends AdaptedFunctionReference implements Function4, SuspendFunction {

    /* renamed from: a, reason: collision with root package name */
    public static final c f4964a = new AdaptedFunctionReference(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object combine$lambda$9;
        combine$lambda$9 = CirculationsViewModel.combine$lambda$9(obj, obj2, obj3, (Continuation) obj4);
        return combine$lambda$9;
    }
}
