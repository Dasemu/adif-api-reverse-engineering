package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzbz extends zzce {
    private final AtomicReference zza = new AtomicReference();
    private boolean zzb;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0003, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object zzf(android.os.Bundle r3, java.lang.Class r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L39
            java.lang.String r1 = "r"
            java.lang.Object r3 = r3.get(r1)
            if (r3 == 0) goto L39
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> L10
            return r3
        L10:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected object type. Expected, Received: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ", "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbz.zzf(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final Bundle zzb(long j4) {
        Bundle bundle;
        synchronized (this.zza) {
            if (!this.zzb) {
                try {
                    this.zza.wait(j4);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.zza.get();
        }
        return bundle;
    }

    public final Long zzc(long j4) {
        return (Long) zzf(zzb(j4), Long.class);
    }

    public final String zzd(long j4) {
        return (String) zzf(zzb(j4), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.zzcf
    public final void zze(Bundle bundle) {
        synchronized (this.zza) {
            try {
                try {
                    this.zza.set(bundle);
                    this.zzb = true;
                } finally {
                    this.zza.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
