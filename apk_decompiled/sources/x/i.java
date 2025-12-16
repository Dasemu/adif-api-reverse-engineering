package x;

import java.util.Iterator;
import w.C0643a;

/* loaded from: classes.dex */
public final class i extends n {
    @Override // x.InterfaceC0655d
    public final void a(InterfaceC0655d interfaceC0655d) {
        C0643a c0643a = (C0643a) this.f8845b;
        int i = c0643a.f8638s0;
        e eVar = this.h;
        Iterator it = eVar.f8830l.iterator();
        int i4 = 0;
        int i5 = -1;
        while (it.hasNext()) {
            int i6 = ((e) it.next()).f8827g;
            if (i5 == -1 || i6 < i5) {
                i5 = i6;
            }
            if (i4 < i6) {
                i4 = i6;
            }
        }
        if (i == 0 || i == 2) {
            eVar.d(i5 + c0643a.f8640u0);
        } else {
            eVar.d(i4 + c0643a.f8640u0);
        }
    }

    @Override // x.n
    public final void d() {
        w.d dVar = this.f8845b;
        if (dVar instanceof C0643a) {
            e eVar = this.h;
            eVar.f8822b = true;
            C0643a c0643a = (C0643a) dVar;
            int i = c0643a.f8638s0;
            boolean z3 = c0643a.f8639t0;
            int i4 = 0;
            if (i == 0) {
                eVar.f8825e = 4;
                while (i4 < c0643a.f8801r0) {
                    w.d dVar2 = c0643a.f8800q0[i4];
                    if (z3 || dVar2.f8700g0 != 8) {
                        e eVar2 = dVar2.f8693d.h;
                        eVar2.f8829k.add(eVar);
                        eVar.f8830l.add(eVar2);
                    }
                    i4++;
                }
                m(this.f8845b.f8693d.h);
                m(this.f8845b.f8693d.i);
                return;
            }
            if (i == 1) {
                eVar.f8825e = 5;
                while (i4 < c0643a.f8801r0) {
                    w.d dVar3 = c0643a.f8800q0[i4];
                    if (z3 || dVar3.f8700g0 != 8) {
                        e eVar3 = dVar3.f8693d.i;
                        eVar3.f8829k.add(eVar);
                        eVar.f8830l.add(eVar3);
                    }
                    i4++;
                }
                m(this.f8845b.f8693d.h);
                m(this.f8845b.f8693d.i);
                return;
            }
            if (i == 2) {
                eVar.f8825e = 6;
                while (i4 < c0643a.f8801r0) {
                    w.d dVar4 = c0643a.f8800q0[i4];
                    if (z3 || dVar4.f8700g0 != 8) {
                        e eVar4 = dVar4.f8695e.h;
                        eVar4.f8829k.add(eVar);
                        eVar.f8830l.add(eVar4);
                    }
                    i4++;
                }
                m(this.f8845b.f8695e.h);
                m(this.f8845b.f8695e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            eVar.f8825e = 7;
            while (i4 < c0643a.f8801r0) {
                w.d dVar5 = c0643a.f8800q0[i4];
                if (z3 || dVar5.f8700g0 != 8) {
                    e eVar5 = dVar5.f8695e.i;
                    eVar5.f8829k.add(eVar);
                    eVar.f8830l.add(eVar5);
                }
                i4++;
            }
            m(this.f8845b.f8695e.h);
            m(this.f8845b.f8695e.i);
        }
    }

    @Override // x.n
    public final void e() {
        w.d dVar = this.f8845b;
        if (dVar instanceof C0643a) {
            int i = ((C0643a) dVar).f8638s0;
            e eVar = this.h;
            if (i == 0 || i == 1) {
                dVar.f8686Y = eVar.f8827g;
            } else {
                dVar.Z = eVar.f8827g;
            }
        }
    }

    @Override // x.n
    public final void f() {
        this.f8846c = null;
        this.h.c();
    }

    @Override // x.n
    public final boolean k() {
        return false;
    }

    public final void m(e eVar) {
        e eVar2 = this.h;
        eVar2.f8829k.add(eVar);
        eVar.f8830l.add(eVar2);
    }
}
