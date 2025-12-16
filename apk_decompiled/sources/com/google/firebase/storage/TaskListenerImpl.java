package com.google.firebase.storage;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.StorageTask.ProvideError;
import com.google.firebase.storage.internal.ActivityLifecycleListener;
import com.google.firebase.storage.internal.SmartHandler;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class TaskListenerImpl<ListenerTypeT, ResultT extends StorageTask.ProvideError> {
    private OnRaise<ListenerTypeT, ResultT> onRaise;
    private int targetStates;
    private StorageTask<ResultT> task;
    private final Queue<ListenerTypeT> listenerQueue = new ConcurrentLinkedQueue();
    private final HashMap<ListenerTypeT, SmartHandler> handlerMap = new HashMap<>();

    /* loaded from: classes3.dex */
    public interface OnRaise<ListenerTypeT, ResultT> {
        void raise(ListenerTypeT listenertypet, ResultT resultt);
    }

    public TaskListenerImpl(StorageTask<ResultT> storageTask, int i, OnRaise<ListenerTypeT, ResultT> onRaise) {
        this.task = storageTask;
        this.targetStates = i;
        this.onRaise = onRaise;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addListener$1(Object obj, StorageTask.ProvideError provideError) {
        this.onRaise.raise(obj, provideError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInternalStateChanged$2(Object obj, StorageTask.ProvideError provideError) {
        this.onRaise.raise(obj, provideError);
    }

    public void addListener(Activity activity, Executor executor, final ListenerTypeT listenertypet) {
        boolean z3;
        SmartHandler smartHandler;
        Preconditions.checkNotNull(listenertypet);
        synchronized (this.task.getSyncObject()) {
            try {
                z3 = (this.task.getInternalState() & this.targetStates) != 0;
                this.listenerQueue.add(listenertypet);
                smartHandler = new SmartHandler(executor);
                this.handlerMap.put(listenertypet, smartHandler);
                if (activity != null) {
                    Preconditions.checkArgument(!activity.isDestroyed(), "Activity is already destroyed!");
                    ActivityLifecycleListener.getInstance().runOnActivityStopped(activity, listenertypet, new Runnable() { // from class: com.google.firebase.storage.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            TaskListenerImpl.this.lambda$addListener$0(listenertypet);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            smartHandler.callBack(new k(this, listenertypet, this.task.snapState(), 1));
        }
    }

    public int getListenerCount() {
        return Math.max(this.listenerQueue.size(), this.handlerMap.size());
    }

    public void onInternalStateChanged() {
        if ((this.task.getInternalState() & this.targetStates) != 0) {
            ResultT snapState = this.task.snapState();
            for (ListenerTypeT listenertypet : this.listenerQueue) {
                SmartHandler smartHandler = this.handlerMap.get(listenertypet);
                if (smartHandler != null) {
                    smartHandler.callBack(new k(this, listenertypet, snapState, 0));
                }
            }
        }
    }

    /* renamed from: removeListener, reason: merged with bridge method [inline-methods] */
    public void lambda$addListener$0(ListenerTypeT listenertypet) {
        Preconditions.checkNotNull(listenertypet);
        synchronized (this.task.getSyncObject()) {
            this.handlerMap.remove(listenertypet);
            this.listenerQueue.remove(listenertypet);
            ActivityLifecycleListener.getInstance().removeCookie(listenertypet);
        }
    }
}
