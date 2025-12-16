package w2;

import android.content.Context;
import android.graphics.Color;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.KotlinVersion;
import m3.d;
import m3.l;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0651a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f8805f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8806a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8807b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8808c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8809d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8810e;

    public C0651a(Context context) {
        boolean U3 = l.U(context, R.attr.elevationOverlayEnabled, false);
        int s4 = d.s(context, R.attr.elevationOverlayColor, 0);
        int s5 = d.s(context, R.attr.elevationOverlayAccentColor, 0);
        int s6 = d.s(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f8806a = U3;
        this.f8807b = s4;
        this.f8808c = s5;
        this.f8809d = s6;
        this.f8810e = f2;
    }

    public final int a(int i, float f2) {
        int i4;
        if (!this.f8806a || G.a.d(i, KotlinVersion.MAX_COMPONENT_VALUE) != this.f8809d) {
            return i;
        }
        float min = (this.f8810e <= BitmapDescriptorFactory.HUE_RED || f2 <= BitmapDescriptorFactory.HUE_RED) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int y3 = d.y(min, G.a.d(i, KotlinVersion.MAX_COMPONENT_VALUE), this.f8807b);
        if (min > BitmapDescriptorFactory.HUE_RED && (i4 = this.f8808c) != 0) {
            y3 = G.a.b(G.a.d(i4, f8805f), y3);
        }
        return G.a.d(y3, alpha);
    }
}
