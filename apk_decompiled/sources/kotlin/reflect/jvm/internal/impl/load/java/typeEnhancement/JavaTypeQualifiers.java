package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class JavaTypeQualifiers {
    public static final Companion Companion = new Companion(null);
    private static final JavaTypeQualifiers NONE = new JavaTypeQualifiers(null, null, false, false, 8, null);
    private final boolean definitelyNotNull;
    private final boolean isNullabilityQualifierForWarning;
    private final MutabilityQualifier mutability;
    private final NullabilityQualifier nullability;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JavaTypeQualifiers getNONE() {
            return JavaTypeQualifiers.NONE;
        }

        private Companion() {
        }
    }

    public JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z3, boolean z4) {
        this.nullability = nullabilityQualifier;
        this.mutability = mutabilityQualifier;
        this.definitelyNotNull = z3;
        this.isNullabilityQualifierForWarning = z4;
    }

    public final boolean getDefinitelyNotNull() {
        return this.definitelyNotNull;
    }

    public final MutabilityQualifier getMutability() {
        return this.mutability;
    }

    public final NullabilityQualifier getNullability() {
        return this.nullability;
    }

    public final boolean isNullabilityQualifierForWarning() {
        return this.isNullabilityQualifierForWarning;
    }

    public /* synthetic */ JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, mutabilityQualifier, z3, (i & 8) != 0 ? false : z4);
    }
}
