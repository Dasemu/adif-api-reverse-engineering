package e3;

import kotlin.jvm.internal.Intrinsics;
import r3.C0579k;

/* renamed from: e3.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0321g {

    /* renamed from: a, reason: collision with root package name */
    public final String f6343a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6344b;

    /* renamed from: c, reason: collision with root package name */
    public final C0579k f6345c;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x002d, code lost:
    
        if (r0 != (-1)) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r0 != (-1)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0321g(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r4.<init>()
            java.lang.String r0 = "*."
            boolean r0 = kotlin.text.StringsKt.D(r5, r0)
            r1 = 4
            java.lang.String r2 = "*"
            r3 = -1
            if (r0 == 0) goto L20
            r0 = 1
            int r0 = kotlin.text.StringsKt.m(r5, r0, r1, r2)
            if (r0 == r3) goto L37
        L20:
            java.lang.String r0 = "**."
            boolean r0 = kotlin.text.StringsKt.D(r5, r0)
            if (r0 == 0) goto L2f
            r0 = 2
            int r0 = kotlin.text.StringsKt.m(r5, r0, r1, r2)
            if (r0 == r3) goto L37
        L2f:
            r0 = 6
            r1 = 0
            int r0 = kotlin.text.StringsKt.m(r5, r1, r0, r2)
            if (r0 != r3) goto Lad
        L37:
            java.lang.String r0 = f3.a.b(r5)
            if (r0 == 0) goto La1
            r4.f6343a = r0
            java.lang.String r5 = "sha1/"
            boolean r5 = kotlin.text.StringsKt.D(r6, r5)
            java.lang.String r0 = "Invalid pin hash: "
            java.lang.String r1 = "this as java.lang.String).substring(startIndex)"
            if (r5 == 0) goto L6c
            java.lang.String r5 = "sha1"
            r4.f6344b = r5
            r3.k r5 = r3.C0579k.f8285d
            r5 = 5
            java.lang.String r5 = r6.substring(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            r3.k r5 = f0.C0338b.l(r5)
            if (r5 == 0) goto L62
            r4.f6345c = r5
            return
        L62:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r0.concat(r6)
            r4.<init>(r5)
            throw r4
        L6c:
            java.lang.String r5 = "sha256/"
            boolean r5 = kotlin.text.StringsKt.D(r6, r5)
            if (r5 == 0) goto L95
            java.lang.String r5 = "sha256"
            r4.f6344b = r5
            r3.k r5 = r3.C0579k.f8285d
            r5 = 7
            java.lang.String r5 = r6.substring(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            r3.k r5 = f0.C0338b.l(r5)
            if (r5 == 0) goto L8b
            r4.f6345c = r5
            return
        L8b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r0.concat(r6)
            r4.<init>(r5)
            throw r4
        L95:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "pins must start with 'sha256/' or 'sha1/': "
            java.lang.String r5 = C.w.z(r5, r6)
            r4.<init>(r5)
            throw r4
        La1:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Invalid pattern: "
            java.lang.String r5 = r6.concat(r5)
            r4.<init>(r5)
            throw r4
        Lad:
            java.lang.String r4 = "Unexpected pattern: "
            java.lang.String r4 = C.w.z(r4, r5)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.C0321g.<init>(java.lang.String, java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0321g)) {
            return false;
        }
        C0321g c0321g = (C0321g) obj;
        return Intrinsics.areEqual(this.f6343a, c0321g.f6343a) && Intrinsics.areEqual(this.f6344b, c0321g.f6344b) && Intrinsics.areEqual(this.f6345c, c0321g.f6345c);
    }

    public final int hashCode() {
        return this.f6345c.hashCode() + com.google.android.gms.measurement.internal.a.d(this.f6344b, this.f6343a.hashCode() * 31, 31);
    }

    public final String toString() {
        return this.f6344b + '/' + this.f6345c.a();
    }
}
