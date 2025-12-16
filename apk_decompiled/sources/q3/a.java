package q3;

import a.AbstractC0105a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends AbstractC0105a {

    /* renamed from: c, reason: collision with root package name */
    public final d f8190c;

    public a(d trustRootIndex) {
        Intrinsics.checkNotNullParameter(trustRootIndex, "trustRootIndex");
        this.f8190c = trustRootIndex;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(((a) obj).f8190c, this.f8190c);
    }

    public final int hashCode() {
        return this.f8190c.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    @Override // a.AbstractC0105a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List i(java.lang.String r9, java.util.List r10) {
        /*
            r8 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.ArrayDeque r9 = new java.util.ArrayDeque
            java.util.Collection r10 = (java.util.Collection) r10
            r9.<init>(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.Object r0 = r9.removeFirst()
            java.lang.String r1 = "queue.removeFirst()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r10.add(r0)
            r0 = 0
            r1 = r0
        L24:
            r2 = 9
            if (r0 >= r2) goto Lb7
            int r2 = r10.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r2 = r10.get(r2)
            java.lang.String r4 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r4)
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            q3.d r5 = r8.f8190c
            java.security.cert.X509Certificate r5 = r5.a(r2)
            if (r5 == 0) goto L69
            int r1 = r10.size()
            if (r1 > r3) goto L4d
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r5)
            if (r1 != 0) goto L50
        L4d:
            r10.add(r5)
        L50:
            java.security.Principal r1 = r5.getIssuerDN()
            java.security.Principal r2 = r5.getSubjectDN()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L5f
            goto L67
        L5f:
            java.security.PublicKey r1 = r5.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L67
            r5.verify(r1)     // Catch: java.security.GeneralSecurityException -> L67
            goto La2
        L67:
            r1 = r3
            goto L9d
        L69:
            java.util.Iterator r3 = r9.iterator()
            java.lang.String r5 = "queue.iterator()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
        L72:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto La0
            java.lang.Object r5 = r3.next()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r4)
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5
            java.security.Principal r6 = r2.getIssuerDN()
            java.security.Principal r7 = r5.getSubjectDN()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 != 0) goto L90
            goto L72
        L90:
            java.security.PublicKey r6 = r5.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L72
            r2.verify(r6)     // Catch: java.security.GeneralSecurityException -> L72
            r3.remove()
            r10.add(r5)
        L9d:
            int r0 = r0 + 1
            goto L24
        La0:
            if (r1 == 0) goto La3
        La2:
            return r10
        La3:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to find a trusted cert that signed "
            r9.<init>(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Lb7:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Certificate chain too long: "
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.a.i(java.lang.String, java.util.List):java.util.List");
    }
}
