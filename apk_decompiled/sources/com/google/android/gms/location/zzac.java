package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "NetworkLocationStatusCreator")
@Deprecated
/* loaded from: classes3.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzad();

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 1)
    public final int zza;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 2)
    public final int zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", id = 3)
    public final long zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", id = 4)
    public final long zzd;

    @SafeParcelable.Constructor
    public zzac(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i4, @SafeParcelable.Param(id = 3) long j4, @SafeParcelable.Param(id = 4) long j5) {
        this.zza = i;
        this.zzb = i4;
        this.zzc = j4;
        this.zzd = j5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzac) {
            zzac zzacVar = (zzac) obj;
            if (this.zza == zzacVar.zza && this.zzb == zzacVar.zzb && this.zzc == zzacVar.zzc && this.zzd == zzacVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zza), Long.valueOf(this.zzd), Long.valueOf(this.zzc));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.zza + " Cell status: " + this.zzb + " elapsed time NS: " + this.zzd + " system time ms: " + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
