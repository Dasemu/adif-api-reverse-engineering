package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhs implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzik zzb;

    public zzhs(zzik zzikVar, long j4) {
        this.zzb = zzikVar;
        this.zza = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzL(this.zza, true);
        this.zzb.zzt.zzt().zzu(new AtomicReference());
    }
}
