package D;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes.dex */
public abstract class d {
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        return ((i & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1) : context.registerReceiver(broadcastReceiver, intentFilter, h.obtainAndCheckReceiverPermission(context), handler);
    }

    public static ComponentName b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
