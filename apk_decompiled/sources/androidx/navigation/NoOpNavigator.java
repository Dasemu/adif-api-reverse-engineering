package androidx.navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o0.E;
import o0.K;
import o0.U;
import o0.V;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/NoOpNavigator;", "Lo0/V;", "Lo0/E;", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@U("NoOp")
/* loaded from: classes.dex */
public final class NoOpNavigator extends V {
    @Override // o0.V
    public final E a() {
        return new E(this);
    }

    @Override // o0.V
    public final E c(E destination, Bundle bundle, K k4) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return destination;
    }
}
