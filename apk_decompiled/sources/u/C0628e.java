package u;

import F.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* renamed from: u.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0628e extends C0625b {

    /* renamed from: f, reason: collision with root package name */
    public C0630g[] f8581f;

    /* renamed from: g, reason: collision with root package name */
    public C0630g[] f8582g;
    public int h;
    public i i;

    @Override // u.C0625b
    public final C0630g d(boolean[] zArr) {
        int i = -1;
        for (int i4 = 0; i4 < this.h; i4++) {
            C0630g[] c0630gArr = this.f8581f;
            C0630g c0630g = c0630gArr[i4];
            if (!zArr[c0630g.f8585b]) {
                i iVar = this.i;
                iVar.f490b = c0630g;
                int i5 = 8;
                if (i == -1) {
                    while (i5 >= 0) {
                        float f2 = ((C0630g) iVar.f490b).h[i5];
                        if (f2 <= BitmapDescriptorFactory.HUE_RED) {
                            if (f2 < BitmapDescriptorFactory.HUE_RED) {
                                i = i4;
                                break;
                            }
                            i5--;
                        }
                    }
                } else {
                    C0630g c0630g2 = c0630gArr[i];
                    while (true) {
                        if (i5 >= 0) {
                            float f4 = c0630g2.h[i5];
                            float f5 = ((C0630g) iVar.f490b).h[i5];
                            if (f5 == f4) {
                                i5--;
                            } else if (f5 >= f4) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f8581f[i];
    }

    @Override // u.C0625b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // u.C0625b
    public final void i(C0626c c0626c, C0625b c0625b, boolean z3) {
        C0630g c0630g = c0625b.f8562a;
        if (c0630g == null) {
            return;
        }
        C0624a c0624a = c0625b.f8565d;
        int d4 = c0624a.d();
        for (int i = 0; i < d4; i++) {
            C0630g e4 = c0624a.e(i);
            float f2 = c0624a.f(i);
            i iVar = this.i;
            iVar.f490b = e4;
            boolean z4 = e4.f8584a;
            float[] fArr = c0630g.h;
            if (z4) {
                boolean z5 = true;
                for (int i4 = 0; i4 < 9; i4++) {
                    float[] fArr2 = ((C0630g) iVar.f490b).h;
                    float f4 = (fArr[i4] * f2) + fArr2[i4];
                    fArr2[i4] = f4;
                    if (Math.abs(f4) < 1.0E-4f) {
                        ((C0630g) iVar.f490b).h[i4] = 0.0f;
                    } else {
                        z5 = false;
                    }
                }
                if (z5) {
                    ((C0628e) iVar.f491c).k((C0630g) iVar.f490b);
                }
            } else {
                for (int i5 = 0; i5 < 9; i5++) {
                    float f5 = fArr[i5];
                    if (f5 != BitmapDescriptorFactory.HUE_RED) {
                        float f6 = f5 * f2;
                        if (Math.abs(f6) < 1.0E-4f) {
                            f6 = 0.0f;
                        }
                        ((C0630g) iVar.f490b).h[i5] = f6;
                    } else {
                        ((C0630g) iVar.f490b).h[i5] = 0.0f;
                    }
                }
                j(e4);
            }
            this.f8563b = (c0625b.f8563b * f2) + this.f8563b;
        }
        k(c0630g);
    }

    public final void j(C0630g c0630g) {
        int i;
        int i4 = this.h + 1;
        C0630g[] c0630gArr = this.f8581f;
        if (i4 > c0630gArr.length) {
            C0630g[] c0630gArr2 = (C0630g[]) Arrays.copyOf(c0630gArr, c0630gArr.length * 2);
            this.f8581f = c0630gArr2;
            this.f8582g = (C0630g[]) Arrays.copyOf(c0630gArr2, c0630gArr2.length * 2);
        }
        C0630g[] c0630gArr3 = this.f8581f;
        int i5 = this.h;
        c0630gArr3[i5] = c0630g;
        int i6 = i5 + 1;
        this.h = i6;
        if (i6 > 1 && c0630gArr3[i5].f8585b > c0630g.f8585b) {
            int i7 = 0;
            while (true) {
                i = this.h;
                if (i7 >= i) {
                    break;
                }
                this.f8582g[i7] = this.f8581f[i7];
                i7++;
            }
            Arrays.sort(this.f8582g, 0, i, new A.i(6));
            for (int i8 = 0; i8 < this.h; i8++) {
                this.f8581f[i8] = this.f8582g[i8];
            }
        }
        c0630g.f8584a = true;
        c0630g.a(this);
    }

    public final void k(C0630g c0630g) {
        int i = 0;
        while (i < this.h) {
            if (this.f8581f[i] == c0630g) {
                while (true) {
                    int i4 = this.h;
                    if (i >= i4 - 1) {
                        this.h = i4 - 1;
                        c0630g.f8584a = false;
                        return;
                    } else {
                        C0630g[] c0630gArr = this.f8581f;
                        int i5 = i + 1;
                        c0630gArr[i] = c0630gArr[i5];
                        i = i5;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // u.C0625b
    public final String toString() {
        String str = " goal -> (" + this.f8563b + ") : ";
        for (int i = 0; i < this.h; i++) {
            C0630g c0630g = this.f8581f[i];
            i iVar = this.i;
            iVar.f490b = c0630g;
            str = str + iVar + " ";
        }
        return str;
    }
}
