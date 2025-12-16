package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public final class k0 {
    public static boolean a(Object obj, Z2.y yVar) {
        int e4 = yVar.e();
        int i = e4 >>> 3;
        int i4 = e4 & 7;
        if (i4 == 0) {
            ((j0) obj).c(i << 3, Long.valueOf(yVar.y()));
            return true;
        }
        if (i4 == 1) {
            ((j0) obj).c((i << 3) | 1, Long.valueOf(yVar.q()));
            return true;
        }
        if (i4 == 2) {
            ((j0) obj).c((i << 3) | 2, yVar.h());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw A.b();
            }
            ((j0) obj).c((i << 3) | 5, Integer.valueOf(yVar.o()));
            return true;
        }
        j0 b4 = j0.b();
        int i5 = i << 3;
        int i6 = i5 | 4;
        while (yVar.d() != Integer.MAX_VALUE && a(b4, yVar)) {
        }
        if (i6 != yVar.e()) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
        b4.f2940e = false;
        ((j0) obj).c(i5 | 3, b4);
        return true;
    }

    public static j0 b() {
        return j0.b();
    }
}
