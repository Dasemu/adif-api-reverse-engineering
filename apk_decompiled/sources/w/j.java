package w;

import u.C0626c;
import u.C0630g;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f8802a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:162:0x028e, code lost:
    
        if (r8.f8659d == r6) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010c, code lost:
    
        if (r4.f8659d == r8) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0695 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06ec A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(w.e r39, u.C0626c r40, java.util.ArrayList r41, int r42) {
        /*
            Method dump skipped, instructions count: 1787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.j.a(w.e, u.c, java.util.ArrayList, int):void");
    }

    public static void b(e eVar, C0626c c0626c, d dVar) {
        dVar.f8713o = -1;
        dVar.p = -1;
        int i = eVar.f8715p0[0];
        int[] iArr = dVar.f8715p0;
        if (i != 2 && iArr[0] == 4) {
            c cVar = dVar.f8671I;
            int i4 = cVar.f8662g;
            int q4 = eVar.q();
            c cVar2 = dVar.f8672K;
            int i5 = q4 - cVar2.f8662g;
            cVar.i = c0626c.k(cVar);
            cVar2.i = c0626c.k(cVar2);
            c0626c.d(cVar.i, i4);
            c0626c.d(cVar2.i, i5);
            dVar.f8713o = 2;
            dVar.f8686Y = i4;
            int i6 = i5 - i4;
            dVar.f8682U = i6;
            int i7 = dVar.f8690b0;
            if (i6 < i7) {
                dVar.f8682U = i7;
            }
        }
        if (eVar.f8715p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        c cVar3 = dVar.J;
        int i8 = cVar3.f8662g;
        int k4 = eVar.k();
        c cVar4 = dVar.f8673L;
        int i9 = k4 - cVar4.f8662g;
        cVar3.i = c0626c.k(cVar3);
        cVar4.i = c0626c.k(cVar4);
        c0626c.d(cVar3.i, i8);
        c0626c.d(cVar4.i, i9);
        if (dVar.f8688a0 > 0 || dVar.f8700g0 == 8) {
            c cVar5 = dVar.f8674M;
            C0630g k5 = c0626c.k(cVar5);
            cVar5.i = k5;
            c0626c.d(k5, dVar.f8688a0 + i8);
        }
        dVar.p = 2;
        dVar.Z = i8;
        int i10 = i9 - i8;
        dVar.f8683V = i10;
        int i11 = dVar.f8692c0;
        if (i10 < i11) {
            dVar.f8683V = i11;
        }
    }

    public static final boolean c(int i, int i4) {
        return (i & i4) == i4;
    }
}
