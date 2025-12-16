package com.adif.elcanomovil.uiStations.main;

import C.w;
import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.K;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u0;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.extensions.NavigationExtensionsKt;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.domain.entities.station.Location;
import com.adif.elcanomovil.main.BottomNavFragmentDirections;
import com.adif.elcanomovil.uiStations.R;
import com.adif.elcanomovil.uiStations.adapters.ServiceAdapter;
import com.adif.elcanomovil.uiStations.databinding.FragmentStationsPageServicesBinding;
import com.adif.elcanomovil.uiStations.entities.Services;
import com.adif.elcanomovil.uiStations.entities.ServicesTabViewData;
import com.adif.elcanomovil.uiStations.entities.StationMarker;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import l0.C0435a;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0005J!\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0005J\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u0005J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u0005J\u0019\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J#\u0010,\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\u0006H\u0003¢\u0006\u0004\b/\u0010\u0005J\u0017\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0019H\u0002¢\u0006\u0004\b5\u0010 J\u0017\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR3\u00102\u001a!\u0012\u0013\u0012\u001100¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u00060Gj\u0002`J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010KR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lcom/adif/elcanomovil/uiStations/main/StationsPageServicesFragment;", "Landroidx/fragment/app/K;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Landroidx/recyclerview/widget/u0;", "<init>", "()V", "", "onDestroyView", "onDetach", "onStop", "onDestroy", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/google/android/gms/maps/GoogleMap;", "map", "onMapReady", "(Lcom/google/android/gms/maps/GoogleMap;)V", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "Landroid/view/MotionEvent;", "e", "", "onInterceptTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", "disallowIntercept", "onRequestDisallowInterceptTouchEvent", "(Z)V", "configureViewObservers", "configureViewListeners", "initMap", "Lcom/adif/elcanomovil/uiStations/entities/StationMarker;", "stationMarker", "addMarkerAndMoveCamera", "(Lcom/adif/elcanomovil/uiStations/entities/StationMarker;)V", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "", "zoom", "moveMapCameraTo", "(Lcom/google/android/gms/maps/model/LatLng;F)V", "animateMapCamera", "configureMap", "Lcom/adif/elcanomovil/uiStations/entities/Services;", "service", "onServiceTap", "(Lcom/adif/elcanomovil/uiStations/entities/Services;)V", "isEmptyVisible", "updateVisibility", "Lcom/adif/elcanomovil/uiStations/entities/ServicesTabViewData;", "stationInfoViewData", "updateResults", "(Lcom/adif/elcanomovil/uiStations/entities/ServicesTabViewData;)V", "Lcom/adif/elcanomovil/uiStations/databinding/FragmentStationsPageServicesBinding;", "binding", "Lcom/adif/elcanomovil/uiStations/databinding/FragmentStationsPageServicesBinding;", "Lcom/adif/elcanomovil/uiStations/main/StationsPageServicesViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/uiStations/main/StationsPageServicesViewModel;", "viewModel", "isMovingCamera", "Z", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lcom/adif/elcanomovil/uiStations/adapters/OnServiceTap;", "Lkotlin/jvm/functions/Function1;", "", "lastX", "I", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nStationsPageServicesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StationsPageServicesFragment.kt\ncom/adif/elcanomovil/uiStations/main/StationsPageServicesFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,362:1\n106#2,15:363\n37#3,2:378\n37#3,2:380\n1#4:382\n*S KotlinDebug\n*F\n+ 1 StationsPageServicesFragment.kt\ncom/adif/elcanomovil/uiStations/main/StationsPageServicesFragment\n*L\n41#1:363,15\n222#1:378,2\n224#1:380,2\n*E\n"})
/* loaded from: classes2.dex */
public final class StationsPageServicesFragment extends Hilt_StationsPageServicesFragment implements OnMapReadyCallback, u0 {
    private FragmentStationsPageServicesBinding binding;
    private boolean isMovingCamera;
    private int lastX;
    private GoogleMap mMap;
    private final Function1<Services, Unit> onServiceTap;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public StationsPageServicesFragment() {
        super(R.layout.fragment_stations_page_services);
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.uiStations.main.StationsPageServicesFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.uiStations.main.StationsPageServicesFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final D0 invoke() {
                return (D0) Function0.this.invoke();
            }
        });
        final Function0 function02 = null;
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(StationsPageServicesViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.uiStations.main.StationsPageServicesFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.uiStations.main.StationsPageServicesFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final l0.c invoke() {
                l0.c cVar;
                Function0 function03 = Function0.this;
                if (function03 != null && (cVar = (l0.c) function03.invoke()) != null) {
                    return cVar;
                }
                D0 d02 = (D0) lazy.getValue();
                InterfaceC0200v interfaceC0200v = d02 instanceof InterfaceC0200v ? (InterfaceC0200v) d02 : null;
                return interfaceC0200v != null ? interfaceC0200v.getDefaultViewModelCreationExtras() : C0435a.f7312b;
            }
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.uiStations.main.StationsPageServicesFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final y0 invoke() {
                y0 defaultViewModelProviderFactory;
                D0 d02 = (D0) lazy.getValue();
                InterfaceC0200v interfaceC0200v = d02 instanceof InterfaceC0200v ? (InterfaceC0200v) d02 : null;
                if (interfaceC0200v != null && (defaultViewModelProviderFactory = interfaceC0200v.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                y0 defaultViewModelProviderFactory2 = K.this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.onServiceTap = new I1.b(this, 16);
    }

    private final void addMarkerAndMoveCamera(StationMarker stationMarker) {
        if (stationMarker != null) {
            GoogleMap googleMap = this.mMap;
            if (googleMap != null) {
                googleMap.clear();
            }
            GoogleMap googleMap2 = this.mMap;
            if (googleMap2 != null) {
                MarkerOptions position = new MarkerOptions().position(new LatLng(stationMarker.getLatitude(), stationMarker.getLongitude()));
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                googleMap2.addMarker(position.icon(stationMarker.markerIcon(requireContext)));
            }
            moveMapCameraTo$default(this, new LatLng(stationMarker.getLatitude(), stationMarker.getLongitude()), BitmapDescriptorFactory.HUE_RED, 2, null);
        }
    }

    private final void animateMapCamera(LatLng latLng, float zoom) {
        GoogleMap googleMap = this.mMap;
        if (googleMap != null) {
            this.isMovingCamera = true;
            if (googleMap != null) {
                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom), new GoogleMap.CancelableCallback() { // from class: com.adif.elcanomovil.uiStations.main.StationsPageServicesFragment$animateMapCamera$1$1
                    @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
                    public void onCancel() {
                    }

                    @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
                    public void onFinish() {
                    }
                });
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    private final void configureMap() {
        GoogleMap googleMap = this.mMap;
        if (googleMap != null) {
            googleMap.getUiSettings().setCompassEnabled(true);
            googleMap.getUiSettings().setRotateGesturesEnabled(false);
            googleMap.getUiSettings().setMyLocationButtonEnabled(true);
            googleMap.getUiSettings().setMapToolbarEnabled(true);
            googleMap.getUiSettings().setScrollGesturesEnabled(true);
            googleMap.getUiSettings().setZoomControlsEnabled(true);
            Context context = getContext();
            if (context != null && context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                googleMap.setMyLocationEnabled(true);
            }
            MyCustomMapFragment myCustomMapFragment = (MyCustomMapFragment) getChildFragmentManager().E(R.id.map);
            if (myCustomMapFragment != null) {
                myCustomMapFragment.setListener(new I2.k(this, 14));
            }
        }
    }

    public static final void configureMap$lambda$6$lambda$5(StationsPageServicesFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding = this$0.binding;
        if (fragmentStationsPageServicesBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding = null;
        }
        fragmentStationsPageServicesBinding.nestedScroll.requestDisallowInterceptTouchEvent(true);
    }

    private final void configureViewListeners() {
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding = this.binding;
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding2 = null;
        if (fragmentStationsPageServicesBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding = null;
        }
        fragmentStationsPageServicesBinding.addFavourite.setOnClickListener(new i(this, 1));
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding3 = this.binding;
        if (fragmentStationsPageServicesBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding3 = null;
        }
        fragmentStationsPageServicesBinding3.centerCameraMap.setOnClickListener(new i(this, 2));
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding4 = this.binding;
        if (fragmentStationsPageServicesBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentStationsPageServicesBinding2 = fragmentStationsPageServicesBinding4;
        }
        fragmentStationsPageServicesBinding2.map.getParent().requestDisallowInterceptTouchEvent(true);
    }

    public static final void configureViewListeners$lambda$0(StationsPageServicesFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().handleFavouriteTapped();
    }

    public static final void configureViewListeners$lambda$1(StationsPageServicesFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        moveMapCameraTo$default(this$0, this$0.getViewModel().getStationLatLng(), BitmapDescriptorFactory.HUE_RED, 2, null);
    }

    private final void configureViewObservers() {
        getViewModel().getViewData().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(4, new j(this)));
        getViewModel().getIsFavourite().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(4, new k(this)));
        InterfaceC0266a navigation = getViewModel().getNavigation();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ((b1.f) navigation).a(viewLifecycleOwner, new NavigationHandler(this));
    }

    private final StationsPageServicesViewModel getViewModel() {
        return (StationsPageServicesViewModel) this.viewModel.getValue();
    }

    private final void initMap() {
        K E3 = getChildFragmentManager().E(R.id.map);
        SupportMapFragment supportMapFragment = E3 instanceof SupportMapFragment ? (SupportMapFragment) E3 : null;
        if (supportMapFragment != null) {
            supportMapFragment.getMapAsync(this);
        }
    }

    private final void moveMapCameraTo(LatLng latLng, float zoom) {
        CameraPosition cameraPosition;
        if (latLng != null) {
            GoogleMap googleMap = this.mMap;
            if (Intrinsics.areEqual((googleMap == null || (cameraPosition = googleMap.getCameraPosition()) == null) ? null : cameraPosition.target, latLng)) {
                return;
            }
            animateMapCamera(latLng, zoom);
        }
    }

    public static /* synthetic */ void moveMapCameraTo$default(StationsPageServicesFragment stationsPageServicesFragment, LatLng latLng, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 14.0f;
        }
        stationsPageServicesFragment.moveMapCameraTo(latLng, f2);
    }

    public final void onServiceTap(Services service) {
        BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
        String logo = service.getLogo();
        String name = service.getName();
        String phone = service.getPhone();
        String description = service.getDescription();
        boolean accessible = service.getAccessible();
        List<String> paymentWay = service.getPaymentWay();
        String str = null;
        String[] strArr = paymentWay != null ? (String[]) paymentWay.toArray(new String[0]) : null;
        String offerDescription = service.getOfferDescription();
        List<String> correspondences = service.getCorrespondences();
        String[] strArr2 = correspondences != null ? (String[]) correspondences.toArray(new String[0]) : null;
        String web = service.getWeb();
        Location location = service.getLocation();
        if (location != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = w.s(new Object[]{location.getLatitude(), location.getLongitude()}, 2, "%s,%s", "format(...)");
        }
        NavigationExtensionsKt.findRootNavController(this).p(companion.toStationsAlertDialog(logo, name, phone, description, accessible, strArr, offerDescription, strArr2, web, str, service.getAccessibleLabel(), service.getOpeningHours(), service.getAndroidLink()));
    }

    public final void updateResults(ServicesTabViewData stationInfoViewData) {
        ServiceAdapter serviceAdapter = new ServiceAdapter(this.onServiceTap);
        serviceAdapter.update(stationInfoViewData.getEcomile());
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding = this.binding;
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding2 = null;
        if (fragmentStationsPageServicesBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding = null;
        }
        fragmentStationsPageServicesBinding.ecomiles.rv.setAdapter(serviceAdapter);
        if (stationInfoViewData.getEcomile() == null || !(!r0.isEmpty())) {
            FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding3 = this.binding;
            if (fragmentStationsPageServicesBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentStationsPageServicesBinding3 = null;
            }
            fragmentStationsPageServicesBinding3.ecomiles.layout.setVisibility(8);
        } else {
            FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding4 = this.binding;
            if (fragmentStationsPageServicesBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentStationsPageServicesBinding4 = null;
            }
            fragmentStationsPageServicesBinding4.ecomiles.layout.setVisibility(0);
        }
        ServiceAdapter serviceAdapter2 = new ServiceAdapter(this.onServiceTap);
        serviceAdapter2.update(stationInfoViewData.getIntermodality());
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding5 = this.binding;
        if (fragmentStationsPageServicesBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding5 = null;
        }
        fragmentStationsPageServicesBinding5.intermodality.rv.setAdapter(serviceAdapter2);
        if (stationInfoViewData.getIntermodality() == null || !(!r0.isEmpty())) {
            FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding6 = this.binding;
            if (fragmentStationsPageServicesBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentStationsPageServicesBinding6 = null;
            }
            fragmentStationsPageServicesBinding6.intermodality.layout.setVisibility(8);
        } else {
            FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding7 = this.binding;
            if (fragmentStationsPageServicesBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentStationsPageServicesBinding7 = null;
            }
            fragmentStationsPageServicesBinding7.intermodality.layout.setVisibility(0);
        }
        ServiceAdapter serviceAdapter3 = new ServiceAdapter(this.onServiceTap);
        serviceAdapter3.update(stationInfoViewData.getAccessibility());
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding8 = this.binding;
        if (fragmentStationsPageServicesBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding8 = null;
        }
        fragmentStationsPageServicesBinding8.accessibility.rv.setAdapter(serviceAdapter3);
        if (stationInfoViewData.getAccessibility() == null || !(!r0.isEmpty())) {
            FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding9 = this.binding;
            if (fragmentStationsPageServicesBinding9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentStationsPageServicesBinding9 = null;
            }
            fragmentStationsPageServicesBinding9.accessibility.layout.setVisibility(8);
        } else {
            FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding10 = this.binding;
            if (fragmentStationsPageServicesBinding10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentStationsPageServicesBinding10 = null;
            }
            fragmentStationsPageServicesBinding10.accessibility.layout.setVisibility(0);
        }
        ServiceAdapter serviceAdapter4 = new ServiceAdapter(this.onServiceTap);
        serviceAdapter4.update(stationInfoViewData.getStationServices());
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding11 = this.binding;
        if (fragmentStationsPageServicesBinding11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding11 = null;
        }
        fragmentStationsPageServicesBinding11.stationServices.rv.setAdapter(serviceAdapter4);
        if (stationInfoViewData.getStationServices() == null || !(!r0.isEmpty())) {
            FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding12 = this.binding;
            if (fragmentStationsPageServicesBinding12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentStationsPageServicesBinding12 = null;
            }
            fragmentStationsPageServicesBinding12.stationServices.layout.setVisibility(8);
        } else {
            FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding13 = this.binding;
            if (fragmentStationsPageServicesBinding13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentStationsPageServicesBinding13 = null;
            }
            fragmentStationsPageServicesBinding13.stationServices.layout.setVisibility(0);
        }
        addMarkerAndMoveCamera(stationInfoViewData.getStationMarker());
        if (stationInfoViewData.isAvisaStation()) {
            FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding14 = this.binding;
            if (fragmentStationsPageServicesBinding14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentStationsPageServicesBinding14 = null;
            }
            fragmentStationsPageServicesBinding14.avisa.setVisibility(0);
            FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding15 = this.binding;
            if (fragmentStationsPageServicesBinding15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentStationsPageServicesBinding15 = null;
            }
            fragmentStationsPageServicesBinding15.avisa.setOnClickListener(new i(this, 0));
        } else {
            FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding16 = this.binding;
            if (fragmentStationsPageServicesBinding16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentStationsPageServicesBinding16 = null;
            }
            fragmentStationsPageServicesBinding16.avisa.setVisibility(8);
        }
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding17 = this.binding;
        if (fragmentStationsPageServicesBinding17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding17 = null;
        }
        fragmentStationsPageServicesBinding17.openingHours.setText(stationInfoViewData.getOpeningHours());
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding18 = this.binding;
        if (fragmentStationsPageServicesBinding18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding18 = null;
        }
        LinearLayout linearLayout = fragmentStationsPageServicesBinding18.openingHoursLayout;
        String openingHours = stationInfoViewData.getOpeningHours();
        linearLayout.setVisibility((openingHours == null || openingHours.length() == 0) ? 8 : 0);
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding19 = this.binding;
        if (fragmentStationsPageServicesBinding19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding19 = null;
        }
        fragmentStationsPageServicesBinding19.location.setText(stationInfoViewData.getLocation());
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding20 = this.binding;
        if (fragmentStationsPageServicesBinding20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding20 = null;
        }
        fragmentStationsPageServicesBinding20.locationLayout.setVisibility(stationInfoViewData.getLocation() == null ? 8 : 0);
        String bannerURI = stationInfoViewData.getBannerURI();
        if (bannerURI == null || bannerURI.length() == 0) {
            FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding21 = this.binding;
            if (fragmentStationsPageServicesBinding21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentStationsPageServicesBinding2 = fragmentStationsPageServicesBinding21;
            }
            fragmentStationsPageServicesBinding2.banner.setVisibility(8);
            return;
        }
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding22 = this.binding;
        if (fragmentStationsPageServicesBinding22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding22 = null;
        }
        fragmentStationsPageServicesBinding22.banner.setVisibility(0);
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding23 = this.binding;
        if (fragmentStationsPageServicesBinding23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding23 = null;
        }
        fragmentStationsPageServicesBinding23.bannerTitle.setText(stationInfoViewData.getBannerTitle());
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding24 = this.binding;
        if (fragmentStationsPageServicesBinding24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding24 = null;
        }
        fragmentStationsPageServicesBinding24.bannerDescription.setText(stationInfoViewData.getBannerDescription());
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding25 = this.binding;
        if (fragmentStationsPageServicesBinding25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentStationsPageServicesBinding2 = fragmentStationsPageServicesBinding25;
        }
        fragmentStationsPageServicesBinding2.banner.setOnClickListener(new G2.l(9, this, stationInfoViewData));
    }

    public static final void updateResults$lambda$10(StationsPageServicesFragment this$0, ServicesTabViewData stationInfoViewData, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(stationInfoViewData, "$stationInfoViewData");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(stationInfoViewData.getBannerURI()));
        try {
            this$0.startActivity(intent);
        } catch (ActivityNotFoundException e4) {
            m3.l.g(e4);
        }
    }

    public static final void updateResults$lambda$8(StationsPageServicesFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().handleAvisaButtonTapped();
    }

    public final void updateVisibility(boolean isEmptyVisible) {
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding = this.binding;
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding2 = null;
        if (fragmentStationsPageServicesBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding = null;
        }
        fragmentStationsPageServicesBinding.viewNotEmptyStation.setVisibility(isEmptyVisible ? 8 : 0);
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding3 = this.binding;
        if (fragmentStationsPageServicesBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentStationsPageServicesBinding2 = fragmentStationsPageServicesBinding3;
        }
        fragmentStationsPageServicesBinding2.loadingEmptyOrErrorCommonView.setVisibility(isEmptyVisible ? 0 : 8);
    }

    @Override // androidx.fragment.app.K
    public void onDestroy() {
        super.onDestroy();
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding = this.binding;
        if (fragmentStationsPageServicesBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding = null;
        }
        fragmentStationsPageServicesBinding.banner.setVisibility(8);
    }

    @Override // androidx.fragment.app.K
    public void onDestroyView() {
        super.onDestroyView();
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding = this.binding;
        if (fragmentStationsPageServicesBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding = null;
        }
        fragmentStationsPageServicesBinding.banner.setVisibility(8);
    }

    @Override // androidx.fragment.app.K
    public void onDetach() {
        super.onDetach();
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding = this.binding;
        if (fragmentStationsPageServicesBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding = null;
        }
        fragmentStationsPageServicesBinding.banner.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.u0
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e4) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        Intrinsics.checkNotNullParameter(e4, "e");
        return false;
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public void onMapReady(GoogleMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.mMap = map;
        configureMap();
    }

    @Override // androidx.recyclerview.widget.u0
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
    }

    @Override // androidx.fragment.app.K
    public void onStop() {
        super.onStop();
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding = this.binding;
        if (fragmentStationsPageServicesBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding = null;
        }
        fragmentStationsPageServicesBinding.banner.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.u0
    public void onTouchEvent(RecyclerView rv, MotionEvent e4) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        Intrinsics.checkNotNullParameter(e4, "e");
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentStationsPageServicesBinding bind = FragmentStationsPageServicesBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding = null;
        if (bind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bind = null;
        }
        bind.banner.setVisibility(8);
        initMap();
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding2 = this.binding;
        if (fragmentStationsPageServicesBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding2 = null;
        }
        fragmentStationsPageServicesBinding2.ecomiles.title.setText(getString(R.string.ecomile));
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding3 = this.binding;
        if (fragmentStationsPageServicesBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding3 = null;
        }
        fragmentStationsPageServicesBinding3.ecomiles.rv.j(this);
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding4 = this.binding;
        if (fragmentStationsPageServicesBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding4 = null;
        }
        fragmentStationsPageServicesBinding4.intermodality.title.setText(getString(R.string.intermodality));
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding5 = this.binding;
        if (fragmentStationsPageServicesBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding5 = null;
        }
        fragmentStationsPageServicesBinding5.intermodality.rv.j(this);
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding6 = this.binding;
        if (fragmentStationsPageServicesBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding6 = null;
        }
        fragmentStationsPageServicesBinding6.accessibility.title.setText(getString(R.string.accessibility));
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding7 = this.binding;
        if (fragmentStationsPageServicesBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding7 = null;
        }
        fragmentStationsPageServicesBinding7.accessibility.rv.j(this);
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding8 = this.binding;
        if (fragmentStationsPageServicesBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding8 = null;
        }
        fragmentStationsPageServicesBinding8.stationServices.title.setText(getString(R.string.station_services));
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding9 = this.binding;
        if (fragmentStationsPageServicesBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentStationsPageServicesBinding = fragmentStationsPageServicesBinding9;
        }
        fragmentStationsPageServicesBinding.stationServices.rv.j(this);
        configureViewObservers();
        configureViewListeners();
    }
}
