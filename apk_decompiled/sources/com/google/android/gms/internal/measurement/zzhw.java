package com.google.android.gms.internal.measurement;

import android.util.Log;
import com.google.android.gms.measurement.internal.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhw extends zzib {
    public zzhw(zzhy zzhyVar, String str, Double d4, boolean z3) {
        super(zzhyVar, "measurement.test.double_flag", d4, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder p = a.p("Invalid double value for ", this.zzb, ": ");
            p.append((String) obj);
            Log.e("PhenotypeFlag", p.toString());
            return null;
        }
    }
}
