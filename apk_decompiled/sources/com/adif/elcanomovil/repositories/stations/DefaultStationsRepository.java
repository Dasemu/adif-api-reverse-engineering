package com.adif.elcanomovil.repositories.stations;

import android.content.Context;
import android.location.Location;
import com.adif.elcanomovil.domain.entities.MapRegion;
import com.adif.elcanomovil.domain.entities.station.RequestedStationInfo;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.stations.StationsRepository;
import com.adif.elcanomovil.serviceNetworking.stations.StationsService;
import com.adif.elcanomovil.serviceStorage.database.StationsDao;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import d1.InterfaceC0307a;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Singleton
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020!H\u0002¢\u0006\u0004\b&\u0010'J*\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170+0*0)2\u0006\u0010(\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b,\u0010-J4\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170+0*0)2\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010(\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u0004\u0018\u00010\u00172\u0006\u00102\u001a\u00020!H\u0096@¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0017H\u0096@¢\u0006\u0004\b5\u0010\u0016J\u0018\u00106\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020!H\u0096@¢\u0006\u0004\b6\u00104J\u0018\u00107\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020!H\u0096@¢\u0006\u0004\b7\u00104J\u001e\u00109\u001a\b\u0012\u0004\u0012\u00020\u00170+2\u0006\u00108\u001a\u00020!H\u0096@¢\u0006\u0004\b9\u00104J\u0012\u0010:\u001a\u0004\u0018\u00010\u0017H\u0096@¢\u0006\u0004\b:\u0010\u0016J\u001d\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020;\u0018\u00010*0)H\u0016¢\u0006\u0004\b<\u0010=J#\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0*0)2\u0006\u00102\u001a\u00020!H\u0016¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020!H\u0096@¢\u0006\u0004\b@\u0010\u0016J\u0018\u0010A\u001a\u00020\u00122\u0006\u00102\u001a\u00020!H\u0096@¢\u0006\u0004\bA\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010GR\"\u0010I\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020;\u0018\u00010*0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lcom/adif/elcanomovil/repositories/stations/DefaultStationsRepository;", "Lcom/adif/elcanomovil/domain/repositories/stations/StationsRepository;", "Lcom/adif/elcanomovil/serviceNetworking/stations/StationsService;", "stationsService", "Lcom/adif/elcanomovil/serviceStorage/database/StationsDao;", "stationsDao", "Lcom/adif/elcanomovil/repositories/stations/StationMapper;", "stationMapper", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "storage", "Landroid/content/Context;", "context", "Ld1/a;", "appDispatcher", "<init>", "(Lcom/adif/elcanomovil/serviceNetworking/stations/StationsService;Lcom/adif/elcanomovil/serviceStorage/database/StationsDao;Lcom/adif/elcanomovil/repositories/stations/StationMapper;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;Landroid/content/Context;Ld1/a;)V", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationsResponse;", "stationResponse", "", "processAndInsertDBStationsResponse", "(Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationsResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseLocalFileWithStations", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "station", "Lcom/google/android/gms/maps/model/LatLngBounds;", "regionBounds", "", "stationInRegionBounds", "(Lcom/adif/elcanomovil/domain/entities/station/Station;Lcom/google/android/gms/maps/model/LatLngBounds;)Z", "Lcom/google/android/gms/maps/model/LatLng;", "calculateLatLong", "(Lcom/adif/elcanomovil/domain/entities/station/Station;)Lcom/google/android/gms/maps/model/LatLng;", "", "token", "storeToken", "(Ljava/lang/String;)V", "fileName", "getJsonFromAssets", "(Ljava/lang/String;)Ljava/lang/String;", "shouldFetch", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", RemoteConfigComponent.FETCH_FILE_NAME, "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/adif/elcanomovil/domain/entities/MapRegion;", "mapRegion", "fetchForRegion", "(Lcom/adif/elcanomovil/domain/entities/MapRegion;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stationCode", "fetchStation", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "homeStation", "saveHomeStation", "saveWorkStation", "searchText", "searchStation", "workStation", "Lcom/adif/elcanomovil/domain/entities/station/RequestedStationInfo;", "getCurrentOneStation", "()Lkotlinx/coroutines/flow/Flow;", "fetchOneStation", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "getLastVisitedStation", "setLastVisitedStation", "Lcom/adif/elcanomovil/serviceNetworking/stations/StationsService;", "Lcom/adif/elcanomovil/serviceStorage/database/StationsDao;", "Lcom/adif/elcanomovil/repositories/stations/StationMapper;", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "Landroid/content/Context;", "Ld1/a;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_currentOneStation", "Lkotlinx/coroutines/flow/MutableStateFlow;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultStationsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultStationsRepository.kt\ncom/adif/elcanomovil/repositories/stations/DefaultStationsRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,273:1\n1549#2:274\n1620#2,3:275\n1549#2:278\n1620#2,3:279\n*S KotlinDebug\n*F\n+ 1 DefaultStationsRepository.kt\ncom/adif/elcanomovil/repositories/stations/DefaultStationsRepository\n*L\n128#1:274\n128#1:275,3\n150#1:278\n150#1:279,3\n*E\n"})
/* loaded from: classes.dex */
public final class DefaultStationsRepository implements StationsRepository {
    private final MutableStateFlow<AsyncResult<RequestedStationInfo>> _currentOneStation;
    private final InterfaceC0307a appDispatcher;
    private final Context context;
    private final StationMapper stationMapper;
    private final StationsDao stationsDao;
    private final StationsService stationsService;
    private final PreferenceStorage storage;

