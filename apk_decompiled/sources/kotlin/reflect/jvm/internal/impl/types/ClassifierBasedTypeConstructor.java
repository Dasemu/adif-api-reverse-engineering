package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension({"SMAP\nClassifierBasedTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassifierBasedTypeConstructor.kt\norg/jetbrains/kotlin/types/ClassifierBasedTypeConstructor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
/* loaded from: classes3.dex */
public abstract class ClassifierBasedTypeConstructor implements TypeConstructor {
    private int hashCode;

    private final boolean hasMeaningfulFqName(ClassifierDescriptor classifierDescriptor) {
        return (ErrorUtils.isError(classifierDescriptor) || DescriptorUtils.isLocal(classifierDescriptor)) ? false : true;
    }

    public final boolean areFqNamesEqual(ClassifierDescriptor first, ClassifierDescriptor second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (!Intrinsics.areEqual(first.getName(), second.getName())) {
            return false;
        }
        DeclarationDescriptor containingDeclaration = first.getContainingDeclaration();
        for (DeclarationDescriptor containingDeclaration2 = second.getContainingDeclaration(); containingDeclaration != null && containingDeclaration2 != null; containingDeclaration2 = containingDeclaration2.getContainingDeclaration()) {
            if (containingDeclaration instanceof ModuleDescriptor) {
                return containingDeclaration2 instanceof ModuleDescriptor;
            }
            if (containingDeclaration2 instanceof ModuleDescriptor) {
                return false;
            }
            if (containingDeclaration instanceof PackageFragmentDescriptor) {
                return (containingDeclaration2 instanceof PackageFragmentDescriptor) && Intrinsics.areEqual(((PackageFragmentDescriptor) containingDeclaration).getFqName(), ((PackageFragmentDescriptor) containingDeclaration2).getFqName());
            }
            if ((containingDeclaration2 instanceof PackageFragmentDescriptor) || !Intrinsics.areEqual(containingDeclaration.getName(), containingDeclaration2.getName())) {
                return false;
            }
            containingDeclaration = containingDeclaration.getContainingDeclaration();
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeConstructor) || obj.hashCode() != hashCode()) {
            return false;
        }
        TypeConstructor typeConstructor = (TypeConstructor) obj;
        if (typeConstructor.getParameters().size() != getParameters().size()) {
            return false;
        }
        ClassifierDescriptor mo1394getDeclarationDescriptor = mo1394getDeclarationDescriptor();
        ClassifierDescriptor mo1394getDeclarationDescriptor2 = typeConstructor.mo1394getDeclarationDescriptor();
        if (mo1394getDeclarationDescriptor2 != null && hasMeaningfulFqName(mo1394getDeclarationDescriptor) && hasMeaningfulFqName(mo1394getDeclarationDescriptor2)) {
            return isSameClassifier(mo1394getDeclarationDescriptor2);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public abstract ClassifierDescriptor mo1394getDeclarationDescriptor();

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        ClassifierDescriptor mo1394getDeclarationDescriptor = mo1394getDeclarationDescriptor();
        int hashCode = hasMeaningfulFqName(mo1394getDeclarationDescriptor) ? DescriptorUtils.getFqName(mo1394getDeclarationDescriptor).hashCode() : System.identityHashCode(this);
        this.hashCode = hashCode;
        return hashCode;
    }

    public abstract boolean isSameClassifier(ClassifierDescriptor classifierDescriptor);
}
