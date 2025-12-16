package m3;

import a.AbstractC0105a;
import android.net.http.X509TrustManagerExtensions;
import android.security.NetworkSecurityPolicy;
import f0.C0338b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f7806d = C0338b.s();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7807c;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) new n3.m[]{C0338b.s() ? new Object() : null, new n3.l(n3.f.f7872f), new n3.l(n3.j.f7879a), new n3.l(n3.h.f7878a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOfNotNull) {
            if (((n3.m) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f7807c = arrayList;
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
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f7807c.iterator();
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
    public final String f(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f7807c.iterator();
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
    public final boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
