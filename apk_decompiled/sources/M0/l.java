package M0;

import S0.o;
import a.AbstractC0105a;
import e3.C0317c;
import e3.C0334u;
import e3.H;
import e3.I;
import java.io.IOException;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import r3.C;
import r3.n;
import r3.z;

/* loaded from: classes.dex */
public final class l implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final C0317c f1104f = new C0317c(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: g, reason: collision with root package name */
    public static final C0317c f1105g = new C0317c(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* renamed from: a, reason: collision with root package name */
    public final String f1106a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1107b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f1108c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f1109d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1110e;

    public l(String str, o oVar, Lazy lazy, Lazy lazy2, boolean z3) {
        this.f1106a = str;
        this.f1107b = oVar;
        this.f1108c = lazy;
        this.f1109d = lazy2;
        this.f1110e = z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r1 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(java.lang.String r2, e3.A r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L6
            java.lang.String r3 = r3.f6199a
            goto L7
        L6:
            r3 = r0
        L7:
            if (r3 == 0) goto L11
            java.lang.String r1 = "text/plain"
            boolean r1 = kotlin.text.StringsKt.D(r3, r1)
            if (r1 == 0) goto L1c
        L11:
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r2 = W0.f.b(r1, r2)
            if (r2 == 0) goto L1c
            return r2
        L1c:
            if (r3 == 0) goto L25
            r2 = 59
            java.lang.String r2 = kotlin.text.StringsKt.K(r2, r3)
            return r2
        L25:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.l.d(java.lang.String, e3.A):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012c A[Catch: Exception -> 0x0059, TryCatch #3 {Exception -> 0x0059, blocks: (B:43:0x0050, B:45:0x014e, B:47:0x0220, B:48:0x0225, B:89:0x0099, B:91:0x00a3, B:94:0x00d0, B:96:0x00d4, B:100:0x00ed, B:102:0x0139, B:105:0x0105, B:107:0x0111, B:108:0x011a, B:110:0x00b8, B:112:0x00c0, B:114:0x0124, B:115:0x012b, B:116:0x012c), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01dc A[Catch: Exception -> 0x020a, TryCatch #2 {Exception -> 0x020a, blocks: (B:17:0x01d6, B:19:0x01dc, B:21:0x0201, B:22:0x0206, B:25:0x0204, B:26:0x020f, B:27:0x0214), top: B:16:0x01d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x020f A[Catch: Exception -> 0x020a, TryCatch #2 {Exception -> 0x020a, blocks: (B:17:0x01d6, B:19:0x01dc, B:21:0x0201, B:22:0x0206, B:25:0x0204, B:26:0x020f, B:27:0x0214), top: B:16:0x01d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0220 A[Catch: Exception -> 0x0059, TRY_ENTER, TryCatch #3 {Exception -> 0x0059, blocks: (B:43:0x0050, B:45:0x014e, B:47:0x0220, B:48:0x0225, B:89:0x0099, B:91:0x00a3, B:94:0x00d0, B:96:0x00d4, B:100:0x00ed, B:102:0x0139, B:105:0x0105, B:107:0x0111, B:108:0x011a, B:110:0x00b8, B:112:0x00c0, B:114:0x0124, B:115:0x012b, B:116:0x012c), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0099 A[Catch: Exception -> 0x0059, TRY_ENTER, TryCatch #3 {Exception -> 0x0059, blocks: (B:43:0x0050, B:45:0x014e, B:47:0x0220, B:48:0x0225, B:89:0x0099, B:91:0x00a3, B:94:0x00d0, B:96:0x00d4, B:100:0x00ed, B:102:0x0139, B:105:0x0105, B:107:0x0111, B:108:0x011a, B:110:0x00b8, B:112:0x00c0, B:114:0x0124, B:115:0x012b, B:116:0x012c), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v14 */
    @Override // M0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.l.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(e3.I r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof M0.j
            if (r0 == 0) goto L13
            r0 = r7
            M0.j r0 = (M0.j) r0
            int r1 = r0.f1097c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1097c = r1
            goto L18
        L13:
            M0.j r0 = new M0.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f1095a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1097c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r7)
            goto Lab
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.ResultKt.throwOnFailure(r7)
            android.graphics.Bitmap$Config[] r7 = W0.f.f1887a
            android.os.Looper r7 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r2)
            java.lang.String r2 = "request"
            kotlin.Lazy r4 = r5.f1108c
            if (r7 == 0) goto L6f
            S0.o r5 = r5.f1107b
            S0.b r5 = r5.f1514o
            boolean r5 = r5.f1447a
            if (r5 != 0) goto L69
            java.lang.Object r5 = r4.getValue()
            e3.d r5 = (e3.InterfaceC0318d) r5
            e3.F r5 = (e3.F) r5
            r5.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            i3.j r7 = new i3.j
            r7.<init>(r5, r6)
            e3.O r5 = r7.e()
            goto Lae
        L69:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L6f:
            java.lang.Object r5 = r4.getValue()
            e3.d r5 = (e3.InterfaceC0318d) r5
            e3.F r5 = (e3.F) r5
            r5.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            i3.j r7 = new i3.j
            r7.<init>(r5, r6)
            r0.f1097c = r3
            kotlinx.coroutines.CancellableContinuationImpl r5 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r5.<init>(r6, r3)
            r5.initCancellability()
            W0.g r6 = new W0.g
            r6.<init>(r7, r5)
            r7.d(r6)
            r5.invokeOnCancellation(r6)
            java.lang.Object r7 = r5.getResult()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r5) goto La8
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        La8:
            if (r7 != r1) goto Lab
            return r1
        Lab:
            r5 = r7
            e3.O r5 = (e3.O) r5
        Lae:
            boolean r6 = r5.e()
            if (r6 != 0) goto Lc7
            r6 = 304(0x130, float:4.26E-43)
            int r7 = r5.f6294d
            if (r7 == r6) goto Lc7
            e3.T r6 = r5.f6297g
            if (r6 == 0) goto Lc1
            W0.f.a(r6)
        Lc1:
            R0.e r6 = new R0.e
            r6.<init>(r5)
            throw r6
        Lc7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.l.b(e3.I, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final n c() {
        Object value = this.f1109d.getValue();
        Intrinsics.checkNotNull(value);
        return ((K0.j) value).f1013a;
    }

    public final I e() {
        H h = new H();
        h.g(this.f1106a);
        o oVar = this.f1107b;
        C0334u headers = oVar.f1509j;
        Intrinsics.checkNotNullParameter(headers, "headers");
        h.f6264c = headers.c();
        for (Map.Entry entry : oVar.f1510k.f1525a.entrySet()) {
            Object key = entry.getKey();
            Intrinsics.checkNotNull(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            h.f((Class) key, entry.getValue());
        }
        S0.b bVar = oVar.f1513n;
        boolean z3 = bVar.f1447a;
        boolean z4 = oVar.f1514o.f1447a;
        if (!z4 && z3) {
            h.b(C0317c.f6331o);
        } else if (!z4 || z3) {
            if (!z4 && !z3) {
                h.b(f1105g);
            }
        } else if (bVar.f1448b) {
            h.b(C0317c.f6330n);
        } else {
            h.b(f1104f);
        }
        return h.a();
    }

    public final R0.b f(K0.i iVar) {
        Throwable th;
        R0.b bVar;
        try {
            n c4 = c();
            K0.d dVar = iVar.f1012a;
            if (dVar.f992b) {
                throw new IllegalStateException("snapshot is closed");
            }
            C d4 = AbstractC0105a.d(c4.h((z) dVar.f991a.f986c.get(0)));
            try {
                bVar = new R0.b(d4);
                try {
                    d4.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    d4.close();
                } catch (Throwable th4) {
                    ExceptionsKt.addSuppressed(th3, th4);
                }
                th = th3;
                bVar = null;
            }
            if (th != null) {
                throw th;
            }
            Intrinsics.checkNotNull(bVar);
            return bVar;
        } catch (IOException unused) {
            return null;
        }
    }

    public final J0.o g(K0.i iVar) {
        K0.d dVar = iVar.f1012a;
        if (dVar.f992b) {
            throw new IllegalStateException("snapshot is closed");
        }
        z zVar = (z) dVar.f991a.f986c.get(1);
        n c4 = c();
        String str = this.f1107b.i;
        if (str == null) {
            str = this.f1106a;
        }
        return new J0.o(zVar, c4, str, iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.f6296f.a("Vary"), com.adif.elcanomovil.repositories.circulation.CirculationMapper.VIA_ASTERISK) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final K0.i h(K0.i r5, e3.I r6, e3.O r7, R0.b r8) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.l.h(K0.i, e3.I, e3.O, R0.b):K0.i");
    }
}
