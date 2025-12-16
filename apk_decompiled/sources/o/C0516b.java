package o;

import java.util.Iterator;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0516b extends AbstractC0519e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C0517c f7884a;

    /* renamed from: b, reason: collision with root package name */
    public C0517c f7885b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7886c;

    public C0516b(C0517c c0517c, C0517c c0517c2, int i) {
        this.f7886c = i;
        this.f7884a = c0517c2;
        this.f7885b = c0517c;
    }

    @Override // o.AbstractC0519e
    public final void a(C0517c c0517c) {
        C0517c c0517c2;
        C0517c c0517c3 = null;
        if (this.f7884a == c0517c && c0517c == this.f7885b) {
            this.f7885b = null;
            this.f7884a = null;
        }
        C0517c c0517c4 = this.f7884a;
        if (c0517c4 == c0517c) {
            switch (this.f7886c) {
                case 0:
                    c0517c2 = c0517c4.f7890d;
                    break;
                default:
                    c0517c2 = c0517c4.f7889c;
                    break;
            }
            this.f7884a = c0517c2;
        }
        C0517c c0517c5 = this.f7885b;
        if (c0517c5 == c0517c) {
            C0517c c0517c6 = this.f7884a;
            if (c0517c5 != c0517c6 && c0517c6 != null) {
                c0517c3 = b(c0517c5);
            }
            this.f7885b = c0517c3;
        }
    }

    public final C0517c b(C0517c c0517c) {
        switch (this.f7886c) {
            case 0:
                return c0517c.f7889c;
            default:
                return c0517c.f7890d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7885b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0517c c0517c = this.f7885b;
        C0517c c0517c2 = this.f7884a;
        this.f7885b = (c0517c == c0517c2 || c0517c2 == null) ? null : b(c0517c);
        return c0517c;
    }
}
