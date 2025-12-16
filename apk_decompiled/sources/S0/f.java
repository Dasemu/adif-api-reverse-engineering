package S0;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f1457a;

    /* renamed from: b, reason: collision with root package name */
    public final j f1458b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f1459c;

    public f(Drawable drawable, j jVar, Throwable th) {
        this.f1457a = drawable;
        this.f1458b = jVar;
        this.f1459c = th;
    }

    @Override // S0.k
    public final Drawable a() {
        return this.f1457a;
    }

    @Override // S0.k
    public final j b() {
        return this.f1458b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (Intrinsics.areEqual(this.f1457a, fVar.f1457a)) {
            return Intrinsics.areEqual(this.f1458b, fVar.f1458b) && Intrinsics.areEqual(this.f1459c, fVar.f1459c);
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.f1457a;
        int hashCode = drawable != null ? drawable.hashCode() : 0;
        return this.f1459c.hashCode() + ((this.f1458b.hashCode() + (hashCode * 31)) * 31);
    }
}
