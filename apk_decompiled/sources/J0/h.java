package J0;

import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final BitmapDrawable f939a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f940b;

    public h(BitmapDrawable bitmapDrawable, boolean z3) {
        this.f939a = bitmapDrawable;
        this.f940b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f939a, hVar.f939a) && this.f940b == hVar.f940b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f940b) + (this.f939a.hashCode() * 31);
    }
}
