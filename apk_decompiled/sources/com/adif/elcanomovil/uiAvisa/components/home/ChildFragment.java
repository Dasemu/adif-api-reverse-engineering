package com.adif.elcanomovil.uiAvisa.components.home;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import androidx.fragment.app.K;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/home/ChildFragment;", "Landroidx/fragment/app/K;", "<init>", "()V", "", "transit", "", "enter", "nextAnim", "Landroid/view/animation/Animation;", "onCreateAnimation", "(IZI)Landroid/view/animation/Animation;", "shouldFadeView", "Z", "getShouldFadeView", "()Z", "setShouldFadeView", "(Z)V", "Landroid/view/animation/AlphaAnimation;", "dummyAnimation", "Landroid/view/animation/AlphaAnimation;", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class ChildFragment extends K {
    private final AlphaAnimation dummyAnimation;
    private boolean shouldFadeView;

    public ChildFragment() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        this.dummyAnimation = alphaAnimation;
    }

    public boolean getShouldFadeView() {
        return this.shouldFadeView;
    }

    @Override // androidx.fragment.app.K
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return (!getShouldFadeView() || enter || getParentFragment() == null) ? super.onCreateAnimation(transit, enter, nextAnim) : this.dummyAnimation;
    }

    public void setShouldFadeView(boolean z3) {
        this.shouldFadeView = z3;
    }
}
