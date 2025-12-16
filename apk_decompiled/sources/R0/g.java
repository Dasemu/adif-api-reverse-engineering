package R0;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
public final class g extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f1411a;

    public g(h hVar) {
        this.f1411a = hVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        h.a(this.f1411a, network, true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        h.a(this.f1411a, network, false);
    }
}
