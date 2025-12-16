package com.google.android.gms.internal.measurement;

import android.util.Log;
import com.google.android.gms.measurement.internal.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhu extends zzib {
    public zzhu(zzhy zzhyVar, String str, Long l4, boolean z3) {
        super(zzhyVar, str, l4, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder p = a.p("Invalid long value for ", this.zzb, ": ");
            p.append((String) obj);
            Log.e("PhenotypeFlag", p.toString());
            return null;
        }
    }
}
