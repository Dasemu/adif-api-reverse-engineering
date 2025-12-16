package com.adif.elcanomovil.repositories.circulation;

import com.adif.elcanomovil.domain.entities.circulation.ComercialPathKey;
import com.adif.elcanomovil.domain.entities.circulation.CommercialPathInfo;
import com.adif.elcanomovil.domain.entities.circulation.CommercialPathRouteSidesInfo;
import com.adif.elcanomovil.domain.entities.circulation.CommercialPathStepSideInfo;
import com.adif.elcanomovil.domain.entities.circulation.CommercialRouteInfo;
import com.adif.elcanomovil.domain.entities.circulation.OpeProComPro;
import com.adif.elcanomovil.domain.entities.circulation.PassthroughDetailsStep;
import com.adif.elcanomovil.domain.entities.circulation.PassthroughDetailsStepSide;
import com.adif.elcanomovil.domain.entities.circulation.PassthroughStep;
import com.adif.elcanomovil.domain.entities.circulation.PassthroughStepSides;
import com.adif.elcanomovil.domain.entities.circulation.RouteStep;
import com.adif.elcanomovil.domain.entities.circulation.RouteStepSide;
import com.adif.elcanomovil.serviceNetworking.circulations.PassthroughStepDTO;
import com.adif.elcanomovil.serviceNetworking.circulations.model.response.CommercialPathInfoDTO;
import com.adif.elcanomovil.serviceNetworking.circulations.model.response.CommercialPathRouteSidesInfoDTO;
import com.adif.elcanomovil.serviceNetworking.circulations.model.response.CommercialPathStepSideInfoDTO;
import com.adif.elcanomovil.serviceNetworking.circulations.model.response.CommercialRouteInfoDTO;
import com.adif.elcanomovil.serviceNetworking.circulations.model.response.PassthroughDetailsStepDTO;
import com.adif.elcanomovil.serviceNetworking.circulations.model.response.PassthroughStepDTO;
import com.adif.elcanomovil.serviceNetworking.circulations.model.response.RouteStepDTO;
import com.adif.elcanomovil.serviceNetworking.circulations.model.response.TrafficType;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 52\u00020\u0001:\u00015B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010'\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010(\u001a\u00020)H\u0002J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020/2\u0006\u0010,\u001a\u000200J\u001a\u00101\u001a\b\u0012\u0004\u0012\u000203022\f\u0010,\u001a\b\u0012\u0004\u0012\u00020402R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\bR\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\nR\u0018\u0010\u000b\u001a\u00020\u0004*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0018\u0010\u000b\u001a\u00020\u0004*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u000e\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0018\u0010\u000e\u001a\u00020\u0004*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0018\u0010\u000e\u001a\u00020\u0004*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0018\u0010\u000f\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0018\u0010\u000f\u001a\u00020\u0004*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u0018\u0010\u000f\u001a\u00020\u0004*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u0018\u0010\u0010\u001a\u00020\u0011*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0010\u001a\u00020\u0011*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u0018\u0010\u0010\u001a\u00020\u0011*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006R\u0018\u0010\u0016\u001a\u00020\u0004*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\bR\u0018\u0010\u0016\u001a\u00020\u0004*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\nR\u0018\u0010\u0018\u001a\u00020\u0019*\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0018\u001a\u00020\u001d*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001eR\u0018\u0010\u0018\u001a\u00020\u001f*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010 R\u0018\u0010\u0018\u001a\u00020!*\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010#R\u0018\u0010\u0018\u001a\u00020$*\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010&¨\u00066"}, d2 = {"Lcom/adif/elcanomovil/repositories/circulation/CirculationMapper;", "", "()V", "isAudited", "", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughDetailsStepDTO$PassthroughDetailsStepSideDTO;", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughDetailsStepDTO$PassthroughDetailsStepSideDTO;)Z", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughStepDTO$DeparturePassthroughStepSidesDTO;", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughStepDTO$DeparturePassthroughStepSidesDTO;)Z", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/RouteStepDTO$RouteStepSideDTO;", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/RouteStepDTO$RouteStepSideDTO;)Z", "isCommercial", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughDetailsStepDTO;", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughDetailsStepDTO;)Z", "isMuted", "isSuppressed", "platform", "", "getPlatform", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughDetailsStepDTO$PassthroughDetailsStepSideDTO;)Ljava/lang/String;", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughStepDTO$DeparturePassthroughStepSidesDTO;)Ljava/lang/String;", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/RouteStepDTO$RouteStepSideDTO;)Ljava/lang/String;", "shouldBeAnnounced", "getShouldBeAnnounced", "toDomain", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathInfo;", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO;", "getToDomain", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO;)Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathInfo;", "Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughDetailsStep;", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughDetailsStepDTO;)Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughDetailsStep;", "Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughDetailsStepSide;", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughDetailsStepDTO$PassthroughDetailsStepSideDTO;)Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughDetailsStepSide;", "Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughStep;", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughStepDTO;", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/PassthroughStepDTO;)Lcom/adif/elcanomovil/domain/entities/circulation/PassthroughStep;", "Lcom/adif/elcanomovil/domain/entities/circulation/RouteStep;", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/RouteStepDTO;", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/RouteStepDTO;)Lcom/adif/elcanomovil/domain/entities/circulation/RouteStep;", "calculateIfWarning", "plannedTime", "", "responseToDomain", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathStepSideInfo;", "source", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathStepSideInfoDTO;", "routeResponseToDomain", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialRouteInfo;", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialRouteInfoDTO;", "routeSideResponseToDomain", "", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathRouteSidesInfo;", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathRouteSidesInfoDTO;", "Companion", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCirculationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CirculationMapper.kt\ncom/adif/elcanomovil/repositories/circulation/CirculationMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,313:1\n1549#2:314\n1620#2,2:315\n1549#2:317\n1620#2,3:318\n1622#2:321\n*S KotlinDebug\n*F\n+ 1 CirculationMapper.kt\ncom/adif/elcanomovil/repositories/circulation/CirculationMapper\n*L\n51#1:314\n51#1:315,2\n54#1:317\n54#1:318,3\n51#1:321\n*E\n"})
/* loaded from: classes.dex */
public final class CirculationMapper {
    public static final int TIME_TO_WARNING = 300;
    public static final String VIA_ASTERISK = "*";

