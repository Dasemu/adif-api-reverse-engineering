package com.google.android.gms.internal.location;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.coroutines.test.TestBuildersKt;

/* loaded from: classes3.dex */
public final class zzdj {
    private static final SimpleDateFormat zza;
    private static final SimpleDateFormat zzb;
    private static final StringBuilder zzc;

    static {
        Locale locale = Locale.ROOT;
        zza = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        zzb = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        zzc = new StringBuilder(33);
    }

    public static String zza(long j4) {
        String sb;
        StringBuilder sb2 = zzc;
        synchronized (sb2) {
            sb2.setLength(0);
            zzb(j4, sb2);
            sb = sb2.toString();
        }
        return sb;
    }

    public static void zzb(long j4, StringBuilder sb) {
        if (j4 == 0) {
            sb.append("0s");
            return;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z3 = false;
        if (j4 < 0) {
            sb.append("-");
            if (j4 != Long.MIN_VALUE) {
                j4 = -j4;
            } else {
                j4 = LongCompanionObject.MAX_VALUE;
                z3 = true;
            }
        }
        if (j4 >= 86400000) {
            sb.append(j4 / 86400000);
            sb.append("d");
            j4 %= 86400000;
        }
        if (true == z3) {
            j4 = 25975808;
        }
        if (j4 >= 3600000) {
            sb.append(j4 / 3600000);
            sb.append("h");
            j4 %= 3600000;
        }
        if (j4 >= TestBuildersKt.DEFAULT_DISPATCH_TIMEOUT_MS) {
            sb.append(j4 / TestBuildersKt.DEFAULT_DISPATCH_TIMEOUT_MS);
            sb.append("m");
            j4 %= TestBuildersKt.DEFAULT_DISPATCH_TIMEOUT_MS;
        }
        if (j4 >= 1000) {
            sb.append(j4 / 1000);
            sb.append("s");
            j4 %= 1000;
        }
        if (j4 > 0) {
            sb.append(j4);
            sb.append("ms");
        }
    }
}
