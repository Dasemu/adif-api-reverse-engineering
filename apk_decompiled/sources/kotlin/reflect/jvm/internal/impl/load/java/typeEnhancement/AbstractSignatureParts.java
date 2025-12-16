package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

@SourceDebugExtension({"SMAP\nAbstractSignatureParts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1#2:229\n1#2:252\n1#2:275\n766#3:230\n857#3,2:231\n1726#3,3:233\n1747#3,3:236\n1747#3,3:239\n1603#3,9:242\n1855#3:251\n1856#3:253\n1612#3:254\n1726#3,3:255\n1549#3:258\n1620#3,3:259\n1747#3,3:262\n1603#3,9:265\n1855#3:274\n1856#3:276\n1612#3:277\n1855#3,2:278\n*S KotlinDebug\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n*L\n156#1:252\n182#1:275\n89#1:230\n89#1:231,2\n153#1:233,3\n155#1:236,3\n156#1:239,3\n156#1:242,9\n156#1:251\n156#1:253\n156#1:254\n159#1:255,3\n169#1:258\n169#1:259,3\n177#1:262,3\n182#1:265,9\n182#1:274\n182#1:276\n182#1:277\n195#1:278,2\n*E\n"})
/* loaded from: classes3.dex */
public abstract class AbstractSignatureParts<TAnnotation> {

    /* loaded from: classes3.dex */
    public static final class TypeAndDefaultQualifiers {
        private final JavaTypeQualifiersByElementType defaultQualifiers;
        private final KotlinTypeMarker type;
        private final TypeParameterMarker typeParameterForArgument;

        public TypeAndDefaultQualifiers(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, TypeParameterMarker typeParameterMarker) {
            this.type = kotlinTypeMarker;
            this.defaultQualifiers = javaTypeQualifiersByElementType;
            this.typeParameterForArgument = typeParameterMarker;
        }

        public final JavaTypeQualifiersByElementType getDefaultQualifiers() {
            return this.defaultQualifiers;
        }

        public final KotlinTypeMarker getType() {
            return this.type;
        }

