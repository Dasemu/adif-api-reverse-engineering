package com.google.android.gms.dynamite;

import C.w;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzr extends com.google.android.gms.internal.common.zza implements IInterface {
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper2);
        return w.d(zzB(2, zza));
    }

    public final IObjectWrapper zzf(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper2);
        return w.d(zzB(3, zza));
    }
}
