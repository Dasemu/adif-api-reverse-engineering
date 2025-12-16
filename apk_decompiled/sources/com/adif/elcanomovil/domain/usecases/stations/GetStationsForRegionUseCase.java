package com.adif.elcanomovil.domain.usecases.stations;

import android.location.Location;
import com.adif.elcanomovil.domain.entities.MapRegion;
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

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ&\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0086B¢\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/stations/GetStationsForRegionUseCase;", "", "locationProvider", "Lcom/adif/elcanomovil/domain/providers/LocationProvider;", "stationsRepository", "Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;", "check24hProvider", "Lcom/adif/elcanomovil/domain/providers/Check24hProvider;", "(Lcom/adif/elcanomovil/domain/providers/LocationProvider;Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;Lcom/adif/elcanomovil/domain/providers/Check24hProvider;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "mapRegion", "Lcom/adif/elcanomovil/domain/entities/MapRegion;", "(Lcom/adif/elcanomovil/domain/entities/MapRegion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateStationsDistance", "", "stations", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGetStationsForRegionUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetStationsForRegionUseCase.kt\ncom/adif/elcanomovil/domain/usecases/stations/GetStationsForRegionUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1855#2:48\n1856#2:50\n1#3:49\n*S KotlinDebug\n*F\n+ 1 GetStationsForRegionUseCase.kt\ncom/adif/elcanomovil/domain/usecases/stations/GetStationsForRegionUseCase\n*L\n42#1:48\n42#1:50\n*E\n"})
/* loaded from: classes.dex */
public final class GetStationsForRegionUseCase {
    private final Check24hProvider check24hProvider;
    private final LocationProvider locationProvider;
    private final StationsRepository stationsRepository;

    public GetStationsForRegionUseCase(LocationProvider locationProvider, StationsRepository stationsRepository, Check24hProvider check24hProvider) {
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(stationsRepository, "stationsRepository");
        Intrinsics.checkNotNullParameter(check24hProvider, "check24hProvider");
        this.locationProvider = locationProvider;
        this.stationsRepository = stationsRepository;
        this.check24hProvider = check24hProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStationsDistance(List<Station> stations, Location location) {
        for (Station station : stations) {
            Location location2 = station.getLocation();
            if (location2 != null) {
                station.setDistance(Float.valueOf(location2.distanceTo(location)));
            }
        }
    }

    public final Object invoke(MapRegion mapRegion, Continuation<? super Flow<? extends List<Station>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new g(this, mapRegion, null), continuation);
    }
}
