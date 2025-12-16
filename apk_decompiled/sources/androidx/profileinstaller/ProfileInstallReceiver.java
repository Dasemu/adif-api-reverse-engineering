package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import h3.d;
import java.io.File;
import n.ExecutorC0507a;
import s0.AbstractC0585d;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC0585d.s(context, new ExecutorC0507a(1), new d(this, 9), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                d dVar = new d(this, 9);
                try {
                    AbstractC0585d.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    dVar.a(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e4) {
                    dVar.a(7, e4);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            Log.d("ProfileInstaller", "");
            setResultCode(12);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            d dVar2 = new d(this, 9);
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                dVar2.a(16, null);
            } else if (AbstractC0585d.c(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                dVar2.a(14, null);
            } else {
                dVar2.a(15, null);
            }
        }
    }
}
