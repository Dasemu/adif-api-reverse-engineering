package com.adif.elcanomovil.repositories.stations;

import com.adif.elcanomovil.serviceNetworking.stations.model.StationsResponse;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class j extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public DefaultStationsRepository f4691a;

    /* renamed from: b, reason: collision with root package name */
    public StationsResponse f4692b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4693c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultStationsRepository f4694d;

    /* renamed from: e, reason: collision with root package name */
    public int f4695e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DefaultStationsRepository defaultStationsRepository, Continuation continuation) {
        super(continuation);
        this.f4694d = defaultStationsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object parseLocalFileWithStations;
        this.f4693c = obj;
        this.f4695e |= IntCompanionObject.MIN_VALUE;
        parseLocalFileWithStations = this.f4694d.parseLocalFileWithStations(this);
        return parseLocalFileWithStations;
    }
}
