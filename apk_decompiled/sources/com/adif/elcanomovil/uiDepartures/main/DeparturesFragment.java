package com.adif.elcanomovil.uiDepartures.main;

import H2.o;
import a.AbstractC0106b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.K;
import androidx.fragment.app.P;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.y0;
import androidx.viewpager2.widget.ViewPager2;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.extensions.NavigationExtensionsKt;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.commonViews.StationOptionView;
import com.adif.elcanomovil.commonViews.extensions.LayoutTabKt;
import com.adif.elcanomovil.uiDepartures.R;
import com.adif.elcanomovil.uiDepartures.adapters.CirculationViewPagerAdapter;
import com.adif.elcanomovil.uiDepartures.databinding.FragmentDeparturesBinding;
import com.google.android.material.tabs.TabLayout;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C0435a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0015\u0010\u0003R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/DeparturesFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "Lcom/adif/elcanomovil/uiDepartures/databinding/FragmentDeparturesBinding;", "binding", "", "configureTabLayout", "(Lcom/adif/elcanomovil/uiDepartures/databinding/FragmentDeparturesBinding;)V", "configureViewObservers", "configureViewVisibility", "configureViewListeners", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onPause", "Lcom/adif/elcanomovil/uiDepartures/main/DeparturesViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/uiDepartures/main/DeparturesViewModel;", "viewModel", "Companion", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nDeparturesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeparturesFragment.kt\ncom/adif/elcanomovil/uiDepartures/main/DeparturesFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,164:1\n106#2,15:165\n*S KotlinDebug\n*F\n+ 1 DeparturesFragment.kt\ncom/adif/elcanomovil/uiDepartures/main/DeparturesFragment\n*L\n28#1:165,15\n*E\n"})
/* loaded from: classes2.dex */
public final class DeparturesFragment extends Hilt_DeparturesFragment {
    public static final String bottomSheetToCommercialTag = "key_selectStationSheetTag_commercial";
    public static final String bottomSheetToObservationsTag = "key_observationsSheetTag";
    public static final String bottomSheetToServicesTag = "key_selectStationSheetTag_services";

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public DeparturesFragment() {
        super(R.layout.fragment_departures);
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.uiDepartures.main.DeparturesFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.uiDepartures.main.DeparturesFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(DeparturesViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.uiDepartures.main.DeparturesFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.uiDepartures.main.DeparturesFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.uiDepartures.main.DeparturesFragment$special$$inlined$viewModels$default$5
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
    }

    private final void configureTabLayout(FragmentDeparturesBinding binding) {
        binding.pager.setAdapter(new CirculationViewPagerAdapter(this));
        new o(binding.tabLayout, binding.pager, new I2.k(this, 10)).a();
        binding.tabLayout.a(new H2.e() { // from class: com.adif.elcanomovil.uiDepartures.main.DeparturesFragment$configureTabLayout$2
            @Override // H2.d
            public void onTabReselected(H2.h tab) {
                DeparturesViewModel viewModel;
                if (tab != null) {
                    DeparturesFragment departuresFragment = DeparturesFragment.this;
                    LayoutTabKt.setTabTextStyle(tab, R.style.TabLayout_TextSelected);
                    viewModel = departuresFragment.getViewModel();
                    viewModel.handleTabSelected(tab.f705b);
                }
            }

            @Override // H2.d
            public void onTabSelected(H2.h tab) {
                DeparturesViewModel viewModel;
                if (tab != null) {
                    DeparturesFragment departuresFragment = DeparturesFragment.this;
                    LayoutTabKt.setTabTextStyle(tab, R.style.TabLayout_TextSelected);
                    viewModel = departuresFragment.getViewModel();
                    viewModel.handleTabSelected(tab.f705b);
                }
            }

            @Override // H2.d
            public void onTabUnselected(H2.h tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
                LayoutTabKt.setTabTextStyle(tab, R.style.TabLayout_Text);
            }
        });
        TabLayout tabLayout = binding.tabLayout;
        boolean z3 = false;
        tabLayout.k(tabLayout.g(0), true);
        ViewPager2 viewPager2 = binding.pager;
        Context context = getContext();
        if (context != null && AbstractC0106b.r(context)) {
            z3 = true;
        }
        viewPager2.setUserInputEnabled(!z3);
    }

    public static final void configureTabLayout$lambda$0(DeparturesFragment this$0, H2.h tab, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tab, "tab");
        String str = null;
        if (i == 0) {
            Context context = this$0.getContext();
            if (context != null) {
                str = context.getString(R.string.circulation_departures);
            }
        } else if (i != 1) {
            Context context2 = this$0.getContext();
            if (context2 != null) {
                str = context2.getString(R.string.circulation_between_stations);
            }
        } else {
            Context context3 = this$0.getContext();
            if (context3 != null) {
                str = context3.getString(R.string.circulation_arrivals);
            }
        }
        tab.a(str);
    }

