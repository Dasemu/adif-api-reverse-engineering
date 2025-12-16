package com.adif.elcanomovil.repositories.providers;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultDynamicLinkFacade f4635b;

    /* renamed from: c, reason: collision with root package name */
    public int f4636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DefaultDynamicLinkFacade defaultDynamicLinkFacade, Continuation continuation) {
        super(continuation);
        this.f4635b = defaultDynamicLinkFacade;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4634a = obj;
        this.f4636c |= IntCompanionObject.MIN_VALUE;
        return this.f4635b.create(null, null, null, null, null, null, null, this);
    }
}