    private final boolean calculateIfWarning(String platform, long plannedTime) {
        return platform.length() == 0 && (((plannedTime - ((long) 300000)) > System.currentTimeMillis() ? 1 : ((plannedTime - ((long) 300000)) == System.currentTimeMillis() ? 0 : -1)) < 0);
    }

    private final String getPlatform(PassthroughStepDTO.DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO) {
        if (!getShouldBeAnnounced(departurePassthroughStepSidesDTO)) {
            return "";
        }
        if (Intrinsics.areEqual(departurePassthroughStepSidesDTO.getResultantPlatform(), "SITRA")) {
            String sitraPlatform = departurePassthroughStepSidesDTO.getSitraPlatform();
            return sitraPlatform == null ? "" : sitraPlatform;
        }
        if (Intrinsics.areEqual(departurePassthroughStepSidesDTO.getResultantPlatform(), "CTC")) {
            String ctcPlatform = departurePassthroughStepSidesDTO.getCtcPlatform();
            return ctcPlatform == null ? "" : ctcPlatform;
        }
        if (Intrinsics.areEqual(departurePassthroughStepSidesDTO.getResultantPlatform(), "OPERATOR")) {
            String operatorPlatform = departurePassthroughStepSidesDTO.getOperatorPlatform();
            return operatorPlatform == null ? "" : operatorPlatform;
        }
        if (Intrinsics.areEqual(departurePassthroughStepSidesDTO.getResultantPlatform(), "RELIABLE_PLANNED")) {
            String plannedPlatform = departurePassthroughStepSidesDTO.getPlannedPlatform();
            return plannedPlatform == null ? "" : plannedPlatform;
        }
        Intrinsics.areEqual(departurePassthroughStepSidesDTO.getResultantPlatform(), "PLANNED");
        return "";
    }

