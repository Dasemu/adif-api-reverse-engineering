package com.adif.elcanomovil.commonNavGraph.navigation;

import android.content.Intent;
import androidx.fragment.app.K;
import androidx.lifecycle.InterfaceC0200v;
import com.adif.elcanomovil.commonNavGraph.extensions.NavigationExtensionsKt;
import com.adif.elcanomovil.commonNavGraph.navigation.IntentAction;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.commonNavGraph.viewmodel.TabNavigator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.l;
import o0.AbstractC0544v;
import o0.E;
import o0.F;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190\u0001¢\u0006\u0002\b\u001aH\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 ¨\u0006!"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationHandler;", "Lkotlin/Function1;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "", "Landroidx/fragment/app/K;", "fragment", "<init>", "(Landroidx/fragment/app/K;)V", "Lo0/v;", "navController", "Lo0/F;", "navDirections", "", "currentExpectedFragmentId", "safeNavigate", "(Lo0/v;Lo0/F;Ljava/lang/Integer;)V", "Lcom/adif/elcanomovil/commonNavGraph/navigation/IntentAction;", "action", "handleIntent", "(Lcom/adif/elcanomovil/commonNavGraph/navigation/IntentAction;)V", "Lcom/adif/elcanomovil/commonNavGraph/navigation/IntentAction$Send;", "send", "Landroid/content/Intent;", "generateSendIntent", "(Lcom/adif/elcanomovil/commonNavGraph/navigation/IntentAction$Send;)Landroid/content/Intent;", "", "Lkotlin/ExtensionFunctionType;", "navigateBack", "(Landroidx/fragment/app/K;Lkotlin/jvm/functions/Function1;)V", "navigation", "invoke", "(Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;)V", "Landroidx/fragment/app/K;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigationHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationHandler.kt\ncom/adif/elcanomovil/commonNavGraph/navigation/NavigationHandler\n*L\n1#1,97:1\n89#1,7:98\n89#1,7:105\n*S KotlinDebug\n*F\n+ 1 NavigationHandler.kt\ncom/adif/elcanomovil/commonNavGraph/navigation/NavigationHandler\n*L\n15#1:98,7\n18#1:105,7\n*E\n"})
/* loaded from: classes.dex */
public final class NavigationHandler implements Function1<Navigation, Unit> {
    private final K fragment;

    public NavigationHandler(K fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
    }

    private final Intent generateSendIntent(IntentAction.Send send) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", send.getMessage());
        intent.putExtra("android.intent.extra.SUBJECT", send.getMessage());
        intent.setType("text/plain");
        return intent;
    }

    private final void handleIntent(IntentAction action) {
        Intent generateSendIntent;
        if (action instanceof IntentAction.View) {
            generateSendIntent = new Intent("android.intent.action.VIEW", ((IntentAction.View) action).getUri());
        } else {
            if (!(action instanceof IntentAction.Send)) {
                throw new NoWhenBranchMatchedException();
            }
            generateSendIntent = generateSendIntent((IntentAction.Send) action);
        }
        this.fragment.requireActivity().startActivity(generateSendIntent);
    }

    private final void navigateBack(K fragment, Function1<? super AbstractC0544v, Boolean> navigateBack) {
        if (navigateBack.invoke(l.n(fragment)).booleanValue() || navigateBack.invoke(NavigationExtensionsKt.findRootNavController(fragment)).booleanValue()) {
            return;
        }
        fragment.requireActivity().finishAfterTransition();
    }

    private final void safeNavigate(AbstractC0544v navController, F navDirections, Integer currentExpectedFragmentId) {
        E g4 = l.n(this.fragment).g();
        Integer valueOf = g4 != null ? Integer.valueOf(g4.h) : null;
        if (currentExpectedFragmentId == null) {
            navController.p(navDirections);
        } else if (Intrinsics.areEqual(valueOf, currentExpectedFragmentId)) {
            navController.p(navDirections);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Navigation navigation) {
        invoke2(navigation);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(Navigation navigation) {
        K parentFragment;
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        if (Intrinsics.areEqual(navigation, Navigation.Back.INSTANCE)) {
            K k4 = this.fragment;
            if (l.n(k4).q() || NavigationExtensionsKt.findRootNavController(k4).q()) {
                return;
            }
            k4.requireActivity().finishAfterTransition();
            return;
        }
        if (navigation instanceof Navigation.BackWithResult) {
            K k5 = this.fragment;
            Navigation.BackWithResult backWithResult = (Navigation.BackWithResult) navigation;
            if (NavigationExtensionsKt.popBackStackWithResult(l.n(k5), backWithResult.getKey(), backWithResult.getValue()) || NavigationExtensionsKt.popBackStackWithResult(NavigationExtensionsKt.findRootNavController(k5), backWithResult.getKey(), backWithResult.getValue())) {
                return;
            }
            k5.requireActivity().finishAfterTransition();
            return;
        }
        if (navigation instanceof Navigation.Direction) {
            Navigation.Direction direction = (Navigation.Direction) navigation;
            safeNavigate(l.n(this.fragment), direction.getNavDirections(), direction.getCurrentFragmentId());
            return;
        }
        if (navigation instanceof Navigation.TabDirection) {
            K parentFragment2 = this.fragment.getParentFragment();
            TabNavigator tabNavigator = null;
            InterfaceC0200v parentFragment3 = parentFragment2 != null ? parentFragment2.getParentFragment() : null;
            TabNavigator tabNavigator2 = parentFragment3 instanceof TabNavigator ? (TabNavigator) parentFragment3 : null;
            if (tabNavigator2 == null) {
                K parentFragment4 = this.fragment.getParentFragment();
                Object parentFragment5 = (parentFragment4 == null || (parentFragment = parentFragment4.getParentFragment()) == null) ? null : parentFragment.getParentFragment();
                if (parentFragment5 instanceof TabNavigator) {
                    tabNavigator = (TabNavigator) parentFragment5;
                }
            } else {
                tabNavigator = tabNavigator2;
            }
            if (tabNavigator != null) {
                tabNavigator.navigateTo(((Navigation.TabDirection) navigation).getInitialTab());
                return;
            }
            return;
        }
        if (navigation instanceof Navigation.RootDirection) {
            Navigation.RootDirection rootDirection = (Navigation.RootDirection) navigation;
            safeNavigate(NavigationExtensionsKt.findRootNavController(this.fragment), rootDirection.getNavDirections(), rootDirection.getCurrentFragmentId());
        } else if (navigation instanceof Navigation.Intent) {
            handleIntent(((Navigation.Intent) navigation).getAction());
        }
    }
}