    private final void configureViewListeners(FragmentDeparturesBinding binding) {
        StationOptionView stationOptionView = binding.stationInfo;
        if (stationOptionView != null) {
            stationOptionView.setVisibility(0);
        }
        StationOptionView stationOptionView2 = binding.stationComercial;
        if (stationOptionView2 == null) {
            return;
        }
        stationOptionView2.setVisibility(0);
    }

    private final void configureViewObservers(FragmentDeparturesBinding binding) {
        InterfaceC0266a showMuteSubscriptionSnackbar = getViewModel().getShowMuteSubscriptionSnackbar();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ((b1.f) showMuteSubscriptionSnackbar).a(viewLifecycleOwner, new a(this));
        InterfaceC0266a showNoStationsSnackbar = getViewModel().getShowNoStationsSnackbar();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        ((b1.f) showNoStationsSnackbar).a(viewLifecycleOwner2, new b(this));
        InterfaceC0266a navigation = getViewModel().getNavigation();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        ((b1.f) navigation).a(viewLifecycleOwner3, new NavigationHandler(this));
        InterfaceC0266a selectedTab = getViewModel().getSelectedTab();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        ((b1.f) selectedTab).a(viewLifecycleOwner4, new I1.b(binding, 8));
        NavigationExtensionsKt.onDestinationResult(NavigationExtensionsKt.findRootNavController(this), bottomSheetToServicesTag, this, new c(1, getViewModel(), DeparturesViewModel.class, "handleStationSelectedForServices", "handleStationSelectedForServices(I)V", 0, 0));
        NavigationExtensionsKt.onDestinationResult(NavigationExtensionsKt.findRootNavController(this), bottomSheetToCommercialTag, this, new c(1, getViewModel(), DeparturesViewModel.class, "handleStationSelectedForCommercial", "handleStationSelectedForCommercial(I)V", 0, 1));
    }

    private final void configureViewVisibility(FragmentDeparturesBinding binding) {
        StationOptionView stationOptionView = binding.stationInfo;
        if (stationOptionView != null) {
            stationOptionView.setListener(new d(this, 0));
        }
        StationOptionView stationOptionView2 = binding.stationComercial;
        if (stationOptionView2 == null) {
            return;
        }
        stationOptionView2.setListener(new d(this, 1));
    }

    public final DeparturesViewModel getViewModel() {
        return (DeparturesViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.K
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getViewModel().handleOnCreate();
    }

    @Override // androidx.fragment.app.K
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onPause() {
        super.onPause();
        P activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.setRequestedOrientation(1);
    }

    @Override // androidx.fragment.app.K
    public void onResume() {
        super.onResume();
        P activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.setRequestedOrientation(2);
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentDeparturesBinding bind = FragmentDeparturesBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        configureTabLayout(bind);
        configureViewObservers(bind);
        configureViewListeners(bind);
        configureViewVisibility(bind);
    }
}
