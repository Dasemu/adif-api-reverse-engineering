package w;

import C.w;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import u.AbstractC0629f;
import u.C0626c;
import x.C0654c;
import x.l;
import x.n;

/* loaded from: classes.dex */
public class d {

    /* renamed from: A, reason: collision with root package name */
    public int f8663A;

    /* renamed from: B, reason: collision with root package name */
    public float f8664B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f8665C;

    /* renamed from: D, reason: collision with root package name */
    public float f8666D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f8667E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f8668F;

    /* renamed from: G, reason: collision with root package name */
    public int f8669G;

    /* renamed from: H, reason: collision with root package name */
    public int f8670H;

    /* renamed from: I, reason: collision with root package name */
    public final c f8671I;
    public final c J;

    /* renamed from: K, reason: collision with root package name */
    public final c f8672K;

    /* renamed from: L, reason: collision with root package name */
    public final c f8673L;

    /* renamed from: M, reason: collision with root package name */
    public final c f8674M;

    /* renamed from: N, reason: collision with root package name */
    public final c f8675N;

    /* renamed from: O, reason: collision with root package name */
    public final c f8676O;

    /* renamed from: P, reason: collision with root package name */
    public final c f8677P;

    /* renamed from: Q, reason: collision with root package name */
    public final c[] f8678Q;

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f8679R;

    /* renamed from: S, reason: collision with root package name */
    public final boolean[] f8680S;

    /* renamed from: T, reason: collision with root package name */
    public d f8681T;

    /* renamed from: U, reason: collision with root package name */
    public int f8682U;

    /* renamed from: V, reason: collision with root package name */
    public int f8683V;

    /* renamed from: W, reason: collision with root package name */
    public float f8684W;

    /* renamed from: X, reason: collision with root package name */
    public int f8685X;

    /* renamed from: Y, reason: collision with root package name */
    public int f8686Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f8688a0;

    /* renamed from: b, reason: collision with root package name */
    public C0654c f8689b;

    /* renamed from: b0, reason: collision with root package name */
    public int f8690b0;

    /* renamed from: c, reason: collision with root package name */
    public C0654c f8691c;

    /* renamed from: c0, reason: collision with root package name */
    public int f8692c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f8694d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f8696e0;

    /* renamed from: f0, reason: collision with root package name */
    public View f8698f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f8700g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f8701h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f8702i0;

    /* renamed from: j, reason: collision with root package name */
    public String f8703j;

    /* renamed from: j0, reason: collision with root package name */
    public int f8704j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8705k;

    /* renamed from: k0, reason: collision with root package name */
    public final float[] f8706k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8707l;

    /* renamed from: l0, reason: collision with root package name */
    public final d[] f8708l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8709m;

    /* renamed from: m0, reason: collision with root package name */
    public final d[] f8710m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8711n;

    /* renamed from: n0, reason: collision with root package name */
    public int f8712n0;

    /* renamed from: o, reason: collision with root package name */
    public int f8713o;

    /* renamed from: o0, reason: collision with root package name */
    public int f8714o0;
    public int p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f8715p0;

    /* renamed from: q, reason: collision with root package name */
    public int f8716q;

    /* renamed from: r, reason: collision with root package name */
    public int f8717r;

    /* renamed from: s, reason: collision with root package name */
    public int f8718s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f8719t;

    /* renamed from: u, reason: collision with root package name */
    public int f8720u;

    /* renamed from: v, reason: collision with root package name */
    public int f8721v;

    /* renamed from: w, reason: collision with root package name */
    public float f8722w;

    /* renamed from: x, reason: collision with root package name */
    public int f8723x;

    /* renamed from: y, reason: collision with root package name */
    public int f8724y;

    /* renamed from: z, reason: collision with root package name */
    public float f8725z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8687a = false;

    /* renamed from: d, reason: collision with root package name */
    public x.j f8693d = null;

    /* renamed from: e, reason: collision with root package name */
    public l f8695e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f8697f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f8699g = true;
    public int h = -1;
    public int i = -1;

