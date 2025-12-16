package com.google.android.gms.measurement.internal;

import C.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjl extends zzan {
    final /* synthetic */ zzjz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjl(zzjz zzjzVar, zzgy zzgyVar) {
        super(zzgyVar);
        this.zza = zzjzVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    public final void zzc() {
        w.A(this.zza.zzt, "Tasks have been queued for a long time");
    }
}
