package x;

import u.AbstractC0629f;

/* loaded from: classes.dex */
public abstract class n implements InterfaceC0655d {

    /* renamed from: a, reason: collision with root package name */
    public int f8844a;

    /* renamed from: b, reason: collision with root package name */
    public w.d f8845b;

    /* renamed from: c, reason: collision with root package name */
    public k f8846c;

    /* renamed from: d, reason: collision with root package name */
    public int f8847d;

    /* renamed from: e, reason: collision with root package name */
    public final f f8848e = new f(this);

    /* renamed from: f, reason: collision with root package name */
    public int f8849f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8850g = false;
    public final e h = new e(this);
    public final e i = new e(this);

    /* renamed from: j, reason: collision with root package name */
    public int f8851j = 1;

    public n(w.d dVar) {
        this.f8845b = dVar;
    }

    public static void b(e eVar, e eVar2, int i) {
        eVar.f8830l.add(eVar2);
        eVar.f8826f = i;
        eVar2.f8829k.add(eVar);
    }

    public static e h(w.c cVar) {
        w.c cVar2 = cVar.f8661f;
        if (cVar2 == null) {
            return null;
        }
        int b4 = AbstractC0629f.b(cVar2.f8660e);
        w.d dVar = cVar2.f8659d;
        if (b4 == 1) {
            return dVar.f8693d.h;
        }
        if (b4 == 2) {
            return dVar.f8695e.h;
        }
        if (b4 == 3) {
            return dVar.f8693d.i;
        }
        if (b4 == 4) {
            return dVar.f8695e.i;
        }
        if (b4 != 5) {
            return null;
        }
        return dVar.f8695e.f8836k;
    }

    public static e i(w.c cVar, int i) {
        w.c cVar2 = cVar.f8661f;
        if (cVar2 == null) {
            return null;
        }
        w.d dVar = cVar2.f8659d;
        n nVar = i == 0 ? dVar.f8693d : dVar.f8695e;
        int b4 = AbstractC0629f.b(cVar2.f8660e);
        if (b4 == 1 || b4 == 2) {
            return nVar.h;
        }
        if (b4 == 3 || b4 == 4) {
            return nVar.i;
        }
        return null;
    }

    public final void c(e eVar, e eVar2, int i, f fVar) {
        eVar.f8830l.add(eVar2);
        eVar.f8830l.add(this.f8848e);
        eVar.h = i;
        eVar.i = fVar;
        eVar2.f8829k.add(eVar);
        fVar.f8829k.add(eVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i4) {
        if (i4 == 0) {
            w.d dVar = this.f8845b;
            int i5 = dVar.f8721v;
            int max = Math.max(dVar.f8720u, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            w.d dVar2 = this.f8845b;
            int i6 = dVar2.f8724y;
            int max2 = Math.max(dVar2.f8723x, i);
            if (i6 > 0) {
                max2 = Math.min(i6, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long j() {
        if (this.f8848e.f8828j) {
            return r2.f8827g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f8844a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(w.c r12, w.c r13, int r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.n.l(w.c, w.c, int):void");
    }
}
