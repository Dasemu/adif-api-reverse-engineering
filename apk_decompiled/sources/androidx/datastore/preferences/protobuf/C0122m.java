package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122m {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0122m f2943b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0122m f2944c;

    /* renamed from: a, reason: collision with root package name */
    public final Map f2945a = Collections.EMPTY_MAP;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        f2944c = new C0122m();
    }

    public static C0122m a() {
        C0122m c0122m;
        C0122m c0122m2 = f2943b;
        if (c0122m2 != null) {
            return c0122m2;
        }
        synchronized (C0122m.class) {
            try {
                c0122m = f2943b;
                if (c0122m == null) {
                    Class cls = AbstractC0121l.f2941a;
                    if (cls != null) {
                        try {
                            c0122m = (C0122m) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                        f2943b = c0122m;
                    }
                    c0122m = f2944c;
                    f2943b = c0122m;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0122m;
    }
}
