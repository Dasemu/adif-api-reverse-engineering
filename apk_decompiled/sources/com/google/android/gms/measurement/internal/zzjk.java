package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjk implements Runnable {
    final /* synthetic */ zzau zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzc;
    final /* synthetic */ zzjz zzd;

    public zzjk(zzjz zzjzVar, zzau zzauVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzd = zzjzVar;
        this.zza = zzauVar;
        this.zzb = str;
        this.zzc = zzcfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.gms.internal.measurement.zzcf] */
    @Override // java.lang.Runnable
    public final void run() {
        zzgd zzgdVar;
        zzej zzejVar;
        byte[] bArr = null;
        try {
            try {
                zzjz zzjzVar = this.zzd;
                zzejVar = zzjzVar.zzb;
                if (zzejVar == null) {
                    zzjzVar.zzt.zzaA().zzd().zza("Discarding data. Failed to send event to service to bundle");
                    zzgdVar = this.zzd.zzt;
                } else {
                    bArr = zzejVar.zzu(this.zza, this.zzb);
                    this.zzd.zzQ();
                    zzgdVar = this.zzd.zzt;
                }
            } catch (RemoteException e4) {
                this.zzd.zzt.zzaA().zzd().zzb("Failed to send event to the service to bundle", e4);
                zzgdVar = this.zzd.zzt;
            }
            zzlp zzv = zzgdVar.zzv();
            this = this.zzc;
            zzv.zzT(this, bArr);
        } catch (Throwable th) {
            this.zzd.zzt.zzv().zzT(this.zzc, bArr);
            throw th;
        }
    }
}
