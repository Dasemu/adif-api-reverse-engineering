package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class zzad<T> implements zzae<T> {
    private final CountDownLatch zza = new CountDownLatch(1);

    private zzad() {
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.zza.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.zza.countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t2) {
        this.zza.countDown();
    }

    public final void zza() throws InterruptedException {
        this.zza.await();
    }

    public final boolean zzb(long j4, TimeUnit timeUnit) throws InterruptedException {
        return this.zza.await(j4, timeUnit);
    }

    public /* synthetic */ zzad(zzac zzacVar) {
    }
}
