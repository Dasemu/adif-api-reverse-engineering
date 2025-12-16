package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.uiHome.mappers.StationViewEntityMapper;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.adif.elcanomovil.uiHome.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0291r implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f5094a;

    public C0291r(HomeViewModel homeViewModel) {
        this.f5094a = homeViewModel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        StationViewEntity map = StationViewEntityMapper.INSTANCE.map((Station) obj);
        StationViewEntity copy$default = map != null ? StationViewEntity.copy$default(map, null, null, null, null, null, null, null, null, null, StationViewEntity.Type.NEAR, null, 1535, null) : null;
        HomeViewModel homeViewModel = this.f5094a;
        homeViewModel.nearestStation = copy$default;
        homeViewModel.updateViewState();
        return Unit.INSTANCE;
    }
}
