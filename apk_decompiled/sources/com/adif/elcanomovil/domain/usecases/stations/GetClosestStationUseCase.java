package com.adif.elcanomovil.domain.usecases.stations;

import android.location.Location;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.domain.providers.Check24hProvider;
import com.adif.elcanomovil.domain.providers.LocationProvider;
import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010H\u0086B¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/stations/GetClosestStationUseCase;", "", "locationProvider", "Lcom/adif/elcanomovil/domain/providers/LocationProvider;", "stationsRepository", "Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;", "check24hProvider", "Lcom/adif/elcanomovil/domain/providers/Check24hProvider;", "(Lcom/adif/elcanomovil/domain/providers/LocationProvider;Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;Lcom/adif/elcanomovil/domain/providers/Check24hProvider;)V", "findClosestStation", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "stations", "", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "invoke", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGetClosestStationUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetClosestStationUseCase.kt\ncom/adif/elcanomovil/domain/usecases/stations/GetClosestStationUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n1855#2,2:57\n*S KotlinDebug\n*F\n+ 1 GetClosestStationUseCase.kt\ncom/adif/elcanomovil/domain/usecases/stations/GetClosestStationUseCase\n*L\n43#1:57,2\n*E\n"})
/* loaded from: classes.dex */
public final class GetClosestStationUseCase {
    private final Check24hProvider check24hProvider;
    private final LocationProvider locationProvider;
    private final StationsRepository stationsRepository;

    public GetClosestStationUseCase(LocationProvider locationProvider, StationsRepository stationsRepository, Check24hProvider check24hProvider) {
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        Intrinsics.checkNotNullParameter(check24hProvider, "check24hProvider");
        this.locationProvider = locationProvider;
        this.stationsRepository = stationsRepository;
        this.check24hProvider = check24hProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Station findClosestStation(List<Station> stations, Location location) {
        float f2 = Float.MAX_VALUE;
        Station station = null;
        for (Station station2 : stations) {
            Location location2 = station2.getLocation();
            if (location2 != null) {
                float distanceTo = location2.distanceTo(location);
                station2.setDistance(Float.valueOf(distanceTo));
                if (distanceTo < f2) {
                    station = station2;
                    f2 = distanceTo;
                }
            }
        }
        return station;
    }

    public final Object invoke(Continuation<? super Flow<Station>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(this, null), continuation);
    }
}
