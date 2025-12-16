package com.adif.elcanomovil.splash;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.K;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.y0;
import b1.InterfaceC0266a;
import b1.f;
import com.adif.elcanomovil.R;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.databinding.FragmentSplashBinding;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/splash/SplashFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "", "animateView", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/adif/elcanomovil/splash/SplashViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/splash/SplashViewModel;", "viewModel", "Lcom/adif/elcanomovil/databinding/FragmentSplashBinding;", "binding", "Lcom/adif/elcanomovil/databinding/FragmentSplashBinding;", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nSplashFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashFragment.kt\ncom/adif/elcanomovil/splash/SplashFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,57:1\n106#2,15:58\n*S KotlinDebug\n*F\n+ 1 SplashFragment.kt\ncom/adif/elcanomovil/splash/SplashFragment\n*L\n16#1:58,15\n*E\n"})
/* loaded from: classes.dex */
public final class SplashFragment extends Hilt_SplashFragment {
    private FragmentSplashBinding binding;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public SplashFragment() {
        super(R.layout.fragment_splash);
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.splash.SplashFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.splash.SplashFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(SplashViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.splash.SplashFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.splash.SplashFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.splash.SplashFragment$special$$inlined$viewModels$default$5
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

    private final void animateView() {
        FragmentSplashBinding fragmentSplashBinding = this.binding;
        if (fragmentSplashBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSplashBinding = null;
        }
        ImageView imageView = fragmentSplashBinding.animationView;
        imageView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        imageView.setVisibility(0);
        imageView.animate().alpha(1.0f).setDuration(1500L).setListener(new AnimatorListenerAdapter() { // from class: com.adif.elcanomovil.splash.SplashFragment$animateView$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                SplashViewModel viewModel;
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationCancel(animation);
                if (SplashFragment.this.getView() != null) {
                    viewModel = SplashFragment.this.getViewModel();
                    viewModel.fihishAnimation();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                SplashViewModel viewModel;
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (SplashFragment.this.getView() != null) {
                    viewModel = SplashFragment.this.getViewModel();
                    viewModel.fihishAnimation();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SplashViewModel getViewModel() {
        return (SplashViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.K
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentSplashBinding bind = FragmentSplashBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        animateView();
        InterfaceC0266a navigation = getViewModel().getNavigation();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ((f) navigation).a(viewLifecycleOwner, new NavigationHandler(this));
    }
}
