package com.adif.elcanomovil.serviceNetworking.stations.model;

import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/stations/model/AccessibleDTO;", "", "accessible", "", "description", "", "(ZLjava/lang/String;)V", "getAccessible", "()Z", "getDescription", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AccessibleDTO {
    private final boolean accessible;
    private final String description;

    public AccessibleDTO(boolean z3, String str) {
        this.accessible = z3;
        this.description = str;
    }

    public static /* synthetic */ AccessibleDTO copy$default(AccessibleDTO accessibleDTO, boolean z3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = accessibleDTO.accessible;
        }
        if ((i & 2) != 0) {
            str = accessibleDTO.description;
        }
        return accessibleDTO.copy(z3, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAccessible() {
        return this.accessible;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final AccessibleDTO copy(boolean accessible, String description) {
        return new AccessibleDTO(accessible, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessibleDTO)) {
            return false;
        }
        AccessibleDTO accessibleDTO = (AccessibleDTO) other;
        return this.accessible == accessibleDTO.accessible && Intrinsics.areEqual(this.description, accessibleDTO.description);
    }

    public final boolean getAccessible() {
        return this.accessible;
    }

    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.accessible) * 31;
        String str = this.description;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AccessibleDTO(accessible=");
        sb.append(this.accessible);
        sb.append(", description=");
        return a.n(sb, this.description, ')');
    }
}
