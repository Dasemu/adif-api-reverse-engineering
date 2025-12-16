package com.adif.elcanomovil.uiTrain.entities;

import com.adif.elcanomovil.domain.entities.circulation.CommercialPathRouteSidesInfo;
import com.adif.elcanomovil.domain.entities.circulation.PassthroughDetailsStep;
import com.adif.elcanomovil.domain.entities.circulation.PassthroughDetailsStepSide;
import com.adif.elcanomovil.domain.entities.compositions.Composition;
import com.adif.elcanomovil.domain.entities.compositions.Wagon;
import com.adif.elcanomovil.uiTrain.entities.Step;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/entities/StepMapper;", "", "()V", "map", "", "Lcom/adif/elcanomovil/uiTrain/entities/Step;", Constants.MessagePayloadKeys.FROM, "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathRouteSidesInfo;", "compositions", "Lcom/adif/elcanomovil/domain/entities/compositions/Composition;", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStepMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepMapper.kt\ncom/adif/elcanomovil/uiTrain/entities/StepMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n1864#2,2:182\n288#2,2:184\n1866#2:186\n*S KotlinDebug\n*F\n+ 1 StepMapper.kt\ncom/adif/elcanomovil/uiTrain/entities/StepMapper\n*L\n17#1:182,2\n55#1:184,2\n17#1:186\n*E\n"})
/* loaded from: classes3.dex */
public final class StepMapper {
    public final List<Step> map(List<CommercialPathRouteSidesInfo> from, List<Composition> compositions) {
        PassthroughDetailsStepSide departurePassthroughStepSides;
        Step step;
        PassthroughDetailsStepSide arrivalPassthroughStepSides;
        PassthroughDetailsStepSide arrivalPassthroughStepSides2;
        String observation;
        PassthroughDetailsStepSide arrivalPassthroughStepSides3;
        String platform;
        boolean platformMuted;
        boolean z3;
        PassthroughDetailsStepSide arrivalPassthroughStepSides4;
        String str;
        Object obj;
        List<Wagon> emptyList;
        String ctcPlatform;
        String sitraPlatform;
        String plannedPlatform;
        String operatorPlatform;
        PassthroughDetailsStepSide departurePassthroughStepSides2;
        PassthroughDetailsStepSide departurePassthroughStepSides3;
        PassthroughDetailsStepSide departurePassthroughStepSides4;
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(compositions, "compositions");
        List reversed = CollectionsKt.reversed(from.get(0).getPassthroughSteps());
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : reversed) {
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            PassthroughDetailsStep passthroughDetailsStep = (PassthroughDetailsStep) obj2;
            boolean z4 = i > 0;
            PassthroughDetailsStepSide departurePassthroughStepSides5 = passthroughDetailsStep.getDeparturePassthroughStepSides();
            boolean z5 = (departurePassthroughStepSides5 != null && departurePassthroughStepSides5.isAudited()) || !((departurePassthroughStepSides = passthroughDetailsStep.getDeparturePassthroughStepSides()) == null || departurePassthroughStepSides.isSuppressed() || (step = (Step) CollectionsKt.getOrNull(arrayList, i + (-1))) == null || !step.getIsArrivalAudited());
            PassthroughDetailsStepSide arrivalPassthroughStepSides5 = passthroughDetailsStep.getArrivalPassthroughStepSides();
            boolean z6 = (arrivalPassthroughStepSides5 != null && arrivalPassthroughStepSides5.isAudited()) || (i > 0 && (arrivalPassthroughStepSides = passthroughDetailsStep.getArrivalPassthroughStepSides()) != null && !arrivalPassthroughStepSides.isSuppressed() && z5);
            PassthroughDetailsStepSide departurePassthroughStepSides6 = z4 ? passthroughDetailsStep.getDeparturePassthroughStepSides() : passthroughDetailsStep.getArrivalPassthroughStepSides();
            Date plannedDate = passthroughDetailsStep.plannedDate(z4);
            String access$plannedTime = StepMapperKt.access$plannedTime(passthroughDetailsStep, z4, from.get(0).getCommercialPathInfo().isCercanias());
            long access$plannedTimeLong = StepMapperKt.access$plannedTimeLong(passthroughDetailsStep, z4);
            String access$delayedTime = StepMapperKt.access$delayedTime(passthroughDetailsStep, z4);
            Date access$myPlannedDate = StepMapperKt.access$myPlannedDate(passthroughDetailsStep, z4, from.get(0).getCommercialPathInfo().isCercanias());
            String obj3 = StepMapperKt.access$state(passthroughDetailsStep, z4).toString();
            String stationCode = passthroughDetailsStep.getStationCode();
            String str2 = (!z4 ? !((arrivalPassthroughStepSides2 = passthroughDetailsStep.getArrivalPassthroughStepSides()) == null || (observation = arrivalPassthroughStepSides2.getObservation()) == null) : !((departurePassthroughStepSides4 = passthroughDetailsStep.getDeparturePassthroughStepSides()) == null || (observation = departurePassthroughStepSides4.getObservation()) == null)) ? "" : observation;
            String str3 = (!z4 ? !((arrivalPassthroughStepSides3 = passthroughDetailsStep.getArrivalPassthroughStepSides()) == null || (platform = arrivalPassthroughStepSides3.getPlatform()) == null) : !((departurePassthroughStepSides3 = passthroughDetailsStep.getDeparturePassthroughStepSides()) == null || (platform = departurePassthroughStepSides3.getPlatform()) == null)) ? "" : platform;
            if (z4) {
                PassthroughDetailsStepSide departurePassthroughStepSides7 = passthroughDetailsStep.getDeparturePassthroughStepSides();
                if (departurePassthroughStepSides7 != null) {
                    platformMuted = departurePassthroughStepSides7.getPlatformMuted();
                    z3 = platformMuted;
                }
                z3 = false;
            } else {
                PassthroughDetailsStepSide arrivalPassthroughStepSides6 = passthroughDetailsStep.getArrivalPassthroughStepSides();
                if (arrivalPassthroughStepSides6 != null) {
                    platformMuted = arrivalPassthroughStepSides6.getPlatformMuted();
                    z3 = platformMuted;
                }
                z3 = false;
            }
            boolean z7 = !z4 ? (arrivalPassthroughStepSides4 = passthroughDetailsStep.getArrivalPassthroughStepSides()) == null || !arrivalPassthroughStepSides4.isPlatformWarning() : (departurePassthroughStepSides2 = passthroughDetailsStep.getDeparturePassthroughStepSides()) == null || !departurePassthroughStepSides2.isPlatformWarning();
            Step.State access$state = StepMapperKt.access$state(passthroughDetailsStep, false);
            Step.State access$state2 = StepMapperKt.access$state(passthroughDetailsStep, true);
            Iterator<T> it = compositions.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Composition composition = (Composition) obj;
                PassthroughDetailsStepSide departurePassthroughStepSides8 = passthroughDetailsStep.getDeparturePassthroughStepSides();
                if (departurePassthroughStepSides8 != null && composition.getPlannedTime() == departurePassthroughStepSides8.getPlannedTime()) {
                    break;
                }
            }
            Composition composition2 = (Composition) obj;
            if (composition2 == null || (emptyList = composition2.getCoachs()) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            List<Wagon> list = emptyList;
            String str4 = (departurePassthroughStepSides6 == null || (operatorPlatform = departurePassthroughStepSides6.getOperatorPlatform()) == null) ? "" : operatorPlatform;
            String str5 = (departurePassthroughStepSides6 == null || (plannedPlatform = departurePassthroughStepSides6.getPlannedPlatform()) == null) ? "-" : plannedPlatform;
            String str6 = (departurePassthroughStepSides6 == null || (sitraPlatform = departurePassthroughStepSides6.getSitraPlatform()) == null) ? "-" : sitraPlatform;
            String str7 = (departurePassthroughStepSides6 == null || (ctcPlatform = departurePassthroughStepSides6.getCtcPlatform()) == null) ? "-" : ctcPlatform;
            String technicalNumber = departurePassthroughStepSides6 != null ? departurePassthroughStepSides6.getTechnicalNumber() : null;
            String resultantPlatform = departurePassthroughStepSides6 != null ? departurePassthroughStepSides6.getResultantPlatform() : null;
            if (departurePassthroughStepSides6 != null) {
                str = departurePassthroughStepSides6.getPreassignedPlatform();
            }
            arrayList.add(new Step(plannedDate, access$plannedTime, access$plannedTimeLong, access$delayedTime, access$myPlannedDate, obj3, stationCode, null, str2, str3, z7, z3, access$state, access$state2, z6, z5, list, str4, str5, str6, str7, technicalNumber, resultantPlatform, str, 128, null));
            i = i4;
        }
        return CollectionsKt.toList(CollectionsKt.reversed(arrayList));
    }
}
