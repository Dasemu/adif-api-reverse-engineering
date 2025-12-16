package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.uiHome.HomeFragmentViewAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.adif.elcanomovil.uiHome.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0288c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f5069a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0288c(HomeFragment homeFragment) {
        super(1);
        this.f5069a = homeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HomeViewModel viewModel;
        HomeViewModel viewModel2;
        StationViewEntity.Type it = (StationViewEntity.Type) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = HomeFragment$configureListeners$3$WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
        HomeFragment homeFragment = this.f5069a;
        if (i == 1) {
            viewModel = homeFragment.getViewModel();
            viewModel.onAction(HomeFragmentViewAction.SetHomeStationTapped.INSTANCE);
        } else if (i == 2) {
            viewModel2 = homeFragment.getViewModel();
            viewModel2.onAction(HomeFragmentViewAction.SetWorkStationTapped.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
