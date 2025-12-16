package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class g0 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f2913a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f2915c;

    public g0(d0 d0Var, Comparable comparable, Object obj) {
        this.f2915c = d0Var;
        this.f2913a = comparable;
        this.f2914b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2913a.compareTo(((g0) obj).f2913a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f2913a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f2914b;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2913a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2914b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f2913a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f2914b;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f2915c.b();
        Object obj2 = this.f2914b;
        this.f2914b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f2913a + "=" + this.f2914b;
    }
}
