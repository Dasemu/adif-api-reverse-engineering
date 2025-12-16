package Z2;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final C0093a f2234a = new C0093a(5);

    /* renamed from: b, reason: collision with root package name */
    public static final I f2235b = new I(1);

    /* renamed from: c, reason: collision with root package name */
    public static final I f2236c = new I(2);

    /* renamed from: d, reason: collision with root package name */
    public static final I f2237d = new I(3);

    /* renamed from: e, reason: collision with root package name */
    public static final I f2238e = new I(4);

    /* renamed from: f, reason: collision with root package name */
    public static final I f2239f = new I(5);

    /* renamed from: g, reason: collision with root package name */
    public static final I f2240g = new I(6);
    public static final I h = new I(7);
    public static final I i = new I(8);

    /* renamed from: j, reason: collision with root package name */
    public static final I f2241j = new I(0);

    public static Type a(Type type) {
        if (!Collection.class.isAssignableFrom(Collection.class)) {
            throw new IllegalArgumentException();
        }
        Type h4 = b3.f.h(type, Collection.class, b3.f.d(type, Collection.class, Collection.class), new LinkedHashSet());
        if (h4 instanceof WildcardType) {
            h4 = ((WildcardType) h4).getUpperBounds()[0];
        }
        return h4 instanceof ParameterizedType ? ((ParameterizedType) h4).getActualTypeArguments()[0] : Object.class;
    }

    public static boolean b(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? b(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return b(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof b3.d ? ((b3.d) parameterizedType).f4190c : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof b3.d ? ((b3.d) parameterizedType2).f4190c : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return b(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static String c(int i4, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder("$");
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = iArr[i5];
            if (i6 == 1 || i6 == 2) {
                sb.append('[');
                sb.append(iArr2[i5]);
                sb.append(']');
            } else if (i6 == 3 || i6 == 4 || i6 == 5) {
                sb.append('.');
                String str = strArr[i5];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public static Class d(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) d(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return d(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static b3.d f(Class cls, Type... typeArr) {
        if (typeArr.length != 0) {
            return new b3.d(null, cls, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + cls);
    }

    public static int g(r rVar, String str, int i4, int i5) {
        int b02 = rVar.b0();
        if (b02 >= i4 && b02 <= i5) {
            return b02;
        }
        throw new RuntimeException("Expected " + str + " but was " + b02 + " at path " + rVar.O());
    }

    public abstract Object e();
}
