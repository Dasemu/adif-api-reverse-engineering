package x;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0653b f8832a = new Object();

    public static boolean a(w.d dVar) {
        int[] iArr = dVar.f8715p0;
        int i = iArr[0];
        int i4 = iArr[1];
        w.d dVar2 = dVar.f8681T;
        w.e eVar = dVar2 != null ? (w.e) dVar2 : null;
        if (eVar != null) {
            int i5 = eVar.f8715p0[0];
        }
        if (eVar != null) {
            int i6 = eVar.f8715p0[1];
        }
        boolean z3 = i == 1 || dVar.A() || i == 2 || (i == 3 && dVar.f8717r == 0 && dVar.f8684W == BitmapDescriptorFactory.HUE_RED && dVar.t(0)) || (i == 3 && dVar.f8717r == 1 && dVar.u(0, dVar.q()));
        boolean z4 = i4 == 1 || dVar.B() || i4 == 2 || (i4 == 3 && dVar.f8718s == 0 && dVar.f8684W == BitmapDescriptorFactory.HUE_RED && dVar.t(1)) || (i4 == 3 && dVar.f8718s == 1 && dVar.u(1, dVar.k()));
        return (dVar.f8684W > BitmapDescriptorFactory.HUE_RED && (z3 || z4)) || (z3 && z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [x.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [x.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    public static m b(w.d dVar, int i, ArrayList arrayList, m mVar) {
        int i4;
        int i5 = i == 0 ? dVar.f8712n0 : dVar.f8714o0;
        if (i5 != -1 && (mVar == 0 || i5 != mVar.f8840b)) {
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                }
                m mVar2 = (m) arrayList.get(i6);
                if (mVar2.f8840b == i5) {
                    if (mVar != 0) {
                        mVar.c(i, mVar2);
                        arrayList.remove((Object) mVar);
                    }
                    mVar = mVar2;
                } else {
                    i6++;
                }
            }
        } else if (i5 != -1) {
            return mVar;
        }
        m mVar3 = mVar;
        if (mVar == 0) {
            if (dVar instanceof w.i) {
                w.i iVar = (w.i) dVar;
                int i7 = 0;
                while (true) {
                    if (i7 >= iVar.f8801r0) {
                        i4 = -1;
                        break;
                    }
                    w.d dVar2 = iVar.f8800q0[i7];
                    if ((i == 0 && (i4 = dVar2.f8712n0) != -1) || (i == 1 && (i4 = dVar2.f8714o0) != -1)) {
                        break;
                    }
                    i7++;
                }
                if (i4 != -1) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= arrayList.size()) {
                            break;
                        }
                        m mVar4 = (m) arrayList.get(i8);
                        if (mVar4.f8840b == i4) {
                            mVar = mVar4;
                            break;
                        }
                        i8++;
                    }
                }
            }
            if (mVar == 0) {
                mVar = new Object();
                mVar.f8839a = new ArrayList();
                mVar.f8842d = null;
                mVar.f8843e = -1;
                int i9 = m.f8838f;
                m.f8838f = i9 + 1;
                mVar.f8840b = i9;
                mVar.f8841c = i;
            }
            arrayList.add(mVar);
            mVar3 = mVar;
        }
        ArrayList arrayList2 = mVar3.f8839a;
        if (arrayList2.contains(dVar)) {
            return mVar3;
        }
        arrayList2.add(dVar);
        if (dVar instanceof w.h) {
            w.h hVar = (w.h) dVar;
            hVar.f8797t0.c(hVar.f8798u0 == 0 ? 1 : 0, arrayList, mVar3);
        }
        int i10 = mVar3.f8840b;
        if (i == 0) {
            dVar.f8712n0 = i10;
            dVar.f8671I.c(i, arrayList, mVar3);
            dVar.f8672K.c(i, arrayList, mVar3);
        } else {
            dVar.f8714o0 = i10;
            dVar.J.c(i, arrayList, mVar3);
            dVar.f8674M.c(i, arrayList, mVar3);
            dVar.f8673L.c(i, arrayList, mVar3);
        }
        dVar.f8677P.c(i, arrayList, mVar3);
        return mVar3;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, x.b] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, x.b] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, x.b] */
    public static void c(int i, androidx.constraintlayout.widget.f fVar, w.d dVar, boolean z3) {
        w.c cVar;
        w.c cVar2;
        char c4;
        w.c cVar3;
        w.c cVar4;
        if (dVar.f8709m) {
            return;
        }
        if (!(dVar instanceof w.e) && dVar.z() && a(dVar)) {
            w.e.V(dVar, fVar, new Object());
        }
        w.c i4 = dVar.i(2);
        w.c i5 = dVar.i(4);
        int d4 = i4.d();
        int d5 = i5.d();
        HashSet hashSet = i4.f8656a;
        if (hashSet != null && i4.f8658c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                w.c cVar5 = (w.c) it.next();
                w.d dVar2 = cVar5.f8659d;
                int i6 = i + 1;
                boolean a2 = a(dVar2);
                if (dVar2.z() && a2) {
                    c4 = 0;
                    w.e.V(dVar2, fVar, new Object());
                } else {
                    c4 = 0;
                }
                w.c cVar6 = dVar2.f8671I;
                w.c cVar7 = dVar2.f8672K;
                char c5 = ((cVar5 == cVar6 && (cVar4 = cVar7.f8661f) != null && cVar4.f8658c) || (cVar5 == cVar7 && (cVar3 = cVar6.f8661f) != null && cVar3.f8658c)) ? (char) 1 : c4;
                int i7 = dVar2.f8715p0[c4];
                if (i7 != 3 || a2) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f8661f == null) {
                            int e4 = cVar6.e() + d4;
                            dVar2.J(e4, dVar2.q() + e4);
                            c(i6, fVar, dVar2, z3);
                        } else if (cVar5 == cVar7 && cVar6.f8661f == null) {
                            int e5 = d4 - cVar7.e();
                            dVar2.J(e5 - dVar2.q(), e5);
                            c(i6, fVar, dVar2, z3);
                        } else if (c5 != 0 && !dVar2.x()) {
                            d(i6, fVar, dVar2, z3);
                        }
                    }
                } else if (i7 == 3 && dVar2.f8721v >= 0 && dVar2.f8720u >= 0 && (dVar2.f8700g0 == 8 || (dVar2.f8717r == 0 && dVar2.f8684W == BitmapDescriptorFactory.HUE_RED))) {
                    if (!dVar2.x() && !dVar2.f8668F && c5 != 0 && !dVar2.x()) {
                        e(i6, dVar, fVar, dVar2, z3);
                    }
                }
            }
        }
        if (dVar instanceof w.h) {
            return;
        }
        HashSet hashSet2 = i5.f8656a;
        if (hashSet2 != null && i5.f8658c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                w.c cVar8 = (w.c) it2.next();
                w.d dVar3 = cVar8.f8659d;
                int i8 = i + 1;
                boolean a4 = a(dVar3);
                if (dVar3.z() && a4) {
                    w.e.V(dVar3, fVar, new Object());
                }
                w.c cVar9 = dVar3.f8671I;
                w.c cVar10 = dVar3.f8672K;
                boolean z4 = (cVar8 == cVar9 && (cVar2 = cVar10.f8661f) != null && cVar2.f8658c) || (cVar8 == cVar10 && (cVar = cVar9.f8661f) != null && cVar.f8658c);
                int i9 = dVar3.f8715p0[0];
                if (i9 != 3 || a4) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f8661f == null) {
                            int e6 = cVar9.e() + d5;
                            dVar3.J(e6, dVar3.q() + e6);
                            c(i8, fVar, dVar3, z3);
                        } else if (cVar8 == cVar10 && cVar9.f8661f == null) {
                            int e7 = d5 - cVar10.e();
                            dVar3.J(e7 - dVar3.q(), e7);
                            c(i8, fVar, dVar3, z3);
                        } else if (z4 && !dVar3.x()) {
                            d(i8, fVar, dVar3, z3);
                        }
                    }
                } else if (i9 == 3 && dVar3.f8721v >= 0 && dVar3.f8720u >= 0) {
                    if (dVar3.f8700g0 == 8 || (dVar3.f8717r == 0 && dVar3.f8684W == BitmapDescriptorFactory.HUE_RED)) {
                        if (!dVar3.x() && !dVar3.f8668F && z4 && !dVar3.x()) {
                            e(i8, dVar, fVar, dVar3, z3);
                        }
                    }
                }
            }
        }
        dVar.f8709m = true;
    }

    public static void d(int i, androidx.constraintlayout.widget.f fVar, w.d dVar, boolean z3) {
        float f2 = dVar.f8694d0;
        w.c cVar = dVar.f8671I;
        int d4 = cVar.f8661f.d();
        w.c cVar2 = dVar.f8672K;
        int d5 = cVar2.f8661f.d();
        int e4 = cVar.e() + d4;
        int e5 = d5 - cVar2.e();
        if (d4 == d5) {
            f2 = 0.5f;
        } else {
            d4 = e4;
            d5 = e5;
        }
        int q4 = dVar.q();
        int i4 = (d5 - d4) - q4;
        if (d4 > d5) {
            i4 = (d4 - d5) - q4;
        }
        int i5 = ((int) (i4 > 0 ? (f2 * i4) + 0.5f : f2 * i4)) + d4;
        int i6 = i5 + q4;
        if (d4 > d5) {
            i6 = i5 - q4;
        }
        dVar.J(i5, i6);
        c(i + 1, fVar, dVar, z3);
    }

    public static void e(int i, w.d dVar, androidx.constraintlayout.widget.f fVar, w.d dVar2, boolean z3) {
        float f2 = dVar2.f8694d0;
        w.c cVar = dVar2.f8671I;
        int e4 = cVar.e() + cVar.f8661f.d();
        w.c cVar2 = dVar2.f8672K;
        int d4 = cVar2.f8661f.d() - cVar2.e();
        if (d4 >= e4) {
            int q4 = dVar2.q();
            if (dVar2.f8700g0 != 8) {
                int i4 = dVar2.f8717r;
                if (i4 == 2) {
                    q4 = (int) (dVar2.f8694d0 * 0.5f * (dVar instanceof w.e ? dVar.q() : dVar.f8681T.q()));
                } else if (i4 == 0) {
                    q4 = d4 - e4;
                }
                q4 = Math.max(dVar2.f8720u, q4);
                int i5 = dVar2.f8721v;
                if (i5 > 0) {
                    q4 = Math.min(i5, q4);
                }
            }
            int i6 = e4 + ((int) ((f2 * ((d4 - e4) - q4)) + 0.5f));
            dVar2.J(i6, q4 + i6);
            c(i + 1, fVar, dVar2, z3);
        }
    }

    public static void f(int i, androidx.constraintlayout.widget.f fVar, w.d dVar) {
        float f2 = dVar.f8696e0;
        w.c cVar = dVar.J;
        int d4 = cVar.f8661f.d();
        w.c cVar2 = dVar.f8673L;
        int d5 = cVar2.f8661f.d();
        int e4 = cVar.e() + d4;
        int e5 = d5 - cVar2.e();
        if (d4 == d5) {
            f2 = 0.5f;
        } else {
            d4 = e4;
            d5 = e5;
        }
        int k4 = dVar.k();
        int i4 = (d5 - d4) - k4;
        if (d4 > d5) {
            i4 = (d4 - d5) - k4;
        }
        int i5 = (int) (i4 > 0 ? (f2 * i4) + 0.5f : f2 * i4);
        int i6 = d4 + i5;
        int i7 = i6 + k4;
        if (d4 > d5) {
            i6 = d4 - i5;
            i7 = i6 - k4;
        }
        dVar.K(i6, i7);
        i(i + 1, fVar, dVar);
    }

    public static void g(int i, w.d dVar, androidx.constraintlayout.widget.f fVar, w.d dVar2) {
        float f2 = dVar2.f8696e0;
        w.c cVar = dVar2.J;
        int e4 = cVar.e() + cVar.f8661f.d();
        w.c cVar2 = dVar2.f8673L;
        int d4 = cVar2.f8661f.d() - cVar2.e();
        if (d4 >= e4) {
            int k4 = dVar2.k();
            if (dVar2.f8700g0 != 8) {
                int i4 = dVar2.f8718s;
                if (i4 == 2) {
                    k4 = (int) (f2 * 0.5f * (dVar instanceof w.e ? dVar.k() : dVar.f8681T.k()));
                } else if (i4 == 0) {
                    k4 = d4 - e4;
                }
                k4 = Math.max(dVar2.f8723x, k4);
                int i5 = dVar2.f8724y;
                if (i5 > 0) {
                    k4 = Math.min(i5, k4);
                }
            }
            int i6 = e4 + ((int) ((f2 * ((d4 - e4) - k4)) + 0.5f));
            dVar2.K(i6, k4 + i6);
            i(i + 1, fVar, dVar2);
        }
    }

    public static boolean h(int i, int i4, int i5, int i6) {
        return (i5 == 1 || i5 == 2 || (i5 == 4 && i != 2)) || (i6 == 1 || i6 == 2 || (i6 == 4 && i4 != 2));
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, x.b] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, x.b] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, x.b] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, x.b] */
    public static void i(int i, androidx.constraintlayout.widget.f fVar, w.d dVar) {
        boolean z3;
        w.c cVar;
        w.c cVar2;
        w.c cVar3;
        w.c cVar4;
        if (dVar.f8711n) {
            return;
        }
        if (!(dVar instanceof w.e) && dVar.z() && a(dVar)) {
            w.e.V(dVar, fVar, new Object());
        }
        w.c i4 = dVar.i(3);
        w.c i5 = dVar.i(5);
        int d4 = i4.d();
        int d5 = i5.d();
        HashSet hashSet = i4.f8656a;
        if (hashSet != null && i4.f8658c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                w.c cVar5 = (w.c) it.next();
                w.d dVar2 = cVar5.f8659d;
                int i6 = i + 1;
                boolean a2 = a(dVar2);
                if (dVar2.z() && a2) {
                    w.e.V(dVar2, fVar, new Object());
                }
                w.c cVar6 = dVar2.J;
                w.c cVar7 = dVar2.f8673L;
                boolean z4 = (cVar5 == cVar6 && (cVar4 = cVar7.f8661f) != null && cVar4.f8658c) || (cVar5 == cVar7 && (cVar3 = cVar6.f8661f) != null && cVar3.f8658c);
                int i7 = dVar2.f8715p0[1];
                if (i7 != 3 || a2) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f8661f == null) {
                            int e4 = cVar6.e() + d4;
                            dVar2.K(e4, dVar2.k() + e4);
                            i(i6, fVar, dVar2);
                        } else if (cVar5 == cVar7 && cVar6.f8661f == null) {
                            int e5 = d4 - cVar7.e();
                            dVar2.K(e5 - dVar2.k(), e5);
                            i(i6, fVar, dVar2);
                        } else if (z4 && !dVar2.y()) {
                            f(i6, fVar, dVar2);
                        }
                    }
                } else if (i7 == 3 && dVar2.f8724y >= 0 && dVar2.f8723x >= 0 && (dVar2.f8700g0 == 8 || (dVar2.f8718s == 0 && dVar2.f8684W == BitmapDescriptorFactory.HUE_RED))) {
                    if (!dVar2.y() && !dVar2.f8668F && z4 && !dVar2.y()) {
                        g(i6, dVar, fVar, dVar2);
                    }
                }
            }
        }
        boolean z5 = true;
        z5 = true;
        z5 = true;
        if (dVar instanceof w.h) {
            return;
        }
        HashSet hashSet2 = i5.f8656a;
        if (hashSet2 != null && i5.f8658c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                w.c cVar8 = (w.c) it2.next();
                w.d dVar3 = cVar8.f8659d;
                int i8 = i + 1;
                boolean a4 = a(dVar3);
                if (dVar3.z() && a4) {
                    w.e.V(dVar3, fVar, new Object());
                }
                w.c cVar9 = dVar3.J;
                w.c cVar10 = dVar3.f8673L;
                boolean z6 = (cVar8 == cVar9 && (cVar2 = cVar10.f8661f) != null && cVar2.f8658c) || (cVar8 == cVar10 && (cVar = cVar9.f8661f) != null && cVar.f8658c);
                int i9 = dVar3.f8715p0[1];
                if (i9 != 3 || a4) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f8661f == null) {
                            int e6 = cVar9.e() + d5;
                            dVar3.K(e6, dVar3.k() + e6);
                            i(i8, fVar, dVar3);
                        } else if (cVar8 == cVar10 && cVar9.f8661f == null) {
                            int e7 = d5 - cVar10.e();
                            dVar3.K(e7 - dVar3.k(), e7);
                            i(i8, fVar, dVar3);
                        } else if (z6 && !dVar3.y()) {
                            f(i8, fVar, dVar3);
                        }
                    }
                } else if (i9 == 3 && dVar3.f8724y >= 0 && dVar3.f8723x >= 0 && (dVar3.f8700g0 == 8 || (dVar3.f8718s == 0 && dVar3.f8684W == BitmapDescriptorFactory.HUE_RED))) {
                    if (!dVar3.y() && !dVar3.f8668F && z6 && !dVar3.y()) {
                        g(i8, dVar, fVar, dVar3);
                    }
                }
            }
        }
        w.c i10 = dVar.i(6);
        if (i10.f8656a != null && i10.f8658c) {
            int d6 = i10.d();
            Iterator it3 = i10.f8656a.iterator();
            while (it3.hasNext()) {
                w.c cVar11 = (w.c) it3.next();
                w.d dVar4 = cVar11.f8659d;
                int i11 = i + 1;
                boolean a5 = a(dVar4);
                if (dVar4.z() && a5) {
                    w.e.V(dVar4, fVar, new Object());
                }
                if (dVar4.f8715p0[z5 ? 1 : 0] != 3 || a5) {
                    if (!dVar4.z()) {
                        w.c cVar12 = dVar4.f8674M;
                        if (cVar11 == cVar12) {
                            int e8 = cVar11.e() + d6;
                            if (dVar4.f8667E) {
                                int i12 = e8 - dVar4.f8688a0;
                                int i13 = dVar4.f8683V + i12;
                                dVar4.Z = i12;
                                dVar4.J.l(i12);
                                dVar4.f8673L.l(i13);
                                cVar12.l(e8);
                                z3 = z5 ? 1 : 0;
                                dVar4.f8707l = z3;
                            } else {
                                z3 = z5 ? 1 : 0;
                            }
                            i(i11, fVar, dVar4);
                            z5 = z3;
                        }
                    }
                }
                z3 = z5 ? 1 : 0;
                z5 = z3;
            }
        }
        dVar.f8711n = z5;
    }
}
