package com.adif.elcanomovil.uiTrain.entities;

import com.adif.elcanomovil.domain.entities.circulation.CommercialPathRouteSidesInfo;
import com.adif.elcanomovil.domain.entities.circulation.PassthroughDetailsStep;
import com.adif.elcanomovil.domain.entities.circulation.PassthroughDetailsStepSide;
import com.adif.elcanomovil.domain.extensions.LongKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {TrainInfoMapperKt.CERCANIAS, "", "delayedTime", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathRouteSidesInfo;", "isDeparture", "", "plannedTime", "plannedTimeCercanias", "ui-train_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrainInfoMapperKt {
    public static final String CERCANIAS = "CERCANIAS";

    public static final String delayedTime(CommercialPathRouteSidesInfo commercialPathRouteSidesInfo, boolean z3) {
        PassthroughDetailsStepSide arrivalPassthroughStepSides;
        Date date;
        if (z3) {
            PassthroughDetailsStep passthroughDetailsStep = (PassthroughDetailsStep) CollectionsKt.firstOrNull((List) commercialPathRouteSidesInfo.getPassthroughSteps());
            if (passthroughDetailsStep != null) {
                arrivalPassthroughStepSides = passthroughDetailsStep.getDeparturePassthroughStepSides();
            }
            arrivalPassthroughStepSides = null;
        } else {
            PassthroughDetailsStep passthroughDetailsStep2 = (PassthroughDetailsStep) CollectionsKt.lastOrNull((List) commercialPathRouteSidesInfo.getPassthroughSteps());
            if (passthroughDetailsStep2 != null) {
                arrivalPassthroughStepSides = passthroughDetailsStep2.getArrivalPassthroughStepSides();
            }
            arrivalPassthroughStepSides = null;
        }
        if (commercialPathRouteSidesInfo.getCommercialPathInfo().isCercanias()) {
            return "";
        }
        Integer valueOf = arrivalPassthroughStepSides != null ? Integer.valueOf(arrivalPassthroughStepSides.getForecastedOrAuditedDelay()) : null;
        boolean showDelay = arrivalPassthroughStepSides != null ? arrivalPassthroughStepSides.getShowDelay() : true;
        if (valueOf != null && (arrivalPassthroughStepSides.isAudited() || !showDelay)) {
            return "";
        }
        if (arrivalPassthroughStepSides != null) {
            long plannedTime = arrivalPassthroughStepSides.getPlannedTime();
            Intrinsics.checkNotNull(valueOf);
            date = LongKt.getDelayedDate(plannedTime, valueOf.intValue());
        } else {
            date = null;
        }
        String format = date != null ? new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(date) : null;
        return format == null ? "" : format;
    }

    public static final String plannedTime(CommercialPathRouteSidesInfo commercialPathRouteSidesInfo, boolean z3) {
        PassthroughDetailsStepSide arrivalPassthroughStepSides;
        PassthroughDetailsStepSide departurePassthroughStepSides;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
        if (commercialPathRouteSidesInfo.getCommercialPathInfo().isCercanias()) {
            return plannedTimeCercanias(commercialPathRouteSidesInfo, z3);
        }
        Long l4 = null;
        if (z3) {
            PassthroughDetailsStep passthroughDetailsStep = (PassthroughDetailsStep) CollectionsKt.firstOrNull((List) commercialPathRouteSidesInfo.getPassthroughSteps());
            if (passthroughDetailsStep != null && (departurePassthroughStepSides = passthroughDetailsStep.getDeparturePassthroughStepSides()) != null) {
                l4 = Long.valueOf(departurePassthroughStepSides.getPlannedTime());
            }
        } else {
            PassthroughDetailsStep passthroughDetailsStep2 = (PassthroughDetailsStep) CollectionsKt.lastOrNull((List) commercialPathRouteSidesInfo.getPassthroughSteps());
            if (passthroughDetailsStep2 != null && (arrivalPassthroughStepSides = passthroughDetailsStep2.getArrivalPassthroughStepSides()) != null) {
                l4 = Long.valueOf(arrivalPassthroughStepSides.getPlannedTime());
            }
        }
        String format = simpleDateFormat.format(l4);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private static final String plannedTimeCercanias(CommercialPathRouteSidesInfo commercialPathRouteSidesInfo, boolean z3) {
        Date date;
        PassthroughDetailsStep passthroughDetailsStep = z3 ? (PassthroughDetailsStep) CollectionsKt.firstOrNull((List) commercialPathRouteSidesInfo.getPassthroughSteps()) : (PassthroughDetailsStep) CollectionsKt.lastOrNull((List) commercialPathRouteSidesInfo.getPassthroughSteps());
        if (passthroughDetailsStep == null || (date = passthroughDetailsStep.plannedDate(z3)) == null) {
            date = new Date();
        }
        String format = new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(Long.valueOf(date.getTime()));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
