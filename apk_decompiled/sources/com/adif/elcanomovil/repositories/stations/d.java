package com.adif.elcanomovil.repositories.stations;

import com.adif.elcanomovil.domain.entities.MapRegion;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.extensions.LocationExtensionsKt;
import com.adif.elcanomovil.serviceStorage.model.StationEntity;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4671a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MapRegion f4673c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f4674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DefaultStationsRepository f4675e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MapRegion mapRegion, List list, DefaultStationsRepository defaultStationsRepository, Continuation continuation) {
        super(2, continuation);
        this.f4673c = mapRegion;
        this.f4674d = list;
        this.f4675e = defaultStationsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.f4673c, this.f4674d, this.f4675e, continuation);
        dVar.f4672b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StationMapper stationMapper;
        boolean stationInRegionBounds;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4671a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f4672b;
            MapRegion mapRegion = this.f4673c;
            LatLngBounds latLngBounds = mapRegion != null ? new LatLngBounds(LocationExtensionsKt.toLatLng(mapRegion.getSouthwest()), LocationExtensionsKt.toLatLng(mapRegion.getNortheast())) : null;
            List<StationEntity> list = this.f4674d;
            ArrayList arrayList = new ArrayList();
            for (StationEntity stationEntity : list) {
                DefaultStationsRepository defaultStationsRepository = this.f4675e;
                stationMapper = defaultStationsRepository.stationMapper;
                Station entityToDomain = stationMapper.entityToDomain(stationEntity);
                stationInRegionBounds = defaultStationsRepository.stationInRegionBounds(entityToDomain, latLngBounds);
                if (!stationInRegionBounds) {
                    entityToDomain = null;
                }
                if (entityToDomain != null) {
                    arrayList.add(entityToDomain);
                }
            }
            this.f4671a = 1;
            if (flowCollector.emit(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
