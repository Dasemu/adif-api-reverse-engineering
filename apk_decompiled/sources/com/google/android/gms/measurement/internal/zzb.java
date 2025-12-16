package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzd zzc;

    public zzb(zzd zzdVar, String str, long j4) {
        this.zzc = zzdVar;
        this.zza = str;
        this.zzb = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd.zzb(this.zzc, this.zza, this.zzb);
    }
}
