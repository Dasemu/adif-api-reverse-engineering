package com.adif.elcanomovil.repositories.stations;

import com.adif.elcanomovil.serviceNetworking.stations.model.StationsResponse;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class k extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public DefaultStationsRepository f4696a;

    /* renamed from: b, reason: collision with root package name */
    public StationsResponse f4697b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4698c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultStationsRepository f4699d;

    /* renamed from: e, reason: collision with root package name */
    public int f4700e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DefaultStationsRepository defaultStationsRepository, Continuation continuation) {
        super(continuation);
        this.f4699d = defaultStationsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object processAndInsertDBStationsResponse;
        this.f4698c = obj;
        this.f4700e |= IntCompanionObject.MIN_VALUE;
        processAndInsertDBStationsResponse = this.f4699d.processAndInsertDBStationsResponse(null, this);
        return processAndInsertDBStationsResponse;
    }
}
