package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzds extends zzdu {
    final /* synthetic */ Long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ zzef zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzef zzefVar, Long l4, String str, String str2, Bundle bundle, boolean z3, boolean z4) {
        super(zzefVar, true);
        this.zzg = zzefVar;
        this.zza = l4;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z3;
        this.zzf = z4;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        zzcc zzccVar;
        Long l4 = this.zza;
        long longValue = l4 == null ? this.zzh : l4.longValue();
        zzccVar = this.zzg.zzj;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, longValue);
    }
}
