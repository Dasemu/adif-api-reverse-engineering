package com.adif.elcanomovil.domain.entities.circulation.mappers;

import com.adif.elcanomovil.domain.entities.circulation.AvldmdCirculation;
import com.adif.elcanomovil.domain.entities.circulation.CommercialPathStepSideInfo;
import com.adif.elcanomovil.domain.entities.circulation.CommercialRouteInfo;
import com.adif.elcanomovil.domain.entities.circulation.PassthroughStepSides;
import com.adif.elcanomovil.domain.entities.circulation.RouteStepSide;
import com.adif.elcanomovil.domain.extensions.LongKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.text.DateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u001c\u0010\u0017\u001a\u00020\u0014*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u0014\u0010\u0017\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\"\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"measuredArrivalDate", "Ljava/util/Date;", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialRouteInfo;", "getMeasuredArrivalDate", "(Lcom/adif/elcanomovil/domain/entities/circulation/CommercialRouteInfo;)Ljava/util/Date;", "measuredDepartureDate", "getMeasuredDepartureDate", "plannedArrivalDate", "getPlannedArrivalDate", "plannedDepartureDate", "getPlannedDepartureDate", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/adif/elcanomovil/domain/entities/circulation/AvldmdCirculation$State;", "getState", "(Lcom/adif/elcanomovil/domain/entities/circulation/CommercialRouteInfo;)Lcom/adif/elcanomovil/domain/entities/circulation/AvldmdCirculation$State;", "date", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathStepSideInfo;", "isDeparture", "", "delayedTime", "", "formatter", "Ljava/text/DateFormat;", "plannedTime", "domain_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AvldmdCirculationMapperKt {
    public static final Date date(CommercialPathStepSideInfo commercialPathStepSideInfo, boolean z3) {
        Date delayedDate;
        PassthroughStepSides passthroughStepSide = commercialPathStepSideInfo.passthroughStepSide(z3);
        return (passthroughStepSide == null || (delayedDate = LongKt.getDelayedDate(passthroughStepSide.getPlannedTime(), 0)) == null) ? new Date() : delayedDate;
    }

    public static final String delayedTime(CommercialPathStepSideInfo commercialPathStepSideInfo, boolean z3, DateFormat dateFormat) {
        PassthroughStepSides passthroughStepSide = commercialPathStepSideInfo.passthroughStepSide(z3);
        if (passthroughStepSide == null) {
            return "";
        }
        int forecatedOrAuditedDelay = passthroughStepSide.getForecatedOrAuditedDelay();
        if (!passthroughStepSide.getShowDelay() || forecatedOrAuditedDelay <= 0) {
            return "";
        }
        String format = dateFormat.format(LongKt.getDelayedDate(passthroughStepSide.getPlannedTime(), forecatedOrAuditedDelay));
        Intrinsics.checkNotNull(format);
        return format;
    }

    private static final Date getMeasuredArrivalDate(CommercialRouteInfo commercialRouteInfo) {
        return LongKt.getDelayedDate(commercialRouteInfo.getPassthroughStep().getArrivalPassthroughStepSides().getPlannedTime(), commercialRouteInfo.getPassthroughStep().getArrivalPassthroughStepSides().getForecatedOrAuditedDelay());
    }

    private static final Date getMeasuredDepartureDate(CommercialRouteInfo commercialRouteInfo) {
        return LongKt.getDelayedDate(commercialRouteInfo.getPassthroughStep().getDeparturePassthroughStepSides().getPlannedTime(), commercialRouteInfo.getPassthroughStep().getDeparturePassthroughStepSides().getForecatedOrAuditedDelay());
    }

    private static final Date getPlannedArrivalDate(CommercialRouteInfo commercialRouteInfo) {
        return LongKt.getDelayedDate(commercialRouteInfo.getPassthroughStep().getArrivalPassthroughStepSides().getPlannedTime(), 0);
    }

    public static final Date getPlannedDepartureDate(CommercialRouteInfo commercialRouteInfo) {
        return LongKt.getDelayedDate(commercialRouteInfo.getPassthroughStep().getDeparturePassthroughStepSides().getPlannedTime(), 0);
    }

    public static final AvldmdCirculation.State getState(CommercialRouteInfo commercialRouteInfo) {
        RouteStepSide departurePassthroughStepSides = commercialRouteInfo.getPassthroughStep().getDeparturePassthroughStepSides();
        if (departurePassthroughStepSides.isSuppressed()) {
            return AvldmdCirculation.State.SUPPRESSED;
        }
        if (departurePassthroughStepSides.getImmediateDeparture()) {
            return AvldmdCirculation.State.BOARDING;
        }
        if (departurePassthroughStepSides.getForecatedOrAuditedDelay() > 0) {
            return AvldmdCirculation.State.DELAYED;
        }
        return null;
    }

    public static final String plannedTime(CommercialPathStepSideInfo commercialPathStepSideInfo, boolean z3, DateFormat dateFormat) {
        String format = dateFormat.format(date(commercialPathStepSideInfo, z3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final AvldmdCirculation.State state(CommercialPathStepSideInfo commercialPathStepSideInfo, boolean z3) {
        PassthroughStepSides passthroughStepSide = commercialPathStepSideInfo.passthroughStepSide(z3);
        if (passthroughStepSide == null) {
            return null;
        }
        if (passthroughStepSide.isSuppressed()) {
            return AvldmdCirculation.State.SUPPRESSED;
        }
        if (passthroughStepSide.getImmediateDeparture() && passthroughStepSide.isAudited()) {
            return AvldmdCirculation.State.BOARDING;
        }
        if (passthroughStepSide.getForecatedOrAuditedDelay() > 0) {
            return AvldmdCirculation.State.DELAYED;
        }
        return null;
    }

    public static final String plannedTime(CommercialRouteInfo commercialRouteInfo, DateFormat dateFormat) {
        return dateFormat.format(getPlannedDepartureDate(commercialRouteInfo)) + '-' + dateFormat.format(getPlannedArrivalDate(commercialRouteInfo));
    }

    public static final String delayedTime(CommercialRouteInfo commercialRouteInfo, DateFormat dateFormat) {
        if (!commercialRouteInfo.getPassthroughStep().getDeparturePassthroughStepSides().getShowDelay()) {
            return null;
        }
        String plannedTime = plannedTime(commercialRouteInfo, dateFormat);
        String str = dateFormat.format(getMeasuredDepartureDate(commercialRouteInfo)) + '-' + dateFormat.format(getMeasuredArrivalDate(commercialRouteInfo));
        if (Intrinsics.areEqual(str, plannedTime)) {
            return null;
        }
        return str;
    }
}
