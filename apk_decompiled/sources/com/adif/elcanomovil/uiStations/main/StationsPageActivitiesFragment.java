package com.adif.elcanomovil.uiStations.main;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.K;
import androidx.lifecycle.C0;
import androidx.lifecycle.C0191l;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.C0246x;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.uiStations.R;
import com.adif.elcanomovil.uiStations.adapters.ActivitiesAdapter;
import com.adif.elcanomovil.uiStations.databinding.FragmentStationsPageActivitiesBinding;
import com.adif.elcanomovil.uiStations.entities.ActivitiesTabViewData;
import com.adif.elcanomovil.uiStations.entities.Activity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dagger.hilt.android.AndroidEntryPoint;
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
import l0.C0435a;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR3\u0010#\u001a!\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00040\u001dj\u0002`\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/adif/elcanomovil/uiStations/main/StationsPageActivitiesFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "", "configureViewObservers", "Lcom/adif/elcanomovil/uiStations/entities/ActivitiesTabViewData;", "activitiesTabViewData", "updateResults", "(Lcom/adif/elcanomovil/uiStations/entities/ActivitiesTabViewData;)V", "", "isEmptyVisible", "updateVisibility", "(Z)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/adif/elcanomovil/uiStations/databinding/FragmentStationsPageActivitiesBinding;", "binding", "Lcom/adif/elcanomovil/uiStations/databinding/FragmentStationsPageActivitiesBinding;", "Lcom/adif/elcanomovil/uiStations/main/StationsPageActivitiesViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/uiStations/main/StationsPageActivitiesViewModel;", "viewModel", "Lkotlin/Function1;", "Lcom/adif/elcanomovil/uiStations/entities/Activity;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "activitie", "Lcom/adif/elcanomovil/uiStations/adapters/OnActivityTap;", "onActivityTap", "Lkotlin/jvm/functions/Function1;", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nStationsPageActivitiesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StationsPageActivitiesFragment.kt\ncom/adif/elcanomovil/uiStations/main/StationsPageActivitiesFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,112:1\n106#2,15:113\n*S KotlinDebug\n*F\n+ 1 StationsPageActivitiesFragment.kt\ncom/adif/elcanomovil/uiStations/main/StationsPageActivitiesFragment\n*L\n21#1:113,15\n*E\n"})
/* loaded from: classes2.dex */
public final class StationsPageActivitiesFragment extends Hilt_StationsPageActivitiesFragment {
    private FragmentStationsPageActivitiesBinding binding;
    private final Function1<Activity, Unit> onActivityTap;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public StationsPageActivitiesFragment() {
        super(R.layout.fragment_stations_page_activities);
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.uiStations.main.StationsPageActivitiesFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.uiStations.main.StationsPageActivitiesFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(StationsPageActivitiesViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.uiStations.main.StationsPageActivitiesFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.uiStations.main.StationsPageActivitiesFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.uiStations.main.StationsPageActivitiesFragment$special$$inlined$viewModels$default$5
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
        this.onActivityTap = new I1.b(this, 14);
    }

    public static final /* synthetic */ FragmentStationsPageActivitiesBinding access$getBinding$p(StationsPageActivitiesFragment stationsPageActivitiesFragment) {
        return stationsPageActivitiesFragment.binding;
    }

    public static final /* synthetic */ StationsPageActivitiesViewModel access$getViewModel(StationsPageActivitiesFragment stationsPageActivitiesFragment) {
        return stationsPageActivitiesFragment.getViewModel();
    }

    public static final /* synthetic */ void access$updateResults(StationsPageActivitiesFragment stationsPageActivitiesFragment, ActivitiesTabViewData activitiesTabViewData) {
        stationsPageActivitiesFragment.updateResults(activitiesTabViewData);
    }

    public static final /* synthetic */ void access$updateVisibility(StationsPageActivitiesFragment stationsPageActivitiesFragment, boolean z3) {
        stationsPageActivitiesFragment.updateVisibility(z3);
    }

    private final void configureViewObservers() {
        getViewModel().getViewData().e(getViewLifecycleOwner(), new C0191l(new b(this)));
        InterfaceC0266a navigation = getViewModel().getNavigation();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ((b1.f) navigation).a(viewLifecycleOwner, new NavigationHandler(this));
    }

    public final StationsPageActivitiesViewModel getViewModel() {
        return (StationsPageActivitiesViewModel) this.viewModel.getValue();
    }

    public final void updateResults(ActivitiesTabViewData activitiesTabViewData) {
        FragmentStationsPageActivitiesBinding fragmentStationsPageActivitiesBinding = this.binding;
        FragmentStationsPageActivitiesBinding fragmentStationsPageActivitiesBinding2 = null;
        if (fragmentStationsPageActivitiesBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageActivitiesBinding = null;
        }
        fragmentStationsPageActivitiesBinding.viewNotEmptyStation.setVisibility(0);
        ActivitiesAdapter activitiesAdapter = new ActivitiesAdapter(this.onActivityTap);
        FragmentStationsPageActivitiesBinding fragmentStationsPageActivitiesBinding3 = this.binding;
        if (fragmentStationsPageActivitiesBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageActivitiesBinding3 = null;
        }
        fragmentStationsPageActivitiesBinding3.rvActivities.setAdapter(activitiesAdapter);
        activitiesAdapter.update(activitiesTabViewData.getActivities());
        if (activitiesTabViewData.getActivities() == null || !(!r6.isEmpty())) {
            FragmentStationsPageActivitiesBinding fragmentStationsPageActivitiesBinding4 = this.binding;
            if (fragmentStationsPageActivitiesBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentStationsPageActivitiesBinding2 = fragmentStationsPageActivitiesBinding4;
            }
            fragmentStationsPageActivitiesBinding2.rvActivities.setVisibility(8);
            return;
        }
        FragmentStationsPageActivitiesBinding fragmentStationsPageActivitiesBinding5 = this.binding;
        if (fragmentStationsPageActivitiesBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentStationsPageActivitiesBinding2 = fragmentStationsPageActivitiesBinding5;
        }
        fragmentStationsPageActivitiesBinding2.rvActivities.setVisibility(0);
    }

    public final void updateVisibility(boolean isEmptyVisible) {
        FragmentStationsPageActivitiesBinding fragmentStationsPageActivitiesBinding = this.binding;
        FragmentStationsPageActivitiesBinding fragmentStationsPageActivitiesBinding2 = null;
        if (fragmentStationsPageActivitiesBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageActivitiesBinding = null;
        }
        fragmentStationsPageActivitiesBinding.viewNotEmptyStation.setVisibility(isEmptyVisible ? 8 : 0);
        FragmentStationsPageActivitiesBinding fragmentStationsPageActivitiesBinding3 = this.binding;
        if (fragmentStationsPageActivitiesBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentStationsPageActivitiesBinding2 = fragmentStationsPageActivitiesBinding3;
        }
        fragmentStationsPageActivitiesBinding2.loadingEmptyOrErrorCommonView.setVisibility(isEmptyVisible ? 0 : 8);
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentStationsPageActivitiesBinding bind = FragmentStationsPageActivitiesBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        C0246x c0246x = new C0246x(requireContext());
        Drawable drawable = D.h.getDrawable(requireContext(), R.drawable.hard_divider);
        if (drawable != null) {
            c0246x.f3928a = drawable;
        }
        FragmentStationsPageActivitiesBinding fragmentStationsPageActivitiesBinding = this.binding;
        if (fragmentStationsPageActivitiesBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageActivitiesBinding = null;
        }
        fragmentStationsPageActivitiesBinding.rvActivities.i(c0246x);
        configureViewObservers();
    }
}
