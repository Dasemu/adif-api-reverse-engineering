package com.adif.elcanomovil.domain.entities;

import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/StorableStation;", "Lcom/adif/elcanomovil/domain/entities/StorableData;", "stationCode", "", "(Ljava/lang/String;)V", "identifier", "getIdentifier", "()Ljava/lang/String;", "getStationCode", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StorableStation implements StorableData {
    private final String stationCode;

    public StorableStation(String stationCode) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        this.stationCode = stationCode;
    }

    public static /* synthetic */ StorableStation copy$default(StorableStation storableStation, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storableStation.stationCode;
        }
        return storableStation.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    public final StorableStation copy(String stationCode) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        return new StorableStation(stationCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StorableStation) && Intrinsics.areEqual(this.stationCode, ((StorableStation) other).stationCode);
    }

    @Override // com.adif.elcanomovil.domain.entities.StorableData
    public String getIdentifier() {
        return this.stationCode;
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public int hashCode() {
        return this.stationCode.hashCode();
    }

    public String toString() {
        return a.n(new StringBuilder("StorableStation(stationCode="), this.stationCode, ')');
    }
}
