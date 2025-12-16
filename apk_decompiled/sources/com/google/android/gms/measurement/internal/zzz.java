package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzoy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzz extends zzy {
    final /* synthetic */ zzaa zza;
    private final com.google.android.gms.internal.measurement.zzet zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzz(zzaa zzaaVar, String str, int i, com.google.android.gms.internal.measurement.zzet zzetVar) {
        super(str, i);
        this.zza = zzaaVar;
        this.zzh = zzetVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final int zza() {
        return this.zzh.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final boolean zzc() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzd(Long l4, Long l5, com.google.android.gms.internal.measurement.zzgm zzgmVar, boolean z3) {
        zzoy.zzc();
        boolean zzs = this.zza.zzt.zzf().zzs(this.zzb, zzeg.zzW);
        boolean zzg = this.zzh.zzg();
        boolean zzh = this.zzh.zzh();
        boolean zzi = this.zzh.zzi();
        Object[] objArr = zzg || zzh || zzi;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z3 && objArr != true) {
            this.zza.zzt.zzaA().zzj().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), this.zzh.zzj() ? Integer.valueOf(this.zzh.zza()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzem zzb = this.zzh.zzb();
        boolean zzg2 = zzb.zzg();
        if (zzgmVar.zzr()) {
            if (zzb.zzi()) {
                bool = zzy.zzj(zzy.zzh(zzgmVar.zzb(), zzb.zzc()), zzg2);
            } else {
                this.zza.zzt.zzaA().zzk().zzb("No number filter for long property. property", this.zza.zzt.zzj().zzf(zzgmVar.zzf()));
            }
        } else if (zzgmVar.zzq()) {
            if (zzb.zzi()) {
                bool = zzy.zzj(zzy.zzg(zzgmVar.zza(), zzb.zzc()), zzg2);
            } else {
                this.zza.zzt.zzaA().zzk().zzb("No number filter for double property. property", this.zza.zzt.zzj().zzf(zzgmVar.zzf()));
            }
        } else if (!zzgmVar.zzt()) {
            this.zza.zzt.zzaA().zzk().zzb("User property has no value, property", this.zza.zzt.zzj().zzf(zzgmVar.zzf()));
        } else if (zzb.zzk()) {
            bool = zzy.zzj(zzy.zzf(zzgmVar.zzg(), zzb.zzd(), this.zza.zzt.zzaA()), zzg2);
        } else if (!zzb.zzi()) {
            this.zza.zzt.zzaA().zzk().zzb("No string or number filter defined. property", this.zza.zzt.zzj().zzf(zzgmVar.zzf()));
        } else if (zzlj.zzy(zzgmVar.zzg())) {
            bool = zzy.zzj(zzy.zzi(zzgmVar.zzg(), zzb.zzc()), zzg2);
        } else {
            this.zza.zzt.zzaA().zzk().zzc("Invalid user property value for Numeric number filter. property, value", this.zza.zzt.zzj().zzf(zzgmVar.zzf()), zzgmVar.zzg());
        }
        this.zza.zzt.zzaA().zzj().zzb("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.zzd = Boolean.TRUE;
        if (zzi && !bool.booleanValue()) {
            return true;
        }
        if (!z3 || this.zzh.zzg()) {
            this.zze = bool;
        }
        if (bool.booleanValue() && objArr != false && zzgmVar.zzs()) {
            long zzc = zzgmVar.zzc();
            if (l4 != null) {
                zzc = l4.longValue();
            }
            if (zzs && this.zzh.zzg() && !this.zzh.zzh() && l5 != null) {
                zzc = l5.longValue();
            }
            if (this.zzh.zzh()) {
                this.zzg = Long.valueOf(zzc);
            } else {
                this.zzf = Long.valueOf(zzc);
            }
        }
        return true;
    }
}
