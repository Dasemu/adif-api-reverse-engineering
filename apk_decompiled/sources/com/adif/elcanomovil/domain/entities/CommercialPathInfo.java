package com.adif.elcanomovil.domain.entities;

import C.w;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.internal.a;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014¨\u0006)"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/CommercialPathInfo;", "", "timestamp", "Ljava/util/Date;", "line", "", NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC, "accessible", "", "isShortTrain", "comercialPathKey", "Lcom/adif/elcanomovil/domain/entities/ComercialPathKey;", "opeProComPro", "Lcom/adif/elcanomovil/domain/entities/OpeProComPro;", "(Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;ZZLcom/adif/elcanomovil/domain/entities/ComercialPathKey;Lcom/adif/elcanomovil/domain/entities/OpeProComPro;)V", "getAccessible", "()Z", "getComercialPathKey", "()Lcom/adif/elcanomovil/domain/entities/ComercialPathKey;", "getLine", "()Ljava/lang/String;", "setLine", "(Ljava/lang/String;)V", "getOpeProComPro", "()Lcom/adif/elcanomovil/domain/entities/OpeProComPro;", "getTimestamp", "()Ljava/util/Date;", "getTrafficType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CommercialPathInfo {
    private final boolean accessible;
    private final ComercialPathKey comercialPathKey;
    private final boolean isShortTrain;
    private String line;
    private final OpeProComPro opeProComPro;
    private final Date timestamp;
    private final String trafficType;

    public CommercialPathInfo(Date timestamp, String line, String trafficType, boolean z3, boolean z4, ComercialPathKey comercialPathKey, OpeProComPro opeProComPro) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(line, "line");
        Intrinsics.checkNotNullParameter(trafficType, "trafficType");
        Intrinsics.checkNotNullParameter(comercialPathKey, "comercialPathKey");
        Intrinsics.checkNotNullParameter(opeProComPro, "opeProComPro");
        this.timestamp = timestamp;
        this.line = line;
        this.trafficType = trafficType;
        this.accessible = z3;
        this.isShortTrain = z4;
        this.comercialPathKey = comercialPathKey;
        this.opeProComPro = opeProComPro;
    }

    public static /* synthetic */ CommercialPathInfo copy$default(CommercialPathInfo commercialPathInfo, Date date, String str, String str2, boolean z3, boolean z4, ComercialPathKey comercialPathKey, OpeProComPro opeProComPro, int i, Object obj) {
        if ((i & 1) != 0) {
            date = commercialPathInfo.timestamp;
        }
        if ((i & 2) != 0) {
            str = commercialPathInfo.line;
        }
        if ((i & 4) != 0) {
            str2 = commercialPathInfo.trafficType;
        }
        if ((i & 8) != 0) {
            z3 = commercialPathInfo.accessible;
        }
        if ((i & 16) != 0) {
            z4 = commercialPathInfo.isShortTrain;
        }
        if ((i & 32) != 0) {
            comercialPathKey = commercialPathInfo.comercialPathKey;
        }
        if ((i & 64) != 0) {
            opeProComPro = commercialPathInfo.opeProComPro;
        }
        ComercialPathKey comercialPathKey2 = comercialPathKey;
        OpeProComPro opeProComPro2 = opeProComPro;
        boolean z5 = z4;
        String str3 = str2;
        return commercialPathInfo.copy(date, str, str3, z3, z5, comercialPathKey2, opeProComPro2);
    }

    /* renamed from: component1, reason: from getter */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLine() {
        return this.line;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTrafficType() {
        return this.trafficType;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAccessible() {
        return this.accessible;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsShortTrain() {
        return this.isShortTrain;
    }

    /* renamed from: component6, reason: from getter */
    public final ComercialPathKey getComercialPathKey() {
        return this.comercialPathKey;
    }

    /* renamed from: component7, reason: from getter */
    public final OpeProComPro getOpeProComPro() {
        return this.opeProComPro;
    }

    public final CommercialPathInfo copy(Date timestamp, String line, String trafficType, boolean accessible, boolean isShortTrain, ComercialPathKey comercialPathKey, OpeProComPro opeProComPro) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(line, "line");
        Intrinsics.checkNotNullParameter(trafficType, "trafficType");
        Intrinsics.checkNotNullParameter(comercialPathKey, "comercialPathKey");
        Intrinsics.checkNotNullParameter(opeProComPro, "opeProComPro");
        return new CommercialPathInfo(timestamp, line, trafficType, accessible, isShortTrain, comercialPathKey, opeProComPro);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommercialPathInfo)) {
            return false;
        }
        CommercialPathInfo commercialPathInfo = (CommercialPathInfo) other;
        return Intrinsics.areEqual(this.timestamp, commercialPathInfo.timestamp) && Intrinsics.areEqual(this.line, commercialPathInfo.line) && Intrinsics.areEqual(this.trafficType, commercialPathInfo.trafficType) && this.accessible == commercialPathInfo.accessible && this.isShortTrain == commercialPathInfo.isShortTrain && Intrinsics.areEqual(this.comercialPathKey, commercialPathInfo.comercialPathKey) && Intrinsics.areEqual(this.opeProComPro, commercialPathInfo.opeProComPro);
    }

    public final boolean getAccessible() {
        return this.accessible;
    }

    public final ComercialPathKey getComercialPathKey() {
        return this.comercialPathKey;
    }

    public final String getLine() {
        return this.line;
    }

    public final OpeProComPro getOpeProComPro() {
        return this.opeProComPro;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public final String getTrafficType() {
        return this.trafficType;
    }

    public int hashCode() {
        return this.opeProComPro.hashCode() + ((this.comercialPathKey.hashCode() + w.c(w.c(a.d(this.trafficType, a.d(this.line, this.timestamp.hashCode() * 31, 31), 31), 31, this.accessible), 31, this.isShortTrain)) * 31);
    }

    public final boolean isShortTrain() {
        return this.isShortTrain;
    }

    public final void setLine(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.line = str;
    }

    public String toString() {
        return "CommercialPathInfo(timestamp=" + this.timestamp + ", line=" + this.line + ", trafficType=" + this.trafficType + ", accessible=" + this.accessible + ", isShortTrain=" + this.isShortTrain + ", comercialPathKey=" + this.comercialPathKey + ", opeProComPro=" + this.opeProComPro + ')';
    }
}
