package C;

import android.content.res.TypedArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public Object f267a = new R1.c();

    public abstract void a(A.j jVar);

    public R1.c b() {
        R1.c cVar = (R1.c) this.f267a;
        int i = cVar.f1423f;
        int[] iArr = cVar.f1419b;
        if (i != 1) {
            int i4 = cVar.f1422e;
            iArr[0] = i4;
            int i5 = cVar.f1421d;
            iArr[1] = i5;
            iArr[2] = i5;
            iArr[3] = i4;
        } else {
            int i6 = cVar.f1421d;
            iArr[0] = i6;
            iArr[1] = i6;
            int i7 = cVar.f1422e;
            iArr[2] = i7;
            iArr[3] = i7;
        }
        float[] fArr = cVar.f1418a;
        if (i != 1) {
            fArr[0] = Math.max(((1.0f - cVar.f1426k) - cVar.f1427l) / 2.0f, BitmapDescriptorFactory.HUE_RED);
            fArr[1] = Math.max(((1.0f - cVar.f1426k) - 0.001f) / 2.0f, BitmapDescriptorFactory.HUE_RED);
            fArr[2] = Math.min(((cVar.f1426k + 1.0f) + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min(((cVar.f1426k + 1.0f) + cVar.f1427l) / 2.0f, 1.0f);
            return cVar;
        }
        fArr[0] = 0.0f;
        fArr[1] = Math.min(cVar.f1426k, 1.0f);
        fArr[2] = Math.min(cVar.f1426k + cVar.f1427l, 1.0f);
        fArr[3] = 1.0f;
        return cVar;
    }

    public v c(TypedArray typedArray) {
        boolean hasValue = typedArray.hasValue(3);
        R1.c cVar = (R1.c) this.f267a;
        if (hasValue) {
            cVar.f1429n = typedArray.getBoolean(3, cVar.f1429n);
        }
        if (typedArray.hasValue(0)) {
            cVar.f1430o = typedArray.getBoolean(0, cVar.f1430o);
        }
        if (typedArray.hasValue(1)) {
            cVar.f1422e = (((int) (Math.min(1.0f, Math.max(BitmapDescriptorFactory.HUE_RED, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (cVar.f1422e & 16777215);
        }
        if (typedArray.hasValue(11)) {
            cVar.f1421d = (((int) (Math.min(1.0f, Math.max(BitmapDescriptorFactory.HUE_RED, typedArray.getFloat(11, 1.0f))) * 255.0f)) << 24) | (cVar.f1421d & 16777215);
        }
        if (typedArray.hasValue(7)) {
            long j4 = typedArray.getInt(7, (int) cVar.f1433s);
            if (j4 < 0) {
                throw new IllegalArgumentException(w.l("Given a negative duration: ", j4));
            }
            cVar.f1433s = j4;
        }
        if (typedArray.hasValue(14)) {
            cVar.f1431q = typedArray.getInt(14, cVar.f1431q);
        }
        if (typedArray.hasValue(15)) {
            long j5 = typedArray.getInt(15, (int) cVar.f1434t);
            if (j5 < 0) {
                throw new IllegalArgumentException(w.l("Given a negative repeat delay: ", j5));
            }
            cVar.f1434t = j5;
        }
        if (typedArray.hasValue(16)) {
            cVar.f1432r = typedArray.getInt(16, cVar.f1432r);
        }
        if (typedArray.hasValue(5)) {
            int i = typedArray.getInt(5, cVar.f1420c);
            if (i == 1) {
                cVar.f1420c = 1;
            } else if (i == 2) {
                cVar.f1420c = 2;
            } else if (i != 3) {
                cVar.f1420c = 0;
            } else {
                cVar.f1420c = 3;
            }
        }
        if (typedArray.hasValue(17)) {
            if (typedArray.getInt(17, cVar.f1423f) != 1) {
                cVar.f1423f = 0;
            } else {
                cVar.f1423f = 1;
            }
        }
        if (typedArray.hasValue(6)) {
            float f2 = typedArray.getFloat(6, cVar.f1427l);
            if (f2 < BitmapDescriptorFactory.HUE_RED) {
                throw new IllegalArgumentException("Given invalid dropoff value: " + f2);
            }
            cVar.f1427l = f2;
        }
        if (typedArray.hasValue(9)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, cVar.f1424g);
            if (dimensionPixelSize < 0) {
                throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(dimensionPixelSize, "Given invalid width: "));
            }
            cVar.f1424g = dimensionPixelSize;
        }
        if (typedArray.hasValue(8)) {
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, cVar.h);
            if (dimensionPixelSize2 < 0) {
                throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(dimensionPixelSize2, "Given invalid height: "));
            }
            cVar.h = dimensionPixelSize2;
        }
        if (typedArray.hasValue(13)) {
            float f4 = typedArray.getFloat(13, cVar.f1426k);
            if (f4 < BitmapDescriptorFactory.HUE_RED) {
                throw new IllegalArgumentException("Given invalid intensity value: " + f4);
            }
            cVar.f1426k = f4;
        }
        if (typedArray.hasValue(19)) {
            float f5 = typedArray.getFloat(19, cVar.i);
            if (f5 < BitmapDescriptorFactory.HUE_RED) {
                throw new IllegalArgumentException("Given invalid width ratio: " + f5);
            }
            cVar.i = f5;
        }
        if (typedArray.hasValue(10)) {
            float f6 = typedArray.getFloat(10, cVar.f1425j);
            if (f6 < BitmapDescriptorFactory.HUE_RED) {
                throw new IllegalArgumentException("Given invalid height ratio: " + f6);
            }
            cVar.f1425j = f6;
        }
        if (typedArray.hasValue(18)) {
            cVar.f1428m = typedArray.getFloat(18, cVar.f1428m);
        }
        return e();
    }

    public abstract String d();

    public abstract v e();
}
