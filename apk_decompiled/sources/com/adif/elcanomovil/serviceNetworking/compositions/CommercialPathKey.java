package com.adif.elcanomovil.serviceNetworking.compositions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/compositions/CommercialPathKey;", "", "commercialCirculationKey", "Lcom/adif/elcanomovil/serviceNetworking/compositions/CommercialCirculationKey;", "(Lcom/adif/elcanomovil/serviceNetworking/compositions/CommercialCirculationKey;)V", "getCommercialCirculationKey", "()Lcom/adif/elcanomovil/serviceNetworking/compositions/CommercialCirculationKey;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CommercialPathKey {
    private final CommercialCirculationKey commercialCirculationKey;

    public CommercialPathKey(CommercialCirculationKey commercialCirculationKey) {
        this.commercialCirculationKey = commercialCirculationKey;
    }

    public static /* synthetic */ CommercialPathKey copy$default(CommercialPathKey commercialPathKey, CommercialCirculationKey commercialCirculationKey, int i, Object obj) {
        if ((i & 1) != 0) {
            commercialCirculationKey = commercialPathKey.commercialCirculationKey;
        }
        return commercialPathKey.copy(commercialCirculationKey);
    }

    /* renamed from: component1, reason: from getter */
    public final CommercialCirculationKey getCommercialCirculationKey() {
        return this.commercialCirculationKey;
    }

    public final CommercialPathKey copy(CommercialCirculationKey commercialCirculationKey) {
        return new CommercialPathKey(commercialCirculationKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CommercialPathKey) && Intrinsics.areEqual(this.commercialCirculationKey, ((CommercialPathKey) other).commercialCirculationKey);
    }

    public final CommercialCirculationKey getCommercialCirculationKey() {
        return this.commercialCirculationKey;
    }

    public int hashCode() {
        CommercialCirculationKey commercialCirculationKey = this.commercialCirculationKey;
        if (commercialCirculationKey == null) {
            return 0;
        }
        return commercialCirculationKey.hashCode();
    }

    public String toString() {
        return "CommercialPathKey(commercialCirculationKey=" + this.commercialCirculationKey + ')';
    }
}
