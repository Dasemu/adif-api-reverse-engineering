package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzae {
    public static int zza(int i) {
        boolean z3 = true;
        if (i != 100 && i != 102 && i != 104) {
            if (i == 105) {
                i = 105;
            } else {
                z3 = false;
            }
        }
        Preconditions.checkArgument(z3, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
        return i;
    }

    public static String zzb(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
