package com.adif.elcanomovil.uiSubscriptions.create.views.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;

@Parcelize
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cHÖ\u0001R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0005\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006'"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/create/views/data/InfoDataJourney;", "Landroid/os/Parcelable;", "stationFrom", "", "stationTo", "isCercanias", "", "timeFrom", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "setCercanias", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getStationFrom", "()Ljava/lang/String;", "setStationFrom", "(Ljava/lang/String;)V", "getStationTo", "setStationTo", "getTimeFrom", "setTimeFrom", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/adif/elcanomovil/uiSubscriptions/create/views/data/InfoDataJourney;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InfoDataJourney implements Parcelable {
    public static final Parcelable.Creator<InfoDataJourney> CREATOR = new Creator();
    private Boolean isCercanias;
    private String stationFrom;
    private String stationTo;
    private String timeFrom;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<InfoDataJourney> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InfoDataJourney createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new InfoDataJourney(readString, readString2, valueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InfoDataJourney[] newArray(int i) {
            return new InfoDataJourney[i];
        }
    }

    public InfoDataJourney(String str, String str2, Boolean bool, String str3) {
        this.stationFrom = str;
        this.stationTo = str2;
        this.isCercanias = bool;
        this.timeFrom = str3;
    }

    public static /* synthetic */ InfoDataJourney copy$default(InfoDataJourney infoDataJourney, String str, String str2, Boolean bool, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = infoDataJourney.stationFrom;
        }
        if ((i & 2) != 0) {
            str2 = infoDataJourney.stationTo;
        }
        if ((i & 4) != 0) {
            bool = infoDataJourney.isCercanias;
        }
        if ((i & 8) != 0) {
            str3 = infoDataJourney.timeFrom;
        }
        return infoDataJourney.copy(str, str2, bool, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStationFrom() {
        return this.stationFrom;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStationTo() {
        return this.stationTo;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsCercanias() {
        return this.isCercanias;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTimeFrom() {
        return this.timeFrom;
    }

    public final InfoDataJourney copy(String stationFrom, String stationTo, Boolean isCercanias, String timeFrom) {
        return new InfoDataJourney(stationFrom, stationTo, isCercanias, timeFrom);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoDataJourney)) {
            return false;
        }
        InfoDataJourney infoDataJourney = (InfoDataJourney) other;
        return Intrinsics.areEqual(this.stationFrom, infoDataJourney.stationFrom) && Intrinsics.areEqual(this.stationTo, infoDataJourney.stationTo) && Intrinsics.areEqual(this.isCercanias, infoDataJourney.isCercanias) && Intrinsics.areEqual(this.timeFrom, infoDataJourney.timeFrom);
    }

    public final String getStationFrom() {
        return this.stationFrom;
    }

    public final String getStationTo() {
        return this.stationTo;
    }

    public final String getTimeFrom() {
        return this.timeFrom;
    }

    public int hashCode() {
        String str = this.stationFrom;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stationTo;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isCercanias;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.timeFrom;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Boolean isCercanias() {
        return this.isCercanias;
    }

    public final void setCercanias(Boolean bool) {
        this.isCercanias = bool;
    }

    public final void setStationFrom(String str) {
        this.stationFrom = str;
    }

    public final void setStationTo(String str) {
        this.stationTo = str;
    }

    public final void setTimeFrom(String str) {
        this.timeFrom = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InfoDataJourney(stationFrom=");
        sb.append(this.stationFrom);
        sb.append(", stationTo=");
        sb.append(this.stationTo);
        sb.append(", isCercanias=");
        sb.append(this.isCercanias);
        sb.append(", timeFrom=");
        return a.n(sb, this.timeFrom, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int i;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.stationFrom);
        parcel.writeString(this.stationTo);
        Boolean bool = this.isCercanias;
        if (bool == null) {
            i = 0;
        } else {
            parcel.writeInt(1);
            i = bool.booleanValue();
        }
        parcel.writeInt(i);
        parcel.writeString(this.timeFrom);
    }

    public /* synthetic */ InfoDataJourney(String str, String str2, Boolean bool, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bool, (i & 8) != 0 ? null : str3);
    }
}
