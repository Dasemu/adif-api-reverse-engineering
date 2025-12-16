package com.adif.elcanomovil.domain.entities.circulation.mappers;

import C.w;
import com.adif.elcanomovil.domain.BuildConfig;
import com.adif.elcanomovil.domain.entities.circulation.CommercialCirculation;
import com.adif.elcanomovil.domain.entities.circulation.CommercialPathStepSideInfo;
import com.adif.elcanomovil.domain.entities.circulation.CommercialRouteInfo;
import com.adif.elcanomovil.domain.entities.circulation.OtherCirculation;
import com.adif.elcanomovil.domain.entities.circulation.PassthroughStepSides;
import com.adif.elcanomovil.domain.entities.circulation.RouteStepSide;
import com.adif.elcanomovil.domain.entities.circulation.TrainCirculationInfo;
import com.adif.elcanomovil.domain.extensions.LongKt;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
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

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0002J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00192\u0006\u0010\u001d\u001a\u00020\u001eJ\u0014\u0010\"\u001a\u00020\u000b*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u001c\u0010#\u001a\u00020$*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0016\u0010#\u001a\u0004\u0018\u00010$*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u001c\u0010%\u001a\u00020$*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0014\u0010%\u001a\u00020$*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000b*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0010\u001a\u00020\u000b*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\u0012\u001a\u00020\u000b*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/mappers/OthersCirculationMapper;", "", "formatter", "Ljava/text/DateFormat;", "(Ljava/text/DateFormat;)V", "mapToCirculation", "Lcom/adif/elcanomovil/domain/entities/circulation/OtherCirculation;", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialRouteInfo;", "getMapToCirculation", "(Lcom/adif/elcanomovil/domain/entities/circulation/CommercialRouteInfo;)Lcom/adif/elcanomovil/domain/entities/circulation/OtherCirculation;", "measuredArrivalDate", "Ljava/util/Date;", "getMeasuredArrivalDate", "(Lcom/adif/elcanomovil/domain/entities/circulation/CommercialRouteInfo;)Ljava/util/Date;", "measuredDepartureDate", "getMeasuredDepartureDate", "plannedArrivalDate", "getPlannedArrivalDate", "plannedDepartureDate", "getPlannedDepartureDate", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/adif/elcanomovil/domain/entities/circulation/OtherCirculation$State;", "getState", "(Lcom/adif/elcanomovil/domain/entities/circulation/CommercialRouteInfo;)Lcom/adif/elcanomovil/domain/entities/circulation/OtherCirculation$State;", "makeJourneyCirculations", "", "list", "makeOneWayCirculations", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathStepSideInfo;", "isDeparture", "", "map", Constants.MessagePayloadKeys.FROM, "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialCirculation;", "date", "delayedTime", "", "plannedTime", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOthersCirculationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OthersCirculationMapper.kt\ncom/adif/elcanomovil/domain/entities/circulation/mappers/OthersCirculationMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,236:1\n800#2,11:237\n800#2,11:248\n766#2:259\n857#2,2:260\n1045#2:262\n1549#2:263\n1620#2,3:264\n766#2:267\n857#2,2:268\n1045#2:270\n1549#2:271\n1620#2,3:272\n*S KotlinDebug\n*F\n+ 1 OthersCirculationMapper.kt\ncom/adif/elcanomovil/domain/entities/circulation/mappers/OthersCirculationMapper\n*L\n20#1:237,11\n26#1:248,11\n40#1:259\n40#1:260,2\n46#1:262\n47#1:263\n47#1:264,3\n57#1:267\n57#1:268,2\n61#1:270\n62#1:271\n62#1:272,3\n*E\n"})
/* loaded from: classes.dex */
public final class OthersCirculationMapper {
    private final DateFormat formatter;

