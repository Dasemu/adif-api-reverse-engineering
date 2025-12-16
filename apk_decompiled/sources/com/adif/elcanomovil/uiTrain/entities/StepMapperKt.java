package com.adif.elcanomovil.uiTrain.entities;

import com.adif.elcanomovil.domain.entities.circulation.PassthroughDetailsStep;
import com.adif.elcanomovil.domain.entities.circulation.PassthroughDetailsStepSide;
import com.adif.elcanomovil.domain.extensions.LongKt;
import com.adif.elcanomovil.uiTrain.entities.Step;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a\u001c\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\n\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u000f"}, d2 = {"delayedDate", "Ljava/util/Date;", "Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughDetailsStep;", "isDeparture", "", "delayedTime", "", "myPlannedDate", "isCercanias", "plannedTime", "plannedTimeCercanias", "plannedTimeLong", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/adif/elcanomovil/uiTrain/entities/Step$State;", "ui-train_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StepMapperKt {
    public static final /* synthetic */ String access$delayedTime(PassthroughDetailsStep passthroughDetailsStep, boolean z3) {
        return delayedTime(passthroughDetailsStep, z3);
    }

    public static final /* synthetic */ Date access$myPlannedDate(PassthroughDetailsStep passthroughDetailsStep, boolean z3, boolean z4) {
        return myPlannedDate(passthroughDetailsStep, z3, z4);
    }

    public static final /* synthetic */ String access$plannedTime(PassthroughDetailsStep passthroughDetailsStep, boolean z3, boolean z4) {
        return plannedTime(passthroughDetailsStep, z3, z4);
    }

    public static final /* synthetic */ long access$plannedTimeLong(PassthroughDetailsStep passthroughDetailsStep, boolean z3) {
        return plannedTimeLong(passthroughDetailsStep, z3);
    }

    public static final /* synthetic */ Step.State access$state(PassthroughDetailsStep passthroughDetailsStep, boolean z3) {
        return state(passthroughDetailsStep, z3);
    }

    private static final Date delayedDate(PassthroughDetailsStep passthroughDetailsStep, boolean z3) {
        Date delayedDate;
        PassthroughDetailsStepSide departurePassthroughStepSides = z3 ? passthroughDetailsStep.getDeparturePassthroughStepSides() : passthroughDetailsStep.getArrivalPassthroughStepSides();
        int i = 0;
        if (departurePassthroughStepSides != null && departurePassthroughStepSides.getShowDelay() && departurePassthroughStepSides != null) {
            i = departurePassthroughStepSides.getForecastedOrAuditedDelay();
        }
        return (departurePassthroughStepSides == null || (delayedDate = LongKt.getDelayedDate(departurePassthroughStepSides.getPlannedTime(), i)) == null) ? passthroughDetailsStep.plannedDate(z3) : delayedDate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String delayedTime(PassthroughDetailsStep passthroughDetailsStep, boolean z3) {
        Date date;
        PassthroughDetailsStepSide departurePassthroughStepSides = z3 ? passthroughDetailsStep.getDeparturePassthroughStepSides() : passthroughDetailsStep.getArrivalPassthroughStepSides();
        int i = 0;
        if (departurePassthroughStepSides != null && departurePassthroughStepSides.getShowDelay() && departurePassthroughStepSides != null) {
            i = departurePassthroughStepSides.getForecastedOrAuditedDelay();
        }
        if (departurePassthroughStepSides == null || (date = LongKt.getDelayedDate(departurePassthroughStepSides.getPlannedTime(), i)) == null) {
            date = new Date();
        }
        String format = new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(date);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date myPlannedDate(PassthroughDetailsStep passthroughDetailsStep, boolean z3, boolean z4) {
        if (z4) {
            return passthroughDetailsStep.plannedDate(z3);
        }
        Date date = new Date();
        Long l4 = null;
        if (z3) {
            PassthroughDetailsStepSide departurePassthroughStepSides = passthroughDetailsStep.getDeparturePassthroughStepSides();
            if (departurePassthroughStepSides != null) {
                l4 = Long.valueOf(departurePassthroughStepSides.getPlannedTime());
            }
        } else {
            PassthroughDetailsStepSide arrivalPassthroughStepSides = passthroughDetailsStep.getArrivalPassthroughStepSides();
            if (arrivalPassthroughStepSides != null) {
                l4 = Long.valueOf(arrivalPassthroughStepSides.getPlannedTime());
            }
        }
        if (l4 != null) {
            date.setTime(l4.longValue());
        }
        return date;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String plannedTime(PassthroughDetailsStep passthroughDetailsStep, boolean z3, boolean z4) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
        if (z4) {
            return plannedTimeCercanias(passthroughDetailsStep, z3);
        }
        Long l4 = null;
        if (z3) {
            PassthroughDetailsStepSide departurePassthroughStepSides = passthroughDetailsStep.getDeparturePassthroughStepSides();
            if (departurePassthroughStepSides != null) {
                l4 = Long.valueOf(departurePassthroughStepSides.getPlannedTime());
            }
        } else {
            PassthroughDetailsStepSide arrivalPassthroughStepSides = passthroughDetailsStep.getArrivalPassthroughStepSides();
            if (arrivalPassthroughStepSides != null) {
                l4 = Long.valueOf(arrivalPassthroughStepSides.getPlannedTime());
            }
        }
        String format = simpleDateFormat.format(l4);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private static final String plannedTimeCercanias(PassthroughDetailsStep passthroughDetailsStep, boolean z3) {
        String format = new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(Long.valueOf(passthroughDetailsStep.plannedDate(z3).getTime()));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long plannedTimeLong(PassthroughDetailsStep passthroughDetailsStep, boolean z3) {
        Long l4 = null;
        if (z3) {
            PassthroughDetailsStepSide departurePassthroughStepSides = passthroughDetailsStep.getDeparturePassthroughStepSides();
            if (departurePassthroughStepSides != null) {
                l4 = Long.valueOf(departurePassthroughStepSides.getPlannedTime());
            }
        } else {
            PassthroughDetailsStepSide arrivalPassthroughStepSides = passthroughDetailsStep.getArrivalPassthroughStepSides();
            if (arrivalPassthroughStepSides != null) {
                l4 = Long.valueOf(arrivalPassthroughStepSides.getPlannedTime());
            }
        }
        if (l4 != null) {
            return l4.longValue();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Step.State state(PassthroughDetailsStep passthroughDetailsStep, boolean z3) {
        int forecastedOrAuditedDelay;
        Boolean bool = null;
        if (z3) {
            PassthroughDetailsStepSide departurePassthroughStepSides = passthroughDetailsStep.getDeparturePassthroughStepSides();
            if (departurePassthroughStepSides != null) {
                bool = Boolean.valueOf(departurePassthroughStepSides.isSuppressed());
            }
        } else {
            PassthroughDetailsStepSide arrivalPassthroughStepSides = passthroughDetailsStep.getArrivalPassthroughStepSides();
            if (arrivalPassthroughStepSides != null) {
                bool = Boolean.valueOf(arrivalPassthroughStepSides.isSuppressed());
            }
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        if (z3) {
            PassthroughDetailsStepSide departurePassthroughStepSides2 = passthroughDetailsStep.getDeparturePassthroughStepSides();
            if (departurePassthroughStepSides2 != null) {
                forecastedOrAuditedDelay = departurePassthroughStepSides2.getForecastedOrAuditedDelay();
            }
            forecastedOrAuditedDelay = 0;
        } else {
            PassthroughDetailsStepSide arrivalPassthroughStepSides2 = passthroughDetailsStep.getArrivalPassthroughStepSides();
            if (arrivalPassthroughStepSides2 != null) {
                forecastedOrAuditedDelay = arrivalPassthroughStepSides2.getForecastedOrAuditedDelay();
            }
            forecastedOrAuditedDelay = 0;
        }
        return booleanValue ? Step.State.SUPPRESSED : forecastedOrAuditedDelay > 0 ? Step.State.DELAYED : Step.State.RUNNING;
    }
}
