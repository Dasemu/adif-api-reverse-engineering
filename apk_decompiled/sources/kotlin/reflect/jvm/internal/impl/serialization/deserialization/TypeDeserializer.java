package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionForAbsentTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension({"SMAP\nTypeDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1549#2:301\n1620#2,3:302\n1559#2:305\n1590#2,4:306\n1549#2:311\n1620#2,3:312\n1#3:310\n*S KotlinDebug\n*F\n+ 1 TypeDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer\n*L\n76#1:301\n76#1:302,3\n105#1:305\n105#1:306,4\n246#1:311\n246#1:312,3\n*E\n"})
/* loaded from: classes3.dex */
public final class TypeDeserializer {

    /* renamed from: c, reason: collision with root package name */
    private final DeserializationContext f7138c;
    private final Function1<Integer, ClassifierDescriptor> classifierDescriptors;
    private final String containerPresentableName;
    private final String debugName;
    private final TypeDeserializer parent;
    private final Function1<Integer, ClassifierDescriptor> typeAliasDescriptors;
    private final Map<Integer, TypeParameterDescriptor> typeParameterDescriptors;

    public TypeDeserializer(DeserializationContext c4, TypeDeserializer typeDeserializer, List<ProtoBuf.TypeParameter> typeParameterProtos, String debugName, String containerPresentableName) {
        Map<Integer, TypeParameterDescriptor> linkedHashMap;
        Intrinsics.checkNotNullParameter(c4, "c");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(containerPresentableName, "containerPresentableName");
        this.f7138c = c4;
        this.parent = typeDeserializer;
        this.debugName = debugName;
        this.containerPresentableName = containerPresentableName;
        this.classifierDescriptors = c4.getStorageManager().createMemoizedFunctionWithNullableValues(new Function1<Integer, ClassifierDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$classifierDescriptors$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ ClassifierDescriptor invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final ClassifierDescriptor invoke(int i) {
                ClassifierDescriptor computeClassifierDescriptor;
                computeClassifierDescriptor = TypeDeserializer.this.computeClassifierDescriptor(i);
                return computeClassifierDescriptor;
            }
        });
        this.typeAliasDescriptors = c4.getStorageManager().createMemoizedFunctionWithNullableValues(new Function1<Integer, ClassifierDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeAliasDescriptors$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ ClassifierDescriptor invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final ClassifierDescriptor invoke(int i) {
                ClassifierDescriptor computeTypeAliasDescriptor;
                computeTypeAliasDescriptor = TypeDeserializer.this.computeTypeAliasDescriptor(i);
                return computeTypeAliasDescriptor;
            }
        });
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = MapsKt.emptyMap();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i = 0;
            for (ProtoBuf.TypeParameter typeParameter : typeParameterProtos) {
                linkedHashMap.put(Integer.valueOf(typeParameter.getId()), new DeserializedTypeParameterDescriptor(this.f7138c, typeParameter, i));
                i++;
            }
        }
        this.typeParameterDescriptors = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassifierDescriptor computeClassifierDescriptor(int i) {
        ClassId classId = NameResolverUtilKt.getClassId(this.f7138c.getNameResolver(), i);
        return classId.isLocal() ? this.f7138c.getComponents().deserializeClass(classId) : FindClassInModuleKt.findClassifierAcrossModuleDependencies(this.f7138c.getComponents().getModuleDescriptor(), classId);
    }

    private final SimpleType computeLocalClassifierReplacementType(int i) {
        if (NameResolverUtilKt.getClassId(this.f7138c.getNameResolver(), i).isLocal()) {
            return this.f7138c.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassifierDescriptor computeTypeAliasDescriptor(int i) {
        ClassId classId = NameResolverUtilKt.getClassId(this.f7138c.getNameResolver(), i);
        if (classId.isLocal()) {
            return null;
        }
        return FindClassInModuleKt.findTypeAliasAcrossModuleDependencies(this.f7138c.getComponents().getModuleDescriptor(), classId);
    }

    private final SimpleType createSimpleSuspendFunctionType(KotlinType kotlinType, KotlinType kotlinType2) {
        List dropLast;
        int collectionSizeOrDefault;
        KotlinBuiltIns builtIns = TypeUtilsKt.getBuiltIns(kotlinType);
        Annotations annotations = kotlinType.getAnnotations();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        List<KotlinType> contextReceiverTypesFromFunctionType = FunctionTypesKt.getContextReceiverTypesFromFunctionType(kotlinType);
        dropLast = CollectionsKt___CollectionsKt.dropLast(FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType), 1);
        List list = dropLast;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, contextReceiverTypesFromFunctionType, arrayList, null, kotlinType2, true).makeNullableAsSpecified(kotlinType.isMarkedNullable());
    }

    private final SimpleType createSuspendFunctionType(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z3) {
        List<? extends TypeProjection> list2;
        SimpleType createSuspendFunctionTypeForBasicCase;
        int size;
        int size2 = typeConstructor.getParameters().size() - list.size();
        if (size2 != 0) {
            createSuspendFunctionTypeForBasicCase = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                TypeConstructor typeConstructor2 = typeConstructor.getBuiltIns().getSuspendFunction(size).getTypeConstructor();
                Intrinsics.checkNotNullExpressionValue(typeConstructor2, "getTypeConstructor(...)");
                list2 = list;
                createSuspendFunctionTypeForBasicCase = KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructor2, list2, z3, (KotlinTypeRefiner) null, 16, (Object) null);
            } else {
                list2 = list;
            }
        } else {
            list2 = list;
            createSuspendFunctionTypeForBasicCase = createSuspendFunctionTypeForBasicCase(typeAttributes, typeConstructor, list2, z3);
        }
        return createSuspendFunctionTypeForBasicCase == null ? ErrorUtils.INSTANCE.createErrorTypeWithArguments(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list2, typeConstructor, new String[0]) : createSuspendFunctionTypeForBasicCase;
    }

    private final SimpleType createSuspendFunctionTypeForBasicCase(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z3) {
        SimpleType simpleType$default = KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructor, list, z3, (KotlinTypeRefiner) null, 16, (Object) null);
        if (FunctionTypesKt.isFunctionType(simpleType$default)) {
            return transformRuntimeFunctionTypeToSuspendFunction(simpleType$default);
        }
        return null;
    }

    private final TypeParameterDescriptor loadTypeParameter(int i) {
        TypeParameterDescriptor typeParameterDescriptor = this.typeParameterDescriptors.get(Integer.valueOf(i));
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        TypeDeserializer typeDeserializer = this.parent;
        if (typeDeserializer != null) {
            return typeDeserializer.loadTypeParameter(i);
        }
        return null;
    }

    private static final List<ProtoBuf.Type.Argument> simpleType$collectAllArguments(ProtoBuf.Type type, TypeDeserializer typeDeserializer) {
        List<ProtoBuf.Type.Argument> argumentList = type.getArgumentList();
        Intrinsics.checkNotNullExpressionValue(argumentList, "getArgumentList(...)");
        List<ProtoBuf.Type.Argument> list = argumentList;
        ProtoBuf.Type outerType = ProtoTypeTableUtilKt.outerType(type, typeDeserializer.f7138c.getTypeTable());
        List<ProtoBuf.Type.Argument> simpleType$collectAllArguments = outerType != null ? simpleType$collectAllArguments(outerType, typeDeserializer) : null;
        if (simpleType$collectAllArguments == null) {
            simpleType$collectAllArguments = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus((Collection) list, (Iterable) simpleType$collectAllArguments);
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeDeserializer typeDeserializer, ProtoBuf.Type type, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            z3 = true;
        }
        return typeDeserializer.simpleType(type, z3);
    }

    private final TypeAttributes toAttributes(List<? extends TypeAttributeTranslator> list, Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor) {
        int collectionSizeOrDefault;
        List<? extends TypeAttributeTranslator> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeAttributeTranslator) it.next()).toAttributes(annotations, typeConstructor, declarationDescriptor));
        }
        return TypeAttributes.Companion.create(CollectionsKt.flatten(arrayList));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, r3) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType transformRuntimeFunctionTypeToSuspendFunction(kotlin.reflect.jvm.internal.impl.types.KotlinType r6) {
        /*
            r5 = this;
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getValueParameterTypesFromFunctionType(r6)
            java.lang.Object r0 = kotlin.collections.CollectionsKt.lastOrNull(r0)
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r0 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) r0
            r1 = 0
            if (r0 == 0) goto L7e
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            if (r0 != 0) goto L14
            goto L7e
        L14:
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r2 = r0.getConstructor()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r2 = r2.mo1394getDeclarationDescriptor()
            if (r2 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.name.FqName r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r2)
            goto L24
        L23:
            r2 = r1
        L24:
            java.util.List r3 = r0.getArguments()
            int r3 = r3.size()
            r4 = 1
            if (r3 != r4) goto L7b
            kotlin.reflect.jvm.internal.impl.name.FqName r3 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.CONTINUATION_INTERFACE_FQ_NAME
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r3 != 0) goto L42
            kotlin.reflect.jvm.internal.impl.name.FqName r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializerKt.access$getEXPERIMENTAL_CONTINUATION_FQ_NAME$p()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L42
            goto L7b
        L42:
            java.util.List r0 = r0.getArguments()
            java.lang.Object r0 = kotlin.collections.CollectionsKt.single(r0)
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r0 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) r0
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            java.lang.String r2 = "getType(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r2 = r5.f7138c
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r2 = r2.getContainingDeclaration()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
            if (r3 == 0) goto L62
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) r2
            goto L63
        L62:
            r2 = r1
        L63:
            if (r2 == 0) goto L69
            kotlin.reflect.jvm.internal.impl.name.FqName r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.fqNameOrNull(r2)
        L69:
            kotlin.reflect.jvm.internal.impl.name.FqName r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L76
            kotlin.reflect.jvm.internal.impl.types.SimpleType r5 = r5.createSimpleSuspendFunctionType(r6, r0)
            return r5
        L76:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r5 = r5.createSimpleSuspendFunctionType(r6, r0)
            return r5
        L7b:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r6 = (kotlin.reflect.jvm.internal.impl.types.SimpleType) r6
            return r6
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.transformRuntimeFunctionTypeToSuspendFunction(kotlin.reflect.jvm.internal.impl.types.KotlinType):kotlin.reflect.jvm.internal.impl.types.SimpleType");
    }

    private final TypeProjection typeArgument(TypeParameterDescriptor typeParameterDescriptor, ProtoBuf.Type.Argument argument) {
        if (argument.getProjection() == ProtoBuf.Type.Argument.Projection.STAR) {
            return typeParameterDescriptor == null ? new StarProjectionForAbsentTypeParameter(this.f7138c.getComponents().getModuleDescriptor().getBuiltIns()) : new StarProjectionImpl(typeParameterDescriptor);
        }
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
        Intrinsics.checkNotNullExpressionValue(projection, "getProjection(...)");
        Variance variance = protoEnumFlags.variance(projection);
        ProtoBuf.Type type = ProtoTypeTableUtilKt.type(argument, this.f7138c.getTypeTable());
        return type == null ? new TypeProjectionImpl(ErrorUtils.createErrorType(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString())) : new TypeProjectionImpl(variance, type(type));
    }

    private final TypeConstructor typeConstructor(ProtoBuf.Type type) {
        ClassifierDescriptor invoke;
        Object obj;
        if (type.hasClassName()) {
            invoke = this.classifierDescriptors.invoke(Integer.valueOf(type.getClassName()));
            if (invoke == null) {
                invoke = typeConstructor$notFoundClass(this, type, type.getClassName());
            }
        } else if (type.hasTypeParameter()) {
            invoke = loadTypeParameter(type.getTypeParameter());
            if (invoke == null) {
                return ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(type.getTypeParameter()), this.containerPresentableName);
            }
        } else if (type.hasTypeParameterName()) {
            String string = this.f7138c.getNameResolver().getString(type.getTypeParameterName());
            Iterator<T> it = getOwnTypeParameters().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((TypeParameterDescriptor) obj).getName().asString(), string)) {
                    break;
                }
            }
            invoke = (TypeParameterDescriptor) obj;
            if (invoke == null) {
                return ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f7138c.getContainingDeclaration().toString());
            }
        } else {
            if (!type.hasTypeAliasName()) {
                return ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
            }
            invoke = this.typeAliasDescriptors.invoke(Integer.valueOf(type.getTypeAliasName()));
            if (invoke == null) {
                invoke = typeConstructor$notFoundClass(this, type, type.getTypeAliasName());
            }
        }
        TypeConstructor typeConstructor = invoke.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        return typeConstructor;
    }

    private static final ClassDescriptor typeConstructor$notFoundClass(final TypeDeserializer typeDeserializer, ProtoBuf.Type type, int i) {
        ClassId classId = NameResolverUtilKt.getClassId(typeDeserializer.f7138c.getNameResolver(), i);
        List<Integer> mutableList = SequencesKt.toMutableList(SequencesKt.map(SequencesKt.generateSequence(type, new Function1<ProtoBuf.Type, ProtoBuf.Type>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final ProtoBuf.Type invoke(ProtoBuf.Type it) {
                DeserializationContext deserializationContext;
                Intrinsics.checkNotNullParameter(it, "it");
                deserializationContext = TypeDeserializer.this.f7138c;
                return ProtoTypeTableUtilKt.outerType(it, deserializationContext.getTypeTable());
            }
        }), new Function1<ProtoBuf.Type, Integer>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2
            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(ProtoBuf.Type it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.getArgumentCount());
            }
        }));
        int count = SequencesKt.count(SequencesKt.generateSequence(classId, TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1.INSTANCE));
        while (mutableList.size() < count) {
            mutableList.add(0);
        }
        return typeDeserializer.f7138c.getComponents().getNotFoundClasses().getClass(classId, mutableList);
    }

    public final List<TypeParameterDescriptor> getOwnTypeParameters() {
        return CollectionsKt.toList(this.typeParameterDescriptors.values());
    }

    public final SimpleType simpleType(final ProtoBuf.Type proto, boolean z3) {
        int collectionSizeOrDefault;
        SimpleType simpleType;
        SimpleType withAbbreviation;
        Intrinsics.checkNotNullParameter(proto, "proto");
        SimpleType computeLocalClassifierReplacementType = proto.hasClassName() ? computeLocalClassifierReplacementType(proto.getClassName()) : proto.hasTypeAliasName() ? computeLocalClassifierReplacementType(proto.getTypeAliasName()) : null;
        if (computeLocalClassifierReplacementType != null) {
            return computeLocalClassifierReplacementType;
        }
        TypeConstructor typeConstructor = typeConstructor(proto);
        if (ErrorUtils.isError(typeConstructor.mo1394getDeclarationDescriptor())) {
            return ErrorUtils.INSTANCE.createErrorType(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, typeConstructor, typeConstructor.toString());
        }
        DeserializedAnnotations deserializedAnnotations = new DeserializedAnnotations(this.f7138c.getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$simpleType$annotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AnnotationDescriptor> invoke() {
                DeserializationContext deserializationContext;
                DeserializationContext deserializationContext2;
                deserializationContext = TypeDeserializer.this.f7138c;
                AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = deserializationContext.getComponents().getAnnotationAndConstantLoader();
                ProtoBuf.Type type = proto;
                deserializationContext2 = TypeDeserializer.this.f7138c;
                return annotationAndConstantLoader.loadTypeAnnotations(type, deserializationContext2.getNameResolver());
            }
        });
        TypeAttributes attributes = toAttributes(this.f7138c.getComponents().getTypeAttributeTranslators(), deserializedAnnotations, typeConstructor, this.f7138c.getContainingDeclaration());
        List<ProtoBuf.Type.Argument> simpleType$collectAllArguments = simpleType$collectAllArguments(proto, this);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(simpleType$collectAllArguments, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        int i = 0;
        for (Object obj : simpleType$collectAllArguments) {
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            arrayList.add(typeArgument((TypeParameterDescriptor) CollectionsKt.getOrNull(parameters, i), (ProtoBuf.Type.Argument) obj));
            i = i4;
        }
        List<? extends TypeProjection> list = CollectionsKt.toList(arrayList);
        ClassifierDescriptor mo1394getDeclarationDescriptor = typeConstructor.mo1394getDeclarationDescriptor();
        if (z3 && (mo1394getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
            SimpleType computeExpandedType = KotlinTypeFactory.computeExpandedType((TypeAliasDescriptor) mo1394getDeclarationDescriptor, list);
            simpleType = computeExpandedType.makeNullableAsSpecified(KotlinTypeKt.isNullable(computeExpandedType) || proto.getNullable()).replaceAttributes(toAttributes(this.f7138c.getComponents().getTypeAttributeTranslators(), Annotations.Companion.create(CollectionsKt.plus((Iterable) deserializedAnnotations, (Iterable) computeExpandedType.getAnnotations())), typeConstructor, this.f7138c.getContainingDeclaration()));
        } else {
            Boolean bool = Flags.SUSPEND_TYPE.get(proto.getFlags());
            Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
            if (bool.booleanValue()) {
                simpleType = createSuspendFunctionType(attributes, typeConstructor, list, proto.getNullable());
            } else {
                SimpleType simpleType$default = KotlinTypeFactory.simpleType$default(attributes, typeConstructor, list, proto.getNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
                Boolean bool2 = Flags.DEFINITELY_NOT_NULL_TYPE.get(proto.getFlags());
                Intrinsics.checkNotNullExpressionValue(bool2, "get(...)");
                if (bool2.booleanValue()) {
                    simpleType = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleType$default, true, false, 4, null);
                    if (simpleType == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleType$default + '\'').toString());
                    }
                } else {
                    simpleType = simpleType$default;
                }
            }
        }
        ProtoBuf.Type abbreviatedType = ProtoTypeTableUtilKt.abbreviatedType(proto, this.f7138c.getTypeTable());
        return (abbreviatedType == null || (withAbbreviation = SpecialTypesKt.withAbbreviation(simpleType, simpleType(abbreviatedType, false))) == null) ? simpleType : withAbbreviation;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.debugName);
        if (this.parent == null) {
            str = "";
        } else {
            str = ". Child of " + this.parent.debugName;
        }
        sb.append(str);
        return sb.toString();
    }

    public final KotlinType type(ProtoBuf.Type proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        if (!proto.hasFlexibleTypeCapabilitiesId()) {
            return simpleType(proto, true);
        }
        String string = this.f7138c.getNameResolver().getString(proto.getFlexibleTypeCapabilitiesId());
        SimpleType simpleType$default = simpleType$default(this, proto, false, 2, null);
        ProtoBuf.Type flexibleUpperBound = ProtoTypeTableUtilKt.flexibleUpperBound(proto, this.f7138c.getTypeTable());
        Intrinsics.checkNotNull(flexibleUpperBound);
        return this.f7138c.getComponents().getFlexibleTypeDeserializer().create(proto, string, simpleType$default, simpleType$default(this, flexibleUpperBound, false, 2, null));
    }
}
