package com.adif.elcanomovil.uiDepartures.main.oneway;

import a.AbstractC0106b;
import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.K;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.Q;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.extensions.NavigationExtensionsKt;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.commonViews.EmptyCirculationsState;
import com.adif.elcanomovil.commonViews.EmptyCirculationsView;
import com.adif.elcanomovil.commonViews.LinearDividerDecoration;
import com.adif.elcanomovil.commonViews.utils.ScreenUtils;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.circulation.TrainCirculation;
import com.adif.elcanomovil.uiDepartures.R;
import com.adif.elcanomovil.uiDepartures.adapters.CirculationAdapter;
import com.adif.elcanomovil.uiDepartures.databinding.FragmentCirculationBinding;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.messaging.Constants;
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
import o0.AbstractC0544v;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "Landroidx/lifecycle/Q;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/view/View;", "view", "", "observeIsVisible", "(Landroidx/lifecycle/Q;Landroid/view/View;)V", "Lcom/adif/elcanomovil/uiDepartures/databinding/FragmentCirculationBinding;", "binding", "configureView", "(Lcom/adif/elcanomovil/uiDepartures/databinding/FragmentCirculationBinding;)V", "Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculation;", "trainCirculation", "handleTrainTap", "(Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculation;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsViewModel;", "viewModel", "", "tabPosition", "I", "Companion", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nCirculationsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CirculationsFragment.kt\ncom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,177:1\n106#2,15:178\n*S KotlinDebug\n*F\n+ 1 CirculationsFragment.kt\ncom/adif/elcanomovil/uiDepartures/main/oneway/CirculationsFragment\n*L\n32#1:178,15\n*E\n"})
/* loaded from: classes2.dex */
public final class CirculationsFragment extends Hilt_CirculationsFragment {
    public static final String ARG_TAB_POSITION = "arg_tabPosition";
    private int tabPosition;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public CirculationsFragment() {
        super(R.layout.fragment_circulation);
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(CirculationsViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsFragment$special$$inlined$viewModels$default$5
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
        this.tabPosition = -1;
    }

    public static final /* synthetic */ CirculationsViewModel access$getViewModel(CirculationsFragment circulationsFragment) {
        return circulationsFragment.getViewModel();
    }

    public static final /* synthetic */ void access$handleTrainTap(CirculationsFragment circulationsFragment, TrainCirculation trainCirculation) {
        circulationsFragment.handleTrainTap(trainCirculation);
    }

    private final void configureView(FragmentCirculationBinding binding) {
        RecyclerView recyclerView = binding.circulations;
        CirculationType pageType = getViewModel().getPageType();
        if (pageType == null) {
            pageType = CirculationType.DEPARTURE;
        }
        recyclerView.setAdapter(new CirculationAdapter(pageType, new com.adif.elcanomovil.uiDepartures.main.c(1, getViewModel(), CirculationsViewModel.class, "handleCirculationObservationTap", "handleCirculationObservationTap(Ljava/lang/String;)V", 0, 2), new com.adif.elcanomovil.uiDepartures.main.c(1, this, CirculationsFragment.class, "handleTrainTap", "handleTrainTap(Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculation;)V", 0, 3)));
        binding.empty.update(EmptyCirculationsState.EmptyDefault.INSTANCE);
        binding.circulations.i(new LinearDividerDecoration(new PaintDrawable(D.h.getColor(binding.getRoot().getContext(), R.color.color_separator_line)), ScreenUtils.INSTANCE.dpToPx(1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, 12, null));
        binding.stationHeader.setOnTypeSelectionListener(new com.adif.elcanomovil.uiDepartures.main.c(1, getViewModel(), CirculationsViewModel.class, "handleTrainTypeChange", "handleTrainTypeChange(Lcom/adif/elcanomovil/domain/entities/TrainType;)V", 0, 4));
        binding.stationHeader.setOnStationActionListener(new com.adif.elcanomovil.uiDepartures.main.c(1, getViewModel(), CirculationsViewModel.class, "handleHeaderButtonTap", "handleHeaderButtonTap(Lcom/adif/elcanomovil/uiDepartures/views/StationAction;)V", 0, 5));
        binding.scrollable.setOnScrollChangeListener(new I2.k(this, 11));
    }

    public static final void configureView$lambda$1(CirculationsFragment this$0, NestedScrollView view, int i, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        if (i4 == 0) {
            this$0.getViewModel().handleScrollToTop();
        }
        if (i4 == view.getChildAt(0).getMeasuredHeight() - view.getMeasuredHeight()) {
            this$0.getViewModel().handleScrollToBottom();
        }
    }

    public static /* synthetic */ void f(CirculationsFragment circulationsFragment, NestedScrollView nestedScrollView, int i, int i4, int i5, int i6) {
        configureView$lambda$1(circulationsFragment, nestedScrollView, i, i4, i5, i6);
    }

    public final CirculationsViewModel getViewModel() {
        return (CirculationsViewModel) this.viewModel.getValue();
    }

    public final void handleTrainTap(TrainCirculation trainCirculation) {
        Context context = getContext();
        if (context == null || !AbstractC0106b.r(context)) {
            getViewModel().handleTrainTap(trainCirculation);
        }
    }

    private final void observeIsVisible(Q r32, View view) {
        r32.e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(1, new I1.b(view, 9)));
    }

    @Override // androidx.fragment.app.K
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt("arg_tabPosition") : 0;
        this.tabPosition = i;
        getViewModel().handleOnCreate(Integer.valueOf(i));
        getLifecycle().a(getViewModel());
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentCirculationBinding bind = FragmentCirculationBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        configureView(bind);
        Q showContent = getViewModel().getShowContent();
        FrameLayout circulationsContainer = bind.circulationsContainer;
        Intrinsics.checkNotNullExpressionValue(circulationsContainer, "circulationsContainer");
        observeIsVisible(showContent, circulationsContainer);
        Q showLoading = getViewModel().getShowLoading();
        EmptyCirculationsView loadingView = bind.loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        observeIsVisible(showLoading, loadingView);
        Q showLoadingMore = getViewModel().getShowLoadingMore();
        TextView loadingMore = bind.loadingMore;
        Intrinsics.checkNotNullExpressionValue(loadingMore, "loadingMore");
        observeIsVisible(showLoadingMore, loadingMore);
        getViewModel().getEmptyText().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(1, new a(bind, 0)));
        getViewModel().getContent().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(1, new b1.e(2, bind, this)));
        getViewModel().getCirculationHeaderInfo().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(1, new a(bind, 1)));
        getViewModel().getStationHeaderInfo().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(1, new a(bind, 2)));
        getViewModel().getObservationInfo().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(1, new a(bind, 3)));
        AbstractC0544v findRootNavController = NavigationExtensionsKt.findRootNavController(this);
        NavigationExtensionsKt.onDestinationResult(findRootNavController, NavArguments.StationSelectionType.STATION.toString(), this, new com.adif.elcanomovil.uiDepartures.main.c(1, getViewModel(), CirculationsViewModel.class, "handleOriginStationSelected", "handleOriginStationSelected(Ljava/lang/String;)V", 0, 8));
        NavigationExtensionsKt.onDestinationResult(findRootNavController, NavArguments.StationSelectionType.STATION_TO.toString(), this, new com.adif.elcanomovil.uiDepartures.main.c(1, getViewModel(), CirculationsViewModel.class, "handleDestinationStationSelected", "handleDestinationStationSelected(Ljava/lang/String;)V", 0, 9));
        NavigationExtensionsKt.onDestinationResult(findRootNavController, NavArguments.RESULT_FILTERS + this.tabPosition, this, new com.adif.elcanomovil.uiDepartures.main.c(1, getViewModel(), CirculationsViewModel.class, "handleFilterChanged", "handleFilterChanged(Lcom/adif/elcanomovil/commonNavGraph/arguments/Filter;)V", 0, 10));
        InterfaceC0266a navigation = getViewModel().getNavigation();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ((b1.f) navigation).a(viewLifecycleOwner, new NavigationHandler(this));
    }
}
