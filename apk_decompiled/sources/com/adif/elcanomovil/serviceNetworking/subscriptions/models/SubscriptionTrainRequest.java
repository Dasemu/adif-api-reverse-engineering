package com.adif.elcanomovil.serviceNetworking.subscriptions.models;

import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/SubscriptionTrainRequest;", "", "platform", "", "osVersion", "stationId", "center", "repeats", "subscription_type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCenter", "()Ljava/lang/String;", "getOsVersion", "getPlatform", "getRepeats", "getStationId", "getSubscription_type", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionTrainRequest {
    private final String center;
    private final String osVersion;
    private final String platform;
    private final String repeats;
    private final String stationId;
    private final String subscription_type;

    public SubscriptionTrainRequest(String platform, String osVersion, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        this.platform = platform;
        this.osVersion = osVersion;
        this.stationId = str;
        this.center = str2;
        this.repeats = str3;
        this.subscription_type = str4;
    }

    public static /* synthetic */ SubscriptionTrainRequest copy$default(SubscriptionTrainRequest subscriptionTrainRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionTrainRequest.platform;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionTrainRequest.osVersion;
        }
        if ((i & 4) != 0) {
            str3 = subscriptionTrainRequest.stationId;
        }
        if ((i & 8) != 0) {
            str4 = subscriptionTrainRequest.center;
        }
        if ((i & 16) != 0) {
            str5 = subscriptionTrainRequest.repeats;
        }
        if ((i & 32) != 0) {
            str6 = subscriptionTrainRequest.subscription_type;
        }
        String str7 = str5;
        String str8 = str6;
        return subscriptionTrainRequest.copy(str, str2, str3, str4, str7, str8);
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

    public final SubscriptionTrainRequest copy(String platform, String osVersion, String stationId, String center, String repeats, String subscription_type) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        return new SubscriptionTrainRequest(platform, osVersion, stationId, center, repeats, subscription_type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionTrainRequest)) {
            return false;
        }
        SubscriptionTrainRequest subscriptionTrainRequest = (SubscriptionTrainRequest) other;
        return Intrinsics.areEqual(this.platform, subscriptionTrainRequest.platform) && Intrinsics.areEqual(this.osVersion, subscriptionTrainRequest.osVersion) && Intrinsics.areEqual(this.stationId, subscriptionTrainRequest.stationId) && Intrinsics.areEqual(this.center, subscriptionTrainRequest.center) && Intrinsics.areEqual(this.repeats, subscriptionTrainRequest.repeats) && Intrinsics.areEqual(this.subscription_type, subscriptionTrainRequest.subscription_type);
    }

    public final String getCenter() {
        return this.center;
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
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionTrainRequest(platform=");
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
        return a.n(sb, this.subscription_type, ')');
    }
}
