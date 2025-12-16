package com.adif.elcanomovil.uiMoreAdif.accessibility;

import android.net.Uri;
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
import com.adif.elcanomovil.commonNavGraph.navigation.IntentAction;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.commonViews.data.InfoHeaderData;
import com.adif.elcanomovil.uiMoreAdif.R;
import com.adif.elcanomovil.uiMoreAdif.databinding.FragmentAccessibilityBinding;
import com.google.android.gms.common.internal.ImagesContract;
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

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/adif/elcanomovil/uiMoreAdif/accessibility/AccessibilityFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "Lcom/adif/elcanomovil/uiMoreAdif/databinding/FragmentAccessibilityBinding;", "", "configureHeaderView", "(Lcom/adif/elcanomovil/uiMoreAdif/databinding/FragmentAccessibilityBinding;)V", "configureListeners", "", ImagesContract.URL, "followLink", "(Ljava/lang/String;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "binding", "Lcom/adif/elcanomovil/uiMoreAdif/databinding/FragmentAccessibilityBinding;", "Lcom/adif/elcanomovil/uiMoreAdif/accessibility/AccessibilityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/uiMoreAdif/accessibility/AccessibilityViewModel;", "viewModel", "ui-more-adif_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nAccessibilityFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityFragment.kt\ncom/adif/elcanomovil/uiMoreAdif/accessibility/AccessibilityFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,52:1\n106#2,15:53\n*S KotlinDebug\n*F\n+ 1 AccessibilityFragment.kt\ncom/adif/elcanomovil/uiMoreAdif/accessibility/AccessibilityFragment\n*L\n19#1:53,15\n*E\n"})
/* loaded from: classes2.dex */
public final class AccessibilityFragment extends Hilt_AccessibilityFragment {
    private FragmentAccessibilityBinding binding;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public AccessibilityFragment() {
        super(R.layout.fragment_accessibility);
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.uiMoreAdif.accessibility.AccessibilityFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.uiMoreAdif.accessibility.AccessibilityFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(AccessibilityViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.uiMoreAdif.accessibility.AccessibilityFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.uiMoreAdif.accessibility.AccessibilityFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.uiMoreAdif.accessibility.AccessibilityFragment$special$$inlined$viewModels$default$5
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

    private final void configureHeaderView(FragmentAccessibilityBinding fragmentAccessibilityBinding) {
        fragmentAccessibilityBinding.headerViewAbout.updateHeaderInfo(new InfoHeaderData(getString(R.string.accessibility_title), Integer.valueOf(R.drawable.ic_arrow_back), null, 4, null));
        fragmentAccessibilityBinding.headerViewAbout.setOnBackActionListener(new b(this, 0));
        fragmentAccessibilityBinding.headerViewAbout.setOnCloseActionListener(new b(this, 1));
    }

    private final void configureListeners(FragmentAccessibilityBinding fragmentAccessibilityBinding) {
        final int i = 0;
        fragmentAccessibilityBinding.acercaButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiMoreAdif.accessibility.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccessibilityFragment f5162b;

            {
                this.f5162b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                AccessibilityFragment accessibilityFragment = this.f5162b;
                switch (i4) {
                    case 0:
                        AccessibilityFragment.configureListeners$lambda$0(accessibilityFragment, view);
                        return;
                    case 1:
                        AccessibilityFragment.configureListeners$lambda$1(accessibilityFragment, view);
                        return;
                    default:
                        AccessibilityFragment.configureListeners$lambda$2(accessibilityFragment, view);
                        return;
                }
            }
        });
        final int i4 = 1;
        fragmentAccessibilityBinding.communicationsButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiMoreAdif.accessibility.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccessibilityFragment f5162b;

            {
                this.f5162b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                AccessibilityFragment accessibilityFragment = this.f5162b;
                switch (i42) {
                    case 0:
                        AccessibilityFragment.configureListeners$lambda$0(accessibilityFragment, view);
                        return;
                    case 1:
                        AccessibilityFragment.configureListeners$lambda$1(accessibilityFragment, view);
                        return;
                    default:
                        AccessibilityFragment.configureListeners$lambda$2(accessibilityFragment, view);
                        return;
                }
            }
        });
        final int i5 = 2;
        fragmentAccessibilityBinding.declarationButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.adif.elcanomovil.uiMoreAdif.accessibility.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccessibilityFragment f5162b;

            {
                this.f5162b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i5;
                AccessibilityFragment accessibilityFragment = this.f5162b;
                switch (i42) {
                    case 0:
                        AccessibilityFragment.configureListeners$lambda$0(accessibilityFragment, view);
                        return;
                    case 1:
                        AccessibilityFragment.configureListeners$lambda$1(accessibilityFragment, view);
                        return;
                    default:
                        AccessibilityFragment.configureListeners$lambda$2(accessibilityFragment, view);
                        return;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureListeners$lambda$0(AccessibilityFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.getString(R.string.accessibility_acerca_website);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.followLink(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureListeners$lambda$1(AccessibilityFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().communicationButtonTapped(this$0.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureListeners$lambda$2(AccessibilityFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().declarationButtonTapped(this$0.getContext());
    }

    private final void followLink(String url) {
        Uri parse = Uri.parse(url);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        new NavigationHandler(this).invoke2((Navigation) new Navigation.Intent(new IntentAction.View(parse)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccessibilityViewModel getViewModel() {
        return (AccessibilityViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentAccessibilityBinding bind = FragmentAccessibilityBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        FragmentAccessibilityBinding fragmentAccessibilityBinding = null;
        if (bind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bind = null;
        }
        configureHeaderView(bind);
        FragmentAccessibilityBinding fragmentAccessibilityBinding2 = this.binding;
        if (fragmentAccessibilityBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentAccessibilityBinding = fragmentAccessibilityBinding2;
        }
        configureListeners(fragmentAccessibilityBinding);
        InterfaceC0266a navigation = getViewModel().getNavigation();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ((f) navigation).a(viewLifecycleOwner, new NavigationHandler(this));
    }
}
