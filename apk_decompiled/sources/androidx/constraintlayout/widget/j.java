package androidx.constraintlayout.widget;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2639a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2640b;

    /* renamed from: c, reason: collision with root package name */
    public int f2641c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f2642d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f2643e;

    /* renamed from: f, reason: collision with root package name */
    public int f2644f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f2645g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f2646j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f2647k;

    /* renamed from: l, reason: collision with root package name */
    public int f2648l;

    public final void a(int i, float f2) {
        int i4 = this.f2644f;
        int[] iArr = this.f2642d;
        if (i4 >= iArr.length) {
            this.f2642d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f2643e;
            this.f2643e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f2642d;
        int i5 = this.f2644f;
        iArr2[i5] = i;
        float[] fArr2 = this.f2643e;
        this.f2644f = i5 + 1;
        fArr2[i5] = f2;
    }

    public final void b(int i, int i4) {
        int i5 = this.f2641c;
        int[] iArr = this.f2639a;
        if (i5 >= iArr.length) {
            this.f2639a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f2640b;
            this.f2640b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f2639a;
        int i6 = this.f2641c;
        iArr3[i6] = i;
        int[] iArr4 = this.f2640b;
        this.f2641c = i6 + 1;
        iArr4[i6] = i4;
    }

    public final void c(int i, String str) {
        int i4 = this.i;
        int[] iArr = this.f2645g;
        if (i4 >= iArr.length) {
            this.f2645g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f2645g;
        int i5 = this.i;
        iArr2[i5] = i;
        String[] strArr2 = this.h;
        this.i = i5 + 1;
        strArr2[i5] = str;
    }

    public final void d(int i, boolean z3) {
        int i4 = this.f2648l;
        int[] iArr = this.f2646j;
        if (i4 >= iArr.length) {
            this.f2646j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f2647k;
            this.f2647k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f2646j;
        int i5 = this.f2648l;
        iArr2[i5] = i;
        boolean[] zArr2 = this.f2647k;
        this.f2648l = i5 + 1;
        zArr2[i5] = z3;
    }
}
