package Z2;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: Z2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0094b extends AbstractC0104l {

    /* renamed from: d, reason: collision with root package name */
    public static final C0093a f2243d = new C0093a(0);

    /* renamed from: e, reason: collision with root package name */
    public static final C0093a f2244e = new C0093a(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2245a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0104l f2246b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2247c;

    public C0094b(AbstractC0104l abstractC0104l, String str) {
        this.f2246b = abstractC0104l;
        this.f2247c = str;
    }

    @Override // Z2.AbstractC0104l
    public final Object fromJson(r rVar) {
        switch (this.f2245a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                rVar.d();
                while (rVar.Y()) {
                    arrayList.add(this.f2246b.fromJson(rVar));
                }
                rVar.s();
                Object newInstance = Array.newInstance((Class<?>) this.f2247c, arrayList.size());
                for (int i = 0; i < arrayList.size(); i++) {
                    Array.set(newInstance, i, arrayList.get(i));
                }
                return newInstance;
            case 1:
                C c4 = new C();
                rVar.e();
                while (rVar.Y()) {
                    rVar.h0();
                    Object fromJson = this.f2246b.fromJson(rVar);
                    Object fromJson2 = ((AbstractC0104l) this.f2247c).fromJson(rVar);
                    Object put = c4.put(fromJson, fromJson2);
                    if (put != null) {
                        throw new RuntimeException("Map key '" + fromJson + "' has multiple values at path " + rVar.O() + ": " + put + " and " + fromJson2);
                    }
                }
                rVar.x();
                return c4;
            default:
                return this.f2246b.fromJson(rVar);
        }
    }

    @Override // Z2.AbstractC0104l
    public boolean isLenient() {
        switch (this.f2245a) {
            case 2:
                return this.f2246b.isLenient();
            default:
                return super.isLenient();
        }
    }

    @Override // Z2.AbstractC0104l
    public final void toJson(x xVar, Object obj) {
        switch (this.f2245a) {
            case 0:
                xVar.d();
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    this.f2246b.toJson(xVar, Array.get(obj, i));
                }
                xVar.x();
                return;
            case 1:
                xVar.e();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() == null) {
                        throw new RuntimeException("Map key is null at " + xVar.Y());
                    }
                    int b02 = xVar.b0();
                    if (b02 != 5 && b02 != 3) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    xVar.h = true;
                    this.f2246b.toJson(xVar, entry.getKey());
                    ((AbstractC0104l) this.f2247c).toJson(xVar, entry.getValue());
                }
                xVar.O();
                return;
            default:
                String str = xVar.f2308e;
                if (str == null) {
                    str = "";
                }
                xVar.d0((String) this.f2247c);
                try {
                    this.f2246b.toJson(xVar, obj);
                    return;
                } finally {
                    xVar.d0(str);
                }
        }
    }

    public final String toString() {
        switch (this.f2245a) {
            case 0:
                return this.f2246b + ".array()";
            case 1:
                return "JsonAdapter(" + this.f2246b + "=" + ((AbstractC0104l) this.f2247c) + ")";
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f2246b);
                sb.append(".indent(\"");
                return C.w.r(sb, (String) this.f2247c, "\")");
        }
    }

    public C0094b(G g4, Type type, Type type2) {
        this.f2246b = g4.b(type);
        this.f2247c = g4.b(type2);
    }

    public C0094b(Class cls, AbstractC0104l abstractC0104l) {
        this.f2247c = cls;
        this.f2246b = abstractC0104l;
    }
}
