package E2;

import a.AbstractC0106b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class d extends AbstractC0106b {
    @Override // a.AbstractC0106b
    public final void l(t tVar, float f2, float f4) {
        tVar.d(f4 * f2, 180.0f, 90.0f);
        double d4 = f4;
        double d5 = f2;
        tVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d4 * d5), (float) (Math.sin(Math.toRadians(BitmapDescriptorFactory.HUE_RED)) * d4 * d5));
    }
}
