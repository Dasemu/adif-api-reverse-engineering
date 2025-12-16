package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
public final class zzer {
    final /* synthetic */ zzet zza;
    private final int zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzer(zzet zzetVar, int i, boolean z3, boolean z4) {
        this.zza = zzetVar;
        this.zzb = i;
        this.zzc = z3;
        this.zzd = z4;
    }

    public final void zza(String str) {
        this.zza.zzu(this.zzb, this.zzc, this.zzd, str, null, null, null);
    }

    public final void zzb(String str, Object obj) {
        this.zza.zzu(this.zzb, this.zzc, this.zzd, str, obj, null, null);
    }

    public final void zzc(String str, Object obj, Object obj2) {
        this.zza.zzu(this.zzb, this.zzc, this.zzd, str, obj, obj2, null);
    }

    public final void zzd(String str, Object obj, Object obj2, Object obj3) {
        this.zza.zzu(this.zzb, this.zzc, this.zzd, str, obj, obj2, obj3);
    }
}
