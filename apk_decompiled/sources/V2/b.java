package V2;

import a.AbstractC0106b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class b extends AbstractC0106b {

    /* renamed from: a, reason: collision with root package name */
    public final Method f1874a = Class.class.getMethod("isRecord", new Class[0]);

    /* renamed from: b, reason: collision with root package name */
    public final Method f1875b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f1876c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f1877d;

    public b() {
        Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
        this.f1875b = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f1876c = componentType.getMethod("getName", new Class[0]);
        this.f1877d = componentType.getMethod("getType", new Class[0]);
    }

    @Override // a.AbstractC0106b
    public final Method j(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), new Class[0]);
        } catch (ReflectiveOperationException e4) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e4);
        }
    }

    @Override // a.AbstractC0106b
    public final Constructor k(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f1875b.invoke(cls, new Object[0]);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f1877d.invoke(objArr[i], new Object[0]);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e4) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e4);
        }
    }

    @Override // a.AbstractC0106b
    public final String[] o(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f1875b.invoke(cls, new Object[0]);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f1876c.invoke(objArr[i], new Object[0]);
            }
            return strArr;
        } catch (ReflectiveOperationException e4) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e4);
        }
    }

    @Override // a.AbstractC0106b
    public final boolean t(Class cls) {
        try {
            return ((Boolean) this.f1874a.invoke(cls, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e4) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e4);
        }
    }
}
