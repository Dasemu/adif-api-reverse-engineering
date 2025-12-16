package com.adif.elcanomovil.domain.entities.circulation;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J`\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006%"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculationInfo;", "", "origin", "", FirebaseAnalytics.Param.DESTINATION, NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, "observation", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCommercialNumber", "()Ljava/lang/String;", "getCommercialProduct", "getDestination", "getLaunchingDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getObservation", "getOperator", "getOrigin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculationInfo;", "equals", "", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TrainCirculationInfo {
    private final String commercialNumber;
    private final String commercialProduct;
    private final String destination;
    private final Long launchingDate;
    private final String observation;
    private final String operator;
    private final String origin;

    public TrainCirculationInfo(String str, String str2, Long l4, String commercialNumber, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(commercialNumber, "commercialNumber");
        this.origin = str;
        this.destination = str2;
        this.launchingDate = l4;
        this.commercialNumber = commercialNumber;
        this.operator = str3;
        this.observation = str4;
        this.commercialProduct = str5;
    }

    public static /* synthetic */ TrainCirculationInfo copy$default(TrainCirculationInfo trainCirculationInfo, String str, String str2, Long l4, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trainCirculationInfo.origin;
        }
        if ((i & 2) != 0) {
            str2 = trainCirculationInfo.destination;
        }
        if ((i & 4) != 0) {
            l4 = trainCirculationInfo.launchingDate;
        }
        if ((i & 8) != 0) {
            str3 = trainCirculationInfo.commercialNumber;
        }
        if ((i & 16) != 0) {
            str4 = trainCirculationInfo.operator;
        }
        if ((i & 32) != 0) {
            str5 = trainCirculationInfo.observation;
        }
        if ((i & 64) != 0) {
            str6 = trainCirculationInfo.commercialProduct;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        Long l5 = l4;
        return trainCirculationInfo.copy(str, str2, l5, str3, str9, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDestination() {
        return this.destination;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getLaunchingDate() {
        return this.launchingDate;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCommercialNumber() {
        return this.commercialNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOperator() {
        return this.operator;
    }

    /* renamed from: component6, reason: from getter */
    public final String getObservation() {
        return this.observation;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCommercialProduct() {
        return this.commercialProduct;
    }

    public final TrainCirculationInfo copy(String origin, String destination, Long launchingDate, String commercialNumber, String operator, String observation, String commercialProduct) {
        Intrinsics.checkNotNullParameter(commercialNumber, "commercialNumber");
        return new TrainCirculationInfo(origin, destination, launchingDate, commercialNumber, operator, observation, commercialProduct);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainCirculationInfo)) {
            return false;
        }
        TrainCirculationInfo trainCirculationInfo = (TrainCirculationInfo) other;
        return Intrinsics.areEqual(this.origin, trainCirculationInfo.origin) && Intrinsics.areEqual(this.destination, trainCirculationInfo.destination) && Intrinsics.areEqual(this.launchingDate, trainCirculationInfo.launchingDate) && Intrinsics.areEqual(this.commercialNumber, trainCirculationInfo.commercialNumber) && Intrinsics.areEqual(this.operator, trainCirculationInfo.operator) && Intrinsics.areEqual(this.observation, trainCirculationInfo.observation) && Intrinsics.areEqual(this.commercialProduct, trainCirculationInfo.commercialProduct);
    }

    public final String getCommercialNumber() {
        return this.commercialNumber;
    }

    public final String getCommercialProduct() {
        return this.commercialProduct;
    }

    public final String getDestination() {
        return this.destination;
    }

    public final Long getLaunchingDate() {
        return this.launchingDate;
    }

    public final String getObservation() {
        return this.observation;
    }

    public final String getOperator() {
        return this.operator;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public int hashCode() {
        String str = this.origin;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.destination;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l4 = this.launchingDate;
        int d4 = a.d(this.commercialNumber, (hashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31, 31);
        String str3 = this.operator;
        int hashCode3 = (d4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.observation;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.commercialProduct;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TrainCirculationInfo(origin=");
        sb.append(this.origin);
        sb.append(", destination=");
        sb.append(this.destination);
        sb.append(", launchingDate=");
        sb.append(this.launchingDate);
        sb.append(", commercialNumber=");
        sb.append(this.commercialNumber);
        sb.append(", operator=");
        sb.append(this.operator);
        sb.append(", observation=");
        sb.append(this.observation);
        sb.append(", commercialProduct=");
        return a.n(sb, this.commercialProduct, ')');
    }
}
