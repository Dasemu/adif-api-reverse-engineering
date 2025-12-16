package com.adif.elcanomovil.serviceNetworking.stations.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/stations/model/CorrespondenceDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "logo", "(Ljava/lang/String;Ljava/lang/String;)V", "getLogo", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CorrespondenceDTO {
    private final String logo;
    private final String name;

    public CorrespondenceDTO(String str, String str2) {
        this.name = str;
        this.logo = str2;
    }

    public static /* synthetic */ CorrespondenceDTO copy$default(CorrespondenceDTO correspondenceDTO, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = correspondenceDTO.name;
        }
        if ((i & 2) != 0) {
            str2 = correspondenceDTO.logo;
        }
        return correspondenceDTO.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    public final CorrespondenceDTO copy(String name, String logo) {
        return new CorrespondenceDTO(name, logo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CorrespondenceDTO)) {
            return false;
        }
        CorrespondenceDTO correspondenceDTO = (CorrespondenceDTO) other;
        return Intrinsics.areEqual(this.name, correspondenceDTO.name) && Intrinsics.areEqual(this.logo, correspondenceDTO.logo);
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.logo;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CorrespondenceDTO(name=");
        sb.append(this.name);
        sb.append(", logo=");
        return a.n(sb, this.logo, ')');
    }
}
