package n3;

import f0.C0338b;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes3.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final g f7878a = new Object();

    @Override // n3.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return false;
    }

    @Override // n3.m
    public final String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // n3.m
    public final boolean c() {
        boolean z3 = m3.e.f7813d;
        return m3.e.f7813d;
    }

    @Override // n3.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            m3.n nVar = m3.n.f7829a;
            parameters.setApplicationProtocols((String[]) C0338b.g(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
