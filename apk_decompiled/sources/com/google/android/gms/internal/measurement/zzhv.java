package com.google.android.gms.internal.measurement;

import android.util.Log;
import com.google.android.gms.measurement.internal.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhv extends zzib {
    public zzhv(zzhy zzhyVar, String str, Boolean bool, boolean z3) {
        super(zzhyVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzib
    public final /* synthetic */ Object zza(Object obj) {
        if (zzha.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzha.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder p = a.p("Invalid boolean value for ", this.zzb, ": ");
        p.append((String) obj);
        Log.e("PhenotypeFlag", p.toString());
        return null;
    }
}
