package B0;

import android.view.animation.AnimationUtils;
import androidx.fragment.app.RunnableC0141d;
import c0.C0279e;
import c0.C0280f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u extends y {

    /* renamed from: a, reason: collision with root package name */
    public long f166a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f167b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f168c;

    /* renamed from: d, reason: collision with root package name */
    public C0279e f169d;

    /* renamed from: e, reason: collision with root package name */
    public final G f170e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0141d f171f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D f172g;

    public u(D d4) {
        this.f172g = d4;
        G g4 = new G();
        long[] jArr = new long[20];
        g4.f103c = jArr;
        g4.f104d = new float[20];
        g4.f102b = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f170e = g4;
    }

    @Override // B0.y, B0.v
    public final void e(x xVar) {
        this.f168c = true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, c0.d] */
    public final void g() {
        float sqrt;
        char c4;
        long[] jArr;
        if (this.f169d != null) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f2 = (float) this.f166a;
        G g4 = this.f170e;
        char c5 = 20;
        int i = (g4.f102b + 1) % 20;
        g4.f102b = i;
        ((long[]) g4.f103c)[i] = currentAnimationTimeMillis;
        ((float[]) g4.f104d)[i] = f2;
        ?? obj = new Object();
        float f4 = BitmapDescriptorFactory.HUE_RED;
        obj.f4208a = BitmapDescriptorFactory.HUE_RED;
        this.f169d = new C0279e(obj);
        C0280f c0280f = new C0280f();
        c0280f.f4221b = 1.0f;
        int i4 = 0;
        c0280f.f4222c = false;
        c0280f.f4220a = Math.sqrt(200.0f);
        c0280f.f4222c = false;
        C0279e c0279e = this.f169d;
        c0279e.f4218l = c0280f;
        c0279e.f4210b = (float) this.f166a;
        c0279e.f4211c = true;
        if (c0279e.f4213e) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList arrayList = c0279e.f4217k;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        C0279e c0279e2 = this.f169d;
        int i5 = g4.f102b;
        long[] jArr2 = (long[]) g4.f103c;
        long j4 = Long.MIN_VALUE;
        if (i5 != 0 || jArr2[i5] != Long.MIN_VALUE) {
            long j5 = jArr2[i5];
            long j6 = j5;
            while (true) {
                long j7 = jArr2[i5];
                if (j7 != j4) {
                    float f5 = (float) (j5 - j7);
                    float abs = (float) Math.abs(j7 - j6);
                    if (f5 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    if (i5 == 0) {
                        i5 = 20;
                    }
                    i5--;
                    i4++;
                    if (i4 >= 20) {
                        break;
                    }
                    j6 = j7;
                    j4 = Long.MIN_VALUE;
                } else {
                    break;
                }
            }
            if (i4 >= 2) {
                float[] fArr = (float[]) g4.f104d;
                if (i4 == 2) {
                    int i6 = g4.f102b;
                    int i7 = i6 == 0 ? 19 : i6 - 1;
                    float f6 = (float) (jArr2[i6] - jArr2[i7]);
                    if (f6 != BitmapDescriptorFactory.HUE_RED) {
                        sqrt = (fArr[i6] - fArr[i7]) / f6;
                    }
                } else {
                    int i8 = g4.f102b;
                    int i9 = ((i8 - i4) + 21) % 20;
                    int i10 = (i8 + 21) % 20;
                    long j8 = jArr2[i9];
                    float f7 = fArr[i9];
                    int i11 = i9 + 1;
                    int i12 = i11 % 20;
                    float f8 = 0.0f;
                    while (i12 != i10) {
                        long j9 = jArr2[i12];
                        float f9 = f4;
                        int i13 = i10;
                        float f10 = (float) (j9 - j8);
                        if (f10 == f9) {
                            c4 = c5;
                            jArr = jArr2;
                        } else {
                            float f11 = fArr[i12];
                            c4 = c5;
                            jArr = jArr2;
                            float f12 = (f11 - f7) / f10;
                            float abs2 = (Math.abs(f12) * (f12 - ((float) (Math.sqrt(2.0f * Math.abs(f8)) * Math.signum(f8))))) + f8;
                            if (i12 == i11) {
                                abs2 *= 0.5f;
                            }
                            f8 = abs2;
                            f7 = f11;
                            j8 = j9;
                        }
                        i12 = (i12 + 1) % 20;
                        f4 = f9;
                        i10 = i13;
                        c5 = c4;
                        jArr2 = jArr;
                    }
                    sqrt = (float) (Math.sqrt(Math.abs(f8) * 2.0f) * Math.signum(f8));
                }
                f4 = sqrt * 1000.0f;
            }
        }
        c0279e2.f4209a = f4;
        C0279e c0279e3 = this.f169d;
        c0279e3.f4214f = (float) (this.f172g.f203x + 1);
        c0279e3.f4215g = -1.0f;
        c0279e3.i = 4.0f;
        t tVar = new t(this);
        ArrayList arrayList2 = c0279e3.f4216j;
        if (arrayList2.contains(tVar)) {
            return;
        }
        arrayList2.add(tVar);
    }
}
