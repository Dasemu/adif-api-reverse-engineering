package x2;

import B0.F;
import B0.x;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class k extends x {
    @Override // B0.x
    public final void d(F f2) {
        View view = f2.f99b;
        if (view instanceof TextView) {
            f2.f98a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // B0.x
    public final void g(F f2) {
        View view = f2.f99b;
        if (view instanceof TextView) {
            f2.f98a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // B0.x
    public final Animator k(ViewGroup viewGroup, F f2, F f4) {
        if (f2 == null || f4 == null || !(f2.f99b instanceof TextView)) {
            return null;
        }
        View view = f4.f99b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = f2.f98a;
        HashMap hashMap2 = f4.f98a;
        float floatValue = hashMap.get("android:textscale:scale") != null ? ((Float) hashMap.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = hashMap2.get("android:textscale:scale") != null ? ((Float) hashMap2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new H2.b(textView, 4));
        return ofFloat;
    }
}
