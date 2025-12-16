package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.domain.entities.circulation.TrainCirculation;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class o extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public CirculationsViewModel f5003a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f5004b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f5005c;

    /* renamed from: d, reason: collision with root package name */
    public TrainCirculation f5006d;

    /* renamed from: e, reason: collision with root package name */
    public Collection f5007e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5008f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5009g;
    public final /* synthetic */ CirculationsViewModel h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(CirculationsViewModel circulationsViewModel, Continuation continuation) {
        super(continuation);
        this.h = circulationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object mapToViewData;
        this.f5009g = obj;
        this.i |= IntCompanionObject.MIN_VALUE;
        mapToViewData = this.h.mapToViewData(null, false, this);
        return mapToViewData;
    }
}
