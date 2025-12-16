package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a,\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u001a,\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\t"}, d2 = {"systemProp", "", "propertyName", "", "defaultValue", "", "minValue", "maxValue", "", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class SystemPropsKt__SystemProps_commonKt {
    public static final boolean systemProp(String str, boolean z3) {
        String systemProp = SystemPropsKt.systemProp(str);
        return systemProp != null ? Boolean.parseBoolean(systemProp) : z3;
    }

    public static /* synthetic */ int systemProp$default(String str, int i, int i4, int i5, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            i4 = 1;
        }
        if ((i6 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return SystemPropsKt.systemProp(str, i, i4, i5);
    }

    public static final int systemProp(String str, int i, int i4, int i5) {
        return (int) SystemPropsKt.systemProp(str, i, i4, i5);
    }

    public static /* synthetic */ long systemProp$default(String str, long j4, long j5, long j6, int i, Object obj) {
        if ((i & 4) != 0) {
            j5 = 1;
        }
        long j7 = j5;
        if ((i & 8) != 0) {
            j6 = LongCompanionObject.MAX_VALUE;
        }
        return SystemPropsKt.systemProp(str, j4, j7, j6);
    }

    public static final long systemProp(String str, long j4, long j5, long j6) {
        String systemProp = SystemPropsKt.systemProp(str);
        if (systemProp == null) {
            return j4;
        }
        Long longOrNull = StringsKt.toLongOrNull(systemProp);
        if (longOrNull == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + systemProp + '\'').toString());
        }
        long longValue = longOrNull.longValue();
        if (j5 <= longValue && longValue <= j6) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j5 + ".." + j6 + ", but is '" + longValue + '\'').toString());
    }

    public static final String systemProp(String str, String str2) {
        String systemProp = SystemPropsKt.systemProp(str);
        return systemProp == null ? str2 : systemProp;
    }
}
