package com.google.android.gms.internal.common;

/* loaded from: classes3.dex */
final class zzl extends zzk {
    private final char zza;

    public zzl(char c4) {
        this.zza = c4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        int i = this.zza;
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            cArr[5 - i4] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c4) {
        return c4 == this.zza;
    }
}
