package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* loaded from: classes3.dex */
public final class LazyJavaTypeParameterResolver implements TypeParameterResolver {

    /* renamed from: c, reason: collision with root package name */
    private final LazyJavaResolverContext f7127c;
    private final DeclarationDescriptor containingDeclaration;
    private final MemoizedFunctionToNullable<JavaTypeParameter, LazyJavaTypeParameterDescriptor> resolve;
    private final Map<JavaTypeParameter, Integer> typeParameters;
    private final int typeParametersIndexOffset;

    public LazyJavaTypeParameterResolver(LazyJavaResolverContext c4, DeclarationDescriptor containingDeclaration, JavaTypeParameterListOwner typeParameterOwner, int i) {
        Intrinsics.checkNotNullParameter(c4, "c");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        this.f7127c = c4;
        this.containingDeclaration = containingDeclaration;
        this.typeParametersIndexOffset = i;
        this.typeParameters = CollectionsKt.mapToIndex(typeParameterOwner.getTypeParameters());
        this.resolve = c4.getStorageManager().createMemoizedFunctionWithNullableValues(new Function1<JavaTypeParameter, LazyJavaTypeParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver$resolve$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final LazyJavaTypeParameterDescriptor invoke(JavaTypeParameter typeParameter) {
                Map map;
                LazyJavaResolverContext lazyJavaResolverContext;
                DeclarationDescriptor declarationDescriptor;
                int i4;
                DeclarationDescriptor declarationDescriptor2;
                Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
                map = LazyJavaTypeParameterResolver.this.typeParameters;
                Integer num = (Integer) map.get(typeParameter);
                if (num == null) {
                    return null;
                }
                LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver = LazyJavaTypeParameterResolver.this;
                int intValue = num.intValue();
                lazyJavaResolverContext = lazyJavaTypeParameterResolver.f7127c;
                LazyJavaResolverContext child = ContextKt.child(lazyJavaResolverContext, lazyJavaTypeParameterResolver);
                declarationDescriptor = lazyJavaTypeParameterResolver.containingDeclaration;
                LazyJavaResolverContext copyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(child, declarationDescriptor.getAnnotations());
                i4 = lazyJavaTypeParameterResolver.typeParametersIndexOffset;
                declarationDescriptor2 = lazyJavaTypeParameterResolver.containingDeclaration;
                return new LazyJavaTypeParameterDescriptor(copyWithNewDefaultTypeQualifiers, typeParameter, i4 + intValue, declarationDescriptor2);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
    public TypeParameterDescriptor resolveTypeParameter(JavaTypeParameter javaTypeParameter) {
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        LazyJavaTypeParameterDescriptor invoke = this.resolve.invoke(javaTypeParameter);
        return invoke != null ? invoke : this.f7127c.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
    }
}
