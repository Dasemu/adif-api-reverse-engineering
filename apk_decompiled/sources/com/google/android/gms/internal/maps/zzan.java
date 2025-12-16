package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

/* loaded from: classes3.dex */
public final class zzan extends zza implements zzap {
    public zzan(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final Tile zzb(int i, int i4, int i5) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i4);
        zza.writeInt(i5);
        Parcel zzJ = zzJ(1, zza);
        Tile tile = (Tile) zzc.zza(zzJ, Tile.CREATOR);
        zzJ.recycle();
        return tile;
    }
}
