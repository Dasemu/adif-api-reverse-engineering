package l3;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class s {
    public static int a(int i, int i4, int i5) {
        if ((i4 & 8) != 0) {
            i--;
        }
        if (i5 <= i) {
            return i - i5;
        }
        throw new IOException(C.w.k("PROTOCOL_ERROR padding ", i5, i, " > remaining length "));
    }
}
