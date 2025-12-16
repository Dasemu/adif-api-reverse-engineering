package com.google.firebase.crashlytics.internal.send;

import T1.d;
import T1.f;
import T1.h;
import W1.s;
import W1.t;
import android.annotation.SuppressLint;
import android.database.SQLException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.settings.Settings;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ReportQueue {
    private static final int MAX_DELAY_MS = 3600000;
    private static final int MS_PER_MINUTE = 60000;
    private static final int MS_PER_SECOND = 1000;
    private static final int STARTUP_DURATION_MS = 2000;
    private final double base;
    private long lastUpdatedMs;
    private final OnDemandCounter onDemandCounter;
    private final BlockingQueue<Runnable> queue;
    private final int queueCapacity;
    private final double ratePerMinute;
    private final ThreadPoolExecutor singleThreadExecutor;
    private final long startTimeMs;
    private int step;
    private final long stepDurationMs;
    private final f transport;

    /* loaded from: classes3.dex */
    public final class ReportRunnable implements Runnable {
        private final CrashlyticsReportWithSessionId reportWithSessionId;
        private final TaskCompletionSource<CrashlyticsReportWithSessionId> tcs;

        @Override // java.lang.Runnable
        public void run() {
            ReportQueue.this.sendReport(this.reportWithSessionId, this.tcs);
            ReportQueue.this.onDemandCounter.resetDroppedOnDemandExceptions();
            double calcDelay = ReportQueue.this.calcDelay();
            Logger.getLogger().d("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(calcDelay / 1000.0d)) + " s for report: " + this.reportWithSessionId.getSessionId());
            ReportQueue.sleep(calcDelay);
        }

        private ReportRunnable(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource) {
            this.reportWithSessionId = crashlyticsReportWithSessionId;
            this.tcs = taskCompletionSource;
        }
    }

    public ReportQueue(f fVar, Settings settings, OnDemandCounter onDemandCounter) {
        this(settings.onDemandUploadRatePerMinute, settings.onDemandBackoffBase, settings.onDemandBackoffStepDurationSeconds * 1000, fVar, onDemandCounter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double calcDelay() {
        return Math.min(3600000.0d, Math.pow(this.base, calcStep()) * (60000.0d / this.ratePerMinute));
    }

    private int calcStep() {
        if (this.lastUpdatedMs == 0) {
            this.lastUpdatedMs = now();
        }
        int now = (int) ((now() - this.lastUpdatedMs) / this.stepDurationMs);
        int min = isQueueFull() ? Math.min(100, this.step + now) : Math.max(0, this.step - now);
        if (this.step != min) {
            this.step = min;
            this.lastUpdatedMs = now();
        }
        return min;
    }

    private boolean isQueueAvailable() {
        return this.queue.size() < this.queueCapacity;
    }

    private boolean isQueueFull() {
        return this.queue.size() == this.queueCapacity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$flushScheduledReportsIfAble$0(CountDownLatch countDownLatch) {
        try {
            f fVar = this.transport;
            d dVar = d.f1660c;
            if (fVar instanceof s) {
                t.a().f1961d.a(((s) fVar).f1952a.b(dVar), 1);
            } else {
                String concat = "TRuntime.".concat("ForcedSender");
                if (Log.isLoggable(concat, 5)) {
                    Log.w(concat, String.format("Expected instance of `TransportImpl`, got `%s`.", fVar));
                }
            }
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendReport$1(TaskCompletionSource taskCompletionSource, boolean z3, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z3) {
            flushScheduledReportsIfAble();
        }
        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
    }

    private long now() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendReport(final CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, final TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource) {
        Logger.getLogger().d("Sending report through Google DataTransport: " + crashlyticsReportWithSessionId.getSessionId());
        final boolean z3 = SystemClock.elapsedRealtime() - this.startTimeMs < 2000;
        ((s) this.transport).a(new T1.a(crashlyticsReportWithSessionId.getReport(), d.f1660c, null), new h() { // from class: com.google.firebase.crashlytics.internal.send.b
            @Override // T1.h
            public final void a(Exception exc) {
                ReportQueue.this.lambda$sendReport$1(taskCompletionSource, z3, crashlyticsReportWithSessionId, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sleep(double d4) {
        try {
            Thread.sleep((long) d4);
        } catch (InterruptedException unused) {
        }
    }

    public TaskCompletionSource<CrashlyticsReportWithSessionId> enqueueReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z3) {
        synchronized (this.queue) {
            try {
                TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource = new TaskCompletionSource<>();
                if (!z3) {
                    sendReport(crashlyticsReportWithSessionId, taskCompletionSource);
                    return taskCompletionSource;
                }
                this.onDemandCounter.incrementRecordedOnDemandExceptions();
                if (!isQueueAvailable()) {
                    calcStep();
                    Logger.getLogger().d("Dropping report due to queue being full: " + crashlyticsReportWithSessionId.getSessionId());
                    this.onDemandCounter.incrementDroppedOnDemandExceptions();
                    taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                    return taskCompletionSource;
                }
                Logger.getLogger().d("Enqueueing report: " + crashlyticsReportWithSessionId.getSessionId());
                Logger.getLogger().d("Queue size: " + this.queue.size());
                this.singleThreadExecutor.execute(new ReportRunnable(crashlyticsReportWithSessionId, taskCompletionSource));
                Logger.getLogger().d("Closing task for report: " + crashlyticsReportWithSessionId.getSessionId());
                taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                return taskCompletionSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void flushScheduledReportsIfAble() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: com.google.firebase.crashlytics.internal.send.a
            @Override // java.lang.Runnable
            public final void run() {
                ReportQueue.this.lambda$flushScheduledReportsIfAble$0(countDownLatch);
            }
        }).start();
        Utils.awaitUninterruptibly(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public ReportQueue(double d4, double d5, long j4, f fVar, OnDemandCounter onDemandCounter) {
        this.ratePerMinute = d4;
        this.base = d5;
        this.stepDurationMs = j4;
        this.transport = fVar;
        this.onDemandCounter = onDemandCounter;
        this.startTimeMs = SystemClock.elapsedRealtime();
        int i = (int) d4;
        this.queueCapacity = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.queue = arrayBlockingQueue;
        this.singleThreadExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.step = 0;
        this.lastUpdatedMs = 0L;
    }
}
