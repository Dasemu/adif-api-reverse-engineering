package H2;

import O.X;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class g extends LinearLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f701c = 0;

    /* renamed from: a, reason: collision with root package name */
    public ValueAnimator f702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabLayout f703b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TabLayout tabLayout, Context context) {
        super(context);
        this.f703b = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i) {
        TabLayout tabLayout = this.f703b;
        if (tabLayout.f5782T == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i);
            E2.e eVar = tabLayout.f5771H;
            Drawable drawable = tabLayout.f5796o;
            eVar.getClass();
            RectF f2 = E2.e.f(tabLayout, childAt);
            drawable.setBounds((int) f2.left, drawable.getBounds().top, (int) f2.right, drawable.getBounds().bottom);
            tabLayout.f5784a = i;
        }
    }

    public final void b(int i) {
        TabLayout tabLayout = this.f703b;
        Rect bounds = tabLayout.f5796o.getBounds();
        tabLayout.f5796o.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f2) {
        TabLayout tabLayout = this.f703b;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.f5796o;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f5796o.getBounds().bottom);
        } else {
            tabLayout.f5771H.l(tabLayout, view, view2, f2, tabLayout.f5796o);
        }
        WeakHashMap weakHashMap = X.f1226a;
        postInvalidateOnAnimation();
    }

    public final void d(int i, int i4, boolean z3) {
        TabLayout tabLayout = this.f703b;
        if (tabLayout.f5784a == i) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.f5784a = i;
        f fVar = new f(this, childAt, childAt2);
        if (!z3) {
            this.f702a.removeAllUpdateListeners();
            this.f702a.addUpdateListener(fVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f702a = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.f5772I);
        valueAnimator.setDuration(i4);
        valueAnimator.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimator.addUpdateListener(fVar);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f703b;
        int height2 = tabLayout.f5796o.getBounds().height();
        if (height2 < 0) {
            height2 = tabLayout.f5796o.getIntrinsicHeight();
        }
        int i = tabLayout.f5764A;
        if (i == 0) {
            height = getHeight() - height2;
            height2 = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                height2 = i != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - height2) / 2;
            height2 = (getHeight() + height2) / 2;
        }
        if (tabLayout.f5796o.getBounds().width() > 0) {
            Rect bounds = tabLayout.f5796o.getBounds();
            tabLayout.f5796o.setBounds(bounds.left, height, bounds.right, height2);
            tabLayout.f5796o.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
        ValueAnimator valueAnimator = this.f702a;
        TabLayout tabLayout = this.f703b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.f5784a == -1) {
            tabLayout.f5784a = tabLayout.getSelectedTabPosition();
        }
        a(tabLayout.f5784a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f703b;
        boolean z3 = true;
        if (tabLayout.f5805y == 1 || tabLayout.f5765B == 2) {
            int childCount = getChildCount();
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() == 0) {
                    i5 = Math.max(i5, childAt.getMeasuredWidth());
                }
            }
            if (i5 <= 0) {
                return;
            }
            if (i5 * childCount <= getMeasuredWidth() - (((int) x2.m.e(getContext(), 16)) * 2)) {
                boolean z4 = false;
                for (int i7 = 0; i7 < childCount; i7++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i7).getLayoutParams();
                    if (layoutParams.width != i5 || layoutParams.weight != BitmapDescriptorFactory.HUE_RED) {
                        layoutParams.width = i5;
                        layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
                        z4 = true;
                    }
                }
                z3 = z4;
            } else {
                tabLayout.f5805y = 0;
                tabLayout.o(false);
            }
            if (z3) {
                super.onMeasure(i, i4);
            }
        }
    }
}
