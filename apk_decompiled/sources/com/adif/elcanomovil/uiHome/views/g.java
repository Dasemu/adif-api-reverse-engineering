package com.adif.elcanomovil.uiHome.views;

import com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class g extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public StationViewEntityMapper f5130a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5131b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HomeMapViewModel f5132c;

    /* renamed from: d, reason: collision with root package name */
    public int f5133d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(HomeMapViewModel homeMapViewModel, Continuation continuation) {
        super(continuation);
        this.f5132c = homeMapViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchUserWorkStation;
        this.f5131b = obj;
        this.f5133d |= IntCompanionObject.MIN_VALUE;
        fetchUserWorkStation = this.f5132c.fetchUserWorkStation(this);
        return fetchUserWorkStation;
    }
}
