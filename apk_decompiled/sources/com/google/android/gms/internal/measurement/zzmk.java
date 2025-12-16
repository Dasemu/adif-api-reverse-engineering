package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.Typography;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmk {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzmi zzmiVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzmiVar, sb, 0);
        return sb.toString();
    }

    public static void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i4 = 1; i4 < str.length(); i4++) {
                char charAt = str.charAt(i4);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzni.zza(new zzjx(((String) obj).getBytes(zzlj.zzb))));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof zzka) {
            sb.append(": \"");
            sb.append(zzni.zza((zzka) obj));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof zzlb) {
            sb.append(" {");
            zzd((zzlb) obj, sb, i + 2);
            sb.append("\n");
            zzc(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i5 = i + 2;
        zzb(sb, i5, "key", entry.getKey());
        zzb(sb, i5, "value", entry.getValue());
        sb.append("\n");
        zzc(i, sb);
        sb.append("}");
    }

    private static void zzc(int i, StringBuilder sb) {
        while (i > 0) {
            int i4 = 80;
            if (i <= 80) {
                i4 = i;
            }
            sb.append(zza, 0, i4);
            i -= i4;
        }
    }

    private static void zzd(zzmi zzmiVar, StringBuilder sb, int i) {
        int i4;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzmiVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i5 = 0;
        while (true) {
            i4 = 3;
            if (i5 >= length) {
                break;
            }
            Method method3 = declaredMethods[i5];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i5++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i4);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i, substring.substring(0, substring.length() - 4), zzlb.zzbK(method2, zzmiVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i, substring.substring(0, substring.length() - 3), zzlb.zzbK(method, zzmiVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzbK = zzlb.zzbK(method4, zzmiVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) zzlb.zzbK(method5, zzmiVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb, i, substring, zzbK);
                    } else if (zzbK instanceof Boolean) {
                        if (!((Boolean) zzbK).booleanValue()) {
                        }
                        zzb(sb, i, substring, zzbK);
                    } else if (zzbK instanceof Integer) {
                        if (((Integer) zzbK).intValue() == 0) {
                        }
                        zzb(sb, i, substring, zzbK);
                    } else if (zzbK instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) zzbK).floatValue()) == 0) {
                        }
                        zzb(sb, i, substring, zzbK);
                    } else if (zzbK instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) zzbK).doubleValue()) == 0) {
                        }
                        zzb(sb, i, substring, zzbK);
                    } else {
                        if (zzbK instanceof String) {
                            equals = zzbK.equals("");
                        } else if (zzbK instanceof zzka) {
                            equals = zzbK.equals(zzka.zzb);
                        } else if (zzbK instanceof zzmi) {
                            if (zzbK == ((zzmi) zzbK).zzbV()) {
                            }
                            zzb(sb, i, substring, zzbK);
                        } else {
                            if ((zzbK instanceof Enum) && ((Enum) zzbK).ordinal() == 0) {
                            }
                            zzb(sb, i, substring, zzbK);
                        }
                        if (equals) {
                        }
                        zzb(sb, i, substring, zzbK);
                    }
                }
            }
            i4 = 3;
        }
        if (zzmiVar instanceof zzky) {
            throw null;
        }
        zznl zznlVar = ((zzlb) zzmiVar).zzc;
        if (zznlVar != null) {
            zznlVar.zzi(sb, i);
        }
    }
}
