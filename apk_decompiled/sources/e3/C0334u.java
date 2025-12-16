package e3;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: e3.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0334u implements Iterable, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f6404a;

    public C0334u(String[] strArr) {
        this.f6404a = strArr;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0018 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String[] r3 = r3.f6404a
            int r0 = r3.length
            int r0 = r0 + (-2)
            r1 = 0
            r2 = -2
            int r1 = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(r0, r1, r2)
            if (r1 > r0) goto L24
        L12:
            r2 = r3[r0]
            boolean r2 = kotlin.text.StringsKt.j(r4, r2)
            if (r2 == 0) goto L1f
            int r0 = r0 + 1
            r3 = r3[r0]
            return r3
        L1f:
            if (r0 == r1) goto L24
            int r0 = r0 + (-2)
            goto L12
        L24:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.C0334u.a(java.lang.String):java.lang.String");
    }

    public final String b(int i) {
        return this.f6404a[i * 2];
    }

    public final C0333t c() {
        C0333t c0333t = new C0333t();
        CollectionsKt.c(c0333t.f6403a, this.f6404a);
        return c0333t;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0334u) {
            return Arrays.equals(this.f6404a, ((C0334u) obj).f6404a);
        }
        return false;
    }

    public final String f(int i) {
        return this.f6404a[(i * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6404a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = TuplesKt.to(b(i), f(i));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    public final int size() {
        return this.f6404a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b4 = b(i);
            String f2 = f(i);
            sb.append(b4);
            sb.append(": ");
            if (f3.c.p(b4)) {
                f2 = "██";
            }
            sb.append(f2);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
