package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import C.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,101:1\n5306#2,7:102\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n*L\n73#1:102,7\n*E\n"})
/* loaded from: classes3.dex */
public abstract class BinaryVersion {
    public static final Companion Companion = new Companion(null);
    private final int major;
    private final int minor;
    private final int[] numbers;
    private final int patch;
    private final List<Integer> rest;

    @SourceDebugExtension({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n1549#2:102\n1620#2,3:103\n37#3,2:106\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n*L\n97#1:102\n97#1:103,3\n98#1:106,2\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BinaryVersion(int... numbers) {
        List<Integer> emptyList;
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        this.numbers = numbers;
        Integer orNull = ArraysKt.getOrNull(numbers, 0);
        this.major = orNull != null ? orNull.intValue() : -1;
        Integer orNull2 = ArraysKt.getOrNull(numbers, 1);
        this.minor = orNull2 != null ? orNull2.intValue() : -1;
        Integer orNull3 = ArraysKt.getOrNull(numbers, 2);
        this.patch = orNull3 != null ? orNull3.intValue() : -1;
        if (numbers.length <= 3) {
            emptyList = CollectionsKt.emptyList();
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException(w.p(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, '.'));
            }
            emptyList = CollectionsKt.toList(ArraysKt.asList(numbers).subList(3, numbers.length));
        }
        this.rest = emptyList;
    }

    public boolean equals(Object obj) {
        if (obj == null || !Intrinsics.areEqual(getClass(), obj.getClass())) {
            return false;
        }
        BinaryVersion binaryVersion = (BinaryVersion) obj;
        return this.major == binaryVersion.major && this.minor == binaryVersion.minor && this.patch == binaryVersion.patch && Intrinsics.areEqual(this.rest, binaryVersion.rest);
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public int hashCode() {
        int i = this.major;
        int i4 = (i * 31) + this.minor + i;
        int i5 = (i4 * 31) + this.patch + i4;
        return this.rest.hashCode() + (i5 * 31) + i5;
    }

    public final boolean isAtLeast(BinaryVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return isAtLeast(version.major, version.minor, version.patch);
    }

    public final boolean isAtMost(int i, int i4, int i5) {
        int i6 = this.major;
        if (i6 < i) {
            return true;
        }
        if (i6 > i) {
            return false;
        }
        int i7 = this.minor;
        if (i7 < i4) {
            return true;
        }
        return i7 <= i4 && this.patch <= i5;
    }

    public final boolean isCompatibleTo(BinaryVersion ourVersion) {
        Intrinsics.checkNotNullParameter(ourVersion, "ourVersion");
        int i = this.major;
        return i == 0 ? ourVersion.major == 0 && this.minor == ourVersion.minor : i == ourVersion.major && this.minor <= ourVersion.minor;
    }

    public final int[] toArray() {
        return this.numbers;
    }

    public String toString() {
        String joinToString$default;
        int[] array = toArray();
        ArrayList arrayList = new ArrayList();
        for (int i : array) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ".", null, null, 0, null, null, 62, null);
        return joinToString$default;
    }

    public final boolean isAtLeast(int i, int i4, int i5) {
        int i6 = this.major;
        if (i6 > i) {
            return true;
        }
        if (i6 < i) {
            return false;
        }
        int i7 = this.minor;
        if (i7 > i4) {
            return true;
        }
        return i7 >= i4 && this.patch >= i5;
    }
}
