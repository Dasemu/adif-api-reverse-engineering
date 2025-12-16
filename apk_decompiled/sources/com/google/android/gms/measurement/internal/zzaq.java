package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzaq {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final Long zzh;
    final Long zzi;
    final Long zzj;
    final Boolean zzk;

    public zzaq(String str, String str2, long j4, long j5, long j6, long j7, long j8, Long l4, Long l5, Long l6, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j4 >= 0);
        Preconditions.checkArgument(j5 >= 0);
        Preconditions.checkArgument(j6 >= 0);
        Preconditions.checkArgument(j8 >= 0);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j4;
        this.zzd = j5;
        this.zze = j6;
        this.zzf = j7;
        this.zzg = j8;
        this.zzh = l4;
        this.zzi = l5;
        this.zzj = l6;
        this.zzk = bool;
    }

    public final zzaq zza(Long l4, Long l5, Boolean bool) {
        return new zzaq(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l4, l5, bool);
    }

    public final zzaq zzb(long j4, long j5) {
        return new zzaq(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j4, Long.valueOf(j5), this.zzi, this.zzj, this.zzk);
    }

    public final zzaq zzc(long j4) {
        return new zzaq(this.zza, this.zzb, this.zzc, this.zzd, this.zze, j4, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }
}
