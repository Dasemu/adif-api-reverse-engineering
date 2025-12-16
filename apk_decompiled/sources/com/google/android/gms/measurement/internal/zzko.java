package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzqu;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzko {
    final /* synthetic */ zzkp zza;

    public zzko(zzkp zzkpVar) {
        this.zza = zzkpVar;
    }

    public final void zza() {
        this.zza.zzg();
        if (this.zza.zzt.zzm().zzk(this.zza.zzt.zzax().currentTimeMillis())) {
            this.zza.zzt.zzm().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                a.y(this.zza.zzt, "Detected application was in foreground");
                zzc(this.zza.zzt.zzax().currentTimeMillis(), false);
            }
        }
    }

    public final void zzb(long j4, boolean z3) {
        this.zza.zzg();
        this.zza.zzp();
        if (this.zza.zzt.zzm().zzk(j4)) {
            this.zza.zzt.zzm().zzg.zza(true);
            zzqu.zzc();
            if (this.zza.zzt.zzf().zzs(null, zzeg.zzan)) {
                this.zza.zzt.zzh().zzo();
            }
        }
        this.zza.zzt.zzm().zzj.zzb(j4);
        if (this.zza.zzt.zzm().zzg.zzb()) {
            zzc(j4, z3);
        }
    }

    public final void zzc(long j4, boolean z3) {
        this.zza.zzg();
        if (this.zza.zzt.zzJ()) {
            this.zza.zzt.zzm().zzj.zzb(j4);
            this.zza.zzt.zzaA().zzj().zzb("Session started, time", Long.valueOf(this.zza.zzt.zzax().elapsedRealtime()));
            long j5 = j4 / 1000;
            this.zza.zzt.zzq().zzY(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", Long.valueOf(j5), j4);
            this.zza.zzt.zzm().zzk.zzb(j5);
            this.zza.zzt.zzm().zzg.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j5);
            if (this.zza.zzt.zzf().zzs(null, zzeg.zzab) && z3) {
                bundle.putLong("_aib", 1L);
            }
            this.zza.zzt.zzq().zzH(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_s", j4, bundle);
            zzos.zzc();
            if (this.zza.zzt.zzf().zzs(null, zzeg.zzae)) {
                String zza = this.zza.zzt.zzm().zzp.zza();
                if (TextUtils.isEmpty(zza)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", zza);
                this.zza.zzt.zzq().zzH(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ssr", j4, bundle2);
            }
        }
    }
}
