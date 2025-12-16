package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LocationReceiverCreator")
/* loaded from: classes3.dex */
public final class zzdb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdb> CREATOR = new zzdc();

    @SafeParcelable.Field(getter = "getType", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getOldBinderReceiver", id = 2)
    private final IBinder zzb;

    @SafeParcelable.Field(getter = "getBinderReceiver", id = 3)
    private final IBinder zzc;

    @SafeParcelable.Field(getter = "getPendingIntentReceiver", id = 4)
    private final PendingIntent zzd;

    @SafeParcelable.Field(getter = "getModuleId", id = 5)
    private final String zze;

    @SafeParcelable.Field(getter = "getListenerId", id = 6)
    private final String zzf;

    @SafeParcelable.Constructor
    public zzdb(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) IBinder iBinder2, @SafeParcelable.Param(id = 4) PendingIntent pendingIntent, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) String str2) {
        this.zza = i;
        this.zzb = iBinder;
        this.zzc = iBinder2;
        this.zzd = pendingIntent;
        this.zze = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.zzf = str2;
    }

    public static zzdb zza(PendingIntent pendingIntent, String str, String str2) {
        return new zzdb(3, null, null, pendingIntent, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.location.zzr, android.os.IBinder] */
    public static zzdb zzb(IInterface iInterface, com.google.android.gms.location.zzr zzrVar, String str, String str2) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzdb(2, iInterface, zzrVar, null, null, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.location.zzu, android.os.IBinder] */
    public static zzdb zzc(IInterface iInterface, com.google.android.gms.location.zzu zzuVar, String str, String str2) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzdb(1, iInterface, zzuVar, null, null, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
