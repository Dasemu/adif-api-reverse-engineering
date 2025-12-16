package com.adif.elcanomovil.uiHome;

import android.content.Context;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import c1.C0284d;
import com.adif.elcanomovil.commonNavGraph.arguments.BottomNavInitialTab;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.StationServiceType;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.domain.providers.LocationStatusProvider;
import com.adif.elcanomovil.domain.usecases.favorites.GetRelationStationsFavoritesUseCase;
import com.adif.elcanomovil.domain.usecases.favorites.GetTrainsFavoritesUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetClosestStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetHomeStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetWorkStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.SetHomeStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.SetWorkStationUseCase;
import com.adif.elcanomovil.domain.usecases.tabs.TabDataHolder;
import com.adif.elcanomovil.main.BottomNavFragmentDirections;
import com.adif.elcanomovil.uiHome.HomeFragmentBottomSheetViewState;
import com.adif.elcanomovil.uiHome.HomeFragmentViewAction;
import com.adif.elcanomovil.uiHome.data.UserFavoriteVO;
import com.adif.elcanomovil.uiHome.mappers.UserFavoriteVOMapper;
import dagger.hilt.android.lifecycle.HiltViewModel;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bk\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0002¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u001eH\u0002¢\u0006\u0004\b(\u0010&J\u000f\u0010)\u001a\u00020\u001eH\u0002¢\u0006\u0004\b)\u0010&J\u0017\u0010+\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001eH\u0002¢\u0006\u0004\b0\u0010&J\u0017\u00103\u001a\u00020\u001e2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001eH\u0002¢\u0006\u0004\b5\u0010&J\u000f\u00106\u001a\u00020\u001eH\u0002¢\u0006\u0004\b6\u0010&J\u000f\u00107\u001a\u00020\u001eH\u0002¢\u0006\u0004\b7\u0010&J\u000f\u00109\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u001e2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b;\u00104J\u000f\u0010<\u001a\u00020\u001eH\u0002¢\u0006\u0004\b<\u0010&J!\u0010A\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020=2\b\u0010@\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u001eH\u0002¢\u0006\u0004\bC\u0010&J\u000f\u0010D\u001a\u00020\u001eH\u0002¢\u0006\u0004\bD\u0010&J\u000f\u0010E\u001a\u00020\u001eH\u0002¢\u0006\u0004\bE\u0010&J\u000f\u0010F\u001a\u00020\u001eH\u0002¢\u0006\u0004\bF\u0010&J\u0019\u0010G\u001a\u00020\u001e2\b\u0010@\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0004\bG\u0010HJ\u0019\u0010I\u001a\u00020\u001e2\b\u0010@\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0004\bI\u0010HJ\u0017\u0010L\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u001a\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010N\u001a\u00020?H\u0082@¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u001eH\u0082@¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u001eH\u0082@¢\u0006\u0004\bT\u0010SJ\u0010\u0010U\u001a\u00020\u001eH\u0082@¢\u0006\u0004\bU\u0010SJ\u000f\u0010V\u001a\u00020\u001eH\u0002¢\u0006\u0004\bV\u0010&J\u000f\u0010W\u001a\u00020\u001eH\u0002¢\u0006\u0004\bW\u0010&J\u000f\u0010X\u001a\u00020\u001cH\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u001eH\u0002¢\u0006\u0004\bZ\u0010&J\u000f\u0010[\u001a\u00020\u001eH\u0002¢\u0006\u0004\b[\u0010&J\u000f\u0010\\\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\\\u0010YR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010]R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010^R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010_R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010`R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010cR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010dR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010eR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010fR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010gR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010hR\u001c\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010j0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001f\u0010n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010j0m8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020\u001e0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u001d\u0010v\u001a\b\u0012\u0004\u0012\u00020\u001e0u8\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020\u001c0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010tR\u001d\u0010{\u001a\b\u0012\u0004\u0012\u00020\u001c0u8\u0006¢\u0006\f\n\u0004\b{\u0010w\u001a\u0004\b|\u0010yR\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020O0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010tR\u001d\u0010~\u001a\b\u0012\u0004\u0012\u00020O0u8\u0006¢\u0006\f\n\u0004\b~\u0010w\u001a\u0004\b\u007f\u0010yR\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0081\u0001R\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0081\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0081\u0001R\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0081\u0001R\"\u0010\u0087\u0001\u001a\u000b\u0012\u0004\u0012\u00020J\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008a\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008a\u0001R\u001c\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008f\u0001¨\u0006\u0091\u0001"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeViewModel;", "Landroidx/lifecycle/w0;", "Landroid/content/Context;", "context", "Lcom/adif/elcanomovil/domain/usecases/stations/GetHomeStationUseCase;", "getHomeStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetWorkStationUseCase;", "getWorkStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetClosestStationUseCase;", "getClosestStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/SetHomeStationUseCase;", "setHomeStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/SetWorkStationUseCase;", "setWorkStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/GetRelationStationsFavoritesUseCase;", "getRelationFavoritesUseCase", "Lcom/adif/elcanomovil/domain/usecases/favorites/GetTrainsFavoritesUseCase;", "getTrainsFavoritesUseCase", "Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder;", "tabDataHolder", "Lc1/d;", "permissionHelper", "Lcom/adif/elcanomovil/uiHome/mappers/UserFavoriteVOMapper;", "userFavoriteVOMapper", "Lcom/adif/elcanomovil/domain/providers/LocationStatusProvider;", "locationStatusProvider", "<init>", "(Landroid/content/Context;Lcom/adif/elcanomovil/domain/usecases/stations/GetHomeStationUseCase;Lcom/adif/elcanomovil/domain/usecases/stations/GetWorkStationUseCase;Lcom/adif/elcanomovil/domain/usecases/stations/GetClosestStationUseCase;Lcom/adif/elcanomovil/domain/usecases/stations/SetHomeStationUseCase;Lcom/adif/elcanomovil/domain/usecases/stations/SetWorkStationUseCase;Lcom/adif/elcanomovil/domain/usecases/favorites/GetRelationStationsFavoritesUseCase;Lcom/adif/elcanomovil/domain/usecases/favorites/GetTrainsFavoritesUseCase;Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder;Lc1/d;Lcom/adif/elcanomovil/uiHome/mappers/UserFavoriteVOMapper;Lcom/adif/elcanomovil/domain/providers/LocationStatusProvider;)V", "", "shouldShowFavorites", "", "onViewCreated", "(Z)V", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction;", "action", "onAction", "(Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction;)V", "collectNearestStation", "()V", "collectLocationStatus", "openBottomSheet", "showFavorites", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$WorkStationSet;", "onWorkStationSet", "(Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$WorkStationSet;)V", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$HomeStationSet;", "onHomeStationSet", "(Lcom/adif/elcanomovil/uiHome/HomeFragmentViewAction$HomeStationSet;)V", "onLocationPermissionGranted", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "station", "onStationSelected", "(Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;)V", "onMapTapped", "updateViewState", "updateViewWithNearestStationBottomSheet", "Lcom/adif/elcanomovil/uiHome/LocationStatus;", "getLocationStatus", "()Lcom/adif/elcanomovil/uiHome/LocationStatus;", "updateViewWithSelectedStationBottomSheet", "updateViewStateHiddenBottomSheet", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;", "stationType", "", "stationId", "onStationDetailTapped", "(Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;Ljava/lang/String;)V", "onCommercialAreaTapped", "onStationInfoTapped", "onNextArrivalsTapped", "onNextDeparturesTapped", "onWorkStationTapped", "(Ljava/lang/String;)V", "onHomeStationDetailTapped", "Lcom/adif/elcanomovil/uiHome/data/UserFavoriteVO;", "favoriteVO", "onUserFavoritePressed", "(Lcom/adif/elcanomovil/uiHome/data/UserFavoriteVO;)V", "trainId", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "handleTrainTap", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchHomeStation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchWorkStation", "fetchFavorites", "navigateToSelectStationHome", "navigateToSelectStationWork", "isLocationPermissionGranted", "()Z", "askForLocationPermission", "notifyLocationAvailable", "isBottomSheetHidden", "Landroid/content/Context;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetHomeStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetWorkStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetClosestStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/stations/SetHomeStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/stations/SetWorkStationUseCase;", "Lcom/adif/elcanomovil/domain/usecases/favorites/GetRelationStationsFavoritesUseCase;", "Lcom/adif/elcanomovil/domain/usecases/favorites/GetTrainsFavoritesUseCase;", "Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder;", "Lc1/d;", "Lcom/adif/elcanomovil/uiHome/mappers/UserFavoriteVOMapper;", "Lcom/adif/elcanomovil/domain/providers/LocationStatusProvider;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewState;", "_viewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "viewState", "Lkotlinx/coroutines/flow/StateFlow;", "getViewState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/channels/Channel;", "_requestLocationPermission", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/Flow;", "requestLocationPermission", "Lkotlinx/coroutines/flow/Flow;", "getRequestLocationPermission", "()Lkotlinx/coroutines/flow/Flow;", "_locationAvailable", "locationAvailable", "getLocationAvailable", "_navigation", "navigation", "getNavigation", "homeStation", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "workStation", "nearestStation", "highlightedStation", "selectedStation", "", "userFavorites", "Ljava/util/List;", "locationAvailableNotified", "Z", "isFullyExpandedBottomSheet", "isLocationEnabled", "Lkotlinx/coroutines/Job;", "collectNearestStationJob", "Lkotlinx/coroutines/Job;", "collectLocationStatusJob", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/adif/elcanomovil/uiHome/HomeViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,520:1\n223#2,2:521\n1#3:523\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/adif/elcanomovil/uiHome/HomeViewModel\n*L\n412#1:521,2\n*E\n"})
/* loaded from: classes2.dex */
public final class HomeViewModel extends w0 {
    private final Channel<Boolean> _locationAvailable;
    private final Channel<Navigation> _navigation;
    private final Channel<Unit> _requestLocationPermission;
    private final MutableStateFlow<HomeFragmentViewState> _viewState;
    private Job collectLocationStatusJob;
    private Job collectNearestStationJob;
    private final Context context;
    private final GetClosestStationUseCase getClosestStationUseCase;
    private final GetHomeStationUseCase getHomeStationUseCase;
    private final GetRelationStationsFavoritesUseCase getRelationFavoritesUseCase;
    private final GetTrainsFavoritesUseCase getTrainsFavoritesUseCase;
    private final GetWorkStationUseCase getWorkStationUseCase;
    private StationViewEntity highlightedStation;
    private StationViewEntity homeStation;
    private boolean isFullyExpandedBottomSheet;
    private boolean isLocationEnabled;
    private final Flow<Boolean> locationAvailable;
    private boolean locationAvailableNotified;
    private final LocationStatusProvider locationStatusProvider;
    private final Flow<Navigation> navigation;
    private StationViewEntity nearestStation;
    private final C0284d permissionHelper;
    private final Flow<Unit> requestLocationPermission;
    private StationViewEntity selectedStation;
    private final SetHomeStationUseCase setHomeStationUseCase;
    private final SetWorkStationUseCase setWorkStationUseCase;
    private final TabDataHolder tabDataHolder;
    private final UserFavoriteVOMapper userFavoriteVOMapper;
    private List<UserFavoriteVO> userFavorites;
    private final StateFlow<HomeFragmentViewState> viewState;
    private StationViewEntity workStation;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StationViewEntity.Type.values().length];
            try {
                iArr[StationViewEntity.Type.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StationViewEntity.Type.WORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StationViewEntity.Type.DEPARTURES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StationViewEntity.Type.ARRIVALS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StationViewEntity.Type.INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StationViewEntity.Type.COMMERCIAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public HomeViewModel(@ApplicationContext Context context, GetHomeStationUseCase getHomeStationUseCase, GetWorkStationUseCase getWorkStationUseCase, GetClosestStationUseCase getClosestStationUseCase, SetHomeStationUseCase setHomeStationUseCase, SetWorkStationUseCase setWorkStationUseCase, GetRelationStationsFavoritesUseCase getRelationFavoritesUseCase, GetTrainsFavoritesUseCase getTrainsFavoritesUseCase, TabDataHolder tabDataHolder, C0284d permissionHelper, UserFavoriteVOMapper userFavoriteVOMapper, LocationStatusProvider locationStatusProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(getHomeStationUseCase, "getHomeStationUseCase");
        Intrinsics.checkNotNullParameter(getWorkStationUseCase, "getWorkStationUseCase");
        Intrinsics.checkNotNullParameter(getClosestStationUseCase, "getClosestStationUseCase");
        Intrinsics.checkNotNullParameter(setHomeStationUseCase, "setHomeStationUseCase");
        Intrinsics.checkNotNullParameter(setWorkStationUseCase, "setWorkStationUseCase");
        Intrinsics.checkNotNullParameter(getRelationFavoritesUseCase, "getRelationFavoritesUseCase");
        Intrinsics.checkNotNullParameter(getTrainsFavoritesUseCase, "getTrainsFavoritesUseCase");
        Intrinsics.checkNotNullParameter(tabDataHolder, "tabDataHolder");
        Intrinsics.checkNotNullParameter(permissionHelper, "permissionHelper");
        Intrinsics.checkNotNullParameter(userFavoriteVOMapper, "userFavoriteVOMapper");
        Intrinsics.checkNotNullParameter(locationStatusProvider, "locationStatusProvider");
        this.context = context;
        this.getHomeStationUseCase = getHomeStationUseCase;
        this.getWorkStationUseCase = getWorkStationUseCase;
        this.getClosestStationUseCase = getClosestStationUseCase;
        this.setHomeStationUseCase = setHomeStationUseCase;
        this.setWorkStationUseCase = setWorkStationUseCase;
        this.getRelationFavoritesUseCase = getRelationFavoritesUseCase;
        this.getTrainsFavoritesUseCase = getTrainsFavoritesUseCase;
        this.tabDataHolder = tabDataHolder;
        this.permissionHelper = permissionHelper;
        this.userFavoriteVOMapper = userFavoriteVOMapper;
        this.locationStatusProvider = locationStatusProvider;
        MutableStateFlow<HomeFragmentViewState> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._viewState = MutableStateFlow;
        this.viewState = FlowKt.asStateFlow(MutableStateFlow);
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        Channel<Unit> Channel$default = ChannelKt.Channel$default(1, bufferOverflow, null, 4, null);
        this._requestLocationPermission = Channel$default;
        this.requestLocationPermission = FlowKt.receiveAsFlow(Channel$default);
        Channel<Boolean> Channel$default2 = ChannelKt.Channel$default(1, bufferOverflow, null, 4, null);
        this._locationAvailable = Channel$default2;
        this.locationAvailable = FlowKt.receiveAsFlow(Channel$default2);
        Channel<Navigation> Channel$default3 = ChannelKt.Channel$default(1, bufferOverflow, null, 4, null);
        this._navigation = Channel$default3;
        this.navigation = FlowKt.receiveAsFlow(Channel$default3);
        Channel$default2.mo1630trySendJP2dKIU(Boolean.FALSE);
    }

    public static final /* synthetic */ void access$collectNearestStation(HomeViewModel homeViewModel) {
        homeViewModel.collectNearestStation();
    }

    public static final /* synthetic */ void access$setLocationEnabled$p(HomeViewModel homeViewModel, boolean z3) {
        homeViewModel.isLocationEnabled = z3;
    }

    public static final /* synthetic */ void access$updateViewState(HomeViewModel homeViewModel) {
        homeViewModel.updateViewState();
    }

    private final void askForLocationPermission() {
        this._requestLocationPermission.mo1630trySendJP2dKIU(Unit.INSTANCE);
    }

    public final void collectLocationStatus() {
        Job launch$default;
        Job job = this.collectLocationStatusJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, CoroutineStart.UNDISPATCHED, new q(this, null), 1, null);
        this.collectLocationStatusJob = launch$default;
    }

    public final void collectNearestStation() {
        Job launch$default;
        Job job = this.collectNearestStationJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, CoroutineStart.UNDISPATCHED, new s(this, null), 1, null);
        this.collectNearestStationJob = launch$default;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        if (r10 != r1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        if (r2 == r1) goto L87;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0022. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchFavorites(kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiHome.HomeViewModel.fetchFavorites(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchHomeStation(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.adif.elcanomovil.uiHome.v
            if (r0 == 0) goto L13
            r0 = r6
            com.adif.elcanomovil.uiHome.v r0 = (com.adif.elcanomovil.uiHome.v) r0
            int r1 = r0.f5109e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5109e = r1
            goto L18
        L13:
            com.adif.elcanomovil.uiHome.v r0 = new com.adif.elcanomovil.uiHome.v
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f5107c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5109e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper r5 = r0.f5106b
            com.adif.elcanomovil.uiHome.HomeViewModel r0 = r0.f5105a
            kotlin.ResultKt.throwOnFailure(r6)
            r4 = r6
            r6 = r5
            r5 = r0
            r0 = r4
            goto L4d
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.ResultKt.throwOnFailure(r6)
            com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper r6 = com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper.INSTANCE
            com.adif.elcanomovil.domain.usecases.stations.GetHomeStationUseCase r2 = r5.getHomeStationUseCase
            r0.f5105a = r5
            r0.f5106b = r6
            r0.f5109e = r3
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            com.adif.elcanomovil.domain.entities.station.Station r0 = (com.adif.elcanomovil.domain.entities.station.Station) r0
            com.adif.elcanomovil.commonViews.data.StationViewEntity r6 = r6.map(r0)
            if (r6 != 0) goto L56
            goto L5b
        L56:
            com.adif.elcanomovil.commonViews.data.StationViewEntity$Type r0 = com.adif.elcanomovil.commonViews.data.StationViewEntity.Type.HOME
            r6.setType(r0)
        L5b:
            r5.homeStation = r6
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiHome.HomeViewModel.fetchHomeStation(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchWorkStation(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.adif.elcanomovil.uiHome.w
            if (r0 == 0) goto L13
            r0 = r6
            com.adif.elcanomovil.uiHome.w r0 = (com.adif.elcanomovil.uiHome.w) r0
            int r1 = r0.f5143e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5143e = r1
            goto L18
        L13:
            com.adif.elcanomovil.uiHome.w r0 = new com.adif.elcanomovil.uiHome.w
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f5141c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5143e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper r5 = r0.f5140b
            com.adif.elcanomovil.uiHome.HomeViewModel r0 = r0.f5139a
            kotlin.ResultKt.throwOnFailure(r6)
            r4 = r6
            r6 = r5
            r5 = r0
            r0 = r4
            goto L4d
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.ResultKt.throwOnFailure(r6)
            com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper r6 = com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper.INSTANCE
            com.adif.elcanomovil.domain.usecases.stations.GetWorkStationUseCase r2 = r5.getWorkStationUseCase
            r0.f5139a = r5
            r0.f5140b = r6
            r0.f5143e = r3
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            com.adif.elcanomovil.domain.entities.station.Station r0 = (com.adif.elcanomovil.domain.entities.station.Station) r0
            com.adif.elcanomovil.commonViews.data.StationViewEntity r6 = r6.map(r0)
            if (r6 != 0) goto L56
            goto L5b
        L56:
            com.adif.elcanomovil.commonViews.data.StationViewEntity$Type r0 = com.adif.elcanomovil.commonViews.data.StationViewEntity.Type.WORK
            r6.setType(r0)
        L5b:
            r5.workStation = r6
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiHome.HomeViewModel.fetchWorkStation(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final LocationStatus getLocationStatus() {
        return this.locationAvailableNotified ? this.isLocationEnabled ? LocationStatus.ENABLED : LocationStatus.DISABLED : LocationStatus.PERMISSION_DENIED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x004a, code lost:
    
        if (r8 == r2) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleTrainTap(java.lang.String r7, kotlin.coroutines.Continuation<? super com.adif.elcanomovil.commonNavGraph.navigation.Navigation> r8) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiHome.HomeViewModel.handleTrainTap(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean isBottomSheetHidden() {
        HomeFragmentViewState value = this._viewState.getValue();
        return (value != null ? value.getBottomSheetViewState() : null) instanceof HomeFragmentBottomSheetViewState.Hidden;
    }

    private final boolean isLocationPermissionGranted() {
        C0284d c0284d = this.permissionHelper;
        Context context = this.context;
        c0284d.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("android.permission.ACCESS_COARSE_LOCATION", "permission");
        return D.h.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    private final void navigateToSelectStationHome() {
        this._navigation.mo1630trySendJP2dKIU(new Navigation.RootDirection(BottomNavFragmentDirections.INSTANCE.toSelectStationFragment(NavArguments.StationSelectionType.HOME_STATION.toString()), null, 2, null));
    }

    private final void navigateToSelectStationWork() {
        this._navigation.mo1630trySendJP2dKIU(new Navigation.RootDirection(BottomNavFragmentDirections.INSTANCE.toSelectStationFragment(NavArguments.StationSelectionType.WORK_STATION.toString()), null, 2, null));
    }

    public final void notifyLocationAvailable() {
        if (this.locationAvailableNotified) {
            return;
        }
        this.locationAvailableNotified = true;
        this._locationAvailable.mo1630trySendJP2dKIU(Boolean.TRUE);
    }

    private final void onCommercialAreaTapped() {
        String str;
        TabDataHolder tabDataHolder = this.tabDataHolder;
        StationViewEntity stationViewEntity = this.highlightedStation;
        if (stationViewEntity == null || (str = stationViewEntity.getId()) == null) {
            str = "";
        }
        tabDataHolder.push(new TabDataHolder.TabData.Stations(str, StationServiceType.COMMERCIAL));
        this._navigation.mo1630trySendJP2dKIU(new Navigation.TabDirection(new BottomNavInitialTab.Station(null, 1, null)));
    }

    private final void onHomeStationDetailTapped(String stationId) {
        StationViewEntity stationViewEntity = this.homeStation;
        if (stationViewEntity == null) {
            navigateToSelectStationHome();
            return;
        }
        TabDataHolder tabDataHolder = this.tabDataHolder;
        StationViewEntity stationViewEntity2 = this.highlightedStation;
        tabDataHolder.push(new TabDataHolder.TabData.Departures(stationViewEntity2 != null ? stationViewEntity2.getId() : null, stationId, CirculationType.BETWEEN_STATIONS, stationViewEntity.getTrafficTypeValue() != StationViewEntity.TypeTraffic.AVLDMD ? TrainType.CERCANIAS : TrainType.AVELDMD));
        ChannelResult.m1640boximpl(this._navigation.mo1630trySendJP2dKIU(new Navigation.TabDirection(new BottomNavInitialTab.Departures(null, 1, null))));
    }

    private final void onHomeStationSet(HomeFragmentViewAction.HomeStationSet action) {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new y(this, action, null), 3, null);
    }

    private final void onLocationPermissionGranted() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new z(this, null), 3, null);
    }

    private final void onMapTapped() {
        if (isBottomSheetHidden()) {
            updateViewStateHiddenBottomSheet();
            return;
        }
        this.selectedStation = null;
        this.isFullyExpandedBottomSheet = false;
        this._viewState.setValue(null);
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new A(this, null), 3, null);
    }

    private final void onNextArrivalsTapped() {
        TabDataHolder tabDataHolder = this.tabDataHolder;
        StationViewEntity stationViewEntity = this.highlightedStation;
        String id = stationViewEntity != null ? stationViewEntity.getId() : null;
        CirculationType circulationType = CirculationType.ARRIVAL;
        StationViewEntity stationViewEntity2 = this.highlightedStation;
        tabDataHolder.push(new TabDataHolder.TabData.Departures(id, null, circulationType, (stationViewEntity2 != null ? stationViewEntity2.getTrafficTypeValue() : null) != StationViewEntity.TypeTraffic.AVLDMD ? TrainType.CERCANIAS : TrainType.AVELDMD));
        this._navigation.mo1630trySendJP2dKIU(new Navigation.TabDirection(new BottomNavInitialTab.Departures(null, 1, null)));
    }

    private final void onNextDeparturesTapped() {
        TabDataHolder tabDataHolder = this.tabDataHolder;
        StationViewEntity stationViewEntity = this.highlightedStation;
        String id = stationViewEntity != null ? stationViewEntity.getId() : null;
        CirculationType circulationType = CirculationType.DEPARTURE;
        StationViewEntity stationViewEntity2 = this.highlightedStation;
        tabDataHolder.push(new TabDataHolder.TabData.Departures(id, null, circulationType, (stationViewEntity2 != null ? stationViewEntity2.getTrafficTypeValue() : null) != StationViewEntity.TypeTraffic.AVLDMD ? TrainType.CERCANIAS : TrainType.AVELDMD));
        this._navigation.mo1630trySendJP2dKIU(new Navigation.TabDirection(new BottomNavInitialTab.Departures(null, 1, null)));
    }

    private final void onStationDetailTapped(StationViewEntity.Type stationType, String stationId) {
        switch (WhenMappings.$EnumSwitchMapping$0[stationType.ordinal()]) {
            case 1:
                onHomeStationDetailTapped(stationId);
                return;
            case 2:
                onWorkStationTapped(stationId);
                return;
            case 3:
                onNextDeparturesTapped();
                return;
            case 4:
                onNextArrivalsTapped();
                return;
            case 5:
                onStationInfoTapped();
                return;
            case 6:
                onCommercialAreaTapped();
                return;
            default:
                return;
        }
    }

    private final void onStationInfoTapped() {
        String str;
        TabDataHolder tabDataHolder = this.tabDataHolder;
        StationViewEntity stationViewEntity = this.highlightedStation;
        if (stationViewEntity == null || (str = stationViewEntity.getId()) == null) {
            str = "";
        }
        tabDataHolder.push(new TabDataHolder.TabData.Stations(str, StationServiceType.SERVICES));
        this._navigation.mo1630trySendJP2dKIU(new Navigation.TabDirection(new BottomNavInitialTab.Station(null, 1, null)));
    }

    private final void onStationSelected(StationViewEntity station) {
        this.selectedStation = station;
        updateViewWithSelectedStationBottomSheet(station);
    }

    private final void onUserFavoritePressed(UserFavoriteVO favoriteVO) {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new B(favoriteVO, this, null), 3, null);
    }

    private final void onWorkStationSet(HomeFragmentViewAction.WorkStationSet action) {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new D(this, action, null), 3, null);
    }

    private final void onWorkStationTapped(String stationId) {
        if (this.workStation == null) {
            navigateToSelectStationWork();
            return;
        }
        TabDataHolder tabDataHolder = this.tabDataHolder;
        StationViewEntity stationViewEntity = this.highlightedStation;
        String id = stationViewEntity != null ? stationViewEntity.getId() : null;
        CirculationType circulationType = CirculationType.BETWEEN_STATIONS;
        StationViewEntity stationViewEntity2 = this.workStation;
        tabDataHolder.push(new TabDataHolder.TabData.Departures(id, stationId, circulationType, (stationViewEntity2 != null ? stationViewEntity2.getTrafficTypeValue() : null) != StationViewEntity.TypeTraffic.AVLDMD ? TrainType.CERCANIAS : TrainType.AVELDMD));
        ChannelResult.m1640boximpl(this._navigation.mo1630trySendJP2dKIU(new Navigation.TabDirection(new BottomNavInitialTab.Departures(null, 1, null))));
    }

    private final void openBottomSheet() {
        this.isFullyExpandedBottomSheet = false;
        updateViewWithNearestStationBottomSheet();
    }

    public final void showFavorites() {
        this.isFullyExpandedBottomSheet = true;
        updateViewWithNearestStationBottomSheet();
    }

    public final void updateViewState() {
        if (isBottomSheetHidden()) {
            updateViewStateHiddenBottomSheet();
            return;
        }
        StationViewEntity stationViewEntity = this.selectedStation;
        if (stationViewEntity != null) {
            updateViewWithSelectedStationBottomSheet(stationViewEntity);
        } else {
            updateViewWithNearestStationBottomSheet();
        }
    }

    private final void updateViewStateHiddenBottomSheet() {
        StationViewEntity stationViewEntity = this.nearestStation;
        this.highlightedStation = stationViewEntity;
        this._viewState.setValue(new HomeFragmentViewState(new MapViewState(stationViewEntity), HomeFragmentBottomSheetViewState.Hidden.INSTANCE));
    }

    public final void updateViewWithNearestStationBottomSheet() {
        StationViewEntity stationViewEntity = this.nearestStation;
        this.highlightedStation = stationViewEntity;
        MutableStateFlow<HomeFragmentViewState> mutableStateFlow = this._viewState;
        MapViewState mapViewState = new MapViewState(stationViewEntity);
        LocationStatus locationStatus = getLocationStatus();
        StationViewEntity stationViewEntity2 = this.nearestStation;
        StationViewEntity stationViewEntity3 = this.homeStation;
        StationViewEntity stationViewEntity4 = this.workStation;
        List<UserFavoriteVO> list = this.userFavorites;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        mutableStateFlow.setValue(new HomeFragmentViewState(mapViewState, new HomeFragmentBottomSheetViewState.NearestStationShown(locationStatus, stationViewEntity2, stationViewEntity3, stationViewEntity4, list, this.isFullyExpandedBottomSheet)));
    }

    private final void updateViewWithSelectedStationBottomSheet(StationViewEntity station) {
        this.highlightedStation = station;
        this._viewState.setValue(new HomeFragmentViewState(new MapViewState(station), new HomeFragmentBottomSheetViewState.StationSelected(station)));
    }

    public final Flow<Boolean> getLocationAvailable() {
        return this.locationAvailable;
    }

    public final Flow<Navigation> getNavigation() {
        return this.navigation;
    }

    public final Flow<Unit> getRequestLocationPermission() {
        return this.requestLocationPermission;
    }

    public final StateFlow<HomeFragmentViewState> getViewState() {
        return this.viewState;
    }

    public final void onAction(HomeFragmentViewAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof HomeFragmentViewAction.StationSelected) {
            onStationSelected(((HomeFragmentViewAction.StationSelected) action).getStation());
            return;
        }
        if (Intrinsics.areEqual(action, HomeFragmentViewAction.MapTapped.INSTANCE)) {
            onMapTapped();
            return;
        }
        if (Intrinsics.areEqual(action, HomeFragmentViewAction.LocationPermissionGranted.INSTANCE)) {
            onLocationPermissionGranted();
            return;
        }
        if (action instanceof HomeFragmentViewAction.HomeStationSet) {
            onHomeStationSet((HomeFragmentViewAction.HomeStationSet) action);
            return;
        }
        if (action instanceof HomeFragmentViewAction.WorkStationSet) {
            onWorkStationSet((HomeFragmentViewAction.WorkStationSet) action);
            return;
        }
        if (action instanceof HomeFragmentViewAction.StationDetailTapped) {
            HomeFragmentViewAction.StationDetailTapped stationDetailTapped = (HomeFragmentViewAction.StationDetailTapped) action;
            onStationDetailTapped(stationDetailTapped.getStationType(), stationDetailTapped.getStationId());
            return;
        }
        if (action instanceof HomeFragmentViewAction.FavoriteTapped) {
            onUserFavoritePressed(((HomeFragmentViewAction.FavoriteTapped) action).getFavorite());
            return;
        }
        if (action instanceof HomeFragmentViewAction.SetHomeStationTapped) {
            navigateToSelectStationHome();
            return;
        }
        if (action instanceof HomeFragmentViewAction.SetWorkStationTapped) {
            navigateToSelectStationWork();
            return;
        }
        if (Intrinsics.areEqual(action, HomeFragmentViewAction.ShowFavorites.INSTANCE)) {
            showFavorites();
        } else if (Intrinsics.areEqual(action, HomeFragmentViewAction.BottomSheetHidden.INSTANCE)) {
            updateViewStateHiddenBottomSheet();
        } else if (Intrinsics.areEqual(action, HomeFragmentViewAction.OpenBottomSheet.INSTANCE)) {
            openBottomSheet();
        }
    }

    public final void onViewCreated(boolean shouldShowFavorites) {
        if (isLocationPermissionGranted()) {
            notifyLocationAvailable();
        } else {
            askForLocationPermission();
        }
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new C(this, shouldShowFavorites, null), 3, null);
    }
}
