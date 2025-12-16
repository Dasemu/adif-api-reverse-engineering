package com.adif.elcanomovil.uiHome.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.K;
import androidx.lifecycle.Q;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.extensions.LocationExtensionsKt;
import com.adif.elcanomovil.uiAvisa.components.create.l;
import com.adif.elcanomovil.uiHome.HomeFragment;
import com.adif.elcanomovil.uiHome.R;
import com.adif.elcanomovil.uiHome.data.StationMarker;
import com.adif.elcanomovil.uiHome.databinding.ViewHomeMapBinding;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u001a\u00101\u001a\u00020\u001d2\u0010\u00102\u001a\f\u0012\u0004\u0012\u00020403j\u0002`5H\u0002J\u001f\u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0002\u0010;J\b\u0010<\u001a\u00020\u001dH\u0003J\b\u0010=\u001a\u00020\u001dH\u0003J\b\u0010>\u001a\u00020\u001dH\u0002J\u000e\u0010?\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020*J\u0010\u0010A\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\bH\u0002JB\u0010B\u001a\u00020\u001d2\b\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010E\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020\u00192\u0006\u0010J\u001a\u00020\u0019H\u0002J!\u0010K\u001a\u00020\u001d2\u0006\u00107\u001a\u0002082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0002\u0010;JB\u0010L\u001a\u00020\u001d2\b\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010E\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020\u00192\u0006\u0010J\u001a\u00020\u0019H\u0002JB\u0010M\u001a\u00020\u001d2\b\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010E\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020\u00192\u0006\u0010J\u001a\u00020\u0019H\u0002JB\u0010N\u001a\u00020\u001d2\b\u0010O\u001a\u0004\u0018\u00010D2\u0006\u0010E\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020\u00192\u0006\u0010J\u001a\u00020\u0019H\u0002JB\u0010P\u001a\u00020\u001d2\b\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010E\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020\u00192\u0006\u0010J\u001a\u00020\u0019H\u0002J\b\u0010Q\u001a\u00020\u001dH\u0016J\u0010\u0010R\u001a\u00020\u001d2\u0006\u0010S\u001a\u000208H\u0016J\u0010\u0010T\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010U\u001a\u00020\u00192\u0006\u0010V\u001a\u00020WH\u0016J\b\u0010X\u001a\u00020\u0019H\u0016J\u000e\u0010Y\u001a\u00020\u001d2\u0006\u0010Z\u001a\u00020\u0019J\u000e\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001cR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\u001a\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001bj\u0002`\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006]"}, d2 = {"Lcom/adif/elcanomovil/uiHome/views/HomeMapView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/maps/GoogleMap$OnMapClickListener;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "Lcom/google/android/gms/maps/GoogleMap$OnCameraIdleListener;", "Lcom/google/android/gms/maps/GoogleMap$OnMyLocationButtonClickListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attrs", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "GOOGLEMAP_COMPASS", "", "GOOGLEMAP_MYLOCATION_BUTTON", "GOOGLEMAP_TOOLBAR", "GOOGLEMAP_ZOOMIN_BUTTON", "binding", "Lcom/adif/elcanomovil/uiHome/databinding/ViewHomeMapBinding;", "isMovingCamera", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "", "Lcom/adif/elcanomovil/uiHome/views/StationMarkerListener;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "map", "Lcom/google/android/gms/maps/GoogleMap;", "mapVisibleRegion", "Lcom/google/android/gms/maps/model/LatLngBounds;", "getMapVisibleRegion", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "ownerFragment", "Lcom/adif/elcanomovil/uiHome/HomeFragment;", "viewModel", "Lcom/adif/elcanomovil/uiHome/views/HomeMapViewModel;", "getViewModel", "()Lcom/adif/elcanomovil/uiHome/views/HomeMapViewModel;", "setViewModel", "(Lcom/adif/elcanomovil/uiHome/views/HomeMapViewModel;)V", "addMarkers", "markers", "Ljava/util/ArrayList;", "Lcom/adif/elcanomovil/uiHome/data/StationMarker;", "Lcom/adif/elcanomovil/uiHome/data/StationsMarkers;", "animateMapCamera", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "zoom", "", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/Float;)V", "configureMap", "configureMapLocation", "configureObservers", "initMap", "fragment", "initView", "moveCompass", "mapView", "Landroid/view/View;", "left", "top", "right", "bottom", "horizontal", "vertical", "moveMapCameraTo", "moveMyLocation", "moveToolbar", "moveView", "view", "moveZoomControls", "onCameraIdle", "onMapClick", FirebaseAnalytics.Param.LOCATION, "onMapReady", "onMarkerClick", "marker", "Lcom/google/android/gms/maps/model/Marker;", "onMyLocationButtonClick", "setLocationAvailableAndCenterCamera", "isAvailable", "updateSelectedStation", "station", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nHomeMapView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeMapView.kt\ncom/adif/elcanomovil/uiHome/views/HomeMapView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1855#2,2:303\n1#3:305\n*S KotlinDebug\n*F\n+ 1 HomeMapView.kt\ncom/adif/elcanomovil/uiHome/views/HomeMapView\n*L\n222#1:303,2\n*E\n"})
/* loaded from: classes2.dex */
public final class HomeMapView extends Hilt_HomeMapView implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnCameraIdleListener, GoogleMap.OnMyLocationButtonClickListener {
    private final String GOOGLEMAP_COMPASS;
    private final String GOOGLEMAP_MYLOCATION_BUTTON;
    private final String GOOGLEMAP_TOOLBAR;
    private final String GOOGLEMAP_ZOOMIN_BUTTON;
    private ViewHomeMapBinding binding;
    private boolean isMovingCamera;
    private Function1<? super StationViewEntity, Unit> listener;
    private GoogleMap map;
    private HomeFragment ownerFragment;

