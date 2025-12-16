package E2;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f417a;

    public h(float f2) {
        this.f417a = f2;
    }

    @Override // E2.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f417a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f417a == ((h) obj).f417a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f417a)});
    }
}
