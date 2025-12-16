package k;

import m.V0;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413j extends m3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7007a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7008b;

    /* renamed from: c, reason: collision with root package name */
    public int f7009c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7010d;

    public C0413j(C0414k c0414k) {
        this.f7007a = 0;
        this.f7010d = c0414k;
        this.f7008b = false;
        this.f7009c = 0;
    }

    @Override // O.i0
    public final void a() {
        switch (this.f7007a) {
            case 0:
                int i = this.f7009c + 1;
                this.f7009c = i;
                C0414k c0414k = (C0414k) this.f7010d;
                if (i == c0414k.f7011a.size()) {
                    m3.l lVar = c0414k.f7014d;
                    if (lVar != null) {
                        lVar.a();
                    }
                    this.f7009c = 0;
                    this.f7008b = false;
                    c0414k.f7015e = false;
                    return;
                }
                return;
            default:
                if (this.f7008b) {
                    return;
                }
                ((V0) this.f7010d).f7624a.setVisibility(this.f7009c);
                return;
        }
    }

    @Override // m3.l, O.i0
    public void b() {
        switch (this.f7007a) {
            case 1:
                this.f7008b = true;
                return;
            default:
                return;
        }
    }

    @Override // m3.l, O.i0
    public final void c() {
        switch (this.f7007a) {
            case 0:
                if (this.f7008b) {
                    return;
                }
                this.f7008b = true;
                m3.l lVar = ((C0414k) this.f7010d).f7014d;
                if (lVar != null) {
                    lVar.c();
                    return;
                }
                return;
            default:
                ((V0) this.f7010d).f7624a.setVisibility(0);
                return;
        }
    }

    public C0413j(V0 v02, int i) {
        this.f7007a = 1;
        this.f7010d = v02;
        this.f7009c = i;
        this.f7008b = false;
    }
}
