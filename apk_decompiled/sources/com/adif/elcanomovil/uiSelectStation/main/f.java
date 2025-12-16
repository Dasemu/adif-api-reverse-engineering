package com.adif.elcanomovil.uiSelectStation.main;

import com.adif.elcanomovil.commonViews.data.StationOptionViewEntity;
import com.adif.elcanomovil.domain.entities.station.Station;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectStationFragment f5189b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(SelectStationFragment selectStationFragment, int i) {
        super(1);
        this.f5188a = i;
        this.f5189b = selectStationFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5188a) {
            case 0:
                StationOptionViewEntity stationOptionViewEntity = (StationOptionViewEntity) obj;
                this.f5189b.onTapStation(stationOptionViewEntity != null ? stationOptionViewEntity.getId() : null);
                return Unit.INSTANCE;
            case 1:
                StationOptionViewEntity stationOptionViewEntity2 = (StationOptionViewEntity) obj;
                this.f5189b.onTapStation(stationOptionViewEntity2 != null ? stationOptionViewEntity2.getId() : null);
                return Unit.INSTANCE;
            default:
                Station it = (Station) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f5189b.onTapStation(it.getStationCode());
                return Unit.INSTANCE;
        }
    }
}
