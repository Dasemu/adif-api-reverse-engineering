package com.adif.elcanomovil.uiSelectStation.main;

import com.adif.elcanomovil.uiSelectStation.mappers.StationViewEntityMapper;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class i extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public StationViewEntityMapper f5198a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5199b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectStationViewModel f5200c;

    /* renamed from: d, reason: collision with root package name */
    public int f5201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SelectStationViewModel selectStationViewModel, Continuation continuation) {
        super(continuation);
        this.f5200c = selectStationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchUserWorkStation;
        this.f5199b = obj;
        this.f5201d |= IntCompanionObject.MIN_VALUE;
        fetchUserWorkStation = this.f5200c.fetchUserWorkStation(this);
        return fetchUserWorkStation;
    }
}
