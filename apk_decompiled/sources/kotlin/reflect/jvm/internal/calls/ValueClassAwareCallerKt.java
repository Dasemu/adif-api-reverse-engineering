package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0000\u001a \u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u001a/\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H\u0002\u001a(\u0010\u0012\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0010H\u0002\u001a\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0019*\u0004\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\u0002H\u0000\u001a6\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0014\"\n\b\u0000\u0010\u001b*\u0004\u0018\u00010\u001c*\b\u0012\u0004\u0012\u0002H\u001b0\u00142\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0010H\u0000\u001a\u0018\u0010\u001d\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u001a\u0018\u0010\u001f\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\u000b\u001a\u00020\u0002H\u0000\u001a\f\u0010 \u001a\u00020\u0010*\u00020\u0002H\u0002\u001a\u0014\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001e*\u0004\u0018\u00010\"H\u0000\u001a\u0012\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001e*\u00020\u0001H\u0002\u001a\f\u0010#\u001a\u00020$*\u00020%H\u0000\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006&"}, d2 = {"expectedReceiverType", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "getMfvcUnboxMethods", "", "Ljava/lang/reflect/Method;", "type", "Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", "getValueClassUnboxMethods", "descriptor", "makeKotlinParameterTypes", "isSpecificClass", "Lkotlin/Function1;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "", "Lkotlin/ExtensionFunctionType;", "checkParametersSize", "", "Lkotlin/reflect/jvm/internal/calls/Caller;", "expectedArgsSize", "", "isDefault", "coerceToExpectedReceiverType", "", "createValueClassAwareCallerIfNeeded", "M", "Ljava/lang/reflect/Member;", "getBoxMethod", "Ljava/lang/Class;", "getInlineClassUnboxMethod", "hasValueClassReceiver", "toInlineClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;", "toJvmDescriptor", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nValueClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCallerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,363:1\n1#2:364\n1549#3:365\n1620#3,3:366\n1549#3:369\n1620#3,3:370\n1620#3,3:373\n1747#3,3:376\n1747#3,3:379\n1360#3:382\n1446#3,2:383\n1549#3:385\n1620#3,3:386\n1448#3,3:389\n*S KotlinDebug\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCallerKt\n*L\n252#1:365\n252#1:366,3\n254#1:369\n254#1:370,3\n290#1:373,3\n299#1:376,3\n300#1:379,3\n247#1:382\n247#1:383,2\n248#1:385\n248#1:386,3\n247#1:389,3\n*E\n"})
/* loaded from: classes3.dex */
public final class ValueClassAwareCallerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkParametersSize(Caller<?> caller, int i, CallableMemberDescriptor callableMemberDescriptor, boolean z3) {
        if (CallerKt.getArity(caller) == i) {
            return;
        }
        throw new KotlinReflectionInternalError("Inconsistent number of parameters in the descriptor and Java reflection object: " + CallerKt.getArity(caller) + " != " + i + "\nCalling: " + callableMemberDescriptor + "\nParameter types: " + caller.getParameterTypes() + ")\nDefault: " + z3);
    }

    public static final Object coerceToExpectedReceiverType(Object obj, CallableMemberDescriptor descriptor) {
        KotlinType expectedReceiverType;
        Class<?> inlineClass;
        Method inlineClassUnboxMethod;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (((descriptor instanceof PropertyDescriptor) && InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass((VariableDescriptor) descriptor)) || (expectedReceiverType = getExpectedReceiverType(descriptor)) == null || (inlineClass = toInlineClass(expectedReceiverType)) == null || (inlineClassUnboxMethod = getInlineClassUnboxMethod(inlineClass, descriptor)) == null) ? obj : inlineClassUnboxMethod.invoke(obj, new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends Member> Caller<M> createValueClassAwareCallerIfNeeded(Caller<? extends M> caller, CallableMemberDescriptor descriptor, boolean z3) {
        Intrinsics.checkNotNullParameter(caller, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfValueClass(descriptor)) {
            List<ReceiverParameterDescriptor> contextReceiverParameters = descriptor.getContextReceiverParameters();
            Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "getContextReceiverParameters(...)");
            List<ReceiverParameterDescriptor> list = contextReceiverParameters;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    KotlinType type = ((ReceiverParameterDescriptor) it.next()).getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    if (InlineClassesUtilsKt.isValueClassType(type)) {
                        break;
                    }
                }
            }
            List<ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
            List<ValueParameterDescriptor> list2 = valueParameters;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    KotlinType type2 = ((ValueParameterDescriptor) it2.next()).getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                    if (InlineClassesUtilsKt.isValueClassType(type2)) {
                        break;
                    }
                }
            }
            KotlinType returnType = descriptor.getReturnType();
            if ((returnType == null || !InlineClassesUtilsKt.isInlineClassType(returnType)) && !hasValueClassReceiver(descriptor)) {
                return caller;
            }
        }
        return new ValueClassAwareCaller(descriptor, caller, z3);
    }

    public static /* synthetic */ Caller createValueClassAwareCallerIfNeeded$default(Caller caller, CallableMemberDescriptor callableMemberDescriptor, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            z3 = false;
        }
        return createValueClassAwareCallerIfNeeded(caller, callableMemberDescriptor, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method getBoxMethod(Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) {
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", getInlineClassUnboxMethod(cls, callableMemberDescriptor).getReturnType());
            Intrinsics.checkNotNull(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No box method found in inline class: " + cls + " (calling " + callableMemberDescriptor + ')');
        }
    }

    private static final KotlinType getExpectedReceiverType(CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        ReceiverParameterDescriptor dispatchReceiverParameter = callableMemberDescriptor.getDispatchReceiverParameter();
        if (extensionReceiverParameter != null) {
            return extensionReceiverParameter.getType();
        }
        if (dispatchReceiverParameter == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof ConstructorDescriptor) {
            return dispatchReceiverParameter.getType();
        }
        DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null) {
            return classDescriptor.getDefaultType();
        }
        return null;
    }

    public static final Method getInlineClassUnboxMethod(Class<?> cls, CallableMemberDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            Intrinsics.checkNotNull(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static final List<Method> getMfvcUnboxMethods(SimpleType type) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(type, "type");
        List<String> mfvcUnboxMethods$getUnboxMethodNameSuffixes = getMfvcUnboxMethods$getUnboxMethodNameSuffixes(TypeSubstitutionKt.asSimpleType(type));
        if (mfvcUnboxMethods$getUnboxMethodNameSuffixes == null) {
            return null;
        }
        List<String> list = mfvcUnboxMethods$getUnboxMethodNameSuffixes;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        ClassifierDescriptor mo1394getDeclarationDescriptor = type.getConstructor().mo1394getDeclarationDescriptor();
        Intrinsics.checkNotNull(mo1394getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class<?> javaClass = UtilKt.toJavaClass((ClassDescriptor) mo1394getDeclarationDescriptor);
        Intrinsics.checkNotNull(javaClass);
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(javaClass.getDeclaredMethod((String) it2.next(), new Class[0]));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    private static final List<String> getMfvcUnboxMethods$getUnboxMethodNameSuffixes(SimpleType simpleType) {
        ?? listOf;
        int collectionSizeOrDefault;
        if (!InlineClassesUtilsKt.needsMfvcFlattening(simpleType)) {
            return null;
        }
        ClassifierDescriptor mo1394getDeclarationDescriptor = simpleType.getConstructor().mo1394getDeclarationDescriptor();
        Intrinsics.checkNotNull(mo1394getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        MultiFieldValueClassRepresentation<SimpleType> multiFieldValueClassRepresentation = DescriptorUtilsKt.getMultiFieldValueClassRepresentation((ClassDescriptor) mo1394getDeclarationDescriptor);
        Intrinsics.checkNotNull(multiFieldValueClassRepresentation);
        List<Pair<Name, SimpleType>> underlyingPropertyNamesToTypes = multiFieldValueClassRepresentation.getUnderlyingPropertyNamesToTypes();
        ArrayList arrayList = new ArrayList();
        Iterator it = underlyingPropertyNamesToTypes.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Name name = (Name) pair.component1();
            List<String> mfvcUnboxMethods$getUnboxMethodNameSuffixes = getMfvcUnboxMethods$getUnboxMethodNameSuffixes((SimpleType) pair.component2());
            if (mfvcUnboxMethods$getUnboxMethodNameSuffixes != null) {
                List<String> list = mfvcUnboxMethods$getUnboxMethodNameSuffixes;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                listOf = new ArrayList(collectionSizeOrDefault);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    listOf.add(name.getIdentifier() + '-' + ((String) it2.next()));
                }
            } else {
                listOf = CollectionsKt.listOf(name.getIdentifier());
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, (Iterable) listOf);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Method> getValueClassUnboxMethods(SimpleType simpleType, CallableMemberDescriptor callableMemberDescriptor) {
        Method inlineClassUnboxMethod;
        List<Method> mfvcUnboxMethods = getMfvcUnboxMethods(simpleType);
        if (mfvcUnboxMethods != null) {
            return mfvcUnboxMethods;
        }
        Class<?> inlineClass = toInlineClass(simpleType);
        if (inlineClass == null || (inlineClassUnboxMethod = getInlineClassUnboxMethod(inlineClass, callableMemberDescriptor)) == null) {
            return null;
        }
        return CollectionsKt.listOf(inlineClassUnboxMethod);
    }

    private static final boolean hasValueClassReceiver(CallableMemberDescriptor callableMemberDescriptor) {
        KotlinType expectedReceiverType = getExpectedReceiverType(callableMemberDescriptor);
        return expectedReceiverType != null && InlineClassesUtilsKt.isValueClassType(expectedReceiverType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<KotlinType> makeKotlinParameterTypes(CallableMemberDescriptor callableMemberDescriptor, Function1<? super ClassDescriptor, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        KotlinType type = extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (callableMemberDescriptor instanceof ConstructorDescriptor) {
            ClassDescriptor constructedClass = ((ConstructorDescriptor) callableMemberDescriptor).getConstructedClass();
            Intrinsics.checkNotNullExpressionValue(constructedClass, "getConstructedClass(...)");
            if (constructedClass.isInner()) {
                DeclarationDescriptor containingDeclaration = constructedClass.getContainingDeclaration();
                Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                arrayList.add(((ClassDescriptor) containingDeclaration).getDefaultType());
            }
        } else {
            DeclarationDescriptor containingDeclaration2 = callableMemberDescriptor.getContainingDeclaration();
            Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "getContainingDeclaration(...)");
            if ((containingDeclaration2 instanceof ClassDescriptor) && function1.invoke(containingDeclaration2).booleanValue()) {
                arrayList.add(((ClassDescriptor) containingDeclaration2).getDefaultType());
            }
        }
        List<ValueParameterDescriptor> valueParameters = callableMemberDescriptor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        Iterator<T> it = valueParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).getType());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class<?> toInlineClass(KotlinType kotlinType) {
        KotlinType unsubstitutedUnderlyingType;
        Class<?> inlineClass = toInlineClass(kotlinType.getConstructor().mo1394getDeclarationDescriptor());
        if (inlineClass == null) {
            return null;
        }
        if (TypeUtils.isNullableType(kotlinType) && ((unsubstitutedUnderlyingType = InlineClassesUtilsKt.unsubstitutedUnderlyingType(kotlinType)) == null || TypeUtils.isNullableType(unsubstitutedUnderlyingType) || KotlinBuiltIns.isPrimitiveType(unsubstitutedUnderlyingType))) {
            return null;
        }
        return inlineClass;
    }

    public static final String toJvmDescriptor(ClassifierDescriptor classifierDescriptor) {
        Intrinsics.checkNotNullParameter(classifierDescriptor, "<this>");
        ClassId classId = DescriptorUtilsKt.getClassId(classifierDescriptor);
        Intrinsics.checkNotNull(classId);
        String asString = classId.asString();
        Intrinsics.checkNotNullExpressionValue(asString, "asString(...)");
        return ClassMapperLite.mapClass(asString);
    }

    public static final Class<?> toInlineClass(DeclarationDescriptor declarationDescriptor) {
        if (!(declarationDescriptor instanceof ClassDescriptor) || !InlineClassesUtilsKt.isInlineClass(declarationDescriptor)) {
            return null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        Class<?> javaClass = UtilKt.toJavaClass(classDescriptor);
        if (javaClass != null) {
            return javaClass;
        }
        throw new KotlinReflectionInternalError("Class object for the class " + classDescriptor.getName() + " cannot be found (classId=" + DescriptorUtilsKt.getClassId((ClassifierDescriptor) declarationDescriptor) + ')');
    }
}
