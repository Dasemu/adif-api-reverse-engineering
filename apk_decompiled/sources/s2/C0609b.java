package s2;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.chip.Chip;

/* renamed from: s2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0609b extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f8412a;

    public C0609b(Chip chip) {
        this.f8412a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C0612e c0612e = this.f8412a.f5616e;
        if (c0612e != null) {
            c0612e.getOutline(outline);
        } else {
            outline.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }
}
