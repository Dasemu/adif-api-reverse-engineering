package C0;

import B0.G;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class m {
    public static final Matrix p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f308a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f309b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f310c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f311d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f312e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f313f;

    /* renamed from: g, reason: collision with root package name */
    public final j f314g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f315j;

    /* renamed from: k, reason: collision with root package name */
    public float f316k;

    /* renamed from: l, reason: collision with root package name */
    public int f317l;

    /* renamed from: m, reason: collision with root package name */
    public String f318m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f319n;

    /* renamed from: o, reason: collision with root package name */
    public final s.e f320o;

    /* JADX WARN: Type inference failed for: r0v4, types: [s.e, s.j] */
    public m() {
        this.f310c = new Matrix();
        this.h = BitmapDescriptorFactory.HUE_RED;
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.f315j = BitmapDescriptorFactory.HUE_RED;
        this.f316k = BitmapDescriptorFactory.HUE_RED;
        this.f317l = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f318m = null;
        this.f319n = null;
        this.f320o = new s.j(0);
        this.f314g = new j();
        this.f308a = new Path();
        this.f309b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(j jVar, Matrix matrix, Canvas canvas, int i, int i4) {
        char c4;
        float f2;
        float f4;
        int i5;
        j jVar2 = jVar;
        char c5 = 1;
        jVar2.f296a.set(matrix);
        Matrix matrix2 = jVar2.f296a;
        matrix2.preConcat(jVar2.f303j);
        canvas.save();
        char c6 = 0;
        int i6 = 0;
        while (true) {
            ArrayList arrayList = jVar2.f297b;
            if (i6 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            k kVar = (k) arrayList.get(i6);
            if (kVar instanceof j) {
                a((j) kVar, matrix2, canvas, i, i4);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f5 = i / this.f315j;
                float f6 = i4 / this.f316k;
                float min = Math.min(f5, f6);
                Matrix matrix3 = this.f310c;
                matrix3.set(matrix2);
                matrix3.postScale(f5, f6);
                float[] fArr = {BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED};
                matrix2.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c6], fArr[c5]);
                boolean z3 = c5;
                boolean z4 = c6;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f7 = (fArr[z4 ? 1 : 0] * fArr[3]) - (fArr[z3 ? 1 : 0] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > BitmapDescriptorFactory.HUE_RED ? Math.abs(f7) / max : 0.0f;
                if (abs != BitmapDescriptorFactory.HUE_RED) {
                    Path path = this.f308a;
                    lVar.getClass();
                    path.reset();
                    G.f[] fVarArr = lVar.f305a;
                    if (fVarArr != null) {
                        G.f.b(fVarArr, path);
                    }
                    Path path2 = this.f309b;
                    path2.reset();
                    if (lVar instanceof h) {
                        path2.setFillType(lVar.f307c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix3);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f8 = iVar.i;
                        if (f8 != BitmapDescriptorFactory.HUE_RED || iVar.f291j != 1.0f) {
                            float f9 = iVar.f292k;
                            float f10 = (f8 + f9) % 1.0f;
                            float f11 = (iVar.f291j + f9) % 1.0f;
                            if (this.f313f == null) {
                                this.f313f = new PathMeasure();
                            }
                            this.f313f.setPath(path, z4);
                            float length = this.f313f.getLength();
                            float f12 = f10 * length;
                            float f13 = f11 * length;
                            path.reset();
                            if (f12 > f13) {
                                this.f313f.getSegment(f12, length, path, z3);
                                f2 = 0.0f;
                                this.f313f.getSegment(BitmapDescriptorFactory.HUE_RED, f13, path, z3);
                            } else {
                                f2 = 0.0f;
                                this.f313f.getSegment(f12, f13, path, z3);
                            }
                            path.rLineTo(f2, f2);
                        }
                        path2.addPath(path, matrix3);
                        G g4 = iVar.f289f;
                        if ((((Shader) g4.f103c) == null && g4.f102b == 0) ? false : true) {
                            if (this.f312e == null) {
                                i5 = 16777215;
                                Paint paint = new Paint(1);
                                this.f312e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i5 = 16777215;
                            }
                            Paint paint2 = this.f312e;
                            Shader shader = (Shader) g4.f103c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix3);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.h * 255.0f));
                                f4 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                int i7 = g4.f102b;
                                float f14 = iVar.h;
                                PorterDuff.Mode mode = p.f332j;
                                f4 = 255.0f;
                                paint2.setColor((i7 & i5) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(iVar.f307c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f4 = 255.0f;
                            i5 = 16777215;
                        }
                        G g5 = iVar.f287d;
                        if (((Shader) g5.f103c) != null || g5.f102b != 0) {
                            if (this.f311d == null) {
                                Paint paint3 = new Paint(1);
                                this.f311d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f311d;
                            Paint.Join join = iVar.f294m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f293l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f295n);
                            Shader shader2 = (Shader) g5.f103c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix3);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f290g * f4));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                int i8 = g5.f102b;
                                float f15 = iVar.f290g;
                                PorterDuff.Mode mode2 = p.f332j;
                                paint4.setColor((i8 & i5) | (((int) (Color.alpha(i8) * f15)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f288e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                c4 = 1;
                i6++;
                jVar2 = jVar;
                c5 = c4;
                c6 = 0;
            }
            c4 = c5;
            i6++;
            jVar2 = jVar;
            c5 = c4;
            c6 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f317l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f317l = i;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [s.e, s.j] */
    public m(m mVar) {
        this.f310c = new Matrix();
        this.h = BitmapDescriptorFactory.HUE_RED;
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.f315j = BitmapDescriptorFactory.HUE_RED;
        this.f316k = BitmapDescriptorFactory.HUE_RED;
        this.f317l = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f318m = null;
        this.f319n = null;
        ?? jVar = new s.j(0);
        this.f320o = jVar;
        this.f314g = new j(mVar.f314g, jVar);
        this.f308a = new Path(mVar.f308a);
        this.f309b = new Path(mVar.f309b);
        this.h = mVar.h;
        this.i = mVar.i;
        this.f315j = mVar.f315j;
        this.f316k = mVar.f316k;
        this.f317l = mVar.f317l;
        this.f318m = mVar.f318m;
        String str = mVar.f318m;
        if (str != null) {
            jVar.put(str, this);
        }
        this.f319n = mVar.f319n;
    }
}
