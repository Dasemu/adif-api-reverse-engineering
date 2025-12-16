package S2;

import java.util.Map;

/* loaded from: classes3.dex */
public final class n implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public n f1610a;

    /* renamed from: b, reason: collision with root package name */
    public n f1611b;

    /* renamed from: c, reason: collision with root package name */
    public n f1612c;

    /* renamed from: d, reason: collision with root package name */
    public n f1613d;

    /* renamed from: e, reason: collision with root package name */
    public n f1614e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1615f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1616g;
    public Object h;
    public int i;

    public n(boolean z3) {
        this.f1615f = null;
        this.f1616g = z3;
        this.f1614e = this;
        this.f1613d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f1615f;
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
        return this.f1615f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f1615f;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.h;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f1616g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.h;
        this.h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f1615f + "=" + this.h;
    }

    public n(boolean z3, n nVar, Object obj, n nVar2, n nVar3) {
        this.f1610a = nVar;
        this.f1615f = obj;
        this.f1616g = z3;
        this.i = 1;
        this.f1613d = nVar2;
        this.f1614e = nVar3;
        nVar3.f1613d = this;
        nVar2.f1614e = this;
    }
}
