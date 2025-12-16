package com.adif.elcanomovil.uiHome;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C0146f0;
import androidx.fragment.app.K;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.q0;
import androidx.lifecycle.y0;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.extensions.NavigationExtensionsKt;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.uiHome.HomeFragmentBottomSheetViewState;
import com.adif.elcanomovil.uiHome.HomeFragmentViewAction;
import com.adif.elcanomovil.uiHome.databinding.FragmentHomeBinding;
import com.adif.elcanomovil.uiHome.views.StationNearView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import d.AbstractC0294c;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import l0.C0435a;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J+\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b&\u0010'J!\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b*\u0010+R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u000209088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R \u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lcom/adif/elcanomovil/uiHome/HomeFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "", "shouldShowFavorites", "()Z", "", "observeViewModel", "Lcom/adif/elcanomovil/uiHome/HomeFragmentViewState;", "viewState", "onViewStateUpdated", "(Lcom/adif/elcanomovil/uiHome/HomeFragmentViewState;)V", "Lcom/adif/elcanomovil/uiHome/MapViewState;", "mapViewState", "onUpdateMapView", "(Lcom/adif/elcanomovil/uiHome/MapViewState;)V", "Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "onUpdateBottomSheet", "(Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState;)V", "Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState$NearestStationShown;", "showNearestStationBottomSheet", "(Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState$NearestStationShown;)V", "Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState$StationSelected;", "showSelectedStationBottomSheet", "(Lcom/adif/elcanomovil/uiHome/HomeFragmentBottomSheetViewState$StationSelected;)V", "showFullyExpandedBottomSheet", "showPartiallyExpandedBottomSheet", "configureListeners", "checkAndAskUserPermission", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/adif/elcanomovil/uiHome/HomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/uiHome/HomeViewModel;", "viewModel", "Lcom/adif/elcanomovil/uiHome/databinding/FragmentHomeBinding;", "binding", "Lcom/adif/elcanomovil/uiHome/databinding/FragmentHomeBinding;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationHandler;", "navigationHandler", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationHandler;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Ld/c;", "", "", "requestPermission", "Ld/c;", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragment.kt\ncom/adif/elcanomovil/uiHome/HomeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,223:1\n106#2,15:224\n1#3:239\n1726#4,3:240\n*S KotlinDebug\n*F\n+ 1 HomeFragment.kt\ncom/adif/elcanomovil/uiHome/HomeFragment\n*L\n38#1:224,15\n208#1:240,3\n*E\n"})
/* loaded from: classes2.dex */
public final class HomeFragment extends Hilt_HomeFragment {
    private FragmentHomeBinding binding;
    private BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior;
    private final NavigationHandler navigationHandler;
    private final AbstractC0294c requestPermission;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public HomeFragment() {
        super(R.layout.fragment_home);
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.uiHome.HomeFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.uiHome.HomeFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(HomeViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.uiHome.HomeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.uiHome.HomeFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.uiHome.HomeFragment$special$$inlined$viewModels$default$5
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
        this.navigationHandler = new NavigationHandler(this);
        AbstractC0294c registerForActivityResult = registerForActivityResult(new C0146f0(1), new I2.k(this, 12));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.requestPermission = registerForActivityResult;
    }

    public final void checkAndAskUserPermission() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (m3.l.h(context, "android.permission.ACCESS_COARSE_LOCATION", Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null, Binder.getCallingPid(), Binder.getCallingUid()) != 0) {
            this.requestPermission.a(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"});
        } else {
            getViewModel().onAction(HomeFragmentViewAction.LocationPermissionGranted.INSTANCE);
        }
    }

    private final void configureListeners() {
        FragmentHomeBinding fragmentHomeBinding = this.binding;
        BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = null;
        if (fragmentHomeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding = null;
        }
        fragmentHomeBinding.layoutHomeMap.setListener(new C0286a(this));
        FragmentHomeBinding fragmentHomeBinding2 = this.binding;
        if (fragmentHomeBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding2 = null;
        }
        fragmentHomeBinding2.layoutHomeDetail.layoutUserStations.setListener(new C0287b(this));
        FragmentHomeBinding fragmentHomeBinding3 = this.binding;
        if (fragmentHomeBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding3 = null;
        }
        fragmentHomeBinding3.layoutHomeDetail.layoutUserStations.setListenerUserStationsEdit(new C0288c(this));
        FragmentHomeBinding fragmentHomeBinding4 = this.binding;
        if (fragmentHomeBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding4 = null;
        }
        fragmentHomeBinding4.layoutHomeDetail.layoutNearStation.setListener(new C0289d(this));
        FragmentHomeBinding fragmentHomeBinding5 = this.binding;
        if (fragmentHomeBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding5 = null;
        }
        fragmentHomeBinding5.layoutHomeDetail.layoutUserFavorites.setListener(new C0290e(this));
        FragmentHomeBinding fragmentHomeBinding6 = this.binding;
        if (fragmentHomeBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding6 = null;
        }
        fragmentHomeBinding6.frameFakeTabInclude.buttonSheet.setOnClickListener(new D1.a(this, 12));
        BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (bottomSheetBehavior2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
        } else {
            bottomSheetBehavior = bottomSheetBehavior2;
        }
        o2.a aVar = new o2.a() { // from class: com.adif.elcanomovil.uiHome.HomeFragment$configureListeners$7
            @Override // o2.a
            public void onSlide(View v3, float slideOffset) {
                Intrinsics.checkNotNullParameter(v3, "v");
            }

            @Override // o2.a
            public void onStateChanged(View bottomSheet, int newState) {
                FragmentHomeBinding fragmentHomeBinding7;
                HomeViewModel viewModel;
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                if (newState == 5) {
                    viewModel = HomeFragment.this.getViewModel();
                    viewModel.onAction(HomeFragmentViewAction.BottomSheetHidden.INSTANCE);
                    return;
                }
                fragmentHomeBinding7 = HomeFragment.this.binding;
                if (fragmentHomeBinding7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentHomeBinding7 = null;
                }
                fragmentHomeBinding7.frameFakeTab.setVisibility(8);
            }
        };
        ArrayList arrayList = bottomSheetBehavior.f5558W;
        if (arrayList.contains(aVar)) {
            return;
        }
        arrayList.add(aVar);
    }

    public static final void configureListeners$lambda$3(HomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onAction(HomeFragmentViewAction.OpenBottomSheet.INSTANCE);
    }

    public static /* synthetic */ void g(HomeFragment homeFragment, Map map) {
        requestPermission$lambda$5(homeFragment, map);
    }

    public final HomeViewModel getViewModel() {
        return (HomeViewModel) this.viewModel.getValue();
    }

    private final void observeViewModel() {
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        androidx.lifecycle.E h = q0.h(viewLifecycleOwner);
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        BuildersKt__Builders_commonKt.launch$default(h, null, coroutineStart, new h(this, null), 1, null);
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(q0.h(viewLifecycleOwner2), null, coroutineStart, new j(this, null), 1, null);
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(q0.h(viewLifecycleOwner3), null, coroutineStart, new l(this, null), 1, null);
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(q0.h(viewLifecycleOwner4), null, coroutineStart, new n(this, null), 1, null);
    }

    private final void onUpdateBottomSheet(HomeFragmentBottomSheetViewState r22) {
        if (r22 instanceof HomeFragmentBottomSheetViewState.NearestStationShown) {
            showNearestStationBottomSheet((HomeFragmentBottomSheetViewState.NearestStationShown) r22);
            return;
        }
        if (r22 instanceof HomeFragmentBottomSheetViewState.StationSelected) {
            showSelectedStationBottomSheet((HomeFragmentBottomSheetViewState.StationSelected) r22);
            return;
        }
        if (r22 instanceof HomeFragmentBottomSheetViewState.Hidden) {
            FragmentHomeBinding fragmentHomeBinding = this.binding;
            if (fragmentHomeBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentHomeBinding = null;
            }
            fragmentHomeBinding.frameFakeTab.setVisibility(0);
        }
    }

    private final void onUpdateMapView(MapViewState mapViewState) {
        StationViewEntity highlightedStation = mapViewState.getHighlightedStation();
        if (highlightedStation != null) {
            FragmentHomeBinding fragmentHomeBinding = this.binding;
            if (fragmentHomeBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentHomeBinding = null;
            }
            fragmentHomeBinding.layoutHomeMap.updateSelectedStation(highlightedStation);
        }
    }

    public final void onViewStateUpdated(HomeFragmentViewState viewState) {
        if (viewState != null) {
            onUpdateMapView(viewState.getMapViewState());
            onUpdateBottomSheet(viewState.getBottomSheetViewState());
        }
    }

    public static final void requestPermission$lambda$5(HomeFragment this$0, Map result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        Collection values = result.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    return;
                }
            }
        }
        this$0.getViewModel().onAction(HomeFragmentViewAction.LocationPermissionGranted.INSTANCE);
    }

    private final boolean shouldShowFavorites() {
        Bundle arguments = getArguments();
        boolean z3 = arguments != null ? arguments.getBoolean(NavArguments.ARG_FOCUS_FAVOURITES) : false;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.clear();
        }
        return z3;
    }

    private final void showFullyExpandedBottomSheet() {
        BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this.bottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.H(3);
    }

    private final void showNearestStationBottomSheet(HomeFragmentBottomSheetViewState.NearestStationShown r7) {
        if (r7.getFullyExpanded()) {
            showFullyExpandedBottomSheet();
        } else {
            showPartiallyExpandedBottomSheet();
        }
        BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this.bottomSheetBehavior;
        FragmentHomeBinding fragmentHomeBinding = null;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.f5546K = true;
        FragmentHomeBinding fragmentHomeBinding2 = this.binding;
        if (fragmentHomeBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding2 = null;
        }
        fragmentHomeBinding2.layoutHomeDetail.sliderImageController.setVisibility(0);
        FragmentHomeBinding fragmentHomeBinding3 = this.binding;
        if (fragmentHomeBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding3 = null;
        }
        fragmentHomeBinding3.layoutHomeDetail.layoutUserStations.setVisibility(0);
        FragmentHomeBinding fragmentHomeBinding4 = this.binding;
        if (fragmentHomeBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding4 = null;
        }
        fragmentHomeBinding4.layoutHomeDetail.layoutUserStations.setHomeStation(r7.getHomeStation());
        FragmentHomeBinding fragmentHomeBinding5 = this.binding;
        if (fragmentHomeBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding5 = null;
        }
        fragmentHomeBinding5.layoutHomeDetail.layoutUserStations.setWorkStation(r7.getWorkStation());
        FragmentHomeBinding fragmentHomeBinding6 = this.binding;
        if (fragmentHomeBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding6 = null;
        }
        StationNearView stationNearView = fragmentHomeBinding6.layoutHomeDetail.layoutNearStation;
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        stationNearView.update(r7, q0.h(viewLifecycleOwner));
        if (r7.getFavoriteEntries().isEmpty()) {
            FragmentHomeBinding fragmentHomeBinding7 = this.binding;
            if (fragmentHomeBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentHomeBinding7 = null;
            }
            fragmentHomeBinding7.layoutHomeDetail.layoutUserFavorites.removeAllFavorites();
        } else {
            FragmentHomeBinding fragmentHomeBinding8 = this.binding;
            if (fragmentHomeBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentHomeBinding8 = null;
            }
            fragmentHomeBinding8.layoutHomeDetail.layoutUserFavorites.addFavorites(r7.getFavoriteEntries());
        }
        FragmentHomeBinding fragmentHomeBinding9 = this.binding;
        if (fragmentHomeBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentHomeBinding = fragmentHomeBinding9;
        }
        fragmentHomeBinding.layoutHomeDetail.layoutUserFavorites.setVisibility(0);
    }

    private final void showPartiallyExpandedBottomSheet() {
        BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this.bottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.H(4);
    }

    private final void showSelectedStationBottomSheet(HomeFragmentBottomSheetViewState.StationSelected r7) {
        FragmentHomeBinding fragmentHomeBinding = this.binding;
        BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = null;
        if (fragmentHomeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding = null;
        }
        fragmentHomeBinding.layoutHomeDetail.sliderImageController.setVisibility(8);
        FragmentHomeBinding fragmentHomeBinding2 = this.binding;
        if (fragmentHomeBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding2 = null;
        }
        StationNearView stationNearView = fragmentHomeBinding2.layoutHomeDetail.layoutNearStation;
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        stationNearView.update(r7, q0.h(viewLifecycleOwner));
        FragmentHomeBinding fragmentHomeBinding3 = this.binding;
        if (fragmentHomeBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding3 = null;
        }
        fragmentHomeBinding3.layoutHomeDetail.layoutUserStations.setVisibility(8);
        FragmentHomeBinding fragmentHomeBinding4 = this.binding;
        if (fragmentHomeBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding4 = null;
        }
        fragmentHomeBinding4.layoutHomeDetail.layoutUserFavorites.setVisibility(8);
        BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (bottomSheetBehavior2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
        } else {
            bottomSheetBehavior = bottomSheetBehavior2;
        }
        bottomSheetBehavior.f5546K = false;
        showFullyExpandedBottomSheet();
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentHomeBinding fragmentHomeBinding = this.binding;
        FragmentHomeBinding fragmentHomeBinding2 = null;
        if (fragmentHomeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding = null;
        }
        BottomSheetBehavior<ConstraintLayout> A3 = BottomSheetBehavior.A(fragmentHomeBinding.layoutHomeDetail.getRoot());
        Intrinsics.checkNotNullExpressionValue(A3, "from(...)");
        this.bottomSheetBehavior = A3;
        FragmentHomeBinding fragmentHomeBinding3 = this.binding;
        if (fragmentHomeBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding3 = null;
        }
        fragmentHomeBinding3.layoutHomeDetail.layoutStationOffers.getRoot().setVisibility(8);
        FragmentHomeBinding fragmentHomeBinding4 = this.binding;
        if (fragmentHomeBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding4 = null;
        }
        fragmentHomeBinding4.layoutHomeDetail.getRoot().setVisibility(0);
        FragmentHomeBinding fragmentHomeBinding5 = this.binding;
        if (fragmentHomeBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentHomeBinding2 = fragmentHomeBinding5;
        }
        fragmentHomeBinding2.layoutHomeMap.initMap(this);
        configureListeners();
        observeViewModel();
        getViewModel().onViewCreated(shouldShowFavorites());
        NavigationExtensionsKt.onDestinationResult(NavigationExtensionsKt.findRootNavController(this), NavArguments.StationSelectionType.HOME_STATION.toString(), this, new o(this));
        NavigationExtensionsKt.onDestinationResult(NavigationExtensionsKt.findRootNavController(this), NavArguments.StationSelectionType.WORK_STATION.toString(), this, new p(this));
    }

    @Override // androidx.fragment.app.K
    public CoordinatorLayout onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentHomeBinding inflate = FragmentHomeBinding.inflate(inflater);
        Intrinsics.checkNotNull(inflate);
        this.binding = inflate;
        CoordinatorLayout root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
