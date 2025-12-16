package E2;

import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f381a;

    /* renamed from: b, reason: collision with root package name */
    public final float f382b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f381a;
            f2 += ((b) cVar).f382b;
        }
        this.f381a = cVar;
        this.f382b = f2;
    }

    @Override // E2.c
    public final float a(RectF rectF) {
        return Math.max(BitmapDescriptorFactory.HUE_RED, this.f381a.a(rectF) + this.f382b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f381a.equals(bVar.f381a) && this.f382b == bVar.f382b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f381a, Float.valueOf(this.f382b)});
    }
}
