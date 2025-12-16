package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: c, reason: collision with root package name */
    public static final Y f2881c = new Y();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2883b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final J f2882a = new J();

    public final InterfaceC0111b0 a(Class cls) {
        InterfaceC0111b0 x3;
        Class cls2;
        AbstractC0133y.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f2883b;
        InterfaceC0111b0 interfaceC0111b0 = (InterfaceC0111b0) concurrentHashMap.get(cls);
        if (interfaceC0111b0 != null) {
            return interfaceC0111b0;
        }
        J j4 = this.f2882a;
        j4.getClass();
        Class cls3 = c0.f2894a;
        if (!AbstractC0130v.class.isAssignableFrom(cls) && (cls2 = c0.f2894a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        C0109a0 a2 = ((I) j4.f2852a).a(cls);
        if ((a2.f2890d & 2) == 2) {
            boolean isAssignableFrom = AbstractC0130v.class.isAssignableFrom(cls);
            AbstractC0130v abstractC0130v = a2.f2887a;
            if (isAssignableFrom) {
                x3 = new T(c0.f2897d, AbstractC0124o.f2948a, abstractC0130v);
            } else {
                k0 k0Var = c0.f2895b;
                C0123n c0123n = AbstractC0124o.f2949b;
                if (c0123n == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                x3 = new T(k0Var, c0123n, abstractC0130v);
            }
        } else if (AbstractC0130v.class.isAssignableFrom(cls)) {
            x3 = (a2.f2890d & 1) == 1 ? S.x(a2, V.f2880b, G.f2849b, c0.f2897d, AbstractC0124o.f2948a, O.f2860b) : S.x(a2, V.f2880b, G.f2849b, c0.f2897d, null, O.f2860b);
        } else if ((a2.f2890d & 1) == 1) {
            U u3 = V.f2879a;
            E e4 = G.f2848a;
            k0 k0Var2 = c0.f2895b;
            C0123n c0123n2 = AbstractC0124o.f2949b;
            if (c0123n2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            x3 = S.x(a2, u3, e4, k0Var2, c0123n2, O.f2859a);
        } else {
            x3 = S.x(a2, V.f2879a, G.f2848a, c0.f2896c, null, O.f2859a);
        }
        InterfaceC0111b0 interfaceC0111b02 = (InterfaceC0111b0) concurrentHashMap.putIfAbsent(cls, x3);
        return interfaceC0111b02 != null ? interfaceC0111b02 : x3;
    }
}
