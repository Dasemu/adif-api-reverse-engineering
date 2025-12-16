package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.google.android.gms.measurement.internal.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@SourceDebugExtension({"SMAP\nMemberDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/MemberDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,371:1\n1#2:372\n1#2:391\n1559#3:373\n1590#3,4:374\n1569#3,11:378\n1864#3,2:389\n1866#3:392\n1580#3:393\n1549#3:394\n1620#3,3:395\n1559#3:398\n1590#3,4:399\n*S KotlinDebug\n*F\n+ 1 MemberDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/MemberDeserializer\n*L\n215#1:391\n63#1:373\n63#1:374,4\n215#1:378,11\n215#1:389,2\n215#1:392\n215#1:393\n243#1:394\n243#1:395,3\n327#1:398\n327#1:399,4\n*E\n"})
/* loaded from: classes3.dex */
public final class MemberDeserializer {
    private final AnnotationDeserializer annotationDeserializer;

    /* renamed from: c, reason: collision with root package name */
    private final DeserializationContext f7137c;

    public MemberDeserializer(DeserializationContext c4) {
        Intrinsics.checkNotNullParameter(c4, "c");
        this.f7137c = c4;
        this.annotationDeserializer = new AnnotationDeserializer(c4.getComponents().getModuleDescriptor(), c4.getComponents().getNotFoundClasses());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProtoContainer asProtoContainer(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return new ProtoContainer.Package(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), this.f7137c.getNameResolver(), this.f7137c.getTypeTable(), this.f7137c.getContainerSource());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).getThisAsProtoContainer$deserialization();
        }
        return null;
    }

    private final Annotations getAnnotations(final MessageLite messageLite, int i, final AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.HAS_ANNOTATIONS.get(i).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f7137c.getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AnnotationDescriptor> invoke() {
                DeserializationContext deserializationContext;
                ProtoContainer asProtoContainer;
                List<? extends AnnotationDescriptor> list;
                DeserializationContext deserializationContext2;
                MemberDeserializer memberDeserializer = MemberDeserializer.this;
                deserializationContext = memberDeserializer.f7137c;
                asProtoContainer = memberDeserializer.asProtoContainer(deserializationContext.getContainingDeclaration());
                if (asProtoContainer != null) {
                    MemberDeserializer memberDeserializer2 = MemberDeserializer.this;
                    MessageLite messageLite2 = messageLite;
                    AnnotatedCallableKind annotatedCallableKind2 = annotatedCallableKind;
                    deserializationContext2 = memberDeserializer2.f7137c;
                    list = CollectionsKt.toList(deserializationContext2.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(asProtoContainer, messageLite2, annotatedCallableKind2));
                } else {
                    list = null;
                }
                return list == null ? CollectionsKt.emptyList() : list;
            }
        });
    }

    private final ReceiverParameterDescriptor getDispatchReceiverParameter() {
        DeclarationDescriptor containingDeclaration = this.f7137c.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null) {
            return classDescriptor.getThisAsReceiverParameter();
        }
        return null;
    }

    private final Annotations getPropertyFieldAnnotations(final ProtoBuf.Property property, final boolean z3) {
        return !Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f7137c.getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getPropertyFieldAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AnnotationDescriptor> invoke() {
                DeserializationContext deserializationContext;
                ProtoContainer asProtoContainer;
                List<? extends AnnotationDescriptor> list;
                DeserializationContext deserializationContext2;
                DeserializationContext deserializationContext3;
                MemberDeserializer memberDeserializer = MemberDeserializer.this;
                deserializationContext = memberDeserializer.f7137c;
                asProtoContainer = memberDeserializer.asProtoContainer(deserializationContext.getContainingDeclaration());
                if (asProtoContainer != null) {
                    boolean z4 = z3;
                    MemberDeserializer memberDeserializer2 = MemberDeserializer.this;
                    ProtoBuf.Property property2 = property;
                    if (z4) {
                        deserializationContext3 = memberDeserializer2.f7137c;
                        list = CollectionsKt.toList(deserializationContext3.getComponents().getAnnotationAndConstantLoader().loadPropertyDelegateFieldAnnotations(asProtoContainer, property2));
                    } else {
                        deserializationContext2 = memberDeserializer2.f7137c;
                        list = CollectionsKt.toList(deserializationContext2.getComponents().getAnnotationAndConstantLoader().loadPropertyBackingFieldAnnotations(asProtoContainer, property2));
                    }
                } else {
                    list = null;
                }
                return list == null ? CollectionsKt.emptyList() : list;
            }
        });
    }

    private final Annotations getReceiverParameterAnnotations(final MessageLite messageLite, final AnnotatedCallableKind annotatedCallableKind) {
        return new DeserializedAnnotations(this.f7137c.getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getReceiverParameterAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AnnotationDescriptor> invoke() {
                DeserializationContext deserializationContext;
                ProtoContainer asProtoContainer;
                List<AnnotationDescriptor> list;
                DeserializationContext deserializationContext2;
                MemberDeserializer memberDeserializer = MemberDeserializer.this;
                deserializationContext = memberDeserializer.f7137c;
                asProtoContainer = memberDeserializer.asProtoContainer(deserializationContext.getContainingDeclaration());
                if (asProtoContainer != null) {
                    MemberDeserializer memberDeserializer2 = MemberDeserializer.this;
                    MessageLite messageLite2 = messageLite;
                    AnnotatedCallableKind annotatedCallableKind2 = annotatedCallableKind;
                    deserializationContext2 = memberDeserializer2.f7137c;
                    list = deserializationContext2.getComponents().getAnnotationAndConstantLoader().loadExtensionReceiverParameterAnnotations(asProtoContainer, messageLite2, annotatedCallableKind2);
                } else {
                    list = null;
                }
                return list == null ? CollectionsKt.emptyList() : list;
            }
        });
    }

    private final void initializeWithCoroutinesExperimentalityStatus(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<? extends ReceiverParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, List<? extends ValueParameterDescriptor> list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map<? extends CallableDescriptor.UserDataKey<?>, ?> map) {
        deserializedSimpleFunctionDescriptor.initialize(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, map);
    }

    private final int loadOldFlags(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    private final ReceiverParameterDescriptor toContextReceiver(ProtoBuf.Type type, DeserializationContext deserializationContext, CallableDescriptor callableDescriptor, int i) {
        return DescriptorFactory.createContextReceiverParameterForCallable(callableDescriptor, deserializationContext.getTypeDeserializer().type(type), null, Annotations.Companion.getEMPTY(), i);
    }

    private final List<ValueParameterDescriptor> valueParameters(List<ProtoBuf.ValueParameter> list, final MessageLite messageLite, final AnnotatedCallableKind annotatedCallableKind) {
        int collectionSizeOrDefault;
        DeclarationDescriptor containingDeclaration = this.f7137c.getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        CallableDescriptor callableDescriptor = (CallableDescriptor) containingDeclaration;
        DeclarationDescriptor containingDeclaration2 = callableDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "getContainingDeclaration(...)");
        final ProtoContainer asProtoContainer = asProtoContainer(containingDeclaration2);
        List<ProtoBuf.ValueParameter> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        final int i = 0;
        for (Object obj : list2) {
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int flags = valueParameter.hasFlags() ? valueParameter.getFlags() : 0;
            Annotations empty = (asProtoContainer == null || !a.z(Flags.HAS_ANNOTATIONS, flags, "get(...)")) ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f7137c.getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$valueParameters$1$annotations$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<? extends AnnotationDescriptor> invoke() {
                    DeserializationContext deserializationContext;
                    deserializationContext = MemberDeserializer.this.f7137c;
                    return CollectionsKt.toList(deserializationContext.getComponents().getAnnotationAndConstantLoader().loadValueParameterAnnotations(asProtoContainer, messageLite, annotatedCallableKind, i, valueParameter));
                }
            });
            Name name = NameResolverUtilKt.getName(this.f7137c.getNameResolver(), valueParameter.getName());
            KotlinType type = this.f7137c.getTypeDeserializer().type(ProtoTypeTableUtilKt.type(valueParameter, this.f7137c.getTypeTable()));
            boolean z3 = a.z(Flags.DECLARES_DEFAULT_VALUE, flags, "get(...)");
            boolean z4 = a.z(Flags.IS_CROSSINLINE, flags, "get(...)");
            boolean z5 = a.z(Flags.IS_NOINLINE, flags, "get(...)");
            ProtoBuf.Type varargElementType = ProtoTypeTableUtilKt.varargElementType(valueParameter, this.f7137c.getTypeTable());
            KotlinType type2 = varargElementType != null ? this.f7137c.getTypeDeserializer().type(varargElementType) : null;
            SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            CallableDescriptor callableDescriptor2 = callableDescriptor;
            arrayList.add(new ValueParameterDescriptorImpl(callableDescriptor2, null, i, empty, name, type, z3, z4, z5, type2, NO_SOURCE));
            callableDescriptor = callableDescriptor2;
            i = i4;
        }
        return CollectionsKt.toList(arrayList);
    }

    public final ClassConstructorDescriptor loadConstructor(ProtoBuf.Constructor proto, boolean z3) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        DeclarationDescriptor containingDeclaration = this.f7137c.getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        int flags = proto.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, null, getAnnotations(proto, flags, annotatedCallableKind), z3, CallableMemberDescriptor.Kind.DECLARATION, proto, this.f7137c.getNameResolver(), this.f7137c.getTypeTable(), this.f7137c.getVersionRequirementTable(), this.f7137c.getContainerSource(), null, 1024, null);
        MemberDeserializer memberDeserializer = DeserializationContext.childContext$default(this.f7137c, deserializedClassConstructorDescriptor, CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "getValueParameterList(...)");
        deserializedClassConstructorDescriptor.initialize(memberDeserializer.valueParameters(valueParameterList, proto, annotatedCallableKind), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(proto.getFlags())));
        deserializedClassConstructorDescriptor.setReturnType(classDescriptor.getDefaultType());
        deserializedClassConstructorDescriptor.setExpect(classDescriptor.isExpect());
        deserializedClassConstructorDescriptor.setHasStableParameterNames(!Flags.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES.get(proto.getFlags()).booleanValue());
        return deserializedClassConstructorDescriptor;
    }

    public final SimpleFunctionDescriptor loadFunction(ProtoBuf.Function proto) {
        KotlinType type;
        Intrinsics.checkNotNullParameter(proto, "proto");
        int flags = proto.hasFlags() ? proto.getFlags() : loadOldFlags(proto.getOldFlags());
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations annotations = getAnnotations(proto, flags, annotatedCallableKind);
        Annotations receiverParameterAnnotations = ProtoTypeTableUtilKt.hasReceiver(proto) ? getReceiverParameterAnnotations(proto, annotatedCallableKind) : Annotations.Companion.getEMPTY();
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(this.f7137c.getContainingDeclaration(), null, annotations, NameResolverUtilKt.getName(this.f7137c.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.memberKind(ProtoEnumFlags.INSTANCE, Flags.MEMBER_KIND.get(flags)), proto, this.f7137c.getNameResolver(), this.f7137c.getTypeTable(), Intrinsics.areEqual(DescriptorUtilsKt.getFqNameSafe(this.f7137c.getContainingDeclaration()).child(NameResolverUtilKt.getName(this.f7137c.getNameResolver(), proto.getName())), SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? VersionRequirementTable.Companion.getEMPTY() : this.f7137c.getVersionRequirementTable(), this.f7137c.getContainerSource(), null, 1024, null);
        DeserializationContext deserializationContext = this.f7137c;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        DeserializationContext childContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedSimpleFunctionDescriptor, typeParameterList, null, null, null, null, 60, null);
        ProtoBuf.Type receiverType = ProtoTypeTableUtilKt.receiverType(proto, this.f7137c.getTypeTable());
        ReceiverParameterDescriptor createExtensionReceiverParameterForCallable = (receiverType == null || (type = childContext$default.getTypeDeserializer().type(receiverType)) == null) ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedSimpleFunctionDescriptor, type, receiverParameterAnnotations);
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        List<ProtoBuf.Type> contextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(proto, this.f7137c.getTypeTable());
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : contextReceiverTypes) {
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ReceiverParameterDescriptor contextReceiver = toContextReceiver((ProtoBuf.Type) obj, childContext$default, deserializedSimpleFunctionDescriptor, i);
            if (contextReceiver != null) {
                arrayList.add(contextReceiver);
            }
            i = i4;
        }
        List<TypeParameterDescriptor> ownTypeParameters = childContext$default.getTypeDeserializer().getOwnTypeParameters();
        MemberDeserializer memberDeserializer = childContext$default.getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "getValueParameterList(...)");
        List<ValueParameterDescriptor> valueParameters = memberDeserializer.valueParameters(valueParameterList, proto, AnnotatedCallableKind.FUNCTION);
        KotlinType type2 = childContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(proto, this.f7137c.getTypeTable()));
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        initializeWithCoroutinesExperimentalityStatus(deserializedSimpleFunctionDescriptor, createExtensionReceiverParameterForCallable, dispatchReceiverParameter, arrayList, ownTypeParameters, valueParameters, type2, protoEnumFlags.modality(Flags.MODALITY.get(flags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(flags)), MapsKt.emptyMap());
        Boolean bool = Flags.IS_OPERATOR.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        deserializedSimpleFunctionDescriptor.setOperator(bool.booleanValue());
        Boolean bool2 = Flags.IS_INFIX.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool2, "get(...)");
        deserializedSimpleFunctionDescriptor.setInfix(bool2.booleanValue());
        Boolean bool3 = Flags.IS_EXTERNAL_FUNCTION.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool3, "get(...)");
        deserializedSimpleFunctionDescriptor.setExternal(bool3.booleanValue());
        Boolean bool4 = Flags.IS_INLINE.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool4, "get(...)");
        deserializedSimpleFunctionDescriptor.setInline(bool4.booleanValue());
        Boolean bool5 = Flags.IS_TAILREC.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool5, "get(...)");
        deserializedSimpleFunctionDescriptor.setTailrec(bool5.booleanValue());
        Boolean bool6 = Flags.IS_SUSPEND.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool6, "get(...)");
        deserializedSimpleFunctionDescriptor.setSuspend(bool6.booleanValue());
        Boolean bool7 = Flags.IS_EXPECT_FUNCTION.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool7, "get(...)");
        deserializedSimpleFunctionDescriptor.setExpect(bool7.booleanValue());
        deserializedSimpleFunctionDescriptor.setHasStableParameterNames(!Flags.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES.get(flags).booleanValue());
        Pair<CallableDescriptor.UserDataKey<?>, Object> deserializeContractFromFunction = this.f7137c.getComponents().getContractDeserializer().deserializeContractFromFunction(proto, deserializedSimpleFunctionDescriptor, this.f7137c.getTypeTable(), childContext$default.getTypeDeserializer());
        if (deserializeContractFromFunction != null) {
            deserializedSimpleFunctionDescriptor.putInUserDataMap(deserializeContractFromFunction.getFirst(), deserializeContractFromFunction.getSecond());
        }
        return deserializedSimpleFunctionDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PropertyDescriptor loadProperty(final ProtoBuf.Property proto) {
        int collectionSizeOrDefault;
        DeserializationContext deserializationContext;
        Flags.FlagField<ProtoBuf.Visibility> flagField;
        Flags.FlagField<ProtoBuf.Modality> flagField2;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        KotlinType type;
        Intrinsics.checkNotNullParameter(proto, "proto");
        int flags = proto.hasFlags() ? proto.getFlags() : loadOldFlags(proto.getOldFlags());
        DeclarationDescriptor containingDeclaration = this.f7137c.getContainingDeclaration();
        Annotations annotations = getAnnotations(proto, flags, AnnotatedCallableKind.PROPERTY);
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        int i = flags;
        final DeserializedPropertyDescriptor deserializedPropertyDescriptor = new DeserializedPropertyDescriptor(containingDeclaration, null, annotations, protoEnumFlags.modality(Flags.MODALITY.get(flags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(flags)), a.z(Flags.IS_VAR, flags, "get(...)"), NameResolverUtilKt.getName(this.f7137c.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.memberKind(protoEnumFlags, Flags.MEMBER_KIND.get(flags)), a.z(Flags.IS_LATEINIT, flags, "get(...)"), a.z(Flags.IS_CONST, flags, "get(...)"), a.z(Flags.IS_EXTERNAL_PROPERTY, flags, "get(...)"), a.z(Flags.IS_DELEGATED, flags, "get(...)"), a.z(Flags.IS_EXPECT_PROPERTY, flags, "get(...)"), proto, this.f7137c.getNameResolver(), this.f7137c.getTypeTable(), this.f7137c.getVersionRequirementTable(), this.f7137c.getContainerSource());
        DeserializationContext deserializationContext2 = this.f7137c;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        DeserializationContext childContext$default = DeserializationContext.childContext$default(deserializationContext2, deserializedPropertyDescriptor, typeParameterList, null, null, null, null, 60, null);
        boolean z3 = a.z(Flags.HAS_GETTER, i, "get(...)");
        Annotations receiverParameterAnnotations = (z3 && ProtoTypeTableUtilKt.hasReceiver(proto)) ? getReceiverParameterAnnotations(proto, AnnotatedCallableKind.PROPERTY_GETTER) : Annotations.Companion.getEMPTY();
        KotlinType type2 = childContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(proto, this.f7137c.getTypeTable()));
        List<TypeParameterDescriptor> ownTypeParameters = childContext$default.getTypeDeserializer().getOwnTypeParameters();
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        ProtoBuf.Type receiverType = ProtoTypeTableUtilKt.receiverType(proto, this.f7137c.getTypeTable());
        ReceiverParameterDescriptor createExtensionReceiverParameterForCallable = (receiverType == null || (type = childContext$default.getTypeDeserializer().type(receiverType)) == null) ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedPropertyDescriptor, type, receiverParameterAnnotations);
        List<ProtoBuf.Type> contextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(proto, this.f7137c.getTypeTable());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(contextReceiverTypes, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        int i4 = 0;
        for (Object obj : contextReceiverTypes) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(toContextReceiver((ProtoBuf.Type) obj, childContext$default, deserializedPropertyDescriptor, i4));
            i4 = i5;
        }
        deserializedPropertyDescriptor.setType(type2, ownTypeParameters, dispatchReceiverParameter, createExtensionReceiverParameterForCallable, arrayList);
        boolean z4 = a.z(Flags.HAS_ANNOTATIONS, i, "get(...)");
        Flags.FlagField<ProtoBuf.Visibility> flagField3 = Flags.VISIBILITY;
        ProtoBuf.Visibility visibility = flagField3.get(i);
        Flags.FlagField<ProtoBuf.Modality> flagField4 = Flags.MODALITY;
        int accessorFlags = Flags.getAccessorFlags(z4, visibility, flagField4.get(i), false, false, false);
        if (z3) {
            int getterFlags = proto.hasGetterFlags() ? proto.getGetterFlags() : accessorFlags;
            boolean z5 = a.z(Flags.IS_NOT_DEFAULT, getterFlags, "get(...)");
            boolean z6 = a.z(Flags.IS_EXTERNAL_ACCESSOR, getterFlags, "get(...)");
            boolean z7 = a.z(Flags.IS_INLINE_ACCESSOR, getterFlags, "get(...)");
            Annotations annotations2 = getAnnotations(proto, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
            if (z5) {
                ProtoEnumFlags protoEnumFlags2 = ProtoEnumFlags.INSTANCE;
                flagField = flagField3;
                deserializationContext = childContext$default;
                flagField2 = flagField4;
                propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations2, protoEnumFlags2.modality(flagField4.get(getterFlags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags2, flagField3.get(getterFlags)), !z5, z6, z7, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
            } else {
                deserializationContext = childContext$default;
                flagField = flagField3;
                flagField2 = flagField4;
                propertyGetterDescriptorImpl = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotations2);
                Intrinsics.checkNotNull(propertyGetterDescriptorImpl);
            }
            propertyGetterDescriptorImpl.initialize(deserializedPropertyDescriptor.getReturnType());
        } else {
            deserializationContext = childContext$default;
            flagField = flagField3;
            flagField2 = flagField4;
            propertyGetterDescriptorImpl = null;
        }
        if (a.z(Flags.HAS_SETTER, i, "get(...)")) {
            if (proto.hasSetterFlags()) {
                accessorFlags = proto.getSetterFlags();
            }
            int i6 = accessorFlags;
            boolean z8 = a.z(Flags.IS_NOT_DEFAULT, i6, "get(...)");
            boolean z9 = a.z(Flags.IS_EXTERNAL_ACCESSOR, i6, "get(...)");
            boolean z10 = a.z(Flags.IS_INLINE_ACCESSOR, i6, "get(...)");
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations annotations3 = getAnnotations(proto, i6, annotatedCallableKind);
            if (z8) {
                ProtoEnumFlags protoEnumFlags3 = ProtoEnumFlags.INSTANCE;
                propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl;
                PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotations3, protoEnumFlags3.modality(flagField2.get(i6)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags3, flagField.get(i6)), !z8, z9, z10, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
                propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) CollectionsKt.single((List) DeserializationContext.childContext$default(deserializationContext, propertySetterDescriptorImpl2, CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer().valueParameters(CollectionsKt.listOf(proto.getSetterValueParameter()), proto, annotatedCallableKind)));
            } else {
                propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl;
                PropertySetterDescriptorImpl createDefaultSetter = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, annotations3, Annotations.Companion.getEMPTY());
                Intrinsics.checkNotNull(createDefaultSetter);
                propertySetterDescriptorImpl = createDefaultSetter;
            }
        } else {
            propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl;
            propertySetterDescriptorImpl = null;
        }
        if (a.z(Flags.HAS_CONSTANT, i, "get(...)")) {
            deserializedPropertyDescriptor.setCompileTimeInitializerFactory(new Function0<NullableLazyValue<? extends ConstantValue<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final NullableLazyValue<? extends ConstantValue<?>> invoke() {
                    DeserializationContext deserializationContext3;
                    deserializationContext3 = MemberDeserializer.this.f7137c;
                    StorageManager storageManager = deserializationContext3.getStorageManager();
                    final MemberDeserializer memberDeserializer = MemberDeserializer.this;
                    final ProtoBuf.Property property = proto;
                    final DeserializedPropertyDescriptor deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
                    return storageManager.createNullableLazyValue(new Function0<ConstantValue<?>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final ConstantValue<?> invoke() {
                            DeserializationContext deserializationContext4;
                            ProtoContainer asProtoContainer;
                            DeserializationContext deserializationContext5;
                            MemberDeserializer memberDeserializer2 = MemberDeserializer.this;
                            deserializationContext4 = memberDeserializer2.f7137c;
                            asProtoContainer = memberDeserializer2.asProtoContainer(deserializationContext4.getContainingDeclaration());
                            Intrinsics.checkNotNull(asProtoContainer);
                            deserializationContext5 = MemberDeserializer.this.f7137c;
                            AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = deserializationContext5.getComponents().getAnnotationAndConstantLoader();
                            ProtoBuf.Property property2 = property;
                            KotlinType returnType = deserializedPropertyDescriptor2.getReturnType();
                            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                            return annotationAndConstantLoader.loadPropertyConstant(asProtoContainer, property2, returnType);
                        }
                    });
                }
            });
        }
        DeclarationDescriptor containingDeclaration2 = this.f7137c.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration2 instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration2 : null;
        if ((classDescriptor != null ? classDescriptor.getKind() : null) == ClassKind.ANNOTATION_CLASS) {
            deserializedPropertyDescriptor.setCompileTimeInitializerFactory(new Function0<NullableLazyValue<? extends ConstantValue<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final NullableLazyValue<? extends ConstantValue<?>> invoke() {
                    DeserializationContext deserializationContext3;
                    deserializationContext3 = MemberDeserializer.this.f7137c;
                    StorageManager storageManager = deserializationContext3.getStorageManager();
                    final MemberDeserializer memberDeserializer = MemberDeserializer.this;
                    final ProtoBuf.Property property = proto;
                    final DeserializedPropertyDescriptor deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
                    return storageManager.createNullableLazyValue(new Function0<ConstantValue<?>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$5.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final ConstantValue<?> invoke() {
                            DeserializationContext deserializationContext4;
                            ProtoContainer asProtoContainer;
                            DeserializationContext deserializationContext5;
                            MemberDeserializer memberDeserializer2 = MemberDeserializer.this;
                            deserializationContext4 = memberDeserializer2.f7137c;
                            asProtoContainer = memberDeserializer2.asProtoContainer(deserializationContext4.getContainingDeclaration());
                            Intrinsics.checkNotNull(asProtoContainer);
                            deserializationContext5 = MemberDeserializer.this.f7137c;
                            AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = deserializationContext5.getComponents().getAnnotationAndConstantLoader();
                            ProtoBuf.Property property2 = property;
                            KotlinType returnType = deserializedPropertyDescriptor2.getReturnType();
                            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                            return annotationAndConstantLoader.loadAnnotationDefaultValue(asProtoContainer, property2, returnType);
                        }
                    });
                }
            });
        }
        deserializedPropertyDescriptor.initialize(propertyGetterDescriptorImpl2, propertySetterDescriptorImpl, new FieldDescriptorImpl(getPropertyFieldAnnotations(proto, false), deserializedPropertyDescriptor), new FieldDescriptorImpl(getPropertyFieldAnnotations(proto, true), deserializedPropertyDescriptor));
        return deserializedPropertyDescriptor;
    }

    public final TypeAliasDescriptor loadTypeAlias(ProtoBuf.TypeAlias proto) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Annotations.Companion companion = Annotations.Companion;
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "getAnnotationList(...)");
        List<ProtoBuf.Annotation> list = annotationList;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (ProtoBuf.Annotation annotation : list) {
            AnnotationDeserializer annotationDeserializer = this.annotationDeserializer;
            Intrinsics.checkNotNull(annotation);
            arrayList.add(annotationDeserializer.deserializeAnnotation(annotation, this.f7137c.getNameResolver()));
        }
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.f7137c.getStorageManager(), this.f7137c.getContainingDeclaration(), companion.create(arrayList), NameResolverUtilKt.getName(this.f7137c.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(proto.getFlags())), proto, this.f7137c.getNameResolver(), this.f7137c.getTypeTable(), this.f7137c.getVersionRequirementTable(), this.f7137c.getContainerSource());
        DeserializationContext deserializationContext = this.f7137c;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        DeserializationContext childContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedTypeAliasDescriptor, typeParameterList, null, null, null, null, 60, null);
        deserializedTypeAliasDescriptor.initialize(childContext$default.getTypeDeserializer().getOwnTypeParameters(), childContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.underlyingType(proto, this.f7137c.getTypeTable()), false), childContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.expandedType(proto, this.f7137c.getTypeTable()), false));
        return deserializedTypeAliasDescriptor;
    }
}
