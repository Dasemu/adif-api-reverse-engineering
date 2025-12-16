package r3;

import f0.C0338b;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final String f8321b;

    /* renamed from: a, reason: collision with root package name */
    public final C0579k f8322a;

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f8321b = separator;
    }

    public z(C0579k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f8322a = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a2 = s3.c.a(this);
        C0579k c0579k = this.f8322a;
        if (a2 == -1) {
            a2 = 0;
        } else if (a2 < c0579k.d() && c0579k.i(a2) == 92) {
            a2++;
        }
        int d4 = c0579k.d();
        int i = a2;
        while (a2 < d4) {
            if (c0579k.i(a2) == 47 || c0579k.i(a2) == 92) {
                arrayList.add(c0579k.n(i, a2));
                i = a2 + 1;
            }
            a2++;
        }
        if (i < c0579k.d()) {
            arrayList.add(c0579k.n(i, c0579k.d()));
        }
        return arrayList;
    }

    public final z b() {
        C0579k c0579k = s3.c.f8477d;
        C0579k c0579k2 = this.f8322a;
        if (Intrinsics.areEqual(c0579k2, c0579k)) {
            return null;
        }
        C0579k c0579k3 = s3.c.f8474a;
        if (Intrinsics.areEqual(c0579k2, c0579k3)) {
            return null;
        }
        C0579k prefix = s3.c.f8475b;
        if (Intrinsics.areEqual(c0579k2, prefix)) {
            return null;
        }
        C0579k suffix = s3.c.f8478e;
        c0579k2.getClass();
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int d4 = c0579k2.d();
        byte[] bArr = suffix.f8286a;
        if (c0579k2.l(d4 - bArr.length, suffix, bArr.length) && (c0579k2.d() == 2 || c0579k2.l(c0579k2.d() - 3, c0579k3, 1) || c0579k2.l(c0579k2.d() - 3, prefix, 1))) {
            return null;
        }
        int k4 = C0579k.k(c0579k2, c0579k3);
        if (k4 == -1) {
            k4 = C0579k.k(c0579k2, prefix);
        }
        if (k4 == 2 && g() != null) {
            if (c0579k2.d() == 3) {
                return null;
            }
            return new z(C0579k.o(c0579k2, 0, 3, 1));
        }
        if (k4 == 1) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            if (c0579k2.l(0, prefix, prefix.d())) {
                return null;
            }
        }
        if (k4 != -1 || g() == null) {
            return k4 == -1 ? new z(c0579k) : k4 == 0 ? new z(C0579k.o(c0579k2, 0, 1, 1)) : new z(C0579k.o(c0579k2, 0, k4, 1));
        }
        if (c0579k2.d() == 2) {
            return null;
        }
        return new z(C0579k.o(c0579k2, 0, 2, 1));
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, r3.h] */
    public final z c(z other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int a2 = s3.c.a(this);
        C0579k c0579k = this.f8322a;
        z zVar = a2 == -1 ? null : new z(c0579k.n(0, a2));
        other.getClass();
        int a4 = s3.c.a(other);
        C0579k c0579k2 = other.f8322a;
        if (!Intrinsics.areEqual(zVar, a4 != -1 ? new z(c0579k2.n(0, a4)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList a5 = a();
        ArrayList a6 = other.a();
        int min = Math.min(a5.size(), a6.size());
        int i = 0;
        while (i < min && Intrinsics.areEqual(a5.get(i), a6.get(i))) {
            i++;
        }
        if (i == min && c0579k.d() == c0579k2.d()) {
            return C0338b.o(".");
        }
        if (a6.subList(i, a6.size()).indexOf(s3.c.f8478e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        ?? obj = new Object();
        C0579k c4 = s3.c.c(other);
        if (c4 == null && (c4 = s3.c.c(this)) == null) {
            c4 = s3.c.f(f8321b);
        }
        int size = a6.size();
        for (int i4 = i; i4 < size; i4++) {
            obj.h0(s3.c.f8478e);
            obj.h0(c4);
        }
        int size2 = a5.size();
        while (i < size2) {
            obj.h0((C0579k) a5.get(i));
            obj.h0(c4);
            i++;
        }
        return s3.c.d(obj, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        z other = (z) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f8322a.compareTo(other.f8322a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, r3.h] */
    public final z d(String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        ?? obj = new Object();
        obj.o0(child);
        return s3.c.b(this, s3.c.d(obj, false), false);
    }

    public final File e() {
        return new File(this.f8322a.q());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z) && Intrinsics.areEqual(((z) obj).f8322a, this.f8322a);
    }

    public final Path f() {
        Path path = Paths.get(this.f8322a.q(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    public final Character g() {
        C0579k c0579k = s3.c.f8474a;
        C0579k c0579k2 = this.f8322a;
        if (C0579k.g(c0579k2, c0579k) != -1 || c0579k2.d() < 2 || c0579k2.i(1) != 58) {
            return null;
        }
        char i = (char) c0579k2.i(0);
        if (('a' > i || i >= '{') && ('A' > i || i >= '[')) {
            return null;
        }
        return Character.valueOf(i);
    }

    public final int hashCode() {
        return this.f8322a.hashCode();
    }

    public final String toString() {
        return this.f8322a.q();
    }
}
