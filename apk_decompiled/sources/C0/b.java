package C0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import r2.C0567a;

/* loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0567a f274a;

    public b(C0567a c0567a) {
        this.f274a = c0567a;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f274a.f8213b.f8227o;
        if (colorStateList != null) {
            H.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f274a.a(drawable);
    }
}
