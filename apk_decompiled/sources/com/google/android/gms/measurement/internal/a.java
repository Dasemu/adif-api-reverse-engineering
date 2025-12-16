package com.google.android.gms.measurement.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ String A(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static float a(float f2, float f4, float f5, float f6) {
        return ((f2 - f4) * f5) + f6;
    }

    public static int b(long j4, int i, int i4) {
        return (Long.hashCode(j4) + i) * i4;
    }

    public static int c(CharSequence charSequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(charSequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return charSequence.length();
    }

    public static int d(String str, int i, int i4) {
        return (str.hashCode() + i) * i4;
    }

    public static int e(UInt uInt, int i) {
        return UInt.m211constructorimpl(uInt.getData() + i);
    }

    public static int f(IntRange intRange, int i) {
        return intRange.getEndInclusive().intValue() + i;
    }

    public static Object g(CharSequence charSequence, int i, Function1 function1) {
        return function1.invoke(Character.valueOf(charSequence.charAt(i)));
    }

    public static Object h(byte[] bArr, int i, Function1 function1) {
        return function1.invoke(UByte.m128boximpl(UByteArray.m192getw2LRezQ(bArr, i)));
    }

    public static Object i(int[] iArr, int i, Function1 function1) {
        return function1.invoke(UInt.m205boximpl(UIntArray.m271getpVg5ArA(iArr, i)));
    }

    public static Object j(long[] jArr, int i, Function1 function1) {
        return function1.invoke(ULong.m284boximpl(ULongArray.m350getsVKNKU(jArr, i)));
    }

    public static Object k(short[] sArr, int i, Function1 function1) {
        return function1.invoke(UShort.m391boximpl(UShortArray.m455getMh2AYeg(sArr, i)));
    }

    public static String l(int i, String str) {
        return str + i;
    }

    public static String m(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String n(StringBuilder sb, String str, char c4) {
        sb.append(str);
        sb.append(c4);
        return sb.toString();
    }

    public static String o(StringBuilder sb, List list, char c4) {
        sb.append(list);
        sb.append(c4);
        return sb.toString();
    }

    public static StringBuilder p(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder q(String str, SimpleTypeMarker simpleTypeMarker, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(simpleTypeMarker);
        sb.append(str2);
        return sb;
    }

    public static ArrayList r(LinkedHashMap linkedHashMap, Object obj) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(obj, arrayList);
        return arrayList;
    }

    public static ArrayList s(Map map, Object obj) {
        ArrayList arrayList = new ArrayList();
        map.put(obj, arrayList);
        return arrayList;
    }

    public static Iterator t(Iterable iterable, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(iterable, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return iterable.iterator();
    }

    public static Iterator u(Sequence sequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(sequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return sequence.iterator();
    }

    public static KotlinNothingValueException v() {
        FlowKt.noImpl();
        return new KotlinNothingValueException();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    public static IntIterator w(int i, int i4) {
        return new IntRange(i, i4).iterator();
    }

    public static FqName x(String str, FqName fqName, String str2) {
        FqName child = fqName.child(Name.identifier(str));
        Intrinsics.checkNotNullExpressionValue(child, str2);
        return child;
    }

    public static void y(zzgd zzgdVar, String str) {
        zzgdVar.zzaA().zzj().zza(str);
    }

    public static boolean z(Flags.BooleanFlagField booleanFlagField, int i, String str) {
        Boolean bool = booleanFlagField.get(i);
        Intrinsics.checkNotNullExpressionValue(bool, str);
        return bool.booleanValue();
    }
}
