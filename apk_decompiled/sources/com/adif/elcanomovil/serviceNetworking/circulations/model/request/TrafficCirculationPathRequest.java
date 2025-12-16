package com.adif.elcanomovil.serviceNetworking.circulations.model.request;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceNetworking.circulations.model.request.CirculationPathRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JU\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/TrafficCirculationPathRequest;", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/CirculationPathRequest;", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_SERVICE, "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/CirculationPathRequest$State;", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_STOP_TYPE, NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "", NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, "page", "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/CirculationPathRequest$PageInfoDTO;", "stationCode", NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC, "Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/TrafficType;", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/CirculationPathRequest$State;Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/CirculationPathRequest$State;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/CirculationPathRequest$PageInfoDTO;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/TrafficType;)V", "getCommercialService", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/CirculationPathRequest$State;", "getCommercialStopType", "getDestinationStationCode", "()Ljava/lang/String;", "getOriginStationCode", "getPage", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/CirculationPathRequest$PageInfoDTO;", "getStationCode", "getTrafficType", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/model/request/TrafficType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TrafficCirculationPathRequest implements CirculationPathRequest {
    private final CirculationPathRequest.State commercialService;
    private final CirculationPathRequest.State commercialStopType;
    private final String destinationStationCode;
    private final String originStationCode;
    private final CirculationPathRequest.PageInfoDTO page;
    private final String stationCode;
    private final TrafficType trafficType;

    public TrafficCirculationPathRequest(CirculationPathRequest.State commercialService, CirculationPathRequest.State commercialStopType, String str, String str2, CirculationPathRequest.PageInfoDTO page, String str3, TrafficType trafficType) {
        Intrinsics.checkNotNullParameter(commercialService, "commercialService");
        Intrinsics.checkNotNullParameter(commercialStopType, "commercialStopType");
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(trafficType, "trafficType");
        this.commercialService = commercialService;
        this.commercialStopType = commercialStopType;
        this.destinationStationCode = str;
        this.originStationCode = str2;
        this.page = page;
        this.stationCode = str3;
        this.trafficType = trafficType;
    }

    public static /* synthetic */ TrafficCirculationPathRequest copy$default(TrafficCirculationPathRequest trafficCirculationPathRequest, CirculationPathRequest.State state, CirculationPathRequest.State state2, String str, String str2, CirculationPathRequest.PageInfoDTO pageInfoDTO, String str3, TrafficType trafficType, int i, Object obj) {
        if ((i & 1) != 0) {
            state = trafficCirculationPathRequest.commercialService;
        }
        if ((i & 2) != 0) {
            state2 = trafficCirculationPathRequest.commercialStopType;
        }
        if ((i & 4) != 0) {
            str = trafficCirculationPathRequest.destinationStationCode;
        }
        if ((i & 8) != 0) {
            str2 = trafficCirculationPathRequest.originStationCode;
        }
        if ((i & 16) != 0) {
            pageInfoDTO = trafficCirculationPathRequest.page;
        }
        if ((i & 32) != 0) {
            str3 = trafficCirculationPathRequest.stationCode;
        }
        if ((i & 64) != 0) {
            trafficType = trafficCirculationPathRequest.trafficType;
        }
        String str4 = str3;
        TrafficType trafficType2 = trafficType;
        CirculationPathRequest.PageInfoDTO pageInfoDTO2 = pageInfoDTO;
        String str5 = str;
        return trafficCirculationPathRequest.copy(state, state2, str5, str2, pageInfoDTO2, str4, trafficType2);
    }

    /* renamed from: component1, reason: from getter */
    public final CirculationPathRequest.State getCommercialService() {
        return this.commercialService;
    }

    /* renamed from: component2, reason: from getter */
    public final CirculationPathRequest.State getCommercialStopType() {
        return this.commercialStopType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDestinationStationCode() {
        return this.destinationStationCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOriginStationCode() {
        return this.originStationCode;
    }

    /* renamed from: component5, reason: from getter */
    public final CirculationPathRequest.PageInfoDTO getPage() {
        return this.page;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component7, reason: from getter */
    public final TrafficType getTrafficType() {
        return this.trafficType;
    }

    public final TrafficCirculationPathRequest copy(CirculationPathRequest.State commercialService, CirculationPathRequest.State commercialStopType, String destinationStationCode, String originStationCode, CirculationPathRequest.PageInfoDTO page, String stationCode, TrafficType trafficType) {
        Intrinsics.checkNotNullParameter(commercialService, "commercialService");
        Intrinsics.checkNotNullParameter(commercialStopType, "commercialStopType");
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(trafficType, "trafficType");
        return new TrafficCirculationPathRequest(commercialService, commercialStopType, destinationStationCode, originStationCode, page, stationCode, trafficType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrafficCirculationPathRequest)) {
            return false;
        }
        TrafficCirculationPathRequest trafficCirculationPathRequest = (TrafficCirculationPathRequest) other;
        return this.commercialService == trafficCirculationPathRequest.commercialService && this.commercialStopType == trafficCirculationPathRequest.commercialStopType && Intrinsics.areEqual(this.destinationStationCode, trafficCirculationPathRequest.destinationStationCode) && Intrinsics.areEqual(this.originStationCode, trafficCirculationPathRequest.originStationCode) && Intrinsics.areEqual(this.page, trafficCirculationPathRequest.page) && Intrinsics.areEqual(this.stationCode, trafficCirculationPathRequest.stationCode) && this.trafficType == trafficCirculationPathRequest.trafficType;
    }

    @Override // com.adif.elcanomovil.serviceNetworking.circulations.model.request.CirculationPathRequest
    public CirculationPathRequest.State getCommercialService() {
        return this.commercialService;
    }

    @Override // com.adif.elcanomovil.serviceNetworking.circulations.model.request.CirculationPathRequest
    public CirculationPathRequest.State getCommercialStopType() {
        return this.commercialStopType;
    }

    public final String getDestinationStationCode() {
        return this.destinationStationCode;
    }

    public final String getOriginStationCode() {
        return this.originStationCode;
    }

    @Override // com.adif.elcanomovil.serviceNetworking.circulations.model.request.CirculationPathRequest
    public CirculationPathRequest.PageInfoDTO getPage() {
        return this.page;
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public final TrafficType getTrafficType() {
        return this.trafficType;
    }

    public int hashCode() {
        int hashCode = (this.commercialStopType.hashCode() + (this.commercialService.hashCode() * 31)) * 31;
        String str = this.destinationStationCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.originStationCode;
        int hashCode3 = (this.page.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.stationCode;
        return this.trafficType.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "TrafficCirculationPathRequest(commercialService=" + this.commercialService + ", commercialStopType=" + this.commercialStopType + ", destinationStationCode=" + this.destinationStationCode + ", originStationCode=" + this.originStationCode + ", page=" + this.page + ", stationCode=" + this.stationCode + ", trafficType=" + this.trafficType + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ TrafficCirculationPathRequest(com.adif.elcanomovil.serviceNetworking.circulations.model.request.CirculationPathRequest.State r2, com.adif.elcanomovil.serviceNetworking.circulations.model.request.CirculationPathRequest.State r3, java.lang.String r4, java.lang.String r5, com.adif.elcanomovil.serviceNetworking.circulations.model.request.CirculationPathRequest.PageInfoDTO r6, java.lang.String r7, com.adif.elcanomovil.serviceNetworking.circulations.model.request.TrafficType r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            com.adif.elcanomovil.serviceNetworking.circulations.model.request.CirculationPathRequest$State r2 = com.adif.elcanomovil.serviceNetworking.circulations.model.request.CirculationPathRequest.State.YES
        L6:
            r10 = r9 & 4
            r0 = 0
            if (r10 == 0) goto Lc
            r4 = r0
        Lc:
            r10 = r9 & 8
            if (r10 == 0) goto L11
            r5 = r0
        L11:
            r9 = r9 & 32
            if (r9 == 0) goto L1e
            r9 = r0
            r7 = r5
            r10 = r8
            r5 = r3
            r8 = r6
            r3 = r1
            r6 = r4
        L1c:
            r4 = r2
            goto L26
        L1e:
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            goto L1c
        L26:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.serviceNetworking.circulations.model.request.TrafficCirculationPathRequest.<init>(com.adif.elcanomovil.serviceNetworking.circulations.model.request.CirculationPathRequest$State, com.adif.elcanomovil.serviceNetworking.circulations.model.request.CirculationPathRequest$State, java.lang.String, java.lang.String, com.adif.elcanomovil.serviceNetworking.circulations.model.request.CirculationPathRequest$PageInfoDTO, java.lang.String, com.adif.elcanomovil.serviceNetworking.circulations.model.request.TrafficType, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
