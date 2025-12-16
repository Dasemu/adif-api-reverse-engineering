package com.adif.elcanomovil.uiTrain.entities;

import com.adif.elcanomovil.domain.entities.circulation.CommercialPathRouteSidesInfo;
import com.adif.elcanomovil.domain.entities.compositions.Composition;
import com.adif.elcanomovil.domain.entities.compositions.Wagon;
import com.google.firebase.messaging.Constants;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/entities/TrainInfoMapper;", "", "()V", "map", "", "Lcom/adif/elcanomovil/uiTrain/entities/TrainInfo;", Constants.MessagePayloadKeys.FROM, "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathRouteSidesInfo;", "composition", "Lcom/adif/elcanomovil/domain/entities/compositions/Composition;", "extended", "", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrainInfoMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainInfoMapper.kt\ncom/adif/elcanomovil/uiTrain/entities/TrainInfoMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
/* loaded from: classes3.dex */
public final class TrainInfoMapper {
    public static /* synthetic */ List map$default(TrainInfoMapper trainInfoMapper, List list, Composition composition, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            composition = null;
        }
        return trainInfoMapper.map(list, composition, z3);
    }

    public final List<TrainInfo> map(List<CommercialPathRouteSidesInfo> from, Composition composition, boolean extended) {
        List<Wagon> emptyList;
        Intrinsics.checkNotNullParameter(from, "from");
        CommercialPathRouteSidesInfo commercialPathRouteSidesInfo = from.get(0);
        String operator = commercialPathRouteSidesInfo.getCommercialPathInfo().getOpeProComPro().getOperator();
        String commercialProduct = commercialPathRouteSidesInfo.getCommercialPathInfo().getOpeProComPro().getCommercialProduct();
        String commercialNumber = commercialPathRouteSidesInfo.getCommercialPathInfo().getComercialPathKey().getCommercialNumber();
        TrainInfoStation trainInfoStation = new TrainInfoStation(commercialPathRouteSidesInfo.getCommercialPathInfo().getComercialPathKey().getOriginStationCode(), "", TrainInfoMapperKt.access$plannedTime(commercialPathRouteSidesInfo, true), TrainInfoMapperKt.access$delayedTime(commercialPathRouteSidesInfo, true), commercialPathRouteSidesInfo.platform(0));
        TrainInfoStation trainInfoStation2 = new TrainInfoStation(commercialPathRouteSidesInfo.getCommercialPathInfo().getComercialPathKey().getDestinationStationCode(), "", TrainInfoMapperKt.access$plannedTime(commercialPathRouteSidesInfo, false), TrainInfoMapperKt.access$delayedTime(commercialPathRouteSidesInfo, false), commercialPathRouteSidesInfo.platform(commercialPathRouteSidesInfo.getPassthroughSteps().size() - 1));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(commercialPathRouteSidesInfo.getCommercialPathInfo().getComercialPathKey().getLaunchingDate());
        Unit unit = Unit.INSTANCE;
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        boolean isCercanias = commercialPathRouteSidesInfo.getCommercialPathInfo().isCercanias();
        List emptyList2 = CollectionsKt.emptyList();
        String observation = commercialPathRouteSidesInfo.getCommercialPathInfo().getObservation();
        if (composition == null || (emptyList = composition.getCoachs()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        return CollectionsKt.listOf(new TrainInfo(operator, commercialProduct, commercialNumber, trainInfoStation, trainInfoStation2, time, isCercanias, emptyList2, observation, emptyList, extended));
    }
}
