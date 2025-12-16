package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@SourceDebugExtension({"SMAP\nAnnotationAndConstantLoaderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationAndConstantLoaderImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/AnnotationAndConstantLoaderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n1549#2:144\n1620#2,3:145\n1549#2:148\n1620#2,3:149\n1549#2:153\n1620#2,3:154\n1549#2:157\n1620#2,3:158\n1549#2:161\n1620#2,3:162\n1549#2:165\n1620#2,3:166\n1549#2:169\n1620#2,3:170\n1549#2:173\n1620#2,3:174\n1549#2:177\n1620#2,3:178\n1#3:152\n*S KotlinDebug\n*F\n+ 1 AnnotationAndConstantLoaderImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/AnnotationAndConstantLoaderImpl\n*L\n39#1:144\n39#1:145,3\n62#1:148\n62#1:149,3\n69#1:153\n69#1:154,3\n76#1:157\n76#1:158,3\n83#1:161\n83#1:162,3\n96#1:165\n96#1:166,3\n116#1:169\n116#1:170,3\n122#1:173\n122#1:174,3\n126#1:177\n126#1:178,3\n*E\n"})
/* loaded from: classes3.dex */
public final class AnnotationAndConstantLoaderImpl implements AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {
    private final AnnotationDeserializer deserializer;
    private final SerializerExtensionProtocol protocol;

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AnnotationAndConstantLoaderImpl(ModuleDescriptor module, NotFoundClasses notFoundClasses, SerializerExtensionProtocol protocol) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.protocol = protocol;
        this.deserializer = new AnnotationDeserializer(module, notFoundClasses);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public ConstantValue<?> loadAnnotationDefaultValue(ProtoContainer container, ProtoBuf.Property proto, KotlinType expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<AnnotationDescriptor> loadCallableAnnotations(ProtoContainer container, MessageLite proto, AnnotatedCallableKind kind) {
        List list;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (proto instanceof ProtoBuf.Constructor) {
            list = (List) ((ProtoBuf.Constructor) proto).getExtension(this.protocol.getConstructorAnnotation());
        } else if (proto instanceof ProtoBuf.Function) {
            list = (List) ((ProtoBuf.Function) proto).getExtension(this.protocol.getFunctionAnnotation());
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i == 1) {
                list = (List) ((ProtoBuf.Property) proto).getExtension(this.protocol.getPropertyAnnotation());
            } else if (i == 2) {
                list = (List) ((ProtoBuf.Property) proto).getExtension(this.protocol.getPropertyGetterAnnotation());
            } else {
                if (i != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((ProtoBuf.Property) proto).getExtension(this.protocol.getPropertySetterAnnotation());
            }
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.deserializer.deserializeAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<AnnotationDescriptor> loadClassAnnotations(ProtoContainer.Class container) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(container, "container");
        List list = (List) container.getClassProto().getExtension(this.protocol.getClassAnnotation());
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.deserializer.deserializeAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<AnnotationDescriptor> loadEnumEntryAnnotations(ProtoContainer container, ProtoBuf.EnumEntry proto) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        List list = (List) proto.getExtension(this.protocol.getEnumEntryAnnotation());
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.deserializer.deserializeAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<AnnotationDescriptor> loadExtensionReceiverParameterAnnotations(ProtoContainer container, MessageLite proto, AnnotatedCallableKind kind) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        List list = null;
        if (proto instanceof ProtoBuf.Function) {
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> functionExtensionReceiverAnnotation = this.protocol.getFunctionExtensionReceiverAnnotation();
            if (functionExtensionReceiverAnnotation != null) {
                list = (List) ((ProtoBuf.Function) proto).getExtension(functionExtensionReceiverAnnotation);
            }
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + kind).toString());
            }
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyExtensionReceiverAnnotation = this.protocol.getPropertyExtensionReceiverAnnotation();
            if (propertyExtensionReceiverAnnotation != null) {
                list = (List) ((ProtoBuf.Property) proto).getExtension(propertyExtensionReceiverAnnotation);
            }
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.deserializer.deserializeAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<AnnotationDescriptor> loadPropertyBackingFieldAnnotations(ProtoContainer container, ProtoBuf.Property proto) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyBackingFieldAnnotation = this.protocol.getPropertyBackingFieldAnnotation();
        List list = propertyBackingFieldAnnotation != null ? (List) proto.getExtension(propertyBackingFieldAnnotation) : null;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.deserializer.deserializeAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<AnnotationDescriptor> loadPropertyDelegateFieldAnnotations(ProtoContainer container, ProtoBuf.Property proto) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyDelegatedFieldAnnotation = this.protocol.getPropertyDelegatedFieldAnnotation();
        List list = propertyDelegatedFieldAnnotation != null ? (List) proto.getExtension(propertyDelegatedFieldAnnotation) : null;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.deserializer.deserializeAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<AnnotationDescriptor> loadTypeAnnotations(ProtoBuf.Type proto, NameResolver nameResolver) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        List list = (List) proto.getExtension(this.protocol.getTypeAnnotation());
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.deserializer.deserializeAnnotation((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<AnnotationDescriptor> loadTypeParameterAnnotations(ProtoBuf.TypeParameter proto, NameResolver nameResolver) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        List list = (List) proto.getExtension(this.protocol.getTypeParameterAnnotation());
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.deserializer.deserializeAnnotation((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<AnnotationDescriptor> loadValueParameterAnnotations(ProtoContainer container, MessageLite callableProto, AnnotatedCallableKind kind, int i, ProtoBuf.ValueParameter proto) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(callableProto, "callableProto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        List list = (List) proto.getExtension(this.protocol.getParameterAnnotation());
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.deserializer.deserializeAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public ConstantValue<?> loadPropertyConstant(ProtoContainer container, ProtoBuf.Property proto, KotlinType expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        ProtoBuf.Annotation.Argument.Value value = (ProtoBuf.Annotation.Argument.Value) ProtoBufUtilKt.getExtensionOrNull(proto, this.protocol.getCompileTimeValue());
        if (value == null) {
            return null;
        }
        return this.deserializer.resolveValue(expectedType, value, container.getNameResolver());
    }
}
