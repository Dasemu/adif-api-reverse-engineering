package n3;

import android.net.ssl.SSLSockets;
import f0.C0338b;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements m {
    @Override // n3.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // n3.m
    public final String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // n3.m
    public final boolean c() {
        m3.n nVar = m3.n.f7829a;
        return C0338b.s();
    }

    @Override // n3.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            m3.n nVar = m3.n.f7829a;
            sSLParameters.setApplicationProtocols((String[]) C0338b.g(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e4) {
            throw new IOException("Android internal error", e4);
        }
    }
}
