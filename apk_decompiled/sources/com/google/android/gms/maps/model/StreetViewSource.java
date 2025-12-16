package com.google.android.gms.maps.model;

import C.w;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "StreetViewSourceCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new zzy();
    public static final StreetViewSource DEFAULT = new StreetViewSource(0);
    public static final StreetViewSource OUTDOOR = new StreetViewSource(1);
    private static final String zza = "StreetViewSource";

    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;

    @SafeParcelable.Constructor
    public StreetViewSource(@SafeParcelable.Param(id = 2) int i) {
        this.zzb = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.zzb == ((StreetViewSource) obj).zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb));
    }

    public String toString() {
        int i = this.zzb;
        return "StreetViewSource:".concat(i != 0 ? i != 1 ? w.i(i, "UNKNOWN(", ")") : "OUTDOOR" : "DEFAULT");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i4 = this.zzb;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i4);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
