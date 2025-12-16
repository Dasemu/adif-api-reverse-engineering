package com.adif.elcanomovil.uiStations.main;

import androidx.lifecycle.Q;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.domain.entities.station.Location;
import com.adif.elcanomovil.domain.entities.station.RequestedStationInfo;
import com.adif.elcanomovil.domain.entities.station.StationInfo;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.entities.utils.Status;
import com.adif.elcanomovil.domain.usecases.favorites.GetStationIsFavoriteUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.RemoveFavoriteStationUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.SaveFavoriteStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetCurrentOneStationUseCase;
import com.adif.elcanomovil.main.BottomNavFragmentDirections;
import com.adif.elcanomovil.uiStations.entities.ServicesTabViewData;
import com.adif.elcanomovil.uiStations.main.OneStationViewData;
import com.adif.elcanomovil.uiStations.mappers.RequestedStationInfoMapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010#\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010 R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020)0,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001f\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00104R\u001f\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:058\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b<\u00109¨\u0006="}, d2 = {"Lcom/adif/elcanomovil/uiStations/main/StationsPageServicesViewModel;", "Landroidx/lifecycle/w0;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetCurrentOneStationUseCase;", "getCurrentOneStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/SaveFavoriteStationUseCase;", "saveFavoriteStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/GetStationIsFavoriteUseCase;", "getStationIsFavoriteUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/RemoveFavoriteStationUseCase;", "removeFavoriteStationUseCase", "<init>", "(Lcom/adif/elcanomovil/domain/usecases/stations/GetCurrentOneStationUseCase;Lcom/adif/elcanomovil/domain/usecases/favorites/SaveFavoriteStationUseCase;Lcom/adif/elcanomovil/domain/usecases/favorites/GetStationIsFavoriteUseCase;Lcom/adif/elcanomovil/domain/usecases/favorites/RemoveFavoriteStationUseCase;)V", "Lcom/adif/elcanomovil/domain/entities/station/Location;", FirebaseAnalytics.Param.LOCATION, "", "setStationLatLng", "(Lcom/adif/elcanomovil/domain/entities/station/Location;)V", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "Lcom/adif/elcanomovil/domain/entities/station/RequestedStationInfo;", "requestedStationInfo", "mapToViewData", "(Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;)V", "refreshIsFavourite", "()V", "handleFavouriteTapped", "handleAvisaButtonTapped", "Lcom/adif/elcanomovil/domain/usecases/stations/GetCurrentOneStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/favorites/SaveFavoriteStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/favorites/GetStationIsFavoriteUseCase;", "Lcom/adif/elcanomovil/domain/usecases/favorites/RemoveFavoriteStationUseCase;", "", "currentStationCode", "Ljava/lang/String;", "Lcom/google/android/gms/maps/model/LatLng;", "<set-?>", "stationLatLng", "Lcom/google/android/gms/maps/model/LatLng;", "getStationLatLng", "()Lcom/google/android/gms/maps/model/LatLng;", "currentStationName", "Lb1/f;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "navigationFlow", "Lb1/f;", "Lb1/a;", "navigation", "Lb1/a;", "getNavigation", "()Lb1/a;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/adif/elcanomovil/uiStations/main/OneStationViewData;", "_viewData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/lifecycle/Q;", "viewData", "Landroidx/lifecycle/Q;", "getViewData", "()Landroidx/lifecycle/Q;", "", "_isFavourite", "isFavourite", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StationsPageServicesViewModel extends w0 {
    private final MutableStateFlow<Boolean> _isFavourite;
    private final MutableStateFlow<OneStationViewData> _viewData;
    private String currentStationCode;
    private String currentStationName;
    private final GetCurrentOneStationUseCase getCurrentOneStationUseCase;
    private final GetStationIsFavoriteUseCase getStationIsFavoriteUseCase;
    private final Q isFavourite;
    private final InterfaceC0266a navigation;
    private final b1.f navigationFlow;
    private final RemoveFavoriteStationUseCase removeFavoriteStationUseCase;
    private final SaveFavoriteStationUseCase saveFavoriteStationUseCase;
    private LatLng stationLatLng;
    private final Q viewData;

    @Inject
    public StationsPageServicesViewModel(GetCurrentOneStationUseCase getCurrentOneStationUseCase, SaveFavoriteStationUseCase saveFavoriteStationUseCase, GetStationIsFavoriteUseCase getStationIsFavoriteUseCase, RemoveFavoriteStationUseCase removeFavoriteStationUseCase) {
        Intrinsics.checkNotNullParameter(getCurrentOneStationUseCase, "getCurrentOneStationUseCase");
        Intrinsics.checkNotNullParameter(saveFavoriteStationUseCase, "saveFavoriteStationUseCase");
        Intrinsics.checkNotNullParameter(getStationIsFavoriteUseCase, "getStationIsFavoriteUseCase");
        Intrinsics.checkNotNullParameter(removeFavoriteStationUseCase, "removeFavoriteStationUseCase");
        this.getCurrentOneStationUseCase = getCurrentOneStationUseCase;
        this.saveFavoriteStationUseCase = saveFavoriteStationUseCase;
        this.getStationIsFavoriteUseCase = getStationIsFavoriteUseCase;
        this.removeFavoriteStationUseCase = removeFavoriteStationUseCase;
        this.currentStationName = "";
        b1.f fVar = new b1.f();
        this.navigationFlow = fVar;
        this.navigation = fVar;
        MutableStateFlow<OneStationViewData> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._viewData = MutableStateFlow;
        this.viewData = q0.a(MutableStateFlow, null, 3);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._isFavourite = MutableStateFlow2;
        this.isFavourite = q0.a(MutableStateFlow2, null, 3);
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new l(this, null), 3, null);
    }

    public static final /* synthetic */ void access$mapToViewData(StationsPageServicesViewModel stationsPageServicesViewModel, AsyncResult asyncResult) {
        stationsPageServicesViewModel.mapToViewData(asyncResult);
    }

    public final void mapToViewData(AsyncResult<RequestedStationInfo> requestedStationInfo) {
        String str;
        RequestedStationInfo data;
        StationInfo stationInfo;
        RequestedStationInfo data2;
        StationInfo stationInfo2;
        RequestedStationInfo data3;
        Location location = null;
        if ((requestedStationInfo != null ? requestedStationInfo.getStatus() : null) == Status.ERROR) {
            this._viewData.setValue(OneStationViewData.Error.INSTANCE);
            return;
        }
        if ((requestedStationInfo != null ? requestedStationInfo.getStatus() : null) == Status.LOADING) {
            this._viewData.setValue(OneStationViewData.Loading.INSTANCE);
            return;
        }
        ServicesTabViewData mapToServicesTabViewData = RequestedStationInfoMapper.INSTANCE.mapToServicesTabViewData(requestedStationInfo != null ? requestedStationInfo.getData() : null);
        this.currentStationCode = (requestedStationInfo == null || (data3 = requestedStationInfo.getData()) == null) ? null : data3.getStationCode();
        if (requestedStationInfo == null || (data2 = requestedStationInfo.getData()) == null || (stationInfo2 = data2.getStationInfo()) == null || (str = stationInfo2.getShortName()) == null) {
            str = "";
        }
        this.currentStationName = str;
        if (requestedStationInfo != null && (data = requestedStationInfo.getData()) != null && (stationInfo = data.getStationInfo()) != null) {
            location = stationInfo.getLocation();
        }
        setStationLatLng(location);
        refreshIsFavourite();
        this._viewData.setValue(new OneStationViewData.Data(mapToServicesTabViewData));
    }

    public final void refreshIsFavourite() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new n(this, null), 3, null);
    }

    private final void setStationLatLng(Location r5) {
        Double latitude;
        if (r5 == null || (latitude = r5.getLatitude()) == null) {
            return;
        }
        double doubleValue = latitude.doubleValue();
        Double longitude = r5.getLongitude();
        if (longitude != null) {
            this.stationLatLng = new LatLng(doubleValue, longitude.doubleValue());
        }
    }

    public final InterfaceC0266a getNavigation() {
        return this.navigation;
    }

    public final LatLng getStationLatLng() {
        return this.stationLatLng;
    }

    public final Q getViewData() {
        return this.viewData;
    }

    public final void handleAvisaButtonTapped() {
        this.navigationFlow.b(new Navigation.RootDirection(BottomNavFragmentDirections.INSTANCE.toNewIssueFragment(), null, 2, null));
    }

    public final void handleFavouriteTapped() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new m(this, null), 3, null);
    }

    /* renamed from: isFavourite, reason: from getter */
    public final Q getIsFavourite() {
        return this.isFavourite;
    }
}
