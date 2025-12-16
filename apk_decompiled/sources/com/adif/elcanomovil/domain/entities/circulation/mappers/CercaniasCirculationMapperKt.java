package com.adif.elcanomovil.domain.entities.circulation.mappers;

import com.adif.elcanomovil.domain.entities.circulation.CommercialPathStepSideInfo;
import com.adif.elcanomovil.domain.entities.circulation.CommercialRouteInfo;
import com.adif.elcanomovil.domain.entities.circulation.PassthroughStepSides;
import com.adif.elcanomovil.domain.extensions.LongKt;
import java.text.DateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\nH\u0002\u001a\u001c\u0010\r\u001a\u00020\n*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0014\u0010\r\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0014\u0010\u0013\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\u0003*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u0014"}, d2 = {"MILLISECONDS", "", "estimatedArrivalDate", "Ljava/util/Date;", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialRouteInfo;", "getEstimatedArrivalDate", "(Lcom/adif/elcanomovil/domain/entities/circulation/CommercialRouteInfo;)Ljava/util/Date;", "estimatedDepartureDate", "getEstimatedDepartureDate", "getLineIconUrlFromCore", "", "core", "line", "displayableTime", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathStepSideInfo;", "isDeparture", "", "formatter", "Ljava/text/DateFormat;", "plannedDate", "domain_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CercaniasCirculationMapperKt {
    public static final int MILLISECONDS = 60000;

    public static final /* synthetic */ String access$displayableTime(CommercialPathStepSideInfo commercialPathStepSideInfo, boolean z3, DateFormat dateFormat) {
        return displayableTime(commercialPathStepSideInfo, z3, dateFormat);
    }

    public static final /* synthetic */ Date access$getEstimatedDepartureDate(CommercialRouteInfo commercialRouteInfo) {
        return getEstimatedDepartureDate(commercialRouteInfo);
    }

    public static final /* synthetic */ String access$getLineIconUrlFromCore(String str, String str2) {
        return getLineIconUrlFromCore(str, str2);
    }

    public static final /* synthetic */ Date access$plannedDate(CommercialPathStepSideInfo commercialPathStepSideInfo, boolean z3) {
        return plannedDate(commercialPathStepSideInfo, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayableTime(CommercialRouteInfo commercialRouteInfo, DateFormat dateFormat) {
        if (commercialRouteInfo.getPassthroughStep().getDeparturePassthroughStepSides().getImmediateDeparture()) {
            return "";
        }
        return dateFormat.format(getEstimatedDepartureDate(commercialRouteInfo)) + '-' + dateFormat.format(getEstimatedArrivalDate(commercialRouteInfo));
    }

    private static final Date getEstimatedArrivalDate(CommercialRouteInfo commercialRouteInfo) {
        return LongKt.getDelayedDate(commercialRouteInfo.getPassthroughStep().getArrivalPassthroughStepSides().getPlannedTime(), commercialRouteInfo.getPassthroughStep().getArrivalPassthroughStepSides().getForecatedOrAuditedDelay());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date getEstimatedDepartureDate(CommercialRouteInfo commercialRouteInfo) {
        return LongKt.getDelayedDate(commercialRouteInfo.getPassthroughStep().getDeparturePassthroughStepSides().getPlannedTime(), commercialRouteInfo.getPassthroughStep().getDeparturePassthroughStepSides().getForecatedOrAuditedDelay());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLineIconUrlFromCore(String str, String str2) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return "https://firebasestorage.googleapis.com/v0/b/elcanopro.appspot.com/o/lines%2F" + str + '_' + str2 + ".png?alt=media";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date plannedDate(CommercialPathStepSideInfo commercialPathStepSideInfo, boolean z3) {
        Date delayedDate;
        PassthroughStepSides passthroughStepSide = commercialPathStepSideInfo.passthroughStepSide(z3);
        return (passthroughStepSide == null || (delayedDate = LongKt.getDelayedDate(passthroughStepSide.getPlannedTime(), passthroughStepSide.getForecatedOrAuditedDelay())) == null) ? new Date() : delayedDate;
    }

    public static final /* synthetic */ String access$displayableTime(CommercialRouteInfo commercialRouteInfo, DateFormat dateFormat) {
        return displayableTime(commercialRouteInfo, dateFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayableTime(CommercialPathStepSideInfo commercialPathStepSideInfo, boolean z3, DateFormat dateFormat) {
        String format;
        PassthroughStepSides passthroughStepSide = commercialPathStepSideInfo.passthroughStepSide(z3);
        Date plannedDate = plannedDate(commercialPathStepSideInfo, z3);
        long time = plannedDate.getTime() - commercialPathStepSideInfo.getCommercialPathInfo().getTimestamp().getTime();
        long j4 = time < 0 ? 0L : time / MILLISECONDS;
        if ((passthroughStepSide != null && passthroughStepSide.getImmediateDeparture()) || j4 == 0) {
            return "";
        }
        if (passthroughStepSide != null && passthroughStepSide.getCountDown()) {
            format = j4 + " min";
        } else {
            format = dateFormat.format(plannedDate);
        }
        Intrinsics.checkNotNull(format);
        return format;
    }
}
