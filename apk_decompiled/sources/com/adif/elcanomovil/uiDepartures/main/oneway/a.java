package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.commonViews.EmptyCirculationsState;
import com.adif.elcanomovil.commonViews.EmptyCirculationsView;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.uiDepartures.databinding.FragmentCirculationBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FragmentCirculationBinding f4962b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(FragmentCirculationBinding fragmentCirculationBinding, int i) {
        super(1);
        this.f4961a = i;
        this.f4962b = fragmentCirculationBinding;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4961a) {
            case 0:
                EmptyCirculationsState emptyCirculationsState = (EmptyCirculationsState) obj;
                FragmentCirculationBinding fragmentCirculationBinding = this.f4962b;
                EmptyCirculationsView empty = fragmentCirculationBinding.empty;
                Intrinsics.checkNotNullExpressionValue(empty, "empty");
                empty.setVisibility(emptyCirculationsState != null ? 0 : 8);
                if (emptyCirculationsState != null) {
                    fragmentCirculationBinding.empty.update(emptyCirculationsState);
                }
                return Unit.INSTANCE;
            case 1:
                CirculationHeaderInfo circulationHeaderInfo = (CirculationHeaderInfo) obj;
                this.f4962b.circulationHeader.update(circulationHeaderInfo.isCercanias(), circulationHeaderInfo.getCirculationType() == CirculationType.DEPARTURE, circulationHeaderInfo.getCirculationType());
                return Unit.INSTANCE;
            case 2:
                StationHeaderInfo stationHeaderInfo = (StationHeaderInfo) obj;
                this.f4962b.stationHeader.update(stationHeaderInfo.isCercanias(), stationHeaderInfo.isRodalies(), stationHeaderInfo.getHasBothTraffic(), stationHeaderInfo.getOriginStationName(), stationHeaderInfo.getOriginStationLongName(), stationHeaderInfo.isFavourite(), stationHeaderInfo.getDestinationStationName(), stationHeaderInfo.getDestinationStationLongName(), stationHeaderInfo.getCirculationType());
                return Unit.INSTANCE;
            default:
                ObservationInfo observationInfo = (ObservationInfo) obj;
                this.f4962b.stationHeader.updateObservations(observationInfo.getObservation(), observationInfo.getObservationWarning());
                return Unit.INSTANCE;
        }
    }
}
