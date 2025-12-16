package r3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class J extends K {
    @Override // r3.K
    public final K d(long j4) {
        return this;
    }

    @Override // r3.K
    public final void f() {
    }

    @Override // r3.K
    public final K g(long j4) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this;
    }
}
