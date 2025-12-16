package o;

import java.util.Map;

/* renamed from: o.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0517c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7887a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7888b;

    /* renamed from: c, reason: collision with root package name */
    public C0517c f7889c;

    /* renamed from: d, reason: collision with root package name */
    public C0517c f7890d;

    public C0517c(Object obj, Object obj2) {
        this.f7887a = obj;
        this.f7888b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0517c)) {
            return false;
        }
        C0517c c0517c = (C0517c) obj;
        return this.f7887a.equals(c0517c.f7887a) && this.f7888b.equals(c0517c.f7888b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7887a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7888b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f7888b.hashCode() ^ this.f7887a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f7887a + "=" + this.f7888b;
    }
}
