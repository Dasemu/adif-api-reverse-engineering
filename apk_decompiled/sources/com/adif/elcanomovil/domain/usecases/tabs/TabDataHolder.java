package com.adif.elcanomovil.domain.usecases.tabs;

import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.StationServiceType;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder;", "", "()V", "tabDataSet", "Ljava/util/Queue;", "Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder$TabData;", "popIfAvailable", "push", "", "tabData", "TabData", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabDataHolder {
    private Queue<TabData> tabDataSet = new LinkedList();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder$TabData;", "", "()V", "Departures", "Stations", "Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder$TabData$Departures;", "Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder$TabData$Stations;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static abstract class TabData {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder$TabData$Departures;", "Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder$TabData;", "origin", "", FirebaseAnalytics.Param.DESTINATION, "circulationType", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "isCercanias", "Lcom/adif/elcanomovil/domain/entities/TrainType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/CirculationType;Lcom/adif/elcanomovil/domain/entities/TrainType;)V", "getCirculationType", "()Lcom/adif/elcanomovil/domain/entities/CirculationType;", "getDestination", "()Ljava/lang/String;", "()Lcom/adif/elcanomovil/domain/entities/TrainType;", "getOrigin", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final /* data */ class Departures extends TabData {
            private final CirculationType circulationType;
            private final String destination;
            private final TrainType isCercanias;
            private final String origin;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Departures(String str, String str2, CirculationType circulationType, TrainType isCercanias) {
                super(null);
                Intrinsics.checkNotNullParameter(circulationType, "circulationType");
                Intrinsics.checkNotNullParameter(isCercanias, "isCercanias");
                this.origin = str;
                this.destination = str2;
                this.circulationType = circulationType;
                this.isCercanias = isCercanias;
            }

            public static /* synthetic */ Departures copy$default(Departures departures, String str, String str2, CirculationType circulationType, TrainType trainType, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = departures.origin;
                }
                if ((i & 2) != 0) {
                    str2 = departures.destination;
                }
                if ((i & 4) != 0) {
                    circulationType = departures.circulationType;
                }
                if ((i & 8) != 0) {
                    trainType = departures.isCercanias;
                }
                return departures.copy(str, str2, circulationType, trainType);
            }

            /* renamed from: component1, reason: from getter */
            public final String getOrigin() {
                return this.origin;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDestination() {
                return this.destination;
            }

            /* renamed from: component3, reason: from getter */
            public final CirculationType getCirculationType() {
                return this.circulationType;
            }

            /* renamed from: component4, reason: from getter */
            public final TrainType getIsCercanias() {
                return this.isCercanias;
            }

            public final Departures copy(String origin, String destination, CirculationType circulationType, TrainType isCercanias) {
                Intrinsics.checkNotNullParameter(circulationType, "circulationType");
                Intrinsics.checkNotNullParameter(isCercanias, "isCercanias");
                return new Departures(origin, destination, circulationType, isCercanias);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Departures)) {
                    return false;
                }
                Departures departures = (Departures) other;
                return Intrinsics.areEqual(this.origin, departures.origin) && Intrinsics.areEqual(this.destination, departures.destination) && this.circulationType == departures.circulationType && this.isCercanias == departures.isCercanias;
            }

            public final CirculationType getCirculationType() {
                return this.circulationType;
            }

            public final String getDestination() {
                return this.destination;
            }

            public final String getOrigin() {
                return this.origin;
            }

            public int hashCode() {
                String str = this.origin;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.destination;
                return this.isCercanias.hashCode() + ((this.circulationType.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
            }

            public final TrainType isCercanias() {
                return this.isCercanias;
            }

            public String toString() {
                return "Departures(origin=" + this.origin + ", destination=" + this.destination + ", circulationType=" + this.circulationType + ", isCercanias=" + this.isCercanias + ')';
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder$TabData$Stations;", "Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder$TabData;", "station", "", "type", "Lcom/adif/elcanomovil/domain/entities/StationServiceType;", "(Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/StationServiceType;)V", "getStation", "()Ljava/lang/String;", "getType", "()Lcom/adif/elcanomovil/domain/entities/StationServiceType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final /* data */ class Stations extends TabData {
            private final String station;
            private final StationServiceType type;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Stations(String station, StationServiceType type) {
                super(null);
                Intrinsics.checkNotNullParameter(station, "station");
                Intrinsics.checkNotNullParameter(type, "type");
                this.station = station;
                this.type = type;
            }

            public static /* synthetic */ Stations copy$default(Stations stations, String str, StationServiceType stationServiceType, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stations.station;
                }
                if ((i & 2) != 0) {
                    stationServiceType = stations.type;
                }
                return stations.copy(str, stationServiceType);
            }

            /* renamed from: component1, reason: from getter */
            public final String getStation() {
                return this.station;
            }

            /* renamed from: component2, reason: from getter */
            public final StationServiceType getType() {
                return this.type;
            }

            public final Stations copy(String station, StationServiceType type) {
                Intrinsics.checkNotNullParameter(station, "station");
                Intrinsics.checkNotNullParameter(type, "type");
                return new Stations(station, type);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Stations)) {
                    return false;
                }
                Stations stations = (Stations) other;
                return Intrinsics.areEqual(this.station, stations.station) && this.type == stations.type;
            }

            public final String getStation() {
                return this.station;
            }

            public final StationServiceType getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode() + (this.station.hashCode() * 31);
            }

            public String toString() {
                return "Stations(station=" + this.station + ", type=" + this.type + ')';
            }
        }

        public /* synthetic */ TabData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TabData() {
        }
    }

    public final TabData popIfAvailable() {
        return this.tabDataSet.poll();
    }

    public final void push(TabData tabData) {
        Intrinsics.checkNotNullParameter(tabData, "tabData");
        this.tabDataSet.add(tabData);
    }
}
