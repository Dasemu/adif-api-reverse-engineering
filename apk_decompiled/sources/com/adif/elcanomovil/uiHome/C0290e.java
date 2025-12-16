package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.uiHome.HomeFragmentViewAction;
import com.adif.elcanomovil.uiHome.data.UserFavoriteVO;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.adif.elcanomovil.uiHome.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0290e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f5071a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0290e(HomeFragment homeFragment) {
        super(1);
        this.f5071a = homeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HomeViewModel viewModel;
        UserFavoriteVO it = (UserFavoriteVO) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        viewModel = this.f5071a.getViewModel();
        viewModel.onAction(new HomeFragmentViewAction.FavoriteTapped(it));
        return Unit.INSTANCE;
    }
}
