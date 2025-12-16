package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzph;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkn {
    protected long zza;
    protected long zzb;
    final /* synthetic */ zzkp zzc;
    private final zzan zzd;

    public zzkn(zzkp zzkpVar) {
        this.zzc = zzkpVar;
        this.zzd = new zzkm(this, zzkpVar.zzt);
        long elapsedRealtime = zzkpVar.zzt.zzax().elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    public final void zza() {
        this.zzd.zzb();
        this.zza = 0L;
        this.zzb = 0L;
    }

    public final void zzb(long j4) {
        this.zzd.zzb();
    }

    public final void zzc(long j4) {
        this.zzc.zzg();
        this.zzd.zzb();
        this.zza = j4;
        this.zzb = j4;
    }

    public final boolean zzd(boolean z3, boolean z4, long j4) {
        this.zzc.zzg();
        this.zzc.zza();
        zzph.zzc();
        if (!this.zzc.zzt.zzf().zzs(null, zzeg.zzaf)) {
            this.zzc.zzt.zzm().zzj.zzb(this.zzc.zzt.zzax().currentTimeMillis());
        } else if (this.zzc.zzt.zzJ()) {
            this.zzc.zzt.zzm().zzj.zzb(this.zzc.zzt.zzax().currentTimeMillis());
        }
        long j5 = j4 - this.zza;
        if (!z3 && j5 < 1000) {
            this.zzc.zzt.zzaA().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j5));
            return false;
        }
        if (!z4) {
            j5 = j4 - this.zzb;
            this.zzb = j4;
        }
        this.zzc.zzt.zzaA().zzj().zzb("Recording user engagement, ms", Long.valueOf(j5));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j5);
        zzlp.zzK(this.zzc.zzt.zzs().zzj(!this.zzc.zzt.zzf().zzu()), bundle, true);
        if (!z4) {
            this.zzc.zzt.zzq().zzG(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_e", bundle);
        }
        this.zza = j4;
        this.zzd.zzb();
        this.zzd.zzd(3600000L);
        return true;
    }
}
