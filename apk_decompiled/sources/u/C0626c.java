package u;

import F.i;
import R0.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0626c {
    public static boolean p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f8567q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final C0628e f8570c;

    /* renamed from: f, reason: collision with root package name */
    public C0625b[] f8573f;

    /* renamed from: l, reason: collision with root package name */
    public final h f8577l;

    /* renamed from: o, reason: collision with root package name */
    public C0625b f8580o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8568a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f8569b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f8571d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f8572e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8574g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f8575j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f8576k = 32;

    /* renamed from: m, reason: collision with root package name */
    public C0630g[] f8578m = new C0630g[f8567q];

    /* renamed from: n, reason: collision with root package name */
    public int f8579n = 0;

    /* JADX WARN: Type inference failed for: r1v2, types: [u.b, java.lang.Object, u.e] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, R0.h] */
    public C0626c() {
        this.f8573f = null;
        this.f8573f = new C0625b[32];
        s();
        ?? obj = new Object();
        obj.f1413a = new N.c();
        obj.f1414b = new N.c();
        obj.f1415c = new C0630g[32];
        this.f8577l = obj;
        ?? c0625b = new C0625b(obj);
        c0625b.f8581f = new C0630g[128];
        c0625b.f8582g = new C0630g[128];
        c0625b.h = 0;
        c0625b.i = new i((Object) c0625b, 19);
        this.f8570c = c0625b;
        this.f8580o = new C0625b(obj);
    }

    public static int n(Object obj) {
        C0630g c0630g = ((w.c) obj).i;
        if (c0630g != null) {
            return (int) (c0630g.f8588e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C0630g a(int i) {
        N.c cVar = (N.c) this.f8577l.f1414b;
        int i4 = cVar.f1122b;
        C0630g c0630g = null;
        if (i4 > 0) {
            int i5 = i4 - 1;
            ?? r32 = cVar.f1121a;
            ?? r4 = r32[i5];
            r32[i5] = 0;
            cVar.f1122b = i5;
            c0630g = r4;
        }
        C0630g c0630g2 = c0630g;
        if (c0630g2 == null) {
            c0630g2 = new C0630g(i);
            c0630g2.f8593l = i;
        } else {
            c0630g2.c();
            c0630g2.f8593l = i;
        }
        int i6 = this.f8579n;
        int i7 = f8567q;
        if (i6 >= i7) {
            int i8 = i7 * 2;
            f8567q = i8;
            this.f8578m = (C0630g[]) Arrays.copyOf(this.f8578m, i8);
        }
        C0630g[] c0630gArr = this.f8578m;
        int i9 = this.f8579n;
        this.f8579n = i9 + 1;
        c0630gArr[i9] = c0630g2;
        return c0630g2;
    }

    public final void b(C0630g c0630g, C0630g c0630g2, int i, float f2, C0630g c0630g3, C0630g c0630g4, int i4, int i5) {
        C0625b l4 = l();
        if (c0630g2 == c0630g3) {
            l4.f8565d.g(c0630g, 1.0f);
            l4.f8565d.g(c0630g4, 1.0f);
            l4.f8565d.g(c0630g2, -2.0f);
        } else if (f2 == 0.5f) {
            l4.f8565d.g(c0630g, 1.0f);
            l4.f8565d.g(c0630g2, -1.0f);
            l4.f8565d.g(c0630g3, -1.0f);
            l4.f8565d.g(c0630g4, 1.0f);
            if (i > 0 || i4 > 0) {
                l4.f8563b = (-i) + i4;
            }
        } else if (f2 <= BitmapDescriptorFactory.HUE_RED) {
            l4.f8565d.g(c0630g, -1.0f);
            l4.f8565d.g(c0630g2, 1.0f);
            l4.f8563b = i;
        } else if (f2 >= 1.0f) {
            l4.f8565d.g(c0630g4, -1.0f);
            l4.f8565d.g(c0630g3, 1.0f);
            l4.f8563b = -i4;
        } else {
            float f4 = 1.0f - f2;
            l4.f8565d.g(c0630g, f4 * 1.0f);
            l4.f8565d.g(c0630g2, f4 * (-1.0f));
            l4.f8565d.g(c0630g3, (-1.0f) * f2);
            l4.f8565d.g(c0630g4, 1.0f * f2);
            if (i > 0 || i4 > 0) {
                l4.f8563b = (i4 * f2) + ((-i) * f4);
            }
        }
        if (i5 != 8) {
            l4.a(this, i5);
        }
        c(l4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d3, code lost:
    
        if (r4.f8592k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e0, code lost:
    
        if (r4.f8592k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f5, code lost:
    
        if (r4.f8592k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f8, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0102, code lost:
    
        if (r4.f8592k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(u.C0625b r18) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C0626c.c(u.b):void");
    }

    public final void d(C0630g c0630g, int i) {
        int i4 = c0630g.f8586c;
        if (i4 == -1) {
            c0630g.d(this, i);
            for (int i5 = 0; i5 < this.f8569b + 1; i5++) {
                C0630g c0630g2 = ((C0630g[]) this.f8577l.f1415c)[i5];
            }
            return;
        }
        if (i4 == -1) {
            C0625b l4 = l();
            l4.f8562a = c0630g;
            float f2 = i;
            c0630g.f8588e = f2;
            l4.f8563b = f2;
            l4.f8566e = true;
            c(l4);
            return;
        }
        C0625b c0625b = this.f8573f[i4];
        if (c0625b.f8566e) {
            c0625b.f8563b = i;
            return;
        }
        if (c0625b.f8565d.d() == 0) {
            c0625b.f8566e = true;
            c0625b.f8563b = i;
            return;
        }
        C0625b l5 = l();
        if (i < 0) {
            l5.f8563b = i * (-1);
            l5.f8565d.g(c0630g, 1.0f);
        } else {
            l5.f8563b = i;
            l5.f8565d.g(c0630g, -1.0f);
        }
        c(l5);
    }

    public final void e(C0630g c0630g, C0630g c0630g2, int i, int i4) {
        if (i4 == 8 && c0630g2.f8589f && c0630g.f8586c == -1) {
            c0630g.d(this, c0630g2.f8588e + i);
            return;
        }
        C0625b l4 = l();
        boolean z3 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z3 = true;
            }
            l4.f8563b = i;
        }
        if (z3) {
            l4.f8565d.g(c0630g, 1.0f);
            l4.f8565d.g(c0630g2, -1.0f);
        } else {
            l4.f8565d.g(c0630g, -1.0f);
            l4.f8565d.g(c0630g2, 1.0f);
        }
        if (i4 != 8) {
            l4.a(this, i4);
        }
        c(l4);
    }

    public final void f(C0630g c0630g, C0630g c0630g2, int i, int i4) {
        C0625b l4 = l();
        C0630g m4 = m();
        m4.f8587d = 0;
        l4.b(c0630g, c0630g2, m4, i);
        if (i4 != 8) {
            l4.f8565d.g(j(i4), (int) (l4.f8565d.c(m4) * (-1.0f)));
        }
        c(l4);
    }

    public final void g(C0630g c0630g, C0630g c0630g2, int i, int i4) {
        C0625b l4 = l();
        C0630g m4 = m();
        m4.f8587d = 0;
        l4.c(c0630g, c0630g2, m4, i);
        if (i4 != 8) {
            l4.f8565d.g(j(i4), (int) (l4.f8565d.c(m4) * (-1.0f)));
        }
        c(l4);
    }

    public final void h(C0625b c0625b) {
        int i;
        if (c0625b.f8566e) {
            c0625b.f8562a.d(this, c0625b.f8563b);
        } else {
            C0625b[] c0625bArr = this.f8573f;
            int i4 = this.f8575j;
            c0625bArr[i4] = c0625b;
            C0630g c0630g = c0625b.f8562a;
            c0630g.f8586c = i4;
            this.f8575j = i4 + 1;
            c0630g.e(this, c0625b);
        }
        if (this.f8568a) {
            int i5 = 0;
            while (i5 < this.f8575j) {
                if (this.f8573f[i5] == null) {
                    System.out.println("WTF");
                }
                C0625b c0625b2 = this.f8573f[i5];
                if (c0625b2 != null && c0625b2.f8566e) {
                    c0625b2.f8562a.d(this, c0625b2.f8563b);
                    ((N.c) this.f8577l.f1413a).b(c0625b2);
                    this.f8573f[i5] = null;
                    int i6 = i5 + 1;
                    int i7 = i6;
                    while (true) {
                        i = this.f8575j;
                        if (i6 >= i) {
                            break;
                        }
                        C0625b[] c0625bArr2 = this.f8573f;
                        int i8 = i6 - 1;
                        C0625b c0625b3 = c0625bArr2[i6];
                        c0625bArr2[i8] = c0625b3;
                        C0630g c0630g2 = c0625b3.f8562a;
                        if (c0630g2.f8586c == i6) {
                            c0630g2.f8586c = i8;
                        }
                        i7 = i6;
                        i6++;
                    }
                    if (i7 < i) {
                        this.f8573f[i7] = null;
                    }
                    this.f8575j = i - 1;
                    i5--;
                }
                i5++;
            }
            this.f8568a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f8575j; i++) {
            C0625b c0625b = this.f8573f[i];
            c0625b.f8562a.f8588e = c0625b.f8563b;
        }
    }

    public final C0630g j(int i) {
        if (this.i + 1 >= this.f8572e) {
            o();
        }
        C0630g a2 = a(4);
        int i4 = this.f8569b + 1;
        this.f8569b = i4;
        this.i++;
        a2.f8585b = i4;
        a2.f8587d = i;
        ((C0630g[]) this.f8577l.f1415c)[i4] = a2;
        C0628e c0628e = this.f8570c;
        c0628e.i.f490b = a2;
        float[] fArr = a2.h;
        Arrays.fill(fArr, BitmapDescriptorFactory.HUE_RED);
        fArr[a2.f8587d] = 1.0f;
        c0628e.j(a2);
        return a2;
    }

    public final C0630g k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f8572e) {
            o();
        }
        if (!(obj instanceof w.c)) {
            return null;
        }
        w.c cVar = (w.c) obj;
        C0630g c0630g = cVar.i;
        if (c0630g == null) {
            cVar.k();
            c0630g = cVar.i;
        }
        int i = c0630g.f8585b;
        h hVar = this.f8577l;
        if (i != -1 && i <= this.f8569b && ((C0630g[]) hVar.f1415c)[i] != null) {
            return c0630g;
        }
        if (i != -1) {
            c0630g.c();
        }
        int i4 = this.f8569b + 1;
        this.f8569b = i4;
        this.i++;
        c0630g.f8585b = i4;
        c0630g.f8593l = 1;
        ((C0630g[]) hVar.f1415c)[i4] = c0630g;
        return c0630g;
    }

    public final C0625b l() {
        Object obj;
        h hVar = this.f8577l;
        N.c cVar = (N.c) hVar.f1413a;
        int i = cVar.f1122b;
        if (i > 0) {
            int i4 = i - 1;
            Object[] objArr = cVar.f1121a;
            obj = objArr[i4];
            objArr[i4] = null;
            cVar.f1122b = i4;
        } else {
            obj = null;
        }
        C0625b c0625b = (C0625b) obj;
        if (c0625b == null) {
            return new C0625b(hVar);
        }
        c0625b.f8562a = null;
        c0625b.f8565d.b();
        c0625b.f8563b = BitmapDescriptorFactory.HUE_RED;
        c0625b.f8566e = false;
        return c0625b;
    }

    public final C0630g m() {
        if (this.i + 1 >= this.f8572e) {
            o();
        }
        C0630g a2 = a(3);
        int i = this.f8569b + 1;
        this.f8569b = i;
        this.i++;
        a2.f8585b = i;
        ((C0630g[]) this.f8577l.f1415c)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.f8571d * 2;
        this.f8571d = i;
        this.f8573f = (C0625b[]) Arrays.copyOf(this.f8573f, i);
        h hVar = this.f8577l;
        hVar.f1415c = (C0630g[]) Arrays.copyOf((C0630g[]) hVar.f1415c, this.f8571d);
        int i4 = this.f8571d;
        this.h = new boolean[i4];
        this.f8572e = i4;
        this.f8576k = i4;
    }

    public final void p() {
        C0628e c0628e = this.f8570c;
        if (c0628e.e()) {
            i();
            return;
        }
        if (!this.f8574g) {
            q(c0628e);
            return;
        }
        for (int i = 0; i < this.f8575j; i++) {
            if (!this.f8573f[i].f8566e) {
                q(c0628e);
                return;
            }
        }
        i();
    }

    public final void q(C0628e c0628e) {
        int i = 0;
        while (true) {
            if (i >= this.f8575j) {
                break;
            }
            C0625b c0625b = this.f8573f[i];
            int i4 = 1;
            if (c0625b.f8562a.f8593l != 1) {
                float f2 = c0625b.f8563b;
                float f4 = BitmapDescriptorFactory.HUE_RED;
                if (f2 < BitmapDescriptorFactory.HUE_RED) {
                    boolean z3 = false;
                    int i5 = 0;
                    while (!z3) {
                        i5 += i4;
                        float f5 = Float.MAX_VALUE;
                        int i6 = -1;
                        int i7 = -1;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < this.f8575j) {
                            C0625b c0625b2 = this.f8573f[i8];
                            if (c0625b2.f8562a.f8593l != i4 && !c0625b2.f8566e && c0625b2.f8563b < f4) {
                                int d4 = c0625b2.f8565d.d();
                                int i10 = 0;
                                while (i10 < d4) {
                                    C0630g e4 = c0625b2.f8565d.e(i10);
                                    float c4 = c0625b2.f8565d.c(e4);
                                    if (c4 > f4) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f6 = e4.f8590g[i11] / c4;
                                            if ((f6 < f5 && i11 == i9) || i11 > i9) {
                                                i9 = i11;
                                                i7 = e4.f8585b;
                                                i6 = i8;
                                                f5 = f6;
                                            }
                                        }
                                    }
                                    i10++;
                                    f4 = BitmapDescriptorFactory.HUE_RED;
                                }
                            }
                            i8++;
                            f4 = BitmapDescriptorFactory.HUE_RED;
                            i4 = 1;
                        }
                        if (i6 != -1) {
                            C0625b c0625b3 = this.f8573f[i6];
                            c0625b3.f8562a.f8586c = -1;
                            c0625b3.g(((C0630g[]) this.f8577l.f1415c)[i7]);
                            C0630g c0630g = c0625b3.f8562a;
                            c0630g.f8586c = i6;
                            c0630g.e(this, c0625b3);
                        } else {
                            z3 = true;
                        }
                        if (i5 > this.i / 2) {
                            z3 = true;
                        }
                        f4 = BitmapDescriptorFactory.HUE_RED;
                        i4 = 1;
                    }
                }
            }
            i++;
        }
        r(c0628e);
        i();
    }

    public final void r(C0625b c0625b) {
        boolean z3;
        int i = 0;
        for (int i4 = 0; i4 < this.i; i4++) {
            this.h[i4] = false;
        }
        boolean z4 = false;
        int i5 = 0;
        while (!z4) {
            int i6 = 1;
            i5++;
            if (i5 >= this.i * 2) {
                return;
            }
            C0630g c0630g = c0625b.f8562a;
            if (c0630g != null) {
                this.h[c0630g.f8585b] = true;
            }
            C0630g d4 = c0625b.d(this.h);
            if (d4 != null) {
                boolean[] zArr = this.h;
                int i7 = d4.f8585b;
                if (zArr[i7]) {
                    return;
                } else {
                    zArr[i7] = true;
                }
            }
            if (d4 != null) {
                float f2 = Float.MAX_VALUE;
                int i8 = i;
                int i9 = -1;
                while (i8 < this.f8575j) {
                    C0625b c0625b2 = this.f8573f[i8];
                    if (c0625b2.f8562a.f8593l != i6 && !c0625b2.f8566e) {
                        C0624a c0624a = c0625b2.f8565d;
                        int i10 = c0624a.h;
                        if (i10 != -1) {
                            for (int i11 = 0; i10 != -1 && i11 < c0624a.f8554a; i11++) {
                                if (c0624a.f8558e[i10] == d4.f8585b) {
                                    z3 = true;
                                    break;
                                }
                                i10 = c0624a.f8559f[i10];
                            }
                        }
                        z3 = false;
                        if (z3) {
                            float c4 = c0625b2.f8565d.c(d4);
                            if (c4 < BitmapDescriptorFactory.HUE_RED) {
                                float f4 = (-c0625b2.f8563b) / c4;
                                if (f4 < f2) {
                                    f2 = f4;
                                    i9 = i8;
                                }
                            }
                        }
                    }
                    i8++;
                    i6 = 1;
                }
                if (i9 > -1) {
                    C0625b c0625b3 = this.f8573f[i9];
                    c0625b3.f8562a.f8586c = -1;
                    c0625b3.g(d4);
                    C0630g c0630g2 = c0625b3.f8562a;
                    c0630g2.f8586c = i9;
                    c0630g2.e(this, c0625b3);
                }
            } else {
                z4 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f8575j; i++) {
            C0625b c0625b = this.f8573f[i];
            if (c0625b != null) {
                ((N.c) this.f8577l.f1413a).b(c0625b);
            }
            this.f8573f[i] = null;
        }
    }

    public final void t() {
        h hVar;
        int i = 0;
        while (true) {
            hVar = this.f8577l;
            C0630g[] c0630gArr = (C0630g[]) hVar.f1415c;
            if (i >= c0630gArr.length) {
                break;
            }
            C0630g c0630g = c0630gArr[i];
            if (c0630g != null) {
                c0630g.c();
            }
            i++;
        }
        N.c cVar = (N.c) hVar.f1414b;
        C0630g[] c0630gArr2 = this.f8578m;
        int i4 = this.f8579n;
        cVar.getClass();
        if (i4 > c0630gArr2.length) {
            i4 = c0630gArr2.length;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            C0630g c0630g2 = c0630gArr2[i5];
            int i6 = cVar.f1122b;
            Object[] objArr = cVar.f1121a;
            if (i6 < objArr.length) {
                objArr[i6] = c0630g2;
                cVar.f1122b = i6 + 1;
            }
        }
        this.f8579n = 0;
        Arrays.fill((C0630g[]) hVar.f1415c, (Object) null);
        this.f8569b = 0;
        C0628e c0628e = this.f8570c;
        c0628e.h = 0;
        c0628e.f8563b = BitmapDescriptorFactory.HUE_RED;
        this.i = 1;
        for (int i7 = 0; i7 < this.f8575j; i7++) {
            C0625b c0625b = this.f8573f[i7];
        }
        s();
        this.f8575j = 0;
        this.f8580o = new C0625b(hVar);
    }
}
