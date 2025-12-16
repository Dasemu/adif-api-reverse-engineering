package com.google.android.gms.internal.base;

import D.h;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes3.dex */
public final class zao extends h {
    @Deprecated
    public static Intent zaa(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (zan.zaa()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != zan.zaa() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
