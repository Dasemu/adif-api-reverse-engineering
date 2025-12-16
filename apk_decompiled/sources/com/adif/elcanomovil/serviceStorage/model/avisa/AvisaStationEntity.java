package com.adif.elcanomovil.serviceStorage.model.avisa;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJD\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaStationEntity;", "", "stId", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "code", "latitude", "", "longitude", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "getCode", "()Ljava/lang/String;", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "getName", "getStId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaStationEntity;", "equals", "", "other", "hashCode", "", "toString", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AvisaStationEntity {
    private final String code;
    private final Double latitude;
    private final Double longitude;
    private final String name;
    private final String stId;

    public AvisaStationEntity(String stId, String name, String code, Double d4, Double d5) {
        Intrinsics.checkNotNullParameter(stId, "stId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        this.stId = stId;
        this.name = name;
        this.code = code;
        this.latitude = d4;
        this.longitude = d5;
    }

    public static /* synthetic */ AvisaStationEntity copy$default(AvisaStationEntity avisaStationEntity, String str, String str2, String str3, Double d4, Double d5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avisaStationEntity.stId;
        }
        if ((i & 2) != 0) {
            str2 = avisaStationEntity.name;
        }
        if ((i & 4) != 0) {
            str3 = avisaStationEntity.code;
        }
        if ((i & 8) != 0) {
            d4 = avisaStationEntity.latitude;
        }
        if ((i & 16) != 0) {
            d5 = avisaStationEntity.longitude;
        }
        Double d6 = d5;
        String str4 = str3;
        return avisaStationEntity.copy(str, str2, str4, d4, d6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStId() {
        return this.stId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    public final AvisaStationEntity copy(String stId, String name, String code, Double latitude, Double longitude) {
        Intrinsics.checkNotNullParameter(stId, "stId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        return new AvisaStationEntity(stId, name, code, latitude, longitude);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvisaStationEntity)) {
            return false;
        }
        AvisaStationEntity avisaStationEntity = (AvisaStationEntity) other;
        return Intrinsics.areEqual(this.stId, avisaStationEntity.stId) && Intrinsics.areEqual(this.name, avisaStationEntity.name) && Intrinsics.areEqual(this.code, avisaStationEntity.code) && Intrinsics.areEqual((Object) this.latitude, (Object) avisaStationEntity.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) avisaStationEntity.longitude);
    }

    public final String getCode() {
        return this.code;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final String getName() {
        return this.name;
    }

    public final String getStId() {
        return this.stId;
    }

    public int hashCode() {
        int d4 = a.d(this.code, a.d(this.name, this.stId.hashCode() * 31, 31), 31);
        Double d5 = this.latitude;
        int hashCode = (d4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.longitude;
        return hashCode + (d6 != null ? d6.hashCode() : 0);
    }

    public String toString() {
        return "AvisaStationEntity(stId=" + this.stId + ", name=" + this.name + ", code=" + this.code + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AvisaStationEntity(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.Double r6, java.lang.Double r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r2 = this;
            r9 = r8 & 8
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            if (r9 == 0) goto Lb
            r6 = r0
        Lb:
            r8 = r8 & 16
            if (r8 == 0) goto L10
            r7 = r0
        L10:
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.serviceStorage.model.avisa.AvisaStationEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
