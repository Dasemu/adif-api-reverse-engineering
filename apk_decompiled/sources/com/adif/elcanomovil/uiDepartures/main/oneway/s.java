package com.adif.elcanomovil.uiDepartures.main.oneway;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class s extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public t f5023a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f5025c;

    /* renamed from: d, reason: collision with root package name */
    public int f5026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Continuation continuation) {
        super(continuation);
        this.f5025c = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5024b = obj;
        this.f5026d |= IntCompanionObject.MIN_VALUE;
        return this.f5025c.a(this);
    }
}
