package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f5971b;

    public /* synthetic */ d(int i, TaskCompletionSource taskCompletionSource) {
        this.f5970a = i;
        this.f5971b = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Void lambda$race$0;
        Object lambda$callTask$2;
        Void lambda$race$1;
        int i = this.f5970a;
        TaskCompletionSource taskCompletionSource = this.f5971b;
        switch (i) {
            case 0:
                lambda$race$0 = Utils.lambda$race$0(taskCompletionSource, task);
                return lambda$race$0;
            case 1:
                lambda$callTask$2 = Utils.lambda$callTask$2(taskCompletionSource, task);
                return lambda$callTask$2;
            default:
                lambda$race$1 = Utils.lambda$race$1(taskCompletionSource, task);
                return lambda$race$1;
        }
    }
}
