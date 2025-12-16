package androidx.lifecycle;

import java.io.Closeable;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m0.C0502b;

/* loaded from: classes.dex */
public abstract class w0 {
    private final C0502b impl = new C0502b();

    public final void addCloseable(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        C0502b c0502b = this.impl;
        if (c0502b != null) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(closeable, "closeable");
            if (c0502b.f7791d) {
                C0502b.b(closeable);
                return;
            }
            synchronized (c0502b.f7788a) {
                autoCloseable = (AutoCloseable) c0502b.f7789b.put(key, closeable);
            }
            C0502b.b(autoCloseable);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        C0502b c0502b = this.impl;
        if (c0502b != null && !c0502b.f7791d) {
            c0502b.f7791d = true;
            synchronized (c0502b.f7788a) {
                try {
                    Iterator it = c0502b.f7789b.values().iterator();
                    while (it.hasNext()) {
                        C0502b.b((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0502b.f7790c.iterator();
                    while (it2.hasNext()) {
                        C0502b.b((AutoCloseable) it2.next());
                    }
                    c0502b.f7790c.clear();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String key) {
        T t2;
        Intrinsics.checkNotNullParameter(key, "key");
        C0502b c0502b = this.impl;
        if (c0502b == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (c0502b.f7788a) {
            t2 = (T) c0502b.f7789b.get(key);
        }
        return t2;
    }

    public void onCleared() {
    }

    public void addCloseable(AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        C0502b c0502b = this.impl;
        if (c0502b != null) {
            c0502b.a(closeable);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ void addCloseable(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        C0502b c0502b = this.impl;
        if (c0502b != null) {
            c0502b.a(closeable);
        }
    }
}
