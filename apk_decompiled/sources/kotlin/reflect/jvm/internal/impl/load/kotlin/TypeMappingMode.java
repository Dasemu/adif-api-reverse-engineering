package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.io.ConstantsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes3.dex */
public final class TypeMappingMode {

    @JvmField
    public static final TypeMappingMode CLASS_DECLARATION;
    public static final Companion Companion = new Companion(null);

    @JvmField
    public static final TypeMappingMode DEFAULT;

    @JvmField
    public static final TypeMappingMode DEFAULT_UAST;

    @JvmField
    public static final TypeMappingMode GENERIC_ARGUMENT;

    @JvmField
    public static final TypeMappingMode GENERIC_ARGUMENT_UAST;

    @JvmField
    public static final TypeMappingMode RETURN_TYPE_BOXED;

    @JvmField
    public static final TypeMappingMode SUPER_TYPE;

    @JvmField
    public static final TypeMappingMode SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS;

    @JvmField
    public static final TypeMappingMode VALUE_FOR_ANNOTATION;
    private final TypeMappingMode genericArgumentMode;
    private final TypeMappingMode genericContravariantArgumentMode;
    private final TypeMappingMode genericInvariantArgumentMode;
    private final boolean isForAnnotationParameter;
    private final boolean kotlinCollectionsToJavaCollections;
    private final boolean mapTypeAliases;
    private final boolean needInlineClassWrapping;
    private final boolean needPrimitiveBoxing;
    private final boolean skipDeclarationSiteWildcards;
    private final boolean skipDeclarationSiteWildcardsIfPossible;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        TypeMappingMode typeMappingMode = new TypeMappingMode(z3, z4, z5, z6, z7, null, false, null, null, z8, 1023, null);
        GENERIC_ARGUMENT = typeMappingMode;
        TypeMappingMode typeMappingMode2 = new TypeMappingMode(false, false, z8, false, false, null, false, null, null, true, 511, null);
        GENERIC_ARGUMENT_UAST = typeMappingMode2;
        RETURN_TYPE_BOXED = new TypeMappingMode(false, true, false, false, false, null, false, null, null, false, 1021, null);
        DEFAULT = new TypeMappingMode(z3, z4, z5, z6, z7, typeMappingMode, false, null, null, z8, 988, null);
        DEFAULT_UAST = new TypeMappingMode(false, false, z8, false, false, typeMappingMode2, false, null, null, true, 476, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z9 = false;
        TypeMappingMode typeMappingMode3 = null;
        TypeMappingMode typeMappingMode4 = null;
        CLASS_DECLARATION = new TypeMappingMode(z3, true, z5, z6, z7, typeMappingMode, z9, typeMappingMode3, typeMappingMode4, z8, 988, defaultConstructorMarker);
        boolean z10 = false;
        boolean z11 = true;
        SUPER_TYPE = new TypeMappingMode(z3, z10, z5, z11, z7, typeMappingMode, z9, typeMappingMode3, typeMappingMode4, z8, 983, defaultConstructorMarker);
        SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS = new TypeMappingMode(z3, z10, z5, z11, z7, typeMappingMode, z9, typeMappingMode3, typeMappingMode4, z8, 919, defaultConstructorMarker);
        VALUE_FOR_ANNOTATION = new TypeMappingMode(z3, z10, true, false, z7, typeMappingMode, z9, typeMappingMode3, typeMappingMode4, z8, 984, defaultConstructorMarker);
    }

    public TypeMappingMode() {
        this(false, false, false, false, false, null, false, null, null, false, 1023, null);
    }

    public final boolean getKotlinCollectionsToJavaCollections() {
        return this.kotlinCollectionsToJavaCollections;
    }

    public final boolean getMapTypeAliases() {
        return this.mapTypeAliases;
    }

    public final boolean getNeedInlineClassWrapping() {
        return this.needInlineClassWrapping;
    }

    public final boolean getNeedPrimitiveBoxing() {
        return this.needPrimitiveBoxing;
    }

    public final boolean isForAnnotationParameter() {
        return this.isForAnnotationParameter;
    }

    public final TypeMappingMode toGenericArgumentMode(Variance effectiveVariance, boolean z3) {
        Intrinsics.checkNotNullParameter(effectiveVariance, "effectiveVariance");
        if (!z3 || !this.isForAnnotationParameter) {
            int i = WhenMappings.$EnumSwitchMapping$0[effectiveVariance.ordinal()];
            if (i == 1) {
                TypeMappingMode typeMappingMode = this.genericContravariantArgumentMode;
                if (typeMappingMode != null) {
                    return typeMappingMode;
                }
            } else if (i != 2) {
                TypeMappingMode typeMappingMode2 = this.genericArgumentMode;
                if (typeMappingMode2 != null) {
                    return typeMappingMode2;
                }
            } else {
                TypeMappingMode typeMappingMode3 = this.genericInvariantArgumentMode;
                if (typeMappingMode3 != null) {
                    return typeMappingMode3;
                }
            }
        }
        return this;
    }

    public final TypeMappingMode wrapInlineClassesMode() {
        return new TypeMappingMode(this.needPrimitiveBoxing, true, this.isForAnnotationParameter, this.skipDeclarationSiteWildcards, this.skipDeclarationSiteWildcardsIfPossible, this.genericArgumentMode, this.kotlinCollectionsToJavaCollections, this.genericContravariantArgumentMode, this.genericInvariantArgumentMode, false, ConstantsKt.MINIMUM_BLOCK_SIZE, null);
    }

    public TypeMappingMode(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, TypeMappingMode typeMappingMode, boolean z8, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, boolean z9) {
        this.needPrimitiveBoxing = z3;
        this.needInlineClassWrapping = z4;
        this.isForAnnotationParameter = z5;
        this.skipDeclarationSiteWildcards = z6;
        this.skipDeclarationSiteWildcardsIfPossible = z7;
        this.genericArgumentMode = typeMappingMode;
        this.kotlinCollectionsToJavaCollections = z8;
        this.genericContravariantArgumentMode = typeMappingMode2;
        this.genericInvariantArgumentMode = typeMappingMode3;
        this.mapTypeAliases = z9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TypeMappingMode(boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode r8, boolean r9, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode r10, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode r11, boolean r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r2 = this;
            r14 = r13 & 1
            r0 = 1
            if (r14 == 0) goto L6
            r3 = r0
        L6:
            r14 = r13 & 2
            if (r14 == 0) goto Lb
            r4 = r0
        Lb:
            r14 = r13 & 4
            r1 = 0
            if (r14 == 0) goto L11
            r5 = r1
        L11:
            r14 = r13 & 8
            if (r14 == 0) goto L16
            r6 = r1
        L16:
            r14 = r13 & 16
            if (r14 == 0) goto L1b
            r7 = r1
        L1b:
            r14 = r13 & 32
            if (r14 == 0) goto L20
            r8 = 0
        L20:
            r14 = r13 & 64
            if (r14 == 0) goto L25
            r9 = r0
        L25:
            r14 = r13 & 128(0x80, float:1.8E-43)
            if (r14 == 0) goto L2a
            r10 = r8
        L2a:
            r14 = r13 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L2f
            r11 = r8
        L2f:
            r13 = r13 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L34
            r12 = r1
        L34:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode.<init>(boolean, boolean, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode, boolean, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
