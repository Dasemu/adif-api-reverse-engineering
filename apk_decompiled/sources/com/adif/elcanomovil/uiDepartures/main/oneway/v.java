package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.domain.entities.station.Station;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class v extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public CirculationsViewModel f5030a;

    /* renamed from: b, reason: collision with root package name */
    public Station f5031b;

    /* renamed from: c, reason: collision with root package name */
    public int f5032c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CirculationsViewModel f5034e;

    /* renamed from: f, reason: collision with root package name */
    public int f5035f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(CirculationsViewModel circulationsViewModel, Continuation continuation) {
        super(continuation);
        this.f5034e = circulationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object updateInfoHeader;
        this.f5033d = obj;
        this.f5035f |= IntCompanionObject.MIN_VALUE;
        updateInfoHeader = this.f5034e.updateInfoHeader(this);
        return updateInfoHeader;
    }
}
