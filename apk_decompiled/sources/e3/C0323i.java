package e3;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e3.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0323i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String a2 = (String) obj;
        String b4 = (String) obj2;
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        int min = Math.min(a2.length(), b4.length());
        for (int i = 4; i < min; i++) {
            char charAt = a2.charAt(i);
            char charAt2 = b4.charAt(i);
            if (charAt != charAt2) {
                return Intrinsics.compare((int) charAt, (int) charAt2) < 0 ? -1 : 1;
            }
        }
        int length = a2.length();
        int length2 = b4.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
