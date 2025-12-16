package com.adif.elcanomovil.widget;

import androidx.recyclerview.widget.C0221i;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.domain.entities.circulation.Circulation;
import com.adif.elcanomovil.domain.entities.utils.SyncResult;
import com.adif.elcanomovil.domain.usecases.circulation.GetDepartureCirculationsUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.serviceStorage.model.FavouriteEntity;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import com.adif.elcanomovil.widget.DeparturesWidgetViewAction;
import com.adif.elcanomovil.widget.domain.usecases.GetWidgetInfoUseCase;
import d1.InterfaceC0307a;
import d1.i;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

@Singleton
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001GBI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b#\u0010\u001eJ \u0010#\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b#\u0010$J\u001e\u0010(\u001a\u00020\u00142\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0082@¢\u0006\u0004\b(\u0010)J$\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0*2\u0006\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b+\u0010,J$\u0010-\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0082@¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00142\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010:R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010;R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010<R\u001a\u0010>\u001a\u00020=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR.\u0010D\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u001b0C\u0012\u0004\u0012\u00020\u00140B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER.\u0010F\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u001b0C\u0012\u0004\u0012\u00020\u00140B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010E¨\u0006H"}, d2 = {"Lcom/adif/elcanomovil/widget/DeparturesWidgetViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetDepartureCirculationsUseCase;", "getDepartureCirculationsUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "getStationByIdUseCase", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "preferenceStorage", "Lcom/adif/elcanomovil/widget/DeparturesWidgetView;", "view", "Ld1/a;", "appDispatcher", "Ld1/i;", "systemWrapper", "LX0/a;", "isBackgroundConnectivityRestricted", "Lcom/adif/elcanomovil/widget/domain/usecases/GetWidgetInfoUseCase;", "getWidgetInfoUseCase", "<init>", "(Lcom/adif/elcanomovil/domain/usecases/circulation/GetDepartureCirculationsUseCase;Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;Lcom/adif/elcanomovil/widget/DeparturesWidgetView;Ld1/a;Ld1/i;LX0/a;Lcom/adif/elcanomovil/widget/domain/usecases/GetWidgetInfoUseCase;)V", "", "updateAll", "()V", "", "widgetId", "widgetDeleted", "(I)V", "Lcom/adif/elcanomovil/widget/WidgetPayload;", "widgetPayload", "changeWay", "(ILcom/adif/elcanomovil/widget/WidgetPayload;)V", "Lcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;", "widgetInfo", "invertWay", "(Lcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;)Lcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;", "update", "(ILcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/adif/elcanomovil/domain/entities/circulation/Circulation;", "circulations", "updateCirculationsStationsDetails", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/adif/elcanomovil/domain/entities/utils/SyncResult;", "getCirculations", "(Lcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWidgetInfo", "(ILcom/adif/elcanomovil/widget/WidgetPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveWidgetInfo", "(I)Lcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;", "storeWidgetInfo", "(ILcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;)V", "Lcom/adif/elcanomovil/widget/DeparturesWidgetViewAction;", "action", "onViewAction", "(Lcom/adif/elcanomovil/widget/DeparturesWidgetViewAction;)V", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetDepartureCirculationsUseCase;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "Lcom/adif/elcanomovil/widget/DeparturesWidgetView;", "LX0/a;", "Lcom/adif/elcanomovil/widget/domain/usecases/GetWidgetInfoUseCase;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/Function1;", "Lkotlin/Pair;", "debounceUpdate", "Lkotlin/jvm/functions/Function1;", "debounceChangeWay", "Companion", "widget_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeparturesWidgetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeparturesWidgetViewModel.kt\ncom/adif/elcanomovil/widget/DeparturesWidgetViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1549#2:191\n1620#2,3:192\n*S KotlinDebug\n*F\n+ 1 DeparturesWidgetViewModel.kt\ncom/adif/elcanomovil/widget/DeparturesWidgetViewModel\n*L\n134#1:191\n134#1:192,3\n*E\n"})
/* loaded from: classes3.dex */
public final class DeparturesWidgetViewModel implements CoroutineScope {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long DEBOUNCE_INTERVAL = 1000;
    private final CoroutineContext coroutineContext;
    private final Function1<Pair<Integer, WidgetPayload>, Unit> debounceChangeWay;
    private final Function1<Pair<Integer, WidgetPayload>, Unit> debounceUpdate;
    private final GetDepartureCirculationsUseCase getDepartureCirculationsUseCase;
    private final GetStationByIdUseCase getStationByIdUseCase;
    private final GetWidgetInfoUseCase getWidgetInfoUseCase;
    private final X0.a isBackgroundConnectivityRestricted;
    private final PreferenceStorage preferenceStorage;
    private final DeparturesWidgetView view;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/adif/elcanomovil/widget/DeparturesWidgetViewModel$Companion;", "", "()V", "DEBOUNCE_INTERVAL", "", "getDEBOUNCE_INTERVAL$annotations", "widget_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDEBOUNCE_INTERVAL$annotations() {
        }

