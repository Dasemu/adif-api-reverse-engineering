package com.adif.elcanomovil.uiDepartures.main;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/main/DeparturesViewData;", "", "stationName", "", "stationToName", "(Ljava/lang/String;Ljava/lang/String;)V", "getStationName", "()Ljava/lang/String;", "getStationToName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeparturesViewData {
    private final String stationName;
    private final String stationToName;

    public DeparturesViewData(String stationName, String stationToName) {
        Intrinsics.checkNotNullParameter(stationName, "stationName");
        Intrinsics.checkNotNullParameter(stationToName, "stationToName");
        this.stationName = stationName;
        this.stationToName = stationToName;
    }

    public static /* synthetic */ DeparturesViewData copy$default(DeparturesViewData departuresViewData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = departuresViewData.stationName;
        }
        if ((i & 2) != 0) {
            str2 = departuresViewData.stationToName;
        }
        return departuresViewData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStationName() {
        return this.stationName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStationToName() {
        return this.stationToName;
    }

    public final DeparturesViewData copy(String stationName, String stationToName) {
        Intrinsics.checkNotNullParameter(stationName, "stationName");
        Intrinsics.checkNotNullParameter(stationToName, "stationToName");
        return new DeparturesViewData(stationName, stationToName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeparturesViewData)) {
            return false;
        }
        DeparturesViewData departuresViewData = (DeparturesViewData) other;
        return Intrinsics.areEqual(this.stationName, departuresViewData.stationName) && Intrinsics.areEqual(this.stationToName, departuresViewData.stationToName);
    }

    public final String getStationName() {
        return this.stationName;
    }

    public final String getStationToName() {
        return this.stationToName;
    }

    public int hashCode() {
        return this.stationToName.hashCode() + (this.stationName.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeparturesViewData(stationName=");
        sb.append(this.stationName);
        sb.append(", stationToName=");
        return com.google.android.gms.measurement.internal.a.n(sb, this.stationToName, ')');
    }
}
