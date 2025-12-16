package g;

import O.X;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Q extends m3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f6570b;

    public /* synthetic */ Q(T t2, int i) {
        this.f6569a = i;
        this.f6570b = t2;
    }

    @Override // O.i0
    public final void a() {
        View view;
        T t2 = this.f6570b;
        switch (this.f6569a) {
            case 0:
                if (t2.f6590o && (view = t2.f6584g) != null) {
                    view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    t2.f6581d.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                }
                t2.f6581d.setVisibility(8);
                t2.f6581d.setTransitioning(false);
                t2.f6593s = null;
                F.i iVar = t2.f6586k;
                if (iVar != null) {
                    iVar.j(t2.f6585j);
                    t2.f6585j = null;
                    t2.f6586k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = t2.f6580c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = X.f1226a;
                    O.J.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                t2.f6593s = null;
                t2.f6581d.requestLayout();
                return;
        }
    }
}
