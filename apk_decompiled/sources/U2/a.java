package U2;

import java.util.TimeZone;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f1791a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i, char c4) {
        return i < str.length() && str.charAt(i) == c4;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4 A[Catch: IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x00da, TRY_LEAVE, TryCatch #0 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x00da, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x0055, B:20:0x0065, B:21:0x0067, B:23:0x0073, B:24:0x0076, B:26:0x007c, B:30:0x0086, B:35:0x0096, B:37:0x009e, B:38:0x00a2, B:40:0x00a8, B:44:0x00b5, B:48:0x00c0, B:53:0x00ee, B:55:0x00f4, B:59:0x01a6, B:59:0x01a6, B:59:0x01a6, B:64:0x0106, B:64:0x0106, B:64:0x0106, B:65:0x0121, B:65:0x0121, B:65:0x0121, B:66:0x0122, B:66:0x0122, B:66:0x0122, B:69:0x013f, B:69:0x013f, B:69:0x013f, B:71:0x014c, B:71:0x014c, B:71:0x014c, B:74:0x0155, B:74:0x0155, B:74:0x0155, B:76:0x0174, B:76:0x0174, B:76:0x0174, B:79:0x0183, B:79:0x0183, B:79:0x0183, B:80:0x01a5, B:80:0x01a5, B:80:0x01a5, B:81:0x012e, B:81:0x012e, B:81:0x012e, B:82:0x01d7, B:82:0x01d7, B:82:0x01d7, B:83:0x01de, B:83:0x01de, B:83:0x01de, B:84:0x00d0, B:85:0x00d3, B:88:0x00bc), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d7 A[Catch: IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x00da, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x00da, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x00da, TryCatch #0 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x00da, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x0055, B:20:0x0065, B:21:0x0067, B:23:0x0073, B:24:0x0076, B:26:0x007c, B:30:0x0086, B:35:0x0096, B:37:0x009e, B:38:0x00a2, B:40:0x00a8, B:44:0x00b5, B:48:0x00c0, B:53:0x00ee, B:55:0x00f4, B:59:0x01a6, B:59:0x01a6, B:59:0x01a6, B:64:0x0106, B:64:0x0106, B:64:0x0106, B:65:0x0121, B:65:0x0121, B:65:0x0121, B:66:0x0122, B:66:0x0122, B:66:0x0122, B:69:0x013f, B:69:0x013f, B:69:0x013f, B:71:0x014c, B:71:0x014c, B:71:0x014c, B:74:0x0155, B:74:0x0155, B:74:0x0155, B:76:0x0174, B:76:0x0174, B:76:0x0174, B:79:0x0183, B:79:0x0183, B:79:0x0183, B:80:0x01a5, B:80:0x01a5, B:80:0x01a5, B:81:0x012e, B:81:0x012e, B:81:0x012e, B:82:0x01d7, B:82:0x01d7, B:82:0x01d7, B:83:0x01de, B:83:0x01de, B:83:0x01de, B:84:0x00d0, B:85:0x00d3, B:88:0x00bc), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date b(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(String str, int i, int i4) {
        int i5;
        int i6;
        if (i < 0 || i4 > str.length() || i > i4) {
            throw new NumberFormatException(str);
        }
        if (i < i4) {
            i6 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i4));
            }
            i5 = -digit;
        } else {
            i5 = 0;
            i6 = i;
        }
        while (i6 < i4) {
            int i7 = i6 + 1;
            int digit2 = Character.digit(str.charAt(i6), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i4));
            }
            i5 = (i5 * 10) - digit2;
            i6 = i7;
        }
        return -i5;
    }
}
