package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzgk extends zzlb implements zzmj {
    private static final zzgk zza;
    private int zzd;
    private int zze;
    private zzlh zzf = zzlb.zzbF();

    static {
        zzgk zzgkVar = new zzgk();
        zza = zzgkVar;
        zzlb.zzbO(zzgk.class, zzgkVar);
    }

    private zzgk() {
    }

    public static zzgj zzd() {
        return (zzgj) zza.zzbA();
    }

    public static /* synthetic */ void zzg(zzgk zzgkVar, int i) {
        zzgkVar.zzd |= 1;
        zzgkVar.zze = i;
    }

    public static /* synthetic */ void zzh(zzgk zzgkVar, Iterable iterable) {
        zzlh zzlhVar = zzgkVar.zzf;
        if (!zzlhVar.zzc()) {
            zzgkVar.zzf = zzlb.zzbG(zzlhVar);
        }
        zzjk.zzbw(iterable, zzgkVar.zzf);
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final long zzc(int i) {
        return this.zzf.zza(i);
    }

    public final List zzf() {
        return this.zzf;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzlb.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new zzgk();
        }
        if (i4 == 4) {
            return new zzgj(null);
        }
        if (i4 != 5) {
            return null;
        }
        return zza;
    }
}
