package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgz extends ContentObserver {
    public zzgz(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = zzha.zzl;
        atomicBoolean.set(true);
    }
}
