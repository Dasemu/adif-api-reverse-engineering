package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes3.dex */
public interface DeclarationDescriptorVisitor<R, D> {
    R visitClassDescriptor(ClassDescriptor classDescriptor, D d4);

    R visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, D d4);

    R visitFunctionDescriptor(FunctionDescriptor functionDescriptor, D d4);

    R visitModuleDeclaration(ModuleDescriptor moduleDescriptor, D d4);

    R visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor, D d4);

    R visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor, D d4);

    R visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, D d4);

    R visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor, D d4);

    R visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor, D d4);

    R visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor, D d4);

    R visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor, D d4);

    R visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, D d4);

    R visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor, D d4);
}
