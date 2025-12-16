package com.adif.elcanomovil.domain.entities.subscription;

import C.w;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0014J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0011HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010>\u001a\u00020\u000fHÆ\u0003J\u008b\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010@\u001a\u00020\u000f2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u0003HÖ\u0001J\t\u0010C\u001a\u00020\tHÖ\u0001R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006D"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;", "", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "", FirebaseAnalytics.Param.DESTINATION, "Lcom/adif/elcanomovil/domain/entities/subscription/Destination;", "origin", "Lcom/adif/elcanomovil/domain/entities/subscription/Origin;", "repeats", "", "subscriptionType", "timeCenter", "timeEnd", "timeStart", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "typeSubscription", "Lcom/adif/elcanomovil/domain/entities/subscription/SubscriptionType;", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "(ILcom/adif/elcanomovil/domain/entities/subscription/Destination;Lcom/adif/elcanomovil/domain/entities/subscription/Origin;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/adif/elcanomovil/domain/entities/subscription/SubscriptionType;Ljava/lang/String;Ljava/lang/String;)V", "getActive", "()Z", "setActive", "(Z)V", "getCommercialProduct", "()Ljava/lang/String;", "setCommercialProduct", "(Ljava/lang/String;)V", "getDestination", "()Lcom/adif/elcanomovil/domain/entities/subscription/Destination;", "getId", "()I", "getOperator", "setOperator", "getOrigin", "()Lcom/adif/elcanomovil/domain/entities/subscription/Origin;", "getRepeats", "setRepeats", "getSubscriptionType", "setSubscriptionType", "getTimeCenter", "setTimeCenter", "getTimeEnd", "setTimeEnd", "getTimeStart", "setTimeStart", "getTypeSubscription", "()Lcom/adif/elcanomovil/domain/entities/subscription/SubscriptionType;", "setTypeSubscription", "(Lcom/adif/elcanomovil/domain/entities/subscription/SubscriptionType;)V", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Subscription {
    private boolean active;
    private String commercialProduct;
    private final Destination destination;
    private final int id;
    private String operator;
    private final Origin origin;
    private String repeats;
    private String subscriptionType;
    private String timeCenter;
    private String timeEnd;
    private String timeStart;
    private SubscriptionType typeSubscription;

    public Subscription(int i, Destination destination, Origin origin, String repeats, String subscriptionType, String timeCenter, String str, String str2, boolean z3, SubscriptionType typeSubscription, String str3, String str4) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(repeats, "repeats");
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        Intrinsics.checkNotNullParameter(timeCenter, "timeCenter");
        Intrinsics.checkNotNullParameter(typeSubscription, "typeSubscription");
        this.id = i;
        this.destination = destination;
        this.origin = origin;
        this.repeats = repeats;
        this.subscriptionType = subscriptionType;
        this.timeCenter = timeCenter;
        this.timeEnd = str;
        this.timeStart = str2;
        this.active = z3;
        this.typeSubscription = typeSubscription;
        this.operator = str3;
        this.commercialProduct = str4;
    }

    public static /* synthetic */ Subscription copy$default(Subscription subscription, int i, Destination destination, Origin origin, String str, String str2, String str3, String str4, String str5, boolean z3, SubscriptionType subscriptionType, String str6, String str7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = subscription.id;
        }
        if ((i4 & 2) != 0) {
            destination = subscription.destination;
        }
        if ((i4 & 4) != 0) {
            origin = subscription.origin;
        }
        if ((i4 & 8) != 0) {
            str = subscription.repeats;
        }
        if ((i4 & 16) != 0) {
            str2 = subscription.subscriptionType;
        }
        if ((i4 & 32) != 0) {
            str3 = subscription.timeCenter;
        }
        if ((i4 & 64) != 0) {
            str4 = subscription.timeEnd;
        }
        if ((i4 & 128) != 0) {
            str5 = subscription.timeStart;
        }
        if ((i4 & 256) != 0) {
            z3 = subscription.active;
        }
        if ((i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            subscriptionType = subscription.typeSubscription;
        }
        if ((i4 & 1024) != 0) {
            str6 = subscription.operator;
        }
        if ((i4 & 2048) != 0) {
            str7 = subscription.commercialProduct;
        }
        String str8 = str6;
        String str9 = str7;
        boolean z4 = z3;
        SubscriptionType subscriptionType2 = subscriptionType;
        String str10 = str4;
        String str11 = str5;
        String str12 = str2;
        String str13 = str3;
        return subscription.copy(i, destination, origin, str, str12, str13, str10, str11, z4, subscriptionType2, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final SubscriptionType getTypeSubscription() {
        return this.typeSubscription;
    }

    /* renamed from: component11, reason: from getter */
    public final String getOperator() {
        return this.operator;
    }

    /* renamed from: component12, reason: from getter */
    public final String getCommercialProduct() {
        return this.commercialProduct;
    }

    /* renamed from: component2, reason: from getter */
    public final Destination getDestination() {
        return this.destination;
    }

    /* renamed from: component3, reason: from getter */
    public final Origin getOrigin() {
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

    public final Subscription copy(int id, Destination destination, Origin origin, String repeats, String subscriptionType, String timeCenter, String timeEnd, String timeStart, boolean active, SubscriptionType typeSubscription, String operator, String commercialProduct) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(repeats, "repeats");
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        Intrinsics.checkNotNullParameter(timeCenter, "timeCenter");
        Intrinsics.checkNotNullParameter(typeSubscription, "typeSubscription");
        return new Subscription(id, destination, origin, repeats, subscriptionType, timeCenter, timeEnd, timeStart, active, typeSubscription, operator, commercialProduct);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) other;
        return this.id == subscription.id && Intrinsics.areEqual(this.destination, subscription.destination) && Intrinsics.areEqual(this.origin, subscription.origin) && Intrinsics.areEqual(this.repeats, subscription.repeats) && Intrinsics.areEqual(this.subscriptionType, subscription.subscriptionType) && Intrinsics.areEqual(this.timeCenter, subscription.timeCenter) && Intrinsics.areEqual(this.timeEnd, subscription.timeEnd) && Intrinsics.areEqual(this.timeStart, subscription.timeStart) && this.active == subscription.active && this.typeSubscription == subscription.typeSubscription && Intrinsics.areEqual(this.operator, subscription.operator) && Intrinsics.areEqual(this.commercialProduct, subscription.commercialProduct);
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getCommercialProduct() {
        return this.commercialProduct;
    }

    public final Destination getDestination() {
        return this.destination;
    }

    public final int getId() {
        return this.id;
    }

    public final String getOperator() {
        return this.operator;
    }

    public final Origin getOrigin() {
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

    public final SubscriptionType getTypeSubscription() {
        return this.typeSubscription;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Destination destination = this.destination;
        int d4 = a.d(this.timeCenter, a.d(this.subscriptionType, a.d(this.repeats, (this.origin.hashCode() + ((hashCode + (destination == null ? 0 : destination.hashCode())) * 31)) * 31, 31), 31), 31);
        String str = this.timeEnd;
        int hashCode2 = (d4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.timeStart;
        int hashCode3 = (this.typeSubscription.hashCode() + w.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.active)) * 31;
        String str3 = this.operator;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.commercialProduct;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setActive(boolean z3) {
        this.active = z3;
    }

    public final void setCommercialProduct(String str) {
        this.commercialProduct = str;
    }

    public final void setOperator(String str) {
        this.operator = str;
    }

    public final void setRepeats(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.repeats = str;
    }

    public final void setSubscriptionType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriptionType = str;
    }

    public final void setTimeCenter(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timeCenter = str;
    }

    public final void setTimeEnd(String str) {
        this.timeEnd = str;
    }

    public final void setTimeStart(String str) {
        this.timeStart = str;
    }

    public final void setTypeSubscription(SubscriptionType subscriptionType) {
        Intrinsics.checkNotNullParameter(subscriptionType, "<set-?>");
        this.typeSubscription = subscriptionType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Subscription(id=");
        sb.append(this.id);
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
        sb.append(", typeSubscription=");
        sb.append(this.typeSubscription);
        sb.append(", operator=");
        sb.append(this.operator);
        sb.append(", commercialProduct=");
        return a.n(sb, this.commercialProduct, ')');
    }

    public /* synthetic */ Subscription(int i, Destination destination, Origin origin, String str, String str2, String str3, String str4, String str5, boolean z3, SubscriptionType subscriptionType, String str6, String str7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, destination, origin, str, str2, str3, str4, str5, (i4 & 256) != 0 ? true : z3, (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? SubscriptionType.JOURNEY : subscriptionType, str6, str7);
    }
}
