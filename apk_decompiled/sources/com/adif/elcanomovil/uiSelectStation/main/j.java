package com.adif.elcanomovil.uiSelectStation.main;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class j extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public SelectStationViewModel f5202a;

    /* renamed from: b, reason: collision with root package name */
    public SelectStationViewModel f5203b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5204c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SelectStationViewModel f5205d;

    /* renamed from: e, reason: collision with root package name */
    public int f5206e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SelectStationViewModel selectStationViewModel, Continuation continuation) {
        super(continuation);
        this.f5205d = selectStationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadUserStations;
        this.f5204c = obj;
        this.f5206e |= IntCompanionObject.MIN_VALUE;
        loadUserStations = this.f5205d.loadUserStations(null, this);
        return loadUserStations;
    }
}
