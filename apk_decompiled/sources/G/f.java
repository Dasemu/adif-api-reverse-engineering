package G;

import a.AbstractC0105a;
import android.graphics.Path;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public char f563a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f564b;

    public f(char c4, float[] fArr) {
        this.f563a = c4;
        this.f564b = fArr;
    }

    public static void a(Path path, float f2, float f4, float f5, float f6, float f7, float f8, float f9, boolean z3, boolean z4) {
        double d4;
        double d5;
        double radians = Math.toRadians(f9);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d6 = f2;
        double d7 = f4;
        double d8 = f7;
        double d9 = ((d7 * sin) + (d6 * cos)) / d8;
        double d10 = f8;
        double d11 = ((d7 * cos) + ((-f2) * sin)) / d10;
        double d12 = f6;
        double d13 = ((d12 * sin) + (f5 * cos)) / d8;
        double d14 = ((d12 * cos) + ((-f5) * sin)) / d10;
        double d15 = d9 - d13;
        double d16 = d11 - d14;
        double d17 = (d9 + d13) / 2.0d;
        double d18 = (d11 + d14) / 2.0d;
        double d19 = (d16 * d16) + (d15 * d15);
        if (d19 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            Log.w("PathParser", "Points are too far apart " + d19);
            float sqrt = (float) (Math.sqrt(d19) / 1.99999d);
            a(path, f2, f4, f5, f6, f7 * sqrt, sqrt * f8, f9, z3, z4);
            return;
        }
        double sqrt2 = Math.sqrt(d20);
        double d21 = sqrt2 * d15;
        double d22 = sqrt2 * d16;
        if (z3 == z4) {
            d4 = d17 - d22;
            d5 = d18 + d21;
        } else {
            d4 = d17 + d22;
            d5 = d18 - d21;
        }
        double atan2 = Math.atan2(d11 - d5, d9 - d4);
        double atan22 = Math.atan2(d14 - d5, d13 - d4) - atan2;
        if (z4 != (atan22 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) {
            atan22 = atan22 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d23 = d4 * d8;
        double d24 = d5 * d10;
        double d25 = (d23 * cos) - (d24 * sin);
        double d26 = (d24 * cos) + (d23 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d27 = -d8;
        double d28 = d27 * cos2;
        double d29 = d10 * sin2;
        double d30 = (d28 * sin3) - (d29 * cos3);
        double d31 = d27 * sin2;
        double d32 = d10 * cos2;
        double d33 = atan22 / ceil;
        double d34 = (cos3 * d32) + (sin3 * d31);
        double d35 = d6;
        double d36 = d7;
        int i = 0;
        double d37 = atan2;
        while (i < ceil) {
            double d38 = d37 + d33;
            double sin4 = Math.sin(d38);
            double cos4 = Math.cos(d38);
            int i4 = ceil;
            double d39 = (((d8 * cos2) * cos4) + d25) - (d29 * sin4);
            double d40 = (d32 * sin4) + (d8 * sin2 * cos4) + d26;
            double d41 = (d28 * sin4) - (d29 * cos4);
            double d42 = (cos4 * d32) + (sin4 * d31);
            double d43 = d38 - d37;
            double tan = Math.tan(d43 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d43)) / 3.0d;
            path.rLineTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            path.cubicTo((float) ((d30 * sqrt3) + d35), (float) ((d34 * sqrt3) + d36), (float) (d39 - (sqrt3 * d41)), (float) (d40 - (sqrt3 * d42)), (float) d39, (float) d40);
            i++;
            d36 = d40;
            cos2 = cos2;
            d31 = d31;
            d37 = d38;
            d34 = d42;
            d35 = d39;
            ceil = i4;
            d30 = d41;
            d33 = d33;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(f[] fVarArr, Path path) {
        int i;
        int i4;
        f fVar;
        int i5;
        char c4;
        float f2;
        float f4;
        float f5;
        float f6;
        f fVar2;
        boolean z3;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        Path path2 = path;
        float[] fArr = new float[6];
        int length = fVarArr.length;
        char c5 = 'm';
        int i6 = 0;
        char c6 = 'm';
        int i7 = 0;
        while (i7 < length) {
            f fVar3 = fVarArr[i7];
            char c7 = fVar3.f563a;
            float f15 = fArr[i6];
            float f16 = fArr[1];
            float f17 = fArr[2];
            float f18 = fArr[3];
            float f19 = fArr[4];
            float f20 = fArr[5];
            switch (c7) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                    break;
            }
            i = 2;
            float f21 = f16;
            float f22 = f19;
            float f23 = f20;
            float f24 = f15;
            int i8 = i6;
            while (true) {
                float[] fArr2 = fVar3.f564b;
                if (i8 < fArr2.length) {
                    int i9 = i6;
                    if (c7 == 'A') {
                        i4 = i8;
                        fVar = fVar3;
                        float f25 = f24;
                        float f26 = f21;
                        i5 = i7;
                        c4 = c7;
                        int i10 = i4 + 5;
                        int i11 = i4 + 6;
                        a(path, f25, f26, fArr2[i10], fArr2[i11], fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != BitmapDescriptorFactory.HUE_RED ? 1 : i9, fArr2[i4 + 4] != BitmapDescriptorFactory.HUE_RED ? 1 : i9);
                        f17 = fArr2[i10];
                        f2 = fArr2[i11];
                        f18 = f2;
                        f4 = f17;
                    } else if (c7 == 'C') {
                        i4 = i8;
                        i5 = i7;
                        fVar = fVar3;
                        c4 = c7;
                        int i12 = i4 + 2;
                        int i13 = i4 + 3;
                        int i14 = i4 + 4;
                        int i15 = i4 + 5;
                        path2.cubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i12], fArr2[i13], fArr2[i14], fArr2[i15]);
                        float f27 = fArr2[i14];
                        float f28 = fArr2[i15];
                        f17 = fArr2[i12];
                        f18 = fArr2[i13];
                        f2 = f28;
                        f4 = f27;
                    } else if (c7 != 'H') {
                        if (c7 == 'Q') {
                            i4 = i8;
                            i5 = i7;
                            fVar = fVar3;
                            c4 = c7;
                            int i16 = i4 + 1;
                            int i17 = i4 + 2;
                            int i18 = i4 + 3;
                            path2.quadTo(fArr2[i4], fArr2[i16], fArr2[i17], fArr2[i18]);
                            f5 = fArr2[i4];
                            float f29 = fArr2[i16];
                            f6 = fArr2[i17];
                            f18 = f29;
                            f2 = fArr2[i18];
                        } else if (c7 == 'V') {
                            i4 = i8;
                            i5 = i7;
                            fVar = fVar3;
                            f4 = f24;
                            c4 = c7;
                            path2.lineTo(f4, fArr2[i4]);
                            f2 = fArr2[i4];
                        } else if (c7 != 'a') {
                            if (c7 == 'c') {
                                i4 = i8;
                                int i19 = i4 + 2;
                                int i20 = i4 + 3;
                                int i21 = i4 + 4;
                                int i22 = i4 + 5;
                                path2.rCubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i19], fArr2[i20], fArr2[i21], fArr2[i22]);
                                float f30 = fArr2[i19] + f24;
                                float f31 = f21 + fArr2[i20];
                                f24 += fArr2[i21];
                                f21 += fArr2[i22];
                                f17 = f30;
                                f18 = f31;
                            } else if (c7 != 'h') {
                                if (c7 != 'q') {
                                    if (c7 != 'v') {
                                        if (c7 == 'L') {
                                            i4 = i8;
                                            int i23 = i4 + 1;
                                            path2.lineTo(fArr2[i4], fArr2[i23]);
                                            f4 = fArr2[i4];
                                            f2 = fArr2[i23];
                                        } else if (c7 == 'M') {
                                            i4 = i8;
                                            f4 = fArr2[i4];
                                            f2 = fArr2[i4 + 1];
                                            if (i4 > 0) {
                                                path2.lineTo(f4, f2);
                                            } else {
                                                path2.moveTo(f4, f2);
                                                f22 = f4;
                                                f23 = f2;
                                            }
                                        } else if (c7 == 'S') {
                                            i4 = i8;
                                            if (c6 == 'c' || c6 == 's' || c6 == 'C' || c6 == 'S') {
                                                f24 = (f24 * 2.0f) - f17;
                                                f21 = (f21 * 2.0f) - f18;
                                            }
                                            float f32 = f24;
                                            float f33 = f21;
                                            int i24 = i4 + 1;
                                            int i25 = i4 + 2;
                                            int i26 = i4 + 3;
                                            path2.cubicTo(f32, f33, fArr2[i4], fArr2[i24], fArr2[i25], fArr2[i26]);
                                            f5 = fArr2[i4];
                                            float f34 = fArr2[i24];
                                            f6 = fArr2[i25];
                                            f18 = f34;
                                            f2 = fArr2[i26];
                                            i5 = i7;
                                            fVar = fVar3;
                                            c4 = c7;
                                        } else if (c7 == 'T') {
                                            i4 = i8;
                                            if (c6 == 'q' || c6 == 't' || c6 == 'Q' || c6 == 'T') {
                                                f24 = (f24 * 2.0f) - f17;
                                                f21 = (f21 * 2.0f) - f18;
                                            }
                                            float f35 = f21;
                                            float f36 = fArr2[i4];
                                            int i27 = i4 + 1;
                                            path2.quadTo(f24, f35, f36, fArr2[i27]);
                                            f18 = f35;
                                            f4 = fArr2[i4];
                                            f2 = fArr2[i27];
                                            i5 = i7;
                                            fVar = fVar3;
                                            f17 = f24;
                                            c4 = c7;
                                        } else if (c7 == 'l') {
                                            i4 = i8;
                                            int i28 = i4 + 1;
                                            path2.rLineTo(fArr2[i4], fArr2[i28]);
                                            f24 += fArr2[i4];
                                            f10 = fArr2[i28];
                                        } else if (c7 == c5) {
                                            i4 = i8;
                                            float f37 = fArr2[i4];
                                            f24 += f37;
                                            float f38 = fArr2[i4 + 1];
                                            f21 += f38;
                                            if (i4 > 0) {
                                                path2.rLineTo(f37, f38);
                                            } else {
                                                path2.rMoveTo(f37, f38);
                                                fVar = fVar3;
                                                f4 = f24;
                                                f22 = f4;
                                                f2 = f21;
                                                f23 = f2;
                                                i5 = i7;
                                                c4 = c7;
                                            }
                                        } else if (c7 == 's') {
                                            if (c6 == 'c' || c6 == 's' || c6 == 'C' || c6 == 'S') {
                                                f11 = f21 - f18;
                                                f12 = f24 - f17;
                                            } else {
                                                f12 = BitmapDescriptorFactory.HUE_RED;
                                                f11 = BitmapDescriptorFactory.HUE_RED;
                                            }
                                            int i29 = i8 + 1;
                                            int i30 = i8 + 2;
                                            int i31 = i8 + 3;
                                            i4 = i8;
                                            path2.rCubicTo(f12, f11, fArr2[i8], fArr2[i29], fArr2[i30], fArr2[i31]);
                                            f7 = fArr2[i4] + f24;
                                            f8 = f21 + fArr2[i29];
                                            f24 += fArr2[i30];
                                            f9 = fArr2[i31];
                                        } else if (c7 != 't') {
                                            i4 = i8;
                                        } else {
                                            if (c6 == 'q' || c6 == 't' || c6 == 'Q' || c6 == 'T') {
                                                f13 = f24 - f17;
                                                f14 = f21 - f18;
                                            } else {
                                                f14 = BitmapDescriptorFactory.HUE_RED;
                                                f13 = BitmapDescriptorFactory.HUE_RED;
                                            }
                                            int i32 = i8 + 1;
                                            path2.rQuadTo(f13, f14, fArr2[i8], fArr2[i32]);
                                            float f39 = f13 + f24;
                                            float f40 = f21 + f14;
                                            float f41 = f24 + fArr2[i8];
                                            f21 += fArr2[i32];
                                            f18 = f40;
                                            i4 = i8;
                                            fVar = fVar3;
                                            f4 = f41;
                                            f17 = f39;
                                            f2 = f21;
                                            i5 = i7;
                                            c4 = c7;
                                        }
                                        i5 = i7;
                                        fVar = fVar3;
                                        c4 = c7;
                                    } else {
                                        i4 = i8;
                                        path2.rLineTo(BitmapDescriptorFactory.HUE_RED, fArr2[i4]);
                                        f10 = fArr2[i4];
                                    }
                                    f21 += f10;
                                } else {
                                    i4 = i8;
                                    int i33 = i4 + 1;
                                    int i34 = i4 + 2;
                                    int i35 = i4 + 3;
                                    path2.rQuadTo(fArr2[i4], fArr2[i33], fArr2[i34], fArr2[i35]);
                                    f7 = fArr2[i4] + f24;
                                    f8 = f21 + fArr2[i33];
                                    f24 += fArr2[i34];
                                    f9 = fArr2[i35];
                                }
                                f21 += f9;
                                f17 = f7;
                                f18 = f8;
                            } else {
                                i4 = i8;
                                path2.rLineTo(fArr2[i4], BitmapDescriptorFactory.HUE_RED);
                                f24 += fArr2[i4];
                            }
                            fVar = fVar3;
                            f4 = f24;
                            f2 = f21;
                            i5 = i7;
                            c4 = c7;
                        } else {
                            i4 = i8;
                            int i36 = i4 + 5;
                            float f42 = fArr2[i36] + f24;
                            int i37 = i4 + 6;
                            float f43 = fArr2[i37] + f21;
                            float f44 = fArr2[i4];
                            float f45 = fArr2[i4 + 1];
                            float f46 = fArr2[i4 + 2];
                            if (fArr2[i4 + 3] != BitmapDescriptorFactory.HUE_RED) {
                                fVar2 = fVar3;
                                z3 = 1;
                            } else {
                                fVar2 = fVar3;
                                z3 = i9;
                            }
                            fVar = fVar2;
                            float f47 = f24;
                            c4 = c7;
                            float f48 = f21;
                            i5 = i7;
                            a(path, f47, f48, f42, f43, f44, f45, f46, z3, fArr2[i4 + 4] != BitmapDescriptorFactory.HUE_RED ? 1 : i9);
                            f4 = f47 + fArr2[i36];
                            f2 = f48 + fArr2[i37];
                            f17 = f4;
                            f18 = f2;
                        }
                        f17 = f5;
                        f4 = f6;
                    } else {
                        i4 = i8;
                        fVar = fVar3;
                        c4 = c7;
                        f2 = f21;
                        i5 = i7;
                        path2.lineTo(fArr2[i4], f2);
                        f4 = fArr2[i4];
                    }
                    c7 = c4;
                    fVar3 = fVar;
                    i7 = i5;
                    i6 = i9;
                    c5 = 'm';
                    f24 = f4;
                    f21 = f2;
                    c6 = c7;
                    i8 = i4 + i;
                    path2 = path;
                }
            }
            int i38 = i6;
            fArr[i38] = f24;
            fArr[1] = f21;
            fArr[2] = f17;
            fArr[3] = f18;
            fArr[4] = f22;
            fArr[5] = f23;
            c6 = fVar3.f563a;
            i7++;
            path2 = path;
            i6 = i38;
            c5 = 'm';
        }
    }

    public f(f fVar) {
        this.f563a = fVar.f563a;
        float[] fArr = fVar.f564b;
        this.f564b = AbstractC0105a.n(fArr, fArr.length);
    }
}
