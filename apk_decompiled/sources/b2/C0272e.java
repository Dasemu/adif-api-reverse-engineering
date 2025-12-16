package b2;

import f0.C0338b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: b2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0272e implements Y1.b {
    @Override // javax.inject.Provider
    public final Object get() {
        C0338b c0338b = new C0338b(3);
        HashMap hashMap = new HashMap();
        T1.d dVar = T1.d.f1658a;
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(dVar, new c2.c(30000L, 86400000L, set));
        T1.d dVar2 = T1.d.f1660c;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(dVar2, new c2.c(1000L, 86400000L, set));
        T1.d dVar3 = T1.d.f1659b;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(c2.e.f4244b)));
        if (unmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(dVar3, new c2.c(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() < T1.d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new c2.b(c0338b, hashMap);
    }
}
