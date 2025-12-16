package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzkc extends zzke {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zzkc(byte[] bArr, int i, int i4, boolean z3, zzkb zzkbVar) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i) throws zzll {
        int i4 = this.zze;
        this.zze = 0;
        int i5 = this.zzc + this.zzd;
        this.zzc = i5;
        if (i5 <= 0) {
            this.zzd = 0;
            return i4;
        }
        this.zzd = i5;
        this.zzc = 0;
        return i4;
    }
}
