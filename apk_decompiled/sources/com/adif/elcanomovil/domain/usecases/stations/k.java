package com.adif.elcanomovil.domain.usecases.stations;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class k extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public l f4516a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f4518c;

    /* renamed from: d, reason: collision with root package name */
    public int f4519d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Continuation continuation) {
        super(continuation);
        this.f4518c = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4517b = obj;
        this.f4519d |= IntCompanionObject.MIN_VALUE;
        return this.f4518c.emit(null, this);
    }
}
