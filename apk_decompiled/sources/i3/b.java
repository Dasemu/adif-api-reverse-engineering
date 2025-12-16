package i3;

import e3.C0323i;
import e3.C0324j;
import e3.C0326l;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.collections.ArraysKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f6827a;

    /* renamed from: b, reason: collision with root package name */
    public int f6828b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6829c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6830d;

    public b(List connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f6827a = connectionSpecs;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [e3.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[], java.io.Serializable] */
    public final C0326l a(SSLSocket sslSocket) {
        C0326l connectionSpec;
        int i;
        boolean z3;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        boolean z4 = true;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i4 = this.f6828b;
        List list = this.f6827a;
        int size = list.size();
        while (true) {
            if (i4 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = (C0326l) list.get(i4);
            if (connectionSpec.b(sslSocket)) {
                this.f6828b = i4 + 1;
                break;
            }
            i4++;
        }
        if (connectionSpec == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f6830d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNull(enabledProtocols);
            String arrays = Arrays.toString(enabledProtocols);
            Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i5 = this.f6828b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i5 >= size2) {
                z3 = false;
                break;
            }
            if (((C0326l) list.get(i5)).b(sslSocket)) {
                z3 = true;
                break;
            }
            i5++;
        }
        this.f6829c = z3;
        boolean z5 = this.f6830d;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String[] strArr = connectionSpec.f6374c;
        if (strArr != null) {
            String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = f3.c.o(enabledCipherSuites, strArr, C0324j.f6350c);
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        ?? r5 = connectionSpec.f6375d;
        if (r5 != 0) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = f3.c.o(enabledProtocols2, r5, ComparisonsKt.naturalOrder());
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        C0323i comparator = C0324j.f6350c;
        byte[] bArr = f3.c.f6469a;
        Intrinsics.checkNotNullParameter(supportedCipherSuites, "<this>");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            boolean z6 = z4;
            if (comparator.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
            z4 = z6;
        }
        if (z5 && i != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String value = supportedCipherSuites[i];
            Intrinsics.checkNotNullExpressionValue(value, "supportedCipherSuites[indexOfFallbackScsv]");
            Intrinsics.checkNotNullParameter(cipherSuitesIntersection, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] copyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) copyOf;
            cipherSuitesIntersection[ArraysKt.getLastIndex(cipherSuitesIntersection)] = value;
        }
        Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
        ?? obj = new Object();
        obj.f6366a = connectionSpec.f6372a;
        obj.f6368c = strArr;
        obj.f6369d = r5;
        obj.f6367b = connectionSpec.f6373b;
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        obj.c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        obj.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        C0326l a2 = obj.a();
        if (a2.c() != null) {
            sslSocket.setEnabledProtocols(a2.f6375d);
        }
        if (a2.a() != null) {
            sslSocket.setEnabledCipherSuites(a2.f6374c);
        }
        return connectionSpec;
    }
}
