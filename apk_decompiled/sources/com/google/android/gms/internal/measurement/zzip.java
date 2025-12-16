package com.google.android.gms.internal.measurement;

import C.w;

/* loaded from: classes3.dex */
final class zzip implements zzim {
    private static final zzim zza = new zzim() { // from class: com.google.android.gms.internal.measurement.zzio
        @Override // com.google.android.gms.internal.measurement.zzim
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile zzim zzb;
    private Object zzc;

    public zzip(zzim zzimVar) {
        zzimVar.getClass();
        this.zzb = zzimVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = w.o("<supplier that returned ", String.valueOf(this.zzc), ">");
        }
        return w.o("Suppliers.memoize(", String.valueOf(obj), ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        zzim zzimVar = this.zzb;
        zzim zzimVar2 = zza;
        if (zzimVar != zzimVar2) {
            synchronized (this) {
                try {
                    if (this.zzb != zzimVar2) {
                        Object zza2 = this.zzb.zza();
                        this.zzc = zza2;
                        this.zzb = zzimVar2;
                        return zza2;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
