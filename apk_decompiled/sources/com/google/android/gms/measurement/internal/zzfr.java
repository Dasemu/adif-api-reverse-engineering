package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import s.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfr extends i {
    final /* synthetic */ zzfu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfr(zzfu zzfuVar, int i) {
        super(20);
        this.zza = zzfuVar;
    }

    @Override // s.i
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfu.zzd(this.zza, str);
    }
}
