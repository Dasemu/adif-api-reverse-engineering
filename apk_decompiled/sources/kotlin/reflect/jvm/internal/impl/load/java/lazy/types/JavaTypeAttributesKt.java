package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;

@SourceDebugExtension({"SMAP\nJavaTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaTypeAttributes.kt\norg/jetbrains/kotlin/load/java/lazy/types/JavaTypeAttributesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
/* loaded from: classes3.dex */
public final class JavaTypeAttributesKt {
    public static final JavaTypeAttributes toAttributes(TypeUsage typeUsage, boolean z3, boolean z4, TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.checkNotNullParameter(typeUsage, "<this>");
        return new JavaTypeAttributes(typeUsage, null, z4, z3, typeParameterDescriptor != null ? SetsKt.setOf(typeParameterDescriptor) : null, null, 34, null);
    }

    public static /* synthetic */ JavaTypeAttributes toAttributes$default(TypeUsage typeUsage, boolean z3, boolean z4, TypeParameterDescriptor typeParameterDescriptor, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = false;
        }
        if ((i & 2) != 0) {
            z4 = false;
        }
        if ((i & 4) != 0) {
            typeParameterDescriptor = null;
        }
        return toAttributes(typeUsage, z3, z4, typeParameterDescriptor);
    }
}
