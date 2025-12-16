package Z2;

import java.io.IOException;
import r3.InterfaceC0577i;
import r3.InterfaceC0578j;

/* renamed from: Z2.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0104l {
    public final AbstractC0104l failOnUnknown() {
        return new C0102j(this, 2);
    }

    public abstract Object fromJson(r rVar);

    /* JADX WARN: Type inference failed for: r0v0, types: [r3.j, java.lang.Object, r3.h] */
    public final Object fromJson(String str) throws IOException {
        ?? obj = new Object();
        obj.o0(str);
        s sVar = new s((InterfaceC0578j) obj);
        Object fromJson = fromJson(sVar);
        if (isLenient() || sVar.f0() == q.f2278j) {
            return fromJson;
        }
        throw new RuntimeException("JSON document was not fully consumed.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [Z2.r, Z2.v] */
    public final Object fromJsonValue(Object obj) {
        ?? rVar = new r();
        int[] iArr = rVar.f2281b;
        int i = rVar.f2280a;
        iArr[i] = 7;
        Object[] objArr = new Object[32];
        rVar.f2301g = objArr;
        rVar.f2280a = i + 1;
        objArr[i] = obj;
        try {
            return fromJson((r) rVar);
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public AbstractC0104l indent(String str) {
        if (str != null) {
            return new C0094b(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    public boolean isLenient() {
        return false;
    }

    public final AbstractC0104l lenient() {
        return new C0102j(this, 1);
    }

    public final AbstractC0104l nonNull() {
        return this instanceof b3.a ? this : new b3.a(this);
    }

    public final AbstractC0104l nullSafe() {
        return this instanceof b3.b ? this : new b3.b(this);
    }

    public final AbstractC0104l serializeNulls() {
        return new C0102j(this, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [r3.i, java.lang.Object, r3.h] */
    public final String toJson(Object obj) {
        ?? obj2 = new Object();
        try {
            toJson((InterfaceC0577i) obj2, obj);
            return obj2.e0();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public abstract void toJson(x xVar, Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [Z2.w, Z2.x] */
    public final Object toJsonValue(Object obj) {
        ?? xVar = new x();
        xVar.f2302j = new Object[32];
        xVar.c0(6);
        try {
            toJson((x) xVar, obj);
            int i = xVar.f2304a;
            if (i > 1 || (i == 1 && xVar.f2305b[i - 1] != 7)) {
                throw new IllegalStateException("Incomplete document");
            }
            return xVar.f2302j[0];
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public final void toJson(InterfaceC0577i interfaceC0577i, Object obj) throws IOException {
        toJson(new t(interfaceC0577i), obj);
    }

    public final Object fromJson(InterfaceC0578j interfaceC0578j) throws IOException {
        return fromJson(new s(interfaceC0578j));
    }
}
