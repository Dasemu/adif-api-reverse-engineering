package com.adif.elcanomovil.uiSelectStation.main;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.K;
import androidx.lifecycle.C;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.q0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.AbstractC0232n0;
import androidx.recyclerview.widget.E0;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.extensions.NavigationExtensionsKt;
import com.adif.elcanomovil.commonViews.UserStationsView;
import com.adif.elcanomovil.commonViews.data.StationOptionViewEntity;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.uiSelectStation.R;
import com.adif.elcanomovil.uiSelectStation.databinding.FragmentSelectStationBinding;
import com.adif.elcanomovil.uiSelectStation.main.SelectStationViewState;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.textfield.TextInputEditText;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import l0.C0435a;
import o0.C0531h;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R3\u0010\u0014\u001a!\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000403j\u0002`68\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010:¨\u0006="}, d2 = {"Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "", "configureViews", "Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationViewState$MainSearch;", "mainSearch", "showMainSearch", "(Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationViewState$MainSearch;)V", "", "Lcom/adif/elcanomovil/domain/entities/station/Station;", "stations", "showSearchResults", "(Ljava/util/List;)V", "showNoResults", "configureObservers", "configureViewListeners", "", "station", "onTapStation", "(Ljava/lang/String;)V", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "homeStation", "workStation", "updateUserStationsViews", "(Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;)V", "Lcom/adif/elcanomovil/commonViews/data/StationOptionViewEntity;", "updateUserNearStationViews", "(Lcom/adif/elcanomovil/commonViews/data/StationOptionViewEntity;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/adif/elcanomovil/uiSelectStation/databinding/FragmentSelectStationBinding;", "binding", "Lcom/adif/elcanomovil/uiSelectStation/databinding/FragmentSelectStationBinding;", "Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationFragmentArgs;", "args$delegate", "Lo0/h;", "getArgs", "()Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationFragmentArgs;", "args", "Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationViewModel;", "viewModel", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lcom/adif/elcanomovil/uiSelectStation/main/OnStationSelected;", "Lkotlin/jvm/functions/Function1;", "Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationAdapter;", "searchResultsAdapter", "Lcom/adif/elcanomovil/uiSelectStation/main/SelectStationAdapter;", "recentSearchesAdapter", "Companion", "ui-select-station_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nSelectStationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectStationFragment.kt\ncom/adif/elcanomovil/uiSelectStation/main/SelectStationFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,177:1\n42#2,3:178\n106#3,15:181\n*S KotlinDebug\n*F\n+ 1 SelectStationFragment.kt\ncom/adif/elcanomovil/uiSelectStation/main/SelectStationFragment\n*L\n32#1:178,3\n34#1:181,15\n*E\n"})
/* loaded from: classes2.dex */
public final class SelectStationFragment extends Hilt_SelectStationFragment {
    private static final long DEBOUNCE_TIME = 1000;
    private static final int DIVIDER_HEIGHT = 16;

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final C0531h args;
    private FragmentSelectStationBinding binding;
    private final Function1<Station, Unit> onTapStation;
    private SelectStationAdapter recentSearchesAdapter;
    private SelectStationAdapter searchResultsAdapter;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public SelectStationFragment() {
        super(R.layout.fragment_select_station);
        this.args = new C0531h(Reflection.getOrCreateKotlinClass(SelectStationFragmentArgs.class), new Function0<Bundle>() { // from class: com.adif.elcanomovil.uiSelectStation.main.SelectStationFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Bundle invoke() {
                Bundle arguments = K.this.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + K.this + " has null arguments");
            }
        });
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.uiSelectStation.main.SelectStationFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.uiSelectStation.main.SelectStationFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(SelectStationViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.uiSelectStation.main.SelectStationFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.uiSelectStation.main.SelectStationFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.uiSelectStation.main.SelectStationFragment$special$$inlined$viewModels$default$5
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
        this.onTapStation = new f(this, 2);
    }

    private final void configureObservers() {
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(q0.h(viewLifecycleOwner), null, null, new d(this, null), 3, null);
    }

    private final void configureViewListeners() {
        FragmentSelectStationBinding fragmentSelectStationBinding = this.binding;
        FragmentSelectStationBinding fragmentSelectStationBinding2 = null;
        if (fragmentSelectStationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding = null;
        }
        fragmentSelectStationBinding.btnBack.setOnClickListener(new D1.a(this, 14));
        FragmentSelectStationBinding fragmentSelectStationBinding3 = this.binding;
        if (fragmentSelectStationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding3 = null;
        }
        RecyclerView recyclerView = fragmentSelectStationBinding3.layoutSearchResultsView;
        SelectStationAdapter selectStationAdapter = this.searchResultsAdapter;
        if (selectStationAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchResultsAdapter");
            selectStationAdapter = null;
        }
        recyclerView.setAdapter(selectStationAdapter);
        FragmentSelectStationBinding fragmentSelectStationBinding4 = this.binding;
        if (fragmentSelectStationBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding4 = null;
        }
        RecyclerView recyclerView2 = fragmentSelectStationBinding4.layoutRecentSearchesView;
        SelectStationAdapter selectStationAdapter2 = this.recentSearchesAdapter;
        if (selectStationAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentSearchesAdapter");
            selectStationAdapter2 = null;
        }
        recyclerView2.setAdapter(selectStationAdapter2);
        FragmentSelectStationBinding fragmentSelectStationBinding5 = this.binding;
        if (fragmentSelectStationBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding5 = null;
        }
        TextInputEditText searchBox = fragmentSelectStationBinding5.searchBox;
        Intrinsics.checkNotNullExpressionValue(searchBox, "searchBox");
        Flow distinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.debounce(TextFlowKt.getTextFlow(searchBox), 1000L));
        C lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        BuildersKt__Builders_commonKt.launch$default(q0.g(lifecycle), null, null, new e(distinctUntilChanged, this, null), 3, null);
        FragmentSelectStationBinding fragmentSelectStationBinding6 = this.binding;
        if (fragmentSelectStationBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding6 = null;
        }
        fragmentSelectStationBinding6.layoutUserStationsView.setListener(new f(this, 0));
        FragmentSelectStationBinding fragmentSelectStationBinding7 = this.binding;
        if (fragmentSelectStationBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentSelectStationBinding2 = fragmentSelectStationBinding7;
        }
        fragmentSelectStationBinding2.layoutNearStationView.setListener(new f(this, 1));
    }

    public static final void configureViewListeners$lambda$0(SelectStationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onTapStation(null);
    }

    private final void configureViews() {
        FragmentSelectStationBinding fragmentSelectStationBinding = this.binding;
        FragmentSelectStationBinding fragmentSelectStationBinding2 = null;
        if (fragmentSelectStationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding = null;
        }
        fragmentSelectStationBinding.inputLayout.setHintAnimationEnabled(false);
        this.searchResultsAdapter = new SelectStationAdapter(this.onTapStation);
        this.recentSearchesAdapter = new SelectStationAdapter(this.onTapStation);
        FragmentSelectStationBinding fragmentSelectStationBinding3 = this.binding;
        if (fragmentSelectStationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentSelectStationBinding2 = fragmentSelectStationBinding3;
        }
        fragmentSelectStationBinding2.layoutSearchResultsView.i(new AbstractC0232n0() { // from class: com.adif.elcanomovil.uiSelectStation.main.SelectStationFragment$configureViews$1
            @Override // androidx.recyclerview.widget.AbstractC0232n0
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, E0 state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.getItemOffsets(outRect, view, parent, state);
                outRect.bottom = 16;
            }
        });
    }

    private final SelectStationFragmentArgs getArgs() {
        return (SelectStationFragmentArgs) this.args.getValue();
    }

    public final SelectStationViewModel getViewModel() {
        return (SelectStationViewModel) this.viewModel.getValue();
    }

    public final void onTapStation(String station) {
        Object systemService = requireContext().getSystemService("input_method");
        FragmentSelectStationBinding fragmentSelectStationBinding = null;
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            FragmentSelectStationBinding fragmentSelectStationBinding2 = this.binding;
            if (fragmentSelectStationBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentSelectStationBinding = fragmentSelectStationBinding2;
            }
            inputMethodManager.hideSoftInputFromWindow(fragmentSelectStationBinding.getRoot().getWindowToken(), 0);
        }
        getViewModel().saveStation(station);
        NavigationExtensionsKt.popBackStackWithResult(m3.l.n(this), getArgs().getKey(), station);
    }

    public final void showMainSearch(SelectStationViewState.MainSearch mainSearch) {
        FragmentSelectStationBinding fragmentSelectStationBinding = this.binding;
        SelectStationAdapter selectStationAdapter = null;
        if (fragmentSelectStationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding = null;
        }
        fragmentSelectStationBinding.layoutSearchsEmpty.getRoot().setVisibility(8);
        FragmentSelectStationBinding fragmentSelectStationBinding2 = this.binding;
        if (fragmentSelectStationBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding2 = null;
        }
        fragmentSelectStationBinding2.layoutSuggestedStation.setVisibility(0);
        FragmentSelectStationBinding fragmentSelectStationBinding3 = this.binding;
        if (fragmentSelectStationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding3 = null;
        }
        fragmentSelectStationBinding3.layoutSearchResultsTitle.setText(getString(R.string.search_stations_recent_title));
        FragmentSelectStationBinding fragmentSelectStationBinding4 = this.binding;
        if (fragmentSelectStationBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding4 = null;
        }
        fragmentSelectStationBinding4.layoutSearchResultsView.setVisibility(8);
        FragmentSelectStationBinding fragmentSelectStationBinding5 = this.binding;
        if (fragmentSelectStationBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding5 = null;
        }
        fragmentSelectStationBinding5.layoutRecentSearchesView.setVisibility(0);
        SelectStationAdapter selectStationAdapter2 = this.searchResultsAdapter;
        if (selectStationAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchResultsAdapter");
            selectStationAdapter2 = null;
        }
        selectStationAdapter2.submitList(CollectionsKt.emptyList());
        SelectStationAdapter selectStationAdapter3 = this.recentSearchesAdapter;
        if (selectStationAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentSearchesAdapter");
        } else {
            selectStationAdapter = selectStationAdapter3;
        }
        selectStationAdapter.submitList(mainSearch.getLastSearches());
        updateUserStationsViews(mainSearch.getHomeStation(), mainSearch.getWorkStation());
        updateUserNearStationViews(mainSearch.getUserNearStation());
    }

    public final void showNoResults() {
        FragmentSelectStationBinding fragmentSelectStationBinding = this.binding;
        FragmentSelectStationBinding fragmentSelectStationBinding2 = null;
        if (fragmentSelectStationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding = null;
        }
        fragmentSelectStationBinding.layoutSearchsEmpty.getRoot().setVisibility(0);
        FragmentSelectStationBinding fragmentSelectStationBinding3 = this.binding;
        if (fragmentSelectStationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding3 = null;
        }
        fragmentSelectStationBinding3.layoutSuggestedStation.setVisibility(8);
        FragmentSelectStationBinding fragmentSelectStationBinding4 = this.binding;
        if (fragmentSelectStationBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding4 = null;
        }
        fragmentSelectStationBinding4.layoutUserStationsView.setVisibility(8);
        FragmentSelectStationBinding fragmentSelectStationBinding5 = this.binding;
        if (fragmentSelectStationBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding5 = null;
        }
        fragmentSelectStationBinding5.layoutSearchResultsTitle.setText("");
        FragmentSelectStationBinding fragmentSelectStationBinding6 = this.binding;
        if (fragmentSelectStationBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding6 = null;
        }
        fragmentSelectStationBinding6.layoutSearchResultsView.setVisibility(8);
        FragmentSelectStationBinding fragmentSelectStationBinding7 = this.binding;
        if (fragmentSelectStationBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding7 = null;
        }
        fragmentSelectStationBinding7.layoutRecentSearchesView.setVisibility(8);
        FragmentSelectStationBinding fragmentSelectStationBinding8 = this.binding;
        if (fragmentSelectStationBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding8 = null;
        }
        fragmentSelectStationBinding8.layoutSearchsEmpty.title.setText(getText(R.string.select_station_no_results_title_));
        FragmentSelectStationBinding fragmentSelectStationBinding9 = this.binding;
        if (fragmentSelectStationBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding9 = null;
        }
        fragmentSelectStationBinding9.layoutSearchsEmpty.message.setText(getText(R.string.select_station_no_results_subtitle_));
        FragmentSelectStationBinding fragmentSelectStationBinding10 = this.binding;
        if (fragmentSelectStationBinding10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentSelectStationBinding2 = fragmentSelectStationBinding10;
        }
        fragmentSelectStationBinding2.layoutSearchsEmpty.iconNoResults.setImageResource(R.drawable.ic_result_empty);
    }

    public final void showSearchResults(List<Station> stations) {
        FragmentSelectStationBinding fragmentSelectStationBinding = this.binding;
        SelectStationAdapter selectStationAdapter = null;
        if (fragmentSelectStationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding = null;
        }
        fragmentSelectStationBinding.layoutSearchsEmpty.getRoot().setVisibility(8);
        FragmentSelectStationBinding fragmentSelectStationBinding2 = this.binding;
        if (fragmentSelectStationBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding2 = null;
        }
        fragmentSelectStationBinding2.layoutSuggestedStation.setVisibility(8);
        FragmentSelectStationBinding fragmentSelectStationBinding3 = this.binding;
        if (fragmentSelectStationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding3 = null;
        }
        fragmentSelectStationBinding3.layoutUserStationsView.setVisibility(8);
        FragmentSelectStationBinding fragmentSelectStationBinding4 = this.binding;
        if (fragmentSelectStationBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding4 = null;
        }
        fragmentSelectStationBinding4.layoutSearchResultsTitle.setText(getString(R.string.search_stations_title));
        FragmentSelectStationBinding fragmentSelectStationBinding5 = this.binding;
        if (fragmentSelectStationBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding5 = null;
        }
        fragmentSelectStationBinding5.layoutNearStation.setVisibility(8);
        FragmentSelectStationBinding fragmentSelectStationBinding6 = this.binding;
        if (fragmentSelectStationBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding6 = null;
        }
        fragmentSelectStationBinding6.layoutSearchResultsView.setVisibility(0);
        FragmentSelectStationBinding fragmentSelectStationBinding7 = this.binding;
        if (fragmentSelectStationBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding7 = null;
        }
        fragmentSelectStationBinding7.layoutRecentSearchesView.setVisibility(8);
        SelectStationAdapter selectStationAdapter2 = this.searchResultsAdapter;
        if (selectStationAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchResultsAdapter");
        } else {
            selectStationAdapter = selectStationAdapter2;
        }
        selectStationAdapter.submitList(stations);
    }

    private final void updateUserNearStationViews(StationOptionViewEntity station) {
        Unit unit;
        FragmentSelectStationBinding fragmentSelectStationBinding = null;
        if (station != null) {
            FragmentSelectStationBinding fragmentSelectStationBinding2 = this.binding;
            if (fragmentSelectStationBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentSelectStationBinding2 = null;
            }
            fragmentSelectStationBinding2.layoutNearStation.setVisibility(0);
            FragmentSelectStationBinding fragmentSelectStationBinding3 = this.binding;
            if (fragmentSelectStationBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentSelectStationBinding3 = null;
            }
            fragmentSelectStationBinding3.layoutNearStationView.updateData(station);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            FragmentSelectStationBinding fragmentSelectStationBinding4 = this.binding;
            if (fragmentSelectStationBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentSelectStationBinding = fragmentSelectStationBinding4;
            }
            fragmentSelectStationBinding.layoutNearStation.setVisibility(8);
        }
    }

    private final void updateUserStationsViews(StationViewEntity homeStation, StationViewEntity workStation) {
        Unit unit;
        Unit unit2;
        int i;
        FragmentSelectStationBinding fragmentSelectStationBinding = this.binding;
        FragmentSelectStationBinding fragmentSelectStationBinding2 = null;
        if (fragmentSelectStationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSelectStationBinding = null;
        }
        UserStationsView userStationsView = fragmentSelectStationBinding.layoutUserStationsView;
        if (homeStation == null && workStation == null) {
            i = 8;
        } else {
            FragmentSelectStationBinding fragmentSelectStationBinding3 = this.binding;
            if (fragmentSelectStationBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentSelectStationBinding3 = null;
            }
            fragmentSelectStationBinding3.layoutUserStationsView.setShowLayoutHeader(false);
            if (homeStation != null) {
                FragmentSelectStationBinding fragmentSelectStationBinding4 = this.binding;
                if (fragmentSelectStationBinding4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentSelectStationBinding4 = null;
                }
                fragmentSelectStationBinding4.layoutUserStationsView.setHomeStation(homeStation);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                FragmentSelectStationBinding fragmentSelectStationBinding5 = this.binding;
                if (fragmentSelectStationBinding5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentSelectStationBinding5 = null;
                }
                fragmentSelectStationBinding5.layoutUserStationsView.hideHomeStation();
            }
            if (workStation != null) {
                FragmentSelectStationBinding fragmentSelectStationBinding6 = this.binding;
                if (fragmentSelectStationBinding6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentSelectStationBinding6 = null;
                }
                fragmentSelectStationBinding6.layoutUserStationsView.setWorkStation(workStation);
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                FragmentSelectStationBinding fragmentSelectStationBinding7 = this.binding;
                if (fragmentSelectStationBinding7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentSelectStationBinding2 = fragmentSelectStationBinding7;
                }
                fragmentSelectStationBinding2.layoutUserStationsView.hideWorkStation();
            }
            i = 0;
        }
        userStationsView.setVisibility(i);
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentSelectStationBinding bind = FragmentSelectStationBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        configureViews();
        configureObservers();
        configureViewListeners();
        getViewModel().onViewsLoaded(NavArguments.StationSelectionType.valueOf(getArgs().getKey()));
    }
}
