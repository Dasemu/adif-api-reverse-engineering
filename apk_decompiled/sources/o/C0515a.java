package o;

import java.util.HashMap;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0515a extends C0520f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f7883e = new HashMap();

    @Override // o.C0520f
    public final C0517c a(Object obj) {
        return (C0517c) this.f7883e.get(obj);
    }

    @Override // o.C0520f
    public final Object b(Object obj, Object obj2) {
        C0517c a2 = a(obj);
        if (a2 != null) {
            return a2.f7888b;
        }
        HashMap hashMap = this.f7883e;
        C0517c c0517c = new C0517c(obj, obj2);
        this.f7897d++;
        C0517c c0517c2 = this.f7895b;
        if (c0517c2 == null) {
            this.f7894a = c0517c;
            this.f7895b = c0517c;
        } else {
            c0517c2.f7889c = c0517c;
            c0517c.f7890d = c0517c2;
            this.f7895b = c0517c;
        }
        hashMap.put(obj, c0517c);
        return null;
    }

    @Override // o.C0520f
    public final Object c(Object obj) {
        Object c4 = super.c(obj);
        this.f7883e.remove(obj);
        return c4;
    }
}
