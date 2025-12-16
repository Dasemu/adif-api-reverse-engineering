package com.adif.elcanomovil.uiStations.main;

import B0.B;
import B0.C0023a;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.K;
import androidx.lifecycle.C0;
import androidx.lifecycle.C0191l;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u0;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.uiStations.R;
import com.adif.elcanomovil.uiStations.adapters.CommercialAdapter;
import com.adif.elcanomovil.uiStations.adapters.OfferAdapter;
import com.adif.elcanomovil.uiStations.databinding.ExpandableItemStationsPageCommercialBinding;
import com.adif.elcanomovil.uiStations.databinding.FragmentStationsPageComercialBinding;
import com.adif.elcanomovil.uiStations.entities.CommercialTabViewData;
import com.adif.elcanomovil.uiStations.entities.Services;
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
import l0.C0435a;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010\u0015R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R3\u00107\u001a!\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\u000502j\u0002`68\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/adif/elcanomovil/uiStations/main/StationsPageCommercialFragment;", "Landroidx/fragment/app/K;", "Landroidx/recyclerview/widget/u0;", "<init>", "()V", "", "configureViewObservers", "Lcom/adif/elcanomovil/uiStations/entities/CommercialTabViewData;", "commercialTabViewData", "updateResults", "(Lcom/adif/elcanomovil/uiStations/entities/CommercialTabViewData;)V", "Lcom/adif/elcanomovil/uiStations/databinding/ExpandableItemStationsPageCommercialBinding;", "expandableItemStationsPageCommercialBinding", "", "Lcom/adif/elcanomovil/uiStations/entities/Services;", "services", "populateAndSetVisibilityOfSection", "(Lcom/adif/elcanomovil/uiStations/databinding/ExpandableItemStationsPageCommercialBinding;Ljava/util/List;)V", "", "isEmptyVisible", "updateVisibility", "(Z)V", "configureViewListeners", "setExpandableViewBehaviour", "(Lcom/adif/elcanomovil/uiStations/databinding/ExpandableItemStationsPageCommercialBinding;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "Landroid/view/MotionEvent;", "e", "onInterceptTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", "disallowIntercept", "onRequestDisallowInterceptTouchEvent", "Lcom/adif/elcanomovil/uiStations/databinding/FragmentStationsPageComercialBinding;", "binding", "Lcom/adif/elcanomovil/uiStations/databinding/FragmentStationsPageComercialBinding;", "Lcom/adif/elcanomovil/uiStations/main/StationsPageCommercialViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/uiStations/main/StationsPageCommercialViewModel;", "viewModel", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "service", "Lcom/adif/elcanomovil/uiStations/adapters/OnCommercialTap;", "onCommercialTap", "Lkotlin/jvm/functions/Function1;", "", "lastX", "I", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nStationsPageCommercialFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StationsPageCommercialFragment.kt\ncom/adif/elcanomovil/uiStations/main/StationsPageCommercialFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,224:1\n106#2,15:225\n*S KotlinDebug\n*F\n+ 1 StationsPageCommercialFragment.kt\ncom/adif/elcanomovil/uiStations/main/StationsPageCommercialFragment\n*L\n30#1:225,15\n*E\n"})
/* loaded from: classes2.dex */
public final class StationsPageCommercialFragment extends Hilt_StationsPageCommercialFragment implements u0 {
    private FragmentStationsPageComercialBinding binding;
    private int lastX;
    private final Function1<Services, Unit> onCommercialTap;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public StationsPageCommercialFragment() {
        super(R.layout.fragment_stations_page_comercial);
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.uiStations.main.StationsPageCommercialFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.uiStations.main.StationsPageCommercialFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(StationsPageCommercialViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.uiStations.main.StationsPageCommercialFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.uiStations.main.StationsPageCommercialFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.uiStations.main.StationsPageCommercialFragment$special$$inlined$viewModels$default$5
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
        this.onCommercialTap = new I1.b(this, 15);
    }

    public static final /* synthetic */ FragmentStationsPageComercialBinding access$getBinding$p(StationsPageCommercialFragment stationsPageCommercialFragment) {
        return stationsPageCommercialFragment.binding;
    }

    public static final /* synthetic */ StationsPageCommercialViewModel access$getViewModel(StationsPageCommercialFragment stationsPageCommercialFragment) {
        return stationsPageCommercialFragment.getViewModel();
    }

    public static final /* synthetic */ void access$updateResults(StationsPageCommercialFragment stationsPageCommercialFragment, CommercialTabViewData commercialTabViewData) {
        stationsPageCommercialFragment.updateResults(commercialTabViewData);
    }

    public static final /* synthetic */ void access$updateVisibility(StationsPageCommercialFragment stationsPageCommercialFragment, boolean z3) {
        stationsPageCommercialFragment.updateVisibility(z3);
    }

    private final void configureViewListeners() {
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding = this.binding;
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding2 = null;
        if (fragmentStationsPageComercialBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding = null;
        }
        final int i = 0;
        fragmentStationsPageComercialBinding.groceryStore.headerLayout.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiStations.main.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StationsPageCommercialFragment f5276b;

            {
                this.f5276b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                StationsPageCommercialFragment stationsPageCommercialFragment = this.f5276b;
                switch (i4) {
                    case 0:
                        StationsPageCommercialFragment.configureViewListeners$lambda$0(stationsPageCommercialFragment, view);
                        return;
                    case 1:
                        StationsPageCommercialFragment.configureViewListeners$lambda$1(stationsPageCommercialFragment, view);
                        return;
                    case 2:
                        StationsPageCommercialFragment.configureViewListeners$lambda$2(stationsPageCommercialFragment, view);
                        return;
                    case 3:
                        StationsPageCommercialFragment.configureViewListeners$lambda$3(stationsPageCommercialFragment, view);
                        return;
                    case 4:
                        StationsPageCommercialFragment.configureViewListeners$lambda$4(stationsPageCommercialFragment, view);
                        return;
                    case 5:
                        StationsPageCommercialFragment.configureViewListeners$lambda$5(stationsPageCommercialFragment, view);
                        return;
                    default:
                        StationsPageCommercialFragment.configureViewListeners$lambda$6(stationsPageCommercialFragment, view);
                        return;
                }
            }
        });
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding3 = this.binding;
        if (fragmentStationsPageComercialBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding3 = null;
        }
        final int i4 = 1;
        fragmentStationsPageComercialBinding3.leisure.headerLayout.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiStations.main.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StationsPageCommercialFragment f5276b;

            {
                this.f5276b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                StationsPageCommercialFragment stationsPageCommercialFragment = this.f5276b;
                switch (i42) {
                    case 0:
                        StationsPageCommercialFragment.configureViewListeners$lambda$0(stationsPageCommercialFragment, view);
                        return;
                    case 1:
                        StationsPageCommercialFragment.configureViewListeners$lambda$1(stationsPageCommercialFragment, view);
                        return;
                    case 2:
                        StationsPageCommercialFragment.configureViewListeners$lambda$2(stationsPageCommercialFragment, view);
                        return;
                    case 3:
                        StationsPageCommercialFragment.configureViewListeners$lambda$3(stationsPageCommercialFragment, view);
                        return;
                    case 4:
                        StationsPageCommercialFragment.configureViewListeners$lambda$4(stationsPageCommercialFragment, view);
                        return;
                    case 5:
                        StationsPageCommercialFragment.configureViewListeners$lambda$5(stationsPageCommercialFragment, view);
                        return;
                    default:
                        StationsPageCommercialFragment.configureViewListeners$lambda$6(stationsPageCommercialFragment, view);
                        return;
                }
            }
        });
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding4 = this.binding;
        if (fragmentStationsPageComercialBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding4 = null;
        }
        final int i5 = 2;
        fragmentStationsPageComercialBinding4.others.headerLayout.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiStations.main.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StationsPageCommercialFragment f5276b;

            {
                this.f5276b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i5;
                StationsPageCommercialFragment stationsPageCommercialFragment = this.f5276b;
                switch (i42) {
                    case 0:
                        StationsPageCommercialFragment.configureViewListeners$lambda$0(stationsPageCommercialFragment, view);
                        return;
                    case 1:
                        StationsPageCommercialFragment.configureViewListeners$lambda$1(stationsPageCommercialFragment, view);
                        return;
                    case 2:
                        StationsPageCommercialFragment.configureViewListeners$lambda$2(stationsPageCommercialFragment, view);
                        return;
                    case 3:
                        StationsPageCommercialFragment.configureViewListeners$lambda$3(stationsPageCommercialFragment, view);
                        return;
                    case 4:
                        StationsPageCommercialFragment.configureViewListeners$lambda$4(stationsPageCommercialFragment, view);
                        return;
                    case 5:
                        StationsPageCommercialFragment.configureViewListeners$lambda$5(stationsPageCommercialFragment, view);
                        return;
                    default:
                        StationsPageCommercialFragment.configureViewListeners$lambda$6(stationsPageCommercialFragment, view);
                        return;
                }
            }
        });
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding5 = this.binding;
        if (fragmentStationsPageComercialBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding5 = null;
        }
        final int i6 = 3;
        fragmentStationsPageComercialBinding5.rentACar.headerLayout.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiStations.main.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StationsPageCommercialFragment f5276b;

            {
                this.f5276b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i6;
                StationsPageCommercialFragment stationsPageCommercialFragment = this.f5276b;
                switch (i42) {
                    case 0:
                        StationsPageCommercialFragment.configureViewListeners$lambda$0(stationsPageCommercialFragment, view);
                        return;
                    case 1:
                        StationsPageCommercialFragment.configureViewListeners$lambda$1(stationsPageCommercialFragment, view);
                        return;
                    case 2:
                        StationsPageCommercialFragment.configureViewListeners$lambda$2(stationsPageCommercialFragment, view);
                        return;
                    case 3:
                        StationsPageCommercialFragment.configureViewListeners$lambda$3(stationsPageCommercialFragment, view);
                        return;
                    case 4:
                        StationsPageCommercialFragment.configureViewListeners$lambda$4(stationsPageCommercialFragment, view);
                        return;
                    case 5:
                        StationsPageCommercialFragment.configureViewListeners$lambda$5(stationsPageCommercialFragment, view);
                        return;
                    default:
                        StationsPageCommercialFragment.configureViewListeners$lambda$6(stationsPageCommercialFragment, view);
                        return;
                }
            }
        });
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding6 = this.binding;
        if (fragmentStationsPageComercialBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding6 = null;
        }
        final int i7 = 4;
        fragmentStationsPageComercialBinding6.restaurant.headerLayout.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiStations.main.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StationsPageCommercialFragment f5276b;

            {
                this.f5276b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i7;
                StationsPageCommercialFragment stationsPageCommercialFragment = this.f5276b;
                switch (i42) {
                    case 0:
                        StationsPageCommercialFragment.configureViewListeners$lambda$0(stationsPageCommercialFragment, view);
                        return;
                    case 1:
                        StationsPageCommercialFragment.configureViewListeners$lambda$1(stationsPageCommercialFragment, view);
                        return;
                    case 2:
                        StationsPageCommercialFragment.configureViewListeners$lambda$2(stationsPageCommercialFragment, view);
                        return;
                    case 3:
                        StationsPageCommercialFragment.configureViewListeners$lambda$3(stationsPageCommercialFragment, view);
                        return;
                    case 4:
                        StationsPageCommercialFragment.configureViewListeners$lambda$4(stationsPageCommercialFragment, view);
                        return;
                    case 5:
                        StationsPageCommercialFragment.configureViewListeners$lambda$5(stationsPageCommercialFragment, view);
                        return;
                    default:
                        StationsPageCommercialFragment.configureViewListeners$lambda$6(stationsPageCommercialFragment, view);
                        return;
                }
            }
        });
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding7 = this.binding;
        if (fragmentStationsPageComercialBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding7 = null;
        }
        final int i8 = 5;
        fragmentStationsPageComercialBinding7.shop.headerLayout.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiStations.main.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StationsPageCommercialFragment f5276b;

            {
                this.f5276b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i8;
                StationsPageCommercialFragment stationsPageCommercialFragment = this.f5276b;
                switch (i42) {
                    case 0:
                        StationsPageCommercialFragment.configureViewListeners$lambda$0(stationsPageCommercialFragment, view);
                        return;
                    case 1:
                        StationsPageCommercialFragment.configureViewListeners$lambda$1(stationsPageCommercialFragment, view);
                        return;
                    case 2:
                        StationsPageCommercialFragment.configureViewListeners$lambda$2(stationsPageCommercialFragment, view);
                        return;
                    case 3:
                        StationsPageCommercialFragment.configureViewListeners$lambda$3(stationsPageCommercialFragment, view);
                        return;
                    case 4:
                        StationsPageCommercialFragment.configureViewListeners$lambda$4(stationsPageCommercialFragment, view);
                        return;
                    case 5:
                        StationsPageCommercialFragment.configureViewListeners$lambda$5(stationsPageCommercialFragment, view);
                        return;
                    default:
                        StationsPageCommercialFragment.configureViewListeners$lambda$6(stationsPageCommercialFragment, view);
                        return;
                }
            }
        });
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding8 = this.binding;
        if (fragmentStationsPageComercialBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentStationsPageComercialBinding2 = fragmentStationsPageComercialBinding8;
        }
        final int i9 = 6;
        fragmentStationsPageComercialBinding2.souvenir.headerLayout.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiStations.main.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StationsPageCommercialFragment f5276b;

            {
                this.f5276b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i9;
                StationsPageCommercialFragment stationsPageCommercialFragment = this.f5276b;
                switch (i42) {
                    case 0:
                        StationsPageCommercialFragment.configureViewListeners$lambda$0(stationsPageCommercialFragment, view);
                        return;
                    case 1:
                        StationsPageCommercialFragment.configureViewListeners$lambda$1(stationsPageCommercialFragment, view);
                        return;
                    case 2:
                        StationsPageCommercialFragment.configureViewListeners$lambda$2(stationsPageCommercialFragment, view);
                        return;
                    case 3:
                        StationsPageCommercialFragment.configureViewListeners$lambda$3(stationsPageCommercialFragment, view);
                        return;
                    case 4:
                        StationsPageCommercialFragment.configureViewListeners$lambda$4(stationsPageCommercialFragment, view);
                        return;
                    case 5:
                        StationsPageCommercialFragment.configureViewListeners$lambda$5(stationsPageCommercialFragment, view);
                        return;
                    default:
                        StationsPageCommercialFragment.configureViewListeners$lambda$6(stationsPageCommercialFragment, view);
                        return;
                }
            }
        });
    }

    public static final void configureViewListeners$lambda$0(StationsPageCommercialFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding = this$0.binding;
        if (fragmentStationsPageComercialBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding = null;
        }
        ExpandableItemStationsPageCommercialBinding groceryStore = fragmentStationsPageComercialBinding.groceryStore;
        Intrinsics.checkNotNullExpressionValue(groceryStore, "groceryStore");
        this$0.setExpandableViewBehaviour(groceryStore);
    }

    public static final void configureViewListeners$lambda$1(StationsPageCommercialFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding = this$0.binding;
        if (fragmentStationsPageComercialBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding = null;
        }
        ExpandableItemStationsPageCommercialBinding leisure = fragmentStationsPageComercialBinding.leisure;
        Intrinsics.checkNotNullExpressionValue(leisure, "leisure");
        this$0.setExpandableViewBehaviour(leisure);
    }

    public static final void configureViewListeners$lambda$2(StationsPageCommercialFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding = this$0.binding;
        if (fragmentStationsPageComercialBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding = null;
        }
        ExpandableItemStationsPageCommercialBinding others = fragmentStationsPageComercialBinding.others;
        Intrinsics.checkNotNullExpressionValue(others, "others");
        this$0.setExpandableViewBehaviour(others);
    }

    public static final void configureViewListeners$lambda$3(StationsPageCommercialFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding = this$0.binding;
        if (fragmentStationsPageComercialBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding = null;
        }
        ExpandableItemStationsPageCommercialBinding rentACar = fragmentStationsPageComercialBinding.rentACar;
        Intrinsics.checkNotNullExpressionValue(rentACar, "rentACar");
        this$0.setExpandableViewBehaviour(rentACar);
    }

    public static final void configureViewListeners$lambda$4(StationsPageCommercialFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding = this$0.binding;
        if (fragmentStationsPageComercialBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding = null;
        }
        ExpandableItemStationsPageCommercialBinding restaurant = fragmentStationsPageComercialBinding.restaurant;
        Intrinsics.checkNotNullExpressionValue(restaurant, "restaurant");
        this$0.setExpandableViewBehaviour(restaurant);
    }

    public static final void configureViewListeners$lambda$5(StationsPageCommercialFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding = this$0.binding;
        if (fragmentStationsPageComercialBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding = null;
        }
        ExpandableItemStationsPageCommercialBinding shop = fragmentStationsPageComercialBinding.shop;
        Intrinsics.checkNotNullExpressionValue(shop, "shop");
        this$0.setExpandableViewBehaviour(shop);
    }

    public static final void configureViewListeners$lambda$6(StationsPageCommercialFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding = this$0.binding;
        if (fragmentStationsPageComercialBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding = null;
        }
        ExpandableItemStationsPageCommercialBinding souvenir = fragmentStationsPageComercialBinding.souvenir;
        Intrinsics.checkNotNullExpressionValue(souvenir, "souvenir");
        this$0.setExpandableViewBehaviour(souvenir);
    }

    private final void configureViewObservers() {
        getViewModel().getViewData().e(getViewLifecycleOwner(), new C0191l(new f(this)));
        InterfaceC0266a navigation = getViewModel().getNavigation();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ((b1.f) navigation).a(viewLifecycleOwner, new NavigationHandler(this));
    }

    public final StationsPageCommercialViewModel getViewModel() {
        return (StationsPageCommercialViewModel) this.viewModel.getValue();
    }

    private final void populateAndSetVisibilityOfSection(ExpandableItemStationsPageCommercialBinding expandableItemStationsPageCommercialBinding, List<Services> services) {
        CommercialAdapter commercialAdapter = new CommercialAdapter(this.onCommercialTap);
        expandableItemStationsPageCommercialBinding.rv.setAdapter(commercialAdapter);
        commercialAdapter.update(services);
        if (services == null || !(!services.isEmpty())) {
            expandableItemStationsPageCommercialBinding.headerLayout.setVisibility(8);
        } else {
            expandableItemStationsPageCommercialBinding.headerLayout.setVisibility(0);
        }
    }

    private final void setExpandableViewBehaviour(ExpandableItemStationsPageCommercialBinding expandableItemStationsPageCommercialBinding) {
        if (expandableItemStationsPageCommercialBinding.rv.getVisibility() == 8) {
            B.a(expandableItemStationsPageCommercialBinding.rv, new C0023a());
            expandableItemStationsPageCommercialBinding.rv.setVisibility(0);
            expandableItemStationsPageCommercialBinding.headerArrow.setImageResource(R.drawable.ic_arrow_list_up);
        } else {
            B.a(expandableItemStationsPageCommercialBinding.rv, new C0023a());
            expandableItemStationsPageCommercialBinding.rv.setVisibility(8);
            expandableItemStationsPageCommercialBinding.headerArrow.setImageResource(R.drawable.ic_arrow_list_down);
        }
    }

    public final void updateResults(CommercialTabViewData commercialTabViewData) {
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding = this.binding;
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding2 = null;
        if (fragmentStationsPageComercialBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding = null;
        }
        fragmentStationsPageComercialBinding.viewNotEmptyStation.setVisibility(0);
        OfferAdapter offerAdapter = new OfferAdapter(this.onCommercialTap);
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding3 = this.binding;
        if (fragmentStationsPageComercialBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding3 = null;
        }
        fragmentStationsPageComercialBinding3.rvOffers.setAdapter(offerAdapter);
        offerAdapter.update(commercialTabViewData.getOffers());
        if (commercialTabViewData.getOffers() == null || !(!r0.isEmpty())) {
            FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding4 = this.binding;
            if (fragmentStationsPageComercialBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentStationsPageComercialBinding4 = null;
            }
            fragmentStationsPageComercialBinding4.rvOffers.setVisibility(8);
        } else {
            FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding5 = this.binding;
            if (fragmentStationsPageComercialBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentStationsPageComercialBinding5 = null;
            }
            fragmentStationsPageComercialBinding5.rvOffers.setVisibility(0);
        }
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding6 = this.binding;
        if (fragmentStationsPageComercialBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding6 = null;
        }
        ExpandableItemStationsPageCommercialBinding groceryStore = fragmentStationsPageComercialBinding6.groceryStore;
        Intrinsics.checkNotNullExpressionValue(groceryStore, "groceryStore");
        populateAndSetVisibilityOfSection(groceryStore, commercialTabViewData.getGroceryStore());
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding7 = this.binding;
        if (fragmentStationsPageComercialBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding7 = null;
        }
        ExpandableItemStationsPageCommercialBinding leisure = fragmentStationsPageComercialBinding7.leisure;
        Intrinsics.checkNotNullExpressionValue(leisure, "leisure");
        populateAndSetVisibilityOfSection(leisure, commercialTabViewData.getLeisure());
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding8 = this.binding;
        if (fragmentStationsPageComercialBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding8 = null;
        }
        ExpandableItemStationsPageCommercialBinding others = fragmentStationsPageComercialBinding8.others;
        Intrinsics.checkNotNullExpressionValue(others, "others");
        populateAndSetVisibilityOfSection(others, commercialTabViewData.getOthers());
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding9 = this.binding;
        if (fragmentStationsPageComercialBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding9 = null;
        }
        ExpandableItemStationsPageCommercialBinding rentACar = fragmentStationsPageComercialBinding9.rentACar;
        Intrinsics.checkNotNullExpressionValue(rentACar, "rentACar");
        populateAndSetVisibilityOfSection(rentACar, commercialTabViewData.getRentACar());
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding10 = this.binding;
        if (fragmentStationsPageComercialBinding10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding10 = null;
        }
        ExpandableItemStationsPageCommercialBinding restaurant = fragmentStationsPageComercialBinding10.restaurant;
        Intrinsics.checkNotNullExpressionValue(restaurant, "restaurant");
        populateAndSetVisibilityOfSection(restaurant, commercialTabViewData.getRestaurant());
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding11 = this.binding;
        if (fragmentStationsPageComercialBinding11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding11 = null;
        }
        ExpandableItemStationsPageCommercialBinding shop = fragmentStationsPageComercialBinding11.shop;
        Intrinsics.checkNotNullExpressionValue(shop, "shop");
        populateAndSetVisibilityOfSection(shop, commercialTabViewData.getShop());
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding12 = this.binding;
        if (fragmentStationsPageComercialBinding12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentStationsPageComercialBinding2 = fragmentStationsPageComercialBinding12;
        }
        ExpandableItemStationsPageCommercialBinding souvenir = fragmentStationsPageComercialBinding2.souvenir;
        Intrinsics.checkNotNullExpressionValue(souvenir, "souvenir");
        populateAndSetVisibilityOfSection(souvenir, commercialTabViewData.getSouvenir());
    }

    public final void updateVisibility(boolean isEmptyVisible) {
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding = this.binding;
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding2 = null;
        if (fragmentStationsPageComercialBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding = null;
        }
        fragmentStationsPageComercialBinding.viewNotEmptyStation.setVisibility(isEmptyVisible ? 8 : 0);
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding3 = this.binding;
        if (fragmentStationsPageComercialBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentStationsPageComercialBinding2 = fragmentStationsPageComercialBinding3;
        }
        fragmentStationsPageComercialBinding2.loadingEmptyOrErrorCommonView.setVisibility(isEmptyVisible ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.u0
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e4) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        Intrinsics.checkNotNullParameter(e4, "e");
        return false;
    }

    @Override // androidx.recyclerview.widget.u0
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
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
        FragmentStationsPageComercialBinding bind = FragmentStationsPageComercialBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding = null;
        if (bind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bind = null;
        }
        bind.rvOffers.j(this);
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding2 = this.binding;
        if (fragmentStationsPageComercialBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding2 = null;
        }
        fragmentStationsPageComercialBinding2.groceryStore.headerText.setText(getString(R.string.grocery_store));
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding3 = this.binding;
        if (fragmentStationsPageComercialBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding3 = null;
        }
        fragmentStationsPageComercialBinding3.leisure.headerText.setText(getString(R.string.leisure));
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding4 = this.binding;
        if (fragmentStationsPageComercialBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding4 = null;
        }
        fragmentStationsPageComercialBinding4.others.headerText.setText(getString(R.string.others));
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding5 = this.binding;
        if (fragmentStationsPageComercialBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding5 = null;
        }
        fragmentStationsPageComercialBinding5.rentACar.headerText.setText(getString(R.string.rent_a_car));
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding6 = this.binding;
        if (fragmentStationsPageComercialBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding6 = null;
        }
        fragmentStationsPageComercialBinding6.restaurant.headerText.setText(getString(R.string.restaurants));
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding7 = this.binding;
        if (fragmentStationsPageComercialBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageComercialBinding7 = null;
        }
        fragmentStationsPageComercialBinding7.shop.headerText.setText(getString(R.string.shops));
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding8 = this.binding;
        if (fragmentStationsPageComercialBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentStationsPageComercialBinding = fragmentStationsPageComercialBinding8;
        }
        fragmentStationsPageComercialBinding.souvenir.headerText.setText(getString(R.string.souvenirs));
        configureViewObservers();
        configureViewListeners();
    }
}
