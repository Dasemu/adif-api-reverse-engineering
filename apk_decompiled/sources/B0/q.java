package B0;

import O.i0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import r2.C0567a;

/* loaded from: classes.dex */
public final class q extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f158b;

    public /* synthetic */ q(Object obj, int i) {
        this.f157a = i;
        this.f158b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f157a) {
            case 4:
                ((i0) this.f158b).b();
                return;
            case 5:
            default:
                super.onAnimationCancel(animator);
                return;
            case 6:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f158b;
                actionBarOverlayLayout.f2408w = null;
                actionBarOverlayLayout.f2396j = false;
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f157a) {
            case 0:
                ((x) this.f158b).m();
                animator.removeListener(this);
                return;
            case 1:
                C0.f fVar = (C0.f) this.f158b;
                ArrayList arrayList = new ArrayList(fVar.f284e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C0567a) arrayList.get(i)).f8213b.f8227o;
                    if (colorStateList != null) {
                        H.a.h(fVar, colorStateList);
                    }
                }
                return;
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f158b;
                sideSheetBehavior.w(5);
                WeakReference weakReference = sideSheetBehavior.p;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                ((View) sideSheetBehavior.p.get()).requestLayout();
                return;
            case 3:
                I2.l lVar = (I2.l) this.f158b;
                lVar.q();
                lVar.f834r.start();
                return;
            case 4:
                ((i0) this.f158b).a();
                return;
            case 5:
                ((HideBottomViewOnScrollBehavior) this.f158b).h = null;
                return;
            case 6:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f158b;
                actionBarOverlayLayout.f2408w = null;
                actionBarOverlayLayout.f2396j = false;
                return;
            case 7:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f158b;
                bottomSheetBehavior.I(5);
                WeakReference weakReference2 = bottomSheetBehavior.f5556U;
                if (weakReference2 == null || weakReference2.get() == null) {
                    return;
                }
                ((View) bottomSheetBehavior.f5556U.get()).requestLayout();
                return;
            default:
                y2.f fVar2 = (y2.f) this.f158b;
                fVar2.f8984b.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                fVar2.b(BitmapDescriptorFactory.HUE_RED);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f157a) {
            case 1:
                C0.f fVar = (C0.f) this.f158b;
                ArrayList arrayList = new ArrayList(fVar.f284e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C0567a) arrayList.get(i)).a(fVar);
                }
                return;
            case 4:
                ((i0) this.f158b).c();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public q(i0 i0Var, View view) {
        this.f157a = 4;
        this.f158b = i0Var;
    }
}
