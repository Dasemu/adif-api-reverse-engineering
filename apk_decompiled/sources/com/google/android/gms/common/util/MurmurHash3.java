package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import kotlin.KotlinVersion;

@KeepForSdk
/* loaded from: classes3.dex */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(byte[] bArr, int i, int i4, int i5) {
        int i6 = (i4 & (-4)) + i;
        while (i < i6) {
            int i7 = ((bArr[i] & KotlinVersion.MAX_COMPONENT_VALUE) | ((bArr[i + 1] & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | ((bArr[i + 2] & KotlinVersion.MAX_COMPONENT_VALUE) << 16) | (bArr[i + 3] << 24)) * (-862048943);
            int i8 = i5 ^ (((i7 << 15) | (i7 >>> 17)) * 461845907);
            i5 = (((i8 >>> 19) | (i8 << 13)) * 5) - 430675100;
            i += 4;
        }
        int i9 = i4 & 3;
        if (i9 != 1) {
            if (i9 != 2) {
                r3 = i9 == 3 ? (bArr[i6 + 2] & KotlinVersion.MAX_COMPONENT_VALUE) << 16 : 0;
                int i10 = i5 ^ i4;
                int i11 = (i10 ^ (i10 >>> 16)) * (-2048144789);
                int i12 = (i11 ^ (i11 >>> 13)) * (-1028477387);
                return i12 ^ (i12 >>> 16);
            }
            r3 |= (bArr[i6 + 1] & KotlinVersion.MAX_COMPONENT_VALUE) << 8;
        }
        int i13 = ((bArr[i6] & KotlinVersion.MAX_COMPONENT_VALUE) | r3) * (-862048943);
        i5 ^= ((i13 >>> 17) | (i13 << 15)) * 461845907;
        int i102 = i5 ^ i4;
        int i112 = (i102 ^ (i102 >>> 16)) * (-2048144789);
        int i122 = (i112 ^ (i112 >>> 13)) * (-1028477387);
        return i122 ^ (i122 >>> 16);
    }
}
