package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LocationRequestUpdateDataCreator")
@SafeParcelable.Reserved({1000})
@Deprecated
/* loaded from: classes3.dex */
public final class zzdf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdf> CREATOR = new zzdg();

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestUpdateData.OPERATION_ADD", getter = "getOperation", id = 1)
    private final int zza;

    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getLocationRequest", id = 2)
    private final zzdd zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getLocationListenerAsBinder", id = 3, type = "android.os.IBinder")
    private final com.google.android.gms.location.zzu zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getLocationCallbackAsBinder", id = 5, type = "android.os.IBinder")
    private final com.google.android.gms.location.zzr zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getPendingIntent", id = 4)
    private final PendingIntent zze;

    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getFusedLocationProviderCallbackAsBinder", id = 6, type = "android.os.IBinder")
    private final zzk zzf;

    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getListenerId", id = 8)
    private final String zzg;

    @SafeParcelable.Constructor
    public zzdf(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) zzdd zzddVar, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 5) IBinder iBinder2, @SafeParcelable.Param(id = 4) PendingIntent pendingIntent, @SafeParcelable.Param(id = 6) IBinder iBinder3, @SafeParcelable.Param(id = 8) String str) {
        this.zza = i;
        this.zzb = zzddVar;
        zzk zzkVar = null;
        this.zzc = iBinder != null ? com.google.android.gms.location.zzt.zzb(iBinder) : null;
        this.zze = pendingIntent;
        this.zzd = iBinder2 != null ? com.google.android.gms.location.zzq.zzb(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzkVar = queryLocalInterface instanceof zzk ? (zzk) queryLocalInterface : new zzi(iBinder3);
        }
        this.zzf = zzkVar;
        this.zzg = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.location.zzu zzuVar = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, zzuVar == null ? null : zzuVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zze, i, false);
        com.google.android.gms.location.zzr zzrVar = this.zzd;
        SafeParcelWriter.writeIBinder(parcel, 5, zzrVar == null ? null : zzrVar.asBinder(), false);
        zzk zzkVar = this.zzf;
        SafeParcelWriter.writeIBinder(parcel, 6, zzkVar != null ? zzkVar.asBinder() : null, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
