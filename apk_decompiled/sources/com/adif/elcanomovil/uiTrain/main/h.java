package com.adif.elcanomovil.uiTrain.main;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes3.dex */
public final class h extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public TrainSituationViewModel f5410a;

    /* renamed from: b, reason: collision with root package name */
    public MutableStateFlow f5411b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5412c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TrainSituationViewModel f5413d;

    /* renamed from: e, reason: collision with root package name */
    public int f5414e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TrainSituationViewModel trainSituationViewModel, Continuation continuation) {
        super(continuation);
        this.f5413d = trainSituationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchPath;
        this.f5412c = obj;
        this.f5414e |= IntCompanionObject.MIN_VALUE;
        fetchPath = this.f5413d.fetchPath(this);
        return fetchPath;
    }
}
