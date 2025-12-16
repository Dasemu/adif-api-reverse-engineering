package com.adif.elcanomovil.repositories.stations;

import com.adif.elcanomovil.serviceStorage.database.StationsDao;
import com.adif.elcanomovil.serviceStorage.model.StationEntity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultStationsRepository f4689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4690b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(DefaultStationsRepository defaultStationsRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.f4689a = defaultStationsRepository;
        this.f4690b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f4689a, this.f4690b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StationMapper stationMapper;
        StationsDao stationsDao;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        DefaultStationsRepository defaultStationsRepository = this.f4689a;
        stationMapper = defaultStationsRepository.stationMapper;
        stationsDao = defaultStationsRepository.stationsDao;
        StationEntity stationEntity = stationsDao.get(this.f4690b);
        if (stationEntity == null) {
            return null;
        }
        return stationMapper.entityToDomain(stationEntity);
    }
}
