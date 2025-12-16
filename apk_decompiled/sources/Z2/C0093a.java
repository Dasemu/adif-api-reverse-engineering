package Z2;

import java.lang.reflect.Type;

/* renamed from: Z2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0093a implements InterfaceC0103k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2242a;

    public /* synthetic */ C0093a(int i) {
        this.f2242a = i;
    }

    public static void b(Type type, Class cls) {
        Class<?> d4 = L.d(type);
        if (cls.isAssignableFrom(d4)) {
            throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + d4.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0221, code lost:
    
        if (r12 == null) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v63 */
    /* JADX WARN: Type inference failed for: r13v64, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v5, types: [java.lang.reflect.Type] */
    @Override // Z2.InterfaceC0103k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Z2.AbstractC0104l a(java.lang.reflect.Type r25, java.util.Set r26, Z2.G r27) {
        /*
            Method dump skipped, instructions count: 2184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.C0093a.a(java.lang.reflect.Type, java.util.Set, Z2.G):Z2.l");
    }
}
