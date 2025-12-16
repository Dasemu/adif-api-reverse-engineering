package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zznx extends zznw {
    @Override // com.google.android.gms.internal.measurement.zznw
    public final int zza(int i, byte[] bArr, int i4, int i5) {
        while (i4 < i5 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 >= i5) {
            return 0;
        }
        while (i4 < i5) {
            int i6 = i4 + 1;
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                i4 = i6;
            } else {
                if (b4 < -32) {
                    if (i6 >= i5) {
                        return b4;
                    }
                    if (b4 >= -62) {
                        i4 += 2;
                        if (bArr[i6] > -65) {
                        }
                    }
                    return -1;
                }
                if (b4 >= -16) {
                    if (i6 >= i5 - 2) {
                        return zznz.zza(bArr, i6, i5);
                    }
                    int i7 = i4 + 2;
                    byte b5 = bArr[i6];
                    if (b5 <= -65) {
                        if ((((b5 + 112) + (b4 << 28)) >> 30) == 0) {
                            int i8 = i4 + 3;
                            if (bArr[i7] <= -65) {
                                i4 += 4;
                                if (bArr[i8] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                if (i6 >= i5 - 1) {
                    return zznz.zza(bArr, i6, i5);
                }
                int i9 = i4 + 2;
                byte b6 = bArr[i6];
                if (b6 > -65 || (b4 == -32 && b6 < -96)) {
                    return -1;
                }
                if (b4 == -19 && b6 >= -96) {
                    return -1;
                }
                i4 += 3;
                if (bArr[i9] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
