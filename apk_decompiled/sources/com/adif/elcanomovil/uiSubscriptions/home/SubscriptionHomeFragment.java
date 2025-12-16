package com.adif.elcanomovil.uiSubscriptions.home;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import androidx.fragment.app.K;
import androidx.fragment.app.P;
import androidx.lifecycle.C0;
import androidx.lifecycle.C0191l;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.Y;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.C0246x;
import androidx.recyclerview.widget.G;
import androidx.recyclerview.widget.H;
import androidx.recyclerview.widget.L;
import androidx.recyclerview.widget.N;
import androidx.recyclerview.widget.RecyclerView;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.extensions.NavigationExtensionsKt;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.commonViews.data.InfoData;
import com.adif.elcanomovil.commonViews.data.InfoHeaderData;
import com.adif.elcanomovil.commonViews.extensions.ViewKt;
import com.adif.elcanomovil.commonViews.loading.LoadingDialogFragment;
import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.entities.utils.Status;
import com.adif.elcanomovil.uiSubscriptions.R;
import com.adif.elcanomovil.uiSubscriptions.adapters.SubscriptionAdapter;
import com.adif.elcanomovil.uiSubscriptions.databinding.SubscriptionHomeFragmentBinding;
import com.adif.elcanomovil.uiTrain.entities.TrainInfoMapperKt;
import dagger.hilt.android.AndroidEntryPoint;
import g.C0357d;
import g.C0361h;
import g.DialogInterfaceC0362i;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C0435a;
import o0.AbstractC0544v;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/home/SubscriptionHomeFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;", "action", "", "handleDeleteAction", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;)V", "prepareRecycler", "bindViewModel", "", "isLoading", "loading", "(Z)V", "isVisible", "fromFailure", "emptyStatus", "(ZZ)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/adif/elcanomovil/uiSubscriptions/databinding/SubscriptionHomeFragmentBinding;", "binding", "Lcom/adif/elcanomovil/uiSubscriptions/databinding/SubscriptionHomeFragmentBinding;", "Lcom/adif/elcanomovil/uiSubscriptions/home/SubscriptionHomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/uiSubscriptions/home/SubscriptionHomeViewModel;", "viewModel", "", TrainInfoMapperKt.CERCANIAS, "Ljava/lang/String;", "initialDataAvailable", "Z", "Lcom/adif/elcanomovil/uiSubscriptions/adapters/SubscriptionAdapter;", "adapter", "Lcom/adif/elcanomovil/uiSubscriptions/adapters/SubscriptionAdapter;", "Lcom/adif/elcanomovil/commonViews/loading/LoadingDialogFragment;", "loadingDialogFragment", "Lcom/adif/elcanomovil/commonViews/loading/LoadingDialogFragment;", "", "position", "I", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nSubscriptionHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionHomeFragment.kt\ncom/adif/elcanomovil/uiSubscriptions/home/SubscriptionHomeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n106#2,15:324\n1045#3:339\n1045#3:340\n*S KotlinDebug\n*F\n+ 1 SubscriptionHomeFragment.kt\ncom/adif/elcanomovil/uiSubscriptions/home/SubscriptionHomeFragment\n*L\n44#1:324,15\n224#1:339\n263#1:340\n*E\n"})
/* loaded from: classes3.dex */
public final class SubscriptionHomeFragment extends Hilt_SubscriptionHomeFragment {
    private final String CERCANIAS;
    private SubscriptionAdapter adapter;
    private SubscriptionHomeFragmentBinding binding;
    private boolean initialDataAvailable;
    private LoadingDialogFragment loadingDialogFragment;
    private int position;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AlertAction.Style.values().length];
            try {
                iArr[AlertAction.Style.NEGATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlertAction.Style.POSITIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlertAction.Style.NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Status.values().length];
            try {
                iArr2[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Status.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public SubscriptionHomeFragment() {
        super(R.layout.subscription_home_fragment);
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.uiSubscriptions.home.SubscriptionHomeFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.uiSubscriptions.home.SubscriptionHomeFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(SubscriptionHomeViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.uiSubscriptions.home.SubscriptionHomeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.uiSubscriptions.home.SubscriptionHomeFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.uiSubscriptions.home.SubscriptionHomeFragment$special$$inlined$viewModels$default$5
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
        this.CERCANIAS = "cercanias";
        this.position = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [a, java.lang.Object, androidx.recyclerview.widget.n0] */
    private final void bindViewModel() {
        InterfaceC0266a navigation = getViewModel().getNavigation();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ((b1.f) navigation).a(viewLifecycleOwner, new NavigationHandler(this));
        SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding = this.binding;
        SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding2 = null;
        if (subscriptionHomeFragmentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            subscriptionHomeFragmentBinding = null;
        }
        subscriptionHomeFragmentBinding.subscriptionRecyclerview.setAdapter(this.adapter);
        Context requireContext = requireContext();
        new Rect();
        TypedArray obtainStyledAttributes = requireContext.obtainStyledAttributes(C0246x.f3927d);
        if (obtainStyledAttributes.getDrawable(0) == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        D.h.getDrawable(requireContext(), R.drawable.divider);
        SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding3 = this.binding;
        if (subscriptionHomeFragmentBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            subscriptionHomeFragmentBinding3 = null;
        }
        subscriptionHomeFragmentBinding3.subscriptionRecyclerview.getClass();
        SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding4 = this.binding;
        if (subscriptionHomeFragmentBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            subscriptionHomeFragmentBinding4 = null;
        }
        RecyclerView recyclerView = subscriptionHomeFragmentBinding4.subscriptionRecyclerview;
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        ?? obj = new Object();
        obj.f2316a = D.h.getDrawable(context, com.adif.elcanomovil.commonViews.R.drawable.divider);
        recyclerView.i(obj);
        SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding5 = this.binding;
        if (subscriptionHomeFragmentBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            subscriptionHomeFragmentBinding2 = subscriptionHomeFragmentBinding5;
        }
        ((Button) subscriptionHomeFragmentBinding2.emptyView.findViewById(R.id.action_button_retry)).setOnClickListener(new com.adif.elcanomovil.uiSubscriptions.create.a(1));
        getViewModel().getResultCreateSubscription().e(getViewLifecycleOwner(), new C0191l(new c(this)));
        final int i = 0;
        getViewModel().getMuteSubscription().e(getViewLifecycleOwner(), new Y(this) { // from class: com.adif.elcanomovil.uiSubscriptions.home.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionHomeFragment f5355b;

            {
                this.f5355b = this;
            }

            @Override // androidx.lifecycle.Y
            public final void onChanged(Object obj2) {
                int i4 = i;
                SubscriptionHomeFragment subscriptionHomeFragment = this.f5355b;
                switch (i4) {
                    case 0:
                        SubscriptionHomeFragment.bindViewModel$lambda$3(subscriptionHomeFragment, (Pair) obj2);
                        return;
                    case 1:
                        SubscriptionHomeFragment.bindViewModel$lambda$4(subscriptionHomeFragment, (Pair) obj2);
                        return;
                    default:
                        SubscriptionHomeFragment.bindViewModel$lambda$14(subscriptionHomeFragment, (AsyncResult) obj2);
                        return;
                }
            }
        });
        final int i4 = 1;
        getViewModel().getDeleteSubscription().e(getViewLifecycleOwner(), new Y(this) { // from class: com.adif.elcanomovil.uiSubscriptions.home.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionHomeFragment f5355b;

            {
                this.f5355b = this;
            }

            @Override // androidx.lifecycle.Y
            public final void onChanged(Object obj2) {
                int i42 = i4;
                SubscriptionHomeFragment subscriptionHomeFragment = this.f5355b;
                switch (i42) {
                    case 0:
                        SubscriptionHomeFragment.bindViewModel$lambda$3(subscriptionHomeFragment, (Pair) obj2);
                        return;
                    case 1:
                        SubscriptionHomeFragment.bindViewModel$lambda$4(subscriptionHomeFragment, (Pair) obj2);
                        return;
                    default:
                        SubscriptionHomeFragment.bindViewModel$lambda$14(subscriptionHomeFragment, (AsyncResult) obj2);
                        return;
                }
            }
        });
        final int i5 = 2;
        getViewModel().getUserListSubscriptions().e(getViewLifecycleOwner(), new Y(this) { // from class: com.adif.elcanomovil.uiSubscriptions.home.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionHomeFragment f5355b;

            {
                this.f5355b = this;
            }

            @Override // androidx.lifecycle.Y
            public final void onChanged(Object obj2) {
                int i42 = i5;
                SubscriptionHomeFragment subscriptionHomeFragment = this.f5355b;
                switch (i42) {
                    case 0:
                        SubscriptionHomeFragment.bindViewModel$lambda$3(subscriptionHomeFragment, (Pair) obj2);
                        return;
                    case 1:
                        SubscriptionHomeFragment.bindViewModel$lambda$4(subscriptionHomeFragment, (Pair) obj2);
                        return;
                    default:
                        SubscriptionHomeFragment.bindViewModel$lambda$14(subscriptionHomeFragment, (AsyncResult) obj2);
                        return;
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r7v16, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    public static final void bindViewModel$lambda$14(SubscriptionHomeFragment this$0, AsyncResult asyncResult) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = WhenMappings.$EnumSwitchMapping$1[asyncResult.getStatus().ordinal()];
        DialogInterfaceC0362i dialogInterfaceC0362i = null;
        Unit unit2 = null;
        if (i == 1) {
            this$0.loading(false);
            List list = (List) asyncResult.getData();
            if (list == null) {
                unit = null;
            } else {
                if (list.isEmpty()) {
                    emptyStatus$default(this$0, true, false, 2, null);
                    return;
                }
                List<Subscription> reversed = CollectionsKt.reversed(CollectionsKt.sortedWith(list, new Comparator() { // from class: com.adif.elcanomovil.uiSubscriptions.home.SubscriptionHomeFragment$bindViewModel$lambda$14$lambda$6$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t2, T t4) {
                        return ComparisonsKt.compareValues(Boolean.valueOf(((Subscription) t2).getActive()), Boolean.valueOf(((Subscription) t4).getActive()));
                    }
                }));
                emptyStatus$default(this$0, false, false, 2, null);
                SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding = this$0.binding;
                if (subscriptionHomeFragmentBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    subscriptionHomeFragmentBinding = null;
                }
                AbstractC0220h0 adapter = subscriptionHomeFragmentBinding.subscriptionRecyclerview.getAdapter();
                Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.adif.elcanomovil.uiSubscriptions.adapters.SubscriptionAdapter");
                ((SubscriptionAdapter) adapter).update(reversed);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                emptyStatus$default(this$0, true, false, 2, null);
                return;
            }
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            emptyStatus$default(this$0, false, false, 2, null);
            List list2 = (List) asyncResult.getData();
            if (list2 != null) {
                if (!list2.isEmpty()) {
                    List<Subscription> reversed2 = CollectionsKt.reversed(CollectionsKt.sortedWith(list2, new Comparator() { // from class: com.adif.elcanomovil.uiSubscriptions.home.SubscriptionHomeFragment$bindViewModel$lambda$14$lambda$12$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t2, T t4) {
                            return ComparisonsKt.compareValues(Boolean.valueOf(((Subscription) t2).getActive()), Boolean.valueOf(((Subscription) t4).getActive()));
                        }
                    }));
                    this$0.loading(false);
                    this$0.initialDataAvailable = true;
                    SubscriptionAdapter subscriptionAdapter = this$0.adapter;
                    if (subscriptionAdapter != null) {
                        subscriptionAdapter.update(reversed2);
                    }
                }
                unit2 = Unit.INSTANCE;
            }
            if (unit2 == null) {
                this$0.loading(true);
                return;
            }
            return;
        }
        if (!this$0.initialDataAvailable) {
            emptyStatus$default(this$0, true, false, 2, null);
            this$0.loading(false);
            return;
        }
        if (this$0.getContext() != null) {
            P activity = this$0.getActivity();
            if (activity != null) {
                C0361h c0361h = new C0361h(activity);
                int i4 = R.string.generic_error_title;
                String string = this$0.getString(i4);
                C0357d c0357d = c0361h.f6647a;
                c0357d.f6604d = string;
                c0357d.f6606f = this$0.getString(i4);
                String string2 = this$0.getString(R.string.stations_avisa_dialog_positive);
                ?? obj = new Object();
                c0357d.f6607g = string2;
                c0357d.h = obj;
                dialogInterfaceC0362i = c0361h.a();
            }
            if (dialogInterfaceC0362i != null) {
                dialogInterfaceC0362i.show();
            }
        }
    }

    public static final void bindViewModel$lambda$2(View view) {
    }

    public static final void bindViewModel$lambda$3(SubscriptionHomeFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            String string = this$0.getString(R.string.subscription_operation_ok_delete_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ViewKt.showSnackbar(this$0, string, 0);
        }
    }

    public static final void bindViewModel$lambda$4(SubscriptionHomeFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            this$0.getViewModel().loadSubscriptions$ui_subscriptions_proNon_corporateRelease();
            this$0.getViewModel().showErrorDialog();
        } else {
            String string = this$0.getString(R.string.subscription_operation_disable_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ViewKt.showSnackbar(this$0, string, 0);
        }
    }

    private final void emptyStatus(boolean isVisible, boolean fromFailure) {
        SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding = null;
        if (!isVisible) {
            SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding2 = this.binding;
            if (subscriptionHomeFragmentBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                subscriptionHomeFragmentBinding2 = null;
            }
            subscriptionHomeFragmentBinding2.subscriptionRecyclerview.setVisibility(0);
            SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding3 = this.binding;
            if (subscriptionHomeFragmentBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                subscriptionHomeFragmentBinding = subscriptionHomeFragmentBinding3;
            }
            subscriptionHomeFragmentBinding.emptyView.setVisibility(8);
            return;
        }
        SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding4 = this.binding;
        if (subscriptionHomeFragmentBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            subscriptionHomeFragmentBinding4 = null;
        }
        subscriptionHomeFragmentBinding4.subscriptionRecyclerview.setVisibility(8);
        SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding5 = this.binding;
        if (subscriptionHomeFragmentBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            subscriptionHomeFragmentBinding5 = null;
        }
        subscriptionHomeFragmentBinding5.emptyView.setVisibility(0);
        InfoData infoData = new InfoData(null, null, null, 7, null);
        if (fromFailure) {
            infoData.setTitle(getString(R.string.generic_error_title));
            infoData.setMsg(getString(R.string.generic_error_message_subscription));
            infoData.setImage(Integer.valueOf(R.drawable.ic_result_error));
            SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding6 = this.binding;
            if (subscriptionHomeFragmentBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                subscriptionHomeFragmentBinding6 = null;
            }
            ((Button) subscriptionHomeFragmentBinding6.emptyView.findViewById(R.id.action_button_retry)).setVisibility(0);
            SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding7 = this.binding;
            if (subscriptionHomeFragmentBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                subscriptionHomeFragmentBinding = subscriptionHomeFragmentBinding7;
            }
            subscriptionHomeFragmentBinding.emptyView.configureView(infoData);
            return;
        }
        infoData.setTitle(getString(R.string.subscriptions_empty_title));
        infoData.setMsg(getString(R.string.subscriptions_empty_message));
        infoData.setImage(Integer.valueOf(R.drawable.ic_result_empty));
        SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding8 = this.binding;
        if (subscriptionHomeFragmentBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            subscriptionHomeFragmentBinding8 = null;
        }
        ((Button) subscriptionHomeFragmentBinding8.emptyView.findViewById(R.id.action_button_retry)).setVisibility(8);
        SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding9 = this.binding;
        if (subscriptionHomeFragmentBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            subscriptionHomeFragmentBinding = subscriptionHomeFragmentBinding9;
        }
        subscriptionHomeFragmentBinding.emptyView.configureView(infoData);
    }

    public static /* synthetic */ void emptyStatus$default(SubscriptionHomeFragment subscriptionHomeFragment, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 2) != 0) {
            z4 = false;
        }
        subscriptionHomeFragment.emptyStatus(z3, z4);
    }

    public final SubscriptionHomeViewModel getViewModel() {
        return (SubscriptionHomeViewModel) this.viewModel.getValue();
    }

    public final void handleDeleteAction(AlertAction.Style action) {
        int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            getViewModel().loadSubscriptions$ui_subscriptions_proNon_corporateRelease();
        } else {
            getViewModel().handleDeleteAction();
            SubscriptionAdapter subscriptionAdapter = this.adapter;
            if (subscriptionAdapter != null) {
                subscriptionAdapter.removeAt(this.position);
            }
        }
    }

    public final void loading(boolean isLoading) {
        SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding = null;
        if (!isLoading) {
            SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding2 = this.binding;
            if (subscriptionHomeFragmentBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                subscriptionHomeFragmentBinding2 = null;
            }
            R1.d dVar = subscriptionHomeFragmentBinding2.shimmerViewContainer.f5505b;
            ValueAnimator valueAnimator = dVar.f1439e;
            if (valueAnimator != null && valueAnimator.isStarted()) {
                dVar.f1439e.cancel();
            }
            SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding3 = this.binding;
            if (subscriptionHomeFragmentBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                subscriptionHomeFragmentBinding = subscriptionHomeFragmentBinding3;
            }
            subscriptionHomeFragmentBinding.shimmerViewContainer.setVisibility(8);
            return;
        }
        if (this.initialDataAvailable) {
            return;
        }
        SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding4 = this.binding;
        if (subscriptionHomeFragmentBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            subscriptionHomeFragmentBinding4 = null;
        }
        subscriptionHomeFragmentBinding4.shimmerViewContainer.setVisibility(0);
        SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding5 = this.binding;
        if (subscriptionHomeFragmentBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            subscriptionHomeFragmentBinding = subscriptionHomeFragmentBinding5;
        }
        R1.d dVar2 = subscriptionHomeFragmentBinding.shimmerViewContainer.f5505b;
        ValueAnimator valueAnimator2 = dVar2.f1439e;
        if (valueAnimator2 != null) {
            if ((valueAnimator2 == null || !valueAnimator2.isStarted()) && dVar2.getCallback() != null) {
                dVar2.f1439e.start();
            }
        }
    }

    private final void prepareRecycler() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.adapter = new SubscriptionAdapter(requireContext, new f(this));
        N n4 = new N(new SubscriptionHomeFragment$prepareRecycler$swipeHandler$1(this, requireContext()));
        SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding = this.binding;
        if (subscriptionHomeFragmentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            subscriptionHomeFragmentBinding = null;
        }
        RecyclerView recyclerView = subscriptionHomeFragmentBinding.subscriptionRecyclerview;
        RecyclerView recyclerView2 = n4.f3601r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        G g4 = n4.f3609z;
        if (recyclerView2 != null) {
            recyclerView2.e0(n4);
            RecyclerView recyclerView3 = n4.f3601r;
            recyclerView3.f3701q.remove(g4);
            if (recyclerView3.f3703r == g4) {
                recyclerView3.f3703r = null;
            }
            ArrayList arrayList = n4.f3601r.f3652C;
            if (arrayList != null) {
                arrayList.remove(n4);
            }
            ArrayList arrayList2 = n4.p;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                H h = (H) arrayList2.get(0);
                h.f3537g.cancel();
                n4.f3597m.clearView(n4.f3601r, h.f3535e);
            }
            arrayList2.clear();
            n4.f3606w = null;
            VelocityTracker velocityTracker = n4.f3603t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                n4.f3603t = null;
            }
            L l4 = n4.f3608y;
            if (l4 != null) {
                l4.f3560a = false;
                n4.f3608y = null;
            }
            if (n4.f3607x != null) {
                n4.f3607x = null;
            }
        }
        n4.f3601r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            n4.f3592f = resources.getDimension(com.adif.elcanomovil.R.dimen.item_touch_helper_swipe_escape_velocity);
            n4.f3593g = resources.getDimension(com.adif.elcanomovil.R.dimen.item_touch_helper_swipe_escape_max_velocity);
            n4.f3600q = ViewConfiguration.get(n4.f3601r.getContext()).getScaledTouchSlop();
            n4.f3601r.i(n4);
            n4.f3601r.j(g4);
            RecyclerView recyclerView4 = n4.f3601r;
            if (recyclerView4.f3652C == null) {
                recyclerView4.f3652C = new ArrayList();
            }
            recyclerView4.f3652C.add(n4);
            n4.f3608y = new L(n4);
            n4.f3607x = new A.a(n4.f3601r.getContext(), n4.f3608y);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.internal.FunctionReferenceImpl, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.internal.FunctionReferenceImpl, kotlin.jvm.functions.Function1] */
    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        SubscriptionHomeFragmentBinding bind = SubscriptionHomeFragmentBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        if (bind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bind = null;
        }
        bind.fab.setBackgroundColor(getResources().getColor(R.color.darkLight));
        SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding = this.binding;
        if (subscriptionHomeFragmentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            subscriptionHomeFragmentBinding = null;
        }
        subscriptionHomeFragmentBinding.headerSubscriptionHome.updateHeaderInfo(new InfoHeaderData(getString(R.string.subscriptions_home_view_title), Integer.valueOf(R.drawable.ic_arrow_back), null, 4, null));
        SubscriptionHomeFragmentBinding subscriptionHomeFragmentBinding2 = this.binding;
        if (subscriptionHomeFragmentBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            subscriptionHomeFragmentBinding2 = null;
        }
        subscriptionHomeFragmentBinding2.headerSubscriptionHome.setOnBackActionListener(new I1.b(this, 17));
        this.loadingDialogFragment = new LoadingDialogFragment();
        prepareRecycler();
        bindViewModel();
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getString(NavArguments.ARG_TYPE_MUTATE_NOTIFICATION) != null) {
            Bundle arguments2 = getArguments();
            String string = arguments2 != null ? arguments2.getString("o") : null;
            Bundle arguments3 = getArguments();
            String string2 = arguments3 != null ? arguments3.getString("d") : null;
            Bundle arguments4 = getArguments();
            String string3 = arguments4 != null ? arguments4.getString("st") : null;
            Bundle arguments5 = getArguments();
            String string4 = arguments5 != null ? arguments5.getString(NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_END) : null;
            Bundle arguments6 = getArguments();
            String string5 = arguments6 != null ? arguments6.getString(NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_REPEAT) : null;
            Bundle arguments7 = getArguments();
            getViewModel().muteSubscription(string, string2, string3, string4, string5, arguments7 != null ? arguments7.getString(NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN) : null);
        }
        AbstractC0544v findRootNavController = NavigationExtensionsKt.findRootNavController(this);
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        NavigationExtensionsKt.onDestinationResult(findRootNavController, SubscriptionHomeViewModelKt.SUBSCRIPTION_STATUS_ACTION, viewLifecycleOwner, new FunctionReferenceImpl(1, getViewModel(), SubscriptionHomeViewModel.class, "handleStatusAction", "handleStatusAction(Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;)V", 0));
        AbstractC0544v findRootNavController2 = NavigationExtensionsKt.findRootNavController(this);
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        NavigationExtensionsKt.onDestinationResult(findRootNavController2, SubscriptionHomeViewModelKt.SUBSCRIPTION_DELETE_ACTION, viewLifecycleOwner2, new FunctionReferenceImpl(1, this, SubscriptionHomeFragment.class, "handleDeleteAction", "handleDeleteAction(Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;)V", 0));
    }
}
