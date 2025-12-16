package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkr extends zzan {
    final /* synthetic */ zzks zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkr(zzks zzksVar, zzgy zzgyVar) {
        super(zzgyVar);
        this.zza = zzksVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    public final void zzc() {
        this.zza.zza();
        a.y(this.zza.zzt, "Starting upload from DelayedRunnable");
        this.zza.zzf.zzX();
    }
}
