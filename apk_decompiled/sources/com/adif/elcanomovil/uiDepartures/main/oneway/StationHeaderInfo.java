package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.uiDepartures.views.TrafficAvailability;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 +2\u00020\u0001:\u0001+BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010$\u001a\u00020\u000fHÆ\u0003Jk\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010&\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\nHÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014¨\u0006,"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/oneway/StationHeaderInfo;", "", "isCercanias", "Lcom/adif/elcanomovil/domain/entities/TrainType;", "hasBothTraffic", "Lcom/adif/elcanomovil/uiDepartures/views/TrafficAvailability;", "isRodalies", "", "isFavourite", "originStationName", "", "originStationLongName", "destinationStationName", "destinationStationLongName", "circulationType", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "(Lcom/adif/elcanomovil/domain/entities/TrainType;Lcom/adif/elcanomovil/uiDepartures/views/TrafficAvailability;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/CirculationType;)V", "getCirculationType", "()Lcom/adif/elcanomovil/domain/entities/CirculationType;", "getDestinationStationLongName", "()Ljava/lang/String;", "getDestinationStationName", "getHasBothTraffic", "()Lcom/adif/elcanomovil/uiDepartures/views/TrafficAvailability;", "()Lcom/adif/elcanomovil/domain/entities/TrainType;", "()Z", "getOriginStationLongName", "getOriginStationName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StationHeaderInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: default, reason: not valid java name */
    private static final StationHeaderInfo f1default = new StationHeaderInfo(TrainType.CERCANIAS, TrafficAvailability.BOTH, false, false, null, null, null, null, CirculationType.DEPARTURE);
    private final CirculationType circulationType;
    private final String destinationStationLongName;
    private final String destinationStationName;
    private final TrafficAvailability hasBothTraffic;
    private final TrainType isCercanias;
    private final boolean isFavourite;
    private final boolean isRodalies;
    private final String originStationLongName;
    private final String originStationName;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/oneway/StationHeaderInfo$Companion;", "", "()V", "default", "Lcom/adif/elcanomovil/uiDepartures/main/oneway/StationHeaderInfo;", "getDefault", "()Lcom/adif/elcanomovil/uiDepartures/main/oneway/StationHeaderInfo;", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StationHeaderInfo getDefault() {
            return StationHeaderInfo.f1default;
        }

        private Companion() {
        }
    }

    public StationHeaderInfo(TrainType isCercanias, TrafficAvailability hasBothTraffic, boolean z3, boolean z4, String str, String str2, String str3, String str4, CirculationType circulationType) {
        Intrinsics.checkNotNullParameter(isCercanias, "isCercanias");
        Intrinsics.checkNotNullParameter(hasBothTraffic, "hasBothTraffic");
        Intrinsics.checkNotNullParameter(circulationType, "circulationType");
        this.isCercanias = isCercanias;
        this.hasBothTraffic = hasBothTraffic;
        this.isRodalies = z3;
        this.isFavourite = z4;
        this.originStationName = str;
        this.originStationLongName = str2;
        this.destinationStationName = str3;
        this.destinationStationLongName = str4;
        this.circulationType = circulationType;
    }

    public static /* synthetic */ StationHeaderInfo copy$default(StationHeaderInfo stationHeaderInfo, TrainType trainType, TrafficAvailability trafficAvailability, boolean z3, boolean z4, String str, String str2, String str3, String str4, CirculationType circulationType, int i, Object obj) {
        if ((i & 1) != 0) {
            trainType = stationHeaderInfo.isCercanias;
        }
        if ((i & 2) != 0) {
            trafficAvailability = stationHeaderInfo.hasBothTraffic;
        }
        if ((i & 4) != 0) {
            z3 = stationHeaderInfo.isRodalies;
        }
        if ((i & 8) != 0) {
            z4 = stationHeaderInfo.isFavourite;
        }
        if ((i & 16) != 0) {
            str = stationHeaderInfo.originStationName;
        }
        if ((i & 32) != 0) {
            str2 = stationHeaderInfo.originStationLongName;
        }
        if ((i & 64) != 0) {
            str3 = stationHeaderInfo.destinationStationName;
        }
        if ((i & 128) != 0) {
            str4 = stationHeaderInfo.destinationStationLongName;
        }
        if ((i & 256) != 0) {
            circulationType = stationHeaderInfo.circulationType;
        }
        String str5 = str4;
        CirculationType circulationType2 = circulationType;
        String str6 = str2;
        String str7 = str3;
        String str8 = str;
        boolean z5 = z3;
        return stationHeaderInfo.copy(trainType, trafficAvailability, z5, z4, str8, str6, str7, str5, circulationType2);
    }

    /* renamed from: component1, reason: from getter */
    public final TrainType getIsCercanias() {
        return this.isCercanias;
    }

    /* renamed from: component2, reason: from getter */
    public final TrafficAvailability getHasBothTraffic() {
        return this.hasBothTraffic;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsRodalies() {
        return this.isRodalies;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFavourite() {
        return this.isFavourite;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOriginStationName() {
        return this.originStationName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getOriginStationLongName() {
        return this.originStationLongName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDestinationStationName() {
        return this.destinationStationName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDestinationStationLongName() {
        return this.destinationStationLongName;
    }

    /* renamed from: component9, reason: from getter */
    public final CirculationType getCirculationType() {
        return this.circulationType;
    }

    public final StationHeaderInfo copy(TrainType isCercanias, TrafficAvailability hasBothTraffic, boolean isRodalies, boolean isFavourite, String originStationName, String originStationLongName, String destinationStationName, String destinationStationLongName, CirculationType circulationType) {
        Intrinsics.checkNotNullParameter(isCercanias, "isCercanias");
        Intrinsics.checkNotNullParameter(hasBothTraffic, "hasBothTraffic");
        Intrinsics.checkNotNullParameter(circulationType, "circulationType");
        return new StationHeaderInfo(isCercanias, hasBothTraffic, isRodalies, isFavourite, originStationName, originStationLongName, destinationStationName, destinationStationLongName, circulationType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StationHeaderInfo)) {
            return false;
        }
        StationHeaderInfo stationHeaderInfo = (StationHeaderInfo) other;
        return this.isCercanias == stationHeaderInfo.isCercanias && this.hasBothTraffic == stationHeaderInfo.hasBothTraffic && this.isRodalies == stationHeaderInfo.isRodalies && this.isFavourite == stationHeaderInfo.isFavourite && Intrinsics.areEqual(this.originStationName, stationHeaderInfo.originStationName) && Intrinsics.areEqual(this.originStationLongName, stationHeaderInfo.originStationLongName) && Intrinsics.areEqual(this.destinationStationName, stationHeaderInfo.destinationStationName) && Intrinsics.areEqual(this.destinationStationLongName, stationHeaderInfo.destinationStationLongName) && this.circulationType == stationHeaderInfo.circulationType;
    }

    public final CirculationType getCirculationType() {
        return this.circulationType;
    }

    public final String getDestinationStationLongName() {
        return this.destinationStationLongName;
    }

    public final String getDestinationStationName() {
        return this.destinationStationName;
    }

    public final TrafficAvailability getHasBothTraffic() {
        return this.hasBothTraffic;
    }

    public final String getOriginStationLongName() {
        return this.originStationLongName;
    }

    public final String getOriginStationName() {
        return this.originStationName;
    }

    public int hashCode() {
        int c4 = C.w.c(C.w.c((this.hasBothTraffic.hashCode() + (this.isCercanias.hashCode() * 31)) * 31, 31, this.isRodalies), 31, this.isFavourite);
        String str = this.originStationName;
        int hashCode = (c4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.originStationLongName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.destinationStationName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.destinationStationLongName;
        return this.circulationType.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final TrainType isCercanias() {
        return this.isCercanias;
    }

    public final boolean isFavourite() {
        return this.isFavourite;
    }

    public final boolean isRodalies() {
        return this.isRodalies;
    }

    public String toString() {
        return "StationHeaderInfo(isCercanias=" + this.isCercanias + ", hasBothTraffic=" + this.hasBothTraffic + ", isRodalies=" + this.isRodalies + ", isFavourite=" + this.isFavourite + ", originStationName=" + this.originStationName + ", originStationLongName=" + this.originStationLongName + ", destinationStationName=" + this.destinationStationName + ", destinationStationLongName=" + this.destinationStationLongName + ", circulationType=" + this.circulationType + ')';
    }
}
