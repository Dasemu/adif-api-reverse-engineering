package M0;

import C.w;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f1088a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1089b;

    /* renamed from: c, reason: collision with root package name */
    public final J0.g f1090c;

    public d(Drawable drawable, boolean z3, J0.g gVar) {
        this.f1088a = drawable;
        this.f1089b = z3;
        this.f1090c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f1088a, dVar.f1088a) && this.f1089b == dVar.f1089b && this.f1090c == dVar.f1090c;
    }

    public final int hashCode() {
        return this.f1090c.hashCode() + w.c(this.f1088a.hashCode() * 31, 31, this.f1089b);
    }
}