    @Inject
    public HomeMapViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeMapView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.GOOGLEMAP_COMPASS = "GoogleMapCompass";
        this.GOOGLEMAP_TOOLBAR = "GoogleMapToolbar";
        this.GOOGLEMAP_ZOOMIN_BUTTON = "GoogleMapZoomInButton";
        this.GOOGLEMAP_MYLOCATION_BUTTON = "GoogleMapMyLocationButton";
        initView(context);
    }

    public final void addMarkers(ArrayList<StationMarker> markers) {
        Marker marker;
        for (StationMarker stationMarker : markers) {
            LatLng location = stationMarker.getLocation();
            if (location != null) {
                GoogleMap googleMap = this.map;
                if (googleMap != null) {
                    MarkerOptions position = new MarkerOptions().position(location);
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    marker = googleMap.addMarker(position.icon(stationMarker.markerIcon(context)).flat(true).zIndex(2.0f));
                } else {
                    marker = null;
                }
                if (marker != null) {
                    marker.setTag(stationMarker.getStation().getId());
                }
                stationMarker.setMarker(marker);
            }
        }
    }

    private final void animateMapCamera(LatLng latLng, Float zoom) {
        CameraUpdate newLatLng;
        if (zoom == null || (newLatLng = CameraUpdateFactory.newLatLngZoom(latLng, zoom.floatValue())) == null) {
            newLatLng = CameraUpdateFactory.newLatLng(latLng);
        }
        Intrinsics.checkNotNull(newLatLng);
        GoogleMap googleMap = this.map;
        if (googleMap != null) {
            googleMap.animateCamera(newLatLng, new GoogleMap.CancelableCallback() { // from class: com.adif.elcanomovil.uiHome.views.HomeMapView$animateMapCamera$1
                @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
                public void onCancel() {
                    HomeMapView.this.isMovingCamera = false;
                }

                @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
                public void onFinish() {
                    HomeMapView.this.isMovingCamera = false;
                }
            });
        }
    }

    @SuppressLint({"MissingPermission"})
    private final void configureMap() {
        GoogleMap googleMap = this.map;
        if (googleMap != null) {
            googleMap.getUiSettings().setCompassEnabled(true);
            googleMap.getUiSettings().setRotateGesturesEnabled(false);
            UiSettings uiSettings = googleMap.getUiSettings();
            if (uiSettings != null) {
                uiSettings.setMyLocationButtonEnabled(true);
            }
            UiSettings uiSettings2 = googleMap.getUiSettings();
            if (uiSettings2 != null) {
                uiSettings2.setMapToolbarEnabled(true);
            }
            UiSettings uiSettings3 = googleMap.getUiSettings();
            if (uiSettings3 != null) {
                uiSettings3.setScrollGesturesEnabled(true);
            }
            UiSettings uiSettings4 = googleMap.getUiSettings();
            if (uiSettings4 != null) {
                uiSettings4.setZoomControlsEnabled(true);
            }
            if (getContext().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                googleMap.setMyLocationEnabled(true);
            }
            googleMap.setOnMapClickListener(this);
            googleMap.setOnMarkerClickListener(this);
            googleMap.setOnCameraIdleListener(this);
            googleMap.setOnMyLocationButtonClickListener(this);
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void configureMapLocation() {
        GoogleMap googleMap = this.map;
        if (googleMap == null || getContext().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            return;
        }
        googleMap.setMyLocationEnabled(true);
    }

    private final void configureObservers() {
        Q stationObserver = getViewModel().getStationObserver();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        stationObserver.e(HomeMapViewKt.getLifecycleOwner(context), new l(2, new a(this, 0)));
        Q stationsMarkersObserver = getViewModel().getStationsMarkersObserver();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        stationsMarkersObserver.e(HomeMapViewKt.getLifecycleOwner(context2), new l(2, new a(this, 1)));
        Q mapCameraObserver = getViewModel().getMapCameraObserver();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        mapCameraObserver.e(HomeMapViewKt.getLifecycleOwner(context3), new l(2, new a(this, 2)));
        Q userPermission = getViewModel().getUserPermission();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        userPermission.e(HomeMapViewKt.getLifecycleOwner(context4), new l(2, new a(this, 3)));
    }

    private final LatLngBounds getMapVisibleRegion() {
        Projection projection;
        VisibleRegion visibleRegion;
        GoogleMap googleMap = this.map;
        if (googleMap == null || (projection = googleMap.getProjection()) == null || (visibleRegion = projection.getVisibleRegion()) == null) {
            return null;
        }
        return visibleRegion.latLngBounds;
    }

    private final void initView(Context context) {
        View.inflate(context, R.layout.view_home_map, this);
        ViewHomeMapBinding bind = ViewHomeMapBinding.bind(this);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        configureObservers();
    }

    private final void moveCompass(View mapView, int left, int top, int right, int bottom, boolean horizontal, boolean vertical) {
        View findViewWithTag;
        if (mapView == null || (findViewWithTag = mapView.findViewWithTag(this.GOOGLEMAP_COMPASS)) == null) {
            return;
        }
        moveView(findViewWithTag, left, top, right, bottom, horizontal, vertical);
    }

    public final void moveMapCameraTo(LatLng latLng, Float zoom) {
        CameraPosition cameraPosition;
        if (this.isMovingCamera) {
            return;
        }
        GoogleMap googleMap = this.map;
        if (Intrinsics.areEqual((googleMap == null || (cameraPosition = googleMap.getCameraPosition()) == null) ? null : cameraPosition.target, latLng)) {
            return;
        }
        this.isMovingCamera = true;
        animateMapCamera(latLng, zoom);
    }

    public static /* synthetic */ void moveMapCameraTo$default(HomeMapView homeMapView, LatLng latLng, Float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = null;
        }
        homeMapView.moveMapCameraTo(latLng, f2);
    }

    private final void moveMyLocation(View mapView, int left, int top, int right, int bottom, boolean horizontal, boolean vertical) {
        View findViewWithTag;
        if (mapView == null || (findViewWithTag = mapView.findViewWithTag(this.GOOGLEMAP_MYLOCATION_BUTTON)) == null) {
            return;
        }
        moveView(findViewWithTag, left, top, right, bottom, horizontal, vertical);
    }

    private final void moveToolbar(View mapView, int left, int top, int right, int bottom, boolean horizontal, boolean vertical) {
        View findViewWithTag;
        if (mapView == null || (findViewWithTag = mapView.findViewWithTag(this.GOOGLEMAP_TOOLBAR)) == null) {
            return;
        }
        moveView(findViewWithTag, left, top, right, bottom, horizontal, vertical);
    }

    private final void moveView(View view, int left, int top, int right, int bottom, boolean horizontal, boolean vertical) {
        try {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (left >= 0) {
                layoutParams.addRule(20, -1);
                layoutParams.addRule(9, -1);
            }
            if (top >= 0) {
                layoutParams.addRule(10, -1);
            }
            if (right >= 0) {
                layoutParams.addRule(21, -1);
                layoutParams.addRule(11, -1);
            }
            if (bottom >= 0) {
                layoutParams.addRule(12, -1);
            }
            if (horizontal) {
                layoutParams.addRule(14, -1);
            }
            if (vertical) {
                layoutParams.addRule(15, -1);
            }
            layoutParams.setMargins(left, top, right, bottom);
            if (view == null) {
                return;
            }
            view.setLayoutParams(layoutParams);
        } catch (Exception e4) {
            m3.l.g(e4);
        }
    }

    private final void moveZoomControls(View mapView, int left, int top, int right, int bottom, boolean horizontal, boolean vertical) {
        View findViewWithTag;
        if (mapView == null || (findViewWithTag = mapView.findViewWithTag(this.GOOGLEMAP_ZOOMIN_BUTTON)) == null) {
            return;
        }
        Object parent = findViewWithTag.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        View view = (View) parent;
        if (view != null) {
            moveView(view, left, top, right, bottom, horizontal, vertical);
        }
    }

    public final Function1<StationViewEntity, Unit> getListener() {
        return this.listener;
    }

    public final HomeMapViewModel getViewModel() {
        HomeMapViewModel homeMapViewModel = this.viewModel;
        if (homeMapViewModel != null) {
            return homeMapViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void initMap(HomeFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.ownerFragment = fragment;
        K E3 = fragment.getChildFragmentManager().E(R.id.map);
        SupportMapFragment supportMapFragment = E3 instanceof SupportMapFragment ? (SupportMapFragment) E3 : null;
        if (supportMapFragment != null) {
            supportMapFragment.getMapAsync(this);
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
    public void onCameraIdle() {
        getViewModel().onMapCameraMoved(getMapVisibleRegion());
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMapClickListener
    public void onMapClick(LatLng r22) {
        Intrinsics.checkNotNullParameter(r22, "location");
        getViewModel().onMapPressed();
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public void onMapReady(GoogleMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
        configureMap();
        getViewModel().onMapReady();
        ViewHomeMapBinding viewHomeMapBinding = this.binding;
        ViewHomeMapBinding viewHomeMapBinding2 = null;
        if (viewHomeMapBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewHomeMapBinding = null;
        }
        moveMyLocation(viewHomeMapBinding.map, -1, 30, 30, -1, false, false);
        ViewHomeMapBinding viewHomeMapBinding3 = this.binding;
        if (viewHomeMapBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewHomeMapBinding3 = null;
        }
        moveToolbar(viewHomeMapBinding3.map, -1, 30, 180, -1, false, false);
        ViewHomeMapBinding viewHomeMapBinding4 = this.binding;
        if (viewHomeMapBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewHomeMapBinding2 = viewHomeMapBinding4;
        }
        moveZoomControls(viewHomeMapBinding2.map, -1, 180, 30, -1, false, false);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        getViewModel().onMarkerPressed(marker);
        LatLng position = marker.getPosition();
        moveMapCameraTo$default(this, LocationExtensionsKt.toLatLngTranslatedToSouth(new LatLng(position.latitude, position.longitude)), null, 2, null);
        return false;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener
    public boolean onMyLocationButtonClick() {
        getViewModel().fetchUserLocation();
        return true;
    }

    public final void setListener(Function1<? super StationViewEntity, Unit> function1) {
        this.listener = function1;
    }

    public final void setLocationAvailableAndCenterCamera(boolean isAvailable) {
        getViewModel().userLocationAvailable(isAvailable);
    }

    public final void setViewModel(HomeMapViewModel homeMapViewModel) {
        Intrinsics.checkNotNullParameter(homeMapViewModel, "<set-?>");
        this.viewModel = homeMapViewModel;
    }

    public final void updateSelectedStation(StationViewEntity station) {
        Intrinsics.checkNotNullParameter(station, "station");
        getViewModel().onStationSelected(station);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.GOOGLEMAP_COMPASS = "GoogleMapCompass";
        this.GOOGLEMAP_TOOLBAR = "GoogleMapToolbar";
        this.GOOGLEMAP_ZOOMIN_BUTTON = "GoogleMapZoomInButton";
        this.GOOGLEMAP_MYLOCATION_BUTTON = "GoogleMapMyLocationButton";
        initView(context);
    }

    public /* synthetic */ HomeMapView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.GOOGLEMAP_COMPASS = "GoogleMapCompass";
        this.GOOGLEMAP_TOOLBAR = "GoogleMapToolbar";
        this.GOOGLEMAP_ZOOMIN_BUTTON = "GoogleMapZoomInButton";
        this.GOOGLEMAP_MYLOCATION_BUTTON = "GoogleMapMyLocationButton";
        initView(context);
    }
}
