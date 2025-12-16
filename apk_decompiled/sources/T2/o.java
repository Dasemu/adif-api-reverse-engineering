package T2;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class o extends Q2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1701a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1702b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1703c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1704d;

    public o(Q2.d dVar, Q2.l lVar, Type type) {
        this.f1701a = 0;
        this.f1702b = dVar;
        this.f1703c = lVar;
        this.f1704d = type;
    }

    @Override // Q2.l
    public final Object a(Y2.a aVar) {
        switch (this.f1701a) {
            case 0:
                return ((Q2.l) this.f1703c).a(aVar);
            default:
                if (aVar.o0() == 9) {
                    aVar.k0();
                    return null;
                }
                String m02 = aVar.m0();
                Enum r02 = (Enum) ((HashMap) this.f1702b).get(m02);
                return r02 == null ? (Enum) ((HashMap) this.f1703c).get(m02) : r02;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        if ((r0 instanceof T2.k) != false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.reflect.Type] */
    @Override // Q2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(Y2.b r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.f1701a
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.Enum r5 = (java.lang.Enum) r5
            if (r5 != 0) goto Lb
            r3 = 0
            goto L15
        Lb:
            java.lang.Object r3 = r3.f1704d
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r3 = r3.get(r5)
            java.lang.String r3 = (java.lang.String) r3
        L15:
            r4.h0(r3)
            return
        L19:
            java.lang.Object r0 = r3.f1704d
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r5 == 0) goto L2c
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto L27
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L2c
        L27:
            java.lang.Class r1 = r5.getClass()
            goto L2d
        L2c:
            r1 = r0
        L2d:
            java.lang.Object r2 = r3.f1703c
            Q2.l r2 = (Q2.l) r2
            if (r1 == r0) goto L63
            java.lang.Object r3 = r3.f1702b
            Q2.d r3 = (Q2.d) r3
            X2.a r0 = X2.a.get(r1)
            Q2.l r3 = r3.d(r0)
            boolean r0 = r3 instanceof T2.k
            if (r0 != 0) goto L44
            goto L62
        L44:
            r0 = r2
        L45:
            boolean r1 = r0 instanceof Q2.c
            if (r1 == 0) goto L5d
            r1 = r0
            Q2.c r1 = (Q2.c) r1
            Q2.l r1 = r1.f1378a
            if (r1 == 0) goto L55
            if (r1 != r0) goto L53
            goto L5d
        L53:
            r0 = r1
            goto L45
        L55:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Adapter for type with cyclic dependency has been used before dependency has been resolved"
            r3.<init>(r4)
            throw r3
        L5d:
            boolean r0 = r0 instanceof T2.k
            if (r0 != 0) goto L62
            goto L63
        L62:
            r2 = r3
        L63:
            r2.b(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.o.b(Y2.b, java.lang.Object):void");
    }

    public o(Class cls) {
        this.f1701a = 1;
        this.f1702b = new HashMap();
        this.f1703c = new HashMap();
        this.f1704d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new q(cls))) {
                Enum r4 = (Enum) field.get(null);
                String name = r4.name();
                String str = r4.toString();
                R2.b bVar = (R2.b) field.getAnnotation(R2.b.class);
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        ((HashMap) this.f1702b).put(str2, r4);
                    }
                }
                ((HashMap) this.f1702b).put(name, r4);
                ((HashMap) this.f1703c).put(str, r4);
                ((HashMap) this.f1704d).put(r4, name);
            }
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        }
    }
}
