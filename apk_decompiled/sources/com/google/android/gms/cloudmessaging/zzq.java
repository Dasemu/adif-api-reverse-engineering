package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* loaded from: classes3.dex */
final class zzq extends zzr {
    public zzq(int i, int i4, Bundle bundle) {
        super(i, i4, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzr
    public final void zza(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            zzd(null);
        } else {
            zzc(new zzs(4, "Invalid response to one way request", null));
        }
    }

    @Override // com.google.android.gms.cloudmessaging.zzr
    public final boolean zzb() {
        return true;
    }
}
