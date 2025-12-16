package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203y {
    public static A a(B state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i = AbstractC0202x.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            return A.ON_DESTROY;
        }
        if (i == 2) {
            return A.ON_STOP;
        }
        if (i != 3) {
            return null;
        }
        return A.ON_PAUSE;
    }

    public static A b(B state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i = AbstractC0202x.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            return A.ON_START;
        }
        if (i == 2) {
            return A.ON_RESUME;
        }
        if (i != 5) {
            return null;
        }
        return A.ON_CREATE;
    }

    public static A c(B state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i = AbstractC0202x.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            return A.ON_CREATE;
        }
        if (i == 2) {
            return A.ON_START;
        }
        if (i != 3) {
            return null;
        }
        return A.ON_RESUME;
    }
}
