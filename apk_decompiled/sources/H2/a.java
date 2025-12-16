package H2;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.tabs.TabLayout;
import i2.AbstractC0396a;

/* loaded from: classes3.dex */
public final class a extends E2.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f693d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i) {
        super(3);
        this.f693d = i;
    }

    @Override // E2.e
    public final void l(TabLayout tabLayout, View view, View view2, float f2, Drawable drawable) {
        float sin;
        float cos;
        switch (this.f693d) {
            case 0:
                RectF f4 = E2.e.f(tabLayout, view);
                RectF f5 = E2.e.f(tabLayout, view2);
                if (f4.left < f5.left) {
                    double d4 = (f2 * 3.141592653589793d) / 2.0d;
                    sin = (float) (1.0d - Math.cos(d4));
                    cos = (float) Math.sin(d4);
                } else {
                    double d5 = (f2 * 3.141592653589793d) / 2.0d;
                    sin = (float) Math.sin(d5);
                    cos = (float) (1.0d - Math.cos(d5));
                }
                drawable.setBounds(AbstractC0396a.c(sin, (int) f4.left, (int) f5.left), drawable.getBounds().top, AbstractC0396a.c(cos, (int) f4.right, (int) f5.right), drawable.getBounds().bottom);
                return;
            default:
                if (f2 >= 0.5f) {
                    view = view2;
                }
                RectF f6 = E2.e.f(tabLayout, view);
                float b4 = f2 < 0.5f ? AbstractC0396a.b(1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.5f, f2) : AbstractC0396a.b(BitmapDescriptorFactory.HUE_RED, 1.0f, 0.5f, 1.0f, f2);
                drawable.setBounds((int) f6.left, drawable.getBounds().top, (int) f6.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (b4 * 255.0f));
                return;
        }
    }
}
