package E2;

import a.AbstractC0106b;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final t[] f439a = new t[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f440b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f441c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f442d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f443e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f444f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final t f445g = new t();
    public final float[] h = new float[2];
    public final float[] i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f446j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f447k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f448l = true;

    public m() {
        for (int i = 0; i < 4; i++) {
            this.f439a[i] = new t();
            this.f440b[i] = new Matrix();
            this.f441c[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public final void a(k kVar, float f2, RectF rectF, A.a aVar, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        t[] tVarArr;
        int i;
        boolean z3;
        float[] fArr;
        float f4;
        boolean z4;
        int i4;
        m mVar = this;
        path.rewind();
        Path path2 = mVar.f443e;
        path2.rewind();
        Path path3 = mVar.f444f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i5 = 0;
        while (true) {
            matrixArr = mVar.f441c;
            matrixArr2 = mVar.f440b;
            tVarArr = mVar.f439a;
            i = 4;
            z3 = 0;
            fArr = mVar.h;
            if (i5 >= 4) {
                break;
            }
            c cVar = i5 != 1 ? i5 != 2 ? i5 != 3 ? kVar.f433f : kVar.f432e : kVar.h : kVar.f434g;
            AbstractC0106b abstractC0106b = i5 != 1 ? i5 != 2 ? i5 != 3 ? kVar.f429b : kVar.f428a : kVar.f431d : kVar.f430c;
            t tVar = tVarArr[i5];
            abstractC0106b.getClass();
            abstractC0106b.l(tVar, f2, cVar.a(rectF));
            int i6 = i5 + 1;
            float f5 = (i6 % 4) * 90;
            matrixArr2[i5].reset();
            PointF pointF = mVar.f442d;
            if (i5 == 1) {
                i4 = i5;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i5 == 2) {
                i4 = i5;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i5 != 3) {
                i4 = i5;
                pointF.set(rectF.right, rectF.top);
            } else {
                i4 = i5;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i4].setTranslate(pointF.x, pointF.y);
            matrixArr2[i4].preRotate(f5);
            t tVar2 = tVarArr[i4];
            fArr[0] = tVar2.f462b;
            fArr[1] = tVar2.f463c;
            matrixArr2[i4].mapPoints(fArr);
            matrixArr[i4].reset();
            matrixArr[i4].setTranslate(fArr[0], fArr[1]);
            matrixArr[i4].preRotate(f5);
            i5 = i6;
        }
        int i7 = 0;
        while (i7 < i) {
            t tVar3 = tVarArr[i7];
            tVar3.getClass();
            fArr[z3] = 0.0f;
            fArr[1] = tVar3.f461a;
            matrixArr2[i7].mapPoints(fArr);
            if (i7 == 0) {
                path.moveTo(fArr[z3], fArr[1]);
            } else {
                path.lineTo(fArr[z3], fArr[1]);
            }
            tVarArr[i7].b(matrixArr2[i7], path);
            if (aVar != null) {
                t tVar4 = tVarArr[i7];
                Matrix matrix = matrixArr2[i7];
                g gVar = (g) aVar.f7b;
                BitSet bitSet = gVar.f403d;
                tVar4.getClass();
                f4 = 0.0f;
                bitSet.set(i7, z3);
                tVar4.a(tVar4.f465e);
                gVar.f401b[i7] = new n(new ArrayList(tVar4.f467g), new Matrix(matrix));
            } else {
                f4 = 0.0f;
            }
            int i8 = i7 + 1;
            int i9 = i8 % 4;
            t tVar5 = tVarArr[i7];
            fArr[0] = tVar5.f462b;
            fArr[1] = tVar5.f463c;
            matrixArr2[i7].mapPoints(fArr);
            t tVar6 = tVarArr[i9];
            tVar6.getClass();
            float[] fArr2 = mVar.i;
            fArr2[0] = f4;
            fArr2[1] = tVar6.f461a;
            matrixArr2[i9].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr2;
            t[] tVarArr2 = tVarArr;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f4);
            t tVar7 = tVarArr2[i7];
            fArr[0] = tVar7.f462b;
            fArr[1] = tVar7.f463c;
            matrixArr3[i7].mapPoints(fArr);
            if (i7 == 1 || i7 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            t tVar8 = mVar.f445g;
            tVar8.d(BitmapDescriptorFactory.HUE_RED, 270.0f, BitmapDescriptorFactory.HUE_RED);
            (i7 != 1 ? i7 != 2 ? i7 != 3 ? kVar.f435j : kVar.i : kVar.f437l : kVar.f436k).getClass();
            tVar8.c(max, BitmapDescriptorFactory.HUE_RED);
            Path path4 = mVar.f446j;
            path4.reset();
            tVar8.b(matrixArr[i7], path4);
            if (mVar.f448l && (mVar.b(path4, i7) || mVar.b(path4, i9))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = tVar8.f461a;
                matrixArr[i7].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                tVar8.b(matrixArr[i7], path2);
            } else {
                tVar8.b(matrixArr[i7], path);
            }
            if (aVar != null) {
                Matrix matrix2 = matrixArr[i7];
                g gVar2 = (g) aVar.f7b;
                z4 = false;
                gVar2.f403d.set(i7 + 4, false);
                tVar8.a(tVar8.f465e);
                gVar2.f402c[i7] = new n(new ArrayList(tVar8.f467g), new Matrix(matrix2));
            } else {
                z4 = false;
            }
            z3 = z4;
            i7 = i8;
            tVarArr = tVarArr2;
            matrixArr2 = matrixArr3;
            i = 4;
            mVar = this;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.f447k;
        path2.reset();
        this.f439a[i].b(this.f440b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
