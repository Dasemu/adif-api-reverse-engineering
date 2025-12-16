package com.google.firebase.analytics;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zza extends ThreadPoolExecutor {
    public zza(FirebaseAnalytics firebaseAnalytics, int i, int i4, long j4, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, blockingQueue);
    }
}
