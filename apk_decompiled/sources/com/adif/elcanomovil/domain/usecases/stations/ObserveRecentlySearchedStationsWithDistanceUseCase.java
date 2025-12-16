package com.adif.elcanomovil.domain.usecases.stations;

import android.location.Location;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.domain.providers.LocationProvider;
import com.adif.elcanomovil.domain.usecases.recentSearch.GetRecentSearchesUseCase;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/stations/ObserveRecentlySearchedStationsWithDistanceUseCase;", "", "locationProvider", "Lcom/adif/elcanomovil/domain/providers/LocationProvider;", "getRecentStations", "Lcom/adif/elcanomovil/domain/usecases/recentSearch/GetRecentSearchesUseCase;", "(Lcom/adif/elcanomovil/domain/providers/LocationProvider;Lcom/adif/elcanomovil/domain/usecases/recentSearch/GetRecentSearchesUseCase;)V", "calculateLocationtStation", "", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "stations", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "invoke", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeDistanceChangesAndUpdate", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nObserveRecentlySearchedStationsWithDistanceUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserveRecentlySearchedStationsWithDistanceUseCase.kt\ncom/adif/elcanomovil/domain/usecases/stations/ObserveRecentlySearchedStationsWithDistanceUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1855#2:39\n1856#2:41\n1#3:40\n*S KotlinDebug\n*F\n+ 1 ObserveRecentlySearchedStationsWithDistanceUseCase.kt\ncom/adif/elcanomovil/domain/usecases/stations/ObserveRecentlySearchedStationsWithDistanceUseCase\n*L\n32#1:39\n32#1:41\n*E\n"})
/* loaded from: classes.dex */
public final class ObserveRecentlySearchedStationsWithDistanceUseCase {
    private final GetRecentSearchesUseCase getRecentStations;
    private final LocationProvider locationProvider;

    public ObserveRecentlySearchedStationsWithDistanceUseCase(LocationProvider locationProvider, GetRecentSearchesUseCase getRecentStations) {
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(getRecentStations, "getRecentStations");
        this.locationProvider = locationProvider;
        this.getRecentStations = getRecentStations;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Station> calculateLocationtStation(List<Station> stations, Location location) {
        for (Station station : stations) {
            Location location2 = station.getLocation();
            station.setDistance(location2 != null ? Float.valueOf(location.distanceTo(location2)) : null);
        }
        return stations;
    }

    private final Flow<List<Station>> observeDistanceChangesAndUpdate(List<Station> stations) {
        return FlowKt.flow(new m(this, stations, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.adif.elcanomovil.domain.entities.station.Station>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.adif.elcanomovil.domain.usecases.stations.j
            if (r0 == 0) goto L13
            r0 = r5
            com.adif.elcanomovil.domain.usecases.stations.j r0 = (com.adif.elcanomovil.domain.usecases.stations.j) r0
            int r1 = r0.f4515d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4515d = r1
            goto L18
        L13:
            com.adif.elcanomovil.domain.usecases.stations.j r0 = new com.adif.elcanomovil.domain.usecases.stations.j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4513b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f4515d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.adif.elcanomovil.domain.usecases.stations.ObserveRecentlySearchedStationsWithDistanceUseCase r4 = r0.f4512a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L43
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.throwOnFailure(r5)
            com.adif.elcanomovil.domain.usecases.recentSearch.GetRecentSearchesUseCase r5 = r4.getRecentStations
            r0.f4512a = r4
            r0.f4515d = r3
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.util.List r5 = (java.util.List) r5
            kotlinx.coroutines.flow.Flow r4 = r4.observeDistanceChangesAndUpdate(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.domain.usecases.stations.ObserveRecentlySearchedStationsWithDistanceUseCase.invoke(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
