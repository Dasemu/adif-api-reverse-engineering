package com.google.android.gms.internal.location;

import com.google.android.gms.measurement.internal.a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class zzdn {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i = 0;
        int i4 = 0;
        while (true) {
            length = objArr.length;
            if (i4 >= length) {
                break;
            }
            Object obj = objArr[i4];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e4) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e4);
                    StringBuilder p = a.p("<", str2, " threw ");
                    p.append(e4.getClass().getName());
                    p.append(">");
                    sb = p.toString();
                }
            }
            objArr[i4] = sb;
            i4++;
        }
        StringBuilder sb2 = new StringBuilder((length * 16) + str.length());
        int i5 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i5)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i5, indexOf);
            sb2.append(objArr[i]);
            i++;
            i5 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i5, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i6 = i + 1; i6 < objArr.length; i6++) {
                sb2.append(", ");
                sb2.append(objArr[i6]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
