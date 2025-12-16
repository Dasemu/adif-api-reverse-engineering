package com.adif.elcanomovil.domain.entities.circulation.mappers;

import C.w;
import com.adif.elcanomovil.domain.BuildConfig;
import com.adif.elcanomovil.domain.entities.circulation.AvldmdCirculation;
import com.adif.elcanomovil.domain.entities.circulation.CommercialCirculation;
import com.adif.elcanomovil.domain.entities.circulation.CommercialPathStepSideInfo;
import com.adif.elcanomovil.domain.entities.circulation.CommercialRouteInfo;
import com.adif.elcanomovil.domain.entities.circulation.PassthroughStepSides;
import com.adif.elcanomovil.domain.entities.circulation.TrainCirculationInfo;
import com.google.firebase.messaging.Constants;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0002J$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/mappers/AvldmdCirculationMapper;", "", "formatter", "Ljava/text/DateFormat;", "(Ljava/text/DateFormat;)V", "mapToCirculation", "Lcom/adif/elcanomovil/domain/entities/circulation/AvldmdCirculation;", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialRouteInfo;", "getMapToCirculation", "(Lcom/adif/elcanomovil/domain/entities/circulation/CommercialRouteInfo;)Lcom/adif/elcanomovil/domain/entities/circulation/AvldmdCirculation;", "makeJourneyCirculations", "", "list", "makeOneWayCirculations", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathStepSideInfo;", "isDeparture", "", "map", Constants.MessagePayloadKeys.FROM, "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialCirculation;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAvldmdCirculationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvldmdCirculationMapper.kt\ncom/adif/elcanomovil/domain/entities/circulation/mappers/AvldmdCirculationMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n800#2,11:239\n800#2,11:250\n766#2:261\n857#2,2:262\n1045#2:264\n1549#2:265\n1620#2,3:266\n766#2:269\n857#2,2:270\n1045#2:272\n1549#2:273\n1620#2,3:274\n*S KotlinDebug\n*F\n+ 1 AvldmdCirculationMapper.kt\ncom/adif/elcanomovil/domain/entities/circulation/mappers/AvldmdCirculationMapper\n*L\n20#1:239,11\n26#1:250,11\n40#1:261\n40#1:262,2\n47#1:264\n48#1:265\n48#1:266,3\n58#1:269\n58#1:270,2\n65#1:272\n66#1:273\n66#1:274,3\n*E\n"})
/* loaded from: classes.dex */
public final class AvldmdCirculationMapper {
    private final DateFormat formatter;

    public AvldmdCirculationMapper(DateFormat formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.formatter = formatter;
    }

    private final AvldmdCirculation getMapToCirculation(CommercialRouteInfo commercialRouteInfo) {
        String access$plannedTime = AvldmdCirculationMapperKt.access$plannedTime(commercialRouteInfo, this.formatter);
        Date access$getPlannedDepartureDate = AvldmdCirculationMapperKt.access$getPlannedDepartureDate(commercialRouteInfo);
        String access$delayedTime = AvldmdCirculationMapperKt.access$delayedTime(commercialRouteInfo, this.formatter);
        String stationCode = commercialRouteInfo.getStationCode();
        String stationCode2 = commercialRouteInfo.getStationCode();
        AvldmdCirculation.Train train = new AvldmdCirculation.Train(commercialRouteInfo.getCommercialPathInfo().getOpeProComPro().getOperator(), commercialRouteInfo.getCommercialPathInfo().getComercialPathKey().getCommercialNumber(), commercialRouteInfo.getCommercialPathInfo().getOpeProComPro().getCommercialProduct());
        AvldmdCirculation.State access$getState = AvldmdCirculationMapperKt.access$getState(commercialRouteInfo);
        String platform = commercialRouteInfo.getPlatform();
        boolean hasWarningPlatform = commercialRouteInfo.getHasWarningPlatform();
        boolean platformMuted = commercialRouteInfo.getPlatformMuted();
        String observation = commercialRouteInfo.getObservation();
        boolean accessible = commercialRouteInfo.getCommercialPathInfo().getAccessible();
        boolean immediateDeparture = commercialRouteInfo.getImmediateDeparture();
        boolean isShortTrain = commercialRouteInfo.getCommercialPathInfo().isShortTrain();
        String commercialNumber = commercialRouteInfo.getCommercialPathInfo().getComercialPathKey().getCommercialNumber();
        String originStationCode = commercialRouteInfo.getCommercialPathInfo().getComercialPathKey().getOriginStationCode();
        String destinationStationCode = commercialRouteInfo.getCommercialPathInfo().getComercialPathKey().getDestinationStationCode();
        long launchingDate = commercialRouteInfo.getCommercialPathInfo().getComercialPathKey().getLaunchingDate();
        String commercialProduct = commercialRouteInfo.getCommercialPathInfo().getOpeProComPro().getCommercialProduct();
        TrainCirculationInfo trainCirculationInfo = new TrainCirculationInfo(originStationCode, destinationStationCode, Long.valueOf(launchingDate), commercialNumber, commercialRouteInfo.getCommercialPathInfo().getOpeProComPro().getOperator(), commercialRouteInfo.getCommercialPathInfo().getObservation(), commercialProduct);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return new AvldmdCirculation(access$getPlannedDepartureDate, access$plannedTime, access$delayedTime, stationCode, stationCode2, null, null, train, access$getState, platform, hasWarningPlatform, platformMuted, observation, accessible, immediateDeparture, isShortTrain, trainCirculationInfo, w.s(new Object[]{commercialRouteInfo.getCommercialPathInfo().getOpeProComPro().getOperator(), commercialRouteInfo.getCommercialPathInfo().getOpeProComPro().getCommercialProduct()}, 2, BuildConfig.operatorLogoUrl, "format(...)"), false, commercialRouteInfo.getOperatorPlatform(), commercialRouteInfo.getPlannedPlatform(), commercialRouteInfo.getSitraPlatform(), commercialRouteInfo.getCtcPlatform(), commercialRouteInfo.getTechnicalNumber(), commercialRouteInfo.getResultantPlatform(), commercialRouteInfo.getPreassignedPlatform(), 262144, null);
    }

