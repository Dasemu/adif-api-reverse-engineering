package E2;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes3.dex */
public final class q extends r {

    /* renamed from: b, reason: collision with root package name */
    public float f458b;

    /* renamed from: c, reason: collision with root package name */
    public float f459c;

    @Override // E2.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f460a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f458b, this.f459c);
        path.transform(matrix);
    }
}
