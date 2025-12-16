package o;

import java.util.Iterator;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518d extends AbstractC0519e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C0517c f7891a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7892b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0520f f7893c;

    public C0518d(C0520f c0520f) {
        this.f7893c = c0520f;
    }

    @Override // o.AbstractC0519e
    public final void a(C0517c c0517c) {
        C0517c c0517c2 = this.f7891a;
        if (c0517c == c0517c2) {
            C0517c c0517c3 = c0517c2.f7890d;
            this.f7891a = c0517c3;
            this.f7892b = c0517c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7892b) {
            return this.f7893c.f7894a != null;
        }
        C0517c c0517c = this.f7891a;
        return (c0517c == null || c0517c.f7889c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7892b) {
            this.f7892b = false;
            this.f7891a = this.f7893c.f7894a;
        } else {
            C0517c c0517c = this.f7891a;
            this.f7891a = c0517c != null ? c0517c.f7889c : null;
        }
        return this.f7891a;
    }
}
