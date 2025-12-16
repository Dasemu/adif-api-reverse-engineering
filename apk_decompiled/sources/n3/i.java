package n3;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;

/* loaded from: classes3.dex */
public final class i implements k {
    @Override // n3.k
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return m3.h.f7816d && Conscrypt.isConscrypt(sslSocket);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [n3.m, java.lang.Object] */
    @Override // n3.k
    public final m b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return new Object();
    }
}
