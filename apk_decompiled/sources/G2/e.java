package G2;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f582b;

    public /* synthetic */ e(k kVar, int i) {
        this.f581a = i;
        this.f582b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect;
        WindowMetrics currentWindowMetrics;
        k kVar = this.f582b;
        int i = 1;
        byte b4 = 0;
        switch (this.f581a) {
            case 0:
                if (kVar.i != null) {
                    Context context = kVar.h;
                    int i4 = x2.m.f8968d;
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                        rect = currentWindowMetrics.getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int height = rect.height();
                    int[] iArr = new int[2];
                    j jVar = kVar.i;
                    jVar.getLocationInWindow(iArr);
                    int height2 = (height - (jVar.getHeight() + iArr[1])) + ((int) jVar.getTranslationY());
                    int i5 = kVar.p;
                    if (height2 >= i5) {
                        kVar.f615q = i5;
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        Log.w(k.f596A, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        return;
                    }
                    int i6 = kVar.p;
                    kVar.f615q = i6;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = (i6 - height2) + marginLayoutParams.bottomMargin;
                    jVar.requestLayout();
                    return;
                }
                return;
            case 1:
                kVar.b(3);
                return;
            default:
                j jVar2 = kVar.i;
                if (jVar2 == null) {
                    return;
                }
                ViewParent parent = jVar2.getParent();
                j jVar3 = kVar.i;
                if (parent != null) {
                    jVar3.setVisibility(0);
                }
                if (jVar3.getAnimationMode() == 1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                    ofFloat.setInterpolator(kVar.f605d);
                    ofFloat.addUpdateListener(new b(kVar, b4, b4));
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                    ofFloat2.setInterpolator(kVar.f607f);
                    ofFloat2.addUpdateListener(new b(kVar, i, b4));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ofFloat, ofFloat2);
                    animatorSet.setDuration(kVar.f602a);
                    animatorSet.addListener(new c(kVar, i));
                    animatorSet.start();
                    return;
                }
                int height3 = jVar3.getHeight();
                ViewGroup.LayoutParams layoutParams2 = jVar3.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                }
                jVar3.setTranslationY(height3);
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(height3, 0);
                valueAnimator.setInterpolator(kVar.f606e);
                valueAnimator.setDuration(kVar.f604c);
                valueAnimator.addListener(new c(kVar, b4));
                valueAnimator.addUpdateListener(new b(kVar, height3));
                valueAnimator.start();
                return;
        }
    }
}
