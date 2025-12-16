package com.google.firebase.storage.ktx;

import com.google.firebase.storage.StorageTask;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f6085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StorageTask.SnapshotBase f6086c;

    public /* synthetic */ d(ProducerScope producerScope, StorageTask.SnapshotBase snapshotBase, int i) {
        this.f6084a = i;
        this.f6085b = producerScope;
        this.f6086c = snapshotBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6084a) {
            case 0:
                StorageKt$taskState$1.c(this.f6085b, this.f6086c);
                return;
            default:
                StorageKt$taskState$1.d(this.f6085b, this.f6086c);
                return;
        }
    }
}
