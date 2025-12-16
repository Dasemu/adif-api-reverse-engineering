package com.adif.elcanomovil.serviceNetworking.pinning;

import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/pinning/PinningPublicKeys;", "", "stationCirculationKeys", "", "", "elcanoAvisaKeys", "(Ljava/util/List;Ljava/util/List;)V", "getElcanoAvisaKeys", "()Ljava/util/List;", "getStationCirculationKeys", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PinningPublicKeys {
    private final List<String> elcanoAvisaKeys;
    private final List<String> stationCirculationKeys;

    public PinningPublicKeys(List<String> stationCirculationKeys, List<String> elcanoAvisaKeys) {
        Intrinsics.checkNotNullParameter(stationCirculationKeys, "stationCirculationKeys");
        Intrinsics.checkNotNullParameter(elcanoAvisaKeys, "elcanoAvisaKeys");
        this.stationCirculationKeys = stationCirculationKeys;
        this.elcanoAvisaKeys = elcanoAvisaKeys;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PinningPublicKeys copy$default(PinningPublicKeys pinningPublicKeys, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pinningPublicKeys.stationCirculationKeys;
        }
        if ((i & 2) != 0) {
            list2 = pinningPublicKeys.elcanoAvisaKeys;
        }
        return pinningPublicKeys.copy(list, list2);
    }

    public final List<String> component1() {
        return this.stationCirculationKeys;
    }

    public final List<String> component2() {
        return this.elcanoAvisaKeys;
    }

    public final PinningPublicKeys copy(List<String> stationCirculationKeys, List<String> elcanoAvisaKeys) {
        Intrinsics.checkNotNullParameter(stationCirculationKeys, "stationCirculationKeys");
        Intrinsics.checkNotNullParameter(elcanoAvisaKeys, "elcanoAvisaKeys");
        return new PinningPublicKeys(stationCirculationKeys, elcanoAvisaKeys);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinningPublicKeys)) {
            return false;
        }
        PinningPublicKeys pinningPublicKeys = (PinningPublicKeys) other;
        return Intrinsics.areEqual(this.stationCirculationKeys, pinningPublicKeys.stationCirculationKeys) && Intrinsics.areEqual(this.elcanoAvisaKeys, pinningPublicKeys.elcanoAvisaKeys);
    }

    public final List<String> getElcanoAvisaKeys() {
        return this.elcanoAvisaKeys;
    }

    public final List<String> getStationCirculationKeys() {
        return this.stationCirculationKeys;
    }

    public int hashCode() {
        return this.elcanoAvisaKeys.hashCode() + (this.stationCirculationKeys.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PinningPublicKeys(stationCirculationKeys=");
        sb.append(this.stationCirculationKeys);
        sb.append(", elcanoAvisaKeys=");
        return a.o(sb, this.elcanoAvisaKeys, ')');
    }
}
