package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

@SourceDebugExtension({"SMAP\nClassLiteralValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassLiteralValue.kt\norg/jetbrains/kotlin/resolve/constants/ClassLiteralValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"})
/* loaded from: classes3.dex */
public final class ClassLiteralValue {
    private final int arrayNestedness;
    private final ClassId classId;

    public ClassLiteralValue(ClassId classId, int i) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.classId = classId;
        this.arrayNestedness = i;
    }

    public final ClassId component1() {
        return this.classId;
    }

    public final int component2() {
        return this.arrayNestedness;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassLiteralValue)) {
            return false;
        }
        ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj;
        return Intrinsics.areEqual(this.classId, classLiteralValue.classId) && this.arrayNestedness == classLiteralValue.arrayNestedness;
    }

    public final int getArrayNestedness() {
        return this.arrayNestedness;
    }

    public final ClassId getClassId() {
        return this.classId;
    }

    public int hashCode() {
        return Integer.hashCode(this.arrayNestedness) + (this.classId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.arrayNestedness;
        for (int i4 = 0; i4 < i; i4++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.classId);
        int i5 = this.arrayNestedness;
        for (int i6 = 0; i6 < i5; i6++) {
            sb.append(">");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
