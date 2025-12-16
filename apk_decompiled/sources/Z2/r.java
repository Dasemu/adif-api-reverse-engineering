package Z2;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class r implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public int f2280a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2281b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f2282c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f2283d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2284e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2285f;

    public r() {
        this.f2281b = new int[32];
        this.f2282c = new String[32];
        this.f2283d = new int[32];
    }

    public final String O() {
        return L.c(this.f2280a, this.f2281b, this.f2282c, this.f2283d);
    }

    public abstract boolean Y();

    public abstract boolean Z();

    public abstract double a0();

    public abstract int b0();

    public abstract long c0();

    public abstract void d();

    public abstract void d0();

    public abstract void e();

    public abstract String e0();

    public abstract q f0();

    public abstract r g0();

    public abstract void h0();

    public final void i0(int i) {
        int i4 = this.f2280a;
        int[] iArr = this.f2281b;
        if (i4 == iArr.length) {
            if (i4 == 256) {
                throw new RuntimeException("Nesting too deep at " + O());
            }
            this.f2281b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f2282c;
            this.f2282c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f2283d;
            this.f2283d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f2281b;
        int i5 = this.f2280a;
        this.f2280a = i5 + 1;
        iArr3[i5] = i;
    }

    public abstract int j0(p pVar);

    public abstract int k0(p pVar);

    public abstract void l0();

    public abstract void m0();

    public final void n0(String str) {
        throw new IOException(str + " at path " + O());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Q2.j, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r4v4, types: [Q2.j, java.lang.RuntimeException] */
    public final Q2.j o0(Object obj, Object obj2) {
        if (obj == null) {
            return new RuntimeException("Expected " + obj2 + " but was null at path " + O());
        }
        return new RuntimeException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + O());
    }

    public abstract void s();

    public abstract void x();

    public r(r rVar) {
        this.f2280a = rVar.f2280a;
        this.f2281b = (int[]) rVar.f2281b.clone();
        this.f2282c = (String[]) rVar.f2282c.clone();
        this.f2283d = (int[]) rVar.f2283d.clone();
        this.f2284e = rVar.f2284e;
        this.f2285f = rVar.f2285f;
    }
}
