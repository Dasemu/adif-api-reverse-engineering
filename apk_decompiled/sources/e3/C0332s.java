package e3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e3.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0332s {

    /* renamed from: a, reason: collision with root package name */
    public final V f6399a;

    /* renamed from: b, reason: collision with root package name */
    public final C0324j f6400b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6401c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f6402d;

    public C0332s(V tlsVersion, C0324j cipherSuite, List localCertificates, Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f6399a = tlsVersion;
        this.f6400b = cipherSuite;
        this.f6401c = localCertificates;
        this.f6402d = LazyKt.lazy(new J0.e(peerCertificatesFn));
    }

    public final List a() {
        return (List) this.f6402d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0332s)) {
            return false;
        }
        C0332s c0332s = (C0332s) obj;
        return c0332s.f6399a == this.f6399a && Intrinsics.areEqual(c0332s.f6400b, this.f6400b) && Intrinsics.areEqual(c0332s.a(), a()) && Intrinsics.areEqual(c0332s.f6401c, this.f6401c);
    }

    public final int hashCode() {
        return this.f6401c.hashCode() + ((a().hashCode() + ((this.f6400b.hashCode() + ((this.f6399a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        String type;
        String type2;
        List<Certificate> a2 = a();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(a2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Certificate certificate : a2) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f6399a);
        sb.append(" cipherSuite=");
        sb.append(this.f6400b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f6401c;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Intrinsics.checkNotNullExpressionValue(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