    public d() {
        new HashMap();
        this.f8705k = false;
        this.f8707l = false;
        this.f8709m = false;
        this.f8711n = false;
        this.f8713o = -1;
        this.p = -1;
        this.f8716q = 0;
        this.f8717r = 0;
        this.f8718s = 0;
        this.f8719t = new int[2];
        this.f8720u = 0;
        this.f8721v = 0;
        this.f8722w = 1.0f;
        this.f8723x = 0;
        this.f8724y = 0;
        this.f8725z = 1.0f;
        this.f8663A = -1;
        this.f8664B = 1.0f;
        this.f8665C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f8666D = BitmapDescriptorFactory.HUE_RED;
        this.f8667E = false;
        this.f8668F = false;
        this.f8669G = 0;
        this.f8670H = 0;
        c cVar = new c(this, 2);
        this.f8671I = cVar;
        c cVar2 = new c(this, 3);
        this.J = cVar2;
        c cVar3 = new c(this, 4);
        this.f8672K = cVar3;
        c cVar4 = new c(this, 5);
        this.f8673L = cVar4;
        c cVar5 = new c(this, 6);
        this.f8674M = cVar5;
        c cVar6 = new c(this, 8);
        this.f8675N = cVar6;
        c cVar7 = new c(this, 9);
        this.f8676O = cVar7;
        c cVar8 = new c(this, 7);
        this.f8677P = cVar8;
        this.f8678Q = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.f8679R = arrayList;
        this.f8680S = new boolean[2];
        this.f8715p0 = new int[]{1, 1};
        this.f8681T = null;
        this.f8682U = 0;
        this.f8683V = 0;
        this.f8684W = BitmapDescriptorFactory.HUE_RED;
        this.f8685X = -1;
        this.f8686Y = 0;
        this.Z = 0;
        this.f8688a0 = 0;
        this.f8694d0 = 0.5f;
        this.f8696e0 = 0.5f;
        this.f8700g0 = 0;
        this.f8701h0 = null;
        this.f8702i0 = 0;
        this.f8704j0 = 0;
        this.f8706k0 = new float[]{-1.0f, -1.0f};
        this.f8708l0 = new d[]{null, null};
        this.f8710m0 = new d[]{null, null};
        this.f8712n0 = -1;
        this.f8714o0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void G(StringBuilder sb, int i, int i4, String str) {
        if (i == i4) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f2, float f4) {
        if (f2 == f4) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f2);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i, int i4, int i5, int i6, int i7, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        G(sb, i, 0, "      size");
        G(sb, i4, 0, "      min");
        G(sb, i5, Integer.MAX_VALUE, "      max");
        G(sb, i6, 0, "      matchMin");
        G(sb, i7, 0, "      matchDef");
        H(sb, "      matchPercent", f2, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, c cVar) {
        if (cVar.f8661f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(cVar.f8661f);
        sb.append("'");
        if (cVar.h != Integer.MIN_VALUE || cVar.f8662g != 0) {
            sb.append(",");
            sb.append(cVar.f8662g);
            if (cVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(cVar.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (this.f8705k) {
            return true;
        }
        return this.f8671I.f8658c && this.f8672K.f8658c;
    }

    public boolean B() {
        if (this.f8707l) {
            return true;
        }
        return this.J.f8658c && this.f8673L.f8658c;
    }

    public void C() {
        this.f8671I.j();
        this.J.j();
        this.f8672K.j();
        this.f8673L.j();
        this.f8674M.j();
        this.f8675N.j();
        this.f8676O.j();
        this.f8677P.j();
        this.f8681T = null;
        this.f8666D = BitmapDescriptorFactory.HUE_RED;
        this.f8682U = 0;
        this.f8683V = 0;
        this.f8684W = BitmapDescriptorFactory.HUE_RED;
        this.f8685X = -1;
        this.f8686Y = 0;
        this.Z = 0;
        this.f8688a0 = 0;
        this.f8690b0 = 0;
        this.f8692c0 = 0;
        this.f8694d0 = 0.5f;
        this.f8696e0 = 0.5f;
        int[] iArr = this.f8715p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f8698f0 = null;
        this.f8700g0 = 0;
        this.f8702i0 = 0;
        this.f8704j0 = 0;
        float[] fArr = this.f8706k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f8713o = -1;
        this.p = -1;
        int[] iArr2 = this.f8665C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f8717r = 0;
        this.f8718s = 0;
        this.f8722w = 1.0f;
        this.f8725z = 1.0f;
        this.f8721v = Integer.MAX_VALUE;
        this.f8724y = Integer.MAX_VALUE;
        this.f8720u = 0;
        this.f8723x = 0;
        this.f8663A = -1;
        this.f8664B = 1.0f;
        boolean[] zArr = this.f8697f;
        zArr[0] = true;
        zArr[1] = true;
        this.f8668F = false;
        boolean[] zArr2 = this.f8680S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f8699g = true;
        int[] iArr3 = this.f8719t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void D() {
        d dVar = this.f8681T;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.f8679R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((c) arrayList.get(i)).j();
        }
    }

    public final void E() {
        this.f8705k = false;
        this.f8707l = false;
        this.f8709m = false;
        this.f8711n = false;
        ArrayList arrayList = this.f8679R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c cVar = (c) arrayList.get(i);
            cVar.f8658c = false;
            cVar.f8657b = 0;
        }
    }

    public void F(R0.h hVar) {
        this.f8671I.k();
        this.J.k();
        this.f8672K.k();
        this.f8673L.k();
        this.f8674M.k();
        this.f8677P.k();
        this.f8675N.k();
        this.f8676O.k();
    }

    public final void I(int i) {
        this.f8688a0 = i;
        this.f8667E = i > 0;
    }

    public final void J(int i, int i4) {
        if (this.f8705k) {
            return;
        }
        this.f8671I.l(i);
        this.f8672K.l(i4);
        this.f8686Y = i;
        this.f8682U = i4 - i;
        this.f8705k = true;
    }

    public final void K(int i, int i4) {
        if (this.f8707l) {
            return;
        }
        this.J.l(i);
        this.f8673L.l(i4);
        this.Z = i;
        this.f8683V = i4 - i;
        if (this.f8667E) {
            this.f8674M.l(i + this.f8688a0);
        }
        this.f8707l = true;
    }

    public final void L(int i) {
        this.f8683V = i;
        int i4 = this.f8692c0;
        if (i < i4) {
            this.f8683V = i4;
        }
    }

    public final void M(int i) {
        this.f8715p0[0] = i;
    }

    public final void N(int i) {
        this.f8715p0[1] = i;
    }

    public final void O(int i) {
        this.f8682U = i;
        int i4 = this.f8690b0;
        if (i < i4) {
            this.f8682U = i4;
        }
    }

    public void P(boolean z3, boolean z4) {
        int i;
        int i4;
        x.j jVar = this.f8693d;
        boolean z5 = z3 & jVar.f8850g;
        l lVar = this.f8695e;
        boolean z6 = z4 & lVar.f8850g;
        int i5 = jVar.h.f8827g;
        int i6 = lVar.h.f8827g;
        int i7 = jVar.i.f8827g;
        int i8 = lVar.i.f8827g;
        int i9 = i8 - i6;
        if (i7 - i5 < 0 || i9 < 0 || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE || i8 == Integer.MIN_VALUE || i8 == Integer.MAX_VALUE) {
            i7 = 0;
            i8 = 0;
            i5 = 0;
            i6 = 0;
        }
        int i10 = i7 - i5;
        int i11 = i8 - i6;
        if (z5) {
            this.f8686Y = i5;
        }
        if (z6) {
            this.Z = i6;
        }
        if (this.f8700g0 == 8) {
            this.f8682U = 0;
            this.f8683V = 0;
            return;
        }
        int[] iArr = this.f8715p0;
        if (z5) {
            if (iArr[0] == 1 && i10 < (i4 = this.f8682U)) {
                i10 = i4;
            }
            this.f8682U = i10;
            int i12 = this.f8690b0;
            if (i10 < i12) {
                this.f8682U = i12;
            }
        }
        if (z6) {
            if (iArr[1] == 1 && i11 < (i = this.f8683V)) {
                i11 = i;
            }
            this.f8683V = i11;
            int i13 = this.f8692c0;
            if (i11 < i13) {
                this.f8683V = i13;
            }
        }
    }

    public void Q(C0626c c0626c, boolean z3) {
        int i;
        int i4;
        l lVar;
        x.j jVar;
        c cVar = this.f8671I;
        c0626c.getClass();
        int n4 = C0626c.n(cVar);
        int n5 = C0626c.n(this.J);
        int n6 = C0626c.n(this.f8672K);
        int n7 = C0626c.n(this.f8673L);
        if (z3 && (jVar = this.f8693d) != null) {
            x.e eVar = jVar.h;
            if (eVar.f8828j) {
                x.e eVar2 = jVar.i;
                if (eVar2.f8828j) {
                    n4 = eVar.f8827g;
                    n6 = eVar2.f8827g;
                }
            }
        }
        if (z3 && (lVar = this.f8695e) != null) {
            x.e eVar3 = lVar.h;
            if (eVar3.f8828j) {
                x.e eVar4 = lVar.i;
                if (eVar4.f8828j) {
                    n5 = eVar3.f8827g;
                    n7 = eVar4.f8827g;
                }
            }
        }
        int i5 = n7 - n5;
        if (n6 - n4 < 0 || i5 < 0 || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE || n5 == Integer.MIN_VALUE || n5 == Integer.MAX_VALUE || n6 == Integer.MIN_VALUE || n6 == Integer.MAX_VALUE || n7 == Integer.MIN_VALUE || n7 == Integer.MAX_VALUE) {
            n4 = 0;
            n5 = 0;
            n6 = 0;
            n7 = 0;
        }
        int i6 = n6 - n4;
        int i7 = n7 - n5;
        this.f8686Y = n4;
        this.Z = n5;
        if (this.f8700g0 == 8) {
            this.f8682U = 0;
            this.f8683V = 0;
            return;
        }
        int[] iArr = this.f8715p0;
        int i8 = iArr[0];
        if (i8 == 1 && i6 < (i4 = this.f8682U)) {
            i6 = i4;
        }
        if (iArr[1] == 1 && i7 < (i = this.f8683V)) {
            i7 = i;
        }
        this.f8682U = i6;
        this.f8683V = i7;
        int i9 = this.f8692c0;
        if (i7 < i9) {
            this.f8683V = i9;
        }
        int i10 = this.f8690b0;
        if (i6 < i10) {
            this.f8682U = i10;
        }
        int i11 = this.f8721v;
        if (i11 > 0 && i8 == 3) {
            this.f8682U = Math.min(this.f8682U, i11);
        }
        int i12 = this.f8724y;
        if (i12 > 0 && iArr[1] == 3) {
            this.f8683V = Math.min(this.f8683V, i12);
        }
        int i13 = this.f8682U;
        if (i6 != i13) {
            this.h = i13;
        }
        int i14 = this.f8683V;
        if (i7 != i14) {
            this.i = i14;
        }
    }

    public final void a(e eVar, C0626c c0626c, HashSet hashSet, int i, boolean z3) {
        if (z3) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.b(eVar, c0626c, this);
            hashSet.remove(this);
            b(c0626c, eVar.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.f8671I.f8656a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f8659d.a(eVar, c0626c, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.f8672K.f8656a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).f8659d.a(eVar, c0626c, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.f8656a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).f8659d.a(eVar, c0626c, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.f8673L.f8656a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).f8659d.a(eVar, c0626c, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.f8674M.f8656a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).f8659d.a(eVar, c0626c, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r13 != 3) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b7  */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [int] */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r13v48, types: [w.e] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r59v0, types: [w.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(u.C0626c r60, boolean r61) {
        /*
            Method dump skipped, instructions count: 1922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.d.b(u.c, boolean):void");
    }

    public boolean c() {
        return this.f8700g0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x043f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(u.C0626c r30, boolean r31, boolean r32, boolean r33, boolean r34, u.C0630g r35, u.C0630g r36, int r37, boolean r38, w.c r39, w.c r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.d.d(u.c, boolean, boolean, boolean, boolean, u.g, u.g, int, boolean, w.c, w.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(int i, d dVar, int i4, int i5) {
        boolean z3;
        if (i == 7) {
            if (i4 != 7) {
                if (i4 == 2 || i4 == 4) {
                    e(2, dVar, i4, 0);
                    e(4, dVar, i4, 0);
                    i(7).a(dVar.i(i4), 0);
                    return;
                } else {
                    if (i4 == 3 || i4 == 5) {
                        e(3, dVar, i4, 0);
                        e(5, dVar, i4, 0);
                        i(7).a(dVar.i(i4), 0);
                        return;
                    }
                    return;
                }
            }
            c i6 = i(2);
            c i7 = i(4);
            c i8 = i(3);
            c i9 = i(5);
            boolean z4 = true;
            if ((i6 == null || !i6.h()) && (i7 == null || !i7.h())) {
                e(2, dVar, 2, 0);
                e(4, dVar, 4, 0);
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i8 == null || !i8.h()) && (i9 == null || !i9.h())) {
                e(3, dVar, 3, 0);
                e(5, dVar, 5, 0);
            } else {
                z4 = false;
            }
            if (z3 && z4) {
                i(7).a(dVar.i(7), 0);
                return;
            } else if (z3) {
                i(8).a(dVar.i(8), 0);
                return;
            } else {
                if (z4) {
                    i(9).a(dVar.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i4 == 2 || i4 == 4)) {
            c i10 = i(2);
            c i11 = dVar.i(i4);
            c i12 = i(4);
            i10.a(i11, 0);
            i12.a(i11, 0);
            i(8).a(i11, 0);
            return;
        }
        if (i == 9 && (i4 == 3 || i4 == 5)) {
            c i13 = dVar.i(i4);
            i(3).a(i13, 0);
            i(5).a(i13, 0);
            i(9).a(i13, 0);
            return;
        }
        if (i == 8 && i4 == 8) {
            i(2).a(dVar.i(2), 0);
            i(4).a(dVar.i(4), 0);
            i(8).a(dVar.i(i4), 0);
            return;
        }
        if (i == 9 && i4 == 9) {
            i(3).a(dVar.i(3), 0);
            i(5).a(dVar.i(5), 0);
            i(9).a(dVar.i(i4), 0);
            return;
        }
        c i14 = i(i);
        c i15 = dVar.i(i4);
        if (i14.i(i15)) {
            if (i == 6) {
                c i16 = i(3);
                c i17 = i(5);
                if (i16 != null) {
                    i16.j();
                }
                if (i17 != null) {
                    i17.j();
                }
            } else if (i == 3 || i == 5) {
                c i18 = i(6);
                if (i18 != null) {
                    i18.j();
                }
                c i19 = i(7);
                if (i19.f8661f != i15) {
                    i19.j();
                }
                c f2 = i(i).f();
                c i20 = i(9);
                if (i20.h()) {
                    f2.j();
                    i20.j();
                }
            } else if (i == 2 || i == 4) {
                c i21 = i(7);
                if (i21.f8661f != i15) {
                    i21.j();
                }
                c f4 = i(i).f();
                c i22 = i(8);
                if (i22.h()) {
                    f4.j();
                    i22.j();
                }
            }
            i14.a(i15, i5);
        }
    }

    public final void f(c cVar, c cVar2, int i) {
        if (cVar.f8659d == this) {
            e(cVar.f8660e, cVar2.f8659d, cVar2.f8660e, i);
        }
    }

    public final void g(C0626c c0626c) {
        c0626c.k(this.f8671I);
        c0626c.k(this.J);
        c0626c.k(this.f8672K);
        c0626c.k(this.f8673L);
        if (this.f8688a0 > 0) {
            c0626c.k(this.f8674M);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [x.l, x.n] */
    /* JADX WARN: Type inference failed for: r0v3, types: [x.j, x.n] */
    public final void h() {
        if (this.f8693d == null) {
            ?? nVar = new n(this);
            nVar.h.f8825e = 4;
            nVar.i.f8825e = 5;
            nVar.f8849f = 0;
            this.f8693d = nVar;
        }
        if (this.f8695e == null) {
            ?? nVar2 = new n(this);
            x.e eVar = new x.e(nVar2);
            nVar2.f8836k = eVar;
            nVar2.f8837l = null;
            nVar2.h.f8825e = 6;
            nVar2.i.f8825e = 7;
            eVar.f8825e = 8;
            nVar2.f8849f = 1;
            this.f8695e = nVar2;
        }
    }

    public c i(int i) {
        switch (AbstractC0629f.b(i)) {
            case 0:
                return null;
            case 1:
                return this.f8671I;
            case 2:
                return this.J;
            case 3:
                return this.f8672K;
            case 4:
                return this.f8673L;
            case 5:
                return this.f8674M;
            case 6:
                return this.f8677P;
            case 7:
                return this.f8675N;
            case 8:
                return this.f8676O;
            default:
                throw new AssertionError(com.google.android.gms.measurement.internal.a.A(i));
        }
    }

    public final int j(int i) {
        int[] iArr = this.f8715p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f8700g0 == 8) {
            return 0;
        }
        return this.f8683V;
    }

    public final d l(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.f8673L).f8661f) != null && cVar2.f8661f == cVar) {
                return cVar2.f8659d;
            }
            return null;
        }
        c cVar3 = this.f8672K;
        c cVar4 = cVar3.f8661f;
        if (cVar4 == null || cVar4.f8661f != cVar3) {
            return null;
        }
        return cVar4.f8659d;
    }

    public final d m(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.J).f8661f) != null && cVar2.f8661f == cVar) {
                return cVar2.f8659d;
            }
            return null;
        }
        c cVar3 = this.f8671I;
        c cVar4 = cVar3.f8661f;
        if (cVar4 == null || cVar4.f8661f != cVar3) {
            return null;
        }
        return cVar4.f8659d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.f8703j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.f8682U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f8683V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f8686Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.Z);
        sb.append("\n");
        p(sb, "left", this.f8671I);
        p(sb, "top", this.J);
        p(sb, "right", this.f8672K);
        p(sb, "bottom", this.f8673L);
        p(sb, "baseline", this.f8674M);
        p(sb, "centerX", this.f8675N);
        p(sb, "centerY", this.f8676O);
        int i = this.f8682U;
        int i4 = this.f8690b0;
        int[] iArr = this.f8665C;
        int i5 = iArr[0];
        int i6 = this.f8720u;
        int i7 = this.f8717r;
        float f2 = this.f8722w;
        float[] fArr = this.f8706k0;
        float f4 = fArr[0];
        o(sb, "    width", i, i4, i5, i6, i7, f2);
        int i8 = this.f8683V;
        int i9 = this.f8692c0;
        int i10 = iArr[1];
        int i11 = this.f8723x;
        int i12 = this.f8718s;
        float f5 = this.f8725z;
        float f6 = fArr[1];
        o(sb, "    height", i8, i9, i10, i11, i12, f5);
        float f7 = this.f8684W;
        int i13 = this.f8685X;
        if (f7 != BitmapDescriptorFactory.HUE_RED) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f7);
            sb.append(",");
            sb.append(i13);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.f8694d0, 0.5f);
        H(sb, "    verticalBias", this.f8696e0, 0.5f);
        G(sb, this.f8702i0, 0, "    horizontalChainStyle");
        G(sb, this.f8704j0, 0, "    verticalChainStyle");
        sb.append("  }");
    }

    public final int q() {
        if (this.f8700g0 == 8) {
            return 0;
        }
        return this.f8682U;
    }

    public final int r() {
        d dVar = this.f8681T;
        return (dVar == null || !(dVar instanceof e)) ? this.f8686Y : ((e) dVar).f8743x0 + this.f8686Y;
    }

    public final int s() {
        d dVar = this.f8681T;
        return (dVar == null || !(dVar instanceof e)) ? this.Z : ((e) dVar).f8744y0 + this.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(int r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L1b
            w.c r5 = r4.f8671I
            w.c r5 = r5.f8661f
            if (r5 == 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            w.c r4 = r4.f8672K
            w.c r4 = r4.f8661f
            if (r4 == 0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = r1
        L17:
            int r5 = r5 + r4
            if (r5 >= r0) goto L3b
            goto L3a
        L1b:
            w.c r5 = r4.J
            w.c r5 = r5.f8661f
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            w.c r3 = r4.f8673L
            w.c r3 = r3.f8661f
            if (r3 == 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            int r5 = r5 + r3
            w.c r4 = r4.f8674M
            w.c r4 = r4.f8661f
            if (r4 == 0) goto L36
            r4 = r2
            goto L37
        L36:
            r4 = r1
        L37:
            int r5 = r5 + r4
            if (r5 >= r0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w.d.t(int):boolean");
    }

    public String toString() {
        StringBuilder a2 = AbstractC0629f.a("");
        a2.append(this.f8701h0 != null ? w.r(new StringBuilder("id: "), this.f8701h0, " ") : "");
        a2.append("(");
        a2.append(this.f8686Y);
        a2.append(", ");
        a2.append(this.Z);
        a2.append(") - (");
        a2.append(this.f8682U);
        a2.append(" x ");
        return com.google.android.gms.measurement.internal.a.m(a2, this.f8683V, ")");
    }

    public final boolean u(int i, int i4) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i == 0) {
            c cVar5 = this.f8671I;
            c cVar6 = cVar5.f8661f;
            if (cVar6 == null || !cVar6.f8658c || (cVar4 = (cVar3 = this.f8672K).f8661f) == null || !cVar4.f8658c) {
                return false;
            }
            return (cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f8661f.d()) >= i4;
        }
        c cVar7 = this.J;
        c cVar8 = cVar7.f8661f;
        if (cVar8 == null || !cVar8.f8658c || (cVar2 = (cVar = this.f8673L).f8661f) == null || !cVar2.f8658c) {
            return false;
        }
        return (cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f8661f.d()) >= i4;
    }

    public final void v(int i, int i4, int i5, int i6, d dVar) {
        i(i).b(dVar.i(i4), i5, i6, true);
    }

    public final boolean w(int i) {
        c cVar;
        c cVar2;
        int i4 = i * 2;
        c[] cVarArr = this.f8678Q;
        c cVar3 = cVarArr[i4];
        c cVar4 = cVar3.f8661f;
        return (cVar4 == null || cVar4.f8661f == cVar3 || (cVar2 = (cVar = cVarArr[i4 + 1]).f8661f) == null || cVar2.f8661f != cVar) ? false : true;
    }

    public final boolean x() {
        c cVar = this.f8671I;
        c cVar2 = cVar.f8661f;
        if (cVar2 != null && cVar2.f8661f == cVar) {
            return true;
        }
        c cVar3 = this.f8672K;
        c cVar4 = cVar3.f8661f;
        return cVar4 != null && cVar4.f8661f == cVar3;
    }

    public final boolean y() {
        c cVar = this.J;
        c cVar2 = cVar.f8661f;
        if (cVar2 != null && cVar2.f8661f == cVar) {
            return true;
        }
        c cVar3 = this.f8673L;
        c cVar4 = cVar3.f8661f;
        return cVar4 != null && cVar4.f8661f == cVar3;
    }

    public final boolean z() {
        return this.f8699g && this.f8700g0 != 8;
    }
}
