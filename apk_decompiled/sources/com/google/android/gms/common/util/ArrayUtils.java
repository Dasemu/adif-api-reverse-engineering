package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@VisibleForTesting
@KeepForSdk
/* loaded from: classes3.dex */
public final class ArrayUtils {
    private ArrayUtils() {
    }

    @KeepForSdk
    public static <T> T[] concat(T[]... tArr) {
        if (tArr.length == 0) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
        }
        int i = 0;
        for (T[] tArr2 : tArr) {
            i += tArr2.length;
        }
        T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], i);
        int length = tArr[0].length;
        for (int i4 = 1; i4 < tArr.length; i4++) {
            T[] tArr4 = tArr[i4];
            int length2 = tArr4.length;
            System.arraycopy(tArr4, 0, tArr3, length, length2);
            length += length2;
        }
        return tArr3;
    }

    @KeepForSdk
    public static byte[] concatByteArrays(byte[]... bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        byte[] copyOf = Arrays.copyOf(bArr[0], i);
        int length = bArr[0].length;
        for (int i4 = 1; i4 < bArr.length; i4++) {
            byte[] bArr3 = bArr[i4];
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, copyOf, length, length2);
            length += length2;
        }
        return copyOf;
    }

    @KeepForSdk
    public static boolean contains(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i4 : iArr) {
            if (i4 == i) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public static <T> ArrayList<T> newArrayList() {
        return new ArrayList<>();
    }

    @KeepForSdk
    public static <T> T[] removeAll(T[] tArr, T... tArr2) {
        int length;
        int i;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || (length = tArr2.length) == 0) {
            return (T[]) Arrays.copyOf(tArr, tArr.length);
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr2.getClass().getComponentType(), tArr.length));
        if (length == 1) {
            i = 0;
            for (T t2 : tArr) {
                if (!Objects.equal(tArr2[0], t2)) {
                    tArr3[i] = t2;
                    i++;
                }
            }
        } else {
            int i4 = 0;
            for (T t4 : tArr) {
                if (!contains(tArr2, t4)) {
                    tArr3[i4] = t4;
                    i4++;
                }
            }
            i = i4;
        }
        if (tArr3 == null) {
            return null;
        }
        return i == tArr3.length ? tArr3 : (T[]) Arrays.copyOf(tArr3, i);
    }

    @KeepForSdk
    public static <T> ArrayList<T> toArrayList(T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        for (T t2 : tArr) {
            arrayList.add(t2);
        }
        return arrayList;
    }

    @KeepForSdk
    public static int[] toPrimitiveArray(Collection<Integer> collection) {
        int i = 0;
        if (collection == null || collection.isEmpty()) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    @KeepForSdk
    public static Integer[] toWrapperArray(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb, double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Double.toString(dArr[i]));
        }
    }

    @KeepForSdk
    public static void writeStringArray(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append("\"");
            sb.append(strArr[i]);
            sb.append("\"");
        }
    }

    @KeepForSdk
    public static <T> boolean contains(T[] tArr, T t2) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!Objects.equal(tArr[i], t2)) {
                i++;
            } else if (i >= 0) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb, float[] fArr) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Float.toString(fArr[i]));
        }
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb, int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Integer.toString(iArr[i]));
        }
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb, long[] jArr) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Long.toString(jArr[i]));
        }
    }

    @KeepForSdk
    public static <T> void writeArray(StringBuilder sb, T[] tArr) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(tArr[i]);
        }
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb, boolean[] zArr) {
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Boolean.toString(zArr[i]));
        }
    }
}
