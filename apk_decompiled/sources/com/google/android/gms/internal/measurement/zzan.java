package com.google.android.gms.internal.measurement;

import C.w;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzan implements zzap {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof zzan;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        throw new IllegalStateException(w.z("null has no function ", str));
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return zzap.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        return Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return "null";
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return null;
    }
}
