package U0;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.InterfaceC0192m;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements InterfaceC0192m, b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1774a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f1775b;

    public a(ImageView imageView) {
        this.f1775b = imageView;
    }

    @Override // androidx.lifecycle.InterfaceC0192m
    public final void O(J j4) {
        this.f1774a = false;
        a();
    }

    public final void a() {
        Object drawable = this.f1775b.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.f1774a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void b(Drawable drawable) {
        ImageView imageView = this.f1775b;
        Object drawable2 = imageView.getDrawable();
        Animatable animatable = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawable);
        a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Intrinsics.areEqual(this.f1775b, ((a) obj).f1775b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1775b.hashCode();
    }

    @Override // U0.b
    public final void onError(Drawable drawable) {
        b(drawable);
    }

    @Override // U0.b
    public final void onStart(Drawable drawable) {
        b(drawable);
    }

    @Override // U0.b
    public final void onSuccess(Drawable drawable) {
        b(drawable);
    }

    @Override // androidx.lifecycle.InterfaceC0192m
    public final void x(J j4) {
        this.f1774a = true;
        a();
    }
}
