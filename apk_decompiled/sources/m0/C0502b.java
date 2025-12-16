package m0;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0502b {

    /* renamed from: a, reason: collision with root package name */
    public final C0503c f7788a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f7789b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f7790c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f7791d;

    public static void b(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public final void a(AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (this.f7791d) {
            b(closeable);
            return;
        }
        synchronized (this.f7788a) {
            this.f7790c.add(closeable);
            Unit unit = Unit.INSTANCE;
        }
    }
}
