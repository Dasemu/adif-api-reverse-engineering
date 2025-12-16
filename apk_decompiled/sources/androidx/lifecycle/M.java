package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f3303a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f3304b = new HashMap();

    public static void a(Constructor constructor, I i) {
        try {
            Object newInstance = constructor.newInstance(i);
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n            constructo…tance(`object`)\n        }");
            if (newInstance == null) {
            } else {
                throw new ClassCastException();
            }
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static final String b(String className) {
        String replace$default;
        Intrinsics.checkNotNullParameter(className, "className");
        StringBuilder sb = new StringBuilder();
        replace$default = StringsKt__StringsJVMKt.replace$default(className, ".", "_", false, 4, (Object) null);
        sb.append(replace$default);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    public static int c(Class cls) {
        Constructor<?> constructor;
        boolean z3;
        HashMap hashMap = f3303a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r32 = cls.getPackage();
                String name = cls.getCanonicalName();
                String fullPackage = r32 != null ? r32.getName() : "";
                Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
                if (fullPackage.length() != 0) {
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    name = name.substring(fullPackage.length() + 1);
                    Intrinsics.checkNotNullExpressionValue(name, "this as java.lang.String).substring(startIndex)");
                }
                Intrinsics.checkNotNullExpressionValue(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String b4 = b(name);
                if (fullPackage.length() != 0) {
                    b4 = fullPackage + '.' + b4;
                }
                Class<?> cls2 = Class.forName(b4);
                Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
                constructor = cls2.getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException(e4);
            }
            HashMap hashMap2 = f3304b;
            if (constructor != null) {
                hashMap2.put(cls, CollectionsKt.listOf(constructor));
            } else {
                C0186g c0186g = C0186g.f3369c;
                HashMap hashMap3 = c0186g.f3371b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z3 = false;
                                break;
                            }
                            if (((Z) declaredMethods[i4].getAnnotation(Z.class)) != null) {
                                c0186g.a(cls, declaredMethods);
                                z3 = true;
                                break;
                            }
                            i4++;
                        }
                    } catch (NoClassDefFoundError e5) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e5);
                    }
                }
                if (!z3) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && I.class.isAssignableFrom(superclass)) {
                        Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
                        if (c(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            Intrinsics.checkNotNull(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length2) {
                            Class<?> intrface = interfaces[i5];
                            if (intrface != null && I.class.isAssignableFrom(intrface)) {
                                Intrinsics.checkNotNullExpressionValue(intrface, "intrface");
                                if (c(intrface) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(intrface);
                                Intrinsics.checkNotNull(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i5++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        hashMap.put(cls, Integer.valueOf(i));
        return i;
    }
}
