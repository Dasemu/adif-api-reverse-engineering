package com.google.android.gms.internal.measurement;

import C.w;
import com.google.android.gms.measurement.internal.a;

/* loaded from: classes3.dex */
final class zzju extends zzjx {
    private final int zzc;

    public zzju(byte[] bArr, int i, int i4) {
        super(bArr);
        zzka.zzj(0, i4, bArr.length);
        this.zzc = i4;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx, com.google.android.gms.internal.measurement.zzka
    public final byte zza(int i) {
        int i4 = this.zzc;
        if (((i4 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(a.l(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(w.k("Index > length: ", i, i4, ", "));
    }

    @Override // com.google.android.gms.internal.measurement.zzjx, com.google.android.gms.internal.measurement.zzka
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx, com.google.android.gms.internal.measurement.zzka
    public final int zzd() {
        return this.zzc;
    }
}
