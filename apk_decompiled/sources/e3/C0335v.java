package e3;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e3.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0335v {

    /* renamed from: a, reason: collision with root package name */
    public String f6405a;

    /* renamed from: d, reason: collision with root package name */
    public String f6408d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6410f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f6411g;
    public String h;

    /* renamed from: b, reason: collision with root package name */
    public String f6406b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f6407c = "";

    /* renamed from: e, reason: collision with root package name */
    public int f6409e = -1;

    public C0335v() {
        ArrayList arrayList = new ArrayList();
        this.f6410f = arrayList;
        arrayList.add("");
    }

    public final w a() {
        int collectionSizeOrDefault;
        ArrayList arrayList;
        int collectionSizeOrDefault2;
        String str = this.f6405a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String e4 = C0329o.e(this.f6406b, 0, 0, 7);
        String e5 = C0329o.e(this.f6407c, 0, 0, 7);
        String str2 = this.f6408d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int b4 = b();
        ArrayList arrayList2 = this.f6410f;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C0329o.e((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = this.f6411g;
        if (arrayList4 != null) {
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10);
            ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault2);
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? C0329o.e(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new w(str, e4, e5, str2, b4, arrayList3, arrayList, str4 != null ? C0329o.e(str4, 0, 0, 7) : null, toString());
    }

    public final int b() {
        int i = this.f6409e;
        if (i != -1) {
            return i;
        }
        String scheme = this.f6405a;
        Intrinsics.checkNotNull(scheme);
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (Intrinsics.areEqual(scheme, "http")) {
            return 80;
        }
        return Intrinsics.areEqual(scheme, "https") ? 443 : -1;
    }

    public final void c(String str) {
        String b4;
        this.f6411g = (str == null || (b4 = C0329o.b(0, 0, 211, str, " \"'<>#")) == null) ? null : C0329o.g(b4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x01f7, code lost:
    
        if (r6 < 65536) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r14 == ':') goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x031e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x031a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(e3.w r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.C0335v.d(e3.w, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (r1 != r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.f6405a
            if (r1 == 0) goto L12
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            goto L17
        L12:
            java.lang.String r1 = "//"
            r0.append(r1)
        L17:
            java.lang.String r1 = r6.f6406b
            int r1 = r1.length()
            r2 = 58
            if (r1 <= 0) goto L22
            goto L2a
        L22:
            java.lang.String r1 = r6.f6407c
            int r1 = r1.length()
            if (r1 <= 0) goto L44
        L2a:
            java.lang.String r1 = r6.f6406b
            r0.append(r1)
            java.lang.String r1 = r6.f6407c
            int r1 = r1.length()
            if (r1 <= 0) goto L3f
            r0.append(r2)
            java.lang.String r1 = r6.f6407c
            r0.append(r1)
        L3f:
            r1 = 64
            r0.append(r1)
        L44:
            java.lang.String r1 = r6.f6408d
            if (r1 == 0) goto L66
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            boolean r1 = kotlin.text.StringsKt.d(r1, r2)
            if (r1 == 0) goto L61
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r6.f6408d
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L66
        L61:
            java.lang.String r1 = r6.f6408d
            r0.append(r1)
        L66:
            int r1 = r6.f6409e
            r3 = -1
            if (r1 != r3) goto L6f
            java.lang.String r1 = r6.f6405a
            if (r1 == 0) goto L9c
        L6f:
            int r1 = r6.b()
            java.lang.String r4 = r6.f6405a
            if (r4 == 0) goto L96
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.lang.String r5 = "scheme"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            java.lang.String r5 = "http"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r5 == 0) goto L8a
            r3 = 80
            goto L94
        L8a:
            java.lang.String r5 = "https"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 == 0) goto L94
            r3 = 443(0x1bb, float:6.21E-43)
        L94:
            if (r1 == r3) goto L9c
        L96:
            r0.append(r2)
            r0.append(r1)
        L9c:
            java.util.ArrayList r1 = r6.f6410f
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            int r2 = r1.size()
            r3 = 0
        Lad:
            if (r3 >= r2) goto Lc0
            r4 = 47
            r0.append(r4)
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            int r3 = r3 + 1
            goto Lad
        Lc0:
            java.util.ArrayList r1 = r6.f6411g
            if (r1 == 0) goto Ld1
            r1 = 63
            r0.append(r1)
            java.util.ArrayList r1 = r6.f6411g
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            e3.C0329o.h(r1, r0)
        Ld1:
            java.lang.String r1 = r6.h
            if (r1 == 0) goto Ldf
            r1 = 35
            r0.append(r1)
            java.lang.String r6 = r6.h
            r0.append(r6)
        Ldf:
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.C0335v.toString():java.lang.String");
    }
}