        private Companion() {
        }
    }

    @Inject
    public DeparturesWidgetViewModel(GetDepartureCirculationsUseCase getDepartureCirculationsUseCase, GetStationByIdUseCase getStationByIdUseCase, PreferenceStorage preferenceStorage, DeparturesWidgetView view, InterfaceC0307a appDispatcher, i systemWrapper, X0.a isBackgroundConnectivityRestricted, GetWidgetInfoUseCase getWidgetInfoUseCase) {
        Intrinsics.checkNotNullParameter(getDepartureCirculationsUseCase, "getDepartureCirculationsUseCase");
        Intrinsics.checkNotNullParameter(getStationByIdUseCase, "getStationByIdUseCase");
        Intrinsics.checkNotNullParameter(preferenceStorage, "preferenceStorage");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(appDispatcher, "appDispatcher");
        Intrinsics.checkNotNullParameter(systemWrapper, "systemWrapper");
        Intrinsics.checkNotNullParameter(isBackgroundConnectivityRestricted, "isBackgroundConnectivityRestricted");
        Intrinsics.checkNotNullParameter(getWidgetInfoUseCase, "getWidgetInfoUseCase");
        this.getDepartureCirculationsUseCase = getDepartureCirculationsUseCase;
        this.getStationByIdUseCase = getStationByIdUseCase;
        this.preferenceStorage = preferenceStorage;
        this.view = view;
        this.isBackgroundConnectivityRestricted = isBackgroundConnectivityRestricted;
        this.getWidgetInfoUseCase = getWidgetInfoUseCase;
        CompletableJob SupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        ((d1.d) appDispatcher).getClass();
        this.coroutineContext = SupervisorJob$default.plus(Dispatchers.getMain());
        b event = new b(this, 1);
        Intrinsics.checkNotNullParameter(systemWrapper, "systemWrapper");
        Intrinsics.checkNotNullParameter(event, "event");
        this.debounceUpdate = new b1.e(new C0221i(systemWrapper), event);
        b event2 = new b(this, 0);
        Intrinsics.checkNotNullParameter(systemWrapper, "systemWrapper");
        Intrinsics.checkNotNullParameter(event2, "event");
        this.debounceChangeWay = new b1.e(new C0221i(systemWrapper), event2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeWay(int widgetId, WidgetPayload widgetPayload) {
        BuildersKt.launch$default(this, null, CoroutineStart.UNDISPATCHED, new a(this, widgetId, widgetPayload, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getCirculations(FavouriteEntity favouriteEntity, Continuation<? super SyncResult<? extends List<? extends Circulation>>> continuation) {
        return this.getDepartureCirculationsUseCase.invoke(favouriteEntity.getIdentifierStation(), favouriteEntity.getIdentifierToStation(), CirculationType.BETWEEN_STATIONS, Intrinsics.areEqual(favouriteEntity.isCercanias(), Boxing.boxBoolean(true)) ? TrainType.CERCANIAS : TrainType.AVELDMD, 0, true, false, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getWidgetInfo(int i, WidgetPayload widgetPayload, Continuation<? super FavouriteEntity> continuation) {
        FavouriteEntity retrieveWidgetInfo = retrieveWidgetInfo(i);
        if (retrieveWidgetInfo != null) {
            return retrieveWidgetInfo;
        }
        if (widgetPayload == null) {
            return null;
        }
        Object invoke = this.getWidgetInfoUseCase.invoke(widgetPayload.getOrigin(), widgetPayload.getDestination(), widgetPayload.getIsCercanias(), continuation);
        return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : (FavouriteEntity) invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FavouriteEntity invertWay(FavouriteEntity widgetInfo) {
        return FavouriteEntity.copy$default(widgetInfo, 0, widgetInfo.getIdentifierToStation(), widgetInfo.getStationToName(), widgetInfo.getIdentifierStation(), widgetInfo.getStationName(), null, null, null, 225, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FavouriteEntity retrieveWidgetInfo(int widgetId) {
        Map<Integer, FavouriteEntity> widgetInfo = this.preferenceStorage.getWidgetInfo();
        if (widgetInfo != null) {
            return widgetInfo.getOrDefault(Integer.valueOf(widgetId), null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void storeWidgetInfo(int widgetId, FavouriteEntity widgetInfo) {
        Map<Integer, FavouriteEntity> linkedHashMap;
        Map<Integer, FavouriteEntity> widgetInfo2 = this.preferenceStorage.getWidgetInfo();
        if (widgetInfo2 == null || (linkedHashMap = MapsKt.toMutableMap(widgetInfo2)) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        linkedHashMap.put(Integer.valueOf(widgetId), widgetInfo);
        this.preferenceStorage.setWidgetInfo(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void update(int widgetId, WidgetPayload widgetPayload) {
        BuildersKt.launch$default(this, null, null, new c(this, widgetId, widgetPayload, null), 3, null);
    }

    private final void updateAll() {
        BuildersKt.launch$default(this, null, CoroutineStart.UNDISPATCHED, new e(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a0 -> B:13:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a2 -> B:13:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00db -> B:11:0x00df). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00f7 -> B:15:0x00f8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateCirculationsStationsDetails(java.util.List<? extends com.adif.elcanomovil.domain.entities.circulation.Circulation> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.widget.DeparturesWidgetViewModel.updateCirculationsStationsDetails(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void widgetDeleted(int widgetId) {
        Map<Integer, FavouriteEntity> map;
        PreferenceStorage preferenceStorage = this.preferenceStorage;
        Map<Integer, FavouriteEntity> widgetInfo = preferenceStorage.getWidgetInfo();
        if (widgetInfo == null || (map = MapsKt.toMutableMap(widgetInfo)) == null) {
            map = null;
        } else {
            map.remove(Integer.valueOf(widgetId));
        }
        preferenceStorage.setWidgetInfo(map);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public final void onViewAction(DeparturesWidgetViewAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof DeparturesWidgetViewAction.ChangeWay) {
            DeparturesWidgetViewAction.ChangeWay changeWay = (DeparturesWidgetViewAction.ChangeWay) action;
            this.debounceChangeWay.invoke(new Pair<>(Integer.valueOf(changeWay.getWidgetId()), changeWay.getWidgetPayload()));
        } else if (action instanceof DeparturesWidgetViewAction.Update) {
            DeparturesWidgetViewAction.Update update = (DeparturesWidgetViewAction.Update) action;
            this.debounceUpdate.invoke(new Pair<>(Integer.valueOf(update.getWidgetId()), update.getWidgetPayload()));
        } else if (action instanceof DeparturesWidgetViewAction.Delete) {
            widgetDeleted(((DeparturesWidgetViewAction.Delete) action).getWidgetId());
        } else if (Intrinsics.areEqual(action, DeparturesWidgetViewAction.UpdateAll.INSTANCE)) {
            updateAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0074, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object update(int r6, com.adif.elcanomovil.serviceStorage.model.FavouriteEntity r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.widget.DeparturesWidgetViewModel.update(int, com.adif.elcanomovil.serviceStorage.model.FavouriteEntity, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
