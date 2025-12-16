package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhw implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzik zzb;

    public zzhw(zzik zzikVar, AtomicReference atomicReference) {
        this.zzb = zzikVar;
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            try {
                try {
                    this.zza.set(Boolean.valueOf(this.zzb.zzt.zzf().zzs(this.zzb.zzt.zzh().zzl(), zzeg.zzK)));
                } finally {
                    this.zza.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