    private final boolean getShouldBeAnnounced(PassthroughStepDTO.DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO) {
        return !Intrinsics.areEqual(departurePassthroughStepSidesDTO.getAnnounceState(), "DISABLED");
    }

    private final CommercialPathInfo getToDomain(CommercialPathInfoDTO commercialPathInfoDTO) {
        String commercialOriginStationCode = commercialPathInfoDTO.getCommercialOriginStationCode();
        if (commercialOriginStationCode == null) {
            commercialOriginStationCode = commercialPathInfoDTO.getCommercialPathKey().getOriginStationCode();
        }
        String str = commercialOriginStationCode;
        String commercialDestinationStationCode = commercialPathInfoDTO.getCommercialDestinationStationCode();
        if (commercialDestinationStationCode == null) {
            commercialDestinationStationCode = commercialPathInfoDTO.getCommercialPathKey().getDestinationStationCode();
        }
        String str2 = commercialDestinationStationCode;
        Date date = new Date(commercialPathInfoDTO.getTimestamp());
        String line = commercialPathInfoDTO.getLine();
        if (line == null) {
            line = "";
        }
        String str3 = line;
        String core = commercialPathInfoDTO.getCore();
        CommercialPathInfoDTO.CompositionDataDTO compositionData = commercialPathInfoDTO.getCompositionData();
        boolean accesible = compositionData != null ? compositionData.getAccesible() : false;
        CommercialPathInfoDTO.CompositionDataDTO compositionData2 = commercialPathInfoDTO.getCompositionData();
        boolean areEqual = Intrinsics.areEqual(compositionData2 != null ? compositionData2.getCompositionLenghtType() : null, "SHORT");
        ComercialPathKey comercialPathKey = new ComercialPathKey(commercialPathInfoDTO.getCommercialPathKey().getCommercialCirculationKey().getCommercialNumber(), commercialPathInfoDTO.getCommercialPathKey().getCommercialCirculationKey().getLaunchingDate(), commercialPathInfoDTO.getCommercialPathKey().getOriginStationCode(), commercialPathInfoDTO.getCommercialPathKey().getDestinationStationCode());
        String operator = commercialPathInfoDTO.getOpeProComPro().getOperator();
        Locale locale = Locale.ROOT;
        String upperCase = operator.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String upperCase2 = commercialPathInfoDTO.getOpeProComPro().getCommercialProduct().toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        return new CommercialPathInfo(str, str2, accesible, comercialPathKey, commercialPathInfoDTO.getTrafficType() == TrafficType.CERCANIAS, areEqual, str3, core, new OpeProComPro(upperCase, upperCase2), date, commercialPathInfoDTO.getObservation());
    }

    private final boolean isAudited(PassthroughStepDTO.DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO) {
        return Intrinsics.areEqual(departurePassthroughStepSidesDTO.getTimeType(), "AUDITED");
    }

    private final boolean isCommercial(RouteStepDTO.RouteStepSideDTO routeStepSideDTO) {
        return Intrinsics.areEqual(routeStepSideDTO.getStopType(), "COMMERCIAL");
    }

    private final boolean isMuted(PassthroughStepDTO.DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO) {
        return Intrinsics.areEqual(departurePassthroughStepSidesDTO.getAnnounceState(), "MUTED");
    }

    private final boolean isSuppressed(PassthroughStepDTO.DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO) {
        return Intrinsics.areEqual(departurePassthroughStepSidesDTO.getCirculationState(), "SUPPRESSED");
    }

    public final CommercialPathStepSideInfo responseToDomain(CommercialPathStepSideInfoDTO source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new CommercialPathStepSideInfo(getToDomain(source.getCommercialPathInfo()), getToDomain(source.getPassthroughStep()));
    }

