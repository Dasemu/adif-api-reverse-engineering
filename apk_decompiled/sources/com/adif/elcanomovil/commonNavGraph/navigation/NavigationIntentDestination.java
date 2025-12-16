package com.adif.elcanomovil.commonNavGraph.navigation;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntentDestination;", "", "()V", "AvisaView", "RoutesView", "TrainView", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntentDestination$AvisaView;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntentDestination$RoutesView;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntentDestination$TrainView;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class NavigationIntentDestination {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntentDestination$AvisaView;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntentDestination;", ServicePaths.IncidenceService.pathIncidenceId, "", "(Ljava/lang/String;)V", "getIncidenceId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class AvisaView extends NavigationIntentDestination {
        private final String incidenceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvisaView(String incidenceId) {
            super(null);
            Intrinsics.checkNotNullParameter(incidenceId, "incidenceId");
            this.incidenceId = incidenceId;
        }

        public static /* synthetic */ AvisaView copy$default(AvisaView avisaView, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = avisaView.incidenceId;
            }
            return avisaView.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIncidenceId() {
            return this.incidenceId;
        }

        public final AvisaView copy(String incidenceId) {
            Intrinsics.checkNotNullParameter(incidenceId, "incidenceId");
            return new AvisaView(incidenceId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AvisaView) && Intrinsics.areEqual(this.incidenceId, ((AvisaView) other).incidenceId);
        }

        public final String getIncidenceId() {
            return this.incidenceId;
        }

        public int hashCode() {
            return this.incidenceId.hashCode();
        }

        public String toString() {
            return a.n(new StringBuilder("AvisaView(incidenceId="), this.incidenceId, ')');
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntentDestination$RoutesView;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntentDestination;", "originStationId", "", "destinationStationId", "isCercanias", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getDestinationStationId", "()Ljava/lang/String;", "()Z", "getOriginStationId", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class RoutesView extends NavigationIntentDestination {
        private final String destinationStationId;
        private final boolean isCercanias;
        private final String originStationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RoutesView(String originStationId, String destinationStationId, boolean z3) {
            super(null);
            Intrinsics.checkNotNullParameter(originStationId, "originStationId");
            Intrinsics.checkNotNullParameter(destinationStationId, "destinationStationId");
            this.originStationId = originStationId;
            this.destinationStationId = destinationStationId;
            this.isCercanias = z3;
        }

        public static /* synthetic */ RoutesView copy$default(RoutesView routesView, String str, String str2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = routesView.originStationId;
            }
            if ((i & 2) != 0) {
                str2 = routesView.destinationStationId;
            }
            if ((i & 4) != 0) {
                z3 = routesView.isCercanias;
            }
            return routesView.copy(str, str2, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOriginStationId() {
            return this.originStationId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDestinationStationId() {
            return this.destinationStationId;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsCercanias() {
            return this.isCercanias;
        }

        public final RoutesView copy(String originStationId, String destinationStationId, boolean isCercanias) {
            Intrinsics.checkNotNullParameter(originStationId, "originStationId");
            Intrinsics.checkNotNullParameter(destinationStationId, "destinationStationId");
            return new RoutesView(originStationId, destinationStationId, isCercanias);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoutesView)) {
                return false;
            }
            RoutesView routesView = (RoutesView) other;
            return Intrinsics.areEqual(this.originStationId, routesView.originStationId) && Intrinsics.areEqual(this.destinationStationId, routesView.destinationStationId) && this.isCercanias == routesView.isCercanias;
        }

        public final String getDestinationStationId() {
            return this.destinationStationId;
        }

        public final String getOriginStationId() {
            return this.originStationId;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isCercanias) + a.d(this.destinationStationId, this.originStationId.hashCode() * 31, 31);
        }

        public final boolean isCercanias() {
            return this.isCercanias;
        }

        public String toString() {
            return "RoutesView(originStationId=" + this.originStationId + ", destinationStationId=" + this.destinationStationId + ", isCercanias=" + this.isCercanias + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntentDestination$TrainView;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntentDestination;", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "", "(Ljava/lang/String;)V", "getCommercialNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class TrainView extends NavigationIntentDestination {
        private final String commercialNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrainView(String commercialNumber) {
            super(null);
            Intrinsics.checkNotNullParameter(commercialNumber, "commercialNumber");
            this.commercialNumber = commercialNumber;
        }

        public static /* synthetic */ TrainView copy$default(TrainView trainView, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = trainView.commercialNumber;
            }
            return trainView.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCommercialNumber() {
            return this.commercialNumber;
        }

        public final TrainView copy(String commercialNumber) {
            Intrinsics.checkNotNullParameter(commercialNumber, "commercialNumber");
            return new TrainView(commercialNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TrainView) && Intrinsics.areEqual(this.commercialNumber, ((TrainView) other).commercialNumber);
        }

        public final String getCommercialNumber() {
            return this.commercialNumber;
        }

        public int hashCode() {
            return this.commercialNumber.hashCode();
        }

        public String toString() {
            return a.n(new StringBuilder("TrainView(commercialNumber="), this.commercialNumber, ')');
        }
    }

    public /* synthetic */ NavigationIntentDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NavigationIntentDestination() {
    }
}
