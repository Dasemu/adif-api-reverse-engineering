package androidx.navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o0.E;
import o0.K;
import o0.V;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1", "Lo0/V;", "Lo0/E;", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1 extends V {
    @Override // o0.V
    public final E a() {
        return new E("permissive");
    }

    @Override // o0.V
    public final E c(E destination, Bundle bundle, K k4) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        throw new IllegalStateException("navigate is not supported");
    }

    @Override // o0.V
    public final boolean j() {
        throw new IllegalStateException("popBackStack is not supported");
    }
}
