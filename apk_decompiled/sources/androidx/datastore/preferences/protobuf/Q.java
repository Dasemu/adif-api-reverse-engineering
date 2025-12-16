package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f2861a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f2862b = new Object();

    public static void a(byte b4, byte b5, byte b6, byte b7, char[] cArr, int i) {
        if (!h(b5)) {
            if ((((b5 + 112) + (b4 << 28)) >> 30) == 0 && !h(b6) && !h(b7)) {
                int i4 = ((b4 & 7) << 18) | ((b5 & 63) << 12) | ((b6 & 63) << 6) | (b7 & 63);
                cArr[i] = (char) ((i4 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i4 & 1023) + 56320);
                return;
            }
        }
        throw A.a();
    }

    public static void b(byte b4, byte b5, char[] cArr, int i) {
        if (b4 < -62 || h(b5)) {
            throw A.a();
        }
        cArr[i] = (char) (((b4 & 31) << 6) | (b5 & 63));
    }

    public static void c(byte b4, byte b5, byte b6, char[] cArr, int i) {
        if (h(b5) || ((b4 == -32 && b5 < -96) || ((b4 == -19 && b5 >= -96) || h(b6)))) {
            throw A.a();
        }
        cArr[i] = (char) (((b4 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
    }

    public static final String d(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static String g(C0116g c0116g) {
        StringBuilder sb = new StringBuilder(c0116g.size());
        for (int i = 0; i < c0116g.size(); i++) {
            byte b4 = c0116g.f2912b[i];
            if (b4 == 34) {
                sb.append("\\\"");
            } else if (b4 == 39) {
                sb.append("\\'");
            } else if (b4 != 92) {
                switch (b4) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b4 < 32 || b4 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b4 >>> 6) & 3) + 48));
                            sb.append((char) (((b4 >>> 3) & 7) + 48));
                            sb.append((char) ((b4 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b4);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static boolean h(byte b4) {
        return b4 > -65;
    }

    public static final void j(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                j(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0116g c0116g = C0116g.f2909c;
            sb.append(g(new C0116g(((String) obj).getBytes(AbstractC0133y.f2975a))));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof C0116g) {
            sb.append(": \"");
            sb.append(g((C0116g) obj));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof AbstractC0130v) {
            sb.append(" {");
            k((AbstractC0130v) obj, sb, i + 2);
            sb.append("\n");
            while (i4 < i) {
                sb.append(' ');
                i4++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i6 = i + 2;
        j(sb, i6, "key", entry.getKey());
        j(sb, i6, "value", entry.getValue());
        sb.append("\n");
        while (i4 < i) {
            sb.append(' ');
            i4++;
        }
        sb.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ad, code lost:
    
        if (((java.lang.Integer) r11).intValue() == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01af, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c1, code lost:
    
        if (((java.lang.Float) r11).floatValue() == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d3, code lost:
    
        if (((java.lang.Double) r11).doubleValue() == com.google.firebase.remoteconfig.FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(androidx.datastore.preferences.protobuf.AbstractC0130v r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Q.k(androidx.datastore.preferences.protobuf.v, java.lang.StringBuilder, int):void");
    }

    public abstract String e(int i, int i4, byte[] bArr);

    public abstract int f(String str, byte[] bArr, int i, int i4);

    public abstract int i(byte[] bArr, int i, int i4);

    public abstract void l(int i, int i4, byte[] bArr);
}
