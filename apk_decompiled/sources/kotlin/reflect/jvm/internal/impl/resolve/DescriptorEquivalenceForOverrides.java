package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes3.dex */
public final class DescriptorEquivalenceForOverrides {
    public static final DescriptorEquivalenceForOverrides INSTANCE = new DescriptorEquivalenceForOverrides();

    private DescriptorEquivalenceForOverrides() {
    }

    public static /* synthetic */ boolean areCallableDescriptorsEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z3, boolean z4, boolean z5, KotlinTypeRefiner kotlinTypeRefiner, int i, Object obj) {
        if ((i & 8) != 0) {
            z4 = true;
        }
        boolean z6 = z4;
        if ((i & 16) != 0) {
            z5 = false;
        }
        return descriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent(callableDescriptor, callableDescriptor2, z3, z6, z5, kotlinTypeRefiner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean areCallableDescriptorsEquivalent$lambda$0(boolean z3, final CallableDescriptor a2, final CallableDescriptor b4, TypeConstructor c12, TypeConstructor c22) {
        Intrinsics.checkNotNullParameter(a2, "$a");
        Intrinsics.checkNotNullParameter(b4, "$b");
        Intrinsics.checkNotNullParameter(c12, "c1");
        Intrinsics.checkNotNullParameter(c22, "c2");
        if (Intrinsics.areEqual(c12, c22)) {
            return true;
        }
        ClassifierDescriptor mo1394getDeclarationDescriptor = c12.mo1394getDeclarationDescriptor();
        ClassifierDescriptor mo1394getDeclarationDescriptor2 = c22.mo1394getDeclarationDescriptor();
        if ((mo1394getDeclarationDescriptor instanceof TypeParameterDescriptor) && (mo1394getDeclarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return INSTANCE.areTypeParametersEquivalent((TypeParameterDescriptor) mo1394getDeclarationDescriptor, (TypeParameterDescriptor) mo1394getDeclarationDescriptor2, z3, new Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Boolean invoke(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
                    return Boolean.valueOf(Intrinsics.areEqual(declarationDescriptor, CallableDescriptor.this) && Intrinsics.areEqual(declarationDescriptor2, b4));
                }
            });
        }
        return false;
    }

    private final boolean areClassesEquivalent(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        return Intrinsics.areEqual(classDescriptor.getTypeConstructor(), classDescriptor2.getTypeConstructor());
    }

    public static /* synthetic */ boolean areEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 8) != 0) {
            z4 = true;
        }
        return descriptorEquivalenceForOverrides.areEquivalent(declarationDescriptor, declarationDescriptor2, z3, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean areTypeParametersEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, boolean z3, Function2 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            function2 = new Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1
                @Override // kotlin.jvm.functions.Function2
                public final Boolean invoke(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
                    return Boolean.FALSE;
                }
            };
        }
        return descriptorEquivalenceForOverrides.areTypeParametersEquivalent(typeParameterDescriptor, typeParameterDescriptor2, z3, function2);
    }

    private final boolean ownersEquivalent(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> function2, boolean z3) {
        DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        DeclarationDescriptor containingDeclaration2 = declarationDescriptor2.getContainingDeclaration();
        return ((containingDeclaration instanceof CallableMemberDescriptor) || (containingDeclaration2 instanceof CallableMemberDescriptor)) ? function2.invoke(containingDeclaration, containingDeclaration2).booleanValue() : areEquivalent$default(this, containingDeclaration, containingDeclaration2, z3, false, 8, null);
    }

    private final SourceElement singleSource(CallableDescriptor callableDescriptor) {
        while (callableDescriptor instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) callableDescriptor;
            if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
            callableDescriptor = (CallableMemberDescriptor) CollectionsKt.singleOrNull(overriddenDescriptors);
            if (callableDescriptor == null) {
                return null;
            }
        }
        return callableDescriptor.getSource();
    }

    public final boolean areCallableDescriptorsEquivalent(final CallableDescriptor a2, final CallableDescriptor b4, final boolean z3, boolean z4, boolean z5, KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (Intrinsics.areEqual(a2, b4)) {
            return true;
        }
        if (!Intrinsics.areEqual(a2.getName(), b4.getName())) {
            return false;
        }
        if (z4 && (a2 instanceof MemberDescriptor) && (b4 instanceof MemberDescriptor) && ((MemberDescriptor) a2).isExpect() != ((MemberDescriptor) b4).isExpect()) {
            return false;
        }
        if ((Intrinsics.areEqual(a2.getContainingDeclaration(), b4.getContainingDeclaration()) && (!z3 || !Intrinsics.areEqual(singleSource(a2), singleSource(b4)))) || DescriptorUtils.isLocal(a2) || DescriptorUtils.isLocal(b4) || !ownersEquivalent(a2, b4, new Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$1
            @Override // kotlin.jvm.functions.Function2
            public final Boolean invoke(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
                return Boolean.FALSE;
            }
        }, z3)) {
            return false;
        }
        OverridingUtil create = OverridingUtil.create(kotlinTypeRefiner, new KotlinTypeChecker.TypeConstructorEquality(z3, a2, b4) { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$0
            private final boolean arg$0;
            private final CallableDescriptor arg$1;
            private final CallableDescriptor arg$2;

            {
                this.arg$0 = z3;
                this.arg$1 = a2;
                this.arg$2 = b4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
            public boolean equals(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
                boolean areCallableDescriptorsEquivalent$lambda$0;
                areCallableDescriptorsEquivalent$lambda$0 = DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent$lambda$0(this.arg$0, this.arg$1, this.arg$2, typeConstructor, typeConstructor2);
                return areCallableDescriptorsEquivalent$lambda$0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        OverridingUtil.OverrideCompatibilityInfo.Result result = create.isOverridableBy(a2, b4, null, !z5).getResult();
        OverridingUtil.OverrideCompatibilityInfo.Result result2 = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        return result == result2 && create.isOverridableBy(b4, a2, null, z5 ^ true).getResult() == result2;
    }

    public final boolean areEquivalent(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z3, boolean z4) {
        return ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) ? areClassesEquivalent((ClassDescriptor) declarationDescriptor, (ClassDescriptor) declarationDescriptor2) : ((declarationDescriptor instanceof TypeParameterDescriptor) && (declarationDescriptor2 instanceof TypeParameterDescriptor)) ? areTypeParametersEquivalent$default(this, (TypeParameterDescriptor) declarationDescriptor, (TypeParameterDescriptor) declarationDescriptor2, z3, null, 8, null) : ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) ? areCallableDescriptorsEquivalent$default(this, (CallableDescriptor) declarationDescriptor, (CallableDescriptor) declarationDescriptor2, z3, z4, false, KotlinTypeRefiner.Default.INSTANCE, 16, null) : ((declarationDescriptor instanceof PackageFragmentDescriptor) && (declarationDescriptor2 instanceof PackageFragmentDescriptor)) ? Intrinsics.areEqual(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), ((PackageFragmentDescriptor) declarationDescriptor2).getFqName()) : Intrinsics.areEqual(declarationDescriptor, declarationDescriptor2);
    }

    @JvmOverloads
    public final boolean areTypeParametersEquivalent(TypeParameterDescriptor a2, TypeParameterDescriptor b4, boolean z3) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return areTypeParametersEquivalent$default(this, a2, b4, z3, null, 8, null);
    }

    @JvmOverloads
    public final boolean areTypeParametersEquivalent(TypeParameterDescriptor a2, TypeParameterDescriptor b4, boolean z3, Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> equivalentCallables) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(equivalentCallables, "equivalentCallables");
        if (Intrinsics.areEqual(a2, b4)) {
            return true;
        }
        return !Intrinsics.areEqual(a2.getContainingDeclaration(), b4.getContainingDeclaration()) && ownersEquivalent(a2, b4, equivalentCallables, z3) && a2.getIndex() == b4.getIndex();
    }
}
