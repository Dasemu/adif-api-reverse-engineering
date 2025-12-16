package com.adif.elcanomovil.uiHome.views;

import com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class e extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public StationViewEntityMapper f5123a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5124b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HomeMapViewModel f5125c;

    /* renamed from: d, reason: collision with root package name */
    public int f5126d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(HomeMapViewModel homeMapViewModel, Continuation continuation) {
        super(continuation);
        this.f5125c = homeMapViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchUserHomeStation;
        this.f5124b = obj;
        this.f5126d |= IntCompanionObject.MIN_VALUE;
        fetchUserHomeStation = this.f5125c.fetchUserHomeStation(this);
        return fetchUserHomeStation;
    }
}
