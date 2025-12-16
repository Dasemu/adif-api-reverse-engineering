package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhp implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ String zzh;
    final /* synthetic */ zzik zzi;

    public zzhp(zzik zzikVar, String str, String str2, long j4, Bundle bundle, boolean z3, boolean z4, boolean z5, String str3) {
        this.zzi = zzikVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j4;
        this.zzd = bundle;
        this.zze = z3;
        this.zzf = z4;
        this.zzg = z5;
        this.zzh = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzi.zzI(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}
