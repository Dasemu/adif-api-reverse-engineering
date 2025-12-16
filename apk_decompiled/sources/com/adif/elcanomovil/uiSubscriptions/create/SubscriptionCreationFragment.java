package com.adif.elcanomovil.uiSubscriptions.create;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.K;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.y0;
import b1.InterfaceC0266a;
import c1.C0283c;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.extensions.NavigationExtensionsKt;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.commonViews.DayView;
import com.adif.elcanomovil.commonViews.HeaderView;
import com.adif.elcanomovil.commonViews.InfoView;
import com.adif.elcanomovil.commonViews.data.InfoData;
import com.adif.elcanomovil.commonViews.data.InfoHeaderData;
import com.adif.elcanomovil.commonViews.extensions.ViewKt;
import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import com.adif.elcanomovil.enums.SubscriptionType;
import com.adif.elcanomovil.enums.TypeSubscriptionCreationView;
import com.adif.elcanomovil.uiSubscriptions.R;
import com.adif.elcanomovil.uiSubscriptions.create.views.JourneyView;
import com.adif.elcanomovil.uiSubscriptions.create.views.TrainView;
import com.adif.elcanomovil.uiSubscriptions.create.views.data.InfoDataJourney;
import com.adif.elcanomovil.uiSubscriptions.create.views.data.InfoDataTrain;
import com.adif.elcanomovil.uiSubscriptions.create.views.data.SubscriptionCreateViewData;
import com.adif.elcanomovil.uiSubscriptions.databinding.SubscriptionCreationFragmentBinding;
import com.adif.elcanomovil.uiSubscriptions.databinding.ViewAnticipationTimeBinding;
import com.adif.elcanomovil.uiSubscriptions.databinding.ViewRepetitionDaysBinding;
import com.adif.elcanomovil.uiSubscriptions.utils.AnticipationType;
import com.adif.elcanomovil.uiSubscriptions.utils.SubscriptionHelper;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C0435a;
import o0.AbstractC0544v;
import o0.C0531h;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u0019\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\u0003J\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J!\u0010-\u001a\u00020\b2\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\"\u0010H\u001a\u00020G8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/create/SubscriptionCreationFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "station", "handleSelectedStation", "(Ljava/lang/String;)V", "handleSelectedStationTo", "Lcom/adif/elcanomovil/uiSubscriptions/utils/AnticipationType;", "anticipationType", "configureAnticipationTime", "(Lcom/adif/elcanomovil/uiSubscriptions/utils/AnticipationType;)V", "anticipationTime", "paintAnticipationTime", "repetitionDays", "configureRepetitionDays", "days", "paintRepetitionDays", "configureHeader", "Lcom/adif/elcanomovil/uiSubscriptions/create/views/data/SubscriptionCreateViewData;", "subscriptionCreateViewData", "configureJourneyView", "(Lcom/adif/elcanomovil/uiSubscriptions/create/views/data/SubscriptionCreateViewData;)V", "configureTrainView", "bindViewModel", "showMessage", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;", "action", "handleAction", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;)V", "", "value", "showLoading", "(I)V", "", "isVisible", "fromFailure", "emptyStatus", "(ZZ)V", "Lcom/adif/elcanomovil/uiSubscriptions/databinding/SubscriptionCreationFragmentBinding;", "binding", "Lcom/adif/elcanomovil/uiSubscriptions/databinding/SubscriptionCreationFragmentBinding;", "Lcom/adif/elcanomovil/uiSubscriptions/create/SubscriptionCreationViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/uiSubscriptions/create/SubscriptionCreationViewModel;", "viewModel", "Lcom/adif/elcanomovil/enums/TypeSubscriptionCreationView;", "typeOfMode", "Lcom/adif/elcanomovil/enums/TypeSubscriptionCreationView;", "Lcom/adif/elcanomovil/uiSubscriptions/create/views/data/InfoDataJourney;", "infoJourney", "Lcom/adif/elcanomovil/uiSubscriptions/create/views/data/InfoDataJourney;", "Lcom/adif/elcanomovil/uiSubscriptions/create/views/data/InfoDataTrain;", "infoTrain", "Lcom/adif/elcanomovil/uiSubscriptions/create/views/data/InfoDataTrain;", "Lcom/adif/elcanomovil/uiSubscriptions/create/SubscriptionCreationFragmentArgs;", "args$delegate", "Lo0/h;", "getArgs", "()Lcom/adif/elcanomovil/uiSubscriptions/create/SubscriptionCreationFragmentArgs;", "args", "Lc1/c;", "notificationsPermissionRequester", "Lc1/c;", "getNotificationsPermissionRequester", "()Lc1/c;", "setNotificationsPermissionRequester", "(Lc1/c;)V", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nSubscriptionCreationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionCreationFragment.kt\ncom/adif/elcanomovil/uiSubscriptions/create/SubscriptionCreationFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,500:1\n106#2,15:501\n42#3,3:516\n13365#4,2:519\n*S KotlinDebug\n*F\n+ 1 SubscriptionCreationFragment.kt\ncom/adif/elcanomovil/uiSubscriptions/create/SubscriptionCreationFragment\n*L\n38#1:501,15\n44#1:516,3\n277#1:519,2\n*E\n"})
/* loaded from: classes3.dex */
public final class SubscriptionCreationFragment extends Hilt_SubscriptionCreationFragment {

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final C0531h args;
    private SubscriptionCreationFragmentBinding binding;
    private InfoDataJourney infoJourney;
    private InfoDataTrain infoTrain;

