package com.google.android.gms.internal.measurement;

import C.w;
import java.io.Serializable;

/* loaded from: classes3.dex */
final class zzin implements Serializable, zzim {
    final zzim zza;
    volatile transient boolean zzb;
    transient Object zzc;

    public zzin(zzim zzimVar) {
        zzimVar.getClass();
        this.zza = zzimVar;
    }

    public final String toString() {
        return w.o("Suppliers.memoize(", (this.zzb ? w.o("<supplier that returned ", String.valueOf(this.zzc), ">") : this.zza).toString(), ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        Object zza = this.zza.zza();
                        this.zzc = zza;
                        this.zzb = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