    public OthersCirculationMapper(DateFormat formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.formatter = formatter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Date date(CommercialPathStepSideInfo commercialPathStepSideInfo, boolean z3) {
        Date delayedDate;
        PassthroughStepSides passthroughStepSide = commercialPathStepSideInfo.passthroughStepSide(z3);
        return (passthroughStepSide == null || (delayedDate = LongKt.getDelayedDate(passthroughStepSide.getPlannedTime(), 0)) == null) ? new Date() : delayedDate;
    }

    private final String delayedTime(CommercialPathStepSideInfo commercialPathStepSideInfo, boolean z3, DateFormat dateFormat) {
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

    private final OtherCirculation getMapToCirculation(CommercialRouteInfo commercialRouteInfo) {
        String plannedTime = plannedTime(commercialRouteInfo, this.formatter);
        Date plannedDepartureDate = getPlannedDepartureDate(commercialRouteInfo);
        String delayedTime = delayedTime(commercialRouteInfo, this.formatter);
        String stationCode = commercialRouteInfo.getStationCode();
        String stationCode2 = commercialRouteInfo.getStationCode();
        OtherCirculation.Train train = new OtherCirculation.Train(commercialRouteInfo.getCommercialPathInfo().getOpeProComPro().getOperator(), commercialRouteInfo.getCommercialPathInfo().getComercialPathKey().getCommercialNumber(), commercialRouteInfo.getCommercialPathInfo().getOpeProComPro().getCommercialProduct());
        OtherCirculation.State state = getState(commercialRouteInfo);
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
        return new OtherCirculation(plannedDepartureDate, plannedTime, delayedTime, stationCode, stationCode2, null, null, train, state, platform, hasWarningPlatform, platformMuted, observation, accessible, immediateDeparture, isShortTrain, trainCirculationInfo, w.s(new Object[]{commercialRouteInfo.getCommercialPathInfo().getOpeProComPro().getOperator(), commercialRouteInfo.getCommercialPathInfo().getOpeProComPro().getCommercialProduct()}, 2, BuildConfig.operatorLogoUrl, "format(...)"), false, commercialRouteInfo.getOperatorPlatform(), commercialRouteInfo.getPlannedPlatform(), commercialRouteInfo.getSitraPlatform(), commercialRouteInfo.getCtcPlatform(), commercialRouteInfo.getTechnicalNumber(), commercialRouteInfo.getResultantPlatform(), commercialRouteInfo.getPreassignedPlatform(), 262144, null);
    }

    private final Date getMeasuredArrivalDate(CommercialRouteInfo commercialRouteInfo) {
        return LongKt.getDelayedDate(commercialRouteInfo.getPassthroughStep().getArrivalPassthroughStepSides().getPlannedTime(), commercialRouteInfo.getPassthroughStep().getArrivalPassthroughStepSides().getForecatedOrAuditedDelay());
    }

    private final Date getMeasuredDepartureDate(CommercialRouteInfo commercialRouteInfo) {
        return LongKt.getDelayedDate(commercialRouteInfo.getPassthroughStep().getDeparturePassthroughStepSides().getPlannedTime(), commercialRouteInfo.getPassthroughStep().getDeparturePassthroughStepSides().getForecatedOrAuditedDelay());
    }

    private final Date getPlannedArrivalDate(CommercialRouteInfo commercialRouteInfo) {
        return LongKt.getDelayedDate(commercialRouteInfo.getPassthroughStep().getArrivalPassthroughStepSides().getPlannedTime(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Date getPlannedDepartureDate(CommercialRouteInfo commercialRouteInfo) {
        return LongKt.getDelayedDate(commercialRouteInfo.getPassthroughStep().getDeparturePassthroughStepSides().getPlannedTime(), 0);
    }

    private final OtherCirculation.State getState(CommercialRouteInfo commercialRouteInfo) {
        RouteStepSide departurePassthroughStepSides = commercialRouteInfo.getPassthroughStep().getDeparturePassthroughStepSides();
        if (departurePassthroughStepSides.isSuppressed()) {
            return OtherCirculation.State.SUPPRESSED;
        }
        if (departurePassthroughStepSides.getImmediateDeparture()) {
            return OtherCirculation.State.BOARDING;
        }
        if (departurePassthroughStepSides.getForecatedOrAuditedDelay() > 0) {
            return OtherCirculation.State.DELAYED;
        }
        return null;
    }

    private final List<OtherCirculation> makeJourneyCirculations(List<CommercialRouteInfo> list) {
        int collectionSizeOrDefault;
        if (list.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            CommercialRouteInfo commercialRouteInfo = (CommercialRouteInfo) obj;
            if (!commercialRouteInfo.getPassthroughStep().getDeparturePassthroughStepSides().isAudited() && commercialRouteInfo.getPassthroughStep().getDeparturePassthroughStepSides().isCommercial()) {
                arrayList.add(obj);
            }
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.adif.elcanomovil.domain.entities.circulation.mappers.OthersCirculationMapper$makeJourneyCirculations$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                Date plannedDepartureDate;
                Date plannedDepartureDate2;
                plannedDepartureDate = OthersCirculationMapper.this.getPlannedDepartureDate((CommercialRouteInfo) t2);
                plannedDepartureDate2 = OthersCirculationMapper.this.getPlannedDepartureDate((CommercialRouteInfo) t4);
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

    private final List<OtherCirculation> makeOneWayCirculations(List<CommercialPathStepSideInfo> list, final boolean isDeparture) {
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
            if (commercialPathStepSideInfo.getPassthroughStep().isCommercial() && (!isDeparture || (isDeparture && !z3))) {
                arrayList.add(obj);
            }
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.adif.elcanomovil.domain.entities.circulation.mappers.OthersCirculationMapper$makeOneWayCirculations$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                Date date;
                Date date2;
                date = OthersCirculationMapper.this.date((CommercialPathStepSideInfo) t2, isDeparture);
                date2 = OthersCirculationMapper.this.date((CommercialPathStepSideInfo) t4, isDeparture);
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

    private final OtherCirculation mapToCirculation(CommercialPathStepSideInfo commercialPathStepSideInfo, boolean z3) {
        String plannedTime = plannedTime(commercialPathStepSideInfo, z3, this.formatter);
        Date date = date(commercialPathStepSideInfo, z3);
        String delayedTime = delayedTime(commercialPathStepSideInfo, z3, this.formatter);
        String stationCode = commercialPathStepSideInfo.getPassthroughStep().getStationCode();
        String stationCode2 = commercialPathStepSideInfo.stationCode(z3);
        OtherCirculation.Train train = new OtherCirculation.Train(commercialPathStepSideInfo.getCommercialPathInfo().getOpeProComPro().getOperator(), commercialPathStepSideInfo.getCommercialPathInfo().getComercialPathKey().getCommercialNumber(), commercialPathStepSideInfo.getCommercialPathInfo().getOpeProComPro().getCommercialProduct());
        OtherCirculation.State state = state(commercialPathStepSideInfo, z3);
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
        String s4 = w.s(new Object[]{commercialPathStepSideInfo.getCommercialPathInfo().getOpeProComPro().getOperator(), commercialPathStepSideInfo.getCommercialPathInfo().getOpeProComPro().getCommercialProduct()}, 2, BuildConfig.operatorLogoUrl, "format(...)");
        String operatorPlatform = commercialPathStepSideInfo.operatorPlatform(z3);
        String plannedPlatform = commercialPathStepSideInfo.plannedPlatform(z3);
        String sitraPlatform = commercialPathStepSideInfo.sitraPlatform(z3);
        String ctcPlatform = commercialPathStepSideInfo.ctcPlatform(z3);
        String technicalNumber = commercialPathStepSideInfo.technicalNumber(z3);
        String resultantPlatform = commercialPathStepSideInfo.resultantPlatform(z3);
        PassthroughStepSides passthroughStepSide2 = commercialPathStepSideInfo.passthroughStepSide(z3);
        return new OtherCirculation(date, plannedTime, delayedTime, stationCode, stationCode2, null, null, train, state, platform, hasWarningPlatform, platformMuted, observation, accessible, immediateDeparture, isShortTrain, trainCirculationInfo, s4, false, operatorPlatform, plannedPlatform, sitraPlatform, ctcPlatform, technicalNumber, resultantPlatform, passthroughStepSide2 != null ? passthroughStepSide2.getPreassignedPlatform() : null, 262144, null);
    }

    private final String plannedTime(CommercialPathStepSideInfo commercialPathStepSideInfo, boolean z3, DateFormat dateFormat) {
        String format = dateFormat.format(date(commercialPathStepSideInfo, z3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private final OtherCirculation.State state(CommercialPathStepSideInfo commercialPathStepSideInfo, boolean z3) {
        PassthroughStepSides passthroughStepSide = commercialPathStepSideInfo.passthroughStepSide(z3);
        if (passthroughStepSide == null) {
            return null;
        }
        if (passthroughStepSide.isSuppressed()) {
            return OtherCirculation.State.SUPPRESSED;
        }
        if (passthroughStepSide.getImmediateDeparture() && passthroughStepSide.isAudited()) {
            return OtherCirculation.State.BOARDING;
        }
        if (passthroughStepSide.getForecatedOrAuditedDelay() > 0) {
            return OtherCirculation.State.DELAYED;
        }
        return null;
    }

    public final List<OtherCirculation> map(List<? extends CommercialCirculation> from, boolean isDeparture) {
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

    private final String plannedTime(CommercialRouteInfo commercialRouteInfo, DateFormat dateFormat) {
        return dateFormat.format(getPlannedDepartureDate(commercialRouteInfo)) + '-' + dateFormat.format(getPlannedArrivalDate(commercialRouteInfo));
    }

    private final String delayedTime(CommercialRouteInfo commercialRouteInfo, DateFormat dateFormat) {
        String plannedTime = plannedTime(commercialRouteInfo, dateFormat);
        String str = dateFormat.format(getMeasuredDepartureDate(commercialRouteInfo)) + '-' + dateFormat.format(getMeasuredArrivalDate(commercialRouteInfo));
        if (Intrinsics.areEqual(str, plannedTime)) {
            return null;
        }
        return str;
    }
}
