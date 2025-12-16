package com.adif.elcanomovil.repositories.providers;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class g extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public DefaultLocationProvider f4650a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultLocationProvider f4652c;

    /* renamed from: d, reason: collision with root package name */
    public int f4653d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DefaultLocationProvider defaultLocationProvider, Continuation continuation) {
        super(continuation);
        this.f4652c = defaultLocationProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4651b = obj;
        this.f4653d |= IntCompanionObject.MIN_VALUE;
        return this.f4652c.fetchLastLocation(this);
    }
}
