package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f2963a = Logger.getLogger(s0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f2964b;

    /* renamed from: c, reason: collision with root package name */
    public static final Class f2965c;

    /* renamed from: d, reason: collision with root package name */
    public static final r0 f2966d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f2967e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f2968f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f2969g;
    public static final boolean h;

    /* JADX WARN: Removed duplicated region for block: B:18:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.s0.<clinit>():void");
    }

    public static Object a(Class cls) {
        try {
            return f2964b.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static int b(Class cls) {
        if (f2968f) {
            return f2966d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f2968f) {
            f2966d.b(cls);
        }
    }

    public static Field d() {
        Field field;
        Field field2;
        if (AbstractC0112c.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean e(Class cls) {
        if (!AbstractC0112c.a()) {
            return false;
        }
        try {
            Class cls2 = f2965c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte f(byte[] bArr, long j4) {
        return f2966d.d(f2969g + j4, bArr);
    }

    public static byte g(long j4, Object obj) {
        return (byte) ((f2966d.g((-4) & j4, obj) >>> ((int) (((~j4) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static byte h(long j4, Object obj) {
        return (byte) ((f2966d.g((-4) & j4, obj) >>> ((int) ((j4 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j4, byte b4) {
        f2966d.l(bArr, f2969g + j4, b4);
    }

    public static void k(Object obj, long j4, byte b4) {
        long j5 = (-4) & j4;
        int g4 = f2966d.g(j5, obj);
        int i = ((~((int) j4)) & 3) << 3;
        m(obj, j5, ((255 & b4) << i) | (g4 & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static void l(Object obj, long j4, byte b4) {
        long j5 = (-4) & j4;
        int i = (((int) j4) & 3) << 3;
        m(obj, j5, ((255 & b4) << i) | (f2966d.g(j5, obj) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static void m(Object obj, long j4, int i) {
        f2966d.o(obj, j4, i);
    }

    public static void n(Object obj, long j4, long j5) {
        f2966d.p(obj, j4, j5);
    }

    public static void o(Object obj, long j4, Object obj2) {
        f2966d.q(obj, j4, obj2);
    }
}
