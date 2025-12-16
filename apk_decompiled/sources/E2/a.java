package E2;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f380a;

    public a(float f2) {
        this.f380a = f2;
    }

    @Override // E2.c
    public final float a(RectF rectF) {
        return this.f380a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f380a == ((a) obj).f380a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f380a)});
    }
}
