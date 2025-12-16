package B0;

import android.animation.ObjectAnimator;
import android.view.View;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;

/* renamed from: B0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030h extends x {

    /* renamed from: F, reason: collision with root package name */
    public static final String[] f140F = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: E, reason: collision with root package name */
    public final int f141E;

    public C0030h(int i) {
        this();
        this.f141E = i;
    }

    public static void N(F f2) {
        int visibility = f2.f99b.getVisibility();
        HashMap hashMap = f2.f98a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = f2.f99b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float P(F f2, float f4) {
        Float f5;
        return (f2 == null || (f5 = (Float) f2.f98a.get("android:fade:transitionAlpha")) == null) ? f4 : f5.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [B0.N, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static B0.N Q(B0.F r8, B0.F r9) {
        /*
            B0.N r0 = new B0.N
            r0.<init>()
            r1 = 0
            r0.f117a = r1
            r0.f118b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f98a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f119c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f121e = r6
            goto L33
        L2f:
            r0.f119c = r3
            r0.f121e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f98a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f120d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f122f = r2
            goto L56
        L52:
            r0.f120d = r3
            r0.f122f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f119c
            int r9 = r0.f120d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f121e
            android.view.ViewGroup r4 = r0.f122f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f118b = r1
            r0.f117a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f118b = r2
            r0.f117a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f122f
            if (r8 != 0) goto L81
            r0.f118b = r1
            r0.f117a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f121e
            if (r8 != 0) goto L9f
            r0.f118b = r2
            r0.f117a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f120d
            if (r8 != 0) goto L95
            r0.f118b = r2
            r0.f117a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f119c
            if (r8 != 0) goto L9f
            r0.f118b = r1
            r0.f117a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0030h.Q(B0.F, B0.F):B0.N");
    }

    public final ObjectAnimator O(View view, float f2, float f4) {
        if (f2 == f4) {
            return null;
        }
        C0024b c0024b = I.f105a;
        view.setTransitionAlpha(f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, I.f105a, f4);
        C0029g c0029g = new C0029g(view);
        ofFloat.addListener(c0029g);
        o().a(c0029g);
        return ofFloat;
    }

    @Override // B0.x
    public final void d(F f2) {
        N(f2);
    }

    @Override // B0.x
    public final void g(F f2) {
        N(f2);
        View view = f2.f99b;
        Float f4 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f4 == null) {
            if (view.getVisibility() == 0) {
                C0024b c0024b = I.f105a;
                f4 = Float.valueOf(view.getTransitionAlpha());
            } else {
                f4 = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
            }
        }
        f2.f98a.put("android:fade:transitionAlpha", f4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (Q(n(r3, false), r(r3, false)).f117a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bb  */
    @Override // B0.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator k(android.view.ViewGroup r24, B0.F r25, B0.F r26) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0030h.k(android.view.ViewGroup, B0.F, B0.F):android.animation.Animator");
    }

    @Override // B0.x
    public final String[] q() {
        return f140F;
    }

    @Override // B0.x
    public final boolean t() {
        return true;
    }

    @Override // B0.x
    public final boolean u(F f2, F f4) {
        if (f2 == null && f4 == null) {
            return false;
        }
        if (f2 != null && f4 != null && f4.f98a.containsKey("android:visibility:visibility") != f2.f98a.containsKey("android:visibility:visibility")) {
            return false;
        }
        N Q3 = Q(f2, f4);
        if (Q3.f117a) {
            return Q3.f119c == 0 || Q3.f120d == 0;
        }
        return false;
    }

    public C0030h() {
        this.f141E = 3;
    }
}
