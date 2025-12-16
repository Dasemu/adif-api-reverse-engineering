package com.adif.elcanomovil.repositories.providers;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class j extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public DefaultRemoteConfigVersionRepository f4659a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultRemoteConfigVersionRepository f4661c;

    /* renamed from: d, reason: collision with root package name */
    public int f4662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DefaultRemoteConfigVersionRepository defaultRemoteConfigVersionRepository, Continuation continuation) {
        super(continuation);
        this.f4661c = defaultRemoteConfigVersionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4660b = obj;
        this.f4662d |= IntCompanionObject.MIN_VALUE;
        return this.f4661c.fetchRemoteConfiguration(this);
    }
}
