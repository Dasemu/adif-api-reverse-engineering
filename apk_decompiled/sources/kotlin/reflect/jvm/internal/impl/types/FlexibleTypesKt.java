package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nflexibleTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 flexibleTypes.kt\norg/jetbrains/kotlin/types/FlexibleTypesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n288#2:175\n1726#2,3:176\n289#2:179\n1549#2:180\n1620#2,3:181\n1549#2:184\n1620#2,3:185\n*S KotlinDebug\n*F\n+ 1 flexibleTypes.kt\norg/jetbrains/kotlin/types/FlexibleTypesKt\n*L\n50#1:175\n51#1:176,3\n50#1:179\n62#1:180\n62#1:181,3\n65#1:184\n65#1:185,3\n*E\n"})
/* loaded from: classes3.dex */
public final class FlexibleTypesKt {
    public static final FlexibleType asFlexibleType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        UnwrappedType unwrap = kotlinType.unwrap();
        Intrinsics.checkNotNull(unwrap, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (FlexibleType) unwrap;
    }

    public static final boolean isFlexible(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return kotlinType.unwrap() instanceof FlexibleType;
    }

    public static final SimpleType lowerIfFlexible(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        UnwrappedType unwrap = kotlinType.unwrap();
        if (unwrap instanceof FlexibleType) {
            return ((FlexibleType) unwrap).getLowerBound();
        }
        if (unwrap instanceof SimpleType) {
            return (SimpleType) unwrap;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final SimpleType upperIfFlexible(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        UnwrappedType unwrap = kotlinType.unwrap();
        if (unwrap instanceof FlexibleType) {
            return ((FlexibleType) unwrap).getUpperBound();
        }
        if (unwrap instanceof SimpleType) {
            return (SimpleType) unwrap;
        }
        throw new NoWhenBranchMatchedException();
    }
}
