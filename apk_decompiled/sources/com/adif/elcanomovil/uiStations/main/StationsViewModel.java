package com.adif.elcanomovil.uiStations.main;

import androidx.lifecycle.Q;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.domain.entities.StationServiceType;
import com.adif.elcanomovil.domain.usecases.stations.GetLastVisitedStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetOneStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.domain.usecases.stations.SetLastVisitedStationUseCase;
import com.adif.elcanomovil.domain.usecases.tabs.TabDataHolder;
import com.adif.elcanomovil.main.BottomNavFragmentDirections;
import com.adif.elcanomovil.uiStations.entities.StationHeaderData;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020 0+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020$008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020'008\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104¨\u00067"}, d2 = {"Lcom/adif/elcanomovil/uiStations/main/StationsViewModel;", "Landroidx/lifecycle/w0;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetOneStationUseCase;", "getOneStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "getStationByIdUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetLastVisitedStationUseCase;", "getLastVisitedStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/SetLastVisitedStationUseCase;", "setLastVisitedStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder;", "tabDataHolder", "<init>", "(Lcom/adif/elcanomovil/domain/usecases/stations/GetOneStationUseCase;Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;Lcom/adif/elcanomovil/domain/usecases/stations/GetLastVisitedStationUseCase;Lcom/adif/elcanomovil/domain/usecases/stations/SetLastVisitedStationUseCase;Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder;)V", "", "handleOnCreate", "()V", "handleSearchStationTap", "", "stationCode", "handleSelectedStation", "(Ljava/lang/String;)V", "", "position", "handleTabSelected", "(I)V", "Lcom/adif/elcanomovil/domain/usecases/stations/GetOneStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetLastVisitedStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/stations/SetLastVisitedStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/adif/elcanomovil/uiStations/entities/StationHeaderData;", "viewDataFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lb1/f;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "navigationFlow", "Lb1/f;", "Lcom/adif/elcanomovil/domain/entities/StationServiceType;", "selectedTabFlow", "currentTab", "Lcom/adif/elcanomovil/domain/entities/StationServiceType;", "Landroidx/lifecycle/Q;", "viewData", "Landroidx/lifecycle/Q;", "getViewData", "()Landroidx/lifecycle/Q;", "Lb1/a;", "navigation", "Lb1/a;", "getNavigation", "()Lb1/a;", "selectedTab", "getSelectedTab", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StationsViewModel extends w0 {
    private StationServiceType currentTab;
    private final GetLastVisitedStationUseCase getLastVisitedStationUseCase;
    private final GetOneStationUseCase getOneStationUseCase;
    private final GetStationByIdUseCase getStationByIdUseCase;
    private final InterfaceC0266a navigation;
    private final b1.f navigationFlow;
    private final InterfaceC0266a selectedTab;
    private final b1.f selectedTabFlow;
    private final SetLastVisitedStationUseCase setLastVisitedStationUseCase;
    private final TabDataHolder tabDataHolder;
    private final Q viewData;
    private final MutableStateFlow<StationHeaderData> viewDataFlow;

    @Inject
    public StationsViewModel(GetOneStationUseCase getOneStationUseCase, GetStationByIdUseCase getStationByIdUseCase, GetLastVisitedStationUseCase getLastVisitedStationUseCase, SetLastVisitedStationUseCase setLastVisitedStationUseCase, TabDataHolder tabDataHolder) {
        Intrinsics.checkNotNullParameter(getOneStationUseCase, "getOneStationUseCase");
        Intrinsics.checkNotNullParameter(getStationByIdUseCase, "getStationByIdUseCase");
        Intrinsics.checkNotNullParameter(getLastVisitedStationUseCase, "getLastVisitedStationUseCase");
        Intrinsics.checkNotNullParameter(setLastVisitedStationUseCase, "setLastVisitedStationUseCase");
        Intrinsics.checkNotNullParameter(tabDataHolder, "tabDataHolder");
        this.getOneStationUseCase = getOneStationUseCase;
        this.getStationByIdUseCase = getStationByIdUseCase;
        this.getLastVisitedStationUseCase = getLastVisitedStationUseCase;
        this.setLastVisitedStationUseCase = setLastVisitedStationUseCase;
        this.tabDataHolder = tabDataHolder;
        MutableStateFlow<StationHeaderData> MutableStateFlow = StateFlowKt.MutableStateFlow(new StationHeaderData(null, null, null, 7, null));
        this.viewDataFlow = MutableStateFlow;
        b1.f fVar = new b1.f();
        this.navigationFlow = fVar;
        b1.f fVar2 = new b1.f();
        this.selectedTabFlow = fVar2;
        this.currentTab = StationServiceType.SERVICES;
        this.viewData = q0.a(MutableStateFlow, q0.j(this).f7787a, 2);
        this.navigation = fVar;
        this.selectedTab = fVar2;
    }

    public final InterfaceC0266a getNavigation() {
        return this.navigation;
    }

    public final InterfaceC0266a getSelectedTab() {
        return this.selectedTab;
    }

    public final Q getViewData() {
        return this.viewData;
    }

    public final void handleOnCreate() {
        TabDataHolder.TabData popIfAvailable = this.tabDataHolder.popIfAvailable();
        TabDataHolder.TabData.Stations stations = popIfAvailable instanceof TabDataHolder.TabData.Stations ? (TabDataHolder.TabData.Stations) popIfAvailable : null;
        if (stations == null) {
            BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new p(this, null), 3, null);
        } else {
            this.selectedTabFlow.b(stations.getType());
            handleSelectedStation(stations.getStation());
        }
    }

    public final void handleSearchStationTap() {
        this.navigationFlow.b(new Navigation.RootDirection(BottomNavFragmentDirections.INSTANCE.toSelectStationFragment("STATION"), null, 2, null));
    }

    public final void handleSelectedStation(String stationCode) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new q(this, stationCode, null), 3, null);
    }

    public final void handleTabSelected(int position) {
        StationServiceType fromInt = StationServiceType.INSTANCE.fromInt(position);
        if (fromInt == null) {
            fromInt = StationServiceType.SERVICES;
        }
        this.currentTab = fromInt;
    }
}
