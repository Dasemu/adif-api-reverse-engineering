package n3;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final k f7880a;

    /* renamed from: b, reason: collision with root package name */
    public m f7881b;

    public l(k socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f7880a = socketAdapterFactory;
    }

    @Override // n3.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f7880a.a(sslSocket);
    }

    @Override // n3.m
    public final String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        m e4 = e(sslSocket);
        if (e4 != null) {
            return e4.b(sslSocket);
        }
        return null;
    }

    @Override // n3.m
    public final boolean c() {
        return true;
    }

    @Override // n3.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        m e4 = e(sslSocket);
        if (e4 != null) {
            e4.d(sslSocket, str, protocols);
        }
    }

    public final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f7881b == null && this.f7880a.a(sSLSocket)) {
                this.f7881b = this.f7880a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7881b;
    }
}
