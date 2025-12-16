package e3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e3.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0325k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6366a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6367b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6368c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f6369d;

    public C0326l a() {
        return new C0326l(this.f6366a, this.f6367b, (String[]) this.f6368c, (String[]) this.f6369d);
    }

    public void b(C0324j... cipherSuites) {
        Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
        if (!this.f6366a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (C0324j c0324j : cipherSuites) {
            arrayList.add(c0324j.f6365a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... cipherSuites) {
        Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
        if (!this.f6366a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f6368c = (String[]) cipherSuites.clone();
    }

    public void d(V... tlsVersions) {
        Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
        if (!this.f6366a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(tlsVersions.length);
        for (V v3 : tlsVersions) {
            arrayList.add(v3.f6320a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String[], java.io.Serializable] */
    public void e(String... tlsVersions) {
        Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
        if (!this.f6366a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f6369d = (String[]) tlsVersions.clone();
    }
}
