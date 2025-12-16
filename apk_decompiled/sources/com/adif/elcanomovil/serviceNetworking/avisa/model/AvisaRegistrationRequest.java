package com.adif.elcanomovil.serviceNetworking.avisa.model;

import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/avisa/model/AvisaRegistrationRequest;", "", "userId", "", "deviceId", ServicePaths.AvisaLoginService.queryPassword, "osType", "osVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "getOsType", "getOsVersion", "getPassword", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AvisaRegistrationRequest {
    private final String deviceId;
    private final String osType;
    private final String osVersion;
    private final String password;
    private final String userId;

    public AvisaRegistrationRequest(String userId, String deviceId, String password, String osType, String osVersion) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(osType, "osType");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        this.userId = userId;
        this.deviceId = deviceId;
        this.password = password;
        this.osType = osType;
        this.osVersion = osVersion;
    }

    public static /* synthetic */ AvisaRegistrationRequest copy$default(AvisaRegistrationRequest avisaRegistrationRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avisaRegistrationRequest.userId;
        }
        if ((i & 2) != 0) {
            str2 = avisaRegistrationRequest.deviceId;
        }
        if ((i & 4) != 0) {
            str3 = avisaRegistrationRequest.password;
        }
        if ((i & 8) != 0) {
            str4 = avisaRegistrationRequest.osType;
        }
        if ((i & 16) != 0) {
            str5 = avisaRegistrationRequest.osVersion;
        }
        String str6 = str5;
        String str7 = str3;
        return avisaRegistrationRequest.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOsType() {
        return this.osType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    public final AvisaRegistrationRequest copy(String userId, String deviceId, String password, String osType, String osVersion) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(osType, "osType");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        return new AvisaRegistrationRequest(userId, deviceId, password, osType, osVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvisaRegistrationRequest)) {
            return false;
        }
        AvisaRegistrationRequest avisaRegistrationRequest = (AvisaRegistrationRequest) other;
        return Intrinsics.areEqual(this.userId, avisaRegistrationRequest.userId) && Intrinsics.areEqual(this.deviceId, avisaRegistrationRequest.deviceId) && Intrinsics.areEqual(this.password, avisaRegistrationRequest.password) && Intrinsics.areEqual(this.osType, avisaRegistrationRequest.osType) && Intrinsics.areEqual(this.osVersion, avisaRegistrationRequest.osVersion);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getOsType() {
        return this.osType;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.osVersion.hashCode() + a.d(this.osType, a.d(this.password, a.d(this.deviceId, this.userId.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AvisaRegistrationRequest(userId=");
        sb.append(this.userId);
        sb.append(", deviceId=");
        sb.append(this.deviceId);
        sb.append(", password=");
        sb.append(this.password);
        sb.append(", osType=");
        sb.append(this.osType);
        sb.append(", osVersion=");
        return a.n(sb, this.osVersion, ')');
    }
}
