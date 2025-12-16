package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import kotlin.UByte;

@KeepForSdk
/* loaded from: classes3.dex */
public final class HexDumpUtils {
    @KeepForSdk
    public static String dump(byte[] bArr, int i, int i4, boolean z3) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i < 0 || i4 <= 0 || i + i4 > length) {
            return null;
        }
        StringBuilder sb = new StringBuilder(((i4 + 15) / 16) * (z3 ? 75 : 57));
        int i5 = i4;
        int i6 = 0;
        int i7 = 0;
        while (i5 > 0) {
            if (i6 == 0) {
                if (i4 < 65536) {
                    sb.append(String.format("%04X:", Integer.valueOf(i)));
                } else {
                    sb.append(String.format("%08X:", Integer.valueOf(i)));
                }
                i7 = i;
            } else if (i6 == 8) {
                sb.append(" -");
            }
            sb.append(String.format(" %02X", Integer.valueOf(bArr[i] & UByte.MAX_VALUE)));
            i5--;
            i6++;
            if (z3 && (i6 == 16 || i5 == 0)) {
                int i8 = 16 - i6;
                if (i8 > 0) {
                    for (int i9 = 0; i9 < i8; i9++) {
                        sb.append("   ");
                    }
                }
                if (i8 >= 8) {
                    sb.append("  ");
                }
                sb.append("  ");
                for (int i10 = 0; i10 < i6; i10++) {
                    char c4 = (char) bArr[i7 + i10];
                    if (c4 < ' ' || c4 > '~') {
                        c4 = '.';
                    }
                    sb.append(c4);
                }
            }
            if (i6 == 16 || i5 == 0) {
                sb.append('\n');
                i6 = 0;
            }
            i++;
        }
        return sb.toString();
    }
}
