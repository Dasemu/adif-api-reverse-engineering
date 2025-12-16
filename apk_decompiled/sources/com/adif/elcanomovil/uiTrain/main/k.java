package com.adif.elcanomovil.uiTrain.main;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes3.dex */
public final class k extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public String f5423a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TrainSituationViewModel f5425c;

    /* renamed from: d, reason: collision with root package name */
    public int f5426d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TrainSituationViewModel trainSituationViewModel, Continuation continuation) {
        super(continuation);
        this.f5425c = trainSituationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5424b = obj;
        this.f5426d |= IntCompanionObject.MIN_VALUE;
        return this.f5425c.getStationNameOrStationCode(null, this);
    }
}
