package Z2;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class E extends AbstractC0104l {

    /* renamed from: a, reason: collision with root package name */
    public final Type f2208a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2209b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2210c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0104l f2211d;

    public E(Type type, String str, Object obj) {
        this.f2208a = type;
        this.f2209b = str;
        this.f2210c = obj;
    }

    @Override // Z2.AbstractC0104l
    public final Object fromJson(r rVar) {
        AbstractC0104l abstractC0104l = this.f2211d;
        if (abstractC0104l != null) {
            return abstractC0104l.fromJson(rVar);
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    @Override // Z2.AbstractC0104l
    public final void toJson(x xVar, Object obj) {
        AbstractC0104l abstractC0104l = this.f2211d;
        if (abstractC0104l == null) {
            throw new IllegalStateException("JsonAdapter isn't ready");
        }
        abstractC0104l.toJson(xVar, obj);
    }

    public final String toString() {
        AbstractC0104l abstractC0104l = this.f2211d;
        return abstractC0104l != null ? abstractC0104l.toString() : super.toString();
    }
}
