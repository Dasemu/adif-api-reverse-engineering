package com.adif.elcanomovil.uiSelectStation.main;

import com.adif.elcanomovil.uiSelectStation.mappers.StationViewEntityMapper;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class h extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public StationViewEntityMapper f5194a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5195b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectStationViewModel f5196c;

    /* renamed from: d, reason: collision with root package name */
    public int f5197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SelectStationViewModel selectStationViewModel, Continuation continuation) {
        super(continuation);
        this.f5196c = selectStationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchUserHomeStation;
        this.f5195b = obj;
        this.f5197d |= IntCompanionObject.MIN_VALUE;
        fetchUserHomeStation = this.f5196c.fetchUserHomeStation(this);
        return fetchUserHomeStation;
    }
}
