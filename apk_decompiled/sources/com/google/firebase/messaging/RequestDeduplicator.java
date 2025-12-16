package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class RequestDeduplicator {
    private final Executor executor;
    private final Map<String, Task<String>> getTokenRequests = new s.j(0);

    /* loaded from: classes3.dex */
    public interface GetTokenRequest {
        Task<String> start();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.google.android.gms.tasks.Task<java.lang.String>>, s.j] */
    public RequestDeduplicator(Executor executor) {
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getOrStartGetTokenRequest$0(String str, Task task) throws Exception {
        synchronized (this) {
            this.getTokenRequests.remove(str);
        }
        return task;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Task<String> getOrStartGetTokenRequest(final String str, GetTokenRequest getTokenRequest) {
        Task<String> task = this.getTokenRequests.get(str);
        if (task != null) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Making new request for: " + str);
        }
        Task continueWithTask = getTokenRequest.start().continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.messaging.m
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task lambda$getOrStartGetTokenRequest$0;
                lambda$getOrStartGetTokenRequest$0 = RequestDeduplicator.this.lambda$getOrStartGetTokenRequest$0(str, task2);
                return lambda$getOrStartGetTokenRequest$0;
            }
        });
        this.getTokenRequests.put(str, continueWithTask);
        return continueWithTask;
    }
}
