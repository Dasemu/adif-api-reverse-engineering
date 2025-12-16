package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x0 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static x0 f3439c;

    /* renamed from: d, reason: collision with root package name */
    public static final E2.e f3440d = new E2.e(25);

    /* renamed from: b, reason: collision with root package name */
    public final Application f3441b;

    public x0(Application application) {
        this.f3441b = application;
    }

    public final w0 a(Class cls, Application application) {
        if (!AbstractC0176a.class.isAssignableFrom(cls)) {
            return super.create(cls);
        }
        try {
            w0 w0Var = (w0) cls.getConstructor(Application.class).newInstance(application);
            Intrinsics.checkNotNullExpressionValue(w0Var, "{\n                try {\n…          }\n            }");
            return w0Var;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        }
    }

    @Override // androidx.lifecycle.z0, androidx.lifecycle.y0
    public final w0 create(Class modelClass, l0.c extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (this.f3441b != null) {
            return create(modelClass);
        }
        Application application = (Application) extras.a(f3440d);
        if (application != null) {
            return a(modelClass, application);
        }
        if (!AbstractC0176a.class.isAssignableFrom(modelClass)) {
            return super.create(modelClass);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    @Override // androidx.lifecycle.z0, androidx.lifecycle.y0
    public final w0 create(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Application application = this.f3441b;
        if (application != null) {
            return a(modelClass, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
