package Z2;

import java.util.Map;

/* loaded from: classes3.dex */
public final class B implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public B f2192a;

    /* renamed from: b, reason: collision with root package name */
    public B f2193b;

    /* renamed from: c, reason: collision with root package name */
    public B f2194c;

    /* renamed from: d, reason: collision with root package name */
    public B f2195d;

    /* renamed from: e, reason: collision with root package name */
    public B f2196e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2197f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2198g;
    public Object h;
    public int i;

    public B() {
        this.f2197f = null;
        this.f2198g = -1;
        this.f2196e = this;
        this.f2195d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f2197f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2197f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f2197f;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.h;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.h;
        this.h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f2197f + "=" + this.h;
    }

    public B(B b4, Object obj, int i, B b5, B b6) {
        this.f2192a = b4;
        this.f2197f = obj;
        this.f2198g = i;
        this.i = 1;
        this.f2195d = b5;
        this.f2196e = b6;
        b6.f2195d = this;
        b5.f2196e = this;
    }
}