    private final List<AvldmdCirculation> makeJourneyCirculations(List<CommercialRouteInfo> list) {
        int collectionSizeOrDefault;
        if (list.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            CommercialRouteInfo commercialRouteInfo = (CommercialRouteInfo) obj;
            boolean isAudited = commercialRouteInfo.getPassthroughStep().getDeparturePassthroughStepSides().isAudited();
            if (commercialRouteInfo.getPassthroughStep().getDeparturePassthroughStepSides().getAnnounceable() && !isAudited && commercialRouteInfo.getPassthroughStep().getDeparturePassthroughStepSides().isCommercial()) {
                arrayList.add(obj);
            }
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.adif.elcanomovil.domain.entities.circulation.mappers.AvldmdCirculationMapper$makeJourneyCirculations$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                Date plannedDepartureDate;
                Date plannedDepartureDate2;
                plannedDepartureDate = AvldmdCirculationMapperKt.getPlannedDepartureDate((CommercialRouteInfo) t2);
                plannedDepartureDate2 = AvldmdCirculationMapperKt.getPlannedDepartureDate((CommercialRouteInfo) t4);
                return ComparisonsKt.compareValues(plannedDepartureDate, plannedDepartureDate2);
            }
        });
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = sortedWith.iterator();
        while (it.hasNext()) {
            arrayList2.add(getMapToCirculation((CommercialRouteInfo) it.next()));
        }
        return arrayList2;
    }

    private final List<AvldmdCirculation> makeOneWayCirculations(List<CommercialPathStepSideInfo> list, final boolean isDeparture) {
        int collectionSizeOrDefault;
        if (list.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            CommercialPathStepSideInfo commercialPathStepSideInfo = (CommercialPathStepSideInfo) obj;
            PassthroughStepSides passthroughStepSide = commercialPathStepSideInfo.passthroughStepSide(isDeparture);
            boolean z3 = false;
            if (passthroughStepSide != null && passthroughStepSide.isAudited()) {
                z3 = true;
            }
            PassthroughStepSides passthroughStepSide2 = commercialPathStepSideInfo.passthroughStepSide(isDeparture);
            if (passthroughStepSide2 != null && passthroughStepSide2.isAnnounceable() && commercialPathStepSideInfo.getPassthroughStep().isCommercial() && (!isDeparture || (isDeparture && !z3))) {
                arrayList.add(obj);
            }
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.adif.elcanomovil.domain.entities.circulation.mappers.AvldmdCirculationMapper$makeOneWayCirculations$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                Date date;
                Date date2;
                date = AvldmdCirculationMapperKt.date((CommercialPathStepSideInfo) t2, isDeparture);
                date2 = AvldmdCirculationMapperKt.date((CommercialPathStepSideInfo) t4, isDeparture);
                return ComparisonsKt.compareValues(date, date2);
            }
        });
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = sortedWith.iterator();
        while (it.hasNext()) {
            arrayList2.add(mapToCirculation((CommercialPathStepSideInfo) it.next(), isDeparture));
        }
        return arrayList2;
    }

    private final AvldmdCirculation mapToCirculation(CommercialPathStepSideInfo commercialPathStepSideInfo, boolean z3) {
        String access$plannedTime = AvldmdCirculationMapperKt.access$plannedTime(commercialPathStepSideInfo, z3, this.formatter);
        Date access$date = AvldmdCirculationMapperKt.access$date(commercialPathStepSideInfo, z3);
        String access$delayedTime = AvldmdCirculationMapperKt.access$delayedTime(commercialPathStepSideInfo, z3, this.formatter);
        String stationCode = commercialPathStepSideInfo.getPassthroughStep().getStationCode();
        String stationCode2 = commercialPathStepSideInfo.stationCode(z3);
        AvldmdCirculation.Train train = new AvldmdCirculation.Train(commercialPathStepSideInfo.getCommercialPathInfo().getOpeProComPro().getOperator(), commercialPathStepSideInfo.getCommercialPathInfo().getComercialPathKey().getCommercialNumber(), commercialPathStepSideInfo.getCommercialPathInfo().getOpeProComPro().getCommercialProduct());
        AvldmdCirculation.State access$state = AvldmdCirculationMapperKt.access$state(commercialPathStepSideInfo, z3);
        String platform = commercialPathStepSideInfo.platform(z3);
        boolean hasWarningPlatform = commercialPathStepSideInfo.hasWarningPlatform(z3);
        boolean platformMuted = commercialPathStepSideInfo.platformMuted(z3);
        String observation = commercialPathStepSideInfo.observation(z3);
        boolean accessible = commercialPathStepSideInfo.getCommercialPathInfo().getAccessible();
        PassthroughStepSides passthroughStepSide = commercialPathStepSideInfo.passthroughStepSide(z3);
        boolean immediateDeparture = passthroughStepSide != null ? passthroughStepSide.getImmediateDeparture() : false;
        boolean isShortTrain = commercialPathStepSideInfo.getCommercialPathInfo().isShortTrain();
        String commercialNumber = commercialPathStepSideInfo.getCommercialPathInfo().getComercialPathKey().getCommercialNumber();
        String originStationCode = commercialPathStepSideInfo.getCommercialPathInfo().getComercialPathKey().getOriginStationCode();
        String destinationStationCode = commercialPathStepSideInfo.getCommercialPathInfo().getComercialPathKey().getDestinationStationCode();
        long launchingDate = commercialPathStepSideInfo.getCommercialPathInfo().getComercialPathKey().getLaunchingDate();
        TrainCirculationInfo trainCirculationInfo = new TrainCirculationInfo(originStationCode, destinationStationCode, Long.valueOf(launchingDate), commercialNumber, commercialPathStepSideInfo.getCommercialPathInfo().getOpeProComPro().getOperator(), commercialPathStepSideInfo.getCommercialPathInfo().getObservation(), commercialPathStepSideInfo.getCommercialPathInfo().getOpeProComPro().getCommercialProduct());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return new AvldmdCirculation(access$date, access$plannedTime, access$delayedTime, stationCode, stationCode2, null, null, train, access$state, platform, hasWarningPlatform, platformMuted, observation, accessible, immediateDeparture, isShortTrain, trainCirculationInfo, w.s(new Object[]{commercialPathStepSideInfo.getCommercialPathInfo().getOpeProComPro().getOperator(), commercialPathStepSideInfo.getCommercialPathInfo().getOpeProComPro().getCommercialProduct()}, 2, BuildConfig.operatorLogoUrl, "format(...)"), false, commercialPathStepSideInfo.operatorPlatform(z3), commercialPathStepSideInfo.plannedPlatform(z3), commercialPathStepSideInfo.sitraPlatform(z3), commercialPathStepSideInfo.ctcPlatform(z3), commercialPathStepSideInfo.technicalNumber(z3), commercialPathStepSideInfo.resultantPlatform(z3), commercialPathStepSideInfo.preassignedPlatform(z3), 262144, null);
    }

    public final List<AvldmdCirculation> map(List<? extends CommercialCirculation> from, boolean isDeparture) {
        Intrinsics.checkNotNullParameter(from, "from");
        List<? extends CommercialCirculation> list = from;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof CommercialPathStepSideInfo) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return makeOneWayCirculations(arrayList, isDeparture);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof CommercialRouteInfo) {
                arrayList2.add(obj2);
            }
        }
        return !arrayList2.isEmpty() ? makeJourneyCirculations(arrayList2) : CollectionsKt.emptyList();
    }
}
