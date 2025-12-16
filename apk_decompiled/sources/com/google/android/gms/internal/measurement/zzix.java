package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzix extends zziu {
    public zzix() {
        super(4);
    }

    public final zzix zza(Object... objArr) {
        zzjd.zzb(objArr, 15);
        int i = this.zzb;
        int i4 = i + 15;
        Object[] objArr2 = this.zza;
        int length = objArr2.length;
        if (length < i4) {
            int i5 = length + (length >> 1) + 1;
            if (i5 < i4) {
                int highestOneBit = Integer.highestOneBit(i + 14);
                i5 = highestOneBit + highestOneBit;
            }
            if (i5 < 0) {
                i5 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr2, i5);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr2.clone();
            this.zzc = false;
        }
        System.arraycopy(objArr, 0, this.zza, this.zzb, 15);
        this.zzb += 15;
        return this;
    }

    public final zzja zzb() {
        this.zzc = true;
        return zzja.zzg(this.zza, this.zzb);
    }
}
