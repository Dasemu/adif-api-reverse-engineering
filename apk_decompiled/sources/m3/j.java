package m3;

import e3.G;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j extends n {

    /* renamed from: c, reason: collision with root package name */
    public final Method f7821c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f7822d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f7823e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f7824f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f7825g;

    public j(Method putMethod, Method getMethod, Method removeMethod, Class clientProviderClass, Class serverProviderClass) {
        Intrinsics.checkNotNullParameter(putMethod, "putMethod");
        Intrinsics.checkNotNullParameter(getMethod, "getMethod");
        Intrinsics.checkNotNullParameter(removeMethod, "removeMethod");
        Intrinsics.checkNotNullParameter(clientProviderClass, "clientProviderClass");
        Intrinsics.checkNotNullParameter(serverProviderClass, "serverProviderClass");
        this.f7821c = putMethod;
        this.f7822d = getMethod;
        this.f7823e = removeMethod;
        this.f7824f = clientProviderClass;
        this.f7825g = serverProviderClass;
    }

    @Override // m3.n
    public final void a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            this.f7823e.invoke(null, sslSocket);
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to remove ALPN", e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to remove ALPN", e5);
        }
    }

    @Override // m3.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((G) obj) != G.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((G) it.next()).f6261a);
        }
        try {
            this.f7821c.invoke(null, sslSocket, Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f7824f, this.f7825g}, new i(arrayList2)));
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to set ALPN", e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to set ALPN", e5);
        }
    }

    @Override // m3.n
    public final String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f7822d.invoke(null, sslSocket));
            Intrinsics.checkNotNull(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            i iVar = (i) invocationHandler;
            boolean z3 = iVar.f7819b;
            if (!z3 && iVar.f7820c == null) {
                n.i(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z3) {
                return null;
            }
            return iVar.f7820c;
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to get ALPN selected protocol", e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to get ALPN selected protocol", e5);
        }
    }
}
