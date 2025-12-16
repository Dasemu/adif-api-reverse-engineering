package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Set;
import s.b;
import s.e;
import s.j;

/* loaded from: classes3.dex */
public final class zal {
    private int zad;
    private final e zab = new j(0);
    private final TaskCompletionSource zac = new TaskCompletionSource();
    private boolean zae = false;
    private final e zaa = new j(0);

    /* JADX WARN: Type inference failed for: r0v0, types: [s.e, s.j] */
    /* JADX WARN: Type inference failed for: r0v2, types: [s.e, s.j] */
    public zal(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zaa.put(((HasApiKey) it.next()).getApiKey(), null);
        }
        this.zad = ((b) this.zaa.keySet()).f8332a.f8352c;
    }

    public final Task zaa() {
        return this.zac.getTask();
    }

    public final Set zab() {
        return this.zaa.keySet();
    }

    public final void zac(ApiKey apiKey, ConnectionResult connectionResult, String str) {
        this.zaa.put(apiKey, connectionResult);
        this.zab.put(apiKey, str);
        this.zad--;
        if (!connectionResult.isSuccess()) {
            this.zae = true;
        }
        if (this.zad == 0) {
            if (!this.zae) {
                this.zac.setResult(this.zab);
            } else {
                this.zac.setException(new AvailabilityException(this.zaa));
            }
        }
    }
}
