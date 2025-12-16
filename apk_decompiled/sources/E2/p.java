package E2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes3.dex */
public final class p extends r {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f452b;

    /* renamed from: c, reason: collision with root package name */
    public final float f453c;

    /* renamed from: d, reason: collision with root package name */
    public final float f454d;

    /* renamed from: e, reason: collision with root package name */
    public final float f455e;

    /* renamed from: f, reason: collision with root package name */
    public float f456f;

    /* renamed from: g, reason: collision with root package name */
    public float f457g;

    public p(float f2, float f4, float f5, float f6) {
        this.f452b = f2;
        this.f453c = f4;
        this.f454d = f5;
        this.f455e = f6;
    }

    @Override // E2.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f460a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f452b, this.f453c, this.f454d, this.f455e);
        path.arcTo(rectF, this.f456f, this.f457g, false);
        path.transform(matrix);
    }
}
