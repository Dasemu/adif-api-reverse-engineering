package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;

/* loaded from: classes3.dex */
public class DeclarationDescriptorVisitorEmptyBodies<R, D> implements DeclarationDescriptorVisitor<R, D> {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitClassDescriptor(ClassDescriptor classDescriptor, D d4) {
        return visitDeclarationDescriptor(classDescriptor, d4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, D d4) {
        return visitFunctionDescriptor(constructorDescriptor, d4);
    }

    public R visitDeclarationDescriptor(DeclarationDescriptor declarationDescriptor, D d4) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitFunctionDescriptor(FunctionDescriptor functionDescriptor, D d4) {
        return visitDeclarationDescriptor(functionDescriptor, d4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitModuleDeclaration(ModuleDescriptor moduleDescriptor, D d4) {
        return visitDeclarationDescriptor(moduleDescriptor, d4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor, D d4) {
        return visitDeclarationDescriptor(packageFragmentDescriptor, d4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor, D d4) {
        return visitDeclarationDescriptor(packageViewDescriptor, d4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, D d4) {
        return visitVariableDescriptor(propertyDescriptor, d4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor, D d4) {
        return visitFunctionDescriptor(propertyGetterDescriptor, d4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor, D d4) {
        return visitFunctionDescriptor(propertySetterDescriptor, d4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor, D d4) {
        return visitDeclarationDescriptor(receiverParameterDescriptor, d4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor, D d4) {
        return visitDeclarationDescriptor(typeAliasDescriptor, d4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, D d4) {
        return visitDeclarationDescriptor(typeParameterDescriptor, d4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor, D d4) {
        return visitVariableDescriptor(valueParameterDescriptor, d4);
    }

    public R visitVariableDescriptor(VariableDescriptor variableDescriptor, D d4) {
        return visitDeclarationDescriptor(variableDescriptor, d4);
    }
}
