package com.adif.elcanomovil.serviceNetworking.subscriptions.models;

import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JY\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/SubscriptionCreateTrainRequest;", "", "platform", "", "osVersion", "stationId", "center", "repeats", "subscription_type", "day", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCenter", "()Ljava/lang/String;", "getDay", "getOsVersion", "getPlatform", "getRepeats", "getStationId", "getSubscription_type", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionCreateTrainRequest {
    private final String center;
    private final String day;
    private final String osVersion;
    private final String platform;
    private final String repeats;
    private final String stationId;
    private final String subscription_type;

    public SubscriptionCreateTrainRequest(String platform, String osVersion, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        this.platform = platform;
        this.osVersion = osVersion;
        this.stationId = str;
        this.center = str2;
        this.repeats = str3;
        this.subscription_type = str4;
        this.day = str5;
    }

    public static /* synthetic */ SubscriptionCreateTrainRequest copy$default(SubscriptionCreateTrainRequest subscriptionCreateTrainRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionCreateTrainRequest.platform;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionCreateTrainRequest.osVersion;
        }
        if ((i & 4) != 0) {
            str3 = subscriptionCreateTrainRequest.stationId;
        }
        if ((i & 8) != 0) {
            str4 = subscriptionCreateTrainRequest.center;
        }
        if ((i & 16) != 0) {
            str5 = subscriptionCreateTrainRequest.repeats;
        }
        if ((i & 32) != 0) {
            str6 = subscriptionCreateTrainRequest.subscription_type;
        }
        if ((i & 64) != 0) {
            str7 = subscriptionCreateTrainRequest.day;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return subscriptionCreateTrainRequest.copy(str, str2, str11, str4, str10, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStationId() {
        return this.stationId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCenter() {
        return this.center;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRepeats() {
        return this.repeats;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSubscription_type() {
        return this.subscription_type;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    public final SubscriptionCreateTrainRequest copy(String platform, String osVersion, String stationId, String center, String repeats, String subscription_type, String day) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        return new SubscriptionCreateTrainRequest(platform, osVersion, stationId, center, repeats, subscription_type, day);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionCreateTrainRequest)) {
            return false;
        }
        SubscriptionCreateTrainRequest subscriptionCreateTrainRequest = (SubscriptionCreateTrainRequest) other;
        return Intrinsics.areEqual(this.platform, subscriptionCreateTrainRequest.platform) && Intrinsics.areEqual(this.osVersion, subscriptionCreateTrainRequest.osVersion) && Intrinsics.areEqual(this.stationId, subscriptionCreateTrainRequest.stationId) && Intrinsics.areEqual(this.center, subscriptionCreateTrainRequest.center) && Intrinsics.areEqual(this.repeats, subscriptionCreateTrainRequest.repeats) && Intrinsics.areEqual(this.subscription_type, subscriptionCreateTrainRequest.subscription_type) && Intrinsics.areEqual(this.day, subscriptionCreateTrainRequest.day);
    }

    public final String getCenter() {
        return this.center;
    }

    public final String getDay() {
        return this.day;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getRepeats() {
        return this.repeats;
    }

    public final String getStationId() {
        return this.stationId;
    }

    public final String getSubscription_type() {
        return this.subscription_type;
    }

    public int hashCode() {
        int d4 = a.d(this.osVersion, this.platform.hashCode() * 31, 31);
        String str = this.stationId;
        int hashCode = (d4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.center;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.repeats;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subscription_type;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.day;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionCreateTrainRequest(platform=");
        sb.append(this.platform);
        sb.append(", osVersion=");
        sb.append(this.osVersion);
        sb.append(", stationId=");
        sb.append(this.stationId);
        sb.append(", center=");
        sb.append(this.center);
        sb.append(", repeats=");
        sb.append(this.repeats);
        sb.append(", subscription_type=");
        sb.append(this.subscription_type);
        sb.append(", day=");
        return a.n(sb, this.day, ')');
    }
}