    @Inject
    public C0283c notificationsPermissionRequester;
    private TypeSubscriptionCreationView typeOfMode;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[SubscriptionType.values().length];
            try {
                iArr[SubscriptionType.TRAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionType.JOURNEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TypeSubscriptionCreationView.values().length];
            try {
                iArr2[TypeSubscriptionCreationView.MODIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TypeSubscriptionCreationView.CREATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AnticipationType.values().length];
            try {
                iArr3[AnticipationType.TEN_MINUTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[AnticipationType.TWENTY_MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AnticipationType.THIRTY_MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public SubscriptionCreationFragment() {
        super(R.layout.subscription_creation_fragment);
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(SubscriptionCreationViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationFragment$special$$inlined$viewModels$default$5
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
        this.args = new C0531h(Reflection.getOrCreateKotlinClass(SubscriptionCreationFragmentArgs.class), new Function0<Bundle>() { // from class: com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationFragment$special$$inlined$navArgs$1
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
    }

    private final void bindViewModel() {
        MaterialButton materialButton;
        InfoView infoView;
        Button button;
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding = this.binding;
        if (subscriptionCreationFragmentBinding != null && (infoView = subscriptionCreationFragmentBinding.emptyView) != null && (button = (Button) infoView.findViewById(R.id.action_button_retry)) != null) {
            button.setOnClickListener(new a(0));
        }
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding2 = this.binding;
        if (subscriptionCreationFragmentBinding2 != null && (materialButton = subscriptionCreationFragmentBinding2.fab) != null) {
            materialButton.setOnClickListener(new D1.a(this, 17));
        }
        InterfaceC0266a navigation = getViewModel().getNavigation();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ((b1.f) navigation).a(viewLifecycleOwner, new NavigationHandler(this));
        getViewModel().getViewData().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(5, new b(this)));
        getViewModel().getDeleteSubscription().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(5, new c(this, 0)));
        getViewModel().getResultCreateSubscription().e(getViewLifecycleOwner(), new com.adif.elcanomovil.uiAvisa.components.create.l(5, new c(this, 1)));
    }

    public static final void bindViewModel$lambda$17(View view) {
    }

    public static final void bindViewModel$lambda$19(SubscriptionCreationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showLoading(0);
        TypeSubscriptionCreationView typeSubscriptionCreationView = this$0.typeOfMode;
        if (typeSubscriptionCreationView != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[typeSubscriptionCreationView.ordinal()];
            if (i == 1) {
                this$0.getViewModel().modifySusbscription();
            } else {
                if (i != 2) {
                    return;
                }
                this$0.getViewModel().createSusbscription();
            }
        }
    }

    public final void configureAnticipationTime(AnticipationType anticipationType) {
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding = this.binding;
        if (subscriptionCreationFragmentBinding != null) {
            DayView anticipationTimeOne = subscriptionCreationFragmentBinding.anticipationTime.anticipationTimeOne;
            Intrinsics.checkNotNullExpressionValue(anticipationTimeOne, "anticipationTimeOne");
            int i = R.string.anticipation_time_n1;
            String string = getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            DayView.initInfoView$default(anticipationTimeOne, string, string2, false, false, 12, null);
            DayView anticipationTimeTwo = subscriptionCreationFragmentBinding.anticipationTime.anticipationTimeTwo;
            Intrinsics.checkNotNullExpressionValue(anticipationTimeTwo, "anticipationTimeTwo");
            int i4 = R.string.anticipation_time_n2;
            String string3 = getString(i4);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = getString(i4);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            DayView.initInfoView$default(anticipationTimeTwo, string3, string4, false, false, 12, null);
            DayView anticipationTimeThree = subscriptionCreationFragmentBinding.anticipationTime.anticipationTimeThree;
            Intrinsics.checkNotNullExpressionValue(anticipationTimeThree, "anticipationTimeThree");
            int i5 = R.string.anticipation_time_n3;
            String string5 = getString(i5);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            String string6 = getString(i5);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            DayView.initInfoView$default(anticipationTimeThree, string5, string6, false, false, 12, null);
        }
        if (anticipationType != null) {
            paintAnticipationTime(anticipationType);
        }
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding2 = this.binding;
        if (subscriptionCreationFragmentBinding2 != null) {
            subscriptionCreationFragmentBinding2.anticipationTime.anticipationTimeOne.setOnClickListener(new d(subscriptionCreationFragmentBinding2, this, 0));
        }
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding3 = this.binding;
        if (subscriptionCreationFragmentBinding3 != null) {
            subscriptionCreationFragmentBinding3.anticipationTime.anticipationTimeTwo.setOnClickListener(new d(subscriptionCreationFragmentBinding3, this, 1));
        }
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding4 = this.binding;
        if (subscriptionCreationFragmentBinding4 != null) {
            subscriptionCreationFragmentBinding4.anticipationTime.anticipationTimeThree.setOnClickListener(new d(subscriptionCreationFragmentBinding4, this, 2));
        }
    }

    private final void configureHeader() {
        HeaderView headerView;
        HeaderView headerView2;
        HeaderView headerView3;
        HeaderView headerView4;
        if (this.typeOfMode == TypeSubscriptionCreationView.MODIFICATION) {
            SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding = this.binding;
            if (subscriptionCreationFragmentBinding != null && (headerView4 = subscriptionCreationFragmentBinding.headerSubscriptionHome) != null) {
                headerView4.updateHeaderInfo(new InfoHeaderData(getString(R.string.subscriptions_create_view_title), Integer.valueOf(R.drawable.ic_arrow_back), Integer.valueOf(R.drawable.ic_delete_white)));
            }
            SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding2 = this.binding;
            if (subscriptionCreationFragmentBinding2 != null && (headerView3 = subscriptionCreationFragmentBinding2.headerSubscriptionHome) != null) {
                headerView3.setOnCloseActionListener(new c(this, 2));
            }
        } else {
            SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding3 = this.binding;
            if (subscriptionCreationFragmentBinding3 != null && (headerView = subscriptionCreationFragmentBinding3.headerSubscriptionHome) != null) {
                headerView.updateHeaderInfo(new InfoHeaderData(getString(R.string.subscriptions_create_view_title), Integer.valueOf(R.drawable.ic_arrow_back), null, 4, null));
            }
        }
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding4 = this.binding;
        if (subscriptionCreationFragmentBinding4 == null || (headerView2 = subscriptionCreationFragmentBinding4.headerSubscriptionHome) == null) {
            return;
        }
        headerView2.setOnBackActionListener(new c(this, 3));
    }

    public final void configureJourneyView(SubscriptionCreateViewData subscriptionCreateViewData) {
        JourneyView journeyView;
        JourneyView journeyView2;
        JourneyView journeyView3;
        JourneyView journeyView4;
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding = this.binding;
        JourneyView journeyView5 = subscriptionCreationFragmentBinding != null ? subscriptionCreationFragmentBinding.headerJourneyView : null;
        if (journeyView5 != null) {
            journeyView5.setVisibility(0);
        }
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding2 = this.binding;
        TrainView trainView = subscriptionCreationFragmentBinding2 != null ? subscriptionCreationFragmentBinding2.headerTrainView : null;
        if (trainView != null) {
            trainView.setVisibility(8);
        }
        this.infoJourney = new InfoDataJourney(subscriptionCreateViewData.getStationName(), subscriptionCreateViewData.getStationToName(), Boolean.valueOf(subscriptionCreateViewData.isCercanias()), subscriptionCreateViewData.getCenterTime());
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding3 = this.binding;
        if (subscriptionCreationFragmentBinding3 != null && (journeyView4 = subscriptionCreationFragmentBinding3.headerJourneyView) != null) {
            journeyView4.setOnJourneyTimeFromListener(new c(this, 4));
        }
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding4 = this.binding;
        if (subscriptionCreationFragmentBinding4 != null && (journeyView3 = subscriptionCreationFragmentBinding4.headerJourneyView) != null) {
            journeyView3.configureView(this.infoJourney, this.typeOfMode);
        }
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding5 = this.binding;
        if (subscriptionCreationFragmentBinding5 != null && (journeyView2 = subscriptionCreationFragmentBinding5.headerJourneyView) != null) {
            journeyView2.setOnJourneyActionListener(new c(this, 5));
        }
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding6 = this.binding;
        if (subscriptionCreationFragmentBinding6 == null || (journeyView = subscriptionCreationFragmentBinding6.headerJourneyView) == null) {
            return;
        }
        journeyView.setOnTypeSelectionListener(new c(this, 6));
    }

    public final void configureRepetitionDays(String repetitionDays) {
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding = this.binding;
        if (subscriptionCreationFragmentBinding != null) {
            DayView dayOne = subscriptionCreationFragmentBinding.repetitionTime.dayOne;
            Intrinsics.checkNotNullExpressionValue(dayOne, "dayOne");
            String string = getString(R.string.common_weekday_monday);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = getString(R.string.accessibility_weekday_monday);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            DayView.initInfoView$default(dayOne, string, string2, false, false, 12, null);
            DayView dayTwo = subscriptionCreationFragmentBinding.repetitionTime.dayTwo;
            Intrinsics.checkNotNullExpressionValue(dayTwo, "dayTwo");
            String string3 = getString(R.string.common_weekday_tuesday);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = getString(R.string.accessibility_weekday_tuesday);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            DayView.initInfoView$default(dayTwo, string3, string4, false, false, 12, null);
            DayView dayThree = subscriptionCreationFragmentBinding.repetitionTime.dayThree;
            Intrinsics.checkNotNullExpressionValue(dayThree, "dayThree");
            String string5 = getString(R.string.common_weekday_wednesday);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            String string6 = getString(R.string.accessibility_weekday_wednesday);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            DayView.initInfoView$default(dayThree, string5, string6, false, false, 12, null);
            DayView dayFour = subscriptionCreationFragmentBinding.repetitionTime.dayFour;
            Intrinsics.checkNotNullExpressionValue(dayFour, "dayFour");
            String string7 = getString(R.string.common_weekday_thursday);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            String string8 = getString(R.string.accessibility_weekday_thursday);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            DayView.initInfoView$default(dayFour, string7, string8, false, false, 12, null);
            DayView dayFive = subscriptionCreationFragmentBinding.repetitionTime.dayFive;
            Intrinsics.checkNotNullExpressionValue(dayFive, "dayFive");
            String string9 = getString(R.string.common_weekday_friday);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            String string10 = getString(R.string.accessibility_weekday_friday);
            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
            DayView.initInfoView$default(dayFive, string9, string10, false, false, 12, null);
            DayView daySix = subscriptionCreationFragmentBinding.repetitionTime.daySix;
            Intrinsics.checkNotNullExpressionValue(daySix, "daySix");
            String string11 = getString(R.string.common_weekday_saturday);
            Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
            String string12 = getString(R.string.accessibility_weekday_saturday);
            Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
            DayView.initInfoView$default(daySix, string11, string12, false, false, 12, null);
            DayView daySeven = subscriptionCreationFragmentBinding.repetitionTime.daySeven;
            Intrinsics.checkNotNullExpressionValue(daySeven, "daySeven");
            String string13 = getString(R.string.common_weekday_sunday);
            Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
            String string14 = getString(R.string.accessibility_weekday_sunday);
            Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
            DayView.initInfoView$default(daySeven, string13, string14, false, false, 12, null);
        }
        if (repetitionDays != null) {
            paintRepetitionDays(repetitionDays);
        }
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding2 = this.binding;
        if (subscriptionCreationFragmentBinding2 != null) {
            subscriptionCreationFragmentBinding2.repetitionTime.dayOne.setOnClickListener(new e(this, 0));
            subscriptionCreationFragmentBinding2.repetitionTime.dayTwo.setOnClickListener(new e(this, 1));
            subscriptionCreationFragmentBinding2.repetitionTime.dayThree.setOnClickListener(new e(this, 2));
            subscriptionCreationFragmentBinding2.repetitionTime.dayFour.setOnClickListener(new e(this, 3));
            subscriptionCreationFragmentBinding2.repetitionTime.dayFive.setOnClickListener(new e(this, 4));
            subscriptionCreationFragmentBinding2.repetitionTime.daySix.setOnClickListener(new e(this, 5));
            subscriptionCreationFragmentBinding2.repetitionTime.daySeven.setOnClickListener(new e(this, 6));
        }
    }

    public final void configureTrainView(SubscriptionCreateViewData subscriptionCreateViewData) {
        ViewAnticipationTimeBinding viewAnticipationTimeBinding;
        TrainView trainView;
        TrainView trainView2;
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding = this.binding;
        TextView textView = null;
        TrainView trainView3 = subscriptionCreationFragmentBinding != null ? subscriptionCreationFragmentBinding.headerTrainView : null;
        if (trainView3 != null) {
            trainView3.setVisibility(0);
        }
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding2 = this.binding;
        JourneyView journeyView = subscriptionCreationFragmentBinding2 != null ? subscriptionCreationFragmentBinding2.headerJourneyView : null;
        if (journeyView != null) {
            journeyView.setVisibility(8);
        }
        InfoDataTrain infoDataTrain = new InfoDataTrain(subscriptionCreateViewData.getStationName(), subscriptionCreateViewData.getCodeTrain(), subscriptionCreateViewData.getStationName(), subscriptionCreateViewData.getCenterTime(), subscriptionCreateViewData.getOperator(), subscriptionCreateViewData.getCommercialProduct());
        this.infoTrain = infoDataTrain;
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding3 = this.binding;
        if (subscriptionCreationFragmentBinding3 != null && (trainView2 = subscriptionCreationFragmentBinding3.headerTrainView) != null) {
            trainView2.configureView(infoDataTrain);
        }
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding4 = this.binding;
        if (subscriptionCreationFragmentBinding4 != null && (trainView = subscriptionCreationFragmentBinding4.headerTrainView) != null) {
            trainView.setOnTrainActionListener(new c(this, 7));
        }
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding5 = this.binding;
        if (subscriptionCreationFragmentBinding5 != null && (viewAnticipationTimeBinding = subscriptionCreationFragmentBinding5.anticipationTime) != null) {
            textView = viewAnticipationTimeBinding.textViewActicipationTime;
        }
        if (textView == null) {
            return;
        }
        textView.setText(getString(R.string.text_duration_train));
    }

    private final void emptyStatus(boolean isVisible, boolean fromFailure) {
        View view;
        InfoView infoView;
        InfoView infoView2;
        InfoView infoView3;
        InfoView infoView4;
        if (!isVisible) {
            SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding = this.binding;
            view = subscriptionCreationFragmentBinding != null ? subscriptionCreationFragmentBinding.emptyView : null;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding2 = this.binding;
        InfoView infoView5 = subscriptionCreationFragmentBinding2 != null ? subscriptionCreationFragmentBinding2.emptyView : null;
        if (infoView5 != null) {
            infoView5.setVisibility(0);
        }
        InfoData infoData = new InfoData(null, null, null, 7, null);
        if (fromFailure) {
            infoData.setTitle(getString(R.string.generic_error_title));
            infoData.setMsg(getString(R.string.generic_error_message_subscription));
            infoData.setImage(Integer.valueOf(R.drawable.ic_result_error));
            SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding3 = this.binding;
            Button button = (subscriptionCreationFragmentBinding3 == null || (infoView4 = subscriptionCreationFragmentBinding3.emptyView) == null) ? null : (Button) infoView4.findViewById(R.id.action_button_retry);
            if (button != null) {
                button.setVisibility(0);
            }
            SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding4 = this.binding;
            view = subscriptionCreationFragmentBinding4 != null ? subscriptionCreationFragmentBinding4.fab : null;
            if (view != null) {
                view.setVisibility(4);
            }
            SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding5 = this.binding;
            if (subscriptionCreationFragmentBinding5 == null || (infoView3 = subscriptionCreationFragmentBinding5.emptyView) == null) {
                return;
            }
            infoView3.configureView(infoData);
            return;
        }
        infoData.setTitle(getString(R.string.subscriptions_empty_title));
        infoData.setMsg(getString(R.string.subscriptions_empty_message));
        infoData.setImage(Integer.valueOf(R.drawable.ic_result_empty));
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding6 = this.binding;
        Button button2 = (subscriptionCreationFragmentBinding6 == null || (infoView2 = subscriptionCreationFragmentBinding6.emptyView) == null) ? null : (Button) infoView2.findViewById(R.id.action_button_retry);
        if (button2 != null) {
            button2.setVisibility(8);
        }
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding7 = this.binding;
        view = subscriptionCreationFragmentBinding7 != null ? subscriptionCreationFragmentBinding7.fab : null;
        if (view != null) {
            view.setVisibility(0);
        }
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding8 = this.binding;
        if (subscriptionCreationFragmentBinding8 == null || (infoView = subscriptionCreationFragmentBinding8.emptyView) == null) {
            return;
        }
        infoView.configureView(infoData);
    }

    public static /* synthetic */ void emptyStatus$default(SubscriptionCreationFragment subscriptionCreationFragment, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 2) != 0) {
            z4 = false;
        }
        subscriptionCreationFragment.emptyStatus(z3, z4);
    }

    private final SubscriptionCreationFragmentArgs getArgs() {
        return (SubscriptionCreationFragmentArgs) this.args.getValue();
    }

    public final SubscriptionCreationViewModel getViewModel() {
        return (SubscriptionCreationViewModel) this.viewModel.getValue();
    }

    public final void handleAction(AlertAction.Style action) {
        requireActivity().onBackPressed();
        requireActivity().onBackPressed();
    }

    public final void handleSelectedStation(String station) {
        getViewModel().changeStation(station);
    }

    public final void handleSelectedStationTo(String station) {
        getViewModel().changeStationTo(station);
    }

    private final void paintAnticipationTime(AnticipationType anticipationTime) {
        ViewAnticipationTimeBinding viewAnticipationTimeBinding;
        DayView dayView;
        ViewAnticipationTimeBinding viewAnticipationTimeBinding2;
        DayView dayView2;
        ViewAnticipationTimeBinding viewAnticipationTimeBinding3;
        DayView dayView3;
        if (anticipationTime != null) {
            int i = WhenMappings.$EnumSwitchMapping$2[anticipationTime.ordinal()];
            if (i == 1) {
                SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding = this.binding;
                if (subscriptionCreationFragmentBinding == null || (viewAnticipationTimeBinding = subscriptionCreationFragmentBinding.anticipationTime) == null || (dayView = viewAnticipationTimeBinding.anticipationTimeOne) == null) {
                    return;
                }
                Intrinsics.checkNotNull(dayView);
                Context requireContext = requireContext();
                int i4 = R.string.anticipation_time_n1;
                String string = requireContext.getString(i4);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = requireContext().getString(i4);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                DayView.initInfoView$default(dayView, string, string2, true, false, 8, null);
                return;
            }
            if (i == 2) {
                SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding2 = this.binding;
                if (subscriptionCreationFragmentBinding2 == null || (viewAnticipationTimeBinding2 = subscriptionCreationFragmentBinding2.anticipationTime) == null || (dayView2 = viewAnticipationTimeBinding2.anticipationTimeTwo) == null) {
                    return;
                }
                Intrinsics.checkNotNull(dayView2);
                Context requireContext2 = requireContext();
                int i5 = R.string.anticipation_time_n2;
                String string3 = requireContext2.getString(i5);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = requireContext().getString(i5);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                DayView.initInfoView$default(dayView2, string3, string4, true, false, 8, null);
                return;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding3 = this.binding;
            if (subscriptionCreationFragmentBinding3 == null || (viewAnticipationTimeBinding3 = subscriptionCreationFragmentBinding3.anticipationTime) == null || (dayView3 = viewAnticipationTimeBinding3.anticipationTimeThree) == null) {
                return;
            }
            Intrinsics.checkNotNull(dayView3);
            Context requireContext3 = requireContext();
            int i6 = R.string.anticipation_time_n3;
            String string5 = requireContext3.getString(i6);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            String string6 = requireContext().getString(i6);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            DayView.initInfoView$default(dayView3, string5, string6, true, false, 8, null);
        }
    }

    private final void paintRepetitionDays(String days) {
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding;
        ViewRepetitionDaysBinding viewRepetitionDaysBinding;
        DayView dayView;
        ViewRepetitionDaysBinding viewRepetitionDaysBinding2;
        DayView dayView2;
        ViewRepetitionDaysBinding viewRepetitionDaysBinding3;
        DayView dayView3;
        ViewRepetitionDaysBinding viewRepetitionDaysBinding4;
        DayView dayView4;
        ViewRepetitionDaysBinding viewRepetitionDaysBinding5;
        DayView dayView5;
        ViewRepetitionDaysBinding viewRepetitionDaysBinding6;
        DayView dayView6;
        ViewRepetitionDaysBinding viewRepetitionDaysBinding7;
        DayView dayView7;
        if (days != null) {
            Intrinsics.checkNotNullParameter(days, "str");
            char[] charArray = days.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            for (char c4 : charArray) {
                char upperCase = Character.toUpperCase(c4);
                if (upperCase == 'L') {
                    SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding2 = this.binding;
                    if (subscriptionCreationFragmentBinding2 != null && (viewRepetitionDaysBinding7 = subscriptionCreationFragmentBinding2.repetitionTime) != null && (dayView7 = viewRepetitionDaysBinding7.dayOne) != null) {
                        Intrinsics.checkNotNull(dayView7);
                        String string = requireContext().getString(R.string.common_weekday_monday);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        String string2 = requireContext().getString(R.string.accessibility_weekday_monday);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        DayView.initInfoView$default(dayView7, string, string2, true, false, 8, null);
                    }
                } else if (upperCase == 'M') {
                    SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding3 = this.binding;
                    if (subscriptionCreationFragmentBinding3 != null && (viewRepetitionDaysBinding6 = subscriptionCreationFragmentBinding3.repetitionTime) != null && (dayView6 = viewRepetitionDaysBinding6.dayTwo) != null) {
                        Intrinsics.checkNotNull(dayView6);
                        String string3 = requireContext().getString(R.string.common_weekday_tuesday);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        String string4 = requireContext().getString(R.string.accessibility_weekday_tuesday);
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                        DayView.initInfoView$default(dayView6, string3, string4, true, false, 8, null);
                    }
                } else if (upperCase == 'X') {
                    SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding4 = this.binding;
                    if (subscriptionCreationFragmentBinding4 != null && (viewRepetitionDaysBinding5 = subscriptionCreationFragmentBinding4.repetitionTime) != null && (dayView5 = viewRepetitionDaysBinding5.dayThree) != null) {
                        Intrinsics.checkNotNull(dayView5);
                        String string5 = requireContext().getString(R.string.common_weekday_wednesday);
                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                        String string6 = requireContext().getString(R.string.accessibility_weekday_wednesday);
                        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                        DayView.initInfoView$default(dayView5, string5, string6, true, false, 8, null);
                    }
                } else if (upperCase == 'J') {
                    SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding5 = this.binding;
                    if (subscriptionCreationFragmentBinding5 != null && (viewRepetitionDaysBinding4 = subscriptionCreationFragmentBinding5.repetitionTime) != null && (dayView4 = viewRepetitionDaysBinding4.dayFour) != null) {
                        Intrinsics.checkNotNull(dayView4);
                        String string7 = requireContext().getString(R.string.common_weekday_thursday);
                        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                        String string8 = requireContext().getString(R.string.accessibility_weekday_thursday);
                        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                        DayView.initInfoView$default(dayView4, string7, string8, true, false, 8, null);
                    }
                } else if (upperCase == 'V') {
                    SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding6 = this.binding;
                    if (subscriptionCreationFragmentBinding6 != null && (viewRepetitionDaysBinding3 = subscriptionCreationFragmentBinding6.repetitionTime) != null && (dayView3 = viewRepetitionDaysBinding3.dayFive) != null) {
                        Intrinsics.checkNotNull(dayView3);
                        String string9 = requireContext().getString(R.string.common_weekday_friday);
                        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                        String string10 = requireContext().getString(R.string.accessibility_weekday_friday);
                        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                        DayView.initInfoView$default(dayView3, string9, string10, true, false, 8, null);
                    }
                } else if (upperCase == 'S') {
                    SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding7 = this.binding;
                    if (subscriptionCreationFragmentBinding7 != null && (viewRepetitionDaysBinding2 = subscriptionCreationFragmentBinding7.repetitionTime) != null && (dayView2 = viewRepetitionDaysBinding2.daySix) != null) {
                        Intrinsics.checkNotNull(dayView2);
                        String string11 = requireContext().getString(R.string.common_weekday_saturday);
                        Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                        String string12 = requireContext().getString(R.string.accessibility_weekday_saturday);
                        Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                        DayView.initInfoView$default(dayView2, string11, string12, true, false, 8, null);
                    }
                } else if (upperCase == 'D' && (subscriptionCreationFragmentBinding = this.binding) != null && (viewRepetitionDaysBinding = subscriptionCreationFragmentBinding.repetitionTime) != null && (dayView = viewRepetitionDaysBinding.daySeven) != null) {
                    Intrinsics.checkNotNull(dayView);
                    String string13 = requireContext().getString(R.string.common_weekday_sunday);
                    Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                    String string14 = requireContext().getString(R.string.accessibility_weekday_sunday);
                    Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                    DayView.initInfoView$default(dayView, string13, string14, true, false, 8, null);
                }
            }
        }
    }

    public final void showLoading(int value) {
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding = this.binding;
        ConstraintLayout constraintLayout = subscriptionCreationFragmentBinding != null ? subscriptionCreationFragmentBinding.layoutProgressSubscription : null;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(value);
        }
        SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding2 = this.binding;
        ProgressBar progressBar = subscriptionCreationFragmentBinding2 != null ? subscriptionCreationFragmentBinding2.progressSubscription : null;
        if (progressBar == null) {
            return;
        }
        progressBar.setVisibility(value);
    }

    public final void showMessage() {
        TypeSubscriptionCreationView typeSubscriptionCreationView = this.typeOfMode;
        int i = typeSubscriptionCreationView == null ? -1 : WhenMappings.$EnumSwitchMapping$1[typeSubscriptionCreationView.ordinal()];
        if (i == 1) {
            String string = getString(R.string.edit_subscription_success_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ViewKt.showSnackbar$default(this, string, 0, 2, null);
        } else if (i == 2) {
            String string2 = getString(R.string.create_subscription_success_message);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            ViewKt.showSnackbar$default(this, string2, 0, 2, null);
        }
        requireActivity().onBackPressed();
    }

    public final C0283c getNotificationsPermissionRequester() {
        C0283c c0283c = this.notificationsPermissionRequester;
        if (c0283c != null) {
            return c0283c;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationsPermissionRequester");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [kotlin.jvm.internal.FunctionReferenceImpl, kotlin.jvm.functions.Function1] */
    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i;
        String centerTime;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.binding = SubscriptionCreationFragmentBinding.bind(view);
        int argTypeSubscription = getArgs().getArgTypeSubscription();
        TypeSubscriptionCreationView invoke = TypeSubscriptionCreationView.INSTANCE.invoke(getArgs().getArgTypeScreen());
        this.typeOfMode = invoke;
        int i4 = invoke == null ? -1 : WhenMappings.$EnumSwitchMapping$1[invoke.ordinal()];
        if (i4 == 1) {
            Subscription subscription = (Subscription) new Q2.d().b(Subscription.class, getArgs().getArgDataSubscription());
            SubscriptionCreateViewData createSubscriptionViewData = SubscriptionHelper.INSTANCE.createSubscriptionViewData(subscription);
            if (createSubscriptionViewData != null) {
                SubscriptionCreationFragmentBinding subscriptionCreationFragmentBinding = this.binding;
                MaterialButton materialButton = subscriptionCreationFragmentBinding != null ? subscriptionCreationFragmentBinding.fab : null;
                if (materialButton != null) {
                    materialButton.setText(getString(R.string.action_button_edit_subscription));
                }
                getViewModel().setTypeOfMode(this.typeOfMode);
                getViewModel().configure(createSubscriptionViewData);
                getViewModel().subscriptionData(subscription);
                configureAnticipationTime(createSubscriptionViewData.getAnticipationTime());
                configureRepetitionDays(createSubscriptionViewData.getRepetitionDays());
            }
            SubscriptionType invoke2 = SubscriptionType.INSTANCE.invoke(argTypeSubscription);
            i = invoke2 != null ? WhenMappings.$EnumSwitchMapping$0[invoke2.ordinal()] : -1;
            if (i != 1) {
                if (i == 2) {
                    configureAnticipationTime(createSubscriptionViewData != null ? createSubscriptionViewData.getAnticipationTime() : null);
                }
            } else if (createSubscriptionViewData != null && (centerTime = createSubscriptionViewData.getCenterTime()) != null) {
                createSubscriptionViewData.setAnticipationTime(AnticipationType.INSTANCE.invoke(Integer.parseInt(centerTime)));
            }
        } else if (i4 == 2) {
            this.typeOfMode = TypeSubscriptionCreationView.CREATION;
            SubscriptionType invoke3 = SubscriptionType.INSTANCE.invoke(argTypeSubscription);
            i = invoke3 != null ? WhenMappings.$EnumSwitchMapping$0[invoke3.ordinal()] : -1;
            if (i == 1) {
                SubscriptionCreationViewModel viewModel = getViewModel();
                String argStationCodeSubscription = getArgs().getArgStationCodeSubscription();
                String argStationToCodeSubscription = getArgs().getArgStationToCodeSubscription();
                String argTrainCodeSubscription = getArgs().getArgTrainCodeSubscription();
                String argTrainDateSubscription = getArgs().getArgTrainDateSubscription();
                viewModel.configureTrain(argStationCodeSubscription, argStationToCodeSubscription, argTrainCodeSubscription, argTrainDateSubscription != null ? Long.valueOf(Long.parseLong(argTrainDateSubscription)) : null, AnticipationType.TEN_MINUTES, getArgs().getArgOperatorTrain(), getArgs().getArgCommercialProductTrain());
            } else if (i == 2) {
                getViewModel().configure(Boolean.valueOf(getArgs().getArgIsCercaniasSubscription()), getArgs().getArgStationCodeSubscription(), getArgs().getArgStationToCodeSubscription(), AnticipationType.TEN_MINUTES);
            }
        }
        configureHeader();
        bindViewModel();
        AbstractC0544v findRootNavController = NavigationExtensionsKt.findRootNavController(this);
        String obj = NavArguments.StationSelectionType.STATION.toString();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        NavigationExtensionsKt.onDestinationResult(findRootNavController, obj, viewLifecycleOwner, new com.adif.elcanomovil.uiDepartures.main.c(1, this, SubscriptionCreationFragment.class, "handleSelectedStation", "handleSelectedStation(Ljava/lang/String;)V", 0, 12));
        String obj2 = NavArguments.StationSelectionType.STATION_TO.toString();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        NavigationExtensionsKt.onDestinationResult(findRootNavController, obj2, viewLifecycleOwner2, new com.adif.elcanomovil.uiDepartures.main.c(1, this, SubscriptionCreationFragment.class, "handleSelectedStationTo", "handleSelectedStationTo(Ljava/lang/String;)V", 0, 13));
        AbstractC0544v findRootNavController2 = NavigationExtensionsKt.findRootNavController(this);
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        NavigationExtensionsKt.onDestinationResult(findRootNavController2, SubscriptionCreationViewModelKt.SUBSCRIPTION_GENERIC_ACTION, viewLifecycleOwner3, new FunctionReferenceImpl(1, this, SubscriptionCreationFragment.class, "handleAction", "handleAction(Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;)V", 0));
        getNotificationsPermissionRequester().a(null);
    }

    public final void setNotificationsPermissionRequester(C0283c c0283c) {
        Intrinsics.checkNotNullParameter(c0283c, "<set-?>");
        this.notificationsPermissionRequester = c0283c;
    }
}
