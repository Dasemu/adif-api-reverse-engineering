package com.adif.elcanomovil.serviceStorage.model.subscriptions;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/SubscriptionAuxEntity;", "", "subcriptionAuxId", "", "subscriptionType", "", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCommercialProduct", "()Ljava/lang/String;", "getOperator", "getSubcriptionAuxId", "()I", "getSubscriptionType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionAuxEntity {
    private final String commercialProduct;
    private final String operator;
    private final int subcriptionAuxId;
    private final String subscriptionType;

    public SubscriptionAuxEntity(int i, String subscriptionType, String str, String str2) {
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        this.subcriptionAuxId = i;
        this.subscriptionType = subscriptionType;
        this.operator = str;
        this.commercialProduct = str2;
    }

    public static /* synthetic */ SubscriptionAuxEntity copy$default(SubscriptionAuxEntity subscriptionAuxEntity, int i, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = subscriptionAuxEntity.subcriptionAuxId;
        }
        if ((i4 & 2) != 0) {
            str = subscriptionAuxEntity.subscriptionType;
        }
        if ((i4 & 4) != 0) {
            str2 = subscriptionAuxEntity.operator;
        }
        if ((i4 & 8) != 0) {
            str3 = subscriptionAuxEntity.commercialProduct;
        }
        return subscriptionAuxEntity.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSubcriptionAuxId() {
        return this.subcriptionAuxId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubscriptionType() {
        return this.subscriptionType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOperator() {
        return this.operator;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCommercialProduct() {
        return this.commercialProduct;
    }

    public final SubscriptionAuxEntity copy(int subcriptionAuxId, String subscriptionType, String operator, String commercialProduct) {
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        return new SubscriptionAuxEntity(subcriptionAuxId, subscriptionType, operator, commercialProduct);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionAuxEntity)) {
            return false;
        }
        SubscriptionAuxEntity subscriptionAuxEntity = (SubscriptionAuxEntity) other;
        return this.subcriptionAuxId == subscriptionAuxEntity.subcriptionAuxId && Intrinsics.areEqual(this.subscriptionType, subscriptionAuxEntity.subscriptionType) && Intrinsics.areEqual(this.operator, subscriptionAuxEntity.operator) && Intrinsics.areEqual(this.commercialProduct, subscriptionAuxEntity.commercialProduct);
    }

    public final String getCommercialProduct() {
        return this.commercialProduct;
    }

    public final String getOperator() {
        return this.operator;
    }

    public final int getSubcriptionAuxId() {
        return this.subcriptionAuxId;
    }

    public final String getSubscriptionType() {
        return this.subscriptionType;
    }

    public int hashCode() {
        int d4 = a.d(this.subscriptionType, Integer.hashCode(this.subcriptionAuxId) * 31, 31);
        String str = this.operator;
        int hashCode = (d4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.commercialProduct;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionAuxEntity(subcriptionAuxId=");
        sb.append(this.subcriptionAuxId);
        sb.append(", subscriptionType=");
        sb.append(this.subscriptionType);
        sb.append(", operator=");
        sb.append(this.operator);
        sb.append(", commercialProduct=");
        return a.n(sb, this.commercialProduct, ')');
    }

    public /* synthetic */ SubscriptionAuxEntity(int i, String str, String str2, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, str, str2, str3);
    }
}
