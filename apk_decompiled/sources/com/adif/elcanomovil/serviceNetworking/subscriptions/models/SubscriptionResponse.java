package com.adif.elcanomovil.serviceNetworking.subscriptions.models;

import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006%"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/SubscriptionResponse;", "", FirebaseAnalytics.Param.DESTINATION, "Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/DestinationResponse;", "origin", "Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/OriginResponse;", "repeats", "", "subscriptionType", "timeCenter", "timeEnd", "timeStart", "(Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/DestinationResponse;Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/OriginResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDestination", "()Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/DestinationResponse;", "getOrigin", "()Lcom/adif/elcanomovil/serviceNetworking/subscriptions/models/OriginResponse;", "getRepeats", "()Ljava/lang/String;", "getSubscriptionType", "getTimeCenter", "getTimeEnd", "getTimeStart", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionResponse {
    private final DestinationResponse destination;
    private final OriginResponse origin;
    private final String repeats;
    private final String subscriptionType;
    private final String timeCenter;
    private final String timeEnd;
    private final String timeStart;

    public SubscriptionResponse(DestinationResponse destinationResponse, OriginResponse origin, String repeats, String subscriptionType, String timeCenter, String str, String str2) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(repeats, "repeats");
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        Intrinsics.checkNotNullParameter(timeCenter, "timeCenter");
        this.destination = destinationResponse;
        this.origin = origin;
        this.repeats = repeats;
        this.subscriptionType = subscriptionType;
        this.timeCenter = timeCenter;
        this.timeEnd = str;
        this.timeStart = str2;
    }

    public static /* synthetic */ SubscriptionResponse copy$default(SubscriptionResponse subscriptionResponse, DestinationResponse destinationResponse, OriginResponse originResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            destinationResponse = subscriptionResponse.destination;
        }
        if ((i & 2) != 0) {
            originResponse = subscriptionResponse.origin;
        }
        if ((i & 4) != 0) {
            str = subscriptionResponse.repeats;
        }
        if ((i & 8) != 0) {
            str2 = subscriptionResponse.subscriptionType;
        }
        if ((i & 16) != 0) {
            str3 = subscriptionResponse.timeCenter;
        }
        if ((i & 32) != 0) {
            str4 = subscriptionResponse.timeEnd;
        }
        if ((i & 64) != 0) {
            str5 = subscriptionResponse.timeStart;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        String str9 = str;
        return subscriptionResponse.copy(destinationResponse, originResponse, str9, str2, str8, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final DestinationResponse getDestination() {
        return this.destination;
    }

    /* renamed from: component2, reason: from getter */
    public final OriginResponse getOrigin() {
        return this.origin;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRepeats() {
        return this.repeats;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubscriptionType() {
        return this.subscriptionType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTimeCenter() {
        return this.timeCenter;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTimeEnd() {
        return this.timeEnd;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTimeStart() {
        return this.timeStart;
    }

    public final SubscriptionResponse copy(DestinationResponse destination, OriginResponse origin, String repeats, String subscriptionType, String timeCenter, String timeEnd, String timeStart) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(repeats, "repeats");
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        Intrinsics.checkNotNullParameter(timeCenter, "timeCenter");
        return new SubscriptionResponse(destination, origin, repeats, subscriptionType, timeCenter, timeEnd, timeStart);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionResponse)) {
            return false;
        }
        SubscriptionResponse subscriptionResponse = (SubscriptionResponse) other;
        return Intrinsics.areEqual(this.destination, subscriptionResponse.destination) && Intrinsics.areEqual(this.origin, subscriptionResponse.origin) && Intrinsics.areEqual(this.repeats, subscriptionResponse.repeats) && Intrinsics.areEqual(this.subscriptionType, subscriptionResponse.subscriptionType) && Intrinsics.areEqual(this.timeCenter, subscriptionResponse.timeCenter) && Intrinsics.areEqual(this.timeEnd, subscriptionResponse.timeEnd) && Intrinsics.areEqual(this.timeStart, subscriptionResponse.timeStart);
    }

    public final DestinationResponse getDestination() {
        return this.destination;
    }

    public final OriginResponse getOrigin() {
        return this.origin;
    }

    public final String getRepeats() {
        return this.repeats;
    }

    public final String getSubscriptionType() {
        return this.subscriptionType;
    }

    public final String getTimeCenter() {
        return this.timeCenter;
    }

    public final String getTimeEnd() {
        return this.timeEnd;
    }

    public final String getTimeStart() {
        return this.timeStart;
    }

    public int hashCode() {
        DestinationResponse destinationResponse = this.destination;
        int d4 = a.d(this.timeCenter, a.d(this.subscriptionType, a.d(this.repeats, (this.origin.hashCode() + ((destinationResponse == null ? 0 : destinationResponse.hashCode()) * 31)) * 31, 31), 31), 31);
        String str = this.timeEnd;
        int hashCode = (d4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.timeStart;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionResponse(destination=");
        sb.append(this.destination);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", repeats=");
        sb.append(this.repeats);
        sb.append(", subscriptionType=");
        sb.append(this.subscriptionType);
        sb.append(", timeCenter=");
        sb.append(this.timeCenter);
        sb.append(", timeEnd=");
        sb.append(this.timeEnd);
        sb.append(", timeStart=");
        return a.n(sb, this.timeStart, ')');
    }
}
