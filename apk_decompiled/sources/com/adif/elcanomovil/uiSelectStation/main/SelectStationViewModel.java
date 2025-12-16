package com.adif.elcanomovil.uiSelectStation.main;

import android.icu.text.Collator;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.domain.usecases.recentSearch.SaveRecentSearchUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetClosestStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetHomeStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByNameUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetWorkStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.ObserveRecentlySearchedStationsWithDistanceUseCase;
import com.adif.elcanomovil.repositories.utils.REGEX_UNACCENTKt;
import com.adif.elcanomovil.uiSelectStation.main.SelectStationViewState;
import com.adif.elcanomovil.uiSelectStation.mappers.StationOptionViewEntityMapper;
import com.google.android.gms.actions.SearchIntents;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001LBI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0082@¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010\u0016J\u001d\u0010%\u001a\u00020$2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\"¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00142\b\u0010.\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b/\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00105R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00106R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u0002090<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010BR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001e\u0010G\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationViewModel;", "Landroidx/lifecycle/w0;", "Lcom/adif/elcanomovil/domain/usecases/recentSearch/SaveRecentSearchUseCase;", "saveRecentSearchUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetClosestStationUseCase;", "getClosestStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetHomeStationUseCase;", "getHomeStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetWorkStationUseCase;", "getWorkStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByNameUseCase;", "getStationByNameUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/ObserveRecentlySearchedStationsWithDistanceUseCase;", "observeRecentlySearchedStationsWithDistance", "Ld1/g;", "stringProvider", "Landroid/icu/text/Collator;", "collator", "<init>", "(Lcom/adif/elcanomovil/domain/usecases/recentSearch/SaveRecentSearchUseCase;Lcom/adif/elcanomovil/domain/usecases/stations/GetClosestStationUseCase;Lcom/adif/elcanomovil/domain/usecases/stations/GetHomeStationUseCase;Lcom/adif/elcanomovil/domain/usecases/stations/GetWorkStationUseCase;Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByNameUseCase;Lcom/adif/elcanomovil/domain/usecases/stations/ObserveRecentlySearchedStationsWithDistanceUseCase;Ld1/g;Landroid/icu/text/Collator;)V", "", "observeClosestStation", "()V", "observeRecentSearches", "Lcom/adif/elcanomovil/commonNavGraph/arguments/NavArguments$StationSelectionType;", "stationType", "loadUserStations", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/NavArguments$StationSelectionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "fetchUserHomeStation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUserWorkStation", "showUpdateMainSearch", "", "", "keywords", "", "isValidSearchText", "(Ljava/util/List;)Z", "fetchStationsBy", "(Ljava/util/List;)V", "onViewsLoaded", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/NavArguments$StationSelectionType;)V", SearchIntents.EXTRA_QUERY, "handleSearchTextChange", "(Ljava/lang/String;)V", "station", "saveStation", "Lcom/adif/elcanomovil/domain/usecases/recentSearch/SaveRecentSearchUseCase;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetClosestStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetHomeStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetWorkStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByNameUseCase;", "Lcom/adif/elcanomovil/domain/usecases/stations/ObserveRecentlySearchedStationsWithDistanceUseCase;", "Ld1/g;", "Landroid/icu/text/Collator;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationViewState;", "_viewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "viewState", "Lkotlinx/coroutines/flow/StateFlow;", "getViewState", "()Lkotlinx/coroutines/flow/StateFlow;", "homeStation", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "workStation", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "userNearStation", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "userLastSearches", "Ljava/util/List;", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/Job;", "Companion", "ui-select-station_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectStationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectStationViewModel.kt\ncom/adif/elcanomovil/uiSelectStation/main/SelectStationViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n766#2:164\n857#2,2:165\n1549#2:167\n1620#2,3:168\n1747#2,3:171\n*S KotlinDebug\n*F\n+ 1 SelectStationViewModel.kt\ncom/adif/elcanomovil/uiSelectStation/main/SelectStationViewModel\n*L\n118#1:164\n118#1:165,2\n118#1:167\n118#1:168,3\n127#1:171,3\n*E\n"})
/* loaded from: classes2.dex */
public final class SelectStationViewModel extends w0 {
    public static final int MIN_LETTERS_SEARCH = 3;
    private final MutableStateFlow<SelectStationViewState> _viewState;
    private final Collator collator;
    private final GetClosestStationUseCase getClosestStationUseCase;
    private final GetHomeStationUseCase getHomeStationUseCase;
    private final GetStationByNameUseCase getStationByNameUseCase;
    private final GetWorkStationUseCase getWorkStationUseCase;
    private StationViewEntity homeStation;
    private Job job;
    private final ObserveRecentlySearchedStationsWithDistanceUseCase observeRecentlySearchedStationsWithDistance;
    private final SaveRecentSearchUseCase saveRecentSearchUseCase;
    private final d1.g stringProvider;
    private List<Station> userLastSearches;
    private Station userNearStation;
    private final StateFlow<SelectStationViewState> viewState;
    private StationViewEntity workStation;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavArguments.StationSelectionType.values().length];
            try {
                iArr[NavArguments.StationSelectionType.HOME_STATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavArguments.StationSelectionType.WORK_STATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public SelectStationViewModel(SaveRecentSearchUseCase saveRecentSearchUseCase, GetClosestStationUseCase getClosestStationUseCase, GetHomeStationUseCase getHomeStationUseCase, GetWorkStationUseCase getWorkStationUseCase, GetStationByNameUseCase getStationByNameUseCase, ObserveRecentlySearchedStationsWithDistanceUseCase observeRecentlySearchedStationsWithDistance, d1.g stringProvider, Collator collator) {
        Intrinsics.checkNotNullParameter(saveRecentSearchUseCase, "saveRecentSearchUseCase");
        Intrinsics.checkNotNullParameter(getClosestStationUseCase, "getClosestStationUseCase");
        Intrinsics.checkNotNullParameter(getHomeStationUseCase, "getHomeStationUseCase");
        Intrinsics.checkNotNullParameter(getWorkStationUseCase, "getWorkStationUseCase");
        Intrinsics.checkNotNullParameter(getStationByNameUseCase, "getStationByNameUseCase");
        Intrinsics.checkNotNullParameter(observeRecentlySearchedStationsWithDistance, "observeRecentlySearchedStationsWithDistance");
        Intrinsics.checkNotNullParameter(stringProvider, "stringProvider");
        Intrinsics.checkNotNullParameter(collator, "collator");
        this.saveRecentSearchUseCase = saveRecentSearchUseCase;
        this.getClosestStationUseCase = getClosestStationUseCase;
        this.getHomeStationUseCase = getHomeStationUseCase;
        this.getWorkStationUseCase = getWorkStationUseCase;
        this.getStationByNameUseCase = getStationByNameUseCase;
        this.observeRecentlySearchedStationsWithDistance = observeRecentlySearchedStationsWithDistance;
        this.stringProvider = stringProvider;
        this.collator = collator;
        MutableStateFlow<SelectStationViewState> MutableStateFlow = StateFlowKt.MutableStateFlow(new SelectStationViewState.MainSearch(CollectionsKt.emptyList(), null, null, null));
        this._viewState = MutableStateFlow;
        this.viewState = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final /* synthetic */ MutableStateFlow access$get_viewState$p(SelectStationViewModel selectStationViewModel) {
        return selectStationViewModel._viewState;
    }

    public static final /* synthetic */ void access$setUserLastSearches$p(SelectStationViewModel selectStationViewModel, List list) {
        selectStationViewModel.userLastSearches = list;
    }

    public static final /* synthetic */ void access$showUpdateMainSearch(SelectStationViewModel selectStationViewModel) {
        selectStationViewModel.showUpdateMainSearch();
    }

    private final void fetchStationsBy(List<String> keywords) {
        Job launch$default;
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new g(this, keywords, null), 3, null);
        this.job = launch$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchUserHomeStation(kotlin.coroutines.Continuation<? super com.adif.elcanomovil.commonViews.data.StationViewEntity> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.adif.elcanomovil.uiSelectStation.main.h
            if (r0 == 0) goto L13
            r0 = r6
            com.adif.elcanomovil.uiSelectStation.main.h r0 = (com.adif.elcanomovil.uiSelectStation.main.h) r0
            int r1 = r0.f5197d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5197d = r1
            goto L18
        L13:
            com.adif.elcanomovil.uiSelectStation.main.h r0 = new com.adif.elcanomovil.uiSelectStation.main.h
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f5195b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5197d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.adif.elcanomovil.uiSelectStation.mappers.StationViewEntityMapper r5 = r0.f5194a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            com.adif.elcanomovil.uiSelectStation.mappers.StationViewEntityMapper r6 = com.adif.elcanomovil.uiSelectStation.mappers.StationViewEntityMapper.INSTANCE
            com.adif.elcanomovil.domain.usecases.stations.GetHomeStationUseCase r5 = r5.getHomeStationUseCase
            r0.f5194a = r6
            r0.f5197d = r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel.fetchUserHomeStation(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchUserWorkStation(kotlin.coroutines.Continuation<? super com.adif.elcanomovil.commonViews.data.StationViewEntity> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.adif.elcanomovil.uiSelectStation.main.i
            if (r0 == 0) goto L13
            r0 = r6
            com.adif.elcanomovil.uiSelectStation.main.i r0 = (com.adif.elcanomovil.uiSelectStation.main.i) r0
            int r1 = r0.f5201d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5201d = r1
            goto L18
        L13:
            com.adif.elcanomovil.uiSelectStation.main.i r0 = new com.adif.elcanomovil.uiSelectStation.main.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f5199b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5201d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.adif.elcanomovil.uiSelectStation.mappers.StationViewEntityMapper r5 = r0.f5198a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            com.adif.elcanomovil.uiSelectStation.mappers.StationViewEntityMapper r6 = com.adif.elcanomovil.uiSelectStation.mappers.StationViewEntityMapper.INSTANCE
            com.adif.elcanomovil.domain.usecases.stations.GetWorkStationUseCase r5 = r5.getWorkStationUseCase
            r0.f5198a = r6
            r0.f5201d = r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel.fetchUserWorkStation(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean isValidSearchText(List<String> keywords) {
        if (keywords.isEmpty()) {
            return false;
        }
        List<String> list = keywords;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).length() >= 3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
    
        if (r10 == r1) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadUserStations(com.adif.elcanomovil.commonNavGraph.arguments.NavArguments.StationSelectionType r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.adif.elcanomovil.uiSelectStation.main.j
            if (r0 == 0) goto L13
            r0 = r10
            com.adif.elcanomovil.uiSelectStation.main.j r0 = (com.adif.elcanomovil.uiSelectStation.main.j) r0
            int r1 = r0.f5206e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5206e = r1
            goto L18
        L13:
            com.adif.elcanomovil.uiSelectStation.main.j r0 = new com.adif.elcanomovil.uiSelectStation.main.j
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f5204c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5206e
            r3 = 4
            r4 = 3
            r5 = 0
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L53
            if (r2 == r7) goto L4d
            if (r2 == r6) goto L45
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel r8 = r0.f5202a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L82
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel r8 = r0.f5203b
            com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel r9 = r0.f5202a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L70
        L45:
            com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel r8 = r0.f5203b
            com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel r9 = r0.f5202a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L95
        L4d:
            com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel r8 = r0.f5202a
            kotlin.ResultKt.throwOnFailure(r10)
            goto La9
        L53:
            kotlin.ResultKt.throwOnFailure(r10)
            int[] r10 = com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel.WhenMappings.$EnumSwitchMapping$0
            int r9 = r9.ordinal()
            r9 = r10[r9]
            if (r9 == r7) goto L9c
            if (r9 == r6) goto L87
            r0.f5202a = r8
            r0.f5203b = r8
            r0.f5206e = r4
            java.lang.Object r10 = r8.fetchUserHomeStation(r0)
            if (r10 != r1) goto L6f
            goto La8
        L6f:
            r9 = r8
        L70:
            com.adif.elcanomovil.commonViews.data.StationViewEntity r10 = (com.adif.elcanomovil.commonViews.data.StationViewEntity) r10
            r8.homeStation = r10
            r0.f5202a = r9
            r0.f5203b = r5
            r0.f5206e = r3
            java.lang.Object r10 = r9.fetchUserWorkStation(r0)
            if (r10 != r1) goto L81
            goto La8
        L81:
            r8 = r9
        L82:
            com.adif.elcanomovil.commonViews.data.StationViewEntity r10 = (com.adif.elcanomovil.commonViews.data.StationViewEntity) r10
            r8.workStation = r10
            goto Lad
        L87:
            r0.f5202a = r8
            r0.f5203b = r8
            r0.f5206e = r6
            java.lang.Object r10 = r8.fetchUserHomeStation(r0)
            if (r10 != r1) goto L94
            goto La8
        L94:
            r9 = r8
        L95:
            com.adif.elcanomovil.commonViews.data.StationViewEntity r10 = (com.adif.elcanomovil.commonViews.data.StationViewEntity) r10
            r8.homeStation = r10
            r9.workStation = r5
            goto Lad
        L9c:
            r8.homeStation = r5
            r0.f5202a = r8
            r0.f5206e = r7
            java.lang.Object r10 = r8.fetchUserWorkStation(r0)
            if (r10 != r1) goto La9
        La8:
            return r1
        La9:
            com.adif.elcanomovil.commonViews.data.StationViewEntity r10 = (com.adif.elcanomovil.commonViews.data.StationViewEntity) r10
            r8.workStation = r10
        Lad:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiSelectStation.main.SelectStationViewModel.loadUserStations(com.adif.elcanomovil.commonNavGraph.arguments.NavArguments$StationSelectionType, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void observeClosestStation() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new k(this, null), 3, null);
    }

    public final void observeRecentSearches() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new l(this, null), 3, null);
    }

    public final void showUpdateMainSearch() {
        MutableStateFlow<SelectStationViewState> mutableStateFlow = this._viewState;
        List<Station> list = this.userLastSearches;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        mutableStateFlow.tryEmit(new SelectStationViewState.MainSearch(list, this.homeStation, this.workStation, StationOptionViewEntityMapper.INSTANCE.map(this.userNearStation, StationViewEntity.Type.NEAR, this.stringProvider)));
    }

    public final StateFlow<SelectStationViewState> getViewState() {
        return this.viewState;
    }

    public final void handleSearchTextChange(String r4) {
        List split$default;
        int collectionSizeOrDefault;
        CharSequence trim;
        Intrinsics.checkNotNullParameter(r4, "query");
        split$default = StringsKt__StringsKt.split$default(r4, new String[]{" "}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            trim = StringsKt__StringsKt.trim((CharSequence) ((String) it.next()));
            arrayList2.add(REGEX_UNACCENTKt.unaccent(trim.toString()));
        }
        if (isValidSearchText(arrayList2)) {
            fetchStationsBy(arrayList2);
        } else {
            showUpdateMainSearch();
        }
    }

    public final void onViewsLoaded(NavArguments.StationSelectionType stationType) {
        Intrinsics.checkNotNullParameter(stationType, "stationType");
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new m(this, stationType, null), 3, null);
    }

    public final void saveStation(String station) {
        if (station != null) {
            BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new n(station, this, null), 3, null);
        }
    }
}
