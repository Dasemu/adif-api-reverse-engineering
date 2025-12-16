package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.uiHome.HomeFragmentViewAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class p extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f5091a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(HomeFragment homeFragment) {
        super(1);
        this.f5091a = homeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HomeViewModel viewModel;
        String station = (String) obj;
        Intrinsics.checkNotNullParameter(station, "station");
        viewModel = this.f5091a.getViewModel();
        viewModel.onAction(new HomeFragmentViewAction.WorkStationSet(station));
        return Unit.INSTANCE;
    }
}
