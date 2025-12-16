package e3;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class A {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f6197d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f6198e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f6199a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6200b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f6201c;

    public A(String str, String str2, String[] strArr) {
        this.f6199a = str;
        this.f6200b = str2;
        this.f6201c = strArr;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x001a */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.nio.charset.Charset a(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.lang.String r0 = "charset"
            java.lang.String r1 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String[] r4 = r4.f6201c
            int r1 = r4.length
            int r1 = r1 + (-1)
            r2 = 0
            r3 = 2
            int r1 = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(r2, r1, r3)
            if (r1 < 0) goto L26
        L14:
            r3 = r4[r2]
            boolean r3 = kotlin.text.StringsKt.j(r3, r0)
            if (r3 == 0) goto L21
            int r2 = r2 + 1
            r4 = r4[r2]
            goto L27
        L21:
            if (r2 == r1) goto L26
            int r2 = r2 + 2
            goto L14
        L26:
            r4 = 0
        L27:
            if (r4 != 0) goto L2a
            goto L2f
        L2a:
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)     // Catch: java.lang.IllegalArgumentException -> L2f
            return r4
        L2f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.A.a(java.nio.charset.Charset):java.nio.charset.Charset");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof A) && Intrinsics.areEqual(((A) obj).f6199a, this.f6199a);
    }

    public final int hashCode() {
        return this.f6199a.hashCode();
    }

    public final String toString() {
        return this.f6199a;
    }
}
