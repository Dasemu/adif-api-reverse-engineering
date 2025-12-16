package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* loaded from: classes3.dex */
public final class Circle {
    private final com.google.android.gms.internal.maps.zzl zza;

    public Circle(com.google.android.gms.internal.maps.zzl zzlVar) {
        this.zza = (com.google.android.gms.internal.maps.zzl) Preconditions.checkNotNull(zzlVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        try {
            return this.zza.zzy(((Circle) obj).zza);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public LatLng getCenter() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public int getFillColor() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public String getId() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public double getRadius() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public int getStrokeColor() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public List<PatternItem> getStrokePattern() {
        try {
            return PatternItem.zza(this.zza.zzm());
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public float getStrokeWidth() {
        try {
            return this.zza.zze();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.zza.zzj());
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

    public final int hashCode() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public boolean isClickable() {
        try {
            return this.zza.zzz();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public boolean isVisible() {
        try {
            return this.zza.zzA();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void remove() {
        try {
            this.zza.zzn();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setCenter(LatLng latLng) {
        try {
            Preconditions.checkNotNull(latLng, "center must not be null.");
            this.zza.zzo(latLng);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setClickable(boolean z3) {
        try {
            this.zza.zzp(z3);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setFillColor(int i) {
        try {
            this.zza.zzq(i);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setRadius(double d4) {
        try {
            this.zza.zzr(d4);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setStrokeColor(int i) {
        try {
            this.zza.zzs(i);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setStrokePattern(List<PatternItem> list) {
        try {
            this.zza.zzt(list);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setStrokeWidth(float f2) {
        try {
            this.zza.zzu(f2);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setTag(Object obj) {
        try {
            this.zza.zzv(ObjectWrapper.wrap(obj));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setVisible(boolean z3) {
        try {
            this.zza.zzw(z3);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setZIndex(float f2) {
        try {
            this.zza.zzx(f2);
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }
}
