package com.adif.elcanomovil.serviceNetworking.circulations;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceNetworking.circulations.model.request.TrafficType;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u00040123BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J_\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0011HÖ\u0001J\t\u0010/\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00064"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO;", "", "timestamp", "", "commercialPathKey", "Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$ComercialPathKeyDTO;", "line", "", "observation", NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC, "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/TrafficType;", "opeProComPro", "Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$OpeProComProDTO;", "compositionData", "Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$CompositionDataDTO;", "announceableStations", "", "", "(JLcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$ComercialPathKeyDTO;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/TrafficType;Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$OpeProComProDTO;Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$CompositionDataDTO;Ljava/util/List;)V", "getAnnounceableStations", "()Ljava/util/List;", "getCommercialPathKey", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$ComercialPathKeyDTO;", "getCompositionData", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$CompositionDataDTO;", "getLine", "()Ljava/lang/String;", "getObservation", "getOpeProComPro", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$OpeProComProDTO;", "getTimestamp", "()J", "getTrafficType", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/TrafficType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "ComercialPathKeyDTO", "CommercialCirculationKeyDTO", "CompositionDataDTO", "OpeProComProDTO", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CommercialPathInfoDTO {
    private final List<Integer> announceableStations;
    private final ComercialPathKeyDTO commercialPathKey;
    private final CompositionDataDTO compositionData;
    private final String line;
    private final String observation;
    private final OpeProComProDTO opeProComPro;
    private final long timestamp;
    private final TrafficType trafficType;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$ComercialPathKeyDTO;", "", "commercialCirculationKey", "Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$CommercialCirculationKeyDTO;", NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, "", NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "(Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$CommercialCirculationKeyDTO;Ljava/lang/String;Ljava/lang/String;)V", "getCommercialCirculationKey", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$CommercialCirculationKeyDTO;", "getDestinationStationCode", "()Ljava/lang/String;", "getOriginStationCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$CommercialCirculationKeyDTO;", "", NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "", "(JLjava/lang/String;)V", "getCommercialNumber", "()Ljava/lang/String;", "getLaunchingDate", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$CompositionDataDTO;", "", "compositionLenghtType", "Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$CompositionDataDTO$Length;", "compositionFloorType", "Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$CompositionDataDTO$Floor;", "accesible", "", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$CompositionDataDTO$Length;Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$CompositionDataDTO$Floor;Z)V", "getAccesible", "()Z", "getCompositionFloorType", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$CompositionDataDTO$Floor;", "getCompositionLenghtType", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$CompositionDataDTO$Length;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Floor", "Length", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class CompositionDataDTO {
        private final boolean accesible;
        private final Floor compositionFloorType;
        private final Length compositionLenghtType;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$CompositionDataDTO$Floor;", "", "(Ljava/lang/String;I)V", "isSingle", "", "()Z", "SINGLE", "DOUBLE", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Floor {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Floor[] $VALUES;
            public static final Floor SINGLE = new Floor("SINGLE", 0);
            public static final Floor DOUBLE = new Floor("DOUBLE", 1);

            private static final /* synthetic */ Floor[] $values() {
                return new Floor[]{SINGLE, DOUBLE};
            }

            static {
                Floor[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            private Floor(String str, int i) {
            }

            public static EnumEntries<Floor> getEntries() {
                return $ENTRIES;
            }

            public static Floor valueOf(String str) {
                return (Floor) Enum.valueOf(Floor.class, str);
            }

            public static Floor[] values() {
                return (Floor[]) $VALUES.clone();
            }

            public final boolean isSingle() {
                return this == SINGLE;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$CompositionDataDTO$Length;", "", "(Ljava/lang/String;I)V", "isShort", "", "()Z", "LONG", "SHORT", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Length {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Length[] $VALUES;
            public static final Length LONG = new Length("LONG", 0);
            public static final Length SHORT = new Length("SHORT", 1);

            private static final /* synthetic */ Length[] $values() {
                return new Length[]{LONG, SHORT};
            }

            static {
                Length[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            private Length(String str, int i) {
            }

            public static EnumEntries<Length> getEntries() {
                return $ENTRIES;
            }

            public static Length valueOf(String str) {
                return (Length) Enum.valueOf(Length.class, str);
            }

            public static Length[] values() {
                return (Length[]) $VALUES.clone();
            }

            public final boolean isShort() {
                return this == SHORT;
            }
        }

        public CompositionDataDTO(Length compositionLenghtType, Floor compositionFloorType, boolean z3) {
            Intrinsics.checkNotNullParameter(compositionLenghtType, "compositionLenghtType");
            Intrinsics.checkNotNullParameter(compositionFloorType, "compositionFloorType");
            this.compositionLenghtType = compositionLenghtType;
            this.compositionFloorType = compositionFloorType;
            this.accesible = z3;
        }

        public static /* synthetic */ CompositionDataDTO copy$default(CompositionDataDTO compositionDataDTO, Length length, Floor floor, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                length = compositionDataDTO.compositionLenghtType;
            }
            if ((i & 2) != 0) {
                floor = compositionDataDTO.compositionFloorType;
            }
            if ((i & 4) != 0) {
                z3 = compositionDataDTO.accesible;
            }
            return compositionDataDTO.copy(length, floor, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final Length getCompositionLenghtType() {
            return this.compositionLenghtType;
        }

        /* renamed from: component2, reason: from getter */
        public final Floor getCompositionFloorType() {
            return this.compositionFloorType;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAccesible() {
            return this.accesible;
        }

        public final CompositionDataDTO copy(Length compositionLenghtType, Floor compositionFloorType, boolean accesible) {
            Intrinsics.checkNotNullParameter(compositionLenghtType, "compositionLenghtType");
            Intrinsics.checkNotNullParameter(compositionFloorType, "compositionFloorType");
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
            return this.compositionLenghtType == compositionDataDTO.compositionLenghtType && this.compositionFloorType == compositionDataDTO.compositionFloorType && this.accesible == compositionDataDTO.accesible;
        }

        public final boolean getAccesible() {
            return this.accesible;
        }

        public final Floor getCompositionFloorType() {
            return this.compositionFloorType;
        }

        public final Length getCompositionLenghtType() {
            return this.compositionLenghtType;
        }

        public int hashCode() {
            return Boolean.hashCode(this.accesible) + ((this.compositionFloorType.hashCode() + (this.compositionLenghtType.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "CompositionDataDTO(compositionLenghtType=" + this.compositionLenghtType + ", compositionFloorType=" + this.compositionFloorType + ", accesible=" + this.accesible + ')';
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/CommercialPathInfoDTO$OpeProComProDTO;", "", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, "", "product", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCommercialProduct", "()Ljava/lang/String;", "getOperator", "getProduct", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public CommercialPathInfoDTO(long j4, ComercialPathKeyDTO commercialPathKey, String line, String observation, TrafficType trafficType, OpeProComProDTO opeProComPro, CompositionDataDTO compositionData, List<Integer> announceableStations) {
        Intrinsics.checkNotNullParameter(commercialPathKey, "commercialPathKey");
        Intrinsics.checkNotNullParameter(line, "line");
        Intrinsics.checkNotNullParameter(observation, "observation");
        Intrinsics.checkNotNullParameter(trafficType, "trafficType");
        Intrinsics.checkNotNullParameter(opeProComPro, "opeProComPro");
        Intrinsics.checkNotNullParameter(compositionData, "compositionData");
        Intrinsics.checkNotNullParameter(announceableStations, "announceableStations");
        this.timestamp = j4;
        this.commercialPathKey = commercialPathKey;
        this.line = line;
        this.observation = observation;
        this.trafficType = trafficType;
        this.opeProComPro = opeProComPro;
        this.compositionData = compositionData;
        this.announceableStations = announceableStations;
    }

    public static /* synthetic */ CommercialPathInfoDTO copy$default(CommercialPathInfoDTO commercialPathInfoDTO, long j4, ComercialPathKeyDTO comercialPathKeyDTO, String str, String str2, TrafficType trafficType, OpeProComProDTO opeProComProDTO, CompositionDataDTO compositionDataDTO, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j4 = commercialPathInfoDTO.timestamp;
        }
        long j5 = j4;
        if ((i & 2) != 0) {
            comercialPathKeyDTO = commercialPathInfoDTO.commercialPathKey;
        }
        ComercialPathKeyDTO comercialPathKeyDTO2 = comercialPathKeyDTO;
        if ((i & 4) != 0) {
            str = commercialPathInfoDTO.line;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = commercialPathInfoDTO.observation;
        }
        return commercialPathInfoDTO.copy(j5, comercialPathKeyDTO2, str3, str2, (i & 16) != 0 ? commercialPathInfoDTO.trafficType : trafficType, (i & 32) != 0 ? commercialPathInfoDTO.opeProComPro : opeProComProDTO, (i & 64) != 0 ? commercialPathInfoDTO.compositionData : compositionDataDTO, (i & 128) != 0 ? commercialPathInfoDTO.announceableStations : list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final ComercialPathKeyDTO getCommercialPathKey() {
        return this.commercialPathKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLine() {
        return this.line;
    }

    /* renamed from: component4, reason: from getter */
    public final String getObservation() {
        return this.observation;
    }

    /* renamed from: component5, reason: from getter */
    public final TrafficType getTrafficType() {
        return this.trafficType;
    }

    /* renamed from: component6, reason: from getter */
    public final OpeProComProDTO getOpeProComPro() {
        return this.opeProComPro;
    }

    /* renamed from: component7, reason: from getter */
    public final CompositionDataDTO getCompositionData() {
        return this.compositionData;
    }

    public final List<Integer> component8() {
        return this.announceableStations;
    }

    public final CommercialPathInfoDTO copy(long timestamp, ComercialPathKeyDTO commercialPathKey, String line, String observation, TrafficType trafficType, OpeProComProDTO opeProComPro, CompositionDataDTO compositionData, List<Integer> announceableStations) {
        Intrinsics.checkNotNullParameter(commercialPathKey, "commercialPathKey");
        Intrinsics.checkNotNullParameter(line, "line");
        Intrinsics.checkNotNullParameter(observation, "observation");
        Intrinsics.checkNotNullParameter(trafficType, "trafficType");
        Intrinsics.checkNotNullParameter(opeProComPro, "opeProComPro");
        Intrinsics.checkNotNullParameter(compositionData, "compositionData");
        Intrinsics.checkNotNullParameter(announceableStations, "announceableStations");
        return new CommercialPathInfoDTO(timestamp, commercialPathKey, line, observation, trafficType, opeProComPro, compositionData, announceableStations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommercialPathInfoDTO)) {
            return false;
        }
        CommercialPathInfoDTO commercialPathInfoDTO = (CommercialPathInfoDTO) other;
        return this.timestamp == commercialPathInfoDTO.timestamp && Intrinsics.areEqual(this.commercialPathKey, commercialPathInfoDTO.commercialPathKey) && Intrinsics.areEqual(this.line, commercialPathInfoDTO.line) && Intrinsics.areEqual(this.observation, commercialPathInfoDTO.observation) && this.trafficType == commercialPathInfoDTO.trafficType && Intrinsics.areEqual(this.opeProComPro, commercialPathInfoDTO.opeProComPro) && Intrinsics.areEqual(this.compositionData, commercialPathInfoDTO.compositionData) && Intrinsics.areEqual(this.announceableStations, commercialPathInfoDTO.announceableStations);
    }

    public final List<Integer> getAnnounceableStations() {
        return this.announceableStations;
    }

    public final ComercialPathKeyDTO getCommercialPathKey() {
        return this.commercialPathKey;
    }

    public final CompositionDataDTO getCompositionData() {
        return this.compositionData;
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
        return this.announceableStations.hashCode() + ((this.compositionData.hashCode() + ((this.opeProComPro.hashCode() + ((this.trafficType.hashCode() + a.d(this.observation, a.d(this.line, (this.commercialPathKey.hashCode() + (Long.hashCode(this.timestamp) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CommercialPathInfoDTO(timestamp=");
        sb.append(this.timestamp);
        sb.append(", commercialPathKey=");
        sb.append(this.commercialPathKey);
        sb.append(", line=");
        sb.append(this.line);
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
