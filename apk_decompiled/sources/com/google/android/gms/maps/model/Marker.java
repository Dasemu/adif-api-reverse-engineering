package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public class Marker {
    protected final com.google.android.gms.internal.maps.zzad zza;

    public Marker(com.google.android.gms.internal.maps.zzad zzadVar) {
        this.zza = (com.google.android.gms.internal.maps.zzad) Preconditions.checkNotNull(zzadVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Marker)) {
            return false;
        }
        try {
            return this.zza.zzE(((Marker) obj).zza);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public float getAlpha() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public String getId() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public LatLng getPosition() {
        try {
            return this.zza.zzj();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public float getRotation() {
        try {
            return this.zza.zze();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public String getSnippet() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.zza.zzi());
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public String getTitle() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public float getZIndex() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public int hashCode() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void hideInfoWindow() {
        try {
            this.zza.zzn();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public boolean isDraggable() {
        try {
            return this.zza.zzF();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public boolean isFlat() {
        try {
            return this.zza.zzG();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public boolean isInfoWindowShown() {
        try {
            return this.zza.zzH();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public boolean isVisible() {
        try {
            return this.zza.zzI();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void remove() {
        try {
            this.zza.zzo();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setAlpha(float f2) {
        try {
            this.zza.zzp(f2);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setAnchor(float f2, float f4) {
        try {
            this.zza.zzq(f2, f4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setDraggable(boolean z3) {
        try {
            this.zza.zzr(z3);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setFlat(boolean z3) {
        try {
            this.zza.zzs(z3);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setIcon(BitmapDescriptor bitmapDescriptor) {
        try {
            if (bitmapDescriptor == null) {
                this.zza.zzt(null);
            } else {
                this.zza.zzt(bitmapDescriptor.zza());
            }
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setInfoWindowAnchor(float f2, float f4) {
        try {
            this.zza.zzv(f2, f4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setPosition(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.zza.zzw(latLng);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setRotation(float f2) {
        try {
            this.zza.zzx(f2);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setSnippet(String str) {
        try {
            this.zza.zzy(str);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setTag(Object obj) {
        try {
            this.zza.zzz(ObjectWrapper.wrap(obj));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setTitle(String str) {
        try {
            this.zza.zzA(str);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setVisible(boolean z3) {
        try {
            this.zza.zzB(z3);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setZIndex(float f2) {
        try {
            this.zza.zzC(f2);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void showInfoWindow() {
        try {
            this.zza.zzD();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }
}
