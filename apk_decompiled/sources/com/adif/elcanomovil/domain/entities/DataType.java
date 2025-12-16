package com.adif.elcanomovil.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Parcelize
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/DataType;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "STATION", "HOME", "WORK", "NEAR", "DEPARTURES", "ARRIVALS", "INFO", "COMMERCIAL", "FAVORITE", "ROUTE", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DataType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DataType[] $VALUES;
    public static final Parcelable.Creator<DataType> CREATOR;
    public static final DataType STATION = new DataType("STATION", 0);
    public static final DataType HOME = new DataType("HOME", 1);
    public static final DataType WORK = new DataType("WORK", 2);
    public static final DataType NEAR = new DataType("NEAR", 3);
    public static final DataType DEPARTURES = new DataType("DEPARTURES", 4);
    public static final DataType ARRIVALS = new DataType("ARRIVALS", 5);
    public static final DataType INFO = new DataType("INFO", 6);
    public static final DataType COMMERCIAL = new DataType("COMMERCIAL", 7);
    public static final DataType FAVORITE = new DataType("FAVORITE", 8);
    public static final DataType ROUTE = new DataType("ROUTE", 9);

    private static final /* synthetic */ DataType[] $values() {
        return new DataType[]{STATION, HOME, WORK, NEAR, DEPARTURES, ARRIVALS, INFO, COMMERCIAL, FAVORITE, ROUTE};
    }

    static {
        DataType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        CREATOR = new Parcelable.Creator<DataType>() { // from class: com.adif.elcanomovil.domain.entities.DataType.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DataType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return DataType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DataType[] newArray(int i) {
                return new DataType[i];
            }
        };
    }

    private DataType(String str, int i) {
    }

    public static EnumEntries<DataType> getEntries() {
        return $ENTRIES;
    }

    public static DataType valueOf(String str) {
        return (DataType) Enum.valueOf(DataType.class, str);
    }

    public static DataType[] values() {
        return (DataType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(name());
    }
}
