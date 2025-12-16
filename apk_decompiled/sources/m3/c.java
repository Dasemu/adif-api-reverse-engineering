package m3;

import a.AbstractC0105a;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import f0.C0338b;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f7810e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7811c;

    /* renamed from: d, reason: collision with root package name */
    public final R0.h f7812d;

    static {
        boolean z3 = false;
        if (C0338b.s() && Build.VERSION.SDK_INT < 30) {
            z3 = true;
        }
        f7810e = z3;
    }

    public c() {
        n3.f fVar;
        Method method;
        Method method2;
        int i = n3.n.f7882g;
        Intrinsics.checkNotNullParameter("com.android.org.conscrypt", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        Method method3 = null;
        try {
            Class<?> sslSocketClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Intrinsics.checkNotNull(sslSocketClass, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
            Class<?> sslSocketFactoryClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Intrinsics.checkNotNull(sslSocketFactoryClass, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
            Class<?> paramClass = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Intrinsics.checkNotNullExpressionValue(paramClass, "paramsClass");
            Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
            Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
            Intrinsics.checkNotNullParameter(paramClass, "paramClass");
            fVar = new n3.f(sslSocketClass);
        } catch (Exception e4) {
            n.f7829a.getClass();
            n.i(5, "unable to load android socket classes", e4);
            fVar = null;
        }
        List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) new n3.m[]{fVar, new n3.l(n3.f.f7872f), new n3.l(n3.j.f7879a), new n3.l(n3.h.f7878a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOfNotNull) {
            if (((n3.m) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f7811c = arrayList;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f7812d = new R0.h(method3, method2, method);
    }

    @Override // m3.n
    public final AbstractC0105a b(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        n3.b bVar = x509TrustManagerExtensions != null ? new n3.b(trustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : super.b(trustManager);
    }

    @Override // m3.n
    public final q3.d c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            return new b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.c(trustManager);
        }
    }

    @Override // m3.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f7811c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((n3.m) obj).a(sslSocket)) {
                    break;
                }
            }
        }
        n3.m mVar = (n3.m) obj;
        if (mVar != null) {
            mVar.d(sslSocket, str, protocols);
        }
    }

    @Override // m3.n
    public final void e(Socket socket, InetSocketAddress address, int i) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i);
    }

    @Override // m3.n
    public final String f(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f7811c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((n3.m) obj).a(sslSocket)) {
                break;
            }
        }
        n3.m mVar = (n3.m) obj;
        if (mVar != null) {
            return mVar.b(sslSocket);
        }
        return null;
    }

    @Override // m3.n
    public final Object g() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        R0.h hVar = this.f7812d;
        hVar.getClass();
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        Method method = (Method) hVar.f1413a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = (Method) hVar.f1414b;
                Intrinsics.checkNotNull(method2);
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // m3.n
    public final boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // m3.n
    public final void j(Object obj, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        R0.h hVar = this.f7812d;
        hVar.getClass();
        if (obj != null) {
            try {
                Method method = (Method) hVar.f1415c;
                Intrinsics.checkNotNull(method);
                method.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(5, message, null);
    }
}
