package y2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i2.AbstractC0396a;
import j0.C0399a;

/* loaded from: classes3.dex */
public final class f extends AbstractC0662a {

    /* renamed from: g, reason: collision with root package name */
    public final float f8992g;
    public final float h;

    public f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f8992g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f8984b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new C0399a(1));
        return animatorSet;
    }

    public final void b(float f2) {
        float interpolation = this.f8983a.getInterpolation(f2);
        View view = this.f8984b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= BitmapDescriptorFactory.HUE_RED || height <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f4 = this.f8992g / width;
        float f5 = this.h / height;
        float a2 = 1.0f - AbstractC0396a.a(BitmapDescriptorFactory.HUE_RED, f4, interpolation);
        float a4 = 1.0f - AbstractC0396a.a(BitmapDescriptorFactory.HUE_RED, f5, interpolation);
        view.setScaleX(a2);
        view.setPivotY(height);
        view.setScaleY(a4);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(a4 != BitmapDescriptorFactory.HUE_RED ? a2 / a4 : 1.0f);
            }
        }
    }
}
