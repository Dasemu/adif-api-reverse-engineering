package j3;

import e3.O;
import f0.C0338b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import r3.C0579k;

/* loaded from: classes3.dex */
public abstract class f {
    static {
        C0579k c0579k = C0579k.f8285d;
        C0338b.n("\"\\");
        C0338b.n("\t ,=");
    }

    public static final boolean a(O o4) {
        boolean equals;
        Intrinsics.checkNotNullParameter(o4, "<this>");
        if (Intrinsics.areEqual(o4.f6291a.f6268b, "HEAD")) {
            return false;
        }
        int i = o4.f6294d;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || f3.c.j(o4) != -1) {
            return true;
        }
        equals = StringsKt__StringsJVMKt.equals("chunked", O.d(o4, "Transfer-Encoding"), true);
        return equals;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x01f5, code lost:
    
        if (f3.c.f6474f.matches(r0) == false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0251 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(e3.C0329o r36, e3.w r37, e3.C0334u r38) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.f.b(e3.o, e3.w, e3.u):void");
    }
}
