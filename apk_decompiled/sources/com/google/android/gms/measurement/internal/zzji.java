package com.google.android.gms.measurement.internal;

import C.w;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzji implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzjz zzc;

    public zzji(zzjz zzjzVar, zzq zzqVar, Bundle bundle) {
        this.zzc = zzjzVar;
        this.zza = zzqVar;
        this.zzb = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzjz zzjzVar = this.zzc;
        zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            w.v(zzjzVar.zzt, "Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzejVar.zzr(this.zzb, this.zza);
        } catch (RemoteException e4) {
            this.zzc.zzt.zzaA().zzd().zzb("Failed to send default event parameters to service", e4);
        }
    }
}
