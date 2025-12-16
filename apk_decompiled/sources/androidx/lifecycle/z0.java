package androidx.lifecycle;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public class z0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public static z0 f3442a;

    @Override // androidx.lifecycle.y0
    public w0 create(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        try {
            Object newInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (w0) newInstance;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e6);
        }
    }

    @Override // androidx.lifecycle.y0
    public w0 create(Class modelClass, l0.c extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return create(modelClass);
    }

    @Override // androidx.lifecycle.y0
    public final w0 create(KClass modelClass, l0.c extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return create(JvmClassMappingKt.getJavaClass(modelClass), extras);
    }
}
