package com.adif.elcanomovil.domain.entities.subscription;

import C.w;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003Ja\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006*"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/subscription/Destination;", "", "commercialZone", "", "customerService", "", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "latlong", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "observation", "shortName", NavArguments.ARG_DYNAMIC_LINKS_STATION_TRAFFIC, "(Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCommercialZone", "()Ljava/lang/String;", "getCustomerService", "()I", "getId", "setId", "(I)V", "getLatlong", "()Ljava/util/List;", "getName", "getObservation", "getShortName", "getTrafficType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Destination {
    private final String commercialZone;
    private final int customerService;
    private int id;
    private final List<Double> latlong;
    private final String name;
    private final String observation;
    private final String shortName;
    private final String trafficType;

    public Destination(String commercialZone, int i, int i4, List<Double> latlong, String name, String str, String shortName, String trafficType) {
        Intrinsics.checkNotNullParameter(commercialZone, "commercialZone");
        Intrinsics.checkNotNullParameter(latlong, "latlong");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        Intrinsics.checkNotNullParameter(trafficType, "trafficType");
        this.commercialZone = commercialZone;
        this.customerService = i;
        this.id = i4;
        this.latlong = latlong;
        this.name = name;
        this.observation = str;
        this.shortName = shortName;
        this.trafficType = trafficType;
    }

    public static /* synthetic */ Destination copy$default(Destination destination, String str, int i, int i4, List list, String str2, String str3, String str4, String str5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = destination.commercialZone;
        }
        if ((i5 & 2) != 0) {
            i = destination.customerService;
        }
        if ((i5 & 4) != 0) {
            i4 = destination.id;
        }
        if ((i5 & 8) != 0) {
            list = destination.latlong;
        }
        if ((i5 & 16) != 0) {
            str2 = destination.name;
        }
        if ((i5 & 32) != 0) {
            str3 = destination.observation;
        }
        if ((i5 & 64) != 0) {
            str4 = destination.shortName;
        }
        if ((i5 & 128) != 0) {
            str5 = destination.trafficType;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        return destination.copy(str, i, i4, list, str8, str9, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCommercialZone() {
        return this.commercialZone;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCustomerService() {
        return this.customerService;
    }

    /* renamed from: component3, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final List<Double> component4() {
        return this.latlong;
    }

    /* renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component6, reason: from getter */
    public final String getObservation() {
        return this.observation;
    }

    /* renamed from: component7, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTrafficType() {
        return this.trafficType;
    }

    public final Destination copy(String commercialZone, int customerService, int id, List<Double> latlong, String name, String observation, String shortName, String trafficType) {
        Intrinsics.checkNotNullParameter(commercialZone, "commercialZone");
        Intrinsics.checkNotNullParameter(latlong, "latlong");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        Intrinsics.checkNotNullParameter(trafficType, "trafficType");
        return new Destination(commercialZone, customerService, id, latlong, name, observation, shortName, trafficType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Destination)) {
            return false;
        }
        Destination destination = (Destination) other;
        return Intrinsics.areEqual(this.commercialZone, destination.commercialZone) && this.customerService == destination.customerService && this.id == destination.id && Intrinsics.areEqual(this.latlong, destination.latlong) && Intrinsics.areEqual(this.name, destination.name) && Intrinsics.areEqual(this.observation, destination.observation) && Intrinsics.areEqual(this.shortName, destination.shortName) && Intrinsics.areEqual(this.trafficType, destination.trafficType);
    }

    public final String getCommercialZone() {
        return this.commercialZone;
    }

    public final int getCustomerService() {
        return this.customerService;
    }

    public final int getId() {
        return this.id;
    }

    public final List<Double> getLatlong() {
        return this.latlong;
    }

    public final String getName() {
        return this.name;
    }

    public final String getObservation() {
        return this.observation;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final String getTrafficType() {
        return this.trafficType;
    }

    public int hashCode() {
        int d4 = a.d(this.name, (this.latlong.hashCode() + w.x(this.id, w.x(this.customerService, this.commercialZone.hashCode() * 31, 31), 31)) * 31, 31);
        String str = this.observation;
        return this.trafficType.hashCode() + a.d(this.shortName, (d4 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final void setId(int i) {
        this.id = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Destination(commercialZone=");
        sb.append(this.commercialZone);
        sb.append(", customerService=");
        sb.append(this.customerService);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", latlong=");
        sb.append(this.latlong);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", observation=");
        sb.append(this.observation);
        sb.append(", shortName=");
        sb.append(this.shortName);
        sb.append(", trafficType=");
        return a.n(sb, this.trafficType, ')');
    }
}
