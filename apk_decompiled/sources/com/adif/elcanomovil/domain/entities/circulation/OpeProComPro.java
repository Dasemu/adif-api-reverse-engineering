package com.adif.elcanomovil.domain.entities.circulation;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/OpeProComPro;", "", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "(Ljava/lang/String;Ljava/lang/String;)V", "getCommercialProduct", "()Ljava/lang/String;", "getOperator", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OpeProComPro {
    private final String commercialProduct;
    private final String operator;

    public OpeProComPro(String operator, String commercialProduct) {
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(commercialProduct, "commercialProduct");
        this.operator = operator;
        this.commercialProduct = commercialProduct;
    }

    public static /* synthetic */ OpeProComPro copy$default(OpeProComPro opeProComPro, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = opeProComPro.operator;
        }
        if ((i & 2) != 0) {
            str2 = opeProComPro.commercialProduct;
        }
        return opeProComPro.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOperator() {
        return this.operator;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCommercialProduct() {
        return this.commercialProduct;
    }

    public final OpeProComPro copy(String operator, String commercialProduct) {
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(commercialProduct, "commercialProduct");
        return new OpeProComPro(operator, commercialProduct);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpeProComPro)) {
            return false;
        }
        OpeProComPro opeProComPro = (OpeProComPro) other;
        return Intrinsics.areEqual(this.operator, opeProComPro.operator) && Intrinsics.areEqual(this.commercialProduct, opeProComPro.commercialProduct);
    }

    public final String getCommercialProduct() {
        return this.commercialProduct;
    }

    public final String getOperator() {
        return this.operator;
    }

    public int hashCode() {
        return this.commercialProduct.hashCode() + (this.operator.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OpeProComPro(operator=");
        sb.append(this.operator);
        sb.append(", commercialProduct=");
        return a.n(sb, this.commercialProduct, ')');
    }
}
