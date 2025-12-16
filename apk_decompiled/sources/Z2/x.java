package Z2;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class x implements Closeable, Flushable {

    /* renamed from: e, reason: collision with root package name */
    public String f2308e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2309f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2310g;
    public boolean h;

    /* renamed from: a, reason: collision with root package name */
    public int f2304a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2305b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    public String[] f2306c = new String[32];

    /* renamed from: d, reason: collision with root package name */
    public int[] f2307d = new int[32];
    public int i = -1;

    public abstract x O();

    public final String Y() {
        return L.c(this.f2304a, this.f2305b, this.f2306c, this.f2307d);
    }

    public abstract x Z(String str);

    public abstract x a0();

    public final int b0() {
        int i = this.f2304a;
        if (i != 0) {
            return this.f2305b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void c0(int i) {
        int[] iArr = this.f2305b;
        int i4 = this.f2304a;
        this.f2304a = i4 + 1;
        iArr[i4] = i;
    }

    public abstract x d();

    public void d0(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f2308e = str;
    }

    public abstract x e();

    public abstract x e0(double d4);

    public abstract x f0(long j4);

    public abstract x g0(Float f2);

    public abstract x h0(String str);

    public abstract x i0(boolean z3);

    public final void s() {
        int i = this.f2304a;
        int[] iArr = this.f2305b;
        if (i != iArr.length) {
            return;
        }
        if (i == 256) {
            throw new RuntimeException("Nesting too deep at " + Y() + ": circular reference?");
        }
        this.f2305b = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f2306c;
        this.f2306c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f2307d;
        this.f2307d = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (this instanceof w) {
            w wVar = (w) this;
            Object[] objArr = wVar.f2302j;
            wVar.f2302j = Arrays.copyOf(objArr, objArr.length * 2);
        }
    }

    public abstract x x();
}
