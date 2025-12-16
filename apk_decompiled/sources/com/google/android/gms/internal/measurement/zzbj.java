package com.google.android.gms.internal.measurement;

import C.w;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbj extends zzaw {
    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        if (str == null || str.isEmpty() || !zzgVar.zzh(str)) {
            throw new IllegalArgumentException(w.z("Command not found: ", str));
        }
        zzap zzd = zzgVar.zzd(str);
        if (zzd instanceof zzai) {
            return ((zzai) zzd).zza(zzgVar, list);
        }
        throw new IllegalArgumentException(w.o("Function ", str, " is not defined"));
    }
}
