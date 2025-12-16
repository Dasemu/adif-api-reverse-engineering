package I2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import m.W;

/* loaded from: classes3.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f868c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f870e;

    public s(u uVar, int i, TextView textView, int i4, TextView textView2) {
        this.f870e = uVar;
        this.f866a = i;
        this.f867b = textView;
        this.f868c = i4;
        this.f869d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        W w3;
        int i = this.f866a;
        u uVar = this.f870e;
        uVar.f885n = i;
        uVar.f883l = null;
        TextView textView = this.f867b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f868c == 1 && (w3 = uVar.f888r) != null) {
                w3.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f869d;
        if (textView2 != null) {
            textView2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f869d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }
}
