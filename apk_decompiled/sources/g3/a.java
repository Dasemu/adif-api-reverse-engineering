package g3;

import e3.N;
import e3.O;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class a {
    public static final O a(O o4) {
        if ((o4 != null ? o4.f6297g : null) == null) {
            return o4;
        }
        N s4 = o4.s();
        s4.f6286g = null;
        return s4.a();
    }

    public static boolean b(String str) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        boolean equals4;
        boolean equals5;
        boolean equals6;
        boolean equals7;
        boolean equals8;
        equals = StringsKt__StringsJVMKt.equals("Connection", str, true);
        if (equals) {
            return false;
        }
        equals2 = StringsKt__StringsJVMKt.equals("Keep-Alive", str, true);
        if (equals2) {
            return false;
        }
        equals3 = StringsKt__StringsJVMKt.equals("Proxy-Authenticate", str, true);
        if (equals3) {
            return false;
        }
        equals4 = StringsKt__StringsJVMKt.equals("Proxy-Authorization", str, true);
        if (equals4) {
            return false;
        }
        equals5 = StringsKt__StringsJVMKt.equals("TE", str, true);
        if (equals5) {
            return false;
        }
        equals6 = StringsKt__StringsJVMKt.equals("Trailers", str, true);
        if (equals6) {
            return false;
        }
        equals7 = StringsKt__StringsJVMKt.equals("Transfer-Encoding", str, true);
        if (equals7) {
            return false;
        }
        equals8 = StringsKt__StringsJVMKt.equals("Upgrade", str, true);
        return !equals8;
    }
}
