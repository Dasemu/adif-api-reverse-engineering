package X2;

import S2.b;
import S2.d;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes3.dex */
public class a {
    private final int hashCode;
    private final Class<Object> rawType;
    private final Type type;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                Type a2 = d.a(parameterizedType.getActualTypeArguments()[0]);
                this.type = a2;
                this.rawType = d.g(a2);
                this.hashCode = a2.hashCode();
                return;
            }
        } else if (genericSuperclass == a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public static boolean a(Type type, ParameterizedType parameterizedType, HashMap hashMap) {
        int i;
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class g4 = d.g(type);
        ParameterizedType parameterizedType2 = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable[] typeParameters = g4.getTypeParameters();
            for (int i4 = 0; i4 < actualTypeArguments.length; i4++) {
                Type type2 = actualTypeArguments[i4];
                TypeVariable typeVariable = typeParameters[i4];
                while (type2 instanceof TypeVariable) {
                    type2 = (Type) hashMap.get(((TypeVariable) type2).getName());
                }
                hashMap.put(typeVariable.getName(), type2);
            }
            if (parameterizedType2.getRawType().equals(parameterizedType.getRawType())) {
                Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                Type[] actualTypeArguments3 = parameterizedType.getActualTypeArguments();
                for (0; i < actualTypeArguments2.length; i + 1) {
                    Type type3 = actualTypeArguments2[i];
                    Type type4 = actualTypeArguments3[i];
                    i = (type4.equals(type3) || ((type3 instanceof TypeVariable) && type4.equals(hashMap.get(((TypeVariable) type3).getName())))) ? i + 1 : 0;
                }
                return true;
            }
        }
        for (Type type5 : g4.getGenericInterfaces()) {
            if (a(type5, parameterizedType, new HashMap(hashMap))) {
                return true;
            }
        }
        return a(g4.getGenericSuperclass(), parameterizedType, new HashMap(hashMap));
    }

    public static a get(Type type) {
        return new a(type);
    }

    public static a getArray(Type type) {
        return new a(new S2.a(type));
    }

    public static a getParameterized(Type type, Type... typeArr) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(typeArr);
        if (!(type instanceof Class)) {
            throw new IllegalArgumentException("rawType must be of type Class, but was " + type);
        }
        Class cls = (Class) type;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        int length = typeParameters.length;
        int length2 = typeArr.length;
        if (length2 != length) {
            throw new IllegalArgumentException(cls.getName() + " requires " + length + " type arguments, but got " + length2);
        }
        for (int i = 0; i < length; i++) {
            Type type2 = typeArr[i];
            Class<?> g4 = d.g(type2);
            TypeVariable typeVariable = typeParameters[i];
            for (Type type3 : typeVariable.getBounds()) {
                if (!d.g(type3).isAssignableFrom(g4)) {
                    throw new IllegalArgumentException("Type argument " + type2 + " does not satisfy bounds for type variable " + typeVariable + " declared by " + type);
                }
            }
        }
        return new a(new b(null, type, typeArr));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && d.d(this.type, ((a) obj).type);
    }

    public final Class<Object> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    public final String toString() {
        return d.i(this.type);
    }

    public static <T> a get(Class<T> cls) {
        return new a(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.reflect.Type] */
    @Deprecated
    public boolean isAssignableFrom(Type type) {
        boolean z3;
        if (type != 0) {
            if (!this.type.equals(type)) {
                Type type2 = this.type;
                if (type2 instanceof Class) {
                    return this.rawType.isAssignableFrom(d.g(type));
                }
                if (type2 instanceof ParameterizedType) {
                    return a(type, (ParameterizedType) type2, new HashMap());
                }
                if (type2 instanceof GenericArrayType) {
                    if (this.rawType.isAssignableFrom(d.g(type))) {
                        Type genericComponentType = ((GenericArrayType) this.type).getGenericComponentType();
                        if (genericComponentType instanceof ParameterizedType) {
                            if (type instanceof GenericArrayType) {
                                type = ((GenericArrayType) type).getGenericComponentType();
                            } else if (type instanceof Class) {
                                type = (Class) type;
                                while (type.isArray()) {
                                    type = type.getComponentType();
                                }
                            }
                            z3 = a(type, (ParameterizedType) genericComponentType, new HashMap());
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                        }
                    }
                } else {
                    Class[] clsArr = {Class.class, ParameterizedType.class, GenericArrayType.class};
                    StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
                    for (int i = 0; i < 3; i++) {
                        sb.append(clsArr[i].getName());
                        sb.append(", ");
                    }
                    sb.append("but got: ");
                    sb.append(type2.getClass().getName());
                    sb.append(", for type token: ");
                    sb.append(type2.toString());
                    sb.append('.');
                    throw new AssertionError(sb.toString());
                }
            }
            return true;
        }
        return false;
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type a2 = d.a(type);
        this.type = a2;
        this.rawType = d.g(a2);
        this.hashCode = a2.hashCode();
    }

    @Deprecated
    public boolean isAssignableFrom(a aVar) {
        return isAssignableFrom(aVar.getType());
    }
}
