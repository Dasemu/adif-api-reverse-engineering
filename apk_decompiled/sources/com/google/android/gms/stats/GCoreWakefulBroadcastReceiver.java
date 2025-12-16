package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import k0.AbstractC0415a;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public abstract class GCoreWakefulBroadcastReceiver extends AbstractC0415a {
    @KeepForSdk
    public static boolean completeWakefulIntent(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        return AbstractC0415a.completeWakefulIntent(intent);
    }
}
