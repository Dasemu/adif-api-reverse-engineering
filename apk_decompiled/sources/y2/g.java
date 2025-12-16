package y2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f8993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f8995c;

    public g(h hVar, boolean z3, int i) {
        this.f8995c = hVar;
        this.f8993a = z3;
        this.f8994b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h hVar = this.f8995c;
        hVar.f8984b.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        hVar.a(BitmapDescriptorFactory.HUE_RED, this.f8993a, this.f8994b);
    }
}
