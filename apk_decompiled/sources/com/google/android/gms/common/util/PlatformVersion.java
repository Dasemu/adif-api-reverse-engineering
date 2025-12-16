package com.google.android.gms.common.util;

import K.b;
import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

@VisibleForTesting
@KeepForSdk
/* loaded from: classes3.dex */
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @KeepForSdk
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastJellyBean() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR2() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastKitKat() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastKitKatWatch() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastLollipop() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastLollipopMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastM() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastN() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastO() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastP() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastQ() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @KeepForSdk
    public static boolean isAtLeastS() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @KeepForSdk
    public static boolean isAtLeastSv2() {
        return Build.VERSION.SDK_INT >= 32;
    }

    @KeepForSdk
    public static boolean isAtLeastT() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }

    @KeepForSdk
    public static boolean isAtLeastU() {
        if (!isAtLeastT()) {
            return false;
        }
        int i = b.f966a;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            return true;
        }
        if (i4 >= 33) {
            String buildCodename = Build.VERSION.CODENAME;
            Intrinsics.checkNotNullExpressionValue(buildCodename, "CODENAME");
            Intrinsics.checkNotNullParameter("UpsideDownCake", "codename");
            Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
            if (!Intrinsics.areEqual("REL", buildCodename)) {
                Locale locale = Locale.ROOT;
                String upperCase = buildCodename.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                String upperCase2 = "UpsideDownCake".toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                if (upperCase.compareTo(upperCase2) >= 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
