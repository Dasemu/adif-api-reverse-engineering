package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zznt {
    final Unsafe zza;

    public zznt(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j4);

    public abstract float zzb(Object obj, long j4);

    public abstract void zzc(Object obj, long j4, boolean z3);

    public abstract void zzd(Object obj, long j4, byte b4);

    public abstract void zze(Object obj, long j4, double d4);

    public abstract void zzf(Object obj, long j4, float f2);

    public abstract boolean zzg(Object obj, long j4);
}
