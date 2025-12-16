package com.adif.elcanomovil.uiMoreAdif.about;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.K;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.y0;
import b1.InterfaceC0266a;
import b1.f;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.commonViews.data.InfoHeaderData;
import com.adif.elcanomovil.uiMoreAdif.R;
import com.adif.elcanomovil.uiMoreAdif.databinding.FragmentAboutBinding;
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

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J!\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/uiMoreAdif/about/AboutFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "Lcom/adif/elcanomovil/uiMoreAdif/databinding/FragmentAboutBinding;", "", "configureHeaderView", "(Lcom/adif/elcanomovil/uiMoreAdif/databinding/FragmentAboutBinding;)V", "configureListeners", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "binding", "Lcom/adif/elcanomovil/uiMoreAdif/databinding/FragmentAboutBinding;", "Lcom/adif/elcanomovil/uiMoreAdif/about/AboutViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/uiMoreAdif/about/AboutViewModel;", "viewModel", "ui-more-adif_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nAboutFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AboutFragment.kt\ncom/adif/elcanomovil/uiMoreAdif/about/AboutFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,45:1\n106#2,15:46\n*S KotlinDebug\n*F\n+ 1 AboutFragment.kt\ncom/adif/elcanomovil/uiMoreAdif/about/AboutFragment\n*L\n16#1:46,15\n*E\n"})
/* loaded from: classes2.dex */
public final class AboutFragment extends Hilt_AboutFragment {
    private FragmentAboutBinding binding;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public AboutFragment() {
        super(R.layout.fragment_about);
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.uiMoreAdif.about.AboutFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.uiMoreAdif.about.AboutFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(AboutViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.uiMoreAdif.about.AboutFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.uiMoreAdif.about.AboutFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.uiMoreAdif.about.AboutFragment$special$$inlined$viewModels$default$5
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

    private final void configureHeaderView(FragmentAboutBinding fragmentAboutBinding) {
        fragmentAboutBinding.headerViewAbout.updateHeaderInfo(new InfoHeaderData(getString(R.string.about_title), Integer.valueOf(R.drawable.ic_arrow_back), null, 4, null));
        fragmentAboutBinding.headerViewAbout.setOnBackActionListener(new b(this, 0));
        fragmentAboutBinding.headerViewAbout.setOnCloseActionListener(new b(this, 1));
    }

    private final void configureListeners(FragmentAboutBinding fragmentAboutBinding) {
        final int i = 0;
        fragmentAboutBinding.conditionsButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiMoreAdif.about.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AboutFragment f5156b;

            {
                this.f5156b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                AboutFragment aboutFragment = this.f5156b;
                switch (i4) {
                    case 0:
                        AboutFragment.configureListeners$lambda$0(aboutFragment, view);
                        return;
                    default:
                        AboutFragment.configureListeners$lambda$1(aboutFragment, view);
                        return;
                }
            }
        });
        final int i4 = 1;
        fragmentAboutBinding.termsButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiMoreAdif.about.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AboutFragment f5156b;

            {
                this.f5156b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                AboutFragment aboutFragment = this.f5156b;
                switch (i42) {
                    case 0:
                        AboutFragment.configureListeners$lambda$0(aboutFragment, view);
                        return;
                    default:
                        AboutFragment.configureListeners$lambda$1(aboutFragment, view);
                        return;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureListeners$lambda$0(AboutFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().legalConditionsButtonTapped(this$0.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureListeners$lambda$1(AboutFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().termsButtonTapped(this$0.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AboutViewModel getViewModel() {
        return (AboutViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentAboutBinding bind = FragmentAboutBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        FragmentAboutBinding fragmentAboutBinding = null;
        if (bind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bind = null;
        }
        configureHeaderView(bind);
        FragmentAboutBinding fragmentAboutBinding2 = this.binding;
        if (fragmentAboutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentAboutBinding2 = null;
        }
        configureListeners(fragmentAboutBinding2);
        FragmentAboutBinding fragmentAboutBinding3 = this.binding;
        if (fragmentAboutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentAboutBinding = fragmentAboutBinding3;
        }
        fragmentAboutBinding.versionTextview.setText(getString(R.string.about_version, getViewModel().getAppVersion()));
        InterfaceC0266a navigation = getViewModel().getNavigation();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ((f) navigation).a(viewLifecycleOwner, new NavigationHandler(this));
    }
}
