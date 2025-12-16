package n3;

import f0.C0338b;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;

/* loaded from: classes3.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final i f7879a = new Object();

    @Override // n3.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // n3.m
    public final String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // n3.m
    public final boolean c() {
        boolean z3 = m3.h.f7816d;
        return m3.h.f7816d;
    }

    @Override // n3.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            m3.n nVar = m3.n.f7829a;
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) C0338b.g(protocols).toArray(new String[0]));
        }
    }
}
