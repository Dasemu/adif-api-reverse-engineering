package com.adif.elcanomovil.uiHome.views;

import android.content.Context;
import android.location.Location;
import androidx.lifecycle.Q;
import androidx.lifecycle.X;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.domain.entities.MapRegion;
import com.adif.elcanomovil.domain.usecases.stations.GetHomeStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationsForRegionUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetWorkStationUseCase;
import com.adif.elcanomovil.domain.usecases.user.GetUserLastLocationUseCase;
import com.adif.elcanomovil.uiHome.data.StationMarker;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import dagger.hilt.android.lifecycle.HiltViewModel;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

@HiltViewModel
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010\u0014J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0004\b%\u0010$J\u001b\u0010&\u001a\u00020\u00102\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b&\u0010!J\u0019\u0010'\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b'\u0010\u001dJ\u000f\u0010(\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010\u0014J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u0004\u0018\u00010)2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b,\u0010-J\u001b\u0010.\u001a\u0004\u0018\u00010)2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b.\u0010/J!\u00101\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010)2\u0006\u00100\u001a\u00020\u0015H\u0002¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u00020\u00152\b\u00105\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b6\u00107J%\u0010<\u001a\u0004\u0018\u00010;2\b\u00109\u001a\u0004\u0018\u0001082\b\u0010:\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\b<\u0010=J\u0019\u0010>\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b>\u0010\u0012J!\u0010B\u001a\u00020\u00102\u0010\u0010A\u001a\f\u0012\u0004\u0012\u00020)0?j\u0002`@H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u00102\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0010H\u0002¢\u0006\u0004\bH\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010LR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010MR\u001c\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001f\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR$\u0010V\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020)0?j\u0002`@0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010PR'\u0010W\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020)0?j\u0002`@0Q8\u0006¢\u0006\f\n\u0004\bW\u0010S\u001a\u0004\bX\u0010UR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020D0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010PR\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020D0Q8\u0006¢\u0006\f\n\u0004\bZ\u0010S\u001a\u0004\b[\u0010UR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00150N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010PR\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00150Q8\u0006¢\u0006\f\n\u0004\b]\u0010S\u001a\u0004\b^\u0010UR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00150N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010PR\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00150Q8\u0006¢\u0006\f\n\u0004\b`\u0010S\u001a\u0004\ba\u0010UR$\u0010c\u001a\u00020\u00152\u0006\u0010b\u001a\u00020\u00158\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bc\u0010d\"\u0004\be\u0010\u0018R$\u0010f\u001a\u00020\u00152\u0006\u0010b\u001a\u00020\u00158\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bf\u0010d\"\u0004\bg\u0010\u0018R8\u0010A\u001a\f\u0012\u0004\u0012\u00020)0?j\u0002`@2\u0010\u0010b\u001a\f\u0012\u0004\u0012\u00020)0?j\u0002`@8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bA\u0010h\"\u0004\bi\u0010CR\u0018\u0010j\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006l"}, d2 = {"Lcom/adif/elcanomovil/uiHome/views/HomeMapViewModel;", "Landroidx/lifecycle/w0;", "Landroid/content/Context;", "context", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationsForRegionUseCase;", "getStationsUseCase", "Lcom/adif/elcanomovil/domain/usecases/user/GetUserLastLocationUseCase;", "getUserLastLocationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetHomeStationUseCase;", "getHomeStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetWorkStationUseCase;", "getWorkStationUseCase", "<init>", "(Landroid/content/Context;Lcom/adif/elcanomovil/domain/usecases/stations/GetStationsForRegionUseCase;Lcom/adif/elcanomovil/domain/usecases/user/GetUserLastLocationUseCase;Lcom/adif/elcanomovil/domain/usecases/stations/GetHomeStationUseCase;Lcom/adif/elcanomovil/domain/usecases/stations/GetWorkStationUseCase;)V", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "station", "", "onStationSelected", "(Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;)V", "onMapReady", "()V", "", "isAvailable", "userLocationAvailable", "(Z)V", "onMapPressed", "Lcom/google/android/gms/maps/model/Marker;", "marker", "onMarkerPressed", "(Lcom/google/android/gms/maps/model/Marker;)V", "Lcom/google/android/gms/maps/model/LatLngBounds;", "visibleRegion", "onMapCameraMoved", "(Lcom/google/android/gms/maps/model/LatLngBounds;)V", "fetchUserLocation", "fetchUserHomeStation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUserWorkStation", "fetchMarkers", "selectStation", "unselectSelectedStation", "Lcom/adif/elcanomovil/uiHome/data/StationMarker;", "updateSelectedStation", "(Lcom/adif/elcanomovil/uiHome/data/StationMarker;)V", "stationMarkerForStation", "(Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;)Lcom/adif/elcanomovil/uiHome/data/StationMarker;", "selectedStationForMarker", "(Lcom/google/android/gms/maps/model/Marker;)Lcom/adif/elcanomovil/uiHome/data/StationMarker;", "isSelected", "updateStationSelection", "(Lcom/adif/elcanomovil/uiHome/data/StationMarker;Z)V", "isMarkerSelected", "(Lcom/google/android/gms/maps/model/Marker;)Z", "stationMarker", "isStationMarkerSelected", "(Lcom/adif/elcanomovil/uiHome/data/StationMarker;)Z", "Landroid/location/Location;", "southwest", "northeast", "Lcom/adif/elcanomovil/domain/entities/MapRegion;", "mapRegion", "(Landroid/location/Location;Landroid/location/Location;)Lcom/adif/elcanomovil/domain/entities/MapRegion;", "notifyViewStationSelected", "Ljava/util/ArrayList;", "Lcom/adif/elcanomovil/uiHome/data/StationsMarkers;", "stationsMarkers", "notifyViewStationsMarkersUpdated", "(Ljava/util/ArrayList;)V", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "notifyViewMoveCameraToLocation", "(Lcom/google/android/gms/maps/model/LatLng;)V", "notifyUserPermissionEnabled", "Landroid/content/Context;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationsForRegionUseCase;", "Lcom/adif/elcanomovil/domain/usecases/user/GetUserLastLocationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetHomeStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetWorkStationUseCase;", "Landroidx/lifecycle/X;", "_stationObserver", "Landroidx/lifecycle/X;", "Landroidx/lifecycle/Q;", "stationObserver", "Landroidx/lifecycle/Q;", "getStationObserver", "()Landroidx/lifecycle/Q;", "_stationsMarkersObserver", "stationsMarkersObserver", "getStationsMarkersObserver", "_mapCameraObserver", "mapCameraObserver", "getMapCameraObserver", "_userPermission", "userPermission", "getUserPermission", "_markerSelected", "markerSelected", "getMarkerSelected", "value", "isUserLocationAvailable", "Z", "setUserLocationAvailable", "isMapReady", "setMapReady", "Ljava/util/ArrayList;", "setStationsMarkers", "selectedStation", "Lcom/adif/elcanomovil/uiHome/data/StationMarker;", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomeMapViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeMapViewModel.kt\ncom/adif/elcanomovil/uiHome/views/HomeMapViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,257:1\n288#2,2:258\n288#2,2:260\n*S KotlinDebug\n*F\n+ 1 HomeMapViewModel.kt\ncom/adif/elcanomovil/uiHome/views/HomeMapViewModel\n*L\n197#1:258,2\n201#1:260,2\n*E\n"})
/* loaded from: classes2.dex */
public final class HomeMapViewModel extends w0 {
    private final X _mapCameraObserver;
    private final X _markerSelected;
    private final X _stationObserver;
    private final X _stationsMarkersObserver;
    private final X _userPermission;
    private final Context context;
    private final GetHomeStationUseCase getHomeStationUseCase;
    private final GetStationsForRegionUseCase getStationsUseCase;
    private final GetUserLastLocationUseCase getUserLastLocationUseCase;
    private final GetWorkStationUseCase getWorkStationUseCase;
    private boolean isMapReady;
    private boolean isUserLocationAvailable;
    private final Q mapCameraObserver;
    private final Q markerSelected;
    private StationMarker selectedStation;
    private final Q stationObserver;
    private ArrayList<StationMarker> stationsMarkers;
    private final Q stationsMarkersObserver;
    private final Q userPermission;

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.X, androidx.lifecycle.Q] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.X, androidx.lifecycle.Q] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.X, androidx.lifecycle.Q] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.X, androidx.lifecycle.Q] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.X, androidx.lifecycle.Q] */
    @Inject
    public HomeMapViewModel(@ApplicationContext Context context, GetStationsForRegionUseCase getStationsUseCase, GetUserLastLocationUseCase getUserLastLocationUseCase, GetHomeStationUseCase getHomeStationUseCase, GetWorkStationUseCase getWorkStationUseCase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(getStationsUseCase, "getStationsUseCase");
        Intrinsics.checkNotNullParameter(getUserLastLocationUseCase, "getUserLastLocationUseCase");
        Intrinsics.checkNotNullParameter(getHomeStationUseCase, "getHomeStationUseCase");
        Intrinsics.checkNotNullParameter(getWorkStationUseCase, "getWorkStationUseCase");
        this.context = context;
        this.getStationsUseCase = getStationsUseCase;
        this.getUserLastLocationUseCase = getUserLastLocationUseCase;
        this.getHomeStationUseCase = getHomeStationUseCase;
        this.getWorkStationUseCase = getWorkStationUseCase;
        ?? q4 = new Q();
        this._stationObserver = q4;
        this.stationObserver = q4;
        ?? q5 = new Q();
        this._stationsMarkersObserver = q5;
        this.stationsMarkersObserver = q5;
        ?? q6 = new Q();
        this._mapCameraObserver = q6;
        this.mapCameraObserver = q6;
        ?? q7 = new Q();
        this._userPermission = q7;
        this.userPermission = q7;
        ?? q8 = new Q();
        this._markerSelected = q8;
        this.markerSelected = q8;
        this.stationsMarkers = new ArrayList<>();
    }

    private final void fetchMarkers(LatLngBounds visibleRegion) {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getIO(), null, new d(this, visibleRegion, null), 2, null);
    }

    public static /* synthetic */ void fetchMarkers$default(HomeMapViewModel homeMapViewModel, LatLngBounds latLngBounds, int i, Object obj) {
        if ((i & 1) != 0) {
            latLngBounds = null;
        }
        homeMapViewModel.fetchMarkers(latLngBounds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchUserHomeStation(kotlin.coroutines.Continuation<? super com.adif.elcanomovil.commonViews.data.StationViewEntity> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.adif.elcanomovil.uiHome.views.e
            if (r0 == 0) goto L13
            r0 = r6
            com.adif.elcanomovil.uiHome.views.e r0 = (com.adif.elcanomovil.uiHome.views.e) r0
            int r1 = r0.f5126d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5126d = r1
            goto L18
        L13:
            com.adif.elcanomovil.uiHome.views.e r0 = new com.adif.elcanomovil.uiHome.views.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f5124b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5126d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper r5 = r0.f5123a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper r6 = com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper.INSTANCE
            com.adif.elcanomovil.domain.usecases.stations.GetHomeStationUseCase r5 = r5.getHomeStationUseCase
            r0.f5123a = r6
            r0.f5126d = r3
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r4 = r6
            r6 = r5
            r5 = r4
        L48:
            com.adif.elcanomovil.domain.entities.station.Station r6 = (com.adif.elcanomovil.domain.entities.station.Station) r6
            com.adif.elcanomovil.commonViews.data.StationViewEntity r5 = r5.map(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiHome.views.HomeMapViewModel.fetchUserHomeStation(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchUserWorkStation(kotlin.coroutines.Continuation<? super com.adif.elcanomovil.commonViews.data.StationViewEntity> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.adif.elcanomovil.uiHome.views.g
            if (r0 == 0) goto L13
            r0 = r6
            com.adif.elcanomovil.uiHome.views.g r0 = (com.adif.elcanomovil.uiHome.views.g) r0
            int r1 = r0.f5133d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5133d = r1
            goto L18
        L13:
            com.adif.elcanomovil.uiHome.views.g r0 = new com.adif.elcanomovil.uiHome.views.g
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f5131b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5133d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper r5 = r0.f5130a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper r6 = com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper.INSTANCE
            com.adif.elcanomovil.domain.usecases.stations.GetWorkStationUseCase r5 = r5.getWorkStationUseCase
            r0.f5130a = r6
            r0.f5133d = r3
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r4 = r6
            r6 = r5
            r5 = r4
        L48:
            com.adif.elcanomovil.domain.entities.station.Station r6 = (com.adif.elcanomovil.domain.entities.station.Station) r6
            com.adif.elcanomovil.commonViews.data.StationViewEntity r5 = r5.map(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiHome.views.HomeMapViewModel.fetchUserWorkStation(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean isMarkerSelected(Marker marker) {
        Marker marker2;
        StationMarker stationMarker = this.selectedStation;
        return Intrinsics.areEqual((stationMarker == null || (marker2 = stationMarker.getMarker()) == null) ? null : marker2.getTag(), marker != null ? marker.getTag() : null);
    }

    private final boolean isStationMarkerSelected(StationMarker stationMarker) {
        StationViewEntity station;
        StationViewEntity station2;
        StationMarker stationMarker2 = this.selectedStation;
        String str = null;
        String id = (stationMarker2 == null || (station2 = stationMarker2.getStation()) == null) ? null : station2.getId();
        if (stationMarker != null && (station = stationMarker.getStation()) != null) {
            str = station.getId();
        }
        return Intrinsics.areEqual(id, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MapRegion mapRegion(Location southwest, Location northeast) {
        if (southwest == null || northeast == null) {
            return null;
        }
        return new MapRegion(southwest, northeast);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyUserPermissionEnabled() {
        this._userPermission.j(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyViewMoveCameraToLocation(LatLng latLng) {
        this._mapCameraObserver.j(latLng);
    }

    private final void notifyViewStationSelected(StationViewEntity station) {
        this._stationObserver.j(station);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyViewStationsMarkersUpdated(ArrayList<StationMarker> stationsMarkers) {
        this._stationsMarkersObserver.j(stationsMarkers);
    }

    private final void selectStation(Marker marker) {
        this._markerSelected.k(Boolean.TRUE);
        if (isMarkerSelected(marker)) {
            return;
        }
        updateStationSelection(this.selectedStation, false);
        StationMarker selectedStationForMarker = selectedStationForMarker(marker);
        if (selectedStationForMarker != null) {
            updateStationSelection(selectedStationForMarker, true);
            notifyViewStationSelected(selectedStationForMarker.getStation());
        }
    }

    private final StationMarker selectedStationForMarker(Marker marker) {
        Object obj;
        Iterator<T> it = this.stationsMarkers.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Marker marker2 = ((StationMarker) next).getMarker();
            if (Intrinsics.areEqual(marker2 != null ? marker2.getTag() : null, marker != null ? marker.getTag() : null)) {
                obj = next;
                break;
            }
        }
        return (StationMarker) obj;
    }

    private final void setMapReady(boolean z3) {
        this.isMapReady = z3;
        if (z3 && this.isUserLocationAvailable) {
            fetchUserLocation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStationsMarkers(ArrayList<StationMarker> arrayList) {
        this.stationsMarkers = arrayList;
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getMain().getImmediate(), null, new h(this, null), 2, null);
    }

    private final void setUserLocationAvailable(boolean z3) {
        this.isUserLocationAvailable = z3;
        if (z3 && this.isMapReady) {
            fetchUserLocation();
        }
    }

    private final StationMarker stationMarkerForStation(StationViewEntity station) {
        Object obj;
        Iterator<T> it = this.stationsMarkers.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((StationMarker) next).getStation().getId(), station != null ? station.getId() : null)) {
                obj = next;
                break;
            }
        }
        return (StationMarker) obj;
    }

    private final void unselectSelectedStation() {
        StationMarker stationMarker = this.selectedStation;
        if (stationMarker != null) {
            stationMarker.setSelected(false);
        }
        StationMarker stationMarker2 = this.selectedStation;
        if (stationMarker2 != null) {
            stationMarker2.updateMarkerIcon(this.context);
        }
        this.selectedStation = null;
    }

    private final void updateSelectedStation(StationMarker station) {
        this.selectedStation = station;
        if (station != null) {
            station.setSelected(true);
        }
        StationMarker stationMarker = this.selectedStation;
        if (stationMarker != null) {
            stationMarker.updateMarkerIcon(this.context);
        }
    }

    private final void updateStationSelection(StationMarker station, boolean isSelected) {
        Unit unit;
        if (station != null) {
            if (this.selectedStation != null) {
                if (isStationMarkerSelected(station)) {
                    if (!isSelected) {
                        unselectSelectedStation();
                    }
                } else if (isSelected) {
                    unselectSelectedStation();
                    updateSelectedStation(station);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null && isSelected) {
                updateSelectedStation(station);
            }
        }
    }

    public final void fetchUserLocation() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getMain().getImmediate(), null, new f(this, null), 2, null);
    }

    public final Q getMapCameraObserver() {
        return this.mapCameraObserver;
    }

    public final Q getMarkerSelected() {
        return this.markerSelected;
    }

    public final Q getStationObserver() {
        return this.stationObserver;
    }

    public final Q getStationsMarkersObserver() {
        return this.stationsMarkersObserver;
    }

    public final Q getUserPermission() {
        return this.userPermission;
    }

    public final void onMapCameraMoved(LatLngBounds visibleRegion) {
        fetchMarkers(visibleRegion);
    }

    public final void onMapPressed() {
        unselectSelectedStation();
        notifyViewStationSelected(null);
    }

    public final void onMapReady() {
        setMapReady(true);
    }

    public final void onMarkerPressed(Marker marker) {
        selectStation(marker);
    }

    public final void onStationSelected(StationViewEntity station) {
        StationMarker stationMarkerForStation = stationMarkerForStation(station);
        if (stationMarkerForStation != null) {
            updateStationSelection(stationMarkerForStation, true);
        }
    }

    public final void userLocationAvailable(boolean isAvailable) {
        setUserLocationAvailable(isAvailable);
    }
}
