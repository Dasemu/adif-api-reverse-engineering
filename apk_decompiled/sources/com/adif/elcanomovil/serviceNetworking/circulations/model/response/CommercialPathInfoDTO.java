package com.adif.elcanomovil.serviceNetworking.circulations.model.response;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u00049:;<Bo\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\u0010\u0014J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\u0089\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006="}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO;", "", "commercialOriginStationCode", "", "commercialDestinationStationCode", "timestamp", "", "commercialPathKey", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO$ComercialPathKeyDTO;", "line", "core", "observation", NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC, "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/TrafficType;", "opeProComPro", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO$OpeProComProDTO;", "compositionData", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO$CompositionDataDTO;", "announceableStations", "", "(Ljava/lang/String;Ljava/lang/String;JLcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO$ComercialPathKeyDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/TrafficType;Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO$OpeProComProDTO;Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO$CompositionDataDTO;Ljava/util/List;)V", "getAnnounceableStations", "()Ljava/util/List;", "getCommercialDestinationStationCode", "()Ljava/lang/String;", "getCommercialOriginStationCode", "getCommercialPathKey", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO$ComercialPathKeyDTO;", "getCompositionData", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO$CompositionDataDTO;", "getCore", "getLine", "getObservation", "getOpeProComPro", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO$OpeProComProDTO;", "getTimestamp", "()J", "getTrafficType", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/TrafficType;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "ComercialPathKeyDTO", "CommercialCirculationKeyDTO", "CompositionDataDTO", "OpeProComProDTO", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CommercialPathInfoDTO {
    private final List<String> announceableStations;
    private final String commercialDestinationStationCode;
    private final String commercialOriginStationCode;
    private final ComercialPathKeyDTO commercialPathKey;
    private final CompositionDataDTO compositionData;
    private final String core;
    private final String line;
    private final String observation;
    private final OpeProComProDTO opeProComPro;
    private final long timestamp;
    private final TrafficType trafficType;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO$ComercialPathKeyDTO;", "", "commercialCirculationKey", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO$CommercialCirculationKeyDTO;", NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, "", NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO$CommercialCirculationKeyDTO;Ljava/lang/String;Ljava/lang/String;)V", "getCommercialCirculationKey", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO$CommercialCirculationKeyDTO;", "getDestinationStationCode", "()Ljava/lang/String;", "getOriginStationCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class ComercialPathKeyDTO {
        private final CommercialCirculationKeyDTO commercialCirculationKey;
        private final String destinationStationCode;
        private final String originStationCode;

        public ComercialPathKeyDTO(CommercialCirculationKeyDTO commercialCirculationKey, String originStationCode, String destinationStationCode) {
            Intrinsics.checkNotNullParameter(commercialCirculationKey, "commercialCirculationKey");
            Intrinsics.checkNotNullParameter(originStationCode, "originStationCode");
            Intrinsics.checkNotNullParameter(destinationStationCode, "destinationStationCode");
            this.commercialCirculationKey = commercialCirculationKey;
            this.originStationCode = originStationCode;
            this.destinationStationCode = destinationStationCode;
        }

        public static /* synthetic */ ComercialPathKeyDTO copy$default(ComercialPathKeyDTO comercialPathKeyDTO, CommercialCirculationKeyDTO commercialCirculationKeyDTO, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                commercialCirculationKeyDTO = comercialPathKeyDTO.commercialCirculationKey;
            }
            if ((i & 2) != 0) {
                str = comercialPathKeyDTO.originStationCode;
            }
            if ((i & 4) != 0) {
                str2 = comercialPathKeyDTO.destinationStationCode;
            }
            return comercialPathKeyDTO.copy(commercialCirculationKeyDTO, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final CommercialCirculationKeyDTO getCommercialCirculationKey() {
            return this.commercialCirculationKey;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOriginStationCode() {
            return this.originStationCode;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDestinationStationCode() {
            return this.destinationStationCode;
        }

        public final ComercialPathKeyDTO copy(CommercialCirculationKeyDTO commercialCirculationKey, String originStationCode, String destinationStationCode) {
            Intrinsics.checkNotNullParameter(commercialCirculationKey, "commercialCirculationKey");
            Intrinsics.checkNotNullParameter(originStationCode, "originStationCode");
            Intrinsics.checkNotNullParameter(destinationStationCode, "destinationStationCode");
            return new ComercialPathKeyDTO(commercialCirculationKey, originStationCode, destinationStationCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ComercialPathKeyDTO)) {
                return false;
            }
            ComercialPathKeyDTO comercialPathKeyDTO = (ComercialPathKeyDTO) other;
            return Intrinsics.areEqual(this.commercialCirculationKey, comercialPathKeyDTO.commercialCirculationKey) && Intrinsics.areEqual(this.originStationCode, comercialPathKeyDTO.originStationCode) && Intrinsics.areEqual(this.destinationStationCode, comercialPathKeyDTO.destinationStationCode);
        }

        public final CommercialCirculationKeyDTO getCommercialCirculationKey() {
            return this.commercialCirculationKey;
        }

        public final String getDestinationStationCode() {
            return this.destinationStationCode;
        }

        public final String getOriginStationCode() {
            return this.originStationCode;
        }

        public int hashCode() {
            return this.destinationStationCode.hashCode() + a.d(this.originStationCode, this.commercialCirculationKey.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ComercialPathKeyDTO(commercialCirculationKey=");
            sb.append(this.commercialCirculationKey);
            sb.append(", originStationCode=");
            sb.append(this.originStationCode);
            sb.append(", destinationStationCode=");
            return a.n(sb, this.destinationStationCode, ')');
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO$CommercialCirculationKeyDTO;", "", NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "", "(JLjava/lang/String;)V", "getCommercialNumber", "()Ljava/lang/String;", "getLaunchingDate", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class CommercialCirculationKeyDTO {
        private final String commercialNumber;
        private final long launchingDate;

        public CommercialCirculationKeyDTO(long j4, String commercialNumber) {
            Intrinsics.checkNotNullParameter(commercialNumber, "commercialNumber");
            this.launchingDate = j4;
            this.commercialNumber = commercialNumber;
        }

        public static /* synthetic */ CommercialCirculationKeyDTO copy$default(CommercialCirculationKeyDTO commercialCirculationKeyDTO, long j4, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j4 = commercialCirculationKeyDTO.launchingDate;
            }
            if ((i & 2) != 0) {
                str = commercialCirculationKeyDTO.commercialNumber;
            }
            return commercialCirculationKeyDTO.copy(j4, str);
        }

        /* renamed from: component1, reason: from getter */
        public final long getLaunchingDate() {
            return this.launchingDate;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCommercialNumber() {
            return this.commercialNumber;
        }

        public final CommercialCirculationKeyDTO copy(long launchingDate, String commercialNumber) {
            Intrinsics.checkNotNullParameter(commercialNumber, "commercialNumber");
            return new CommercialCirculationKeyDTO(launchingDate, commercialNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommercialCirculationKeyDTO)) {
                return false;
            }
            CommercialCirculationKeyDTO commercialCirculationKeyDTO = (CommercialCirculationKeyDTO) other;
            return this.launchingDate == commercialCirculationKeyDTO.launchingDate && Intrinsics.areEqual(this.commercialNumber, commercialCirculationKeyDTO.commercialNumber);
        }

        public final String getCommercialNumber() {
            return this.commercialNumber;
        }

        public final long getLaunchingDate() {
            return this.launchingDate;
        }

        public int hashCode() {
            return this.commercialNumber.hashCode() + (Long.hashCode(this.launchingDate) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CommercialCirculationKeyDTO(launchingDate=");
            sb.append(this.launchingDate);
            sb.append(", commercialNumber=");
            return a.n(sb, this.commercialNumber, ')');
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO$CompositionDataDTO;", "", "compositionLenghtType", "", "compositionFloorType", "accesible", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getAccesible", "()Z", "getCompositionFloorType", "()Ljava/lang/String;", "getCompositionLenghtType", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class CompositionDataDTO {
        private final boolean accesible;
        private final String compositionFloorType;
        private final String compositionLenghtType;

        public CompositionDataDTO(String str, String str2, boolean z3) {
            this.compositionLenghtType = str;
            this.compositionFloorType = str2;
            this.accesible = z3;
        }

        public static /* synthetic */ CompositionDataDTO copy$default(CompositionDataDTO compositionDataDTO, String str, String str2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = compositionDataDTO.compositionLenghtType;
            }
            if ((i & 2) != 0) {
                str2 = compositionDataDTO.compositionFloorType;
            }
            if ((i & 4) != 0) {
                z3 = compositionDataDTO.accesible;
            }
            return compositionDataDTO.copy(str, str2, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCompositionLenghtType() {
            return this.compositionLenghtType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCompositionFloorType() {
            return this.compositionFloorType;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAccesible() {
            return this.accesible;
        }

        public final CompositionDataDTO copy(String compositionLenghtType, String compositionFloorType, boolean accesible) {
            return new CompositionDataDTO(compositionLenghtType, compositionFloorType, accesible);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CompositionDataDTO)) {
                return false;
            }
            CompositionDataDTO compositionDataDTO = (CompositionDataDTO) other;
            return Intrinsics.areEqual(this.compositionLenghtType, compositionDataDTO.compositionLenghtType) && Intrinsics.areEqual(this.compositionFloorType, compositionDataDTO.compositionFloorType) && this.accesible == compositionDataDTO.accesible;
        }

        public final boolean getAccesible() {
            return this.accesible;
        }

        public final String getCompositionFloorType() {
            return this.compositionFloorType;
        }

        public final String getCompositionLenghtType() {
            return this.compositionLenghtType;
        }

        public int hashCode() {
            String str = this.compositionLenghtType;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.compositionFloorType;
            return Boolean.hashCode(this.accesible) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "CompositionDataDTO(compositionLenghtType=" + this.compositionLenghtType + ", compositionFloorType=" + this.compositionFloorType + ", accesible=" + this.accesible + ')';
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/CommercialPathInfoDTO$OpeProComProDTO;", "", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, "", "product", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCommercialProduct", "()Ljava/lang/String;", "getOperator", "getProduct", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class OpeProComProDTO {
        private final String commercialProduct;
        private final String operator;
        private final String product;

        public OpeProComProDTO(String operator, String product, String commercialProduct) {
            Intrinsics.checkNotNullParameter(operator, "operator");
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(commercialProduct, "commercialProduct");
            this.operator = operator;
            this.product = product;
            this.commercialProduct = commercialProduct;
        }

        public static /* synthetic */ OpeProComProDTO copy$default(OpeProComProDTO opeProComProDTO, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = opeProComProDTO.operator;
            }
            if ((i & 2) != 0) {
                str2 = opeProComProDTO.product;
            }
            if ((i & 4) != 0) {
                str3 = opeProComProDTO.commercialProduct;
            }
            return opeProComProDTO.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOperator() {
            return this.operator;
        }

        /* renamed from: component2, reason: from getter */
        public final String getProduct() {
            return this.product;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCommercialProduct() {
            return this.commercialProduct;
        }

        public final OpeProComProDTO copy(String operator, String product, String commercialProduct) {
            Intrinsics.checkNotNullParameter(operator, "operator");
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(commercialProduct, "commercialProduct");
            return new OpeProComProDTO(operator, product, commercialProduct);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpeProComProDTO)) {
                return false;
            }
            OpeProComProDTO opeProComProDTO = (OpeProComProDTO) other;
            return Intrinsics.areEqual(this.operator, opeProComProDTO.operator) && Intrinsics.areEqual(this.product, opeProComProDTO.product) && Intrinsics.areEqual(this.commercialProduct, opeProComProDTO.commercialProduct);
        }

        public final String getCommercialProduct() {
            return this.commercialProduct;
        }

        public final String getOperator() {
            return this.operator;
        }

        public final String getProduct() {
            return this.product;
        }

        public int hashCode() {
            return this.commercialProduct.hashCode() + a.d(this.product, this.operator.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("OpeProComProDTO(operator=");
            sb.append(this.operator);
            sb.append(", product=");
            sb.append(this.product);
            sb.append(", commercialProduct=");
            return a.n(sb, this.commercialProduct, ')');
        }
    }

    public CommercialPathInfoDTO(String str, String str2, long j4, ComercialPathKeyDTO commercialPathKey, String str3, String str4, String str5, TrafficType trafficType, OpeProComProDTO opeProComPro, CompositionDataDTO compositionDataDTO, List<String> announceableStations) {
        Intrinsics.checkNotNullParameter(commercialPathKey, "commercialPathKey");
        Intrinsics.checkNotNullParameter(trafficType, "trafficType");
        Intrinsics.checkNotNullParameter(opeProComPro, "opeProComPro");
        Intrinsics.checkNotNullParameter(announceableStations, "announceableStations");
        this.commercialOriginStationCode = str;
        this.commercialDestinationStationCode = str2;
        this.timestamp = j4;
        this.commercialPathKey = commercialPathKey;
        this.line = str3;
        this.core = str4;
        this.observation = str5;
        this.trafficType = trafficType;
        this.opeProComPro = opeProComPro;
        this.compositionData = compositionDataDTO;
        this.announceableStations = announceableStations;
    }

    public static /* synthetic */ CommercialPathInfoDTO copy$default(CommercialPathInfoDTO commercialPathInfoDTO, String str, String str2, long j4, ComercialPathKeyDTO comercialPathKeyDTO, String str3, String str4, String str5, TrafficType trafficType, OpeProComProDTO opeProComProDTO, CompositionDataDTO compositionDataDTO, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commercialPathInfoDTO.commercialOriginStationCode;
        }
        if ((i & 2) != 0) {
            str2 = commercialPathInfoDTO.commercialDestinationStationCode;
        }
        if ((i & 4) != 0) {
            j4 = commercialPathInfoDTO.timestamp;
        }
        if ((i & 8) != 0) {
            comercialPathKeyDTO = commercialPathInfoDTO.commercialPathKey;
        }
        if ((i & 16) != 0) {
            str3 = commercialPathInfoDTO.line;
        }
        if ((i & 32) != 0) {
            str4 = commercialPathInfoDTO.core;
        }
        if ((i & 64) != 0) {
            str5 = commercialPathInfoDTO.observation;
        }
        if ((i & 128) != 0) {
            trafficType = commercialPathInfoDTO.trafficType;
        }
        if ((i & 256) != 0) {
            opeProComProDTO = commercialPathInfoDTO.opeProComPro;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            compositionDataDTO = commercialPathInfoDTO.compositionData;
        }
        if ((i & 1024) != 0) {
            list = commercialPathInfoDTO.announceableStations;
        }
        CompositionDataDTO compositionDataDTO2 = compositionDataDTO;
        List list2 = list;
        TrafficType trafficType2 = trafficType;
        OpeProComProDTO opeProComProDTO2 = opeProComProDTO;
        long j5 = j4;
        return commercialPathInfoDTO.copy(str, str2, j5, comercialPathKeyDTO, str3, str4, str5, trafficType2, opeProComProDTO2, compositionDataDTO2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCommercialOriginStationCode() {
        return this.commercialOriginStationCode;
    }

    /* renamed from: component10, reason: from getter */
    public final CompositionDataDTO getCompositionData() {
        return this.compositionData;
    }

    public final List<String> component11() {
        return this.announceableStations;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCommercialDestinationStationCode() {
        return this.commercialDestinationStationCode;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final ComercialPathKeyDTO getCommercialPathKey() {
        return this.commercialPathKey;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLine() {
        return this.line;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCore() {
        return this.core;
    }

    /* renamed from: component7, reason: from getter */
    public final String getObservation() {
        return this.observation;
    }

    /* renamed from: component8, reason: from getter */
    public final TrafficType getTrafficType() {
        return this.trafficType;
    }

    /* renamed from: component9, reason: from getter */
    public final OpeProComProDTO getOpeProComPro() {
        return this.opeProComPro;
    }

    public final CommercialPathInfoDTO copy(String commercialOriginStationCode, String commercialDestinationStationCode, long timestamp, ComercialPathKeyDTO commercialPathKey, String line, String core, String observation, TrafficType trafficType, OpeProComProDTO opeProComPro, CompositionDataDTO compositionData, List<String> announceableStations) {
        Intrinsics.checkNotNullParameter(commercialPathKey, "commercialPathKey");
        Intrinsics.checkNotNullParameter(trafficType, "trafficType");
        Intrinsics.checkNotNullParameter(opeProComPro, "opeProComPro");
        Intrinsics.checkNotNullParameter(announceableStations, "announceableStations");
        return new CommercialPathInfoDTO(commercialOriginStationCode, commercialDestinationStationCode, timestamp, commercialPathKey, line, core, observation, trafficType, opeProComPro, compositionData, announceableStations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommercialPathInfoDTO)) {
            return false;
        }
        CommercialPathInfoDTO commercialPathInfoDTO = (CommercialPathInfoDTO) other;
        return Intrinsics.areEqual(this.commercialOriginStationCode, commercialPathInfoDTO.commercialOriginStationCode) && Intrinsics.areEqual(this.commercialDestinationStationCode, commercialPathInfoDTO.commercialDestinationStationCode) && this.timestamp == commercialPathInfoDTO.timestamp && Intrinsics.areEqual(this.commercialPathKey, commercialPathInfoDTO.commercialPathKey) && Intrinsics.areEqual(this.line, commercialPathInfoDTO.line) && Intrinsics.areEqual(this.core, commercialPathInfoDTO.core) && Intrinsics.areEqual(this.observation, commercialPathInfoDTO.observation) && this.trafficType == commercialPathInfoDTO.trafficType && Intrinsics.areEqual(this.opeProComPro, commercialPathInfoDTO.opeProComPro) && Intrinsics.areEqual(this.compositionData, commercialPathInfoDTO.compositionData) && Intrinsics.areEqual(this.announceableStations, commercialPathInfoDTO.announceableStations);
    }

    public final List<String> getAnnounceableStations() {
        return this.announceableStations;
    }

    public final String getCommercialDestinationStationCode() {
        return this.commercialDestinationStationCode;
    }

    public final String getCommercialOriginStationCode() {
        return this.commercialOriginStationCode;
    }

    public final ComercialPathKeyDTO getCommercialPathKey() {
        return this.commercialPathKey;
    }

    public final CompositionDataDTO getCompositionData() {
        return this.compositionData;
    }

    public final String getCore() {
        return this.core;
    }

    public final String getLine() {
        return this.line;
    }

    public final String getObservation() {
        return this.observation;
    }

    public final OpeProComProDTO getOpeProComPro() {
        return this.opeProComPro;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final TrafficType getTrafficType() {
        return this.trafficType;
    }

    public int hashCode() {
        String str = this.commercialOriginStationCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.commercialDestinationStationCode;
        int hashCode2 = (this.commercialPathKey.hashCode() + a.b(this.timestamp, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31;
        String str3 = this.line;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.core;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.observation;
        int hashCode5 = (this.opeProComPro.hashCode() + ((this.trafficType.hashCode() + ((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31)) * 31;
        CompositionDataDTO compositionDataDTO = this.compositionData;
        return this.announceableStations.hashCode() + ((hashCode5 + (compositionDataDTO != null ? compositionDataDTO.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CommercialPathInfoDTO(commercialOriginStationCode=");
        sb.append(this.commercialOriginStationCode);
        sb.append(", commercialDestinationStationCode=");
        sb.append(this.commercialDestinationStationCode);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", commercialPathKey=");
        sb.append(this.commercialPathKey);
        sb.append(", line=");
        sb.append(this.line);
        sb.append(", core=");
        sb.append(this.core);
        sb.append(", observation=");
        sb.append(this.observation);
        sb.append(", trafficType=");
        sb.append(this.trafficType);
        sb.append(", opeProComPro=");
        sb.append(this.opeProComPro);
        sb.append(", compositionData=");
        sb.append(this.compositionData);
        sb.append(", announceableStations=");
        return a.o(sb, this.announceableStations, ')');
    }
}
