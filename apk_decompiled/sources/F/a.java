package F;

import android.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f468a;

    /* renamed from: b, reason: collision with root package name */
    public final float f469b;

    /* renamed from: c, reason: collision with root package name */
    public final float f470c;

    /* renamed from: d, reason: collision with root package name */
    public final float f471d;

    /* renamed from: e, reason: collision with root package name */
    public final float f472e;

    /* renamed from: f, reason: collision with root package name */
    public final float f473f;

    public a(float f2, float f4, float f5, float f6, float f7, float f8) {
        this.f468a = f2;
        this.f469b = f4;
        this.f470c = f5;
        this.f471d = f6;
        this.f472e = f7;
        this.f473f = f8;
    }

    public static a a(int i) {
        r rVar = r.f506k;
        float e4 = b.e(Color.red(i));
        float e5 = b.e(Color.green(i));
        float e6 = b.e(Color.blue(i));
        float[][] fArr = b.f477d;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * e6) + (fArr2[1] * e5) + (fArr2[0] * e4);
        float[] fArr3 = fArr[1];
        float f4 = (fArr3[2] * e6) + (fArr3[1] * e5) + (fArr3[0] * e4);
        float[] fArr4 = fArr[2];
        float f5 = (e6 * fArr4[2]) + (e5 * fArr4[1]) + (e4 * fArr4[0]);
        float[][] fArr5 = b.f474a;
        float[] fArr6 = fArr5[0];
        float f6 = (fArr6[2] * f5) + (fArr6[1] * f4) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f7 = (fArr7[2] * f5) + (fArr7[1] * f4) + (fArr7[0] * f2);
        float[] fArr8 = fArr5[2];
        float f8 = (f5 * fArr8[2]) + (f4 * fArr8[1]) + (f2 * fArr8[0]);
        float[] fArr9 = rVar.f513g;
        float f9 = fArr9[0] * f6;
        float f10 = fArr9[1] * f7;
        float f11 = fArr9[2] * f8;
        float abs = Math.abs(f9);
        float f12 = rVar.h;
        float pow = (float) Math.pow((abs * f12) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f10) * f12) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f11) * f12) / 100.0d, 0.42d);
        float signum = ((Math.signum(f9) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f10) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f11) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d4 = signum3;
        float f13 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d4)) / 11.0f;
        float f14 = ((float) ((signum + signum2) - (d4 * 2.0d))) / 9.0f;
        float f15 = signum2 * 20.0f;
        float f16 = ((21.0f * signum3) + ((signum * 20.0f) + f15)) / 20.0f;
        float f17 = (((signum * 40.0f) + f15) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f14, f13)) * 180.0f) / 3.1415927f;
        if (atan2 < BitmapDescriptorFactory.HUE_RED) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f18 = atan2;
        float f19 = (3.1415927f * f18) / 180.0f;
        float f20 = f17 * rVar.f508b;
        float f21 = rVar.f507a;
        float f22 = rVar.f510d;
        float pow4 = ((float) Math.pow(f20 / f21, rVar.f514j * f22)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f23 = f21 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, rVar.f512f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f18) < 20.14d ? f18 + 360.0f : f18) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * rVar.f511e) * rVar.f509c) * ((float) Math.sqrt((f14 * f14) + (f13 * f13)))) / (f16 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f24 = rVar.i * pow5;
        Math.sqrt((r3 * f22) / f23);
        float f25 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f24 * 0.0228f) + 1.0f)) * 43.85965f;
        double d5 = f19;
        return new a(f18, pow5, pow4, f25, log * ((float) Math.cos(d5)), log * ((float) Math.sin(d5)));
    }

    public static a b(float f2, float f4, float f5) {
        r rVar = r.f506k;
        float f6 = rVar.f510d;
        Math.sqrt(f2 / 100.0d);
        float f7 = rVar.f507a + 4.0f;
        float f8 = rVar.i * f4;
        Math.sqrt(((f4 / ((float) Math.sqrt(r1))) * rVar.f510d) / f7);
        float f9 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log = ((float) Math.log((f8 * 0.0228d) + 1.0d)) * 43.85965f;
        double d4 = (3.1415927f * f5) / 180.0f;
        return new a(f5, f4, f2, f9, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    public final int c(r rVar) {
        float f2;
        float f4 = this.f469b;
        double d4 = f4;
        float f5 = this.f470c;
        if (d4 != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            double d5 = f5;
            if (d5 != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                f2 = f4 / ((float) Math.sqrt(d5 / 100.0d));
                float pow = (float) Math.pow(f2 / Math.pow(1.64d - Math.pow(0.29d, rVar.f512f), 0.73d), 1.1111111111111112d);
                double d6 = (this.f468a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d6) + 3.8d)) * 0.25f;
                float pow2 = rVar.f507a * ((float) Math.pow(f5 / 100.0d, (1.0d / rVar.f510d) / rVar.f514j));
                float f6 = cos * 3846.1538f * rVar.f511e * rVar.f509c;
                float f7 = pow2 / rVar.f508b;
                float sin = (float) Math.sin(d6);
                float cos2 = (float) Math.cos(d6);
                float f8 = (((0.305f + f7) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f6 * 23.0f)));
                float f9 = cos2 * f8;
                float f10 = f8 * sin;
                float f11 = f7 * 460.0f;
                float f12 = ((288.0f * f10) + ((451.0f * f9) + f11)) / 1403.0f;
                float f13 = ((f11 - (891.0f * f9)) - (261.0f * f10)) / 1403.0f;
                float f14 = ((f11 - (f9 * 220.0f)) - (f10 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12)));
                float signum = Math.signum(f12);
                float f15 = 100.0f / rVar.h;
                float pow3 = signum * f15 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f13) * f15 * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f13) * 27.13d) / (400.0d - Math.abs(f13))), 2.380952380952381d));
                float signum3 = Math.signum(f14) * f15 * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f14) * 27.13d) / (400.0d - Math.abs(f14))), 2.380952380952381d));
                float[] fArr = rVar.f513g;
                float f16 = pow3 / fArr[0];
                float f17 = signum2 / fArr[1];
                float f18 = signum3 / fArr[2];
                float[][] fArr2 = b.f475b;
                float[] fArr3 = fArr2[0];
                float f19 = (fArr3[2] * f18) + (fArr3[1] * f17) + (fArr3[0] * f16);
                float[] fArr4 = fArr2[1];
                float f20 = (fArr4[2] * f18) + (fArr4[1] * f17) + (fArr4[0] * f16);
                float[] fArr5 = fArr2[2];
                return G.a.a(f19, f20, (f18 * fArr5[2]) + (f17 * fArr5[1]) + (f16 * fArr5[0]));
            }
        }
        f2 = BitmapDescriptorFactory.HUE_RED;
        float pow4 = (float) Math.pow(f2 / Math.pow(1.64d - Math.pow(0.29d, rVar.f512f), 0.73d), 1.1111111111111112d);
        double d62 = (this.f468a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d62) + 3.8d)) * 0.25f;
        float pow22 = rVar.f507a * ((float) Math.pow(f5 / 100.0d, (1.0d / rVar.f510d) / rVar.f514j));
        float f62 = cos3 * 3846.1538f * rVar.f511e * rVar.f509c;
        float f72 = pow22 / rVar.f508b;
        float sin2 = (float) Math.sin(d62);
        float cos22 = (float) Math.cos(d62);
        float f82 = (((0.305f + f72) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (f62 * 23.0f)));
        float f92 = cos22 * f82;
        float f102 = f82 * sin2;
        float f112 = f72 * 460.0f;
        float f122 = ((288.0f * f102) + ((451.0f * f92) + f112)) / 1403.0f;
        float f132 = ((f112 - (891.0f * f92)) - (261.0f * f102)) / 1403.0f;
        float f142 = ((f112 - (f92 * 220.0f)) - (f102 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f122) * 27.13d) / (400.0d - Math.abs(f122)));
        float signum4 = Math.signum(f122);
        float f152 = 100.0f / rVar.h;
        float pow32 = signum4 * f152 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f132) * f152 * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f132) * 27.13d) / (400.0d - Math.abs(f132))), 2.380952380952381d));
        float signum32 = Math.signum(f142) * f152 * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f142) * 27.13d) / (400.0d - Math.abs(f142))), 2.380952380952381d));
        float[] fArr6 = rVar.f513g;
        float f162 = pow32 / fArr6[0];
        float f172 = signum22 / fArr6[1];
        float f182 = signum32 / fArr6[2];
        float[][] fArr22 = b.f475b;
        float[] fArr32 = fArr22[0];
        float f192 = (fArr32[2] * f182) + (fArr32[1] * f172) + (fArr32[0] * f162);
        float[] fArr42 = fArr22[1];
        float f202 = (fArr42[2] * f182) + (fArr42[1] * f172) + (fArr42[0] * f162);
        float[] fArr52 = fArr22[2];
        return G.a.a(f192, f202, (f182 * fArr52[2]) + (f172 * fArr52[1]) + (f162 * fArr52[0]));
    }
}
