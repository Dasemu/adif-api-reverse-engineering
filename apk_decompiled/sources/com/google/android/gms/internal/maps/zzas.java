package com.google.android.gms.internal.maps;

import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes3.dex */
public final class zzas {
    public static int zza(int i, int i4, String str) {
        String zza;
        if (i >= 0 && i < i4) {
            return i;
        }
        if (i < 0) {
            zza = zzat.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i4 < 0) {
                throw new IllegalArgumentException(a.l(i4, "negative size: "));
            }
            zza = zzat.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i, int i4, String str) {
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(zzd(i, i4, FirebaseAnalytics.Param.INDEX));
        }
        return i;
    }

    public static void zzc(int i, int i4, int i5) {
        if (i < 0 || i4 < i || i4 > i5) {
            throw new IndexOutOfBoundsException((i < 0 || i > i5) ? zzd(i, i5, "start index") : (i4 < 0 || i4 > i5) ? zzd(i4, i5, "end index") : zzat.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i)));
        }
    }

    private static String zzd(int i, int i4, String str) {
        if (i < 0) {
            return zzat.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i4 >= 0) {
            return zzat.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(a.l(i4, "negative size: "));
    }
}
