package com.google.firebase;

import android.os.SystemClock;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes3.dex */
public abstract class StartupTime {
    public static StartupTime create(long j4, long j5, long j6) {
        return new AutoValue_StartupTime(j4, j5, j6);
    }

    public static StartupTime now() {
        return create(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long getElapsedRealtime();

    public abstract long getEpochMillis();

    public abstract long getUptimeMillis();
}
