package com.adif.elcanomovil.widget.configuration;

import D.m;
import D1.a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.K;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.y0;
import b1.InterfaceC0266a;
import b1.f;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.extensions.NavigationExtensionsKt;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.commonViews.databinding.LoadingEmptyOrErrorCommonViewBinding;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.uiDepartures.views.StationAction;
import com.adif.elcanomovil.uiDepartures.views.StationHeaderView;
import com.adif.elcanomovil.widget.ConfigActivityParent;
import com.adif.elcanomovil.widget.R;
import com.adif.elcanomovil.widget.databinding.WidgetConfigurationFragmentBinding;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.AndroidEntryPoint;
import g.AbstractActivityC0364k;
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
import l0.c;
import m3.d;
import m3.l;
import o0.AbstractC0544v;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/adif/elcanomovil/widget/configuration/ConfigureWidgetFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "", "station", "", "handleSelectedStation", "(Ljava/lang/String;)V", "handleSelectedStationTo", "configureView", "configureObservers", "configureViewListeners", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/adif/elcanomovil/widget/databinding/WidgetConfigurationFragmentBinding;", "binding", "Lcom/adif/elcanomovil/widget/databinding/WidgetConfigurationFragmentBinding;", "Lcom/adif/elcanomovil/widget/configuration/ConfigureWidgetViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/widget/configuration/ConfigureWidgetViewModel;", "viewModel", "Lcom/adif/elcanomovil/widget/ConfigActivityParent;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/adif/elcanomovil/widget/ConfigActivityParent;", "widget_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nConfigureWidgetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigureWidgetFragment.kt\ncom/adif/elcanomovil/widget/configuration/ConfigureWidgetFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,131:1\n106#2,15:132\n*S KotlinDebug\n*F\n+ 1 ConfigureWidgetFragment.kt\ncom/adif/elcanomovil/widget/configuration/ConfigureWidgetFragment\n*L\n25#1:132,15\n*E\n"})
/* loaded from: classes3.dex */
public final class ConfigureWidgetFragment extends Hilt_ConfigureWidgetFragment {
    private WidgetConfigurationFragmentBinding binding;
    private ConfigActivityParent listener;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public ConfigureWidgetFragment() {
        super(R.layout.widget_configuration_fragment);
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.widget.configuration.ConfigureWidgetFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.widget.configuration.ConfigureWidgetFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = d.n(this, Reflection.getOrCreateKotlinClass(ConfigureWidgetViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.widget.configuration.ConfigureWidgetFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<c>() { // from class: com.adif.elcanomovil.widget.configuration.ConfigureWidgetFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final c invoke() {
                c cVar;
                Function0 function03 = Function0.this;
                if (function03 != null && (cVar = (c) function03.invoke()) != null) {
                    return cVar;
                }
                D0 d02 = (D0) lazy.getValue();
                InterfaceC0200v interfaceC0200v = d02 instanceof InterfaceC0200v ? (InterfaceC0200v) d02 : null;
                return interfaceC0200v != null ? interfaceC0200v.getDefaultViewModelCreationExtras() : C0435a.f7312b;
            }
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.widget.configuration.ConfigureWidgetFragment$special$$inlined$viewModels$default$5
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

    private final void configureObservers() {
        InterfaceC0266a navigation = getViewModel().getNavigation();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ((f) navigation).a(viewLifecycleOwner, new NavigationHandler(this));
        getViewModel().getViewData().e(getViewLifecycleOwner(), new ConfigureWidgetFragment$sam$androidx_lifecycle_Observer$0(new Function1<WidgetViewConfigData, Unit>() { // from class: com.adif.elcanomovil.widget.configuration.ConfigureWidgetFragment$configureObservers$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WidgetViewConfigData widgetViewConfigData) {
                invoke2(widgetViewConfigData);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
            
                r10 = r10.this$0.binding;
             */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke2(com.adif.elcanomovil.widget.configuration.WidgetViewConfigData r11) {
                /*
                    r10 = this;
                    if (r11 == 0) goto L78
                    com.adif.elcanomovil.widget.configuration.ConfigureWidgetFragment r10 = com.adif.elcanomovil.widget.configuration.ConfigureWidgetFragment.this
                    com.adif.elcanomovil.widget.databinding.WidgetConfigurationFragmentBinding r10 = com.adif.elcanomovil.widget.configuration.ConfigureWidgetFragment.access$getBinding$p(r10)
                    if (r10 == 0) goto L78
                    com.adif.elcanomovil.uiDepartures.views.StationHeaderView r0 = r10.stationHeader
                    if (r0 == 0) goto L78
                    com.adif.elcanomovil.domain.entities.TrainType r1 = com.adif.elcanomovil.domain.entities.TrainType.CERCANIAS
                    java.lang.Boolean r10 = r11.getStationIsRodalies()
                    java.lang.Boolean r2 = java.lang.Boolean.TRUE
                    boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r2)
                    if (r10 == 0) goto L27
                    java.lang.Boolean r10 = r11.getStationToIsRodalies()
                    boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r2)
                    if (r10 == 0) goto L27
                    goto L48
                L27:
                    java.lang.Boolean r10 = r11.getStationIsRodalies()
                    boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r2)
                    if (r10 == 0) goto L38
                    java.lang.Boolean r10 = r11.getStationToIsRodalies()
                    if (r10 != 0) goto L38
                    goto L48
                L38:
                    java.lang.Boolean r10 = r11.getStationIsRodalies()
                    if (r10 != 0) goto L4b
                    java.lang.Boolean r10 = r11.getStationToIsRodalies()
                    boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r2)
                    if (r10 == 0) goto L4b
                L48:
                    r10 = 1
                L49:
                    r2 = r10
                    goto L4d
                L4b:
                    r10 = 0
                    goto L49
                L4d:
                    com.adif.elcanomovil.uiDepartures.views.TrafficAvailability r3 = com.adif.elcanomovil.uiDepartures.views.TrafficAvailability.BOTH
                    java.lang.String r10 = r11.getStationName()
                    java.lang.String r4 = ""
                    if (r10 != 0) goto L58
                    r10 = r4
                L58:
                    java.lang.String r5 = r11.getStationName()
                    if (r5 != 0) goto L5f
                    r5 = r4
                L5f:
                    java.lang.String r6 = r11.getStationToName()
                    if (r6 != 0) goto L67
                    r7 = r4
                    goto L68
                L67:
                    r7 = r6
                L68:
                    java.lang.String r11 = r11.getStationToName()
                    if (r11 != 0) goto L70
                    r8 = r4
                    goto L71
                L70:
                    r8 = r11
                L71:
                    com.adif.elcanomovil.domain.entities.CirculationType r9 = com.adif.elcanomovil.domain.entities.CirculationType.BETWEEN_STATIONS
                    r6 = 0
                    r4 = r10
                    r0.update(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                L78:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.widget.configuration.ConfigureWidgetFragment$configureObservers$1.invoke2(com.adif.elcanomovil.widget.configuration.WidgetViewConfigData):void");
            }
        }));
        getViewModel().getShowCreateWidgetButton().e(getViewLifecycleOwner(), new ConfigureWidgetFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.adif.elcanomovil.widget.configuration.ConfigureWidgetFragment$configureObservers$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                WidgetConfigurationFragmentBinding widgetConfigurationFragmentBinding;
                widgetConfigurationFragmentBinding = ConfigureWidgetFragment.this.binding;
                MaterialButton materialButton = widgetConfigurationFragmentBinding != null ? widgetConfigurationFragmentBinding.creationWidgetButton : null;
                if (materialButton == null) {
                    return;
                }
                materialButton.setVisibility(!bool.booleanValue() ? 8 : 0);
            }
        }));
        getViewModel().getFinishCreateWidget().e(getViewLifecycleOwner(), new ConfigureWidgetFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.adif.elcanomovil.widget.configuration.ConfigureWidgetFragment$configureObservers$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                ConfigActivityParent configActivityParent;
                configActivityParent = ConfigureWidgetFragment.this.listener;
                if (configActivityParent != null) {
                    Context requireContext = ConfigureWidgetFragment.this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    configActivityParent.taskDone(requireContext);
                }
            }
        }));
    }

    private final void configureView() {
        StationHeaderView stationHeaderView;
        StationHeaderView stationHeaderView2;
        LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding;
        Toolbar toolbar;
        WidgetConfigurationFragmentBinding widgetConfigurationFragmentBinding = this.binding;
        if (widgetConfigurationFragmentBinding != null && (toolbar = widgetConfigurationFragmentBinding.toolbar) != null) {
            AbstractActivityC0364k abstractActivityC0364k = (AbstractActivityC0364k) getActivity();
            if (abstractActivityC0364k != null) {
                abstractActivityC0364k.setSupportActionBar(toolbar);
            }
            Context context = getContext();
            toolbar.setTitle(context != null ? context.getString(R.string.config_widget_title) : null);
        }
        WidgetConfigurationFragmentBinding widgetConfigurationFragmentBinding2 = this.binding;
        if (widgetConfigurationFragmentBinding2 != null && (loadingEmptyOrErrorCommonViewBinding = widgetConfigurationFragmentBinding2.empty) != null) {
            loadingEmptyOrErrorCommonViewBinding.iconNoResults.setImageResource(R.drawable.ic_no_results);
            TextView textView = loadingEmptyOrErrorCommonViewBinding.title;
            Context context2 = getContext();
            textView.setText(context2 != null ? context2.getString(R.string.config_widget_message_title) : null);
            TextView textView2 = loadingEmptyOrErrorCommonViewBinding.message;
            Context context3 = getContext();
            textView2.setText(context3 != null ? context3.getString(R.string.circulation_no_station_to_message) : null);
        }
        WidgetConfigurationFragmentBinding widgetConfigurationFragmentBinding3 = this.binding;
        if (widgetConfigurationFragmentBinding3 != null && (stationHeaderView2 = widgetConfigurationFragmentBinding3.stationHeader) != null) {
            stationHeaderView2.hideSwith(true);
        }
        WidgetConfigurationFragmentBinding widgetConfigurationFragmentBinding4 = this.binding;
        if (widgetConfigurationFragmentBinding4 == null || (stationHeaderView = widgetConfigurationFragmentBinding4.stationHeader) == null) {
            return;
        }
        stationHeaderView.hideButtons(true);
    }

    private final void configureViewListeners() {
        MaterialButton materialButton;
        StationHeaderView stationHeaderView;
        StationHeaderView stationHeaderView2;
        WidgetConfigurationFragmentBinding widgetConfigurationFragmentBinding = this.binding;
        if (widgetConfigurationFragmentBinding != null && (stationHeaderView2 = widgetConfigurationFragmentBinding.stationHeader) != null) {
            stationHeaderView2.setOnTypeSelectionListener(new Function1<TrainType, Unit>() { // from class: com.adif.elcanomovil.widget.configuration.ConfigureWidgetFragment$configureViewListeners$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TrainType trainType) {
                    invoke2(trainType);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TrainType it) {
                    ConfigureWidgetViewModel viewModel;
                    Intrinsics.checkNotNullParameter(it, "it");
                    viewModel = ConfigureWidgetFragment.this.getViewModel();
                    viewModel.handleTrainTypeChange(it == TrainType.CERCANIAS);
                }
            });
        }
        WidgetConfigurationFragmentBinding widgetConfigurationFragmentBinding2 = this.binding;
        if (widgetConfigurationFragmentBinding2 != null && (stationHeaderView = widgetConfigurationFragmentBinding2.stationHeader) != null) {
            stationHeaderView.setOnStationActionListener(new Function1<StationAction, Unit>() { // from class: com.adif.elcanomovil.widget.configuration.ConfigureWidgetFragment$configureViewListeners$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(StationAction stationAction) {
                    invoke2(stationAction);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(StationAction it) {
                    ConfigureWidgetViewModel viewModel;
                    Intrinsics.checkNotNullParameter(it, "it");
                    viewModel = ConfigureWidgetFragment.this.getViewModel();
                    viewModel.handleHeaderButtonTap(it);
                }
            });
        }
        WidgetConfigurationFragmentBinding widgetConfigurationFragmentBinding3 = this.binding;
        if (widgetConfigurationFragmentBinding3 == null || (materialButton = widgetConfigurationFragmentBinding3.creationWidgetButton) == null) {
            return;
        }
        materialButton.setOnClickListener(new a(this, 18));
    }

    public static final void configureViewListeners$lambda$3(ConfigureWidgetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().handleHeaderButtonTap(StationAction.CREATE_WIDGET);
    }

    public final ConfigureWidgetViewModel getViewModel() {
        return (ConfigureWidgetViewModel) this.viewModel.getValue();
    }

    public final void handleSelectedStation(String station) {
        getViewModel().changeStation(station);
    }

    public final void handleSelectedStationTo(String station) {
        getViewModel().changeStationTo(station);
    }

    @Override // com.adif.elcanomovil.widget.configuration.Hilt_ConfigureWidgetFragment, androidx.fragment.app.K
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (getActivity() instanceof ConfigActivityParent) {
            m activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.adif.elcanomovil.widget.ConfigActivityParent");
            this.listener = (ConfigActivityParent) activity;
        }
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.binding = WidgetConfigurationFragmentBinding.bind(view);
        ConfigureWidgetViewModel viewModel = getViewModel();
        m activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.adif.elcanomovil.widget.ConfigActivityParent");
        viewModel.setWidgetId(((ConfigActivityParent) activity).getAppWidgetId());
        configureView();
        configureViewListeners();
        configureObservers();
        AbstractC0544v n4 = l.n(this);
        NavigationExtensionsKt.onDestinationResult(n4, NavArguments.StationSelectionType.STATION.toString(), this, new ConfigureWidgetFragment$onViewCreated$1$1(this));
        NavigationExtensionsKt.onDestinationResult(n4, NavArguments.StationSelectionType.STATION_TO.toString(), this, new ConfigureWidgetFragment$onViewCreated$1$2(this));
    }
}
