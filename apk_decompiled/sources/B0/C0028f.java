package B0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: B0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028f extends x {

    /* renamed from: E, reason: collision with root package name */
    public static final String[] f133E = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: F, reason: collision with root package name */
    public static final C0024b f134F = new C0024b(0, "topLeft", PointF.class);

    /* renamed from: G, reason: collision with root package name */
    public static final C0024b f135G = new C0024b(1, "bottomRight", PointF.class);

    /* renamed from: H, reason: collision with root package name */
    public static final C0024b f136H = new C0024b(2, "bottomRight", PointF.class);

    /* renamed from: I, reason: collision with root package name */
    public static final C0024b f137I = new C0024b(3, "topLeft", PointF.class);
    public static final C0024b J = new C0024b(4, "position", PointF.class);

    public static void N(F f2) {
        View view = f2.f99b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = f2.f98a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", f2.f99b.getParent());
    }

    @Override // B0.x
    public final void d(F f2) {
        N(f2);
    }

    @Override // B0.x
    public final void g(F f2) {
        N(f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // B0.x
    public final Animator k(ViewGroup viewGroup, F f2, F f4) {
        int i;
        C0028f c0028f;
        ObjectAnimator a2;
        if (f2 == null || f4 == null) {
            return null;
        }
        HashMap hashMap = f2.f98a;
        HashMap hashMap2 = f4.f98a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i4 = rect.left;
        int i5 = rect2.left;
        int i6 = rect.top;
        int i7 = rect2.top;
        int i8 = rect.right;
        int i9 = rect2.right;
        int i10 = rect.bottom;
        int i11 = rect2.bottom;
        int i12 = i8 - i4;
        int i13 = i10 - i6;
        int i14 = i9 - i5;
        int i15 = i11 - i7;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
            i = 0;
        } else {
            i = (i4 == i5 && i6 == i7) ? 0 : 1;
            if (i8 != i9 || i10 != i11) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        C0024b c0024b = I.f105a;
        View view = f4.f99b;
        view.setLeftTopRightBottom(i4, i6, i8, i10);
        if (i != 2) {
            c0028f = this;
            if (i4 == i5 && i6 == i7) {
                c0028f.f202w.getClass();
                a2 = o.a(view, f136H, E2.e.k(i8, i10, i9, i11));
            } else {
                c0028f.f202w.getClass();
                a2 = o.a(view, f137I, E2.e.k(i4, i6, i5, i7));
            }
        } else if (i12 == i14 && i13 == i15) {
            c0028f = this;
            c0028f.f202w.getClass();
            a2 = o.a(view, J, E2.e.k(i4, i6, i5, i7));
        } else {
            c0028f = this;
            C0027e c0027e = new C0027e(view);
            c0028f.f202w.getClass();
            ObjectAnimator a4 = o.a(c0027e, f134F, E2.e.k(i4, i6, i5, i7));
            c0028f.f202w.getClass();
            ObjectAnimator a5 = o.a(c0027e, f135G, E2.e.k(i8, i10, i9, i11));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(a4, a5);
            animatorSet.addListener(new C0025c(c0027e));
            a2 = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            H.b(viewGroup4, true);
            c0028f.o().a(new C0026d(viewGroup4));
        }
        return a2;
    }

    @Override // B0.x
    public final String[] q() {
        return f133E;
    }
}
