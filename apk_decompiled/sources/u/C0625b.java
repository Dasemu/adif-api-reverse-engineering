package u;

import R0.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0625b {

    /* renamed from: d, reason: collision with root package name */
    public final C0624a f8565d;

    /* renamed from: a, reason: collision with root package name */
    public C0630g f8562a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f8563b = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8564c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f8566e = false;

    public C0625b(h hVar) {
        this.f8565d = new C0624a(this, hVar);
    }

    public final void a(C0626c c0626c, int i) {
        this.f8565d.g(c0626c.j(i), 1.0f);
        this.f8565d.g(c0626c.j(i), -1.0f);
    }

    public final void b(C0630g c0630g, C0630g c0630g2, C0630g c0630g3, int i) {
        boolean z3 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z3 = true;
            }
            this.f8563b = i;
        }
        if (z3) {
            this.f8565d.g(c0630g, 1.0f);
            this.f8565d.g(c0630g2, -1.0f);
            this.f8565d.g(c0630g3, -1.0f);
        } else {
            this.f8565d.g(c0630g, -1.0f);
            this.f8565d.g(c0630g2, 1.0f);
            this.f8565d.g(c0630g3, 1.0f);
        }
    }

    public final void c(C0630g c0630g, C0630g c0630g2, C0630g c0630g3, int i) {
        boolean z3 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z3 = true;
            }
            this.f8563b = i;
        }
        if (z3) {
            this.f8565d.g(c0630g, 1.0f);
            this.f8565d.g(c0630g2, -1.0f);
            this.f8565d.g(c0630g3, 1.0f);
        } else {
            this.f8565d.g(c0630g, -1.0f);
            this.f8565d.g(c0630g2, 1.0f);
            this.f8565d.g(c0630g3, -1.0f);
        }
    }

    public C0630g d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f8562a == null && this.f8563b == BitmapDescriptorFactory.HUE_RED && this.f8565d.d() == 0;
    }

    public final C0630g f(boolean[] zArr, C0630g c0630g) {
        int i;
        int d4 = this.f8565d.d();
        C0630g c0630g2 = null;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < d4; i4++) {
            float f4 = this.f8565d.f(i4);
            if (f4 < BitmapDescriptorFactory.HUE_RED) {
                C0630g e4 = this.f8565d.e(i4);
                if ((zArr == null || !zArr[e4.f8585b]) && e4 != c0630g && (((i = e4.f8593l) == 3 || i == 4) && f4 < f2)) {
                    f2 = f4;
                    c0630g2 = e4;
                }
            }
        }
        return c0630g2;
    }

    public final void g(C0630g c0630g) {
        C0630g c0630g2 = this.f8562a;
        if (c0630g2 != null) {
            this.f8565d.g(c0630g2, -1.0f);
            this.f8562a.f8586c = -1;
            this.f8562a = null;
        }
        float h = this.f8565d.h(c0630g, true) * (-1.0f);
        this.f8562a = c0630g;
        if (h == 1.0f) {
            return;
        }
        this.f8563b /= h;
        C0624a c0624a = this.f8565d;
        int i = c0624a.h;
        for (int i4 = 0; i != -1 && i4 < c0624a.f8554a; i4++) {
            float[] fArr = c0624a.f8560g;
            fArr[i] = fArr[i] / h;
            i = c0624a.f8559f[i];
        }
    }

    public final void h(C0626c c0626c, C0630g c0630g, boolean z3) {
        if (c0630g == null || !c0630g.f8589f) {
            return;
        }
        float c4 = this.f8565d.c(c0630g);
        this.f8563b = (c0630g.f8588e * c4) + this.f8563b;
        this.f8565d.h(c0630g, z3);
        if (z3) {
            c0630g.b(this);
        }
        if (this.f8565d.d() == 0) {
            this.f8566e = true;
            c0626c.f8568a = true;
        }
    }

    public void i(C0626c c0626c, C0625b c0625b, boolean z3) {
        C0624a c0624a = this.f8565d;
        c0624a.getClass();
        float c4 = c0624a.c(c0625b.f8562a);
        c0624a.h(c0625b.f8562a, z3);
        C0624a c0624a2 = c0625b.f8565d;
        int d4 = c0624a2.d();
        for (int i = 0; i < d4; i++) {
            C0630g e4 = c0624a2.e(i);
            c0624a.a(e4, c0624a2.c(e4) * c4, z3);
        }
        this.f8563b = (c0625b.f8563b * c4) + this.f8563b;
        if (z3) {
            c0625b.f8562a.b(this);
        }
        if (this.f8562a == null || this.f8565d.d() != 0) {
            return;
        }
        this.f8566e = true;
        c0626c.f8568a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            u.g r0 = r10.f8562a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            u.g r1 = r10.f8562a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = C.w.n(r0, r1)
            float r1 = r10.f8563b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = u.AbstractC0629f.a(r0)
            float r1 = r10.f8563b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            u.a r5 = r10.f8565d
            int r5 = r5.d()
        L3c:
            if (r4 >= r5) goto L9c
            u.a r6 = r10.f8565d
            u.g r6 = r6.e(r4)
            if (r6 != 0) goto L47
            goto L99
        L47:
            u.a r7 = r10.f8565d
            float r7 = r7.f(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = C.w.n(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = C.w.n(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = C.w.n(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = C.w.n(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r3
        L99:
            int r4 = r4 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La5
            java.lang.String r10 = "0.0"
            java.lang.String r10 = C.w.n(r0, r10)
            return r10
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C0625b.toString():java.lang.String");
    }
}
