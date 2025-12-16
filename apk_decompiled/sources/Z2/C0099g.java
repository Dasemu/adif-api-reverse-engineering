package Z2;

import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

/* renamed from: Z2.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0099g extends AbstractC0104l {

    /* renamed from: d, reason: collision with root package name */
    public static final C0093a f2260d = new C0093a(1);

    /* renamed from: a, reason: collision with root package name */
    public final L f2261a;

    /* renamed from: b, reason: collision with root package name */
    public final C0098f[] f2262b;

    /* renamed from: c, reason: collision with root package name */
    public final p f2263c;

    public C0099g(L l4, TreeMap treeMap) {
        this.f2261a = l4;
        this.f2262b = (C0098f[]) treeMap.values().toArray(new C0098f[treeMap.size()]);
        this.f2263c = p.a((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // Z2.AbstractC0104l
    public final Object fromJson(r rVar) {
        try {
            Object e4 = this.f2261a.e();
            try {
                rVar.e();
                while (rVar.Y()) {
                    int j02 = rVar.j0(this.f2263c);
                    if (j02 == -1) {
                        rVar.l0();
                        rVar.m0();
                    } else {
                        C0098f c0098f = this.f2262b[j02];
                        c0098f.f2258b.set(e4, c0098f.f2259c.fromJson(rVar));
                    }
                }
                rVar.x();
                return e4;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            b3.f.i(e6);
            throw null;
        }
    }

    @Override // Z2.AbstractC0104l
    public final void toJson(x xVar, Object obj) {
        try {
            xVar.e();
            for (C0098f c0098f : this.f2262b) {
                xVar.Z(c0098f.f2257a);
                c0098f.f2259c.toJson(xVar, c0098f.f2258b.get(obj));
            }
            xVar.O();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.f2261a + ")";
    }
}
