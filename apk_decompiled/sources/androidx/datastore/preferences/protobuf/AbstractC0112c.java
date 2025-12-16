package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0112c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f2892a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f2893b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f2892a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f2893b = cls2 != null;
    }

    public static boolean a() {
        return (f2892a == null || f2893b) ? false : true;
    }
}
