package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhr implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzik zzc;

    public zzhr(zzik zzikVar, AtomicReference atomicReference, boolean z3) {
        this.zzc = zzikVar;
        this.zza = atomicReference;
        this.zzb = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzt.zzt().zzx(this.zza, this.zzb);
    }
}
