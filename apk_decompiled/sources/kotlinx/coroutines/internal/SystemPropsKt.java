package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(d1 = {"kotlinx/coroutines/internal/SystemPropsKt__SystemPropsKt", "kotlinx/coroutines/internal/SystemPropsKt__SystemProps_commonKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SystemPropsKt {
    public static final int getAVAILABLE_PROCESSORS() {
        return SystemPropsKt__SystemPropsKt.getAVAILABLE_PROCESSORS();
    }

    public static final int systemProp(String str, int i, int i4, int i5) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, i, i4, i5);
    }

    public static final long systemProp(String str, long j4, long j5, long j6) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, j4, j5, j6);
    }

    public static final String systemProp(String str) {
        return SystemPropsKt__SystemPropsKt.systemProp(str);
    }

    public static final String systemProp(String str, String str2) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, str2);
    }

    public static final boolean systemProp(String str, boolean z3) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, z3);
    }
}
