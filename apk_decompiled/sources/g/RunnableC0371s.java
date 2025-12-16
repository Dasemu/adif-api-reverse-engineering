package g;

import O.X;
import O.h0;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.io.ConstantsKt;

/* renamed from: g.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0371s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0351E f6666b;

    public /* synthetic */ RunnableC0371s(LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E, int i) {
        this.f6665a = i;
        this.f6666b = layoutInflaterFactory2C0351E;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f6665a) {
            case 0:
                LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = this.f6666b;
                if ((layoutInflaterFactory2C0351E.Z & 1) != 0) {
                    layoutInflaterFactory2C0351E.w(0);
                }
                if ((layoutInflaterFactory2C0351E.Z & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                    layoutInflaterFactory2C0351E.w(108);
                }
                layoutInflaterFactory2C0351E.f6518Y = false;
                layoutInflaterFactory2C0351E.Z = 0;
                return;
            default:
                LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E2 = this.f6666b;
                layoutInflaterFactory2C0351E2.f6538w.showAtLocation(layoutInflaterFactory2C0351E2.f6537v, 55, 0, 0);
                h0 h0Var = layoutInflaterFactory2C0351E2.f6540y;
                if (h0Var != null) {
                    h0Var.b();
                }
                if (!(layoutInflaterFactory2C0351E2.f6541z && (viewGroup = layoutInflaterFactory2C0351E2.f6495A) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0351E2.f6537v.setAlpha(1.0f);
                    layoutInflaterFactory2C0351E2.f6537v.setVisibility(0);
                    return;
                }
                layoutInflaterFactory2C0351E2.f6537v.setAlpha(BitmapDescriptorFactory.HUE_RED);
                h0 a2 = X.a(layoutInflaterFactory2C0351E2.f6537v);
                a2.a(1.0f);
                layoutInflaterFactory2C0351E2.f6540y = a2;
                a2.d(new u(this, 0));
                return;
        }
    }
}
