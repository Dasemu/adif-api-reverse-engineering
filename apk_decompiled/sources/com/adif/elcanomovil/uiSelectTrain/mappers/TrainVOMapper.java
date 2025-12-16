package com.adif.elcanomovil.uiSelectTrain.mappers;

import com.adif.elcanomovil.domain.entities.circulation.CommercialPathRouteSidesInfo;
import com.adif.elcanomovil.uiSelectTrain.entities.TrainInfo;
import com.adif.elcanomovil.uiSelectTrain.entities.TrainInfoStation;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/uiSelectTrain/mappers/TrainVOMapper;", "", "()V", "map", "Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainInfo;", Constants.MessagePayloadKeys.FROM, "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathRouteSidesInfo;", "ui-select-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TrainVOMapper {
    public static final TrainVOMapper INSTANCE = new TrainVOMapper();

    private TrainVOMapper() {
    }

    public final TrainInfo map(CommercialPathRouteSidesInfo from) {
        Intrinsics.checkNotNullParameter(from, "from");
        return new TrainInfo(from.getCommercialPathInfo().getOpeProComPro().getOperator(), from.getCommercialPathInfo().getOpeProComPro().getCommercialProduct(), from.getCommercialPathInfo().getComercialPathKey().getCommercialNumber(), new TrainInfoStation(from.getCommercialPathInfo().getComercialPathKey().getOriginStationCode(), ""), new TrainInfoStation(from.getCommercialPathInfo().getComercialPathKey().getDestinationStationCode(), ""), from.getCommercialPathInfo().getTimestamp().getTime(), from.getCommercialPathInfo().getComercialPathKey().getLaunchingDate(), from.getCommercialPathInfo().getObservation());
    }
}
