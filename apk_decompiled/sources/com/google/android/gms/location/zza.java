package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* loaded from: classes3.dex */
public final class zza {
    private long zza = Long.MIN_VALUE;

    public final zza zza(long j4) {
        Preconditions.checkArgument(j4 >= 0, "intervalMillis can't be negative.");
        this.zza = j4;
        return this;
    }

    public final zzb zzb() {
        Preconditions.checkState(this.zza != Long.MIN_VALUE, "Must set intervalMillis.");
        return new zzb(this.zza, true, null, null, null, false, null, 0L, null);
    }
}
