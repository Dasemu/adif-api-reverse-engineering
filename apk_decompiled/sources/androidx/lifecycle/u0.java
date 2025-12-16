package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f3437a = CollectionsKt.listOf((Object[]) new Class[]{Application.class, n0.class});

    /* renamed from: b, reason: collision with root package name */
    public static final List f3438b = CollectionsKt.listOf(n0.class);

    public static final Constructor a(Class modelClass, List signature) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Constructor<?>[] constructors = modelClass.getConstructors();
        Intrinsics.checkNotNullExpressionValue(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "constructor.parameterTypes");
            List list = ArraysKt.toList(parameterTypes);
            if (Intrinsics.areEqual(signature, list)) {
                Intrinsics.checkNotNull(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == list.size() && list.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final w0 b(Class modelClass, Constructor constructor, Object... params) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            return (w0) constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Failed to access " + modelClass, e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e6.getCause());
        }
    }
}
