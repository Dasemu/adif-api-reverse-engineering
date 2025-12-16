package com.google.android.gms.maps.internal;

import C.w;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes3.dex */
public final class zzb extends com.google.android.gms.internal.maps.zza implements ICameraUpdateFactoryDelegate {
    public zzb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper newCameraPosition(CameraPosition cameraPosition) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, cameraPosition);
        return w.d(zzJ(7, zza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper newLatLng(LatLng latLng) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, latLng);
        return w.d(zzJ(8, zza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper newLatLngBounds(LatLngBounds latLngBounds, int i) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, latLngBounds);
        zza.writeInt(i);
        return w.d(zzJ(10, zza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper newLatLngBoundsWithSize(LatLngBounds latLngBounds, int i, int i4, int i5) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, latLngBounds);
        zza.writeInt(i);
        zza.writeInt(i4);
        zza.writeInt(i5);
        return w.d(zzJ(11, zza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper newLatLngZoom(LatLng latLng, float f2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, latLng);
        zza.writeFloat(f2);
        return w.d(zzJ(9, zza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper scrollBy(float f2, float f4) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f2);
        zza.writeFloat(f4);
        return w.d(zzJ(3, zza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper zoomBy(float f2) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f2);
        return w.d(zzJ(5, zza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper zoomByWithFocus(float f2, int i, int i4) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f2);
        zza.writeInt(i);
        zza.writeInt(i4);
        return w.d(zzJ(6, zza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper zoomIn() throws RemoteException {
        return w.d(zzJ(1, zza()));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper zoomOut() throws RemoteException {
        return w.d(zzJ(2, zza()));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper zoomTo(float f2) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f2);
        return w.d(zzJ(4, zza));
    }
}
