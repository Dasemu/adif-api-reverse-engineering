package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes3.dex */
public final class zzfg {
    final String zza;
    final /* synthetic */ zzfi zzb;
    private final String zzc;
    private final String zzd;
    private final long zze;

    public /* synthetic */ zzfg(zzfi zzfiVar, String str, long j4, zzff zzffVar) {
        this.zzb = zzfiVar;
        Preconditions.checkNotEmpty("health_monitor");
        Preconditions.checkArgument(j4 > 0);
        this.zza = "health_monitor:start";
        this.zzc = "health_monitor:count";
        this.zzd = "health_monitor:value";
        this.zze = j4;
    }

    private final long zzc() {
        return this.zzb.zza().getLong(this.zza, 0L);
    }

    private final void zzd() {
        this.zzb.zzg();
        long currentTimeMillis = this.zzb.zzt.zzax().currentTimeMillis();
        SharedPreferences.Editor edit = this.zzb.zza().edit();
        edit.remove(this.zzc);
        edit.remove(this.zzd);
        edit.putLong(this.zza, currentTimeMillis);
        edit.apply();
    }

    public final Pair zza() {
        long abs;
        this.zzb.zzg();
        this.zzb.zzg();
        long zzc = zzc();
        if (zzc == 0) {
            zzd();
            abs = 0;
        } else {
            abs = Math.abs(zzc - this.zzb.zzt.zzax().currentTimeMillis());
        }
        long j4 = this.zze;
        if (abs < j4) {
            return null;
        }
        if (abs > j4 + j4) {
            zzd();
            return null;
        }
        String string = this.zzb.zza().getString(this.zzd, null);
        long j5 = this.zzb.zza().getLong(this.zzc, 0L);
        zzd();
        return (string == null || j5 <= 0) ? zzfi.zza : new Pair(string, Long.valueOf(j5));
    }

    public final void zzb(String str, long j4) {
        this.zzb.zzg();
        if (zzc() == 0) {
            zzd();
        }
        if (str == null) {
            str = "";
        }
        long j5 = this.zzb.zza().getLong(this.zzc, 0L);
        if (j5 <= 0) {
            SharedPreferences.Editor edit = this.zzb.zza().edit();
            edit.putString(this.zzd, str);
            edit.putLong(this.zzc, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.zzb.zzt.zzv().zzG().nextLong() & LongCompanionObject.MAX_VALUE;
        long j6 = j5 + 1;
        long j7 = LongCompanionObject.MAX_VALUE / j6;
        SharedPreferences.Editor edit2 = this.zzb.zza().edit();
        if (nextLong < j7) {
            edit2.putString(this.zzd, str);
        }
        edit2.putLong(this.zzc, j6);
        edit2.apply();
    }
}
