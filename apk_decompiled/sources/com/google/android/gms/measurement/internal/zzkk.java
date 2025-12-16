package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzqo;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkk implements Runnable {
    final long zza;
    final long zzb;
    final /* synthetic */ zzkl zzc;

    public zzkk(zzkl zzklVar, long j4, long j5) {
        this.zzc = zzklVar;
        this.zza = j4;
        this.zzb = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkj
            @Override // java.lang.Runnable
            public final void run() {
                zzkk zzkkVar = zzkk.this;
                zzkl zzklVar = zzkkVar.zzc;
                long j4 = zzkkVar.zza;
                long j5 = zzkkVar.zzb;
                zzklVar.zza.zzg();
                zzklVar.zza.zzt.zzaA().zzc().zza("Application going to the background");
                zzklVar.zza.zzt.zzm().zzm.zza(true);
                zzklVar.zza.zzm(true);
                if (!zzklVar.zza.zzt.zzf().zzu()) {
                    zzklVar.zza.zzb.zzb(j5);
                    zzklVar.zza.zzb.zzd(false, false, j5);
                }
                zzqo.zzc();
                if (zzklVar.zza.zzt.zzf().zzs(null, zzeg.zzaB)) {
                    zzklVar.zza.zzt.zzaA().zzi().zzb("Application backgrounded at: timestamp_millis", Long.valueOf(j4));
                } else {
                    zzklVar.zza.zzt.zzq().zzH(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ab", j4, new Bundle());
                }
            }
        });
    }
}
