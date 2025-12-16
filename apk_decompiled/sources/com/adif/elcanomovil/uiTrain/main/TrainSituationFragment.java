package com.adif.elcanomovil.uiTrain.main;

import Z2.D;
import Z2.G;
import a.AbstractC0105a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.K;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.q0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import b.B;
import b.C;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.extensions.NavigationExtensionsKt;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.commonViews.databinding.LoadingEmptyOrErrorCommonViewBinding;
import com.adif.elcanomovil.commonViews.includeViews.LoadingEmptyOrErrorView;
import com.adif.elcanomovil.domain.entities.StorableTrain;
import com.adif.elcanomovil.uiTrain.R;
import com.adif.elcanomovil.uiTrain.databinding.TrainSituationFragmentBinding;
import com.adif.elcanomovil.uiTrain.entities.Step;
import com.adif.elcanomovil.uiTrain.entities.TrainInfoMapperKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import l0.C0435a;
import o0.AbstractC0544v;
import o0.C0531h;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/main/TrainSituationFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "", "configureViews", "configureObservers", "configureViewListeners", "Lcom/adif/elcanomovil/uiTrain/entities/Step;", "step", "onTapStep", "(Lcom/adif/elcanomovil/uiTrain/entities/Step;)V", "onObservationTapped", "Lcom/adif/elcanomovil/commonViews/includeViews/LoadingEmptyOrErrorView$Status;", "status", "", "title", "message", "updateVisibility", "(Lcom/adif/elcanomovil/commonViews/includeViews/LoadingEmptyOrErrorView$Status;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/adif/elcanomovil/uiTrain/entities/TrainInfo;", NavArguments.ARG_DYNAMIC_TRAIN, "updateResults", "(Lcom/adif/elcanomovil/uiTrain/entities/TrainInfo;)V", "value", "handleSelectedTrain", "(Ljava/lang/String;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/adif/elcanomovil/uiTrain/databinding/TrainSituationFragmentBinding;", "binding", "Lcom/adif/elcanomovil/uiTrain/databinding/TrainSituationFragmentBinding;", "Lcom/adif/elcanomovil/uiTrain/main/TrainSituationFragmentArgs;", "args$delegate", "Lo0/h;", "getArgs", "()Lcom/adif/elcanomovil/uiTrain/main/TrainSituationFragmentArgs;", "args", "Lcom/adif/elcanomovil/uiTrain/main/TrainSituationViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/uiTrain/main/TrainSituationViewModel;", "viewModel", "Lcom/adif/elcanomovil/uiTrain/main/TrainSituationAdapter;", "adapter", "Lcom/adif/elcanomovil/uiTrain/main/TrainSituationAdapter;", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nTrainSituationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainSituationFragment.kt\ncom/adif/elcanomovil/uiTrain/main/TrainSituationFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,357:1\n42#2,3:358\n106#3,15:361\n1#4:376\n*S KotlinDebug\n*F\n+ 1 TrainSituationFragment.kt\ncom/adif/elcanomovil/uiTrain/main/TrainSituationFragment\n*L\n48#1:358,3\n49#1:361,15\n*E\n"})
/* loaded from: classes3.dex */
public final class TrainSituationFragment extends Hilt_TrainSituationFragment {
    private TrainSituationAdapter adapter;

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final C0531h args;
    private TrainSituationFragmentBinding binding;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public TrainSituationFragment() {
        super(R.layout.train_situation_fragment);
        this.args = new C0531h(Reflection.getOrCreateKotlinClass(TrainSituationFragmentArgs.class), new Function0<Bundle>() { // from class: com.adif.elcanomovil.uiTrain.main.TrainSituationFragment$special$$inlined$navArgs$1
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
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.uiTrain.main.TrainSituationFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.uiTrain.main.TrainSituationFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(TrainSituationViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.uiTrain.main.TrainSituationFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.uiTrain.main.TrainSituationFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.uiTrain.main.TrainSituationFragment$special$$inlined$viewModels$default$5
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

    public static final /* synthetic */ void access$handleSelectedTrain(TrainSituationFragment trainSituationFragment, String str) {
        trainSituationFragment.handleSelectedTrain(str);
    }

    public static final /* synthetic */ void access$onObservationTapped(TrainSituationFragment trainSituationFragment, Step step) {
        trainSituationFragment.onObservationTapped(step);
    }

    public static final /* synthetic */ void access$onTapStep(TrainSituationFragment trainSituationFragment, Step step) {
        trainSituationFragment.onTapStep(step);
    }

    private final void configureObservers() {
        getViewModel().getSnackBarInfo().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(6, new e(this, 0)));
        getViewModel().getStationFromName().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(6, new e(this, 1)));
        getViewModel().getStationToName().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(6, new e(this, 2)));
        getViewModel().getTrainCommercialNumber().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(6, new e(this, 3)));
        getViewModel().getTrainCommercialProduct().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(6, new e(this, 4)));
        getViewModel().getTrainOperator().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(6, new e(this, 5)));
        getViewModel().getViewData().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(6, new f(this)));
        getViewModel().getIsFavourite().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(6, new g(this)));
        InterfaceC0266a navigation = getViewModel().getNavigation();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ((b1.f) navigation).a(viewLifecycleOwner, new NavigationHandler(this));
        getViewModel().getShareLink().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(6, new e(this, 6)));
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(q0.h(viewLifecycleOwner2), null, null, new d(this, null), 3, null);
    }

    private final void configureViewListeners() {
        B onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        J viewLifecycleOwner = getViewLifecycleOwner();
        e onBackPressed = new e(this, 7);
        Intrinsics.checkNotNullParameter(onBackPressedDispatcher, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        C onBackPressedCallback = new C(onBackPressed);
        if (viewLifecycleOwner != null) {
            onBackPressedDispatcher.a(viewLifecycleOwner, onBackPressedCallback);
        } else {
            onBackPressedDispatcher.getClass();
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            onBackPressedDispatcher.b(onBackPressedCallback);
        }
        TrainSituationFragmentBinding trainSituationFragmentBinding = this.binding;
        TrainSituationFragmentBinding trainSituationFragmentBinding2 = null;
        if (trainSituationFragmentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            trainSituationFragmentBinding = null;
        }
        final int i = 0;
        trainSituationFragmentBinding.buttonOnback.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiTrain.main.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrainSituationFragment f5401b;

            {
                this.f5401b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                TrainSituationFragment trainSituationFragment = this.f5401b;
                switch (i4) {
                    case 0:
                        TrainSituationFragment.configureViewListeners$lambda$1(trainSituationFragment, view);
                        return;
                    case 1:
                        TrainSituationFragment.configureViewListeners$lambda$2(trainSituationFragment, view);
                        return;
                    case 2:
                        TrainSituationFragment.configureViewListeners$lambda$3(trainSituationFragment, view);
                        return;
                    case 3:
                        TrainSituationFragment.configureViewListeners$lambda$4(trainSituationFragment, view);
                        return;
                    case 4:
                        TrainSituationFragment.configureViewListeners$lambda$5(trainSituationFragment, view);
                        return;
                    case 5:
                        TrainSituationFragment.configureViewListeners$lambda$6(trainSituationFragment, view);
                        return;
                    default:
                        TrainSituationFragment.configureViewListeners$lambda$7(trainSituationFragment, view);
                        return;
                }
            }
        });
        TrainSituationFragmentBinding trainSituationFragmentBinding3 = this.binding;
        if (trainSituationFragmentBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            trainSituationFragmentBinding3 = null;
        }
        final int i4 = 1;
        trainSituationFragmentBinding3.corporateOptions.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiTrain.main.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrainSituationFragment f5401b;

            {
                this.f5401b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                TrainSituationFragment trainSituationFragment = this.f5401b;
                switch (i42) {
                    case 0:
                        TrainSituationFragment.configureViewListeners$lambda$1(trainSituationFragment, view);
                        return;
                    case 1:
                        TrainSituationFragment.configureViewListeners$lambda$2(trainSituationFragment, view);
                        return;
                    case 2:
                        TrainSituationFragment.configureViewListeners$lambda$3(trainSituationFragment, view);
                        return;
                    case 3:
                        TrainSituationFragment.configureViewListeners$lambda$4(trainSituationFragment, view);
                        return;
                    case 4:
                        TrainSituationFragment.configureViewListeners$lambda$5(trainSituationFragment, view);
                        return;
                    case 5:
                        TrainSituationFragment.configureViewListeners$lambda$6(trainSituationFragment, view);
                        return;
                    default:
                        TrainSituationFragment.configureViewListeners$lambda$7(trainSituationFragment, view);
                        return;
                }
            }
        });
        TrainSituationFragmentBinding trainSituationFragmentBinding4 = this.binding;
        if (trainSituationFragmentBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            trainSituationFragmentBinding4 = null;
        }
        final int i5 = 2;
        trainSituationFragmentBinding4.favourite.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiTrain.main.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrainSituationFragment f5401b;

            {
                this.f5401b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i5;
                TrainSituationFragment trainSituationFragment = this.f5401b;
                switch (i42) {
                    case 0:
                        TrainSituationFragment.configureViewListeners$lambda$1(trainSituationFragment, view);
                        return;
                    case 1:
                        TrainSituationFragment.configureViewListeners$lambda$2(trainSituationFragment, view);
                        return;
                    case 2:
                        TrainSituationFragment.configureViewListeners$lambda$3(trainSituationFragment, view);
                        return;
                    case 3:
                        TrainSituationFragment.configureViewListeners$lambda$4(trainSituationFragment, view);
                        return;
                    case 4:
                        TrainSituationFragment.configureViewListeners$lambda$5(trainSituationFragment, view);
                        return;
                    case 5:
                        TrainSituationFragment.configureViewListeners$lambda$6(trainSituationFragment, view);
                        return;
                    default:
                        TrainSituationFragment.configureViewListeners$lambda$7(trainSituationFragment, view);
                        return;
                }
            }
        });
        TrainSituationFragmentBinding trainSituationFragmentBinding5 = this.binding;
        if (trainSituationFragmentBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            trainSituationFragmentBinding5 = null;
        }
        final int i6 = 3;
        trainSituationFragmentBinding5.twitter.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiTrain.main.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrainSituationFragment f5401b;

            {
                this.f5401b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i6;
                TrainSituationFragment trainSituationFragment = this.f5401b;
                switch (i42) {
                    case 0:
                        TrainSituationFragment.configureViewListeners$lambda$1(trainSituationFragment, view);
                        return;
                    case 1:
                        TrainSituationFragment.configureViewListeners$lambda$2(trainSituationFragment, view);
                        return;
                    case 2:
                        TrainSituationFragment.configureViewListeners$lambda$3(trainSituationFragment, view);
                        return;
                    case 3:
                        TrainSituationFragment.configureViewListeners$lambda$4(trainSituationFragment, view);
                        return;
                    case 4:
                        TrainSituationFragment.configureViewListeners$lambda$5(trainSituationFragment, view);
                        return;
                    case 5:
                        TrainSituationFragment.configureViewListeners$lambda$6(trainSituationFragment, view);
                        return;
                    default:
                        TrainSituationFragment.configureViewListeners$lambda$7(trainSituationFragment, view);
                        return;
                }
            }
        });
        TrainSituationFragmentBinding trainSituationFragmentBinding6 = this.binding;
        if (trainSituationFragmentBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            trainSituationFragmentBinding6 = null;
        }
        final int i7 = 4;
        trainSituationFragmentBinding6.share.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiTrain.main.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrainSituationFragment f5401b;

            {
                this.f5401b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i7;
                TrainSituationFragment trainSituationFragment = this.f5401b;
                switch (i42) {
                    case 0:
                        TrainSituationFragment.configureViewListeners$lambda$1(trainSituationFragment, view);
                        return;
                    case 1:
                        TrainSituationFragment.configureViewListeners$lambda$2(trainSituationFragment, view);
                        return;
                    case 2:
                        TrainSituationFragment.configureViewListeners$lambda$3(trainSituationFragment, view);
                        return;
                    case 3:
                        TrainSituationFragment.configureViewListeners$lambda$4(trainSituationFragment, view);
                        return;
                    case 4:
                        TrainSituationFragment.configureViewListeners$lambda$5(trainSituationFragment, view);
                        return;
                    case 5:
                        TrainSituationFragment.configureViewListeners$lambda$6(trainSituationFragment, view);
                        return;
                    default:
                        TrainSituationFragment.configureViewListeners$lambda$7(trainSituationFragment, view);
                        return;
                }
            }
        });
        TrainSituationFragmentBinding trainSituationFragmentBinding7 = this.binding;
        if (trainSituationFragmentBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            trainSituationFragmentBinding7 = null;
        }
        final int i8 = 5;
        trainSituationFragmentBinding7.observations.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiTrain.main.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrainSituationFragment f5401b;

            {
                this.f5401b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i8;
                TrainSituationFragment trainSituationFragment = this.f5401b;
                switch (i42) {
                    case 0:
                        TrainSituationFragment.configureViewListeners$lambda$1(trainSituationFragment, view);
                        return;
                    case 1:
                        TrainSituationFragment.configureViewListeners$lambda$2(trainSituationFragment, view);
                        return;
                    case 2:
                        TrainSituationFragment.configureViewListeners$lambda$3(trainSituationFragment, view);
                        return;
                    case 3:
                        TrainSituationFragment.configureViewListeners$lambda$4(trainSituationFragment, view);
                        return;
                    case 4:
                        TrainSituationFragment.configureViewListeners$lambda$5(trainSituationFragment, view);
                        return;
                    case 5:
                        TrainSituationFragment.configureViewListeners$lambda$6(trainSituationFragment, view);
                        return;
                    default:
                        TrainSituationFragment.configureViewListeners$lambda$7(trainSituationFragment, view);
                        return;
                }
            }
        });
        TrainSituationFragmentBinding trainSituationFragmentBinding8 = this.binding;
        if (trainSituationFragmentBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            trainSituationFragmentBinding2 = trainSituationFragmentBinding8;
        }
        final int i9 = 6;
        trainSituationFragmentBinding2.trainSearch.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiTrain.main.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrainSituationFragment f5401b;

            {
                this.f5401b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i9;
                TrainSituationFragment trainSituationFragment = this.f5401b;
                switch (i42) {
                    case 0:
                        TrainSituationFragment.configureViewListeners$lambda$1(trainSituationFragment, view);
                        return;
                    case 1:
                        TrainSituationFragment.configureViewListeners$lambda$2(trainSituationFragment, view);
                        return;
                    case 2:
                        TrainSituationFragment.configureViewListeners$lambda$3(trainSituationFragment, view);
                        return;
                    case 3:
                        TrainSituationFragment.configureViewListeners$lambda$4(trainSituationFragment, view);
                        return;
                    case 4:
                        TrainSituationFragment.configureViewListeners$lambda$5(trainSituationFragment, view);
                        return;
                    case 5:
                        TrainSituationFragment.configureViewListeners$lambda$6(trainSituationFragment, view);
                        return;
                    default:
                        TrainSituationFragment.configureViewListeners$lambda$7(trainSituationFragment, view);
                        return;
                }
            }
        });
    }

    public static final void configureViewListeners$lambda$1(TrainSituationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().handleBackButtonTapped();
    }

    public static final void configureViewListeners$lambda$2(TrainSituationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().handleCorporationOptionsTapped();
    }

    public static final void configureViewListeners$lambda$3(TrainSituationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().handleFavouriteButtonTapped();
    }

    public static final void configureViewListeners$lambda$4(TrainSituationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().handleNewSubscriptionButtonTapped();
    }

    public static final void configureViewListeners$lambda$5(TrainSituationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().handleShareButtonTapped();
    }

    public static final void configureViewListeners$lambda$6(TrainSituationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().handleObservationsButtonTapped();
    }

    public static final void configureViewListeners$lambda$7(TrainSituationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().handleSearchTapped();
    }

    private final void configureViews() {
        boolean equals;
        this.adapter = new TrainSituationAdapter(new com.adif.elcanomovil.uiDepartures.main.c(1, this, TrainSituationFragment.class, "onTapStep", "onTapStep(Lcom/adif/elcanomovil/uiTrain/entities/Step;)V", 0, 14), new com.adif.elcanomovil.uiDepartures.main.c(1, this, TrainSituationFragment.class, "onObservationTapped", "onObservationTapped(Lcom/adif/elcanomovil/uiTrain/entities/Step;)V", 0, 15));
        TrainSituationFragmentBinding trainSituationFragmentBinding = this.binding;
        if (trainSituationFragmentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            trainSituationFragmentBinding = null;
        }
        RecyclerView recyclerView = trainSituationFragmentBinding.rvSteps;
        TrainSituationAdapter trainSituationAdapter = this.adapter;
        if (trainSituationAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            trainSituationAdapter = null;
        }
        recyclerView.setAdapter(trainSituationAdapter);
        TrainSituationFragmentBinding trainSituationFragmentBinding2 = this.binding;
        if (trainSituationFragmentBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            trainSituationFragmentBinding2 = null;
        }
        trainSituationFragmentBinding2.stationOptions.setVisibility(8);
        TrainSituationFragmentBinding trainSituationFragmentBinding3 = this.binding;
        if (trainSituationFragmentBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            trainSituationFragmentBinding3 = null;
        }
        trainSituationFragmentBinding3.corporateOptions.setVisibility(8);
        TrainSituationFragmentArgs args = getArgs();
        equals = StringsKt__StringsJVMKt.equals(args != null ? args.getCommercialNumber() : null, TrainInfoMapperKt.CERCANIAS, true);
        if (equals) {
            TrainSituationFragmentBinding trainSituationFragmentBinding4 = this.binding;
            if (trainSituationFragmentBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                trainSituationFragmentBinding4 = null;
            }
            trainSituationFragmentBinding4.twitter.setVisibility(8);
        }
        LoadingEmptyOrErrorView loadingEmptyOrErrorView = LoadingEmptyOrErrorView.INSTANCE;
        TrainSituationFragmentBinding trainSituationFragmentBinding5 = this.binding;
        if (trainSituationFragmentBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            trainSituationFragmentBinding5 = null;
        }
        LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorView2 = trainSituationFragmentBinding5.loadingEmptyOrErrorView;
        Intrinsics.checkNotNullExpressionValue(loadingEmptyOrErrorView2, "loadingEmptyOrErrorView");
        LoadingEmptyOrErrorView.Status status = LoadingEmptyOrErrorView.Status.INIT;
        Context context = getContext();
        String string = context != null ? context.getString(R.string.train_situation_empty_title) : null;
        Context context2 = getContext();
        loadingEmptyOrErrorView.updateElementsVisibility(loadingEmptyOrErrorView2, status, string, context2 != null ? context2.getString(R.string.train_situation_empty_message) : null);
    }

    private final TrainSituationFragmentArgs getArgs() {
        return (TrainSituationFragmentArgs) this.args.getValue();
    }

    public final TrainSituationViewModel getViewModel() {
        return (TrainSituationViewModel) this.viewModel.getValue();
    }

    public final void handleSelectedTrain(String value) {
        try {
            StorableTrain storableTrain = (StorableTrain) new G(new D()).a(StorableTrain.class).fromJson(value);
            if (storableTrain != null) {
                getViewModel().onViewsLoaded(null, storableTrain.getOperator(), storableTrain.getCommercialProduct(), storableTrain.getCommercialNumber(), storableTrain.getOriginStationCode(), storableTrain.getDestinationStationCode(), Long.valueOf(storableTrain.getLaunchingDate()), (r22 & 128) != 0 ? false : true, (r22 & 256) != 0 ? null : null);
            }
        } catch (Exception e4) {
            m3.l.g(e4);
        }
    }

    public final void onObservationTapped(Step step) {
        String str;
        TrainSituationViewModel viewModel = getViewModel();
        String notes = step.getNotes();
        Context context = getContext();
        if (context == null || (str = context.getString(R.string.dialog_action_close)) == null) {
            str = "";
        }
        viewModel.handleCirculationObservationTap(notes, str);
    }

    public final void onTapStep(Step step) {
        getViewModel().handleStepTapped(step.getStation());
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateResults(com.adif.elcanomovil.uiTrain.entities.TrainInfo r9) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiTrain.main.TrainSituationFragment.updateResults(com.adif.elcanomovil.uiTrain.entities.TrainInfo):void");
    }

    public final void updateVisibility(LoadingEmptyOrErrorView.Status status, String title, String message) {
        TrainSituationFragmentBinding trainSituationFragmentBinding = this.binding;
        TrainSituationFragmentBinding trainSituationFragmentBinding2 = null;
        if (trainSituationFragmentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            trainSituationFragmentBinding = null;
        }
        trainSituationFragmentBinding.stationOptions.setVisibility(8);
        TrainSituationFragmentBinding trainSituationFragmentBinding3 = this.binding;
        if (trainSituationFragmentBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            trainSituationFragmentBinding3 = null;
        }
        trainSituationFragmentBinding3.clStations.setVisibility(0);
        LoadingEmptyOrErrorView.Status status2 = LoadingEmptyOrErrorView.Status.HIDDEN;
        int i = status != status2 ? 8 : 0;
        TrainSituationFragmentBinding trainSituationFragmentBinding4 = this.binding;
        if (trainSituationFragmentBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            trainSituationFragmentBinding4 = null;
        }
        trainSituationFragmentBinding4.rvStepsHeader.getRoot().setVisibility(i);
        TrainSituationFragmentBinding trainSituationFragmentBinding5 = this.binding;
        if (trainSituationFragmentBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            trainSituationFragmentBinding5 = null;
        }
        trainSituationFragmentBinding5.rvSteps.setVisibility(i);
        TrainSituationFragmentBinding trainSituationFragmentBinding6 = this.binding;
        if (trainSituationFragmentBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            trainSituationFragmentBinding6 = null;
        }
        trainSituationFragmentBinding6.trainComposition.setVisibility(status == status2 ? 0 : 8);
        LoadingEmptyOrErrorView loadingEmptyOrErrorView = LoadingEmptyOrErrorView.INSTANCE;
        TrainSituationFragmentBinding trainSituationFragmentBinding7 = this.binding;
        if (trainSituationFragmentBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            trainSituationFragmentBinding2 = trainSituationFragmentBinding7;
        }
        LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorView2 = trainSituationFragmentBinding2.loadingEmptyOrErrorView;
        Intrinsics.checkNotNullExpressionValue(loadingEmptyOrErrorView2, "loadingEmptyOrErrorView");
        loadingEmptyOrErrorView.updateElementsVisibility(loadingEmptyOrErrorView2, status, title, message);
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        TrainSituationFragmentBinding bind = TrainSituationFragmentBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        configureViews();
        configureObservers();
        configureViewListeners();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(NavArguments.ARG_DYNAMIC_LINKS_FRAGMENT_FROM) : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER) : null;
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString(NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE) : null;
        Bundle arguments4 = getArguments();
        String string4 = arguments4 != null ? arguments4.getString(NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE) : null;
        Bundle arguments5 = getArguments();
        Long valueOf = arguments5 != null ? Long.valueOf(arguments5.getLong(NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE)) : null;
        Bundle arguments6 = getArguments();
        String string5 = arguments6 != null ? arguments6.getString("observation") : null;
        Context context = getContext();
        Bundle arguments7 = getArguments();
        String K3 = AbstractC0105a.K(context, arguments7 != null ? arguments7.getString(NavArguments.ARG_DYNAMIC_LINKS_OPERATOR) : null);
        Context context2 = getContext();
        Bundle arguments8 = getArguments();
        String k4 = AbstractC0105a.k(context2, arguments8 != null ? arguments8.getString(NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT) : null);
        Bundle arguments9 = getArguments();
        if (arguments9 != null) {
            arguments9.clear();
        }
        if (Intrinsics.areEqual(string, NavArguments.ARG_DYNAMIC_MORE_ADIF) && string2 == null) {
            getViewModel().handleSearchTapped();
        }
        getLifecycle().a(getViewModel());
        getViewModel().onViewsLoaded(string, K3, k4, string2, string3, string4, valueOf, (r22 & 128) != 0 ? false : false, (r22 & 256) != 0 ? null : string5);
        try {
            AbstractC0544v findRootNavController = NavigationExtensionsKt.findRootNavController(this);
            NavigationExtensionsKt.onDestinationResult(findRootNavController, NavArguments.RESULT_TRAIN, this, new com.adif.elcanomovil.uiDepartures.main.c(1, this, TrainSituationFragment.class, "handleSelectedTrain", "handleSelectedTrain(Ljava/lang/String;)V", 0, 16));
            NavigationExtensionsKt.onDestinationResult(findRootNavController, NavArguments.RESULT_FILTERS, this, new com.adif.elcanomovil.uiDepartures.main.c(1, getViewModel(), TrainSituationViewModel.class, "handleFilterChanged", "handleFilterChanged(Lcom/adif/elcanomovil/commonNavGraph/arguments/Filter;)V", 0, 17));
        } catch (Exception e4) {
            m3.l.g(e4);
        }
    }
}
