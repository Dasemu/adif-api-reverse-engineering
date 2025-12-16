package com.adif.elcanomovil.main;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.K;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC0200v;
import androidx.lifecycle.J;
import androidx.lifecycle.y0;
import androidx.navigation.fragment.NavHostFragment;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.R;
import com.adif.elcanomovil.commonNavGraph.arguments.BottomNavInitialTab;
import com.adif.elcanomovil.commonNavGraph.arguments.ChildDirections;
import com.adif.elcanomovil.commonNavGraph.extensions.NavigationExtensionsKt;
import com.adif.elcanomovil.commonNavGraph.navigation.DeeplinkRoutes;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.commonNavGraph.viewmodel.TabNavigator;
import com.adif.elcanomovil.databinding.FragmentBottomNavBinding;
import com.adif.elcanomovil.uiTrain.main.TrainSituationFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import l0.C0435a;
import o0.AbstractC0544v;
import o0.C0537n;
import o0.E;
import o0.I;
import q0.C0556c;
import r0.C0565a;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/adif/elcanomovil/main/BottomNavFragment;", "Lcom/adif/elcanomovil/commonNavGraph/viewmodel/BaseFragment;", "Lcom/adif/elcanomovil/commonNavGraph/viewmodel/TabNavigator;", "<init>", "()V", "Lo0/v;", "controller", "Lo0/E;", FirebaseAnalytics.Param.DESTINATION, "Landroid/os/Bundle;", "arguments", "", "onDestinationChanged", "(Lo0/v;Lo0/E;Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "menuItem", "onNavigationItemReselected", "(Landroid/view/MenuItem;)V", "bottomNavController", "()Lo0/v;", "navController", "Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;", "directions", "popExistingViewIfNeeded", "(Lo0/v;Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;", "tab", "navigateTo", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;)V", "Lcom/adif/elcanomovil/main/BottomNavViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/adif/elcanomovil/main/BottomNavViewModel;", "viewModel", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension({"SMAP\nBottomNavFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavFragment.kt\ncom/adif/elcanomovil/main/BottomNavFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,125:1\n106#2,15:126\n*S KotlinDebug\n*F\n+ 1 BottomNavFragment.kt\ncom/adif/elcanomovil/main/BottomNavFragment\n*L\n32#1:126,15\n*E\n"})
/* loaded from: classes.dex */
public final class BottomNavFragment extends Hilt_BottomNavFragment implements TabNavigator {

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public BottomNavFragment() {
        final Function0<K> function0 = new Function0<K>() { // from class: com.adif.elcanomovil.main.BottomNavFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final K invoke() {
                return K.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<D0>() { // from class: com.adif.elcanomovil.main.BottomNavFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = m3.d.n(this, Reflection.getOrCreateKotlinClass(BottomNavViewModel.class), new Function0<C0>() { // from class: com.adif.elcanomovil.main.BottomNavFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C0 invoke() {
                return ((D0) Lazy.this.getValue()).getViewModelStore();
            }
        }, new Function0<l0.c>() { // from class: com.adif.elcanomovil.main.BottomNavFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<y0>() { // from class: com.adif.elcanomovil.main.BottomNavFragment$special$$inlined$viewModels$default$5
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

    public static final /* synthetic */ void access$popExistingViewIfNeeded(BottomNavFragment bottomNavFragment, AbstractC0544v abstractC0544v, ChildDirections childDirections) {
        bottomNavFragment.popExistingViewIfNeeded(abstractC0544v, childDirections);
    }

    private final AbstractC0544v bottomNavController() {
        K F3 = getChildFragmentManager().F(getString(R.string.bottomTabsNavHostFragment));
        Intrinsics.checkNotNull(F3, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        return ((NavHostFragment) F3).f();
    }

    private final BottomNavViewModel getViewModel() {
        return (BottomNavViewModel) this.viewModel.getValue();
    }

    public final void onDestinationChanged(AbstractC0544v controller, E r22, Bundle arguments) {
        getViewModel().onNavigationChanged(r22.h);
    }

    public final void onNavigationItemReselected(MenuItem menuItem) {
        getViewModel().onNavigationItemReselected(menuItem.getItemId());
    }

    public final void popExistingViewIfNeeded(AbstractC0544v navController, ChildDirections directions) {
        Uri uri;
        String uri2;
        boolean contains$default;
        Intrinsics.checkNotNull(navController, "null cannot be cast to non-null type androidx.navigation.NavHostController");
        E e4 = ((C0537n) ((I) navController).f8054g.last()).f8006b;
        Intrinsics.checkNotNull(e4, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        String str = ((C0556c) e4).f8148k;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set");
        }
        if (!Intrinsics.areEqual(str, Reflection.getOrCreateKotlinClass(TrainSituationFragment.class).getQualifiedName()) || (uri = directions.getDeeplinkRequest().f7911a) == null || (uri2 = uri.toString()) == null) {
            return;
        }
        contains$default = StringsKt__StringsKt.contains$default(uri2, (CharSequence) DeeplinkRoutes.trainDetails, false, 2, (Object) null);
        if (contains$default) {
            navController.q();
        }
    }

    @Override // com.adif.elcanomovil.commonNavGraph.viewmodel.TabNavigator
    public void navigateTo(BottomNavInitialTab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        getViewModel().onTabNavigationItemChanged(tab);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.jvm.internal.FunctionReferenceImpl, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v11, types: [kotlin.jvm.internal.FunctionReferenceImpl, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlin.jvm.internal.FunctionReferenceImpl, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.jvm.internal.FunctionReferenceImpl, kotlin.jvm.functions.Function1] */
    @Override // androidx.fragment.app.K
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentBottomNavBinding inflate = FragmentBottomNavBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        AbstractC0544v navController = bottomNavController();
        BottomNavigationView navigationBarView = inflate.bottomNavigationView;
        Intrinsics.checkNotNullExpressionValue(navigationBarView, "bottomNavigationView");
        Intrinsics.checkNotNullParameter(navigationBarView, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(navigationBarView, "navigationBarView");
        Intrinsics.checkNotNullParameter(navController, "navController");
        navigationBarView.setOnItemSelectedListener(new I2.k(navController, 22));
        navController.b(new C0565a(new WeakReference(navigationBarView), navController));
        inflate.bottomNavigationView.setOnItemReselectedListener(new I2.k(this, 8));
        navController.b(new a(this));
        InterfaceC0266a selectedTab = getViewModel().getSelectedTab();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ((b1.f) selectedTab).a(viewLifecycleOwner, new T0.j(inflate, this, navController, 2));
        InterfaceC0266a popBackTo = getViewModel().getPopBackTo();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        ((b1.f) popBackTo).a(viewLifecycleOwner2, new b(navController, 0));
        InterfaceC0266a navigation = getViewModel().getNavigation();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        ((b1.f) navigation).a(viewLifecycleOwner3, new NavigationHandler(this));
        NavigationExtensionsKt.onDestinationResult(NavigationExtensionsKt.findRootNavController(this), BottomNavViewModelKt.ALERT_KEY_OPTIONAL_UPDATE, this, new FunctionReferenceImpl(1, getViewModel(), BottomNavViewModel.class, "handleOptionalUpdateAlertResult", "handleOptionalUpdateAlertResult(Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;)V", 0));
        NavigationExtensionsKt.onDestinationResult(NavigationExtensionsKt.findRootNavController(this), BottomNavViewModelKt.ALERT_KEY_MANDATORY_UPDATE, this, new FunctionReferenceImpl(1, getViewModel(), BottomNavViewModel.class, "handleMandatoryUpdateAlertResult", "handleMandatoryUpdateAlertResult(Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;)V", 0));
        NavigationExtensionsKt.onDestinationResult(NavigationExtensionsKt.findRootNavController(this), BottomNavViewModelKt.ALERT_KEY_MANDATORY_TERMS, this, new FunctionReferenceImpl(1, getViewModel(), BottomNavViewModel.class, "handleMandatoryTermnsAlertResult", "handleMandatoryTermnsAlertResult(Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;)V", 0));
        NavigationExtensionsKt.onDestinationResult(NavigationExtensionsKt.findRootNavController(this), BottomNavViewModelKt.ALERT_KEY_ROOT_DETECTED, this, new FunctionReferenceImpl(1, getViewModel(), BottomNavViewModel.class, "handleRootDetectedAlertResult", "handleRootDetectedAlertResult(Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;)V", 0));
        getViewModel().checkConditions();
        LinearLayout root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