        public final TypeParameterMarker getTypeParameterForArgument() {
            return this.typeParameterForArgument;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JavaTypeQualifiersByElementType extractAndMergeDefaultQualifiers(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType) {
        return getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(javaTypeQualifiersByElementType, getAnnotations(kotlinTypeMarker));
    }

    private final JavaTypeQualifiers extractQualifiers(KotlinTypeMarker kotlinTypeMarker) {
        NullabilityQualifier nullabilityQualifier;
        NullabilityQualifier nullabilityQualifier2 = getNullabilityQualifier(kotlinTypeMarker);
        MutabilityQualifier mutabilityQualifier = null;
        if (nullabilityQualifier2 == null) {
            KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings(kotlinTypeMarker);
            nullabilityQualifier = enhancedForWarnings != null ? getNullabilityQualifier(enhancedForWarnings) : null;
        } else {
            nullabilityQualifier = nullabilityQualifier2;
        }
        TypeSystemContext typeSystem = getTypeSystem();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        if (javaToKotlinClassMap.isReadOnly(getFqNameUnsafe(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.READ_ONLY;
        } else if (javaToKotlinClassMap.isMutable(getFqNameUnsafe(typeSystem.upperBoundIfFlexible(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.MUTABLE;
        }
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, getTypeSystem().isDefinitelyNotNullType(kotlinTypeMarker) || isNotNullTypeParameterCompat(kotlinTypeMarker), nullabilityQualifier != nullabilityQualifier2);
    }

    private final JavaTypeQualifiers extractQualifiersFromAnnotations(final TypeAndDefaultQualifiers typeAndDefaultQualifiers) {
        List emptyList;
        NullabilityQualifierWithMigrationStatus nullabilityQualifier;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus;
        KotlinTypeMarker type;
        TypeConstructorMarker typeConstructor;
        if (typeAndDefaultQualifiers.getType() == null) {
            TypeSystemContext typeSystem = getTypeSystem();
            TypeParameterMarker typeParameterForArgument = typeAndDefaultQualifiers.getTypeParameterForArgument();
            if ((typeParameterForArgument != null ? typeSystem.getVariance(typeParameterForArgument) : null) == TypeVariance.IN) {
                return JavaTypeQualifiers.Companion.getNONE();
            }
        }
        boolean z3 = false;
        boolean z4 = typeAndDefaultQualifiers.getTypeParameterForArgument() == null;
        KotlinTypeMarker type2 = typeAndDefaultQualifiers.getType();
        if (type2 == null || (emptyList = getAnnotations(type2)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        TypeSystemContext typeSystem2 = getTypeSystem();
        KotlinTypeMarker type3 = typeAndDefaultQualifiers.getType();
        TypeParameterMarker typeParameterClassifier = (type3 == null || (typeConstructor = typeSystem2.typeConstructor(type3)) == null) ? null : typeSystem2.getTypeParameterClassifier(typeConstructor);
        boolean z5 = getContainerApplicabilityType() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
        if (z4) {
            if (z5 || !getEnableImprovementsInStrictMode() || (type = typeAndDefaultQualifiers.getType()) == null || !isArrayOrPrimitiveArray(type)) {
                emptyList = CollectionsKt.plus((Iterable) getContainerAnnotations(), (Iterable) emptyList);
            } else {
                Iterable<TAnnotation> containerAnnotations = getContainerAnnotations();
                ArrayList arrayList = new ArrayList();
                for (TAnnotation tannotation : containerAnnotations) {
                    if (!getAnnotationTypeQualifierResolver().isTypeUseAnnotation(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                emptyList = CollectionsKt.plus((Collection) arrayList, (Iterable) emptyList);
            }
        }
        MutabilityQualifier extractMutability = getAnnotationTypeQualifierResolver().extractMutability(emptyList);
        NullabilityQualifierWithMigrationStatus extractNullability = getAnnotationTypeQualifierResolver().extractNullability((Iterable) emptyList, (Function1) new Function1<TAnnotation, Boolean>(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1
            final /* synthetic */ AbstractSignatureParts<TAnnotation> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(TAnnotation extractNullability2) {
                Intrinsics.checkNotNullParameter(extractNullability2, "$this$extractNullability");
                return Boolean.valueOf(this.this$0.forceWarning(extractNullability2, typeAndDefaultQualifiers.getType()));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1<TAnnotation>) obj);
            }
        });
        if (extractNullability != null) {
            NullabilityQualifier qualifier = extractNullability.getQualifier();
            if (extractNullability.getQualifier() == NullabilityQualifier.NOT_NULL && typeParameterClassifier != null) {
                z3 = true;
            }
            return new JavaTypeQualifiers(qualifier, extractMutability, z3, extractNullability.isForWarningOnly());
        }
        AnnotationQualifierApplicabilityType containerApplicabilityType = (z4 || z5) ? getContainerApplicabilityType() : AnnotationQualifierApplicabilityType.TYPE_USE;
        JavaTypeQualifiersByElementType defaultQualifiers = typeAndDefaultQualifiers.getDefaultQualifiers();
        JavaDefaultQualifiers javaDefaultQualifiers = defaultQualifiers != null ? defaultQualifiers.get(containerApplicabilityType) : null;
        NullabilityQualifierWithMigrationStatus boundsNullability = typeParameterClassifier != null ? getBoundsNullability(typeParameterClassifier) : null;
        if (boundsNullability == null || (nullabilityQualifier = NullabilityQualifierWithMigrationStatus.copy$default(boundsNullability, NullabilityQualifier.NOT_NULL, false, 2, null)) == null) {
            nullabilityQualifier = javaDefaultQualifiers != null ? javaDefaultQualifiers.getNullabilityQualifier() : null;
        }
        boolean z6 = (boundsNullability != null ? boundsNullability.getQualifier() : null) == NullabilityQualifier.NOT_NULL || !(typeParameterClassifier == null || javaDefaultQualifiers == null || !javaDefaultQualifiers.getDefinitelyNotNull());
        TypeParameterMarker typeParameterForArgument2 = typeAndDefaultQualifiers.getTypeParameterForArgument();
        if (typeParameterForArgument2 == null || (nullabilityQualifierWithMigrationStatus = getBoundsNullability(typeParameterForArgument2)) == null) {
            nullabilityQualifierWithMigrationStatus = null;
        } else if (nullabilityQualifierWithMigrationStatus.getQualifier() == NullabilityQualifier.NULLABLE) {
            nullabilityQualifierWithMigrationStatus = NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatus, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
        }
        NullabilityQualifierWithMigrationStatus mostSpecific = mostSpecific(nullabilityQualifierWithMigrationStatus, nullabilityQualifier);
        NullabilityQualifier qualifier2 = mostSpecific != null ? mostSpecific.getQualifier() : null;
        if (mostSpecific != null && mostSpecific.isForWarningOnly()) {
            z3 = true;
        }
        return new JavaTypeQualifiers(qualifier2, extractMutability, z6, z3);
    }

    private final <T> void flattenTree(T t2, List<T> list, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        list.add(t2);
        Iterable<? extends T> invoke = function1.invoke(t2);
        if (invoke != null) {
            Iterator<? extends T> it = invoke.iterator();
            while (it.hasNext()) {
                flattenTree(it.next(), list, function1);
            }
        }
    }

    private final NullabilityQualifierWithMigrationStatus getBoundsNullability(TypeParameterMarker typeParameterMarker) {
        List<KotlinTypeMarker> list;
        NullabilityQualifier nullabilityQualifier;
        TypeSystemContext typeSystem = getTypeSystem();
        if (!isFromJava(typeParameterMarker)) {
            return null;
        }
        List<KotlinTypeMarker> upperBounds = typeSystem.getUpperBounds(typeParameterMarker);
        List<KotlinTypeMarker> list2 = upperBounds;
        boolean z3 = list2 instanceof Collection;
        if (!z3 || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!typeSystem.isError((KotlinTypeMarker) it.next())) {
                    if (!z3 || !list2.isEmpty()) {
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (getNullabilityQualifier((KotlinTypeMarker) it2.next()) != null) {
                                list = upperBounds;
                                break;
                            }
                        }
                    }
                    if (!z3 || !list2.isEmpty()) {
                        Iterator<T> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (getEnhancedForWarnings((KotlinTypeMarker) it3.next()) != null) {
                                list = new ArrayList<>();
                                Iterator<T> it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings((KotlinTypeMarker) it4.next());
                                    if (enhancedForWarnings != null) {
                                        list.add(enhancedForWarnings);
                                    }
                                }
                                List<KotlinTypeMarker> list3 = list;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    Iterator<T> it5 = list3.iterator();
                                    while (it5.hasNext()) {
                                        if (!typeSystem.isNullableType((KotlinTypeMarker) it5.next())) {
                                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                            break;
                                        }
                                    }
                                }
                                nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, list != upperBounds);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private final NullabilityQualifier getNullabilityQualifier(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystem = getTypeSystem();
        if (typeSystem.isMarkedNullable(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (typeSystem.isMarkedNullable(typeSystem.upperBoundIfFlexible(kotlinTypeMarker))) {
            return null;
        }
        return NullabilityQualifier.NOT_NULL;
    }

    private final NullabilityQualifierWithMigrationStatus mostSpecific(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus2) {
        return nullabilityQualifierWithMigrationStatus == null ? nullabilityQualifierWithMigrationStatus2 : (nullabilityQualifierWithMigrationStatus2 != null && ((nullabilityQualifierWithMigrationStatus.isForWarningOnly() && !nullabilityQualifierWithMigrationStatus2.isForWarningOnly()) || ((nullabilityQualifierWithMigrationStatus.isForWarningOnly() || !nullabilityQualifierWithMigrationStatus2.isForWarningOnly()) && (nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus2.getQualifier()) < 0 || nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus2.getQualifier()) <= 0)))) ? nullabilityQualifierWithMigrationStatus2 : nullabilityQualifierWithMigrationStatus;
    }

    private final List<TypeAndDefaultQualifiers> toIndexed(KotlinTypeMarker kotlinTypeMarker) {
        final TypeSystemContext typeSystem = getTypeSystem();
        return flattenTree(new TypeAndDefaultQualifiers(kotlinTypeMarker, extractAndMergeDefaultQualifiers(kotlinTypeMarker, getContainerDefaultTypeQualifiers()), null), new Function1<TypeAndDefaultQualifiers, Iterable<? extends TypeAndDefaultQualifiers>>(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$toIndexed$1$1
            final /* synthetic */ AbstractSignatureParts<TAnnotation> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Iterable<AbstractSignatureParts.TypeAndDefaultQualifiers> invoke(AbstractSignatureParts.TypeAndDefaultQualifiers it) {
                KotlinTypeMarker type;
                TypeConstructorMarker typeConstructor;
                List<TypeParameterMarker> parameters;
                int collectionSizeOrDefault;
                int collectionSizeOrDefault2;
                JavaTypeQualifiersByElementType extractAndMergeDefaultQualifiers;
                AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers;
                KotlinTypeMarker type2;
                Intrinsics.checkNotNullParameter(it, "it");
                if ((this.this$0.getSkipRawTypeArguments() && (type2 = it.getType()) != null && typeSystem.isRawType(type2)) || (type = it.getType()) == null || (typeConstructor = typeSystem.typeConstructor(type)) == null || (parameters = typeSystem.getParameters(typeConstructor)) == null) {
                    return null;
                }
                List<TypeParameterMarker> list = parameters;
                List<TypeArgumentMarker> arguments = typeSystem.getArguments(it.getType());
                TypeSystemContext typeSystemContext = typeSystem;
                AbstractSignatureParts<TAnnotation> abstractSignatureParts = this.this$0;
                Iterator<T> it2 = list.iterator();
                Iterator<T> it3 = arguments.iterator();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10);
                ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, collectionSizeOrDefault2));
                while (it2.hasNext() && it3.hasNext()) {
                    Object next = it2.next();
                    TypeArgumentMarker typeArgumentMarker = (TypeArgumentMarker) it3.next();
                    TypeParameterMarker typeParameterMarker = (TypeParameterMarker) next;
                    if (typeSystemContext.isStarProjection(typeArgumentMarker)) {
                        typeAndDefaultQualifiers = new AbstractSignatureParts.TypeAndDefaultQualifiers(null, it.getDefaultQualifiers(), typeParameterMarker);
                    } else {
                        KotlinTypeMarker type3 = typeSystemContext.getType(typeArgumentMarker);
                        extractAndMergeDefaultQualifiers = abstractSignatureParts.extractAndMergeDefaultQualifiers(type3, it.getDefaultQualifiers());
                        typeAndDefaultQualifiers = new AbstractSignatureParts.TypeAndDefaultQualifiers(type3, extractAndMergeDefaultQualifiers, typeParameterMarker);
                    }
                    arrayList.add(typeAndDefaultQualifiers);
                }
                return arrayList;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> computeIndexedQualifiers(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r10, java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> r11, final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "overrides"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.util.List r0 = r9.toIndexed(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt.g(r11)
            r1.<init>(r2)
            java.util.Iterator r2 = r11.iterator()
        L1b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r3 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r3
            java.util.List r3 = r9.toIndexed(r3)
            r1.add(r3)
            goto L1b
        L2f:
            boolean r2 = r9.getForceOnlyHeadTypeConstructor()
            r3 = 1
            if (r2 != 0) goto L66
            boolean r2 = r9.isCovariant()
            if (r2 == 0) goto L61
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L4a
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L4a
            goto L61
        L4a:
            java.util.Iterator r11 = r11.iterator()
        L4e:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r11.next()
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r2 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r2
            boolean r2 = r9.isEqual(r10, r2)
            if (r2 != 0) goto L4e
            goto L66
        L61:
            int r10 = r0.size()
            goto L67
        L66:
            r10 = r3
        L67:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[] r11 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[r10]
            r2 = 0
            r4 = r2
        L6b:
            if (r4 >= r10) goto Lc5
            java.lang.Object r5 = r0.get(r4)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$TypeAndDefaultQualifiers r5 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers) r5
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r5 = r9.extractQualifiersFromAnnotations(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L80:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto La6
            java.lang.Object r8 = r7.next()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = kotlin.collections.CollectionsKt.getOrNull(r8, r4)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$TypeAndDefaultQualifiers r8 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers) r8
            if (r8 == 0) goto L9f
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r8 = r8.getType()
            if (r8 == 0) goto L9f
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r8 = r9.extractQualifiers(r8)
            goto La0
        L9f:
            r8 = 0
        La0:
            if (r8 == 0) goto L80
            r6.add(r8)
            goto L80
        La6:
            if (r4 != 0) goto Lb0
            boolean r7 = r9.isCovariant()
            if (r7 == 0) goto Lb0
            r7 = r3
            goto Lb1
        Lb0:
            r7 = r2
        Lb1:
            if (r4 != 0) goto Lbb
            boolean r8 = r9.getContainerIsVarargParameter()
            if (r8 == 0) goto Lbb
            r8 = r3
            goto Lbc
        Lbb:
            r8 = r2
        Lbc:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt.computeQualifiersForOverride(r5, r6, r7, r8, r13)
            r11[r4] = r5
            int r4 = r4 + 1
            goto L6b
        Lc5:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$computeIndexedQualifiers$1 r9 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$computeIndexedQualifiers$1
            r9.<init>()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.computeIndexedQualifiers(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker, java.lang.Iterable, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo, boolean):kotlin.jvm.functions.Function1");
    }

    public abstract boolean forceWarning(TAnnotation tannotation, KotlinTypeMarker kotlinTypeMarker);

    public abstract AbstractAnnotationTypeQualifierResolver<TAnnotation> getAnnotationTypeQualifierResolver();

    public abstract Iterable<TAnnotation> getAnnotations(KotlinTypeMarker kotlinTypeMarker);

    public abstract Iterable<TAnnotation> getContainerAnnotations();

    public abstract AnnotationQualifierApplicabilityType getContainerApplicabilityType();

    public abstract JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers();

    public abstract boolean getContainerIsVarargParameter();

    public abstract boolean getEnableImprovementsInStrictMode();

    public abstract KotlinTypeMarker getEnhancedForWarnings(KotlinTypeMarker kotlinTypeMarker);

    public boolean getForceOnlyHeadTypeConstructor() {
        return false;
    }

    public abstract FqNameUnsafe getFqNameUnsafe(KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean getSkipRawTypeArguments();

    public abstract TypeSystemContext getTypeSystem();

    public abstract boolean isArrayOrPrimitiveArray(KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean isCovariant();

    public abstract boolean isEqual(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2);

    public abstract boolean isFromJava(TypeParameterMarker typeParameterMarker);

    public boolean isNotNullTypeParameterCompat(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return false;
    }

    private final <T> List<T> flattenTree(T t2, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        ArrayList arrayList = new ArrayList(1);
        flattenTree(t2, arrayList, function1);
        return arrayList;
    }
}
