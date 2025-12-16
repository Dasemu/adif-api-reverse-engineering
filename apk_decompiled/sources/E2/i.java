package E2;

import a.AbstractC0106b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class i extends AbstractC0106b {
    @Override // a.AbstractC0106b
    public final void l(t tVar, float f2, float f4) {
        tVar.d(f4 * f2, 180.0f, 90.0f);
        float f5 = f4 * 2.0f * f2;
        p pVar = new p(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f5, f5);
        pVar.f456f = 180.0f;
        pVar.f457g = 90.0f;
        tVar.f466f.add(pVar);
        n nVar = new n(pVar);
        tVar.a(180.0f);
        tVar.f467g.add(nVar);
        tVar.f464d = 270.0f;
        float f6 = (BitmapDescriptorFactory.HUE_RED + f5) * 0.5f;
        float f7 = (f5 - BitmapDescriptorFactory.HUE_RED) / 2.0f;
        double d4 = 270.0f;
        tVar.f462b = (((float) Math.cos(Math.toRadians(d4))) * f7) + f6;
        tVar.f463c = (f7 * ((float) Math.sin(Math.toRadians(d4)))) + f6;
    }
}
