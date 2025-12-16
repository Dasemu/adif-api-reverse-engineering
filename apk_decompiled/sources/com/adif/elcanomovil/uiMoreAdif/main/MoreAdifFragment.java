package com.adif.elcanomovil.uiMoreAdif.main;

import D.h;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.PaintDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.K;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.RecyclerView;
import b1.InterfaceC0266a;
import b1.f;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.commonViews.LinearDividerDecoration;
import com.adif.elcanomovil.commonViews.utils.ScreenUtils;
import com.adif.elcanomovil.uiMoreAdif.R;
import com.adif.elcanomovil.uiMoreAdif.databinding.FragmentMoreAdifBinding;
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
import m3.d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0003R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/uiMoreAdif/main/MoreAdifFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "", "configureRecyclerView", "onDestroyView", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "Lcom/adif/elcanomovil/uiMoreAdif/databinding/FragmentMoreAdifBinding;", "binding", "Lcom/adif/elcanomovil/uiMoreAdif/databinding/FragmentMoreAdifBinding;", "Lcom/adif/elcanomovil/uiMoreAdif/main/MoreAdifViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/uiMoreAdif/main/MoreAdifViewModel;", "viewModel", "ui-more-adif_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nMoreAdifFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoreAdifFragment.kt\ncom/adif/elcanomovil/uiMoreAdif/main/MoreAdifFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,75:1\n106#2,15:76\n*S KotlinDebug\n*F\n+ 1 MoreAdifFragment.kt\ncom/adif/elcanomovil/uiMoreAdif/main/MoreAdifFragment\n*L\n25#1:76,15\n*E\n"})
/* loaded from: classes2.dex */
public final class MoreAdifFragment extends Hilt_MoreAdifFragment {
    private FragmentMoreAdifBinding binding;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public MoreAdifFragment() {
        super(R.layout.fragment_more_adif);
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.uiMoreAdif.main.MoreAdifFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.uiMoreAdif.main.MoreAdifFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = d.n(this, Reflection.getOrCreateKotlinClass(MoreAdifViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.uiMoreAdif.main.MoreAdifFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.uiMoreAdif.main.MoreAdifFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.uiMoreAdif.main.MoreAdifFragment$special$$inlined$viewModels$default$5
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

    public static final /* synthetic */ MoreAdifViewModel access$getViewModel(MoreAdifFragment moreAdifFragment) {
        return moreAdifFragment.getViewModel();
    }

    private final void configureRecyclerView() {
        FragmentMoreAdifBinding fragmentMoreAdifBinding = this.binding;
        if (fragmentMoreAdifBinding == null) {
            return;
        }
        fragmentMoreAdifBinding.optionsRecyclerView.setAdapter(new MoreAdifAdapter(getViewModel().getItems(), new I1.b(this, 11)));
        AbstractC0220h0 adapter = fragmentMoreAdifBinding.optionsRecyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        Context context = getContext();
        if (context != null) {
            RecyclerView recyclerView = fragmentMoreAdifBinding.optionsRecyclerView;
            PaintDrawable paintDrawable = new PaintDrawable(h.getColor(context, R.color.colorPrimary));
            float dpToPx = ScreenUtils.INSTANCE.dpToPx(0.7f);
            Resources resources = context.getResources();
            int i = R.dimen.default_horizontal_padding;
            recyclerView.i(new LinearDividerDecoration(paintDrawable, dpToPx, resources.getDimension(i), context.getResources().getDimension(i), false));
        }
    }

    public final MoreAdifViewModel getViewModel() {
        return (MoreAdifViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.K
    public void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }

    @Override // androidx.fragment.app.K
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.binding = FragmentMoreAdifBinding.bind(view);
        configureRecyclerView();
        MoreAdifViewModel viewModel = getViewModel();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(NavArguments.ARG_COMMERCIAL_NUMBER) : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString(NavArguments.ARG_ORIGIN_STATION_CODE) : null;
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString(NavArguments.ARG_DESTINATION_STATION_CODE) : null;
        Bundle arguments4 = getArguments();
        viewModel.checkDestination(string, string2, string3, arguments4 != null ? Long.valueOf(arguments4.getLong(NavArguments.ARG_LAUNCHING_DATE)) : null);
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            arguments5.clear();
        }
        InterfaceC0266a navigation = getViewModel().getNavigation();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ((f) navigation).a(viewLifecycleOwner, new NavigationHandler(this));
    }
}
