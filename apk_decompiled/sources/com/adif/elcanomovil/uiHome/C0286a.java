package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.uiHome.HomeFragmentViewAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.adif.elcanomovil.uiHome.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0286a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f5067a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0286a(HomeFragment homeFragment) {
        super(1);
        this.f5067a = homeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HomeViewModel viewModel;
        HomeViewModel viewModel2;
        StationViewEntity stationViewEntity = (StationViewEntity) obj;
        HomeFragment homeFragment = this.f5067a;
        if (stationViewEntity != null) {
            viewModel2 = homeFragment.getViewModel();
            viewModel2.onAction(new HomeFragmentViewAction.StationSelected(stationViewEntity));
        } else {
            viewModel = homeFragment.getViewModel();
            viewModel.onAction(HomeFragmentViewAction.MapTapped.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