    public final CommercialRouteInfo routeResponseToDomain(CommercialRouteInfoDTO source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new CommercialRouteInfo(getToDomain(source.getCommercialPathInfo()), getToDomain(source.getPassthroughStep()));
    }

    public final List<CommercialPathRouteSidesInfo> routeSideResponseToDomain(List<CommercialPathRouteSidesInfoDTO> source) {
        Intrinsics.checkNotNullParameter(source, "source");
        List<CommercialPathRouteSidesInfoDTO> list = source;
        ArrayList arrayList = new ArrayList(CollectionsKt.g(list));
        for (CommercialPathRouteSidesInfoDTO commercialPathRouteSidesInfoDTO : list) {
            CommercialPathInfo toDomain = getToDomain(commercialPathRouteSidesInfoDTO.getCommercialPathInfo());
            List<PassthroughDetailsStepDTO> passthroughSteps = commercialPathRouteSidesInfoDTO.getPassthroughSteps();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.g(passthroughSteps));
            Iterator<T> it = passthroughSteps.iterator();
            while (it.hasNext()) {
                arrayList2.add(getToDomain((PassthroughDetailsStepDTO) it.next()));
            }
            arrayList.add(new CommercialPathRouteSidesInfo(toDomain, arrayList2));
        }
        return arrayList;
    }

    private final boolean getShouldBeAnnounced(RouteStepDTO.RouteStepSideDTO routeStepSideDTO) {
        return !Intrinsics.areEqual(routeStepSideDTO.getAnnounceState(), "DISABLED");
    }

    private final boolean isAudited(RouteStepDTO.RouteStepSideDTO routeStepSideDTO) {
        return Intrinsics.areEqual(routeStepSideDTO.getTimeType(), "AUDITED");
    }

    private final boolean isCommercial(PassthroughDetailsStepDTO passthroughDetailsStepDTO) {
        return Intrinsics.areEqual(passthroughDetailsStepDTO.getStopType(), "COMMERCIAL");
    }

    private final boolean isMuted(RouteStepDTO.RouteStepSideDTO routeStepSideDTO) {
        return Intrinsics.areEqual(routeStepSideDTO.getAnnounceState(), "MUTED");
    }

    private final boolean isSuppressed(RouteStepDTO.RouteStepSideDTO routeStepSideDTO) {
        return Intrinsics.areEqual(routeStepSideDTO.getCirculationState(), "SUPPRESSED");
    }

    private final boolean getShouldBeAnnounced(PassthroughDetailsStepDTO.PassthroughDetailsStepSideDTO passthroughDetailsStepSideDTO) {
        return !Intrinsics.areEqual(passthroughDetailsStepSideDTO.getAnnounceState(), "DISABLED");
    }

    private final boolean isAudited(PassthroughDetailsStepDTO.PassthroughDetailsStepSideDTO passthroughDetailsStepSideDTO) {
        return Intrinsics.areEqual(passthroughDetailsStepSideDTO.getTimeType(), "AUDITED");
    }

    private final boolean isMuted(PassthroughDetailsStepDTO.PassthroughDetailsStepSideDTO passthroughDetailsStepSideDTO) {
        return Intrinsics.areEqual(passthroughDetailsStepSideDTO.getAnnounceState(), "MUTED");
    }

    private final boolean isSuppressed(PassthroughDetailsStepDTO.PassthroughDetailsStepSideDTO passthroughDetailsStepSideDTO) {
        return passthroughDetailsStepSideDTO.getSupressed();
    }

    private final String getPlatform(RouteStepDTO.RouteStepSideDTO routeStepSideDTO) {
        if (!getShouldBeAnnounced(routeStepSideDTO)) {
            return "";
        }
        if (Intrinsics.areEqual(routeStepSideDTO.getResultantPlatform(), "SITRA")) {
            String sitraPlatform = routeStepSideDTO.getSitraPlatform();
            return sitraPlatform == null ? "" : sitraPlatform;
        }
        if (Intrinsics.areEqual(routeStepSideDTO.getResultantPlatform(), "CTC")) {
            String ctcPlatform = routeStepSideDTO.getCtcPlatform();
            return ctcPlatform == null ? "" : ctcPlatform;
        }
        if (Intrinsics.areEqual(routeStepSideDTO.getResultantPlatform(), "OPERATOR")) {
            String operatorPlatform = routeStepSideDTO.getOperatorPlatform();
            return operatorPlatform == null ? "" : operatorPlatform;
        }
        if (Intrinsics.areEqual(routeStepSideDTO.getResultantPlatform(), "RELIABLE_PLANNED")) {
            String plannedPlatform = routeStepSideDTO.getPlannedPlatform();
            return plannedPlatform == null ? "" : plannedPlatform;
        }
        Intrinsics.areEqual(routeStepSideDTO.getResultantPlatform(), "PLANNED");
        return "";
    }

    private final String getPlatform(PassthroughDetailsStepDTO.PassthroughDetailsStepSideDTO passthroughDetailsStepSideDTO) {
        if (!getShouldBeAnnounced(passthroughDetailsStepSideDTO)) {
            return "";
        }
        if (Intrinsics.areEqual(passthroughDetailsStepSideDTO.getResultantPlatform(), "SITRA")) {
            String sitraPlatform = passthroughDetailsStepSideDTO.getSitraPlatform();
            return sitraPlatform == null ? "" : sitraPlatform;
        }
        if (Intrinsics.areEqual(passthroughDetailsStepSideDTO.getResultantPlatform(), "CTC")) {
            String ctcPlatform = passthroughDetailsStepSideDTO.getCtcPlatform();
            return ctcPlatform == null ? "" : ctcPlatform;
        }
        if (Intrinsics.areEqual(passthroughDetailsStepSideDTO.getResultantPlatform(), "OPERATOR")) {
            String operatorPlatform = passthroughDetailsStepSideDTO.getOperatorPlatform();
            return operatorPlatform == null ? "" : operatorPlatform;
        }
        if (Intrinsics.areEqual(passthroughDetailsStepSideDTO.getResultantPlatform(), "RELIABLE_PLANNED")) {
            String plannedPlatform = passthroughDetailsStepSideDTO.getPlannedPlatform();
            return plannedPlatform == null ? "" : plannedPlatform;
        }
        Intrinsics.areEqual(passthroughDetailsStepSideDTO.getResultantPlatform(), "PLANNED");
        return "";
    }

    private final PassthroughStep getToDomain(PassthroughStepDTO passthroughStepDTO) {
        PassthroughStepSides passthroughStepSides;
        PassthroughStepDTO.DeparturePassthroughStepSidesDTO arrivalPassthroughStepSides = passthroughStepDTO.getArrivalPassthroughStepSides();
        PassthroughStepSides passthroughStepSides2 = null;
        if (arrivalPassthroughStepSides != null) {
            String platform = getPlatform(arrivalPassthroughStepSides).equals(VIA_ASTERISK) ? "" : getPlatform(arrivalPassthroughStepSides);
            long plannedTime = arrivalPassthroughStepSides.getPlannedTime();
            int forecastedOrAuditedDelay = arrivalPassthroughStepSides.getForecastedOrAuditedDelay();
            boolean calculateIfWarning = calculateIfWarning(platform, arrivalPassthroughStepSides.getPlannedTime() + arrivalPassthroughStepSides.getForecastedOrAuditedDelay());
            String observation = arrivalPassthroughStepSides.getObservation();
            String str = observation == null ? "" : observation;
            boolean inmediateDeparture = arrivalPassthroughStepSides.getVisualEffects().getInmediateDeparture();
            boolean countDown = arrivalPassthroughStepSides.getVisualEffects().getCountDown();
            boolean isSuppressed = isSuppressed(arrivalPassthroughStepSides);
            boolean isAudited = isAudited(arrivalPassthroughStepSides);
            boolean shouldBeAnnounced = getShouldBeAnnounced(arrivalPassthroughStepSides);
            boolean isMuted = isMuted(arrivalPassthroughStepSides);
            boolean showDelay = arrivalPassthroughStepSides.getVisualEffects().getShowDelay();
            String operatorPlatform = arrivalPassthroughStepSides.getOperatorPlatform();
            String plannedPlatform = arrivalPassthroughStepSides.getPlannedPlatform();
            String preassignedPlatform = arrivalPassthroughStepSides.getPreassignedPlatform();
            String sitraPlatform = arrivalPassthroughStepSides.getSitraPlatform();
            String ctcPlatform = arrivalPassthroughStepSides.getCtcPlatform();
            PassthroughStepDTO.TechnicalCirculationKeyDTO technicalCirculationKey = arrivalPassthroughStepSides.getTechnicalCirculationKey();
            passthroughStepSides = new PassthroughStepSides(plannedTime, forecastedOrAuditedDelay, platform, calculateIfWarning, str, inmediateDeparture, countDown, showDelay, isSuppressed, isAudited, shouldBeAnnounced, isMuted, operatorPlatform, plannedPlatform, preassignedPlatform, sitraPlatform, ctcPlatform, technicalCirculationKey != null ? technicalCirculationKey.getTechnicalNumber() : null, platform.length() > 0 ? arrivalPassthroughStepSides.getResultantPlatform() : "");
        } else {
            passthroughStepSides = null;
        }
        PassthroughStepDTO.DeparturePassthroughStepSidesDTO departurePassthroughStepSides = passthroughStepDTO.getDeparturePassthroughStepSides();
        if (departurePassthroughStepSides != null) {
            String platform2 = getPlatform(departurePassthroughStepSides).equals(VIA_ASTERISK) ? "" : getPlatform(departurePassthroughStepSides);
            long plannedTime2 = departurePassthroughStepSides.getPlannedTime();
            int forecastedOrAuditedDelay2 = departurePassthroughStepSides.getForecastedOrAuditedDelay();
            boolean calculateIfWarning2 = calculateIfWarning(platform2, departurePassthroughStepSides.getPlannedTime() + departurePassthroughStepSides.getForecastedOrAuditedDelay());
            String observation2 = departurePassthroughStepSides.getObservation();
            String str2 = observation2 == null ? "" : observation2;
            boolean inmediateDeparture2 = departurePassthroughStepSides.getVisualEffects().getInmediateDeparture();
            boolean countDown2 = departurePassthroughStepSides.getVisualEffects().getCountDown();
            boolean isSuppressed2 = isSuppressed(departurePassthroughStepSides);
            boolean isAudited2 = isAudited(departurePassthroughStepSides);
            boolean shouldBeAnnounced2 = getShouldBeAnnounced(departurePassthroughStepSides);
            boolean isMuted2 = isMuted(departurePassthroughStepSides);
            boolean showDelay2 = departurePassthroughStepSides.getVisualEffects().getShowDelay();
            String operatorPlatform2 = departurePassthroughStepSides.getOperatorPlatform();
            String plannedPlatform2 = departurePassthroughStepSides.getPlannedPlatform();
            String preassignedPlatform2 = departurePassthroughStepSides.getPreassignedPlatform();
            String sitraPlatform2 = departurePassthroughStepSides.getSitraPlatform();
            String ctcPlatform2 = departurePassthroughStepSides.getCtcPlatform();
            PassthroughStepDTO.TechnicalCirculationKeyDTO technicalCirculationKey2 = departurePassthroughStepSides.getTechnicalCirculationKey();
            passthroughStepSides2 = new PassthroughStepSides(plannedTime2, forecastedOrAuditedDelay2, platform2, calculateIfWarning2, str2, inmediateDeparture2, countDown2, showDelay2, isSuppressed2, isAudited2, shouldBeAnnounced2, isMuted2, operatorPlatform2, plannedPlatform2, preassignedPlatform2, sitraPlatform2, ctcPlatform2, technicalCirculationKey2 != null ? technicalCirculationKey2.getTechnicalNumber() : null, platform2.length() > 0 ? departurePassthroughStepSides.getResultantPlatform() : "");
        }
        return new PassthroughStep(Intrinsics.areEqual(passthroughStepDTO.getStopType(), "COMMERCIAL"), passthroughStepDTO.getStationCode(), passthroughStepSides, passthroughStepSides2);
    }

    private final RouteStep getToDomain(RouteStepDTO routeStepDTO) {
        String platform = getPlatform(routeStepDTO.getArrivalPassthroughStepSides()).equals(VIA_ASTERISK) ? "" : getPlatform(routeStepDTO.getArrivalPassthroughStepSides());
        String platform2 = getPlatform(routeStepDTO.getDeparturePassthroughStepSides()).equals(VIA_ASTERISK) ? "" : getPlatform(routeStepDTO.getDeparturePassthroughStepSides());
        return new RouteStep(new RouteStepSide(getShouldBeAnnounced(routeStepDTO.getArrivalPassthroughStepSides()), routeStepDTO.getArrivalPassthroughStepSides().getVisualEffects().getCountDown(), routeStepDTO.getArrivalPassthroughStepSides().getVisualEffects().getInmediateDeparture(), isAudited(routeStepDTO.getArrivalPassthroughStepSides()), isCommercial(routeStepDTO.getArrivalPassthroughStepSides()), isSuppressed(routeStepDTO.getArrivalPassthroughStepSides()), routeStepDTO.getArrivalPassthroughStepSides().getForecastedOrAuditedDelay(), routeStepDTO.getArrivalPassthroughStepSides().getObservation(), routeStepDTO.getArrivalPassthroughStepSides().getPlannedTime(), platform, calculateIfWarning(platform, routeStepDTO.getArrivalPassthroughStepSides().getPlannedTime() + routeStepDTO.getArrivalPassthroughStepSides().getForecastedOrAuditedDelay()), isMuted(routeStepDTO.getArrivalPassthroughStepSides()), routeStepDTO.getArrivalPassthroughStepSides().getStationCode(), routeStepDTO.getArrivalPassthroughStepSides().getVisualEffects().getShowDelay(), routeStepDTO.getArrivalPassthroughStepSides().getOperatorPlatform(), routeStepDTO.getArrivalPassthroughStepSides().getPlannedPlatform(), routeStepDTO.getArrivalPassthroughStepSides().getPreassignedPlatform(), routeStepDTO.getArrivalPassthroughStepSides().getSitraPlatform(), routeStepDTO.getArrivalPassthroughStepSides().getCtcPlatform(), routeStepDTO.getArrivalPassthroughStepSides().getTechnicalNumber(), routeStepDTO.getArrivalPassthroughStepSides().getResultantPlatform()), new RouteStepSide(getShouldBeAnnounced(routeStepDTO.getDeparturePassthroughStepSides()), routeStepDTO.getDeparturePassthroughStepSides().getVisualEffects().getCountDown(), routeStepDTO.getDeparturePassthroughStepSides().getVisualEffects().getInmediateDeparture(), isAudited(routeStepDTO.getDeparturePassthroughStepSides()), isCommercial(routeStepDTO.getDeparturePassthroughStepSides()), isSuppressed(routeStepDTO.getDeparturePassthroughStepSides()), routeStepDTO.getDeparturePassthroughStepSides().getForecastedOrAuditedDelay(), routeStepDTO.getDeparturePassthroughStepSides().getObservation(), routeStepDTO.getDeparturePassthroughStepSides().getPlannedTime(), platform2, calculateIfWarning(platform2, routeStepDTO.getDeparturePassthroughStepSides().getPlannedTime() + routeStepDTO.getDeparturePassthroughStepSides().getForecastedOrAuditedDelay()), isMuted(routeStepDTO.getDeparturePassthroughStepSides()), routeStepDTO.getDeparturePassthroughStepSides().getStationCode(), routeStepDTO.getDeparturePassthroughStepSides().getVisualEffects().getShowDelay(), routeStepDTO.getDeparturePassthroughStepSides().getOperatorPlatform(), routeStepDTO.getDeparturePassthroughStepSides().getPlannedPlatform(), routeStepDTO.getDeparturePassthroughStepSides().getPreassignedPlatform(), routeStepDTO.getDeparturePassthroughStepSides().getSitraPlatform(), routeStepDTO.getDeparturePassthroughStepSides().getCtcPlatform(), routeStepDTO.getDeparturePassthroughStepSides().getTechnicalNumber(), routeStepDTO.getDeparturePassthroughStepSides().getResultantPlatform()));
    }

    private final PassthroughDetailsStep getToDomain(PassthroughDetailsStepDTO passthroughDetailsStepDTO) {
        boolean announceable = passthroughDetailsStepDTO.getAnnounceable();
        String stationCode = passthroughDetailsStepDTO.getStationCode();
        boolean isCommercial = isCommercial(passthroughDetailsStepDTO);
        PassthroughDetailsStepDTO.PassthroughDetailsStepSideDTO arrivalPassthroughStepSides = passthroughDetailsStepDTO.getArrivalPassthroughStepSides();
        PassthroughDetailsStepSide toDomain = arrivalPassthroughStepSides != null ? getToDomain(arrivalPassthroughStepSides) : null;
        PassthroughDetailsStepDTO.PassthroughDetailsStepSideDTO departurePassthroughStepSides = passthroughDetailsStepDTO.getDeparturePassthroughStepSides();
        return new PassthroughDetailsStep(announceable, stationCode, isCommercial, toDomain, departurePassthroughStepSides != null ? getToDomain(departurePassthroughStepSides) : null);
    }

    private final PassthroughDetailsStepSide getToDomain(PassthroughDetailsStepDTO.PassthroughDetailsStepSideDTO passthroughDetailsStepSideDTO) {
        String platform = getPlatform(passthroughDetailsStepSideDTO).equals(VIA_ASTERISK) ? "" : getPlatform(passthroughDetailsStepSideDTO);
        boolean shouldBeAnnounced = getShouldBeAnnounced(passthroughDetailsStepSideDTO);
        boolean isAudited = isAudited(passthroughDetailsStepSideDTO);
        boolean isSuppressed = isSuppressed(passthroughDetailsStepSideDTO);
        int forecastedOrAuditedDelay = passthroughDetailsStepSideDTO.getForecastedOrAuditedDelay();
        String observation = passthroughDetailsStepSideDTO.getObservation();
        long plannedTime = passthroughDetailsStepSideDTO.getPlannedTime();
        boolean isMuted = isMuted(passthroughDetailsStepSideDTO);
        boolean calculateIfWarning = calculateIfWarning(platform, passthroughDetailsStepSideDTO.getPlannedTime() + passthroughDetailsStepSideDTO.getForecastedOrAuditedDelay());
        boolean showDelay = passthroughDetailsStepSideDTO.getShowDelay();
        String operatorPlatform = passthroughDetailsStepSideDTO.getOperatorPlatform();
        String plannedPlatform = passthroughDetailsStepSideDTO.getPlannedPlatform();
        String sitraPlatform = passthroughDetailsStepSideDTO.getSitraPlatform();
        String ctcPlatform = passthroughDetailsStepSideDTO.getCtcPlatform();
        PassthroughStepDTO.TechnicalCirculationKeyDTO technicalCirculationKey = passthroughDetailsStepSideDTO.getTechnicalCirculationKey();
        return new PassthroughDetailsStepSide(shouldBeAnnounced, isAudited, isSuppressed, forecastedOrAuditedDelay, observation, plannedTime, platform, isMuted, calculateIfWarning, showDelay, operatorPlatform, plannedPlatform, sitraPlatform, ctcPlatform, technicalCirculationKey != null ? technicalCirculationKey.getTechnicalNumber() : null, platform.length() > 0 ? passthroughDetailsStepSideDTO.getResultantPlatform() : "", passthroughDetailsStepSideDTO.getPreassignedPlatform());
    }
}
