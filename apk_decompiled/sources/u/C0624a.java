package u;

import C.w;
import R0.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624a {

    /* renamed from: b, reason: collision with root package name */
    public final C0625b f8555b;

    /* renamed from: c, reason: collision with root package name */
    public final h f8556c;

    /* renamed from: a, reason: collision with root package name */
    public int f8554a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f8557d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f8558e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f8559f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f8560g = new float[8];
    public int h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8561j = false;

    public C0624a(C0625b c0625b, h hVar) {
        this.f8555b = c0625b;
        this.f8556c = hVar;
    }

    public final void a(C0630g c0630g, float f2, boolean z3) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.h;
            C0625b c0625b = this.f8555b;
            if (i == -1) {
                this.h = 0;
                this.f8560g[0] = f2;
                this.f8558e[0] = c0630g.f8585b;
                this.f8559f[0] = -1;
                c0630g.f8592k++;
                c0630g.a(c0625b);
                this.f8554a++;
                if (this.f8561j) {
                    return;
                }
                int i4 = this.i + 1;
                this.i = i4;
                int[] iArr = this.f8558e;
                if (i4 >= iArr.length) {
                    this.f8561j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i5 = -1;
            for (int i6 = 0; i != -1 && i6 < this.f8554a; i6++) {
                int i7 = this.f8558e[i];
                int i8 = c0630g.f8585b;
                if (i7 == i8) {
                    float[] fArr = this.f8560g;
                    float f4 = fArr[i] + f2;
                    if (f4 > -0.001f && f4 < 0.001f) {
                        f4 = 0.0f;
                    }
                    fArr[i] = f4;
                    if (f4 == BitmapDescriptorFactory.HUE_RED) {
                        if (i == this.h) {
                            this.h = this.f8559f[i];
                        } else {
                            int[] iArr2 = this.f8559f;
                            iArr2[i5] = iArr2[i];
                        }
                        if (z3) {
                            c0630g.b(c0625b);
                        }
                        if (this.f8561j) {
                            this.i = i;
                        }
                        c0630g.f8592k--;
                        this.f8554a--;
                        return;
                    }
                    return;
                }
                if (i7 < i8) {
                    i5 = i;
                }
                i = this.f8559f[i];
            }
            int i9 = this.i;
            int i10 = i9 + 1;
            if (this.f8561j) {
                int[] iArr3 = this.f8558e;
                if (iArr3[i9] != -1) {
                    i9 = iArr3.length;
                }
            } else {
                i9 = i10;
            }
            int[] iArr4 = this.f8558e;
            if (i9 >= iArr4.length && this.f8554a < iArr4.length) {
                int i11 = 0;
                while (true) {
                    int[] iArr5 = this.f8558e;
                    if (i11 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i11] == -1) {
                        i9 = i11;
                        break;
                    }
                    i11++;
                }
            }
            int[] iArr6 = this.f8558e;
            if (i9 >= iArr6.length) {
                i9 = iArr6.length;
                int i12 = this.f8557d * 2;
                this.f8557d = i12;
                this.f8561j = false;
                this.i = i9 - 1;
                this.f8560g = Arrays.copyOf(this.f8560g, i12);
                this.f8558e = Arrays.copyOf(this.f8558e, this.f8557d);
                this.f8559f = Arrays.copyOf(this.f8559f, this.f8557d);
            }
            this.f8558e[i9] = c0630g.f8585b;
            this.f8560g[i9] = f2;
            if (i5 != -1) {
                int[] iArr7 = this.f8559f;
                iArr7[i9] = iArr7[i5];
                iArr7[i5] = i9;
            } else {
                this.f8559f[i9] = this.h;
                this.h = i9;
            }
            c0630g.f8592k++;
            c0630g.a(c0625b);
            this.f8554a++;
            if (!this.f8561j) {
                this.i++;
            }
            int i13 = this.i;
            int[] iArr8 = this.f8558e;
            if (i13 >= iArr8.length) {
                this.f8561j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.h;
        for (int i4 = 0; i != -1 && i4 < this.f8554a; i4++) {
            C0630g c0630g = ((C0630g[]) this.f8556c.f1415c)[this.f8558e[i]];
            if (c0630g != null) {
                c0630g.b(this.f8555b);
            }
            i = this.f8559f[i];
        }
        this.h = -1;
        this.i = -1;
        this.f8561j = false;
        this.f8554a = 0;
    }

    public final float c(C0630g c0630g) {
        int i = this.h;
        for (int i4 = 0; i != -1 && i4 < this.f8554a; i4++) {
            if (this.f8558e[i] == c0630g.f8585b) {
                return this.f8560g[i];
            }
            i = this.f8559f[i];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final int d() {
        return this.f8554a;
    }

    public final C0630g e(int i) {
        int i4 = this.h;
        for (int i5 = 0; i4 != -1 && i5 < this.f8554a; i5++) {
            if (i5 == i) {
                return ((C0630g[]) this.f8556c.f1415c)[this.f8558e[i4]];
            }
            i4 = this.f8559f[i4];
        }
        return null;
    }

    public final float f(int i) {
        int i4 = this.h;
        for (int i5 = 0; i4 != -1 && i5 < this.f8554a; i5++) {
            if (i5 == i) {
                return this.f8560g[i4];
            }
            i4 = this.f8559f[i4];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final void g(C0630g c0630g, float f2) {
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            h(c0630g, true);
            return;
        }
        int i = this.h;
        C0625b c0625b = this.f8555b;
        if (i == -1) {
            this.h = 0;
            this.f8560g[0] = f2;
            this.f8558e[0] = c0630g.f8585b;
            this.f8559f[0] = -1;
            c0630g.f8592k++;
            c0630g.a(c0625b);
            this.f8554a++;
            if (this.f8561j) {
                return;
            }
            int i4 = this.i + 1;
            this.i = i4;
            int[] iArr = this.f8558e;
            if (i4 >= iArr.length) {
                this.f8561j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i5 = -1;
        for (int i6 = 0; i != -1 && i6 < this.f8554a; i6++) {
            int i7 = this.f8558e[i];
            int i8 = c0630g.f8585b;
            if (i7 == i8) {
                this.f8560g[i] = f2;
                return;
            }
            if (i7 < i8) {
                i5 = i;
            }
            i = this.f8559f[i];
        }
        int i9 = this.i;
        int i10 = i9 + 1;
        if (this.f8561j) {
            int[] iArr2 = this.f8558e;
            if (iArr2[i9] != -1) {
                i9 = iArr2.length;
            }
        } else {
            i9 = i10;
        }
        int[] iArr3 = this.f8558e;
        if (i9 >= iArr3.length && this.f8554a < iArr3.length) {
            int i11 = 0;
            while (true) {
                int[] iArr4 = this.f8558e;
                if (i11 >= iArr4.length) {
                    break;
                }
                if (iArr4[i11] == -1) {
                    i9 = i11;
                    break;
                }
                i11++;
            }
        }
        int[] iArr5 = this.f8558e;
        if (i9 >= iArr5.length) {
            i9 = iArr5.length;
            int i12 = this.f8557d * 2;
            this.f8557d = i12;
            this.f8561j = false;
            this.i = i9 - 1;
            this.f8560g = Arrays.copyOf(this.f8560g, i12);
            this.f8558e = Arrays.copyOf(this.f8558e, this.f8557d);
            this.f8559f = Arrays.copyOf(this.f8559f, this.f8557d);
        }
        this.f8558e[i9] = c0630g.f8585b;
        this.f8560g[i9] = f2;
        if (i5 != -1) {
            int[] iArr6 = this.f8559f;
            iArr6[i9] = iArr6[i5];
            iArr6[i5] = i9;
        } else {
            this.f8559f[i9] = this.h;
            this.h = i9;
        }
        c0630g.f8592k++;
        c0630g.a(c0625b);
        int i13 = this.f8554a + 1;
        this.f8554a = i13;
        if (!this.f8561j) {
            this.i++;
        }
        int[] iArr7 = this.f8558e;
        if (i13 >= iArr7.length) {
            this.f8561j = true;
        }
        if (this.i >= iArr7.length) {
            this.f8561j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(C0630g c0630g, boolean z3) {
        int i = this.h;
        if (i == -1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i4 = 0;
        int i5 = -1;
        while (i != -1 && i4 < this.f8554a) {
            if (this.f8558e[i] == c0630g.f8585b) {
                if (i == this.h) {
                    this.h = this.f8559f[i];
                } else {
                    int[] iArr = this.f8559f;
                    iArr[i5] = iArr[i];
                }
                if (z3) {
                    c0630g.b(this.f8555b);
                }
                c0630g.f8592k--;
                this.f8554a--;
                this.f8558e[i] = -1;
                if (this.f8561j) {
                    this.i = i;
                }
                return this.f8560g[i];
            }
            i4++;
            i5 = i;
            i = this.f8559f[i];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i4 = 0; i != -1 && i4 < this.f8554a; i4++) {
            StringBuilder a2 = AbstractC0629f.a(w.n(str, " -> "));
            a2.append(this.f8560g[i]);
            a2.append(" : ");
            StringBuilder a4 = AbstractC0629f.a(a2.toString());
            a4.append(((C0630g[]) this.f8556c.f1415c)[this.f8558e[i]]);
            str = a4.toString();
            i = this.f8559f[i];
        }
        return str;
    }
}
