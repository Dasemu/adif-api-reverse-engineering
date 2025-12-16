package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class SyncTask implements Runnable {
    private final FirebaseMessaging firebaseMessaging;
    private final long nextDelaySeconds;

    @SuppressLint({"ThreadPoolCreation"})
    ExecutorService processorExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
    private final PowerManager.WakeLock syncWakeLock;

    /* loaded from: classes3.dex */
    public static class ConnectivityChangeReceiver extends BroadcastReceiver {
        private SyncTask task;

        public ConnectivityChangeReceiver(SyncTask syncTask) {
            this.task = syncTask;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SyncTask syncTask = this.task;
            if (syncTask != null && syncTask.isDeviceConnected()) {
                if (SyncTask.isDebugLogEnabled()) {
                    Log.d(Constants.TAG, "Connectivity changed. Starting background sync.");
                }
                this.task.firebaseMessaging.enqueueTaskWithDelaySeconds(this.task, 0L);
                this.task.getContext().unregisterReceiver(this);
                this.task = null;
            }
        }

        public void registerReceiver() {
            if (SyncTask.isDebugLogEnabled()) {
                Log.d(Constants.TAG, "Connectivity change received registered");
            }
            this.task.getContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public SyncTask(FirebaseMessaging firebaseMessaging, long j4) {
        this.firebaseMessaging = firebaseMessaging;
        this.nextDelaySeconds = j4;
        PowerManager.WakeLock newWakeLock = ((PowerManager) getContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.syncWakeLock = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public static boolean isDebugLogEnabled() {
        return Log.isLoggable(Constants.TAG, 3);
    }

    public Context getContext() {
        return this.firebaseMessaging.getApplicationContext();
    }

    public boolean isDeviceConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getContext().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean maybeRefreshToken() throws IOException {
        try {
            if (this.firebaseMessaging.blockingGetToken() == null) {
                Log.e(Constants.TAG, "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable(Constants.TAG, 3)) {
                return true;
            }
            Log.d(Constants.TAG, "Token successfully retrieved");
            return true;
        } catch (IOException e4) {
            if (!GmsRpc.isErrorMessageForRetryableError(e4.getMessage())) {
                if (e4.getMessage() != null) {
                    throw e4;
                }
                Log.w(Constants.TAG, "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w(Constants.TAG, "Token retrieval failed: " + e4.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w(Constants.TAG, "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
            this.syncWakeLock.acquire();
        }
        try {
            try {
                this.firebaseMessaging.setSyncScheduledOrRunning(true);
                if (!this.firebaseMessaging.isGmsCorePresent()) {
                    this.firebaseMessaging.setSyncScheduledOrRunning(false);
                    if (!ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                        return;
                    }
                } else if (!ServiceStarter.getInstance().hasAccessNetworkStatePermission(getContext()) || isDeviceConnected()) {
                    if (maybeRefreshToken()) {
                        this.firebaseMessaging.setSyncScheduledOrRunning(false);
                    } else {
                        this.firebaseMessaging.syncWithDelaySecondsInternal(this.nextDelaySeconds);
                    }
                    if (!ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                        return;
                    }
                } else {
                    new ConnectivityChangeReceiver(this).registerReceiver();
                    if (!ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                        return;
                    }
                }
                this.syncWakeLock.release();
            } catch (IOException e4) {
                Log.e(Constants.TAG, "Topic sync or token retrieval failed on hard failure exceptions: " + e4.getMessage() + ". Won't retry the operation.");
                this.firebaseMessaging.setSyncScheduledOrRunning(false);
                if (ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                    this.syncWakeLock.release();
                }
            }
        } catch (Throwable th) {
            if (ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                this.syncWakeLock.release();
            }
            throw th;
        }
    }
}
