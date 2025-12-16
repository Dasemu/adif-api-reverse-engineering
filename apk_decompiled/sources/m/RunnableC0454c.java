package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0454c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f7659b;

    public /* synthetic */ RunnableC0454c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f7658a = i;
        this.f7659b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7658a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f7659b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f2408w = actionBarOverlayLayout.f2392d.animate().translationY(BitmapDescriptorFactory.HUE_RED).setListener(actionBarOverlayLayout.f2409x);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f7659b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f2408w = actionBarOverlayLayout2.f2392d.animate().translationY(-actionBarOverlayLayout2.f2392d.getHeight()).setListener(actionBarOverlayLayout2.f2409x);
                return;
        }
    }
}
