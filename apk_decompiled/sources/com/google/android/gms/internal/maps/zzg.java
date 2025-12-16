package com.google.android.gms.internal.maps;

import C.w;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.PinConfig;

/* loaded from: classes3.dex */
public final class zzg extends zza implements zzi {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final IObjectWrapper zzd() throws RemoteException {
        return w.d(zzJ(4, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final IObjectWrapper zze(float f2) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f2);
        return w.d(zzJ(5, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final IObjectWrapper zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return w.d(zzJ(2, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final IObjectWrapper zzg(Bitmap bitmap) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, bitmap);
        return w.d(zzJ(6, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final IObjectWrapper zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return w.d(zzJ(3, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final IObjectWrapper zzi(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return w.d(zzJ(7, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final IObjectWrapper zzj(PinConfig pinConfig) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, pinConfig);
        return w.d(zzJ(8, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final IObjectWrapper zzk(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        return w.d(zzJ(1, zza));
    }
}
