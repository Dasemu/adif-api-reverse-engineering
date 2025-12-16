package u;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* renamed from: u.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0630g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8584a;

    /* renamed from: e, reason: collision with root package name */
    public float f8588e;

    /* renamed from: l, reason: collision with root package name */
    public int f8593l;

    /* renamed from: b, reason: collision with root package name */
    public int f8585b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f8586c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f8587d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8589f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f8590g = new float[9];
    public final float[] h = new float[9];
    public C0625b[] i = new C0625b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f8591j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f8592k = 0;

    public C0630g(int i) {
        this.f8593l = i;
    }

    public final void a(C0625b c0625b) {
        int i = 0;
        while (true) {
            int i4 = this.f8591j;
            if (i >= i4) {
                C0625b[] c0625bArr = this.i;
                if (i4 >= c0625bArr.length) {
                    this.i = (C0625b[]) Arrays.copyOf(c0625bArr, c0625bArr.length * 2);
                }
                C0625b[] c0625bArr2 = this.i;
                int i5 = this.f8591j;
                c0625bArr2[i5] = c0625b;
                this.f8591j = i5 + 1;
                return;
            }
            if (this.i[i] == c0625b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0625b c0625b) {
        int i = this.f8591j;
        int i4 = 0;
        while (i4 < i) {
            if (this.i[i4] == c0625b) {
                while (i4 < i - 1) {
                    C0625b[] c0625bArr = this.i;
                    int i5 = i4 + 1;
                    c0625bArr[i4] = c0625bArr[i5];
                    i4 = i5;
                }
                this.f8591j--;
                return;
            }
            i4++;
        }
    }

    public final void c() {
        this.f8593l = 5;
        this.f8587d = 0;
        this.f8585b = -1;
        this.f8586c = -1;
        this.f8588e = BitmapDescriptorFactory.HUE_RED;
        this.f8589f = false;
        int i = this.f8591j;
        for (int i4 = 0; i4 < i; i4++) {
            this.i[i4] = null;
        }
        this.f8591j = 0;
        this.f8592k = 0;
        this.f8584a = false;
        Arrays.fill(this.h, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f8585b - ((C0630g) obj).f8585b;
    }

    public final void d(C0626c c0626c, float f2) {
        this.f8588e = f2;
        this.f8589f = true;
        int i = this.f8591j;
        this.f8586c = -1;
        for (int i4 = 0; i4 < i; i4++) {
            this.i[i4].h(c0626c, this, false);
        }
        this.f8591j = 0;
    }

    public final void e(C0626c c0626c, C0625b c0625b) {
        int i = this.f8591j;
        for (int i4 = 0; i4 < i; i4++) {
            this.i[i4].i(c0626c, c0625b, false);
        }
        this.f8591j = 0;
    }

    public final String toString() {
        return "" + this.f8585b;
    }
}
