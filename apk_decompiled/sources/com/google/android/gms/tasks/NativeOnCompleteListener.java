package com.google.android.gms.tasks;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes3.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    @KeepForSdk
    public NativeOnCompleteListener(long j4) {
        this.zza = j4;
    }

    @KeepForSdk
    public static void createAndAddCallback(Task<Object> task, long j4) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j4));
    }

    @KeepForSdk
    public native void nativeOnComplete(long j4, Object obj, boolean z3, boolean z4, String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @KeepForSdk
    public void onComplete(Task<Object> task) {
        Object obj;
        String str;
        Exception exception;
        if (task.isSuccessful()) {
            obj = task.getResult();
            str = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            obj = null;
            str = null;
        } else {
            str = exception.getMessage();
            obj = null;
        }
        nativeOnComplete(this.zza, obj, task.isSuccessful(), task.isCanceled(), str);
    }
}
