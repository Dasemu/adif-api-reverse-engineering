package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzns extends zznt {
    public zzns(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final double zza(Object obj, long j4) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j4));
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final float zzb(Object obj, long j4) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j4));
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final void zzc(Object obj, long j4, boolean z3) {
        if (zznu.zzb) {
            zznu.zzD(obj, j4, r3 ? (byte) 1 : (byte) 0);
        } else {
            zznu.zzE(obj, j4, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final void zzd(Object obj, long j4, byte b4) {
        if (zznu.zzb) {
            zznu.zzD(obj, j4, b4);
        } else {
            zznu.zzE(obj, j4, b4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final void zze(Object obj, long j4, double d4) {
        this.zza.putLong(obj, j4, Double.doubleToLongBits(d4));
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final void zzf(Object obj, long j4, float f2) {
        this.zza.putInt(obj, j4, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final boolean zzg(Object obj, long j4) {
        return zznu.zzb ? zznu.zzt(obj, j4) : zznu.zzu(obj, j4);
    }
}
