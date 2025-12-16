package com.adif.elcanomovil.serviceNetworking.compositions;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/compositions/CommercialCirculationKey;", "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "", NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "", "(Ljava/lang/String;J)V", "getCommercialNumber", "()Ljava/lang/String;", "getLaunchingDate", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CommercialCirculationKey {
    private final String commercialNumber;
    private final long launchingDate;

    public CommercialCirculationKey(String commercialNumber, long j4) {
        Intrinsics.checkNotNullParameter(commercialNumber, "commercialNumber");
        this.commercialNumber = commercialNumber;
        this.launchingDate = j4;
    }

    public static /* synthetic */ CommercialCirculationKey copy$default(CommercialCirculationKey commercialCirculationKey, String str, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commercialCirculationKey.commercialNumber;
        }
        if ((i & 2) != 0) {
            j4 = commercialCirculationKey.launchingDate;
        }
        return commercialCirculationKey.copy(str, j4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCommercialNumber() {
        return this.commercialNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final long getLaunchingDate() {
        return this.launchingDate;
    }

    public final CommercialCirculationKey copy(String commercialNumber, long launchingDate) {
        Intrinsics.checkNotNullParameter(commercialNumber, "commercialNumber");
        return new CommercialCirculationKey(commercialNumber, launchingDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommercialCirculationKey)) {
            return false;
        }
        CommercialCirculationKey commercialCirculationKey = (CommercialCirculationKey) other;
        return Intrinsics.areEqual(this.commercialNumber, commercialCirculationKey.commercialNumber) && this.launchingDate == commercialCirculationKey.launchingDate;
    }

    public final String getCommercialNumber() {
        return this.commercialNumber;
    }

    public final long getLaunchingDate() {
        return this.launchingDate;
    }

    public int hashCode() {
        return Long.hashCode(this.launchingDate) + (this.commercialNumber.hashCode() * 31);
    }

    public String toString() {
        return "CommercialCirculationKey(commercialNumber=" + this.commercialNumber + ", launchingDate=" + this.launchingDate + ')';
    }
}
