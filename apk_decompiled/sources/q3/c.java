package q3;

import C.w;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f8192a = new Object();

    public static List a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }

    public static boolean b(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (length2 < 0) {
            throw new IllegalArgumentException(w.i(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder t2 = w.t(length2, "endIndex > string.length: ", " > ");
            t2.append(str.length());
            throw new IllegalArgumentException(t2.toString().toString());
        }
        long j4 = 0;
        int i4 = 0;
        while (i4 < length2) {
            char charAt = str.charAt(i4);
            if (charAt < 128) {
                j4++;
            } else {
                if (charAt < 2048) {
                    i = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i = 3;
                } else {
                    int i5 = i4 + 1;
                    char charAt2 = i5 < length2 ? str.charAt(i5) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j4++;
                        i4 = i5;
                    } else {
                        j4 += 4;
                        i4 += 2;
                    }
                }
                j4 += i;
            }
            i4++;
        }
        return length == ((int) j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x013c, code lost:
    
        if (r1 != (-1)) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[LOOP:1: B:26:0x0081->B:58:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.lang.String r11, java.security.cert.X509Certificate r12) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.c.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (b(host)) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return c(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
                return false;
            }
        }
        return false;
    }
}
