package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0130v extends AbstractC0108a {
    private static Map<Object, AbstractC0130v> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected j0 unknownFields;

    public AbstractC0130v() {
        this.memoizedHashCode = 0;
        this.unknownFields = j0.f2935f;
        this.memoizedSerializedSize = -1;
    }

    public static AbstractC0130v e(Class cls) {
        AbstractC0130v abstractC0130v = defaultInstanceMap.get(cls);
        if (abstractC0130v == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0130v = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (abstractC0130v != null) {
            return abstractC0130v;
        }
        AbstractC0130v abstractC0130v2 = (AbstractC0130v) ((AbstractC0130v) s0.a(cls)).d(6);
        if (abstractC0130v2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC0130v2);
        return abstractC0130v2;
    }

    public static Object f(Method method, AbstractC0108a abstractC0108a, Object... objArr) {
        try {
            return method.invoke(abstractC0108a, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void h(Class cls, AbstractC0130v abstractC0130v) {
        defaultInstanceMap.put(cls, abstractC0130v);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0108a
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            Y y3 = Y.f2881c;
            y3.getClass();
            this.memoizedSerializedSize = y3.a(getClass()).e(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0108a
    public final void c(C0119j c0119j) {
        Y y3 = Y.f2881c;
        y3.getClass();
        InterfaceC0111b0 a2 = y3.a(getClass());
        J j4 = c0119j.f2930c;
        if (j4 == null) {
            j4 = new J(c0119j);
        }
        a2.a(this, j4);
    }

    public abstract Object d(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((AbstractC0130v) d(6)).getClass().isInstance(obj)) {
            return false;
        }
        Y y3 = Y.f2881c;
        y3.getClass();
        return y3.a(getClass()).g(this, (AbstractC0130v) obj);
    }

    public final boolean g() {
        byte byteValue = ((Byte) d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        Y y3 = Y.f2881c;
        y3.getClass();
        boolean f2 = y3.a(getClass()).f(this);
        d(2);
        return f2;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        Y y3 = Y.f2881c;
        y3.getClass();
        int b4 = y3.a(getClass()).b(this);
        this.memoizedHashCode = b4;
        return b4;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        Q.k(this, sb, 0);
        return sb.toString();
    }
}
