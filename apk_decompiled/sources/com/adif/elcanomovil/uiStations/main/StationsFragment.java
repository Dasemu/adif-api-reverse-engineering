package com.adif.elcanomovil.uiStations.main;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.K;
import androidx.lifecycle.C0;
import androidx.lifecycle.C0191l;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.y0;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.extensions.NavigationExtensionsKt;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.commonViews.extensions.LayoutTabKt;
import com.adif.elcanomovil.uiStations.R;
import com.adif.elcanomovil.uiStations.adapters.StationsViewPagerAdapter;
import com.adif.elcanomovil.uiStations.databinding.FragmentStationsBinding;
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

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/adif/elcanomovil/uiStations/main/StationsFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "Lcom/adif/elcanomovil/uiStations/databinding/FragmentStationsBinding;", "binding", "", "configureTabLayout", "(Lcom/adif/elcanomovil/uiStations/databinding/FragmentStationsBinding;)V", "configureViewObservers", "configureViewListeners", "", "station", "handleSelectedStation", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/adif/elcanomovil/uiStations/main/StationsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/uiStations/main/StationsViewModel;", "viewModel", "Lcom/adif/elcanomovil/uiStations/adapters/StationsViewPagerAdapter;", "adapter", "Lcom/adif/elcanomovil/uiStations/adapters/StationsViewPagerAdapter;", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nStationsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StationsFragment.kt\ncom/adif/elcanomovil/uiStations/main/StationsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,115:1\n106#2,15:116\n*S KotlinDebug\n*F\n+ 1 StationsFragment.kt\ncom/adif/elcanomovil/uiStations/main/StationsFragment\n*L\n23#1:116,15\n*E\n"})
/* loaded from: classes2.dex */
public final class StationsFragment extends Hilt_StationsFragment {
    private StationsViewPagerAdapter adapter;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public StationsFragment() {
        super(R.layout.fragment_stations);
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.uiStations.main.StationsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.uiStations.main.StationsFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(StationsViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.uiStations.main.StationsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.uiStations.main.StationsFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.uiStations.main.StationsFragment$special$$inlined$viewModels$default$5
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

    private final void configureTabLayout(FragmentStationsBinding binding) {
        StationsViewPagerAdapter stationsViewPagerAdapter = new StationsViewPagerAdapter(this);
        this.adapter = stationsViewPagerAdapter;
        binding.pager.setAdapter(stationsViewPagerAdapter);
        new H2.o(binding.tabLayout, binding.pager, new I2.k(this, 13)).a();
        binding.tabLayout.a(new H2.e() { // from class: com.adif.elcanomovil.uiStations.main.StationsFragment$configureTabLayout$2
            @Override // H2.d
            public void onTabReselected(H2.h tab) {
                StationsViewModel viewModel;
                if (tab != null) {
                    StationsFragment stationsFragment = StationsFragment.this;
                    LayoutTabKt.setTabTextStyle(tab, R.style.TabLayout_TextSelected);
                    viewModel = stationsFragment.getViewModel();
                    viewModel.handleTabSelected(tab.f705b);
                }
            }

            @Override // H2.d
            public void onTabSelected(H2.h tab) {
                StationsViewModel viewModel;
                if (tab != null) {
                    StationsFragment stationsFragment = StationsFragment.this;
                    LayoutTabKt.setTabTextStyle(tab, R.style.TabLayout_TextSelected);
                    viewModel = stationsFragment.getViewModel();
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
        tabLayout.k(tabLayout.g(0), true);
    }

    public static final void configureTabLayout$lambda$0(StationsFragment this$0, H2.h tab, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tab, "tab");
        tab.a(i != 0 ? i != 1 ? this$0.getString(R.string.activities) : this$0.getString(R.string.commercial) : this$0.getString(R.string.services));
    }

    private final void configureViewListeners(FragmentStationsBinding binding) {
        binding.stationsStationName.setOnClickListener(new D1.a(this, 16));
    }

    public static final void configureViewListeners$lambda$2(StationsFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().handleSearchStationTap();
    }

    private final void configureViewObservers(FragmentStationsBinding binding) {
        getViewModel().getViewData().e(getViewLifecycleOwner(), new C0191l(new a(binding, this)));
        InterfaceC0266a navigation = getViewModel().getNavigation();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ((b1.f) navigation).a(viewLifecycleOwner, new NavigationHandler(this));
        InterfaceC0266a selectedTab = getViewModel().getSelectedTab();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        ((b1.f) selectedTab).a(viewLifecycleOwner2, new I1.b(binding, 13));
        NavigationExtensionsKt.onDestinationResult(NavigationExtensionsKt.findRootNavController(this), NavArguments.StationSelectionType.STATION.toString(), this, new com.adif.elcanomovil.uiDepartures.main.c(1, this, StationsFragment.class, "handleSelectedStation", "handleSelectedStation(Ljava/lang/String;)V", 0, 11));
    }

    public final StationsViewModel getViewModel() {
        return (StationsViewModel) this.viewModel.getValue();
    }

    public final void handleSelectedStation(String station) {
        getViewModel().handleSelectedStation(station);
    }

    @Override // androidx.fragment.app.K
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getViewModel().handleOnCreate();
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentStationsBinding bind = FragmentStationsBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        configureTabLayout(bind);
        configureViewObservers(bind);
        configureViewListeners(bind);
    }
}
