package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzdu implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzef zzk;

    public zzdu(zzef zzefVar, boolean z3) {
        this.zzk = zzefVar;
        this.zzh = zzefVar.zza.currentTimeMillis();
        this.zzi = zzefVar.zza.elapsedRealtime();
        this.zzj = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        z3 = this.zzk.zzh;
        if (z3) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e4) {
            this.zzk.zzT(e4, false, this.zzj);
            zzb();
        }
    }

    public abstract void zza() throws RemoteException;

    public void zzb() {
    }
}
