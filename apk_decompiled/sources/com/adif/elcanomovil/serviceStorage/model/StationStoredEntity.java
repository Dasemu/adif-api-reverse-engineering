package com.adif.elcanomovil.serviceStorage.model;

import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/model/StationStoredEntity;", "Lcom/adif/elcanomovil/serviceStorage/model/StationStored;", "stationCode", "", "(Ljava/lang/String;)V", "getStationCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StationStoredEntity extends StationStored {
    private final String stationCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StationStoredEntity(String stationCode) {
        super(stationCode, null);
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        this.stationCode = stationCode;
    }

    public static /* synthetic */ StationStoredEntity copy$default(StationStoredEntity stationStoredEntity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stationStoredEntity.stationCode;
        }
        return stationStoredEntity.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    public final StationStoredEntity copy(String stationCode) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        return new StationStoredEntity(stationCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StationStoredEntity) && Intrinsics.areEqual(this.stationCode, ((StationStoredEntity) other).stationCode);
    }

    public final String getStationCode() {
        return this.stationCode;
    }

    public int hashCode() {
        return this.stationCode.hashCode();
    }

    public String toString() {
        return a.n(new StringBuilder("StationStoredEntity(stationCode="), this.stationCode, ')');
    }
}
