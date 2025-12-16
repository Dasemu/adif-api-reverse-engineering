package com.google.firebase.storage;

import com.google.firebase.storage.StorageTask;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskListenerImpl f6078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6079c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StorageTask.ProvideError f6080d;

    public /* synthetic */ k(TaskListenerImpl taskListenerImpl, Object obj, StorageTask.ProvideError provideError, int i) {
        this.f6077a = i;
        this.f6078b = taskListenerImpl;
        this.f6079c = obj;
        this.f6080d = provideError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6077a) {
            case 0:
                this.f6078b.lambda$onInternalStateChanged$2(this.f6079c, this.f6080d);
                return;
            default:
                this.f6078b.lambda$addListener$1(this.f6079c, this.f6080d);
                return;
        }
    }
}
