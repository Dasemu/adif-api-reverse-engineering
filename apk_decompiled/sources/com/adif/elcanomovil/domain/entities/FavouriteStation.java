package com.adif.elcanomovil.domain.entities;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0012J^\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\n\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006$"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/FavouriteStation;", "", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "", "identifierStation", "", "stationName", "identifierToStation", "stationToName", "type", "isCercanias", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()I", "getIdentifierStation", "()Ljava/lang/String;", "getIdentifierToStation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStationName", "getStationToName", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/adif/elcanomovil/domain/entities/FavouriteStation;", "equals", "other", "hashCode", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FavouriteStation {
    private final int id;
    private final String identifierStation;
    private final String identifierToStation;
    private final Boolean isCercanias;
    private final String stationName;
    private final String stationToName;
    private final String type;

    public FavouriteStation(int i, String str, String str2, String str3, String str4, String type, Boolean bool) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = i;
        this.identifierStation = str;
        this.stationName = str2;
        this.identifierToStation = str3;
        this.stationToName = str4;
        this.type = type;
        this.isCercanias = bool;
    }

    public static /* synthetic */ FavouriteStation copy$default(FavouriteStation favouriteStation, int i, String str, String str2, String str3, String str4, String str5, Boolean bool, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = favouriteStation.id;
        }
        if ((i4 & 2) != 0) {
            str = favouriteStation.identifierStation;
        }
        if ((i4 & 4) != 0) {
            str2 = favouriteStation.stationName;
        }
        if ((i4 & 8) != 0) {
            str3 = favouriteStation.identifierToStation;
        }
        if ((i4 & 16) != 0) {
            str4 = favouriteStation.stationToName;
        }
        if ((i4 & 32) != 0) {
            str5 = favouriteStation.type;
        }
        if ((i4 & 64) != 0) {
            bool = favouriteStation.isCercanias;
        }
        String str6 = str5;
        Boolean bool2 = bool;
        String str7 = str4;
        String str8 = str2;
        return favouriteStation.copy(i, str, str8, str3, str7, str6, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIdentifierStation() {
        return this.identifierStation;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStationName() {
        return this.stationName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIdentifierToStation() {
        return this.identifierToStation;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStationToName() {
        return this.stationToName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getIsCercanias() {
        return this.isCercanias;
    }

    public final FavouriteStation copy(int id, String identifierStation, String stationName, String identifierToStation, String stationToName, String type, Boolean isCercanias) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new FavouriteStation(id, identifierStation, stationName, identifierToStation, stationToName, type, isCercanias);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavouriteStation)) {
            return false;
        }
        FavouriteStation favouriteStation = (FavouriteStation) other;
        return this.id == favouriteStation.id && Intrinsics.areEqual(this.identifierStation, favouriteStation.identifierStation) && Intrinsics.areEqual(this.stationName, favouriteStation.stationName) && Intrinsics.areEqual(this.identifierToStation, favouriteStation.identifierToStation) && Intrinsics.areEqual(this.stationToName, favouriteStation.stationToName) && Intrinsics.areEqual(this.type, favouriteStation.type) && Intrinsics.areEqual(this.isCercanias, favouriteStation.isCercanias);
    }

    public final int getId() {
        return this.id;
    }

    public final String getIdentifierStation() {
        return this.identifierStation;
    }

    public final String getIdentifierToStation() {
        return this.identifierToStation;
    }

    public final String getStationName() {
        return this.stationName;
    }

    public final String getStationToName() {
        return this.stationToName;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.identifierStation;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.stationName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.identifierToStation;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.stationToName;
        int d4 = a.d(this.type, (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        Boolean bool = this.isCercanias;
        return d4 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isCercanias() {
        return this.isCercanias;
    }

    public String toString() {
        return "FavouriteStation(id=" + this.id + ", identifierStation=" + this.identifierStation + ", stationName=" + this.stationName + ", identifierToStation=" + this.identifierToStation + ", stationToName=" + this.stationToName + ", type=" + this.type + ", isCercanias=" + this.isCercanias + ')';
    }
}
