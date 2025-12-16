package I2;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class f extends E2.f {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f814q;

    public f(E2.k kVar, RectF rectF) {
        super(kVar);
        this.f814q = rectF;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [I2.g, E2.g, android.graphics.drawable.Drawable] */
    @Override // E2.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ?? gVar = new E2.g(this);
        gVar.f816v = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f814q = fVar.f814q;
    }
}
