package K0;

import a.AbstractC0105a;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import r3.B;
import r3.u;
import r3.w;
import r3.y;
import r3.z;

/* loaded from: classes.dex */
public final class g implements Closeable, Flushable {

    /* renamed from: q, reason: collision with root package name */
    public static final Regex f996q = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: a, reason: collision with root package name */
    public final z f997a;

    /* renamed from: b, reason: collision with root package name */
    public final long f998b;

    /* renamed from: c, reason: collision with root package name */
    public final z f999c;

    /* renamed from: d, reason: collision with root package name */
    public final z f1000d;

    /* renamed from: e, reason: collision with root package name */
    public final z f1001e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1002f;

    /* renamed from: g, reason: collision with root package name */
    public final CoroutineScope f1003g;
    public long h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public B f1004j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1005k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1006l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1007m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1008n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1009o;
    public final e p;

    public g(long j4, CoroutineDispatcher coroutineDispatcher, u uVar, z zVar) {
        this.f997a = zVar;
        this.f998b = j4;
        if (j4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f999c = zVar.d("journal");
        this.f1000d = zVar.d("journal.tmp");
        this.f1001e = zVar.d("journal.bkp");
        this.f1002f = new LinkedHashMap(0, 0.75f, true);
        this.f1003g = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(coroutineDispatcher.limitedParallelism(1)));
        this.p = new e(uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x011a, code lost:
    
        if ((r9.i >= 2000) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0113 A[Catch: all -> 0x0031, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000f, B:11:0x0016, B:13:0x001c, B:16:0x002c, B:26:0x003a, B:28:0x0052, B:29:0x0074, B:31:0x0084, B:33:0x008b, B:36:0x0058, B:38:0x0068, B:40:0x00ab, B:42:0x00b2, B:45:0x00b7, B:47:0x00c8, B:50:0x00cd, B:51:0x0108, B:53:0x0113, B:59:0x011c, B:60:0x00e5, B:62:0x00fa, B:64:0x0105, B:67:0x009b, B:69:0x0121, B:70:0x0128), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(K0.g r9, K0.b r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.g.d(K0.g, K0.b, boolean):void");
    }

    public static void f0(String str) {
        if (f996q.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + Typography.quote).toString());
    }

    public final synchronized void O() {
        try {
            if (this.f1006l) {
                return;
            }
            this.p.b(this.f1000d);
            if (this.p.c(this.f1001e)) {
                if (this.p.c(this.f999c)) {
                    this.p.b(this.f1001e);
                } else {
                    this.p.i(this.f1001e, this.f999c);
                }
            }
            if (this.p.c(this.f999c)) {
                try {
                    b0();
                    a0();
                    this.f1006l = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        AbstractC0105a.r(this.p, this.f997a);
                        this.f1007m = false;
                    } catch (Throwable th) {
                        this.f1007m = false;
                        throw th;
                    }
                }
            }
            g0();
            this.f1006l = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void Y() {
        BuildersKt.launch$default(this.f1003g, null, null, new f(this, null), 3, null);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, r3.K] */
    public final B Z() {
        e eVar = this.p;
        eVar.getClass();
        z file = this.f999c;
        Intrinsics.checkNotNullParameter(file, "file");
        eVar.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        e.j(file, "appendingSink", "file");
        eVar.f994b.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        File e4 = file.e();
        Logger logger = w.f8315a;
        Intrinsics.checkNotNullParameter(e4, "<this>");
        FileOutputStream fileOutputStream = new FileOutputStream(e4, true);
        Intrinsics.checkNotNullParameter(fileOutputStream, "<this>");
        return AbstractC0105a.c(new h(new y(fileOutputStream, new Object()), new I1.b(this, 1)));
    }

    public final void a0() {
        Iterator it = this.f1002f.values().iterator();
        long j4 = 0;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int i = 0;
            if (cVar.f990g == null) {
                while (i < 2) {
                    j4 += cVar.f985b[i];
                    i++;
                }
            } else {
                cVar.f990g = null;
                while (i < 2) {
                    z zVar = (z) cVar.f986c.get(i);
                    e eVar = this.p;
                    eVar.b(zVar);
                    eVar.b((z) cVar.f987d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.h = j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0() {
        /*
            r13 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            K0.e r2 = r13.p
            r3.z r3 = r13.f999c
            r3.I r2 = r2.h(r3)
            r3.C r2 = a.AbstractC0105a.d(r2)
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = 0
            java.lang.String r6 = r2.a0(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r7 = r2.a0(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r8 = r2.a0(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r9 = r2.a0(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r10 = r2.a0(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r11 = "libcore.io.DiskLruCache"
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r6)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L84
            java.lang.String r11 = "1"
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r7)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L84
            r11 = 1
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L61
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r8)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L84
            r11 = 2
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L61
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r9)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L84
            int r11 = r10.length()     // Catch: java.lang.Throwable -> L61
            if (r11 > 0) goto L84
            r0 = 0
        L57:
            java.lang.String r1 = r2.a0(r3)     // Catch: java.lang.Throwable -> L61 java.io.EOFException -> L63
            r13.c0(r1)     // Catch: java.lang.Throwable -> L61 java.io.EOFException -> L63
            int r0 = r0 + 1
            goto L57
        L61:
            r13 = move-exception
            goto Lb3
        L63:
            java.util.LinkedHashMap r1 = r13.f1002f     // Catch: java.lang.Throwable -> L61
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L61
            int r0 = r0 - r1
            r13.i = r0     // Catch: java.lang.Throwable -> L61
            boolean r0 = r2.d()     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L76
            r13.g0()     // Catch: java.lang.Throwable -> L61
            goto L7c
        L76:
            r3.B r0 = r13.Z()     // Catch: java.lang.Throwable -> L61
            r13.f1004j = r0     // Catch: java.lang.Throwable -> L61
        L7c:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L61
            r2.close()     // Catch: java.lang.Throwable -> L82
            goto Lbe
        L82:
            r5 = move-exception
            goto Lbe
        L84:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L61
            r3.append(r6)     // Catch: java.lang.Throwable -> L61
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            r3.append(r7)     // Catch: java.lang.Throwable -> L61
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            r3.append(r8)     // Catch: java.lang.Throwable -> L61
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            r3.append(r9)     // Catch: java.lang.Throwable -> L61
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            r3.append(r10)     // Catch: java.lang.Throwable -> L61
            r0 = 93
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L61
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L61
            throw r13     // Catch: java.lang.Throwable -> L61
        Lb3:
            r2.close()     // Catch: java.lang.Throwable -> Lb7
            goto Lbb
        Lb7:
            r0 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r13, r0)
        Lbb:
            r12 = r5
            r5 = r13
            r13 = r12
        Lbe:
            if (r5 != 0) goto Lc4
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13)
            return
        Lc4:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.g.b0():void");
    }

    public final void c0(String str) {
        String substring;
        int l4 = StringsKt.l(str, ' ', 0, 6);
        if (l4 == -1) {
            throw new IOException(C.w.z("unexpected journal line: ", str));
        }
        int i = l4 + 1;
        int l5 = StringsKt.l(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.f1002f;
        if (l5 == -1) {
            substring = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            if (l4 == 6 && StringsKt.D(str, "REMOVE")) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, l5);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Object obj = linkedHashMap.get(substring);
        if (obj == null) {
            obj = new c(this, substring);
            linkedHashMap.put(substring, obj);
        }
        c cVar = (c) obj;
        if (l5 == -1 || l4 != 5 || !StringsKt.D(str, "CLEAN")) {
            if (l5 == -1 && l4 == 5 && StringsKt.D(str, "DIRTY")) {
                cVar.f990g = new b(this, cVar);
                return;
            } else {
                if (l5 != -1 || l4 != 4 || !StringsKt.D(str, "READ")) {
                    throw new IOException(C.w.z("unexpected journal line: ", str));
                }
                return;
            }
        }
        String substring2 = str.substring(l5 + 1);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
        List y3 = StringsKt.y(substring2, new char[]{' '});
        cVar.f988e = true;
        cVar.f990g = null;
        int size = y3.size();
        cVar.i.getClass();
        if (size != 2) {
            throw new IOException("unexpected journal line: " + y3);
        }
        try {
            int size2 = y3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                cVar.f985b[i4] = Long.parseLong((String) y3.get(i4));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + y3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f1006l && !this.f1007m) {
                for (c cVar : (c[]) this.f1002f.values().toArray(new c[0])) {
                    b bVar = cVar.f990g;
                    if (bVar != null) {
                        c cVar2 = bVar.f980a;
                        if (Intrinsics.areEqual(cVar2.f990g, bVar)) {
                            cVar2.f989f = true;
                        }
                    }
                }
                e0();
                CoroutineScopeKt.cancel$default(this.f1003g, null, 1, null);
                B b4 = this.f1004j;
                Intrinsics.checkNotNull(b4);
                b4.close();
                this.f1004j = null;
                this.f1007m = true;
                return;
            }
            this.f1007m = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d0(c cVar) {
        B b4;
        int i = cVar.h;
        String str = cVar.f984a;
        if (i > 0 && (b4 = this.f1004j) != null) {
            b4.Q("DIRTY");
            b4.y(32);
            b4.Q(str);
            b4.y(10);
            b4.flush();
        }
        if (cVar.h > 0 || cVar.f990g != null) {
            cVar.f989f = true;
            return;
        }
        for (int i4 = 0; i4 < 2; i4++) {
            this.p.b((z) cVar.f986c.get(i4));
            long j4 = this.h;
            long[] jArr = cVar.f985b;
            this.h = j4 - jArr[i4];
            jArr[i4] = 0;
        }
        this.i++;
        B b5 = this.f1004j;
        if (b5 != null) {
            b5.Q("REMOVE");
            b5.y(32);
            b5.Q(str);
            b5.y(10);
        }
        this.f1002f.remove(str);
        if (this.i >= 2000) {
            Y();
        }
    }

    public final void e() {
        if (this.f1007m) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        d0(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0() {
        /*
            r4 = this;
        L0:
            long r0 = r4.h
            long r2 = r4.f998b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f1002f
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            K0.c r1 = (K0.c) r1
            boolean r2 = r1.f989f
            if (r2 != 0) goto L12
            r4.d0(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f1008n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.g.e0():void");
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f1006l) {
            e();
            e0();
            B b4 = this.f1004j;
            Intrinsics.checkNotNull(b4);
            b4.flush();
        }
    }

    public final synchronized void g0() {
        Unit unit;
        try {
            B b4 = this.f1004j;
            if (b4 != null) {
                b4.close();
            }
            B c4 = AbstractC0105a.c(this.p.g(this.f1000d));
            Throwable th = null;
            try {
                c4.Q("libcore.io.DiskLruCache");
                c4.y(10);
                c4.Q("1");
                c4.y(10);
                c4.R(1);
                c4.y(10);
                c4.R(2);
                c4.y(10);
                c4.y(10);
                for (c cVar : this.f1002f.values()) {
                    if (cVar.f990g != null) {
                        c4.Q("DIRTY");
                        c4.y(32);
                        c4.Q(cVar.f984a);
                        c4.y(10);
                    } else {
                        c4.Q("CLEAN");
                        c4.y(32);
                        c4.Q(cVar.f984a);
                        for (long j4 : cVar.f985b) {
                            c4.y(32);
                            c4.R(j4);
                        }
                        c4.y(10);
                    }
                }
                unit = Unit.INSTANCE;
                try {
                    c4.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    c4.close();
                } catch (Throwable th4) {
                    ExceptionsKt.addSuppressed(th3, th4);
                }
                unit = null;
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            Intrinsics.checkNotNull(unit);
            if (this.p.c(this.f999c)) {
                this.p.i(this.f999c, this.f1001e);
                this.p.i(this.f1000d, this.f999c);
                this.p.b(this.f1001e);
            } else {
                this.p.i(this.f1000d, this.f999c);
            }
            this.f1004j = Z();
            this.i = 0;
            this.f1005k = false;
            this.f1009o = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final synchronized b s(String str) {
        try {
            e();
            f0(str);
            O();
            c cVar = (c) this.f1002f.get(str);
            if ((cVar != null ? cVar.f990g : null) != null) {
                return null;
            }
            if (cVar != null && cVar.h != 0) {
                return null;
            }
            if (!this.f1008n && !this.f1009o) {
                B b4 = this.f1004j;
                Intrinsics.checkNotNull(b4);
                b4.Q("DIRTY");
                b4.y(32);
                b4.Q(str);
                b4.y(10);
                b4.flush();
                if (this.f1005k) {
                    return null;
                }
                if (cVar == null) {
                    cVar = new c(this, str);
                    this.f1002f.put(str, cVar);
                }
                b bVar = new b(this, cVar);
                cVar.f990g = bVar;
                return bVar;
            }
            Y();
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized d x(String str) {
        d a2;
        e();
        f0(str);
        O();
        c cVar = (c) this.f1002f.get(str);
        if (cVar != null && (a2 = cVar.a()) != null) {
            boolean z3 = true;
            this.i++;
            B b4 = this.f1004j;
            Intrinsics.checkNotNull(b4);
            b4.Q("READ");
            b4.y(32);
            b4.Q(str);
            b4.y(10);
            if (this.i < 2000) {
                z3 = false;
            }
            if (z3) {
                Y();
            }
            return a2;
        }
        return null;
    }
}
