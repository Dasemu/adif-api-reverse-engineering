package Z2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class K extends AbstractC0104l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2227a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2228b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2229c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2230d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2231e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2232f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2233g;

    public K(G g4) {
        this.f2228b = g4;
        this.f2229c = g4.a(List.class);
        this.f2230d = g4.a(Map.class);
        this.f2231e = g4.a(String.class);
        this.f2232f = g4.a(Double.class);
        this.f2233g = g4.a(Boolean.class);
    }

    public int a(r rVar) {
        rVar.e();
        while (true) {
            boolean Y3 = rVar.Y();
            String str = (String) this.f2228b;
            if (!Y3) {
                throw new RuntimeException("Missing label for ".concat(str));
            }
            if (rVar.j0((p) this.f2232f) != -1) {
                int k02 = rVar.k0((p) this.f2233g);
                if (k02 != -1) {
                    return k02;
                }
                throw new RuntimeException("Expected one of " + ((List) this.f2229c) + " for key '" + str + "' but found '" + rVar.e0() + "'. Register a subtype for this label.");
            }
            rVar.l0();
            rVar.m0();
        }
    }

    @Override // Z2.AbstractC0104l
    public final Object fromJson(r rVar) {
        switch (this.f2227a) {
            case 0:
                int ordinal = rVar.f0().ordinal();
                if (ordinal == 0) {
                    return ((AbstractC0104l) this.f2229c).fromJson(rVar);
                }
                if (ordinal == 2) {
                    return ((AbstractC0104l) this.f2230d).fromJson(rVar);
                }
                if (ordinal == 5) {
                    return ((AbstractC0104l) this.f2231e).fromJson(rVar);
                }
                if (ordinal == 6) {
                    return ((AbstractC0104l) this.f2232f).fromJson(rVar);
                }
                if (ordinal == 7) {
                    return ((AbstractC0104l) this.f2233g).fromJson(rVar);
                }
                if (ordinal == 8) {
                    rVar.d0();
                    return null;
                }
                throw new IllegalStateException("Expected a value but was " + rVar.f0() + " at path " + rVar.O());
            default:
                r g02 = rVar.g0();
                g02.f2285f = false;
                try {
                    int a2 = a(g02);
                    g02.close();
                    if (a2 != -1) {
                        return ((AbstractC0104l) ((ArrayList) this.f2231e).get(a2)).fromJson(rVar);
                    }
                    throw null;
                } catch (Throwable th) {
                    g02.close();
                    throw th;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        if (r1.isAssignableFrom(r0) != false) goto L29;
     */
    @Override // Z2.AbstractC0104l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void toJson(Z2.x r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.f2227a
            switch(r0) {
                case 0: goto L8d;
                default: goto L5;
            }
        L5:
            java.lang.Class r0 = r5.getClass()
            java.lang.Object r1 = r3.f2230d
            java.util.List r1 = (java.util.List) r1
            int r0 = r1.indexOf(r0)
            r2 = -1
            if (r0 == r2) goto L60
            java.lang.Object r1 = r3.f2231e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r1 = r1.get(r0)
            Z2.l r1 = (Z2.AbstractC0104l) r1
            r4.e()
            if (r1 == 0) goto L38
            java.lang.Object r2 = r3.f2228b
            java.lang.String r2 = (java.lang.String) r2
            Z2.x r2 = r4.Z(r2)
            java.lang.Object r3 = r3.f2229c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            r2.h0(r3)
        L38:
            int r3 = r4.b0()
            r0 = 5
            if (r3 == r0) goto L51
            r0 = 3
            if (r3 == r0) goto L51
            r0 = 2
            if (r3 == r0) goto L51
            r0 = 1
            if (r3 != r0) goto L49
            goto L51
        L49:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Nesting problem."
            r3.<init>(r4)
            throw r3
        L51:
            int r3 = r4.i
            int r0 = r4.f2304a
            r4.i = r0
            r1.toJson(r4, r5)
            r4.i = r3
            r4.O()
            return
        L60:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected one of "
            r4.<init>(r0)
            r4.append(r1)
            java.lang.String r0 = " but found "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r0 = ", a "
            r4.append(r0)
            java.lang.Class r5 = r5.getClass()
            r4.append(r5)
            java.lang.String r5 = ". Register this subtype."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L8d:
            java.lang.Class r0 = r5.getClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto L9c
            r4.e()
            r4.O()
            goto Lbd
        L9c:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto La6
        La4:
            r0 = r1
            goto Laf
        La6:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto Laf
            goto La4
        Laf:
            java.util.Set r1 = b3.f.f4193a
            java.lang.Object r3 = r3.f2228b
            Z2.G r3 = (Z2.G) r3
            r2 = 0
            Z2.l r3 = r3.c(r0, r1, r2)
            r3.toJson(r4, r5)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.K.toJson(Z2.x, java.lang.Object):void");
    }

    public final String toString() {
        switch (this.f2227a) {
            case 0:
                return "JsonAdapter(Object)";
            default:
                return C.w.r(new StringBuilder("PolymorphicJsonAdapter("), (String) this.f2228b, ")");
        }
    }

    public K(String str, List list, List list2, ArrayList arrayList) {
        this.f2228b = str;
        this.f2229c = list;
        this.f2230d = list2;
        this.f2231e = arrayList;
        this.f2232f = p.a(str);
        this.f2233g = p.a((String[]) list.toArray(new String[0]));
    }
}
