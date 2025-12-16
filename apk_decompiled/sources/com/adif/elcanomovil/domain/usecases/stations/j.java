package com.adif.elcanomovil.domain.usecases.stations;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class j extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public ObserveRecentlySearchedStationsWithDistanceUseCase f4512a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObserveRecentlySearchedStationsWithDistanceUseCase f4514c;

    /* renamed from: d, reason: collision with root package name */
    public int f4515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ObserveRecentlySearchedStationsWithDistanceUseCase observeRecentlySearchedStationsWithDistanceUseCase, Continuation continuation) {
        super(continuation);
        this.f4514c = observeRecentlySearchedStationsWithDistanceUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4513b = obj;
        this.f4515d |= IntCompanionObject.MIN_VALUE;
        return this.f4514c.invoke(this);
    }
}
