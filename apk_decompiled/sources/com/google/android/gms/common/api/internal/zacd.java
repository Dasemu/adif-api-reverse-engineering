package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zacd implements OnCompleteListener {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey zac;
    private final long zad;
    private final long zae;

    @VisibleForTesting
    public zacd(GoogleApiManager googleApiManager, int i, ApiKey apiKey, long j4, long j5, String str, String str2) {
        this.zaa = googleApiManager;
        this.zab = i;
        this.zac = apiKey;
        this.zad = j4;
        this.zae = j5;
    }

    public static zacd zaa(GoogleApiManager googleApiManager, int i, ApiKey apiKey) {
        boolean z3;
        if (!googleApiManager.zaF()) {
            return null;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config == null) {
            z3 = true;
        } else {
            if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            }
            z3 = config.getMethodTimingTelemetryEnabled();
            zabq zak = googleApiManager.zak(apiKey);
            if (zak != null) {
                if (!(zak.zaf() instanceof BaseGmsClient)) {
                    return null;
                }
                BaseGmsClient baseGmsClient = (BaseGmsClient) zak.zaf();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    ConnectionTelemetryConfiguration zab = zab(zak, baseGmsClient, i);
                    if (zab == null) {
                        return null;
                    }
                    zak.zaq();
                    z3 = zab.getMethodTimingTelemetryEnabled();
                }
            }
        }
        return new zacd(googleApiManager, i, apiKey, z3 ? System.currentTimeMillis() : 0L, z3 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static ConnectionTelemetryConfiguration zab(zabq zabqVar, BaseGmsClient baseGmsClient, int i) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i))) || zabqVar.zac() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        zabq zak;
        int i;
        int i4;
        int i5;
        int errorCode;
        int i6;
        long j4;
        long j5;
        if (this.zaa.zaF()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zak = this.zaa.zak(this.zac)) != null && (zak.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zak.zaf();
                int i7 = 0;
                boolean z3 = this.zad > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                if (config != null) {
                    z3 &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    i = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration zab = zab(zak, baseGmsClient, this.zab);
                        if (zab == null) {
                            return;
                        }
                        boolean z4 = zab.getMethodTimingTelemetryEnabled() && this.zad > 0;
                        maxMethodInvocationsInBatch = zab.getMaxMethodInvocationsLogged();
                        z3 = z4;
                    }
                    i5 = batchPeriodMillis;
                    i4 = maxMethodInvocationsInBatch;
                } else {
                    i = 0;
                    i4 = 100;
                    i5 = 5000;
                }
                GoogleApiManager googleApiManager = this.zaa;
                int i8 = -1;
                if (task.isSuccessful()) {
                    errorCode = 0;
                } else {
                    if (task.isCanceled()) {
                        i7 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof ApiException) {
                            Status status = ((ApiException) exception).getStatus();
                            int statusCode = status.getStatusCode();
                            ConnectionResult connectionResult = status.getConnectionResult();
                            errorCode = connectionResult == null ? -1 : connectionResult.getErrorCode();
                            i7 = statusCode;
                        } else {
                            i7 = 101;
                        }
                    }
                    errorCode = -1;
                }
                if (z3) {
                    long j6 = this.zad;
                    long currentTimeMillis = System.currentTimeMillis();
                    i6 = i4;
                    i8 = (int) (SystemClock.elapsedRealtime() - this.zae);
                    j4 = j6;
                    j5 = currentTimeMillis;
                } else {
                    i6 = i4;
                    j4 = 0;
                    j5 = 0;
                }
                googleApiManager.zay(new MethodInvocation(this.zab, i7, errorCode, j4, j5, null, null, gCoreServiceId, i8), i, i5, i6);
            }
        }
    }
}
