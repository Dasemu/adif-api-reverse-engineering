package com.adif.elcanomovil.domain.entities.circulation;

import C.w;
import com.google.android.gms.measurement.internal.a;
import java.util.Date;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0010HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\u007f\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00062"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathInfo;", "", "commercialOriginStationCode", "", "commercialDestinationStationCode", "accessible", "", "comercialPathKey", "Lcom/adif/elcanomovil/domain/entities/circulation/ComercialPathKey;", "isCercanias", "isShortTrain", "line", "core", "opeProComPro", "Lcom/adif/elcanomovil/domain/entities/circulation/OpeProComPro;", "timestamp", "Ljava/util/Date;", "observation", "(Ljava/lang/String;Ljava/lang/String;ZLcom/adif/elcanomovil/domain/entities/circulation/ComercialPathKey;ZZLjava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/circulation/OpeProComPro;Ljava/util/Date;Ljava/lang/String;)V", "getAccessible", "()Z", "getComercialPathKey", "()Lcom/adif/elcanomovil/domain/entities/circulation/ComercialPathKey;", "getCommercialDestinationStationCode", "()Ljava/lang/String;", "getCommercialOriginStationCode", "getCore", "getLine", "getObservation", "getOpeProComPro", "()Lcom/adif/elcanomovil/domain/entities/circulation/OpeProComPro;", "getTimestamp", "()Ljava/util/Date;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CommercialPathInfo {
    private final boolean accessible;
    private final ComercialPathKey comercialPathKey;
    private final String commercialDestinationStationCode;
    private final String commercialOriginStationCode;
    private final String core;
    private final boolean isCercanias;
    private final boolean isShortTrain;
    private final String line;
    private final String observation;
    private final OpeProComPro opeProComPro;
    private final Date timestamp;

    public CommercialPathInfo(String str, String str2, boolean z3, ComercialPathKey comercialPathKey, boolean z4, boolean z5, String line, String str3, OpeProComPro opeProComPro, Date timestamp, String str4) {
        Intrinsics.checkNotNullParameter(comercialPathKey, "comercialPathKey");
        Intrinsics.checkNotNullParameter(line, "line");
        Intrinsics.checkNotNullParameter(opeProComPro, "opeProComPro");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.commercialOriginStationCode = str;
        this.commercialDestinationStationCode = str2;
        this.accessible = z3;
        this.comercialPathKey = comercialPathKey;
        this.isCercanias = z4;
        this.isShortTrain = z5;
        this.line = line;
        this.core = str3;
        this.opeProComPro = opeProComPro;
        this.timestamp = timestamp;
        this.observation = str4;
    }

    public static /* synthetic */ CommercialPathInfo copy$default(CommercialPathInfo commercialPathInfo, String str, String str2, boolean z3, ComercialPathKey comercialPathKey, boolean z4, boolean z5, String str3, String str4, OpeProComPro opeProComPro, Date date, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commercialPathInfo.commercialOriginStationCode;
        }
        if ((i & 2) != 0) {
            str2 = commercialPathInfo.commercialDestinationStationCode;
        }
        if ((i & 4) != 0) {
            z3 = commercialPathInfo.accessible;
        }
        if ((i & 8) != 0) {
            comercialPathKey = commercialPathInfo.comercialPathKey;
        }
        if ((i & 16) != 0) {
            z4 = commercialPathInfo.isCercanias;
        }
        if ((i & 32) != 0) {
            z5 = commercialPathInfo.isShortTrain;
        }
        if ((i & 64) != 0) {
            str3 = commercialPathInfo.line;
        }
        if ((i & 128) != 0) {
            str4 = commercialPathInfo.core;
        }
        if ((i & 256) != 0) {
            opeProComPro = commercialPathInfo.opeProComPro;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            date = commercialPathInfo.timestamp;
        }
        if ((i & 1024) != 0) {
            str5 = commercialPathInfo.observation;
        }
        Date date2 = date;
        String str6 = str5;
        String str7 = str4;
        OpeProComPro opeProComPro2 = opeProComPro;
        boolean z6 = z5;
        String str8 = str3;
        boolean z7 = z4;
        boolean z8 = z3;
        return commercialPathInfo.copy(str, str2, z8, comercialPathKey, z7, z6, str8, str7, opeProComPro2, date2, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCommercialOriginStationCode() {
        return this.commercialOriginStationCode;
    }

    /* renamed from: component10, reason: from getter */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component11, reason: from getter */
    public final String getObservation() {
        return this.observation;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCommercialDestinationStationCode() {
        return this.commercialDestinationStationCode;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAccessible() {
        return this.accessible;
    }

    /* renamed from: component4, reason: from getter */
    public final ComercialPathKey getComercialPathKey() {
        return this.comercialPathKey;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsCercanias() {
        return this.isCercanias;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsShortTrain() {
        return this.isShortTrain;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLine() {
        return this.line;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCore() {
        return this.core;
    }

    /* renamed from: component9, reason: from getter */
    public final OpeProComPro getOpeProComPro() {
        return this.opeProComPro;
    }

    public final CommercialPathInfo copy(String commercialOriginStationCode, String commercialDestinationStationCode, boolean accessible, ComercialPathKey comercialPathKey, boolean isCercanias, boolean isShortTrain, String line, String core, OpeProComPro opeProComPro, Date timestamp, String observation) {
        Intrinsics.checkNotNullParameter(comercialPathKey, "comercialPathKey");
        Intrinsics.checkNotNullParameter(line, "line");
        Intrinsics.checkNotNullParameter(opeProComPro, "opeProComPro");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return new CommercialPathInfo(commercialOriginStationCode, commercialDestinationStationCode, accessible, comercialPathKey, isCercanias, isShortTrain, line, core, opeProComPro, timestamp, observation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommercialPathInfo)) {
            return false;
        }
        CommercialPathInfo commercialPathInfo = (CommercialPathInfo) other;
        return Intrinsics.areEqual(this.commercialOriginStationCode, commercialPathInfo.commercialOriginStationCode) && Intrinsics.areEqual(this.commercialDestinationStationCode, commercialPathInfo.commercialDestinationStationCode) && this.accessible == commercialPathInfo.accessible && Intrinsics.areEqual(this.comercialPathKey, commercialPathInfo.comercialPathKey) && this.isCercanias == commercialPathInfo.isCercanias && this.isShortTrain == commercialPathInfo.isShortTrain && Intrinsics.areEqual(this.line, commercialPathInfo.line) && Intrinsics.areEqual(this.core, commercialPathInfo.core) && Intrinsics.areEqual(this.opeProComPro, commercialPathInfo.opeProComPro) && Intrinsics.areEqual(this.timestamp, commercialPathInfo.timestamp) && Intrinsics.areEqual(this.observation, commercialPathInfo.observation);
    }

    public final boolean getAccessible() {
        return this.accessible;
    }

    public final ComercialPathKey getComercialPathKey() {
        return this.comercialPathKey;
    }

    public final String getCommercialDestinationStationCode() {
        return this.commercialDestinationStationCode;
    }

    public final String getCommercialOriginStationCode() {
        return this.commercialOriginStationCode;
    }

    public final String getCore() {
        return this.core;
    }

    public final String getLine() {
        return this.line;
    }

    public final String getObservation() {
        return this.observation;
    }

    public final OpeProComPro getOpeProComPro() {
        return this.opeProComPro;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.commercialOriginStationCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.commercialDestinationStationCode;
        int d4 = a.d(this.line, w.c(w.c((this.comercialPathKey.hashCode() + w.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.accessible)) * 31, 31, this.isCercanias), 31, this.isShortTrain), 31);
        String str3 = this.core;
        int hashCode2 = (this.timestamp.hashCode() + ((this.opeProComPro.hashCode() + ((d4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31;
        String str4 = this.observation;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isCercanias() {
        return this.isCercanias;
    }

    public final boolean isShortTrain() {
        return this.isShortTrain;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CommercialPathInfo(commercialOriginStationCode=");
        sb.append(this.commercialOriginStationCode);
        sb.append(", commercialDestinationStationCode=");
        sb.append(this.commercialDestinationStationCode);
        sb.append(", accessible=");
        sb.append(this.accessible);
        sb.append(", comercialPathKey=");
        sb.append(this.comercialPathKey);
        sb.append(", isCercanias=");
        sb.append(this.isCercanias);
        sb.append(", isShortTrain=");
        sb.append(this.isShortTrain);
        sb.append(", line=");
        sb.append(this.line);
        sb.append(", core=");
        sb.append(this.core);
        sb.append(", opeProComPro=");
        sb.append(this.opeProComPro);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", observation=");
        return a.n(sb, this.observation, ')');
    }
}
