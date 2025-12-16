package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class zzlj {
    static final Charset zza = Charset.forName("US-ASCII");
    static final Charset zzb = Charset.forName("UTF-8");
    static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzke zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzkc zzkcVar = new zzkc(bArr, 0, 0, false, null);
        try {
            zzkcVar.zza(0);
            zzf = zzkcVar;
        } catch (zzll e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static int zza(boolean z3) {
        return z3 ? 1231 : 1237;
    }

    public static int zzb(int i, byte[] bArr, int i4, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            i = (i * 31) + bArr[i6];
        }
        return i;
    }

    public static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, zzb);
    }
}