    @Inject
    public DefaultStationsRepository(StationsService stationsService, StationsDao stationsDao, StationMapper stationMapper, PreferenceStorage storage, @ApplicationContext Context context, InterfaceC0307a appDispatcher) {
        Intrinsics.checkNotNullParameter(stationsService, "stationsService");
        Intrinsics.checkNotNullParameter(stationsDao, "stationsDao");
        Intrinsics.checkNotNullParameter(stationMapper, "stationMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appDispatcher, "appDispatcher");
        this.stationsService = stationsService;
        this.stationsDao = stationsDao;
        this.stationMapper = stationMapper;
        this.storage = storage;
        this.context = context;
        this.appDispatcher = appDispatcher;
        this._currentOneStation = StateFlowKt.MutableStateFlow(null);
    }

    private final LatLng calculateLatLong(Station station) {
        Location location = station.getLocation();
        if (location != null) {
            return new LatLng(location.getLatitude(), location.getLongitude());
        }
        return null;
    }

    private final String getJsonFromAssets(String fileName) {
        try {
            InputStream open = this.context.getAssets().open(fileName);
            Intrinsics.checkNotNullExpressionValue(open, "open(...)");
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
            return new String(bArr, forName);
        } catch (IOException e4) {
            String message = e4.getLocalizedMessage();
            if (message == null) {
                message = "Error reading JSON file";
            }
            Intrinsics.checkNotNullParameter(message, "message");
            t3.c.f8551a.a(message, new Object[0]);
            return "";
        }
    }

    public static /* synthetic */ String getJsonFromAssets$default(DefaultStationsRepository defaultStationsRepository, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "stations_all.json";
        }
        return defaultStationsRepository.getJsonFromAssets(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        if (r2.deleteAll(r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac A[LOOP:0: B:19:0x00a6->B:21:0x00ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object parseLocalFileWithStations(kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.adif.elcanomovil.repositories.stations.j
            if (r0 == 0) goto L13
            r0 = r9
            com.adif.elcanomovil.repositories.stations.j r0 = (com.adif.elcanomovil.repositories.stations.j) r0
            int r1 = r0.f4695e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4695e = r1
            goto L18
        L13:
            com.adif.elcanomovil.repositories.stations.j r0 = new com.adif.elcanomovil.repositories.stations.j
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f4693c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f4695e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            com.adif.elcanomovil.serviceNetworking.stations.model.StationsResponse r8 = r0.f4692b
            com.adif.elcanomovil.repositories.stations.DefaultStationsRepository r0 = r0.f4691a
            kotlin.ResultKt.throwOnFailure(r9)
            goto Lcb
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            com.adif.elcanomovil.serviceNetworking.stations.model.StationsResponse r8 = r0.f4692b
            com.adif.elcanomovil.repositories.stations.DefaultStationsRepository r2 = r0.f4691a
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r8
            r8 = r2
            goto L91
        L43:
            kotlin.ResultKt.throwOnFailure(r9)
            Z2.D r9 = new Z2.D
            r9.<init>()
            Z2.a r2 = new Z2.a
            r5 = 6
            r2.<init>(r5)
            r9.a(r2)
            Z2.G r2 = new Z2.G
            r2.<init>(r9)
            java.lang.String r9 = "build(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r9)
            java.lang.Class<com.adif.elcanomovil.serviceNetworking.stations.model.StationsResponse> r9 = com.adif.elcanomovil.serviceNetworking.stations.model.StationsResponse.class
            Z2.l r9 = r2.a(r9)
            java.lang.String r2 = "adapter(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            r2 = 0
            java.lang.String r2 = getJsonFromAssets$default(r8, r2, r4, r2)
            java.lang.Object r9 = r9.fromJson(r2)
            com.adif.elcanomovil.serviceNetworking.stations.model.StationsResponse r9 = (com.adif.elcanomovil.serviceNetworking.stations.model.StationsResponse) r9
            if (r9 == 0) goto Le0
            java.util.List r2 = r9.getRequestedStationInfoList()
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Le0
            com.adif.elcanomovil.serviceStorage.database.StationsDao r2 = r8.stationsDao
            r0.f4691a = r8
            r0.f4692b = r9
            r0.f4695e = r4
            java.lang.Object r2 = r2.deleteAll(r0)
            if (r2 != r1) goto L91
            goto Lc8
        L91:
            com.adif.elcanomovil.serviceStorage.database.StationsDao r2 = r8.stationsDao
            java.util.List r4 = r9.getRequestedStationInfoList()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = kotlin.collections.CollectionsKt.g(r4)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        La6:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Lbc
            java.lang.Object r6 = r4.next()
            com.adif.elcanomovil.serviceNetworking.stations.model.RequestedStationInfoListDTO r6 = (com.adif.elcanomovil.serviceNetworking.stations.model.RequestedStationInfoListDTO) r6
            com.adif.elcanomovil.repositories.stations.StationMapper r7 = r8.stationMapper
            com.adif.elcanomovil.serviceStorage.model.StationEntity r6 = r7.responseToEntity(r6)
            r5.add(r6)
            goto La6
        Lbc:
            r0.f4691a = r8
            r0.f4692b = r9
            r0.f4695e = r3
            java.lang.Object r0 = r2.insertAll(r5, r0)
            if (r0 != r1) goto Lc9
        Lc8:
            return r1
        Lc9:
            r0 = r8
            r8 = r9
        Lcb:
            java.lang.String r8 = r8.getToken()
            r0.storeToken(r8)
            com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage r8 = r0.storage
            java.util.Date r9 = new java.util.Date
            r9.<init>()
            long r0 = r9.getTime()
            r8.setLastFetchStationsDate(r0)
        Le0:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.stations.DefaultStationsRepository.parseLocalFileWithStations(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r10.deleteAll(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[LOOP:0: B:19:0x0073->B:21:0x0079, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processAndInsertDBStationsResponse(com.adif.elcanomovil.serviceNetworking.stations.model.StationsResponse r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.adif.elcanomovil.repositories.stations.k
            if (r0 == 0) goto L13
            r0 = r10
            com.adif.elcanomovil.repositories.stations.k r0 = (com.adif.elcanomovil.repositories.stations.k) r0
            int r1 = r0.f4700e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4700e = r1
            goto L18
        L13:
            com.adif.elcanomovil.repositories.stations.k r0 = new com.adif.elcanomovil.repositories.stations.k
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f4698c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f4700e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            com.adif.elcanomovil.serviceNetworking.stations.model.StationsResponse r8 = r0.f4697b
            com.adif.elcanomovil.repositories.stations.DefaultStationsRepository r9 = r0.f4696a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L99
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            com.adif.elcanomovil.serviceNetworking.stations.model.StationsResponse r9 = r0.f4697b
            com.adif.elcanomovil.repositories.stations.DefaultStationsRepository r8 = r0.f4696a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L5e
        L40:
            kotlin.ResultKt.throwOnFailure(r10)
            java.util.List r10 = r9.getRequestedStationInfoList()
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto Lae
            com.adif.elcanomovil.serviceStorage.database.StationsDao r10 = r8.stationsDao
            r0.f4696a = r8
            r0.f4697b = r9
            r0.f4700e = r4
            java.lang.Object r10 = r10.deleteAll(r0)
            if (r10 != r1) goto L5e
            goto L95
        L5e:
            com.adif.elcanomovil.serviceStorage.database.StationsDao r10 = r8.stationsDao
            java.util.List r2 = r9.getRequestedStationInfoList()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.CollectionsKt.g(r2)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L73:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L89
            java.lang.Object r5 = r2.next()
            com.adif.elcanomovil.serviceNetworking.stations.model.RequestedStationInfoListDTO r5 = (com.adif.elcanomovil.serviceNetworking.stations.model.RequestedStationInfoListDTO) r5
            com.adif.elcanomovil.repositories.stations.StationMapper r6 = r8.stationMapper
            com.adif.elcanomovil.serviceStorage.model.StationEntity r5 = r6.responseToEntity(r5)
            r4.add(r5)
            goto L73
        L89:
            r0.f4696a = r8
            r0.f4697b = r9
            r0.f4700e = r3
            java.lang.Object r10 = r10.insertAll(r4, r0)
            if (r10 != r1) goto L96
        L95:
            return r1
        L96:
            r7 = r9
            r9 = r8
            r8 = r7
        L99:
            java.lang.String r8 = r8.getToken()
            r9.storeToken(r8)
            com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage r8 = r9.storage
            java.util.Date r9 = new java.util.Date
            r9.<init>()
            long r9 = r9.getTime()
            r8.setLastFetchStationsDate(r9)
        Lae:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.stations.DefaultStationsRepository.processAndInsertDBStationsResponse(com.adif.elcanomovil.serviceNetworking.stations.model.StationsResponse, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean stationInRegionBounds(Station station, LatLngBounds regionBounds) {
        if (regionBounds == null) {
            return true;
        }
        LatLng calculateLatLong = calculateLatLong(station);
        Boolean valueOf = calculateLatLong != null ? Boolean.valueOf(regionBounds.contains(calculateLatLong)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return true;
    }

    private final void storeToken(String token) {
        this.storage.setStationListToken(token);
    }

    @Override // com.adif.elcanomovil.domain.repositories.stations.StationsRepository
    public Object fetch(boolean z3, Continuation<? super Flow<? extends AsyncResult<? extends List<Station>>>> continuation) {
        ((d1.d) this.appDispatcher).getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new c(this, z3, null), continuation);
    }

    @Override // com.adif.elcanomovil.domain.repositories.stations.StationsRepository
    public Object fetchForRegion(MapRegion mapRegion, boolean z3, Continuation<? super Flow<? extends AsyncResult<? extends List<Station>>>> continuation) {
        ((d1.d) this.appDispatcher).getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new f(this, mapRegion, z3, null), continuation);
    }

    @Override // com.adif.elcanomovil.domain.repositories.stations.StationsRepository
    public Flow<AsyncResult<RequestedStationInfo>> fetchOneStation(String stationCode) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        return FlowKt.flow(new h(this, stationCode, null));
    }

    @Override // com.adif.elcanomovil.domain.repositories.stations.StationsRepository
    public Object fetchStation(String str, Continuation<? super Station> continuation) {
        if (StringsKt.isBlank(str)) {
            return null;
        }
        ((d1.d) this.appDispatcher).getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new i(this, str, null), continuation);
    }

    @Override // com.adif.elcanomovil.domain.repositories.stations.StationsRepository
    public Flow<AsyncResult<RequestedStationInfo>> getCurrentOneStation() {
        return this._currentOneStation;
    }

    @Override // com.adif.elcanomovil.domain.repositories.stations.StationsRepository
    public Object getLastVisitedStation(Continuation<? super String> continuation) {
        return this.storage.getLastVisitedStationCode();
    }

    @Override // com.adif.elcanomovil.domain.repositories.stations.StationsRepository
    public Object homeStation(Continuation<? super Station> continuation) {
        return fetchStation(this.storage.getHomeStationId(), continuation);
    }

    @Override // com.adif.elcanomovil.domain.repositories.stations.StationsRepository
    public Object saveHomeStation(String str, Continuation<? super Unit> continuation) {
        this.storage.setHomeStationId(str);
        return Unit.INSTANCE;
    }

    @Override // com.adif.elcanomovil.domain.repositories.stations.StationsRepository
    public Object saveWorkStation(String str, Continuation<? super Unit> continuation) {
        this.storage.setWorkStationId(str);
        return Unit.INSTANCE;
    }

    @Override // com.adif.elcanomovil.domain.repositories.stations.StationsRepository
    public Object searchStation(String str, Continuation<? super List<Station>> continuation) {
        ((d1.d) this.appDispatcher).getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new l(this, str, null), continuation);
    }

    @Override // com.adif.elcanomovil.domain.repositories.stations.StationsRepository
    public Object setLastVisitedStation(String str, Continuation<? super Unit> continuation) {
        this.storage.setLastVisitedStationCode(str);
        return Unit.INSTANCE;
    }

    @Override // com.adif.elcanomovil.domain.repositories.stations.StationsRepository
    public Object workStation(Continuation<? super Station> continuation) {
        return fetchStation(this.storage.getWorkStationId(), continuation);
    }
}
