package W1;

import java.util.Set;

/* loaded from: classes3.dex */
public final class r implements T1.g {

    /* renamed from: a, reason: collision with root package name */
    public final Set f1949a;

    /* renamed from: b, reason: collision with root package name */
    public final j f1950b;

    /* renamed from: c, reason: collision with root package name */
    public final t f1951c;

    public r(Set set, j jVar, t tVar) {
        this.f1949a = set;
        this.f1950b = jVar;
        this.f1951c = tVar;
    }

    public final s a(String str, T1.c cVar, T1.e eVar) {
        Set set = this.f1949a;
        if (set.contains(cVar)) {
            return new s(this.f1950b, str, cVar, eVar, this.f1951c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
