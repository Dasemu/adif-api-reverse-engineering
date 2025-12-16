package com.adif.elcanomovil.uiStations.main;

import C.w;
import androidx.lifecycle.Q;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.domain.entities.station.Location;
import com.adif.elcanomovil.domain.entities.station.RequestedStationInfo;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.entities.utils.Status;
import com.adif.elcanomovil.domain.usecases.stations.GetCurrentOneStationUseCase;
import com.adif.elcanomovil.main.BottomNavFragmentDirections;
import com.adif.elcanomovil.uiStations.entities.Services;
import com.adif.elcanomovil.uiStations.main.CommercialTabViewDataWrapper;
import com.adif.elcanomovil.uiStations.mappers.RequestedStationInfoMapper;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/adif/elcanomovil/uiStations/main/StationsPageCommercialViewModel;", "Landroidx/lifecycle/w0;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetCurrentOneStationUseCase;", "getCurrentOneStationUseCase", "<init>", "(Lcom/adif/elcanomovil/domain/usecases/stations/GetCurrentOneStationUseCase;)V", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "Lcom/adif/elcanomovil/domain/entities/station/RequestedStationInfo;", "requestedStationInfo", "", "mapToViewData", "(Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;)V", "Lcom/adif/elcanomovil/uiStations/entities/Services;", "service", "onCommercialTapped", "(Lcom/adif/elcanomovil/uiStations/entities/Services;)V", "Lcom/adif/elcanomovil/domain/usecases/stations/GetCurrentOneStationUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/adif/elcanomovil/uiStations/main/CommercialTabViewDataWrapper;", "_viewData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/lifecycle/Q;", "viewData", "Landroidx/lifecycle/Q;", "getViewData", "()Landroidx/lifecycle/Q;", "Lb1/f;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "navigationFlow", "Lb1/f;", "Lb1/a;", "navigation", "Lb1/a;", "getNavigation", "()Lb1/a;", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStationsPageCommercialViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StationsPageCommercialViewModel.kt\ncom/adif/elcanomovil/uiStations/main/StationsPageCommercialViewModel\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n37#2,2:87\n37#2,2:89\n1#3:91\n*S KotlinDebug\n*F\n+ 1 StationsPageCommercialViewModel.kt\ncom/adif/elcanomovil/uiStations/main/StationsPageCommercialViewModel\n*L\n67#1:87,2\n69#1:89,2\n*E\n"})
/* loaded from: classes2.dex */
public final class StationsPageCommercialViewModel extends w0 {
    private final MutableStateFlow<CommercialTabViewDataWrapper> _viewData;
    private final GetCurrentOneStationUseCase getCurrentOneStationUseCase;
    private final InterfaceC0266a navigation;
    private final b1.f navigationFlow;
    private final Q viewData;

    @Inject
    public StationsPageCommercialViewModel(GetCurrentOneStationUseCase getCurrentOneStationUseCase) {
        Intrinsics.checkNotNullParameter(getCurrentOneStationUseCase, "getCurrentOneStationUseCase");
        this.getCurrentOneStationUseCase = getCurrentOneStationUseCase;
        MutableStateFlow<CommercialTabViewDataWrapper> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._viewData = MutableStateFlow;
        this.viewData = q0.a(MutableStateFlow, null, 3);
        b1.f fVar = new b1.f();
        this.navigationFlow = fVar;
        this.navigation = fVar;
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new g(this, null), 3, null);
    }

    public static final /* synthetic */ void access$mapToViewData(StationsPageCommercialViewModel stationsPageCommercialViewModel, AsyncResult asyncResult) {
        stationsPageCommercialViewModel.mapToViewData(asyncResult);
    }

    public final void mapToViewData(AsyncResult<RequestedStationInfo> requestedStationInfo) {
        if ((requestedStationInfo != null ? requestedStationInfo.getStatus() : null) == Status.ERROR) {
            this._viewData.setValue(CommercialTabViewDataWrapper.Error.INSTANCE);
            return;
        }
        if ((requestedStationInfo != null ? requestedStationInfo.getStatus() : null) == Status.LOADING) {
            this._viewData.setValue(CommercialTabViewDataWrapper.Loading.INSTANCE);
        } else {
            this._viewData.setValue(new CommercialTabViewDataWrapper.Data(RequestedStationInfoMapper.INSTANCE.mapToCommercialTabViewData(requestedStationInfo != null ? requestedStationInfo.getData() : null)));
        }
    }

    public final InterfaceC0266a getNavigation() {
        return this.navigation;
    }

    public final Q getViewData() {
        return this.viewData;
    }

    public final void onCommercialTapped(Services service) {
        String str;
        Intrinsics.checkNotNullParameter(service, "service");
        b1.f fVar = this.navigationFlow;
        BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
        String logo = service.getLogo();
        String name = service.getName();
        String phone = service.getPhone();
        String description = service.getDescription();
        boolean accessible = service.getAccessible();
        List<String> paymentWay = service.getPaymentWay();
        String[] strArr = paymentWay != null ? (String[]) paymentWay.toArray(new String[0]) : null;
        String offerDescription = service.getOfferDescription();
        List<String> correspondences = service.getCorrespondences();
        String[] strArr2 = correspondences != null ? (String[]) correspondences.toArray(new String[0]) : null;
        String web = service.getWeb();
        Location location = service.getLocation();
        if (location != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = w.s(new Object[]{location.getLatitude(), location.getLongitude()}, 2, "%s,%s", "format(...)");
        } else {
            str = null;
        }
        fVar.b(new Navigation.RootDirection(companion.toStationsAlertDialog(logo, name, phone, description, accessible, strArr, offerDescription, strArr2, web, str, service.getAccessibleLabel(), service.getOpeningHours(), service.getAndroidLink()), null, 2, null));
    }
}
