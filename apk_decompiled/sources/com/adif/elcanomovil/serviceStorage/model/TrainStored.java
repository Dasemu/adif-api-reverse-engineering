package com.adif.elcanomovil.serviceStorage.model;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001BI\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\n\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e\u0082\u0001\u0001\u0017¨\u0006\u0018"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/model/TrainStored;", "", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "date", "", NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "observation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V", "getCommercialNumber", "()Ljava/lang/String;", "getCommercialProduct", "getDate", "()J", "getDestinationStationCode", "getLaunchingDate", "getObservation", "getOperator", "getOriginStationCode", "Lcom/adif/elcanomovil/serviceStorage/model/TrainStoredEntity;", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class TrainStored {
    private final String commercialNumber;
    private final String commercialProduct;
    private final long date;
    private final String destinationStationCode;
    private final long launchingDate;
    private final String observation;
    private final String operator;
    private final String originStationCode;

    public /* synthetic */ TrainStored(String str, String str2, String str3, String str4, String str5, long j4, long j5, String str6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, j4, j5, str6);
    }

    public String getCommercialNumber() {
        return this.commercialNumber;
    }

    public String getCommercialProduct() {
        return this.commercialProduct;
    }

    public long getDate() {
        return this.date;
    }

    public String getDestinationStationCode() {
        return this.destinationStationCode;
    }

    public long getLaunchingDate() {
        return this.launchingDate;
    }

    public String getObservation() {
        return this.observation;
    }

    public String getOperator() {
        return this.operator;
    }

    public String getOriginStationCode() {
        return this.originStationCode;
    }

    private TrainStored(String str, String str2, String str3, String str4, String str5, long j4, long j5, String str6) {
        this.operator = str;
        this.commercialProduct = str2;
        this.commercialNumber = str3;
        this.originStationCode = str4;
        this.destinationStationCode = str5;
        this.date = j4;
        this.launchingDate = j5;
        this.observation = str6;
    }
}
