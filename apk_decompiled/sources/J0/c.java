package J0;

import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final l f920a;

    /* renamed from: b, reason: collision with root package name */
    public final Semaphore f921b;

    public c(int i, l lVar) {
        this.f920a = lVar;
        this.f921b = SemaphoreKt.Semaphore$default(i, 0, 2, null);
    }

    public final boolean equals(Object obj) {
        return obj instanceof c;
    }

    public final int hashCode() {
        return c.class.hashCode();
    }
}
