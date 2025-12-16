package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.MemberKindCheck;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck;
import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck;

/* loaded from: classes3.dex */
public final class OperatorChecks extends AbstractModifierChecks {
    public static final OperatorChecks INSTANCE = new OperatorChecks();
    private static final List<Checks> checks;

    static {
        Name name = OperatorNameConventions.GET;
        MemberKindCheck.MemberOrExtension memberOrExtension = MemberKindCheck.MemberOrExtension.INSTANCE;
        Checks checks2 = new Checks(name, new Check[]{memberOrExtension, new ValueParameterCountCheck.AtLeast(1)}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks3 = new Checks(OperatorNameConventions.SET, new Check[]{memberOrExtension, new ValueParameterCountCheck.AtLeast(2)}, new Function1<FunctionDescriptor, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(FunctionDescriptor $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                List<ValueParameterDescriptor> valueParameters = $receiver.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.lastOrNull((List) valueParameters);
                boolean z3 = false;
                if (valueParameterDescriptor != null && !DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) && valueParameterDescriptor.getVarargElementType() == null) {
                    z3 = true;
                }
                OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
                if (z3) {
                    return null;
                }
                return "last parameter should not have a default value or be a vararg";
            }
        });
        Name name2 = OperatorNameConventions.GET_VALUE;
        NoDefaultAndVarargsCheck noDefaultAndVarargsCheck = NoDefaultAndVarargsCheck.INSTANCE;
        ValueParameterCountCheck.AtLeast atLeast = new ValueParameterCountCheck.AtLeast(2);
        IsKPropertyCheck isKPropertyCheck = IsKPropertyCheck.INSTANCE;
        Checks checks4 = new Checks(name2, new Check[]{memberOrExtension, noDefaultAndVarargsCheck, atLeast, isKPropertyCheck}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks5 = new Checks(OperatorNameConventions.SET_VALUE, new Check[]{memberOrExtension, noDefaultAndVarargsCheck, new ValueParameterCountCheck.AtLeast(3), isKPropertyCheck}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks6 = new Checks(OperatorNameConventions.PROVIDE_DELEGATE, new Check[]{memberOrExtension, noDefaultAndVarargsCheck, new ValueParameterCountCheck.Equals(2), isKPropertyCheck}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks7 = new Checks(OperatorNameConventions.INVOKE, new Check[]{memberOrExtension}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Name name3 = OperatorNameConventions.CONTAINS;
        ValueParameterCountCheck.SingleValueParameter singleValueParameter = ValueParameterCountCheck.SingleValueParameter.INSTANCE;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.INSTANCE;
        Checks checks8 = new Checks(name3, new Check[]{memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck, returnsBoolean}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Name name4 = OperatorNameConventions.ITERATOR;
        ValueParameterCountCheck.NoValueParameters noValueParameters = ValueParameterCountCheck.NoValueParameters.INSTANCE;
        checks = CollectionsKt.listOf((Object[]) new Checks[]{checks2, checks3, checks4, checks5, checks6, checks7, checks8, new Checks(name4, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.NEXT, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.HAS_NEXT, new Check[]{memberOrExtension, noValueParameters, returnsBoolean}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.RANGE_TO, new Check[]{memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.RANGE_UNTIL, new Check[]{memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.EQUALS, new Check[]{MemberKindCheck.Member.INSTANCE}, new Function1<FunctionDescriptor, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2
            private static final boolean invoke$isAny(DeclarationDescriptor declarationDescriptor) {
                return (declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.isAny((ClassDescriptor) declarationDescriptor);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00a7 A[RETURN] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r3) {
                /*
                    r2 = this;
                    java.lang.String r2 = "$this$$receiver"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                    kotlin.reflect.jvm.internal.impl.util.OperatorChecks r2 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.INSTANCE
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r2 = r3.getContainingDeclaration()
                    java.lang.String r0 = "getContainingDeclaration(...)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                    boolean r2 = invoke$isAny(r2)
                    if (r2 != 0) goto L52
                    java.util.Collection r2 = r3.getOverriddenDescriptors()
                    java.lang.String r1 = "getOverriddenDescriptors(...)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    r1 = r2
                    java.util.Collection r1 = (java.util.Collection) r1
                    boolean r1 = r1.isEmpty()
                    if (r1 == 0) goto L2b
                    goto L49
                L2b:
                    java.util.Iterator r2 = r2.iterator()
                L2f:
                    boolean r1 = r2.hasNext()
                    if (r1 == 0) goto L49
                    java.lang.Object r1 = r2.next()
                    kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r1
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r1 = r1.getContainingDeclaration()
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
                    boolean r1 = invoke$isAny(r1)
                    if (r1 == 0) goto L2f
                    goto L52
                L49:
                    boolean r2 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt.isTypedEqualsInValueClass(r3)
                    if (r2 == 0) goto L50
                    goto L52
                L50:
                    r2 = 0
                    goto L53
                L52:
                    r2 = 1
                L53:
                    if (r2 != 0) goto La7
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r1 = "must override ''equals()'' in Any"
                    r2.<init>(r1)
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r1 = r3.getContainingDeclaration()
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
                    boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isValueClass(r1)
                    if (r0 == 0) goto L9d
                    kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer r0 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.SHORT_NAMES_IN_TYPES
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = r3.getContainingDeclaration()
                    java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r1)
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r3
                    kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r3.getDefaultType()
                    java.lang.String r1 = "getDefaultType(...)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
                    kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceArgumentsWithStarProjections(r3)
                    java.lang.String r3 = r0.renderType(r3)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = " or define ''equals(other: "
                    r0.<init>(r1)
                    r0.append(r3)
                    java.lang.String r3 = "): Boolean''"
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    r2.append(r3)
                L9d:
                    java.lang.String r2 = r2.toString()
                    java.lang.String r3 = "toString(...)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                    return r2
                La7:
                    r2 = 0
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2.invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor):java.lang.String");
            }
        }), new Checks(OperatorNameConventions.COMPARE_TO, new Check[]{memberOrExtension, ReturnsCheck.ReturnsInt.INSTANCE, singleValueParameter, noDefaultAndVarargsCheck}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.BINARY_OPERATION_NAMES, new Check[]{memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.SIMPLE_UNARY_OPERATION_NAMES, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(CollectionsKt.listOf((Object[]) new Name[]{OperatorNameConventions.INC, OperatorNameConventions.DEC}), new Check[]{memberOrExtension}, new Function1<FunctionDescriptor, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$3
            /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
            
                if (r5 != false) goto L14;
             */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r6) {
                /*
                    r5 = this;
                    java.lang.String r5 = "$this$$receiver"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
                    kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r5 = r6.getDispatchReceiverParameter()
                    if (r5 != 0) goto Lf
                    kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r5 = r6.getExtensionReceiverParameter()
                Lf:
                    kotlin.reflect.jvm.internal.impl.util.OperatorChecks r0 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.INSTANCE
                    r1 = 0
                    if (r5 == 0) goto L32
                    kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = r6.getReturnType()
                    if (r2 == 0) goto L28
                    kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r5.getType()
                    java.lang.String r4 = "getType(...)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                    boolean r2 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isSubtypeOf(r2, r3)
                    goto L29
                L28:
                    r2 = r1
                L29:
                    if (r2 != 0) goto L31
                    boolean r5 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.access$incDecCheckForExpectClass(r0, r6, r5)
                    if (r5 == 0) goto L32
                L31:
                    r1 = 1
                L32:
                    if (r1 != 0) goto L37
                    java.lang.String r5 = "receiver must be a supertype of the return type"
                    return r5
                L37:
                    r5 = 0
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$3.invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor):java.lang.String");
            }
        }), new Checks(OperatorNameConventions.ASSIGNMENT_OPERATIONS, new Check[]{memberOrExtension, ReturnsCheck.ReturnsUnit.INSTANCE, singleValueParameter, noDefaultAndVarargsCheck}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.COMPONENT_REGEX, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null)});
    }

    private OperatorChecks() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean incDecCheckForExpectClass(FunctionDescriptor functionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor) {
        ClassId classId;
        KotlinType returnType;
        ReceiverValue value = receiverParameterDescriptor.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        if (!(value instanceof ImplicitClassReceiver)) {
            return false;
        }
        ClassDescriptor classDescriptor = ((ImplicitClassReceiver) value).getClassDescriptor();
        if (!classDescriptor.isExpect() || (classId = DescriptorUtilsKt.getClassId(classDescriptor)) == null) {
            return false;
        }
        ClassifierDescriptor findClassifierAcrossModuleDependencies = FindClassInModuleKt.findClassifierAcrossModuleDependencies(DescriptorUtilsKt.getModule(classDescriptor), classId);
        TypeAliasDescriptor typeAliasDescriptor = findClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor ? (TypeAliasDescriptor) findClassifierAcrossModuleDependencies : null;
        if (typeAliasDescriptor == null || (returnType = functionDescriptor.getReturnType()) == null) {
            return false;
        }
        return TypeUtilsKt.isSubtypeOf(returnType, typeAliasDescriptor.getExpandedType());
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractModifierChecks
    public List<Checks> getChecks$descriptors() {
        return checks;
    }
}
