package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;

/* loaded from: classes3.dex */
final class zzt extends zzr {
    public zzt(int i, int i4, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzr
    public final void zza(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        zzd(bundle2);
    }

    @Override // com.google.android.gms.cloudmessaging.zzr
    public final boolean zzb() {
        return false;
    }
}
