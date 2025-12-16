package com.adif.elcanomovil.repositories.circulation;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.domain.entities.circulation.CommercialPathRouteSidesInfo;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.serviceNetworking.circulations.CirculationService;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import q1.d;
import q1.e;
import q1.f;
import q1.g;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ<\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0096@¢\u0006\u0002\u0010%JF\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0096@¢\u0006\u0002\u0010'J<\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0096@¢\u0006\u0002\u0010%JH\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001c0*0\u000e2\u0006\u0010,\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$H\u0096@¢\u0006\u0002\u00100J\b\u00101\u001a\u000202H\u0002J\n\u00103\u001a\u0004\u0018\u00010\u0019H\u0016J\u0016\u00104\u001a\u0002022\u0006\u0010\u001e\u001a\u00020\nH\u0096@¢\u0006\u0002\u00105J\u0016\u00106\u001a\u0002022\u0006\u0010\u001e\u001a\u00020\nH\u0096@¢\u0006\u0002\u00105J\u0012\u00107\u001a\u0002022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J0\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001c0*0\u000e2\u0006\u0010,\u001a\u00020\n2\u0006\u0010/\u001a\u00020$H\u0096@¢\u0006\u0002\u00109R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/adif/elcanomovil/repositories/circulation/DefaultCirculationRepository;", "Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository;", "circulationService", "Lcom/adif/elcanomovil/serviceNetworking/circulations/CirculationService;", "circulationMapper", "Lcom/adif/elcanomovil/repositories/circulation/CirculationMapper;", "storage", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/CirculationService;Lcom/adif/elcanomovil/repositories/circulation/CirculationMapper;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;)V", NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "", "getDestinationStationCode", "()Ljava/lang/String;", "destinationStationCodeAsFlow", "Lkotlinx/coroutines/flow/Flow;", "getDestinationStationCodeAsFlow", "()Lkotlinx/coroutines/flow/Flow;", "destinationStationCodeFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, "getOriginStationCode", "originStationCodeAsFlow", "getOriginStationCodeAsFlow", "originStationCodeFlow", "trainTypeRequest", "Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository$TrainTypeRequest;", NavArguments.ARG_DYNAMIC_ARRIVALS, "Lcom/adif/elcanomovil/domain/entities/utils/SyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialCirculation;", "stationCode", "isCercanias", "Lcom/adif/elcanomovil/domain/entities/TrainType;", "page", "", "showOnlyCommercialStopType", "", "(Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/TrainType;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "betweenStations", "(Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/TrainType;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", NavArguments.ARG_DYNAMIC_DEPARTURES, "onePaths", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathRouteSidesInfo;", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_ALL_CONTROL_POINTS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readLastValues", "", "readTrainTypeRequest", "setLastDepartureArrivalStation", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLastDepartureArrivalStationTo", "setLastDepartureTypeTrainIsCercanias", "severalPaths", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultCirculationRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultCirculationRepository.kt\ncom/adif/elcanomovil/repositories/circulation/DefaultCirculationRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1549#2:245\n1620#2,3:246\n1549#2:249\n1620#2,3:250\n1549#2:253\n1620#2,3:254\n*S KotlinDebug\n*F\n+ 1 DefaultCirculationRepository.kt\ncom/adif/elcanomovil/repositories/circulation/DefaultCirculationRepository\n*L\n71#1:245\n71#1:246,3\n108#1:249\n108#1:250,3\n148#1:253\n148#1:254,3\n*E\n"})
/* loaded from: classes.dex */
public final class DefaultCirculationRepository implements CirculationRepository {
    private final CirculationMapper circulationMapper;
    private final CirculationService circulationService;
    private final Flow<String> destinationStationCodeAsFlow;
    private MutableStateFlow<String> destinationStationCodeFlow;
    private final Flow<String> originStationCodeAsFlow;
    private MutableStateFlow<String> originStationCodeFlow;
    private final PreferenceStorage storage;
    private CirculationRepository.TrainTypeRequest trainTypeRequest;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrainType.values().length];
            try {
                iArr[TrainType.CERCANIAS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrainType.AVELDMD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrainType.CORPORATE_OTHERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultCirculationRepository(CirculationService circulationService, CirculationMapper circulationMapper, PreferenceStorage storage) {
        Intrinsics.checkNotNullParameter(circulationService, "circulationService");
        Intrinsics.checkNotNullParameter(circulationMapper, "circulationMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.circulationService = circulationService;
        this.circulationMapper = circulationMapper;
        this.storage = storage;
        this.originStationCodeFlow = StateFlowKt.MutableStateFlow(null);
        this.destinationStationCodeFlow = StateFlowKt.MutableStateFlow(null);
        this.originStationCodeAsFlow = FlowKt.filterNotNull(this.originStationCodeFlow);
        this.destinationStationCodeAsFlow = FlowKt.filterNotNull(this.destinationStationCodeFlow);
        readLastValues();
    }

    private final void readLastValues() {
        this.originStationCodeFlow.setValue(this.storage.getLastDeparturesArrivalsStationCode());
        this.destinationStationCodeFlow.setValue(this.storage.getLastDeparturesArrivalsStationToCode());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ba A[Catch: Exception -> 0x00d0, KotlinNullPointerException -> 0x00da, LOOP:0: B:13:0x00b4->B:15:0x00ba, LOOP_END, TryCatch #2 {KotlinNullPointerException -> 0x00da, Exception -> 0x00d0, blocks: (B:11:0x002b, B:12:0x009f, B:13:0x00b4, B:15:0x00ba, B:17:0x00ca, B:26:0x0045, B:32:0x0055, B:34:0x0065, B:38:0x006e, B:43:0x007a, B:45:0x0081, B:48:0x007e, B:49:0x0072, B:50:0x0059, B:51:0x005e, B:52:0x005f, B:53:0x0062), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object arrivals(java.lang.String r17, com.adif.elcanomovil.domain.entities.TrainType r18, int r19, boolean r20, kotlin.coroutines.Continuation<? super com.adif.elcanomovil.domain.entities.utils.SyncResult<? extends java.util.List<? extends com.adif.elcanomovil.domain.entities.circulation.CommercialCirculation>>> r21) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.circulation.DefaultCirculationRepository.arrivals(java.lang.String, com.adif.elcanomovil.domain.entities.TrainType, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c5 A[Catch: Exception -> 0x00db, KotlinNullPointerException -> 0x00e2, LOOP:0: B:13:0x00bf->B:15:0x00c5, LOOP_END, TryCatch #2 {KotlinNullPointerException -> 0x00e2, Exception -> 0x00db, blocks: (B:11:0x002b, B:12:0x00aa, B:13:0x00bf, B:15:0x00c5, B:17:0x00d5, B:29:0x004f, B:35:0x005f, B:37:0x006f, B:41:0x0078, B:46:0x0084, B:48:0x008b, B:51:0x0088, B:52:0x007c, B:53:0x0063, B:54:0x0068, B:55:0x0069, B:56:0x006c), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object betweenStations(java.lang.String r17, java.lang.String r18, com.adif.elcanomovil.domain.entities.TrainType r19, int r20, boolean r21, kotlin.coroutines.Continuation<? super com.adif.elcanomovil.domain.entities.utils.SyncResult<? extends java.util.List<? extends com.adif.elcanomovil.domain.entities.circulation.CommercialCirculation>>> r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.circulation.DefaultCirculationRepository.betweenStations(java.lang.String, java.lang.String, com.adif.elcanomovil.domain.entities.TrainType, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ba A[Catch: Exception -> 0x00d0, KotlinNullPointerException -> 0x00da, LOOP:0: B:13:0x00b4->B:15:0x00ba, LOOP_END, TryCatch #2 {KotlinNullPointerException -> 0x00da, Exception -> 0x00d0, blocks: (B:11:0x002b, B:12:0x009f, B:13:0x00b4, B:15:0x00ba, B:17:0x00ca, B:26:0x0045, B:32:0x0055, B:34:0x0065, B:38:0x006e, B:43:0x007a, B:45:0x0081, B:48:0x007e, B:49:0x0072, B:50:0x0059, B:51:0x005e, B:52:0x005f, B:53:0x0062), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object departures(java.lang.String r17, com.adif.elcanomovil.domain.entities.TrainType r18, int r19, boolean r20, kotlin.coroutines.Continuation<? super com.adif.elcanomovil.domain.entities.utils.SyncResult<? extends java.util.List<? extends com.adif.elcanomovil.domain.entities.circulation.CommercialCirculation>>> r21) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.circulation.DefaultCirculationRepository.departures(java.lang.String, com.adif.elcanomovil.domain.entities.TrainType, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository
    public String getDestinationStationCode() {
        return this.destinationStationCodeFlow.getValue();
    }

    @Override // com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository
    public Flow<String> getDestinationStationCodeAsFlow() {
        return this.destinationStationCodeAsFlow;
    }

    @Override // com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository
    public String getOriginStationCode() {
        return this.originStationCodeFlow.getValue();
    }

    @Override // com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository
    public Flow<String> getOriginStationCodeAsFlow() {
        return this.originStationCodeAsFlow;
    }

    @Override // com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository
    public Object onePaths(String str, String str2, String str3, long j4, boolean z3, Continuation<? super Flow<? extends AsyncResult<? extends List<CommercialPathRouteSidesInfo>>>> continuation) {
        return FlowKt.flow(new d(this, z3, str, str3, j4, str2, null));
    }

    @Override // com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository
    /* renamed from: readTrainTypeRequest, reason: from getter */
    public CirculationRepository.TrainTypeRequest getTrainTypeRequest() {
        return this.trainTypeRequest;
    }

    @Override // com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository
    public Object setLastDepartureArrivalStation(String str, Continuation<? super Unit> continuation) {
        this.originStationCodeFlow.setValue(str);
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new e(this, str, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository
    public Object setLastDepartureArrivalStationTo(String str, Continuation<? super Unit> continuation) {
        this.destinationStationCodeFlow.setValue(str);
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new f(this, str, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository
    public void setLastDepartureTypeTrainIsCercanias(CirculationRepository.TrainTypeRequest trainTypeRequest) {
        this.trainTypeRequest = trainTypeRequest;
    }

    @Override // com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository
    public Object severalPaths(String str, boolean z3, Continuation<? super Flow<? extends AsyncResult<? extends List<CommercialPathRouteSidesInfo>>>> continuation) {
        return FlowKt.flow(new g(this, z3, str, null));
    }
}
