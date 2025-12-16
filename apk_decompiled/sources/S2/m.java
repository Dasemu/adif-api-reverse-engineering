package S2;

import Z2.B;
import Z2.C;
import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class m implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f1606b;

    /* renamed from: c, reason: collision with root package name */
    public Map.Entry f1607c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f1609e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1605a = 0;

    /* renamed from: d, reason: collision with root package name */
    public Map.Entry f1608d = null;

    public m(o oVar) {
        this.f1609e = oVar;
        this.f1607c = oVar.f1622f.f1613d;
        this.f1606b = oVar.f1621e;
    }

    public n a() {
        n nVar = (n) this.f1607c;
        o oVar = (o) this.f1609e;
        if (nVar == oVar.f1622f) {
            throw new NoSuchElementException();
        }
        if (oVar.f1621e != this.f1606b) {
            throw new ConcurrentModificationException();
        }
        this.f1607c = nVar.f1613d;
        this.f1608d = nVar;
        return nVar;
    }

    public B b() {
        B b4 = (B) this.f1607c;
        C c4 = (C) this.f1609e;
        if (b4 == c4.f2201c) {
            throw new NoSuchElementException();
        }
        if (c4.f2203e != this.f1606b) {
            throw new ConcurrentModificationException();
        }
        this.f1607c = b4.f2195d;
        this.f1608d = b4;
        return b4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1605a) {
            case 0:
                return ((n) this.f1607c) != ((o) this.f1609e).f1622f;
            default:
                return ((B) this.f1607c) != ((C) this.f1609e).f2201c;
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f1605a) {
            case 0:
                return a();
            default:
                return b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1605a) {
            case 0:
                n nVar = (n) this.f1608d;
                if (nVar == null) {
                    throw new IllegalStateException();
                }
                o oVar = (o) this.f1609e;
                oVar.c(nVar, true);
                this.f1608d = null;
                this.f1606b = oVar.f1621e;
                return;
            default:
                B b4 = (B) this.f1608d;
                if (b4 == null) {
                    throw new IllegalStateException();
                }
                C c4 = (C) this.f1609e;
                c4.c(b4, true);
                this.f1608d = null;
                this.f1606b = c4.f2203e;
                return;
        }
    }

    public m(C c4) {
        this.f1609e = c4;
        this.f1607c = c4.f2201c.f2195d;
        this.f1606b = c4.f2203e;
    }
}
