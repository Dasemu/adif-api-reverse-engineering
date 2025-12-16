package com.adif.elcanomovil.uiDepartures.main;

import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.arguments.BottomNavInitialTab;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.StationServiceType;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationToUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDepartureTypeTrainIsCercaniasUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDeparturesArrivalsStationToUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.SetLastDeparturesArrivalsStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.domain.usecases.tabs.TabDataHolder;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

@HiltViewModel
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010\u001dJ\u0015\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b$\u0010#J\u0015\u0010%\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b%\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020-008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000203008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000205008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000205008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00102R\u001d\u00109\u001a\b\u0012\u0004\u0012\u000205088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u000205088\u0006¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u000203088\u0006¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010<R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020-088\u0006¢\u0006\f\n\u0004\bA\u0010:\u001a\u0004\bB\u0010<¨\u0006C"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/DeparturesViewModel;", "Landroidx/lifecycle/w0;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "getStationByIdUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDeparturesArrivalsStationUseCase;", "getLastDeparturesArrivalsStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDeparturesArrivalsStationToUseCase;", "getLastDeparturesArrivalsStationToUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDeparturesArrivalsStationUseCase;", "setLastDeparturesArrivalsStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDeparturesArrivalsStationToUseCase;", "setLastDeparturesArrivalsStationToUseCase", "Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDepartureTypeTrainIsCercaniasUseCase;", "setLastDepartureTypeTrainIsCercaniasUseCase", "Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder;", "tabDataHolder", "<init>", "(Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDeparturesArrivalsStationUseCase;Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDeparturesArrivalsStationToUseCase;Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDeparturesArrivalsStationUseCase;Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDeparturesArrivalsStationToUseCase;Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDepartureTypeTrainIsCercaniasUseCase;Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder;)V", "", "", "readStations", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stationCode", "Lcom/adif/elcanomovil/domain/entities/StationServiceType;", "page", "", "navigateToStations", "(Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/StationServiceType;)V", "handleOnCreate", "()V", "onStationCommercialPressed", "onStationInfoPressed", "", "position", "handleStationSelectedForCommercial", "(I)V", "handleStationSelectedForServices", "handleTabSelected", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDeparturesArrivalsStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetLastDeparturesArrivalsStationToUseCase;", "Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDeparturesArrivalsStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDeparturesArrivalsStationToUseCase;", "Lcom/adif/elcanomovil/domain/usecases/circulation/SetLastDepartureTypeTrainIsCercaniasUseCase;", "Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder;", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "currentTab", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "Lb1/f;", "selectedTabFlow", "Lb1/f;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "navigationFlow", "", "_showMuteSubscriptionSnackbar", "_showNoStationsSnackbar", "Lb1/a;", "showMuteSubscriptionSnackbar", "Lb1/a;", "getShowMuteSubscriptionSnackbar", "()Lb1/a;", "showNoStationsSnackbar", "getShowNoStationsSnackbar", "navigation", "getNavigation", "selectedTab", "getSelectedTab", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeparturesViewModel extends w0 {
    private final b1.f _showMuteSubscriptionSnackbar;
    private final b1.f _showNoStationsSnackbar;
    private CirculationType currentTab;
    private final GetLastDeparturesArrivalsStationToUseCase getLastDeparturesArrivalsStationToUseCase;
    private final GetLastDeparturesArrivalsStationUseCase getLastDeparturesArrivalsStationUseCase;
    private final GetStationByIdUseCase getStationByIdUseCase;
    private final InterfaceC0266a navigation;
    private final b1.f navigationFlow;
    private final InterfaceC0266a selectedTab;
    private final b1.f selectedTabFlow;
    private final SetLastDepartureTypeTrainIsCercaniasUseCase setLastDepartureTypeTrainIsCercaniasUseCase;
    private final SetLastDeparturesArrivalsStationToUseCase setLastDeparturesArrivalsStationToUseCase;
    private final SetLastDeparturesArrivalsStationUseCase setLastDeparturesArrivalsStationUseCase;
    private final InterfaceC0266a showMuteSubscriptionSnackbar;
    private final InterfaceC0266a showNoStationsSnackbar;
    private final TabDataHolder tabDataHolder;

    @Inject
    public DeparturesViewModel(GetStationByIdUseCase getStationByIdUseCase, GetLastDeparturesArrivalsStationUseCase getLastDeparturesArrivalsStationUseCase, GetLastDeparturesArrivalsStationToUseCase getLastDeparturesArrivalsStationToUseCase, SetLastDeparturesArrivalsStationUseCase setLastDeparturesArrivalsStationUseCase, SetLastDeparturesArrivalsStationToUseCase setLastDeparturesArrivalsStationToUseCase, SetLastDepartureTypeTrainIsCercaniasUseCase setLastDepartureTypeTrainIsCercaniasUseCase, TabDataHolder tabDataHolder) {
        Intrinsics.checkNotNullParameter(getStationByIdUseCase, "getStationByIdUseCase");
        Intrinsics.checkNotNullParameter(getLastDeparturesArrivalsStationUseCase, "getLastDeparturesArrivalsStationUseCase");
        Intrinsics.checkNotNullParameter(getLastDeparturesArrivalsStationToUseCase, "getLastDeparturesArrivalsStationToUseCase");
        Intrinsics.checkNotNullParameter(setLastDeparturesArrivalsStationUseCase, "setLastDeparturesArrivalsStationUseCase");
        Intrinsics.checkNotNullParameter(setLastDeparturesArrivalsStationToUseCase, "setLastDeparturesArrivalsStationToUseCase");
        Intrinsics.checkNotNullParameter(setLastDepartureTypeTrainIsCercaniasUseCase, "setLastDepartureTypeTrainIsCercaniasUseCase");
        Intrinsics.checkNotNullParameter(tabDataHolder, "tabDataHolder");
        this.getStationByIdUseCase = getStationByIdUseCase;
        this.getLastDeparturesArrivalsStationUseCase = getLastDeparturesArrivalsStationUseCase;
        this.getLastDeparturesArrivalsStationToUseCase = getLastDeparturesArrivalsStationToUseCase;
        this.setLastDeparturesArrivalsStationUseCase = setLastDeparturesArrivalsStationUseCase;
        this.setLastDeparturesArrivalsStationToUseCase = setLastDeparturesArrivalsStationToUseCase;
        this.setLastDepartureTypeTrainIsCercaniasUseCase = setLastDepartureTypeTrainIsCercaniasUseCase;
        this.tabDataHolder = tabDataHolder;
        this.currentTab = CirculationType.DEPARTURE;
        b1.f fVar = new b1.f();
        this.selectedTabFlow = fVar;
        b1.f fVar2 = new b1.f();
        this.navigationFlow = fVar2;
        b1.f fVar3 = new b1.f();
        this._showMuteSubscriptionSnackbar = fVar3;
        b1.f fVar4 = new b1.f();
        this._showNoStationsSnackbar = fVar4;
        this.showMuteSubscriptionSnackbar = fVar3;
        this.showNoStationsSnackbar = fVar4;
        this.navigation = fVar2;
        this.selectedTab = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToStations(String stationCode, StationServiceType page) {
        if (stationCode == null) {
            return;
        }
        this.tabDataHolder.push(new TabDataHolder.TabData.Stations(stationCode, page));
        this.navigationFlow.b(new Navigation.TabDirection(new BottomNavInitialTab.Station(null, 1, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readStations(kotlin.coroutines.Continuation<? super java.lang.String[]> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.adif.elcanomovil.uiDepartures.main.j
            if (r0 == 0) goto L13
            r0 = r10
            com.adif.elcanomovil.uiDepartures.main.j r0 = (com.adif.elcanomovil.uiDepartures.main.j) r0
            int r1 = r0.f4958g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4958g = r1
            goto L18
        L13:
            com.adif.elcanomovil.uiDepartures.main.j r0 = new com.adif.elcanomovil.uiDepartures.main.j
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f4956e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f4958g
            r3 = 2
            r4 = 1
            java.lang.String r5 = ""
            if (r2 == 0) goto L50
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            int r4 = r0.f4955d
            java.lang.String[] r9 = r0.f4953b
            java.lang.Object r0 = r0.f4952a
            java.lang.String[] r0 = (java.lang.String[]) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto La2
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            int r9 = r0.f4955d
            java.lang.String[] r2 = r0.f4954c
            java.lang.String[] r6 = r0.f4953b
            java.lang.Object r7 = r0.f4952a
            com.adif.elcanomovil.uiDepartures.main.DeparturesViewModel r7 = (com.adif.elcanomovil.uiDepartures.main.DeparturesViewModel) r7
            kotlin.ResultKt.throwOnFailure(r10)
            r8 = r6
            r6 = r2
            r2 = r8
            goto L76
        L50:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.String[] r2 = new java.lang.String[r3]
            com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase r10 = r9.getStationByIdUseCase
            com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationUseCase r6 = r9.getLastDeparturesArrivalsStationUseCase
            java.lang.String r6 = r6.invoke()
            if (r6 != 0) goto L60
            r6 = r5
        L60:
            r0.f4952a = r9
            r0.f4953b = r2
            r0.f4954c = r2
            r7 = 0
            r0.f4955d = r7
            r0.f4958g = r4
            java.lang.Object r10 = r10.invoke(r6, r0)
            if (r10 != r1) goto L72
            goto L9f
        L72:
            r6 = r7
            r7 = r9
            r9 = r6
            r6 = r2
        L76:
            com.adif.elcanomovil.domain.entities.station.Station r10 = (com.adif.elcanomovil.domain.entities.station.Station) r10
            if (r10 == 0) goto L80
            java.lang.String r10 = r10.getLongName()
            if (r10 != 0) goto L81
        L80:
            r10 = r5
        L81:
            r6[r9] = r10
            com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase r9 = r7.getStationByIdUseCase
            com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationToUseCase r10 = r7.getLastDeparturesArrivalsStationToUseCase
            java.lang.String r10 = r10.invoke()
            if (r10 != 0) goto L8e
            r10 = r5
        L8e:
            r0.f4952a = r2
            r0.f4953b = r2
            r6 = 0
            r0.f4954c = r6
            r0.f4955d = r4
            r0.f4958g = r3
            java.lang.Object r10 = r9.invoke(r10, r0)
            if (r10 != r1) goto La0
        L9f:
            return r1
        La0:
            r9 = r2
            r0 = r9
        La2:
            com.adif.elcanomovil.domain.entities.station.Station r10 = (com.adif.elcanomovil.domain.entities.station.Station) r10
            if (r10 == 0) goto Lae
            java.lang.String r10 = r10.getLongName()
            if (r10 != 0) goto Lad
            goto Lae
        Lad:
            r5 = r10
        Lae:
            r9[r4] = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiDepartures.main.DeparturesViewModel.readStations(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final InterfaceC0266a getNavigation() {
        return this.navigation;
    }

    public final InterfaceC0266a getSelectedTab() {
        return this.selectedTab;
    }

    public final InterfaceC0266a getShowMuteSubscriptionSnackbar() {
        return this.showMuteSubscriptionSnackbar;
    }

    public final InterfaceC0266a getShowNoStationsSnackbar() {
        return this.showNoStationsSnackbar;
    }

    public final void handleOnCreate() {
        TabDataHolder.TabData popIfAvailable = this.tabDataHolder.popIfAvailable();
        TabDataHolder.TabData.Departures departures = popIfAvailable instanceof TabDataHolder.TabData.Departures ? (TabDataHolder.TabData.Departures) popIfAvailable : null;
        if (departures == null) {
            return;
        }
        this.selectedTabFlow.b(departures.getCirculationType());
        this.currentTab = departures.getCirculationType();
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new e(this, departures, null), 3, null);
    }

    public final void handleStationSelectedForCommercial(int position) {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new f(position, this, null), 3, null);
    }

    public final void handleStationSelectedForServices(int position) {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new g(position, this, null), 3, null);
    }

    public final void handleTabSelected(int position) {
        CirculationType fromInt = CirculationType.INSTANCE.fromInt(position);
        if (fromInt == null) {
            fromInt = CirculationType.DEPARTURE;
        }
        this.currentTab = fromInt;
    }

    public final void onStationCommercialPressed() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new h(this, null), 3, null);
    }

    public final void onStationInfoPressed() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new i(this, null), 3, null);
    }
}
