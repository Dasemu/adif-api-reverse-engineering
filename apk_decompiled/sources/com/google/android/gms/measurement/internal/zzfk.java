package com.google.android.gms.measurement.internal;

import C.w;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes3.dex */
public final class zzfk implements ServiceConnection {
    final /* synthetic */ zzfl zza;
    private final String zzb;

    public zzfk(zzfl zzflVar, String str) {
        this.zza = zzflVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            w.A(this.zza.zza, "Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzbr zzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
            if (zzb == null) {
                this.zza.zza.zzaA().zzk().zza("Install Referrer Service implementation was not found");
            } else {
                this.zza.zza.zzaA().zzj().zza("Install Referrer Service connected");
                this.zza.zza.zzaB().zzp(new zzfj(this, zzb, this));
            }
        } catch (RuntimeException e4) {
            this.zza.zza.zzaA().zzk().zzb("Exception occurred while calling Install Referrer API", e4);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a.y(this.zza.zza, "Install Referrer Service disconnected");
    }
}
