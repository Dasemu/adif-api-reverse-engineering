package com.google.android.gms.internal.common;

import java.util.Arrays;

/* loaded from: classes3.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzaa(int i) {
    }

    private final void zzb(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
                this.zzc = false;
                return;
            }
            return;
        }
        int i4 = length + (length >> 1) + 1;
        if (i4 < i) {
            int highestOneBit = Integer.highestOneBit(i - 1);
            i4 = highestOneBit + highestOneBit;
        }
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        this.zza = Arrays.copyOf(objArr, i4);
        this.zzc = false;
    }

    public final zzaa zza(Object obj) {
        obj.getClass();
        zzb(this.zzb + 1);
        Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = obj;
        return this;
    }
}
