package com.adif.elcanomovil.uiAvisa.components.home;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.K;
import androidx.fragment.app.P;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.C0246x;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.commonViews.data.InfoData;
import com.adif.elcanomovil.commonViews.data.InfoHeaderData;
import com.adif.elcanomovil.domain.entities.avisa.incidence.Incidence;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceStation;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.entities.utils.Status;
import com.adif.elcanomovil.uiAvisa.R;
import com.adif.elcanomovil.uiAvisa.components.home.IssuesAdapter;
import com.adif.elcanomovil.uiAvisa.databinding.FragmentAvisaHomeBinding;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C0435a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/home/AvisaHomeFragment;", "Landroidx/fragment/app/K;", "Lcom/adif/elcanomovil/uiAvisa/components/home/IssuesAdapter$OnIssueListFragmentInteractionListener;", "<init>", "()V", "", "bindViewModel", "getIncidences", "subscribeToIncidences", "", "isLoading", "loading", "(Z)V", "isVisible", "fromFailure", "emptyStatus", "(ZZ)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/Incidence;", "issue", "onIssueInteraction", "(Lcom/adif/elcanomovil/domain/entities/avisa/incidence/Incidence;)V", "Lcom/adif/elcanomovil/uiAvisa/databinding/FragmentAvisaHomeBinding;", "binding", "Lcom/adif/elcanomovil/uiAvisa/databinding/FragmentAvisaHomeBinding;", "Lcom/adif/elcanomovil/uiAvisa/components/home/AvisaHomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/uiAvisa/components/home/AvisaHomeViewModel;", "viewModel", "initialDataAvailable", "Z", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nAvisaHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvisaHomeFragment.kt\ncom/adif/elcanomovil/uiAvisa/components/home/AvisaHomeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,209:1\n106#2,15:210\n1045#3:225\n1549#3:226\n1620#3,3:227\n*S KotlinDebug\n*F\n+ 1 AvisaHomeFragment.kt\ncom/adif/elcanomovil/uiAvisa/components/home/AvisaHomeFragment\n*L\n26#1:210,15\n124#1:225\n126#1:226\n126#1:227,3\n*E\n"})
/* loaded from: classes.dex */
public final class AvisaHomeFragment extends Hilt_AvisaHomeFragment implements IssuesAdapter.OnIssueListFragmentInteractionListener {
    private FragmentAvisaHomeBinding binding;
    private boolean initialDataAvailable;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AvisaHomeFragment() {
        super(R.layout.fragment_avisa_home);
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.uiAvisa.components.home.AvisaHomeFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.uiAvisa.components.home.AvisaHomeFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(AvisaHomeViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.uiAvisa.components.home.AvisaHomeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.uiAvisa.components.home.AvisaHomeFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.uiAvisa.components.home.AvisaHomeFragment$special$$inlined$viewModels$default$5
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

    private final void bindViewModel() {
        FragmentAvisaHomeBinding fragmentAvisaHomeBinding = this.binding;
        FragmentAvisaHomeBinding fragmentAvisaHomeBinding2 = null;
        if (fragmentAvisaHomeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaHomeBinding = null;
        }
        final int i = 0;
        ((Button) fragmentAvisaHomeBinding.emptyView.findViewById(R.id.action_button_retry)).setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiAvisa.components.home.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AvisaHomeFragment f4899b;

            {
                this.f4899b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                AvisaHomeFragment avisaHomeFragment = this.f4899b;
                switch (i4) {
                    case 0:
                        AvisaHomeFragment.bindViewModel$lambda$0(avisaHomeFragment, view);
                        return;
                    default:
                        AvisaHomeFragment.bindViewModel$lambda$3(avisaHomeFragment, view);
                        return;
                }
            }
        });
        getViewModel().getStationsList().e(getViewLifecycleOwner(), new a(this, 1));
        InterfaceC0266a navigation = getViewModel().getNavigation();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ((b1.f) navigation).a(viewLifecycleOwner, new NavigationHandler(this));
        C0246x c0246x = new C0246x(requireContext());
        Drawable drawable = D.h.getDrawable(requireContext(), R.drawable.divider);
        if (drawable != null) {
            c0246x.f3928a = drawable;
        }
        P requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        IssuesAdapter issuesAdapter = new IssuesAdapter(this, requireActivity);
        FragmentAvisaHomeBinding fragmentAvisaHomeBinding3 = this.binding;
        if (fragmentAvisaHomeBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaHomeBinding3 = null;
        }
        fragmentAvisaHomeBinding3.issuesRecyclerview.setAdapter(issuesAdapter);
        FragmentAvisaHomeBinding fragmentAvisaHomeBinding4 = this.binding;
        if (fragmentAvisaHomeBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaHomeBinding4 = null;
        }
        fragmentAvisaHomeBinding4.issuesRecyclerview.i(c0246x);
        FragmentAvisaHomeBinding fragmentAvisaHomeBinding5 = this.binding;
        if (fragmentAvisaHomeBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentAvisaHomeBinding2 = fragmentAvisaHomeBinding5;
        }
        final int i4 = 1;
        fragmentAvisaHomeBinding2.fab.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiAvisa.components.home.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AvisaHomeFragment f4899b;

            {
                this.f4899b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                AvisaHomeFragment avisaHomeFragment = this.f4899b;
                switch (i42) {
                    case 0:
                        AvisaHomeFragment.bindViewModel$lambda$0(avisaHomeFragment, view);
                        return;
                    default:
                        AvisaHomeFragment.bindViewModel$lambda$3(avisaHomeFragment, view);
                        return;
                }
            }
        });
        getViewModel().canContinue().e(getViewLifecycleOwner(), new a(this, 2));
        loading(true);
    }

    public static final void bindViewModel$lambda$0(AvisaHomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.getViewModel().canContinue().d(), Boolean.TRUE)) {
            this$0.getIncidences();
            return;
        }
        this$0.loading(true);
        emptyStatus$default(this$0, false, false, 2, null);
        this$0.getViewModel().retryAuth();
    }

    public static final void bindViewModel$lambda$1(AvisaHomeFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (list.isEmpty()) {
            this$0.loading(false);
            this$0.emptyStatus(true, true);
        }
    }

    public static final void bindViewModel$lambda$3(AvisaHomeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().navigateToCreateIncidence();
    }

    public static final void bindViewModel$lambda$4(AvisaHomeFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            this$0.getIncidences();
        }
    }

    private final void emptyStatus(boolean isVisible, boolean fromFailure) {
        FragmentAvisaHomeBinding fragmentAvisaHomeBinding = null;
        if (!isVisible) {
            FragmentAvisaHomeBinding fragmentAvisaHomeBinding2 = this.binding;
            if (fragmentAvisaHomeBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaHomeBinding2 = null;
            }
            fragmentAvisaHomeBinding2.issuesRecyclerview.setVisibility(0);
            FragmentAvisaHomeBinding fragmentAvisaHomeBinding3 = this.binding;
            if (fragmentAvisaHomeBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentAvisaHomeBinding = fragmentAvisaHomeBinding3;
            }
            fragmentAvisaHomeBinding.emptyView.setVisibility(8);
            return;
        }
        FragmentAvisaHomeBinding fragmentAvisaHomeBinding4 = this.binding;
        if (fragmentAvisaHomeBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaHomeBinding4 = null;
        }
        fragmentAvisaHomeBinding4.issuesRecyclerview.setVisibility(8);
        FragmentAvisaHomeBinding fragmentAvisaHomeBinding5 = this.binding;
        if (fragmentAvisaHomeBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaHomeBinding5 = null;
        }
        fragmentAvisaHomeBinding5.emptyView.setVisibility(0);
        InfoData infoData = new InfoData(null, null, null, 7, null);
        if (fromFailure) {
            infoData.setTitle(getString(R.string.generic_error_title));
            infoData.setMsg(getString(R.string.generic_error_message));
            infoData.setImage(Integer.valueOf(R.drawable.ic_result_error));
            FragmentAvisaHomeBinding fragmentAvisaHomeBinding6 = this.binding;
            if (fragmentAvisaHomeBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaHomeBinding6 = null;
            }
            ((Button) fragmentAvisaHomeBinding6.emptyView.findViewById(R.id.action_button_retry)).setVisibility(0);
            FragmentAvisaHomeBinding fragmentAvisaHomeBinding7 = this.binding;
            if (fragmentAvisaHomeBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaHomeBinding7 = null;
            }
            fragmentAvisaHomeBinding7.fab.setVisibility(4);
            FragmentAvisaHomeBinding fragmentAvisaHomeBinding8 = this.binding;
            if (fragmentAvisaHomeBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentAvisaHomeBinding = fragmentAvisaHomeBinding8;
            }
            fragmentAvisaHomeBinding.emptyView.configureView(infoData);
            return;
        }
        infoData.setTitle(getString(R.string.avisa_empty_title));
        infoData.setMsg(getString(R.string.avisa_empty_message, getString(R.string.action_button_new)));
        infoData.setImage(Integer.valueOf(R.drawable.ic_result_empty));
        FragmentAvisaHomeBinding fragmentAvisaHomeBinding9 = this.binding;
        if (fragmentAvisaHomeBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaHomeBinding9 = null;
        }
        ((Button) fragmentAvisaHomeBinding9.emptyView.findViewById(R.id.action_button_retry)).setVisibility(8);
        FragmentAvisaHomeBinding fragmentAvisaHomeBinding10 = this.binding;
        if (fragmentAvisaHomeBinding10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaHomeBinding10 = null;
        }
        fragmentAvisaHomeBinding10.fab.setVisibility(0);
        FragmentAvisaHomeBinding fragmentAvisaHomeBinding11 = this.binding;
        if (fragmentAvisaHomeBinding11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentAvisaHomeBinding = fragmentAvisaHomeBinding11;
        }
        fragmentAvisaHomeBinding.emptyView.configureView(infoData);
    }

    public static /* synthetic */ void emptyStatus$default(AvisaHomeFragment avisaHomeFragment, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 2) != 0) {
            z4 = false;
        }
        avisaHomeFragment.emptyStatus(z3, z4);
    }

    private final void getIncidences() {
        getViewModel().fetchIncidences();
        subscribeToIncidences();
    }

    private final AvisaHomeViewModel getViewModel() {
        return (AvisaHomeViewModel) this.viewModel.getValue();
    }

    private final void loading(boolean isLoading) {
        FragmentAvisaHomeBinding fragmentAvisaHomeBinding = null;
        if (!isLoading) {
            FragmentAvisaHomeBinding fragmentAvisaHomeBinding2 = this.binding;
            if (fragmentAvisaHomeBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentAvisaHomeBinding = fragmentAvisaHomeBinding2;
            }
            fragmentAvisaHomeBinding.loadingViewContainer.setVisibility(8);
            return;
        }
        if (this.initialDataAvailable) {
            return;
        }
        FragmentAvisaHomeBinding fragmentAvisaHomeBinding3 = this.binding;
        if (fragmentAvisaHomeBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaHomeBinding3 = null;
        }
        fragmentAvisaHomeBinding3.loadingViewContainer.setVisibility(0);
        FragmentAvisaHomeBinding fragmentAvisaHomeBinding4 = this.binding;
        if (fragmentAvisaHomeBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentAvisaHomeBinding = fragmentAvisaHomeBinding4;
        }
        fragmentAvisaHomeBinding.fab.setVisibility(4);
    }

    private final void subscribeToIncidences() {
        getViewModel().getUserListIncidences().e(getViewLifecycleOwner(), new a(this, 0));
    }

    public static final void subscribeToIncidences$lambda$9(AvisaHomeFragment this$0, AsyncResult asyncResult) {
        Unit unit;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = WhenMappings.$EnumSwitchMapping$0[asyncResult.getStatus().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this$0.loading(true);
                return;
            } else if (!this$0.initialDataAvailable) {
                emptyStatus$default(this$0, true, false, 2, null);
                this$0.loading(false);
                return;
            } else {
                if (this$0.getContext() != null) {
                    this$0.getViewModel().showErrorDialog();
                    return;
                }
                return;
            }
        }
        this$0.loading(false);
        FragmentAvisaHomeBinding fragmentAvisaHomeBinding = this$0.binding;
        if (fragmentAvisaHomeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAvisaHomeBinding = null;
        }
        fragmentAvisaHomeBinding.fab.setVisibility(0);
        List list = (List) asyncResult.getData();
        if (list == null) {
            unit = null;
        } else {
            if (list.isEmpty()) {
                emptyStatus$default(this$0, true, false, 2, null);
                return;
            }
            List list2 = list;
            List<IncidenceStation> reversed = CollectionsKt.reversed(CollectionsKt.sortedWith(list2, new Comparator() { // from class: com.adif.elcanomovil.uiAvisa.components.home.AvisaHomeFragment$subscribeToIncidences$lambda$9$lambda$7$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t2, T t4) {
                    return ComparisonsKt.compareValues(((IncidenceStation) t2).getIncidence().getCreatedTime(), ((IncidenceStation) t4).getIncidence().getCreatedTime());
                }
            }));
            emptyStatus$default(this$0, false, false, 2, null);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((IncidenceStation) it.next()).getIncidence());
            }
            FragmentAvisaHomeBinding fragmentAvisaHomeBinding2 = this$0.binding;
            if (fragmentAvisaHomeBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentAvisaHomeBinding2 = null;
            }
            AbstractC0220h0 adapter = fragmentAvisaHomeBinding2.issuesRecyclerview.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.adif.elcanomovil.uiAvisa.components.home.IssuesAdapter");
            ((IssuesAdapter) adapter).updateIssues(reversed, true);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            emptyStatus$default(this$0, true, false, 2, null);
        }
    }

    @Override // com.adif.elcanomovil.uiAvisa.components.home.IssuesAdapter.OnIssueListFragmentInteractionListener
    public void onIssueInteraction(Incidence issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        getViewModel().navigateToIncidenceDetails(issue);
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentAvisaHomeBinding bind = FragmentAvisaHomeBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        FragmentAvisaHomeBinding fragmentAvisaHomeBinding = null;
        if (bind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bind = null;
        }
        bind.headerAvisaHome.updateHeaderInfo(new InfoHeaderData(getString(R.string.avisa_home_view_title), Integer.valueOf(R.drawable.ic_arrow_back), null, 4, null));
        FragmentAvisaHomeBinding fragmentAvisaHomeBinding2 = this.binding;
        if (fragmentAvisaHomeBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentAvisaHomeBinding = fragmentAvisaHomeBinding2;
        }
        fragmentAvisaHomeBinding.headerAvisaHome.setOnBackActionListener(new I1.b(this, 7));
        bindViewModel();
    }
}
