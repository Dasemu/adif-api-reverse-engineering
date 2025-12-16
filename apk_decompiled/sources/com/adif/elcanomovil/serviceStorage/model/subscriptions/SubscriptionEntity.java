package com.adif.elcanomovil.serviceStorage.model.subscriptions;

import C.w;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\u0081\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010/\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\tHÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u00063"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/SubscriptionEntity;", "", "subcriptionId", "", FirebaseAnalytics.Param.DESTINATION, "Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/DestinationEntity;", "origin", "Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/OriginEntity;", "repeats", "", "subscriptionType", "timeCenter", "timeEnd", "timeStart", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "(ILcom/adif/elcanomovil/serviceStorage/model/subscriptions/DestinationEntity;Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/OriginEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getActive", "()Z", "getCommercialProduct", "()Ljava/lang/String;", "getDestination", "()Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/DestinationEntity;", "getOperator", "getOrigin", "()Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/OriginEntity;", "getRepeats", "getSubcriptionId", "()I", "getSubscriptionType", "getTimeCenter", "getTimeEnd", "getTimeStart", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionEntity {
    private final boolean active;
    private final String commercialProduct;
    private final DestinationEntity destination;
    private final String operator;
    private final OriginEntity origin;
    private final String repeats;
    private final int subcriptionId;
    private final String subscriptionType;
    private final String timeCenter;
    private final String timeEnd;
    private final String timeStart;

    public SubscriptionEntity(int i, DestinationEntity destinationEntity, OriginEntity origin, String repeats, String subscriptionType, String timeCenter, String str, String str2, boolean z3, String str3, String str4) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(repeats, "repeats");
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        Intrinsics.checkNotNullParameter(timeCenter, "timeCenter");
        this.subcriptionId = i;
        this.destination = destinationEntity;
        this.origin = origin;
        this.repeats = repeats;
        this.subscriptionType = subscriptionType;
        this.timeCenter = timeCenter;
        this.timeEnd = str;
        this.timeStart = str2;
        this.active = z3;
        this.operator = str3;
        this.commercialProduct = str4;
    }

    public static /* synthetic */ SubscriptionEntity copy$default(SubscriptionEntity subscriptionEntity, int i, DestinationEntity destinationEntity, OriginEntity originEntity, String str, String str2, String str3, String str4, String str5, boolean z3, String str6, String str7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = subscriptionEntity.subcriptionId;
        }
        if ((i4 & 2) != 0) {
            destinationEntity = subscriptionEntity.destination;
        }
        if ((i4 & 4) != 0) {
            originEntity = subscriptionEntity.origin;
        }
        if ((i4 & 8) != 0) {
            str = subscriptionEntity.repeats;
        }
        if ((i4 & 16) != 0) {
            str2 = subscriptionEntity.subscriptionType;
        }
        if ((i4 & 32) != 0) {
            str3 = subscriptionEntity.timeCenter;
        }
        if ((i4 & 64) != 0) {
            str4 = subscriptionEntity.timeEnd;
        }
        if ((i4 & 128) != 0) {
            str5 = subscriptionEntity.timeStart;
        }
        if ((i4 & 256) != 0) {
            z3 = subscriptionEntity.active;
        }
        if ((i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            str6 = subscriptionEntity.operator;
        }
        if ((i4 & 1024) != 0) {
            str7 = subscriptionEntity.commercialProduct;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        boolean z4 = z3;
        String str11 = str3;
        String str12 = str4;
        String str13 = str2;
        OriginEntity originEntity2 = originEntity;
        return subscriptionEntity.copy(i, destinationEntity, originEntity2, str, str13, str11, str12, str10, z4, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSubcriptionId() {
        return this.subcriptionId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getOperator() {
        return this.operator;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCommercialProduct() {
        return this.commercialProduct;
    }

    /* renamed from: component2, reason: from getter */
    public final DestinationEntity getDestination() {
        return this.destination;
    }

    /* renamed from: component3, reason: from getter */
    public final OriginEntity getOrigin() {
        return this.origin;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRepeats() {
        return this.repeats;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSubscriptionType() {
        return this.subscriptionType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTimeCenter() {
        return this.timeCenter;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTimeEnd() {
        return this.timeEnd;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTimeStart() {
        return this.timeStart;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    public final SubscriptionEntity copy(int subcriptionId, DestinationEntity destination, OriginEntity origin, String repeats, String subscriptionType, String timeCenter, String timeEnd, String timeStart, boolean active, String operator, String commercialProduct) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(repeats, "repeats");
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        Intrinsics.checkNotNullParameter(timeCenter, "timeCenter");
        return new SubscriptionEntity(subcriptionId, destination, origin, repeats, subscriptionType, timeCenter, timeEnd, timeStart, active, operator, commercialProduct);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionEntity)) {
            return false;
        }
        SubscriptionEntity subscriptionEntity = (SubscriptionEntity) other;
        return this.subcriptionId == subscriptionEntity.subcriptionId && Intrinsics.areEqual(this.destination, subscriptionEntity.destination) && Intrinsics.areEqual(this.origin, subscriptionEntity.origin) && Intrinsics.areEqual(this.repeats, subscriptionEntity.repeats) && Intrinsics.areEqual(this.subscriptionType, subscriptionEntity.subscriptionType) && Intrinsics.areEqual(this.timeCenter, subscriptionEntity.timeCenter) && Intrinsics.areEqual(this.timeEnd, subscriptionEntity.timeEnd) && Intrinsics.areEqual(this.timeStart, subscriptionEntity.timeStart) && this.active == subscriptionEntity.active && Intrinsics.areEqual(this.operator, subscriptionEntity.operator) && Intrinsics.areEqual(this.commercialProduct, subscriptionEntity.commercialProduct);
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getCommercialProduct() {
        return this.commercialProduct;
    }

    public final DestinationEntity getDestination() {
        return this.destination;
    }

    public final String getOperator() {
        return this.operator;
    }

    public final OriginEntity getOrigin() {
        return this.origin;
    }

    public final String getRepeats() {
        return this.repeats;
    }

    public final int getSubcriptionId() {
        return this.subcriptionId;
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
        int hashCode = Integer.hashCode(this.subcriptionId) * 31;
        DestinationEntity destinationEntity = this.destination;
        int d4 = a.d(this.timeCenter, a.d(this.subscriptionType, a.d(this.repeats, (this.origin.hashCode() + ((hashCode + (destinationEntity == null ? 0 : destinationEntity.hashCode())) * 31)) * 31, 31), 31), 31);
        String str = this.timeEnd;
        int hashCode2 = (d4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.timeStart;
        int c4 = w.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.active);
        String str3 = this.operator;
        int hashCode3 = (c4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.commercialProduct;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionEntity(subcriptionId=");
        sb.append(this.subcriptionId);
        sb.append(", destination=");
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
        sb.append(this.timeStart);
        sb.append(", active=");
        sb.append(this.active);
        sb.append(", operator=");
        sb.append(this.operator);
        sb.append(", commercialProduct=");
        return a.n(sb, this.commercialProduct, ')');
    }

    public /* synthetic */ SubscriptionEntity(int i, DestinationEntity destinationEntity, OriginEntity originEntity, String str, String str2, String str3, String str4, String str5, boolean z3, String str6, String str7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, destinationEntity, originEntity, str, str2, str3, str4, str5, (i4 & 256) != 0 ? true : z3, str6, str7);
    }
}
