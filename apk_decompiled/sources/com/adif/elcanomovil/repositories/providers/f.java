package com.adif.elcanomovil.repositories.providers;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class f extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultDynamicLinkFacade f4648b;

    /* renamed from: c, reason: collision with root package name */
    public int f4649c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DefaultDynamicLinkFacade defaultDynamicLinkFacade, Continuation continuation) {
        super(continuation);
        this.f4648b = defaultDynamicLinkFacade;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4647a = obj;
        this.f4649c |= IntCompanionObject.MIN_VALUE;
        return this.f4648b.dynamicLink(null, this);
    }
}
