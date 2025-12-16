package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import kotlin.UByte;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public class Hex {
    private static final char[] zza = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] zzb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @KeepForSdk
    public static String bytesToStringLowercase(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b4 : bArr) {
            int i4 = b4 & UByte.MAX_VALUE;
            int i5 = i + 1;
            char[] cArr2 = zzb;
            cArr[i] = cArr2[i4 >>> 4];
            i += 2;
            cArr[i5] = cArr2[b4 & 15];
        }
        return new String(cArr);
    }

    @KeepForSdk
    public static String bytesToStringUppercase(byte[] bArr) {
        return bytesToStringUppercase(bArr, false);
    }

    @KeepForSdk
    public static byte[] stringToBytes(String str) throws IllegalArgumentException {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i = 0;
        while (i < length) {
            int i4 = i + 2;
            bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i4), 16);
            i = i4;
        }
        return bArr;
    }

    @KeepForSdk
    public static String bytesToStringUppercase(byte[] bArr, boolean z3) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length && (!z3 || i != length - 1 || (bArr[i] & UByte.MAX_VALUE) != 0); i++) {
            char[] cArr = zza;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }
}
