package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzfc {
    final /* synthetic */ zzfi zza;
    private final String zzb;
    private final boolean zzc;
    private boolean zzd;
    private boolean zze;

    public zzfc(zzfi zzfiVar, String str, boolean z3) {
        this.zza = zzfiVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = z3;
    }

    public final void zza(boolean z3) {
        SharedPreferences.Editor edit = this.zza.zza().edit();
        edit.putBoolean(this.zzb, z3);
        edit.apply();
        this.zze = z3;
    }

    public final boolean zzb() {
        if (!this.zzd) {
            this.zzd = true;
            this.zze = this.zza.zza().getBoolean(this.zzb, this.zzc);
        }
        return this.zze;
    }
}
