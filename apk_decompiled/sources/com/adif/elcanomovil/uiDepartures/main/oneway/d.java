package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.domain.entities.TrainType;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class d extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f4965a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4966b;

    /* renamed from: c, reason: collision with root package name */
    public String f4967c;

    /* renamed from: d, reason: collision with root package name */
    public TrainType f4968d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4969e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4970f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CirculationsViewModel f4971g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CirculationsViewModel circulationsViewModel, Continuation continuation) {
        super(continuation);
        this.f4971g = circulationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4970f = obj;
        this.h |= IntCompanionObject.MIN_VALUE;
        return this.f4971g.fetchCirculations(false, this);
    }
}
