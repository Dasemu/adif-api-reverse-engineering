package androidx.room;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f3983a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f3984b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f3985c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3986d;

    public n(int i) {
        this.f3983a = new long[i];
        this.f3984b = new boolean[i];
        this.f3985c = new int[i];
    }

    public final int[] a() {
        synchronized (this) {
            try {
                if (!this.f3986d) {
                    return null;
                }
                long[] jArr = this.f3983a;
                int length = jArr.length;
                int i = 0;
                int i4 = 0;
                while (i < length) {
                    int i5 = i4 + 1;
                    int i6 = 1;
                    boolean z3 = jArr[i] > 0;
                    boolean[] zArr = this.f3984b;
                    if (z3 != zArr[i4]) {
                        int[] iArr = this.f3985c;
                        if (!z3) {
                            i6 = 2;
                        }
                        iArr[i4] = i6;
                    } else {
                        this.f3985c[i4] = 0;
                    }
                    zArr[i4] = z3;
                    i++;
                    i4 = i5;
                }
                this.f3986d = false;
                return (int[]) this.f3985c.clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
