package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.uiHome.databinding.FragmentHomeBinding;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class f implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f5073b;

    public /* synthetic */ f(HomeFragment homeFragment, int i) {
        this.f5072a = i;
        this.f5073b = homeFragment;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        NavigationHandler navigationHandler;
        FragmentHomeBinding fragmentHomeBinding;
        switch (this.f5072a) {
            case 0:
                navigationHandler = this.f5073b.navigationHandler;
                navigationHandler.invoke2((Navigation) obj);
                return Unit.INSTANCE;
            case 1:
                this.f5073b.onViewStateUpdated((HomeFragmentViewState) obj);
                return Unit.INSTANCE;
            case 2:
                this.f5073b.checkAndAskUserPermission();
                return Unit.INSTANCE;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                fragmentHomeBinding = this.f5073b.binding;
                if (fragmentHomeBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentHomeBinding = null;
                }
                fragmentHomeBinding.layoutHomeMap.setLocationAvailableAndCenterCamera(booleanValue);
                return Unit.INSTANCE;
        }
    }
}
