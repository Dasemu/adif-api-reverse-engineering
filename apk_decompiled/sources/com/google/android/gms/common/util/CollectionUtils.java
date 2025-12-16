package com.google.android.gms.common.util;

import C.w;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s.f;
import s.j;

@KeepForSdk
/* loaded from: classes3.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.EMPTY_LIST;
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(K k4, V v3, K k5, V v4, K k6, V v5) {
        Map zza = zza(3, false);
        zza.put(k4, v3);
        zza.put(k5, v4);
        zza.put(k6, v5);
        return Collections.unmodifiableMap(zza);
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException(w.k("Key and values array lengths not equal: ", length, length2, " != "));
        }
        if (length == 0) {
            return Collections.EMPTY_MAP;
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map zza = zza(length, false);
        for (int i = 0; i < kArr.length; i++) {
            zza.put(kArr[i], vArr[i]);
        }
        return Collections.unmodifiableMap(zza);
    }

    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i) {
        return i == 0 ? new f(0) : zzb(i, true);
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(T t2, T t4, T t5) {
        Set zzb = zzb(3, false);
        zzb.add(t2);
        zzb.add(t4);
        zzb.add(t5);
        return Collections.unmodifiableSet(zzb);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map, s.j] */
    private static Map zza(int i, boolean z3) {
        return i <= 256 ? new j(i) : new HashMap(i, 1.0f);
    }

    private static Set zzb(int i, boolean z3) {
        return i <= (true != z3 ? 256 : 128) ? new f(i) : new HashSet(i, true != z3 ? 1.0f : 0.75f);
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(T t2) {
        return Collections.singletonList(t2);
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return listOf();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return listOf(tArr[0]);
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(K k4, V v3, K k5, V v4, K k6, V v5, K k7, V v6, K k8, V v7, K k9, V v8) {
        Map zza = zza(6, false);
        zza.put(k4, v3);
        zza.put(k5, v4);
        zza.put(k6, v5);
        zza.put(k7, v6);
        zza.put(k8, v7);
        zza.put(k9, v8);
        return Collections.unmodifiableMap(zza);
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_SET;
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t2 = tArr[0];
            T t4 = tArr[1];
            Set zzb = zzb(2, false);
            zzb.add(t2);
            zzb.add(t4);
            return Collections.unmodifiableSet(zzb);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set zzb2 = zzb(length, false);
            Collections.addAll(zzb2, tArr);
            return Collections.unmodifiableSet(zzb2);
        }
        T t5 = tArr[0];
        T t6 = tArr[1];
        T t7 = tArr[2];
        T t8 = tArr[3];
        Set zzb3 = zzb(4, false);
        zzb3.add(t5);
        zzb3.add(t6);
        zzb3.add(t7);
        zzb3.add(t8);
        return Collections.unmodifiableSet(zzb3);
    }
}
