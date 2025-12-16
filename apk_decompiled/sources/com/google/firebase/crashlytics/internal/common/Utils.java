package com.google.firebase.crashlytics.internal.common;

import I2.k;
import android.annotation.SuppressLint;
import android.os.Looper;
import androidx.fragment.app.RunnableC0143e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class Utils {
    private static final ExecutorService TASK_CONTINUATION_EXECUTOR_SERVICE = ExecutorUtils.buildSingleThreadExecutorService("awaitEvenIfOnMainThread task continuation executor");
    private static final int TIMEOUT_SEC = 4;

    private Utils() {
    }

    public static <T> T awaitEvenIfOnMainThread(Task<T> task) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(TASK_CONTINUATION_EXECUTOR_SERVICE, new k(countDownLatch, 18));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new TimeoutException();
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j4, TimeUnit timeUnit) {
        boolean z3 = false;
        try {
            long nanos = timeUnit.toNanos(j4);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z3 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z3) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ Object b(CountDownLatch countDownLatch, Task task) {
        return lambda$awaitEvenIfOnMainThread$4(countDownLatch, task);
    }

    public static <T> Task<T> callTask(Executor executor, Callable<Task<T>> callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new RunnableC0143e(callable, executor, taskCompletionSource, 3));
        return taskCompletionSource.getTask();
    }

    public static /* synthetic */ Object lambda$awaitEvenIfOnMainThread$4(CountDownLatch countDownLatch, Task task) throws Exception {
        countDownLatch.countDown();
        return null;
    }

    public static /* synthetic */ Object lambda$callTask$2(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    public static /* synthetic */ void lambda$callTask$3(Callable callable, Executor executor, TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).continueWith(executor, new d(1, taskCompletionSource));
        } catch (Exception e4) {
            taskCompletionSource.setException(e4);
        }
    }

    public static /* synthetic */ Void lambda$race$0(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }

    public static /* synthetic */ Void lambda$race$1(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }

    @SuppressLint({"TaskMainThread"})
    public static <T> Task<T> race(Task<T> task, Task<T> task2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        d dVar = new d(0, taskCompletionSource);
        task.continueWith(dVar);
        task2.continueWith(dVar);
        return taskCompletionSource.getTask();
    }

    public static <T> Task<T> race(Executor executor, Task<T> task, Task<T> task2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        d dVar = new d(2, taskCompletionSource);
        task.continueWith(executor, dVar);
        task2.continueWith(executor, dVar);
        return taskCompletionSource.getTask();
    }
}
