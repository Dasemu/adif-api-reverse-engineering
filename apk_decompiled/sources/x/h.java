package x;

/* loaded from: classes.dex */
public final class h extends n {
    @Override // x.InterfaceC0655d
    public final void a(InterfaceC0655d interfaceC0655d) {
        e eVar = this.h;
        if (eVar.f8823c && !eVar.f8828j) {
            eVar.d((int) ((((e) eVar.f8830l.get(0)).f8827g * ((w.h) this.f8845b).f8794q0) + 0.5f));
        }
    }

    @Override // x.n
    public final void d() {
        w.d dVar = this.f8845b;
        w.h hVar = (w.h) dVar;
        int i = hVar.f8795r0;
        int i4 = hVar.f8796s0;
        int i5 = hVar.f8798u0;
        e eVar = this.h;
        if (i5 == 1) {
            if (i != -1) {
                eVar.f8830l.add(dVar.f8681T.f8693d.h);
                this.f8845b.f8681T.f8693d.h.f8829k.add(eVar);
                eVar.f8826f = i;
            } else if (i4 != -1) {
                eVar.f8830l.add(dVar.f8681T.f8693d.i);
                this.f8845b.f8681T.f8693d.i.f8829k.add(eVar);
                eVar.f8826f = -i4;
            } else {
                eVar.f8822b = true;
                eVar.f8830l.add(dVar.f8681T.f8693d.i);
                this.f8845b.f8681T.f8693d.i.f8829k.add(eVar);
            }
            m(this.f8845b.f8693d.h);
            m(this.f8845b.f8693d.i);
            return;
        }
        if (i != -1) {
            eVar.f8830l.add(dVar.f8681T.f8695e.h);
            this.f8845b.f8681T.f8695e.h.f8829k.add(eVar);
            eVar.f8826f = i;
        } else if (i4 != -1) {
            eVar.f8830l.add(dVar.f8681T.f8695e.i);
            this.f8845b.f8681T.f8695e.i.f8829k.add(eVar);
            eVar.f8826f = -i4;
        } else {
            eVar.f8822b = true;
            eVar.f8830l.add(dVar.f8681T.f8695e.i);
            this.f8845b.f8681T.f8695e.i.f8829k.add(eVar);
        }
        m(this.f8845b.f8695e.h);
        m(this.f8845b.f8695e.i);
    }

    @Override // x.n
    public final void e() {
        w.d dVar = this.f8845b;
        int i = ((w.h) dVar).f8798u0;
        e eVar = this.h;
        if (i == 1) {
            dVar.f8686Y = eVar.f8827g;
        } else {
            dVar.Z = eVar.f8827g;
        }
    }

    @Override // x.n
    public final void f() {
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
