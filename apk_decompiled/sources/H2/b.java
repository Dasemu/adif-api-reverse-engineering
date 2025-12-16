package H2;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f695b;

    public /* synthetic */ b(Object obj, int i) {
        this.f694a = i;
        this.f695b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f694a) {
            case 0:
                ((TabLayout) this.f695b).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                return;
            case 1:
                ((TextInputLayout) this.f695b).f5873v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                ((R1.d) this.f695b).invalidateSelf();
                return;
            case 3:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                E2.g gVar = ((BottomSheetBehavior) this.f695b).i;
                if (gVar != null) {
                    E2.f fVar = gVar.f400a;
                    if (fVar.i != floatValue) {
                        fVar.i = floatValue;
                        gVar.f404e = true;
                        gVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) this.f695b;
                textView.setScaleX(floatValue2);
                textView.setScaleY(floatValue2);
                return;
        }
    }
}
