package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.commonViews.data.StationOptionViewEntity;
import com.adif.elcanomovil.uiHome.HomeFragmentViewAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.adif.elcanomovil.uiHome.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0289d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f5070a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0289d(HomeFragment homeFragment) {
        super(1);
        this.f5070a = homeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HomeViewModel viewModel;
        StationOptionViewEntity stationOptionViewEntity = (StationOptionViewEntity) obj;
        if (stationOptionViewEntity != null) {
            viewModel = this.f5070a.getViewModel();
            viewModel.onAction(new HomeFragmentViewAction.StationDetailTapped(stationOptionViewEntity.getType(), stationOptionViewEntity.getId()));
        }
        return Unit.INSTANCE;
    }
}
