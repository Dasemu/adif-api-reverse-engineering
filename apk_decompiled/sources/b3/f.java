package b3;

import Q2.j;
import Z2.AbstractC0104l;
import Z2.G;
import Z2.m;
import Z2.o;
import Z2.r;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f4193a = Collections.EMPTY_SET;

    /* renamed from: b, reason: collision with root package name */
    public static final Type[] f4194b = new Type[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Class f4195c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f4196d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f4195c = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f4196d = Collections.unmodifiableMap(linkedHashMap);
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new c(a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof d) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new d(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof c ? type : new c(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof e)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new e(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    public static AbstractC0104l c(G g4, Type type, Class cls) {
        Constructor<?> declaredConstructor;
        Object[] objArr;
        m mVar = (m) cls.getAnnotation(m.class);
        Class<?> cls2 = null;
        if (mVar == null || !mVar.generateAdapter()) {
            return null;
        }
        try {
            try {
                Class<?> cls3 = Class.forName(cls.getName().replace("$", "_") + "JsonAdapter", true, cls.getClassLoader());
                try {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        try {
                            declaredConstructor = cls3.getDeclaredConstructor(G.class, Type[].class);
                            objArr = new Object[]{g4, actualTypeArguments};
                        } catch (NoSuchMethodException unused) {
                            declaredConstructor = cls3.getDeclaredConstructor(Type[].class);
                            objArr = new Object[]{actualTypeArguments};
                        }
                    } else {
                        try {
                            declaredConstructor = cls3.getDeclaredConstructor(G.class);
                            objArr = new Object[]{g4};
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = cls3.getDeclaredConstructor(new Class[0]);
                            objArr = new Object[0];
                        }
                    }
                    declaredConstructor.setAccessible(true);
                    return ((AbstractC0104l) declaredConstructor.newInstance(objArr)).nullSafe();
                } catch (NoSuchMethodException e4) {
                    e = e4;
                    cls2 = cls3;
                    if ((type instanceof ParameterizedType) || cls2.getTypeParameters().length == 0) {
                        throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e);
                    }
                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                }
            } catch (NoSuchMethodException e5) {
                e = e5;
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e6);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e8);
        } catch (InvocationTargetException e9) {
            i(e9);
            throw null;
        }
    }

    public static Type d(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return d(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static boolean e(Class cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static Set f(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(o.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f4193a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [Q2.j, java.lang.RuntimeException] */
    public static j g(String str, String str2, r rVar) {
        String str3;
        String O2 = rVar.O();
        if (str2.equals(str)) {
            str3 = "Required value '" + str + "' missing at " + O2;
        } else {
            str3 = "Required value '" + str + "' (JSON name '" + str2 + "') missing at " + O2;
        }
        return new RuntimeException(str3);
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:2:0x0002->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type h(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10, java.util.LinkedHashSet r11) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.f.h(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.LinkedHashSet):java.lang.reflect.Type");
    }

    public static void i(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (!(targetException instanceof Error)) {
            throw new RuntimeException(targetException);
        }
        throw ((Error) targetException);
    }

    public static String j(Type type, Set set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    public static String k(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [Q2.j, java.lang.RuntimeException] */
    public static j l(String str, String str2, r rVar) {
        String str3;
        String O2 = rVar.O();
        if (str2.equals(str)) {
            str3 = "Non-null value '" + str + "' was null at " + O2;
        } else {
            str3 = "Non-null value '" + str + "' (JSON name '" + str2 + "') was null at " + O2;
        }
        return new RuntimeException(str3);
    }
}
