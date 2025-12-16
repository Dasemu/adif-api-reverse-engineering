package y2;

import O.X;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i2.AbstractC0396a;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class h extends AbstractC0662a {

    /* renamed from: g, reason: collision with root package name */
    public final float f8996g;
    public final float h;
    public final float i;

    public h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f8996g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a(float f2, boolean z3, int i) {
        float interpolation = this.f8983a.getInterpolation(f2);
        WeakHashMap weakHashMap = X.f1226a;
        View view = this.f8984b;
        boolean z4 = (Gravity.getAbsoluteGravity(i, view.getLayoutDirection()) & 3) == 3;
        boolean z5 = z3 == z4;
        int width = view.getWidth();
        int height = view.getHeight();
        float f4 = width;
        if (f4 > BitmapDescriptorFactory.HUE_RED) {
            float f5 = height;
            if (f5 <= BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            float f6 = this.f8996g / f4;
            float f7 = this.h / f4;
            float f8 = this.i / f5;
            if (z4) {
                f4 = 0.0f;
            }
            view.setPivotX(f4);
            if (!z5) {
                f7 = -f6;
            }
            float a2 = AbstractC0396a.a(BitmapDescriptorFactory.HUE_RED, f7, interpolation);
            float f9 = a2 + 1.0f;
            view.setScaleX(f9);
            float a4 = 1.0f - AbstractC0396a.a(BitmapDescriptorFactory.HUE_RED, f8, interpolation);
            view.setScaleY(a4);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    View childAt = viewGroup.getChildAt(i4);
                    childAt.setPivotX(z4 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f10 = z5 ? 1.0f - a2 : 1.0f;
                    float f11 = a4 != BitmapDescriptorFactory.HUE_RED ? (f9 / a4) * f10 : 1.0f;
                    childAt.setScaleX(f10);
                    childAt.setScaleY(f11);
                }
            }
        }
    }
}
