package l3;

import f0.C0338b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import r3.C0579k;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0579k f7403a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f7404b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f7405c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f7406d;

    static {
        String replace$default;
        C0579k c0579k = C0579k.f8285d;
        f7403a = C0338b.n("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f7404b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f7405c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            replace$default = StringsKt__StringsJVMKt.replace$default(f3.c.h("%8s", binaryString), ' ', '0', false, 4, (Object) null);
            strArr[i] = replace$default;
        }
        f7406d = strArr;
        String[] strArr2 = f7405c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i4 = iArr[0];
        strArr2[i4 | 8] = C.w.r(new StringBuilder(), strArr2[i4], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            int i7 = iArr[0];
            String[] strArr3 = f7405c;
            int i8 = i7 | i6;
            strArr3[i8] = strArr3[i7] + '|' + strArr3[i6];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i7]);
            sb.append('|');
            strArr3[i8 | 8] = C.w.r(sb, strArr3[i6], "|PADDED");
        }
        int length = f7405c.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr4 = f7405c;
            if (strArr4[i9] == null) {
                strArr4[i9] = f7406d[i9];
            }
        }
    }

    public static String a(boolean z3, int i, int i4, int i5, int i6) {
        String str;
        String str2;
        String[] strArr = f7404b;
        String h = i5 < strArr.length ? strArr[i5] : f3.c.h("0x%02x", Integer.valueOf(i5));
        if (i6 == 0) {
            str = "";
        } else {
            String[] strArr2 = f7406d;
            if (i5 != 2 && i5 != 3) {
                if (i5 == 4 || i5 == 6) {
                    str = i6 == 1 ? "ACK" : strArr2[i6];
                } else if (i5 != 7 && i5 != 8) {
                    String[] strArr3 = f7405c;
                    if (i6 < strArr3.length) {
                        str2 = strArr3[i6];
                        Intrinsics.checkNotNull(str2);
                    } else {
                        str2 = strArr2[i6];
                    }
                    str = (i5 != 5 || (i6 & 4) == 0) ? (i5 != 0 || (i6 & 32) == 0) ? str2 : StringsKt__StringsJVMKt.replace$default(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null) : StringsKt__StringsJVMKt.replace$default(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
                }
            }
            str = strArr2[i6];
        }
        return f3.c.h("%s 0x%08x %5d %-13s %s", z3 ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i4), h, str);
    }
}
