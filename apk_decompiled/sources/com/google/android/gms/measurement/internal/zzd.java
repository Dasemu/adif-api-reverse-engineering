package com.google.android.gms.measurement.internal;

import C.w;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Map;
import s.j;

/* loaded from: classes3.dex */
public final class zzd extends zze {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, s.j] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map, s.j] */
    public zzd(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzb = new j(0);
        this.zza = new j(0);
    }

    public static /* synthetic */ void zza(zzd zzdVar, String str, long j4) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        if (zzdVar.zzb.isEmpty()) {
            zzdVar.zzc = j4;
        }
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num != null) {
            zzdVar.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzdVar.zzb.size() >= 100) {
            w.A(zzdVar.zzt, "Too many ads visible");
        } else {
            zzdVar.zzb.put(str, 1);
            zzdVar.zza.put(str, Long.valueOf(j4));
        }
    }

    public static /* synthetic */ void zzb(zzd zzdVar, String str, long j4) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num == null) {
            zzdVar.zzt.zzaA().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zzir zzj = zzdVar.zzt.zzs().zzj(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            zzdVar.zzb.put(str, Integer.valueOf(intValue));
            return;
        }
        zzdVar.zzb.remove(str);
        Long l4 = (Long) zzdVar.zza.get(str);
        if (l4 == null) {
            w.v(zzdVar.zzt, "First ad unit exposure time was never set");
        } else {
            long longValue = j4 - l4.longValue();
            zzdVar.zza.remove(str);
            zzdVar.zzi(str, longValue, zzj);
        }
        if (zzdVar.zzb.isEmpty()) {
            long j5 = zzdVar.zzc;
            if (j5 == 0) {
                w.v(zzdVar.zzt, "First ad exposure time was never set");
            } else {
                zzdVar.zzh(j4 - j5, zzj);
                zzdVar.zzc = 0L;
            }
        }
    }

    private final void zzh(long j4, zzir zzirVar) {
        if (zzirVar == null) {
            a.y(this.zzt, "Not logging ad exposure. No active activity");
            return;
        }
        if (j4 < 1000) {
            this.zzt.zzaA().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j4));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j4);
        zzlp.zzK(zzirVar, bundle, true);
        this.zzt.zzq().zzG("am", "_xa", bundle);
    }

    private final void zzi(String str, long j4, zzir zzirVar) {
        if (zzirVar == null) {
            a.y(this.zzt, "Not logging ad unit exposure. No active activity");
            return;
        }
        if (j4 < 1000) {
            this.zzt.zzaA().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j4));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j4);
        zzlp.zzK(zzirVar, bundle, true);
        this.zzt.zzq().zzG("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(long j4) {
        Iterator it = this.zza.keySet().iterator();
        while (it.hasNext()) {
            this.zza.put((String) it.next(), Long.valueOf(j4));
        }
        if (this.zza.isEmpty()) {
            return;
        }
        this.zzc = j4;
    }

    public final void zzd(String str, long j4) {
        if (str == null || str.length() == 0) {
            w.v(this.zzt, "Ad unit id must be a non-empty string");
        } else {
            this.zzt.zzaB().zzp(new zza(this, str, j4));
        }
    }

    public final void zze(String str, long j4) {
        if (str == null || str.length() == 0) {
            w.v(this.zzt, "Ad unit id must be a non-empty string");
        } else {
            this.zzt.zzaB().zzp(new zzb(this, str, j4));
        }
    }

    public final void zzf(long j4) {
        zzir zzj = this.zzt.zzs().zzj(false);
        for (String str : this.zza.keySet()) {
            zzi(str, j4 - ((Long) this.zza.get(str)).longValue(), zzj);
        }
        if (!this.zza.isEmpty()) {
            zzh(j4 - this.zzc, zzj);
        }
        zzj(j4);
    }
}
