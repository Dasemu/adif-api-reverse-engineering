package m3;

import e3.G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k extends n {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f7826c;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r0.intValue() >= 9) goto L13;
     */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto Ld
            java.lang.Integer r0 = kotlin.text.StringsKt.toIntOrNull(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            int r0 = r0.intValue()
            r3 = 9
            if (r0 < r3) goto L1b
            goto L26
        L1b:
            r1 = r2
            goto L26
        L1d:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1b
            r0.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L1b
        L26:
            m3.k.f7826c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.k.<clinit>():void");
    }

    @Override // m3.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
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
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // m3.n
    public final String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
