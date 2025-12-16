package i2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import s.j;

/* renamed from: i2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0397b {

    /* renamed from: a, reason: collision with root package name */
    public final j f6819a = new j(0);

    /* renamed from: b, reason: collision with root package name */
    public final j f6820b = new j(0);

    public static C0397b a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e4) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e4);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, i2.c] */
    public static C0397b b(ArrayList arrayList) {
        C0397b c0397b = new C0397b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0397b.f6820b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0396a.f6816b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0396a.f6817c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0396a.f6818d;
            }
            ?? obj = new Object();
            obj.f6824d = 0;
            obj.f6825e = 1;
            obj.f6821a = startDelay;
            obj.f6822b = duration;
            obj.f6823c = interpolator;
            obj.f6824d = objectAnimator.getRepeatCount();
            obj.f6825e = objectAnimator.getRepeatMode();
            c0397b.f6819a.put(propertyName, obj);
        }
        return c0397b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0397b) {
            return this.f6819a.equals(((C0397b) obj).f6819a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6819a.hashCode();
    }

    public final String toString() {
        return "\n" + C0397b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f6819a + "}\n";
    }
}
