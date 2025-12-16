package m3;

import C.w;
import a.AbstractC0105a;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile n f7829a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f7830b;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r0 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
    
        if (r0 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d3, code lost:
    
        if (r0 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fb, code lost:
    
        if (java.lang.Integer.parseInt(r2) >= 9) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v37, types: [m3.n] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    static {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.n.<clinit>():void");
    }

    public static void i(int i, String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        f7830b.log(i == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    public AbstractC0105a b(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new q3.a(c(trustManager));
    }

    public q3.d c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new q3.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    public void e(Socket socket, InetSocketAddress address, int i) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i);
    }

    public String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    public Object g() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        if (f7830b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public void j(Object obj, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = w.n(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, message, (Throwable) obj);
    }

    public SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext k4 = k();
            k4.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = k4.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e4) {
            throw new AssertionError("No System TLS: " + e4, e4);
        }
    }

    public X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb = new StringBuilder("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
