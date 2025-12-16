package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes3.dex */
public final class JavaAnnotationMapper {
    private static final Name DEPRECATED_ANNOTATION_MESSAGE;
    public static final JavaAnnotationMapper INSTANCE = new JavaAnnotationMapper();
    private static final Name RETENTION_ANNOTATION_VALUE;
    private static final Name TARGET_ANNOTATION_ALLOWED_TARGETS;
    private static final Map<FqName, FqName> kotlinToJavaNameMap;

    static {
        Name identifier = Name.identifier("message");
        Intrinsics.checkNotNullExpressionValue(identifier, "identifier(...)");
        DEPRECATED_ANNOTATION_MESSAGE = identifier;
        Name identifier2 = Name.identifier("allowedTargets");
        Intrinsics.checkNotNullExpressionValue(identifier2, "identifier(...)");
        TARGET_ANNOTATION_ALLOWED_TARGETS = identifier2;
        Name identifier3 = Name.identifier("value");
        Intrinsics.checkNotNullExpressionValue(identifier3, "identifier(...)");
        RETENTION_ANNOTATION_VALUE = identifier3;
        kotlinToJavaNameMap = MapsKt.mapOf(TuplesKt.to(StandardNames.FqNames.target, JvmAnnotationNames.TARGET_ANNOTATION), TuplesKt.to(StandardNames.FqNames.retention, JvmAnnotationNames.RETENTION_ANNOTATION), TuplesKt.to(StandardNames.FqNames.mustBeDocumented, JvmAnnotationNames.DOCUMENTED_ANNOTATION));
    }

    private JavaAnnotationMapper() {
    }

    public static /* synthetic */ AnnotationDescriptor mapOrResolveJavaAnnotation$default(JavaAnnotationMapper javaAnnotationMapper, JavaAnnotation javaAnnotation, LazyJavaResolverContext lazyJavaResolverContext, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            z3 = false;
        }
        return javaAnnotationMapper.mapOrResolveJavaAnnotation(javaAnnotation, lazyJavaResolverContext, z3);
    }

    public final AnnotationDescriptor findMappedJavaAnnotation(FqName kotlinName, JavaAnnotationOwner annotationOwner, LazyJavaResolverContext c4) {
        JavaAnnotation findAnnotation;
        Intrinsics.checkNotNullParameter(kotlinName, "kotlinName");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        Intrinsics.checkNotNullParameter(c4, "c");
        if (Intrinsics.areEqual(kotlinName, StandardNames.FqNames.deprecated)) {
            FqName DEPRECATED_ANNOTATION = JvmAnnotationNames.DEPRECATED_ANNOTATION;
            Intrinsics.checkNotNullExpressionValue(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            JavaAnnotation findAnnotation2 = annotationOwner.findAnnotation(DEPRECATED_ANNOTATION);
            if (findAnnotation2 != null || annotationOwner.isDeprecatedInJavaDoc()) {
                return new JavaDeprecatedAnnotationDescriptor(findAnnotation2, c4);
            }
        }
        FqName fqName = kotlinToJavaNameMap.get(kotlinName);
        if (fqName == null || (findAnnotation = annotationOwner.findAnnotation(fqName)) == null) {
            return null;
        }
        return mapOrResolveJavaAnnotation$default(INSTANCE, findAnnotation, c4, false, 4, null);
    }

    public final Name getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm() {
        return DEPRECATED_ANNOTATION_MESSAGE;
    }

    public final Name getRETENTION_ANNOTATION_VALUE$descriptors_jvm() {
        return RETENTION_ANNOTATION_VALUE;
    }

    public final Name getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm() {
        return TARGET_ANNOTATION_ALLOWED_TARGETS;
    }

    public final AnnotationDescriptor mapOrResolveJavaAnnotation(JavaAnnotation annotation, LazyJavaResolverContext c4, boolean z3) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c4, "c");
        ClassId classId = annotation.getClassId();
        if (Intrinsics.areEqual(classId, ClassId.topLevel(JvmAnnotationNames.TARGET_ANNOTATION))) {
            return new JavaTargetAnnotationDescriptor(annotation, c4);
        }
        if (Intrinsics.areEqual(classId, ClassId.topLevel(JvmAnnotationNames.RETENTION_ANNOTATION))) {
            return new JavaRetentionAnnotationDescriptor(annotation, c4);
        }
        if (Intrinsics.areEqual(classId, ClassId.topLevel(JvmAnnotationNames.DOCUMENTED_ANNOTATION))) {
            return new JavaAnnotationDescriptor(c4, annotation, StandardNames.FqNames.mustBeDocumented);
        }
        if (Intrinsics.areEqual(classId, ClassId.topLevel(JvmAnnotationNames.DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(c4, annotation, z3);
    }
}
