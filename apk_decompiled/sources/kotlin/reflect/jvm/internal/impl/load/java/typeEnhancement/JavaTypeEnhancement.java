package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension({"SMAP\ntypeEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/JavaTypeEnhancement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n1#2:263\n3433#3,7:264\n1726#3,3:271\n3433#3,7:274\n*S KotlinDebug\n*F\n+ 1 typeEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/JavaTypeEnhancement\n*L\n117#1:264,7\n143#1:271,3\n155#1:274,7\n*E\n"})
/* loaded from: classes3.dex */
public final class JavaTypeEnhancement {
    private final JavaResolverSettings javaResolverSettings;

    /* loaded from: classes3.dex */
    public static final class Result {
        private final int subtreeSize;
        private final KotlinType type;

        public Result(KotlinType kotlinType, int i) {
            this.type = kotlinType;
            this.subtreeSize = i;
        }

        public final int getSubtreeSize() {
            return this.subtreeSize;
        }

        public final KotlinType getType() {
            return this.type;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SimpleResult {
        private final boolean forWarnings;
        private final int subtreeSize;
        private final SimpleType type;

        public SimpleResult(SimpleType simpleType, int i, boolean z3) {
            this.type = simpleType;
            this.subtreeSize = i;
            this.forWarnings = z3;
        }

        public final boolean getForWarnings() {
            return this.forWarnings;
        }

        public final int getSubtreeSize() {
            return this.subtreeSize;
        }

        public final SimpleType getType() {
            return this.type;
        }
    }

    public JavaTypeEnhancement(JavaResolverSettings javaResolverSettings) {
        Intrinsics.checkNotNullParameter(javaResolverSettings, "javaResolverSettings");
        this.javaResolverSettings = javaResolverSettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v8 */
    private final SimpleResult enhanceInflexible(SimpleType simpleType, Function1<? super Integer, JavaTypeQualifiers> function1, int i, TypeComponentPosition typeComponentPosition, boolean z3, boolean z4) {
        ClassifierDescriptor mo1394getDeclarationDescriptor;
        ClassifierDescriptor enhanceMutability;
        Boolean enhancedNullability;
        TypeConstructor constructor;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        EnhancedTypeAnnotations enhancedTypeAnnotations;
        Annotations compositeAnnotationsOrSingle;
        int collectionSizeOrDefault3;
        int collectionSizeOrDefault4;
        Boolean bool;
        Result result;
        TypeProjection makeStarProjection;
        Function1<? super Integer, JavaTypeQualifiers> function12 = function1;
        boolean shouldEnhance = TypeComponentPositionKt.shouldEnhance(typeComponentPosition);
        ?? r5 = 0;
        boolean z5 = (z4 && z3) ? false : true;
        KotlinType kotlinType = null;
        if ((shouldEnhance || !simpleType.getArguments().isEmpty()) && (mo1394getDeclarationDescriptor = simpleType.getConstructor().mo1394getDeclarationDescriptor()) != null) {
            JavaTypeQualifiers invoke = function12.invoke(Integer.valueOf(i));
            enhanceMutability = TypeEnhancementKt.enhanceMutability(mo1394getDeclarationDescriptor, invoke, typeComponentPosition);
            enhancedNullability = TypeEnhancementKt.getEnhancedNullability(invoke, typeComponentPosition);
            if (enhanceMutability == null || (constructor = enhanceMutability.getTypeConstructor()) == null) {
                constructor = simpleType.getConstructor();
            }
            TypeConstructor typeConstructor = constructor;
            Intrinsics.checkNotNull(typeConstructor);
            int i4 = i + 1;
            List<TypeProjection> arguments = simpleType.getArguments();
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            List<TypeParameterDescriptor> list = parameters;
            Iterator<T> it = arguments.iterator();
            Iterator<T> it2 = list.iterator();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10);
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, collectionSizeOrDefault2));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it2.next();
                TypeProjection typeProjection = (TypeProjection) next;
                if (z5) {
                    bool = enhancedNullability;
                    if (!typeProjection.isStarProjection()) {
                        result = enhancePossiblyFlexible(typeProjection.getType().unwrap(), function12, i4, z4);
                    } else if (function12.invoke(Integer.valueOf(i4)).getNullability() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                        UnwrappedType unwrap = typeProjection.getType().unwrap();
                        result = new Result(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(unwrap).makeNullableAsSpecified((boolean) r5), FlexibleTypesKt.upperIfFlexible(unwrap).makeNullableAsSpecified(true)), 1);
                    } else {
                        result = new Result(null, 1);
                    }
                } else {
                    bool = enhancedNullability;
                    result = new Result(kotlinType, r5);
                }
                i4 += result.getSubtreeSize();
                if (result.getType() != null) {
                    KotlinType type = result.getType();
                    Variance projectionKind = typeProjection.getProjectionKind();
                    Intrinsics.checkNotNullExpressionValue(projectionKind, "getProjectionKind(...)");
                    makeStarProjection = TypeUtilsKt.createProjection(type, projectionKind, typeParameterDescriptor);
                } else if (enhanceMutability == null || typeProjection.isStarProjection()) {
                    makeStarProjection = enhanceMutability != null ? TypeUtils.makeStarProjection(typeParameterDescriptor) : null;
                } else {
                    KotlinType type2 = typeProjection.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                    Variance projectionKind2 = typeProjection.getProjectionKind();
                    Intrinsics.checkNotNullExpressionValue(projectionKind2, "getProjectionKind(...)");
                    makeStarProjection = TypeUtilsKt.createProjection(type2, projectionKind2, typeParameterDescriptor);
                }
                arrayList.add(makeStarProjection);
                function12 = function1;
                enhancedNullability = bool;
                r5 = 0;
                kotlinType = null;
            }
            Boolean bool2 = enhancedNullability;
            int i5 = i4 - i;
            if (enhanceMutability == null && bool2 == null) {
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((TypeProjection) it3.next()) == null) {
                        }
                    }
                }
                return new SimpleResult(null, i5, false);
            }
            Annotations annotations = simpleType.getAnnotations();
            enhancedTypeAnnotations = TypeEnhancementKt.ENHANCED_MUTABILITY_ANNOTATIONS;
            if (enhanceMutability == null) {
                enhancedTypeAnnotations = null;
            }
            compositeAnnotationsOrSingle = TypeEnhancementKt.compositeAnnotationsOrSingle(CollectionsKt.listOfNotNull((Object[]) new Annotations[]{annotations, enhancedTypeAnnotations, bool2 != null ? TypeEnhancementKt.getENHANCED_NULLABILITY_ANNOTATIONS() : null}));
            TypeAttributes defaultAttributes = TypeAttributesKt.toDefaultAttributes(compositeAnnotationsOrSingle);
            List<TypeProjection> arguments2 = simpleType.getArguments();
            Iterator it4 = arrayList.iterator();
            Iterator<T> it5 = arguments2.iterator();
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments2, 10);
            ArrayList arrayList2 = new ArrayList(Math.min(collectionSizeOrDefault3, collectionSizeOrDefault4));
            while (it4.hasNext() && it5.hasNext()) {
                Object next2 = it4.next();
                TypeProjection typeProjection2 = (TypeProjection) it5.next();
                TypeProjection typeProjection3 = (TypeProjection) next2;
                if (typeProjection3 != null) {
                    typeProjection2 = typeProjection3;
                }
                arrayList2.add(typeProjection2);
            }
            SimpleType simpleType$default = KotlinTypeFactory.simpleType$default(defaultAttributes, typeConstructor, arrayList2, bool2 != null ? bool2.booleanValue() : simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
            if (invoke.getDefinitelyNotNull()) {
                simpleType$default = notNullTypeParameter(simpleType$default);
            }
            return new SimpleResult(simpleType$default, i5, bool2 != null && invoke.isNullabilityQualifierForWarning());
        }
        return new SimpleResult(null, 1, false);
    }

    public static /* synthetic */ SimpleResult enhanceInflexible$default(JavaTypeEnhancement javaTypeEnhancement, SimpleType simpleType, Function1 function1, int i, TypeComponentPosition typeComponentPosition, boolean z3, boolean z4, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z3 = false;
        }
        if ((i4 & 16) != 0) {
            z4 = false;
        }
        return javaTypeEnhancement.enhanceInflexible(simpleType, function1, i, typeComponentPosition, z3, z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        if (r1 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.Result enhancePossiblyFlexible(kotlin.reflect.jvm.internal.impl.types.UnwrappedType r21, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> r22, int r23, boolean r24) {
        /*
            r20 = this;
            r0 = r21
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(r0)
            r2 = 0
            if (r1 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$Result r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$Result
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        L10:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType
            if (r1 == 0) goto Lb2
            boolean r8 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.RawType
            r1 = r0
            kotlin.reflect.jvm.internal.impl.types.FlexibleType r1 = (kotlin.reflect.jvm.internal.impl.types.FlexibleType) r1
            kotlin.reflect.jvm.internal.impl.types.SimpleType r4 = r1.getLowerBound()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_LOWER
            r3 = r20
            r5 = r22
            r6 = r23
            r9 = r24
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$SimpleResult r10 = r3.enhanceInflexible(r4, r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.types.SimpleType r4 = r1.getUpperBound()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_UPPER
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$SimpleResult r3 = r3.enhanceInflexible(r4, r5, r6, r7, r8, r9)
            r10.getSubtreeSize()
            r3.getSubtreeSize()
            kotlin.reflect.jvm.internal.impl.types.SimpleType r4 = r10.getType()
            if (r4 != 0) goto L48
            kotlin.reflect.jvm.internal.impl.types.SimpleType r4 = r3.getType()
            if (r4 != 0) goto L48
            goto La8
        L48:
            boolean r2 = r10.getForWarnings()
            if (r2 != 0) goto L8a
            boolean r2 = r3.getForWarnings()
            if (r2 == 0) goto L55
            goto L8a
        L55:
            if (r8 == 0) goto L71
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl r2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r10.getType()
            if (r0 != 0) goto L63
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r1.getLowerBound()
        L63:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r3.getType()
            if (r3 != 0) goto L6d
            kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r1.getUpperBound()
        L6d:
            r2.<init>(r0, r3)
            goto La8
        L71:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r10.getType()
            if (r0 != 0) goto L7b
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r1.getLowerBound()
        L7b:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = r3.getType()
            if (r2 != 0) goto L85
            kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = r1.getUpperBound()
        L85:
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r2 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(r0, r2)
            goto La8
        L8a:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r1 = r3.getType()
            if (r1 == 0) goto L9d
            kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = r10.getType()
            if (r2 != 0) goto L97
            r2 = r1
        L97:
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r1 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(r2, r1)
            if (r1 != 0) goto La4
        L9d:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r1 = r10.getType()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
        La4:
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r2 = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(r0, r1)
        La8:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$Result r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$Result
            int r1 = r10.getSubtreeSize()
            r0.<init>(r2, r1)
            return r0
        Lb2:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType
            if (r1 == 0) goto Lea
            r12 = r0
            kotlin.reflect.jvm.internal.impl.types.SimpleType r12 = (kotlin.reflect.jvm.internal.impl.types.SimpleType) r12
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r15 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.INFLEXIBLE
            r18 = 8
            r19 = 0
            r16 = 0
            r11 = r20
            r13 = r22
            r14 = r23
            r17 = r24
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$SimpleResult r1 = enhanceInflexible$default(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$Result r2 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$Result
            boolean r3 = r1.getForWarnings()
            if (r3 == 0) goto Lde
            kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r1.getType()
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r0 = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(r0, r3)
            goto Le2
        Lde:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r1.getType()
        Le2:
            int r1 = r1.getSubtreeSize()
            r2.<init>(r0, r1)
            return r2
        Lea:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.enhancePossiblyFlexible(kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.jvm.functions.Function1, int, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$Result");
    }

    private final SimpleType notNullTypeParameter(SimpleType simpleType) {
        return this.javaResolverSettings.getCorrectNullabilityForNotNullTypeParameter() ? SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType, true) : new NotNullTypeParameterImpl(simpleType);
    }

    public final KotlinType enhance(KotlinType kotlinType, Function1<? super Integer, JavaTypeQualifiers> qualifiers, boolean z3) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
        return enhancePossiblyFlexible(kotlinType.unwrap(), qualifiers, 0, z3).getType();
    }
}
