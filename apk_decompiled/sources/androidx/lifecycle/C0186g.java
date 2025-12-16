package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186g {

    /* renamed from: c, reason: collision with root package name */
    public static final C0186g f3369c = new C0186g();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3370a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3371b = new HashMap();

    public static void b(HashMap hashMap, C0185f c0185f, A a2, Class cls) {
        A a4 = (A) hashMap.get(c0185f);
        if (a4 == null || a2 == a4) {
            if (a4 == null) {
                hashMap.put(c0185f, a2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0185f.f3361b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + a4 + ", new value " + a2);
    }

    public final C0184e a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f3370a;
        if (superclass != null) {
            C0184e c0184e = (C0184e) hashMap2.get(superclass);
            if (c0184e == null) {
                c0184e = a(superclass, null);
            }
            hashMap.putAll(c0184e.f3354b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0184e c0184e2 = (C0184e) hashMap2.get(cls2);
            if (c0184e2 == null) {
                c0184e2 = a(cls2, null);
            }
            for (Map.Entry entry : c0184e2.f3354b.entrySet()) {
                b(hashMap, (C0185f) entry.getKey(), (A) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e4) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
            }
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            Z z4 = (Z) method.getAnnotation(Z.class);
            if (z4 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!J.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                A value = z4.value();
                if (parameterTypes.length > 1) {
                    if (!A.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != A.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0185f(method, i), value, cls);
                z3 = true;
            }
        }
        C0184e c0184e3 = new C0184e(hashMap);
        hashMap2.put(cls, c0184e3);
        this.f3371b.put(cls, Boolean.valueOf(z3));
        return c0184e3;
    }
}
