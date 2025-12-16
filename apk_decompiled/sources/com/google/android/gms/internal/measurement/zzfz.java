package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzfz extends zzlb implements zzmj {
    private static final zzfz zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private zzfn zzg;

    static {
        zzfz zzfzVar = new zzfz();
        zza = zzfzVar;
        zzlb.zzbO(zzfz.class, zzfzVar);
    }

    private zzfz() {
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i, Object obj, Object obj2) {
        int i4 = i - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return zzlb.zzbL(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i4 == 3) {
            return new zzfz();
        }
        if (i4 == 4) {
            return new zzfy(null);
        }
        if (i4 != 5) {
            return null;
        }
        return zza;
    }
}
