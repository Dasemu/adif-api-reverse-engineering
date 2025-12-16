package androidx.appcompat.widget;

import B0.G;
import a.AbstractC0106b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.recyclerview.widget.C0207b;
import e3.C0325k;
import m.AbstractC0463g0;
import m.K0;
import m.L0;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final C0207b f2432a;

    /* renamed from: b, reason: collision with root package name */
    public final G f2433b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2434c;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0207b c0207b = this.f2432a;
        if (c0207b != null) {
            c0207b.a();
        }
        G g4 = this.f2433b;
        if (g4 != null) {
            g4.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0207b c0207b = this.f2432a;
        if (c0207b != null) {
            return c0207b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0207b c0207b = this.f2432a;
        if (c0207b != null) {
            return c0207b.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0325k c0325k;
        G g4 = this.f2433b;
        if (g4 == null || (c0325k = (C0325k) g4.f104d) == null) {
            return null;
        }
        return (ColorStateList) c0325k.f6368c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0325k c0325k;
        G g4 = this.f2433b;
        if (g4 == null || (c0325k = (C0325k) g4.f104d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0325k.f6369d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f2433b.f103c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0207b c0207b = this.f2432a;
        if (c0207b != null) {
            c0207b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0207b c0207b = this.f2432a;
        if (c0207b != null) {
            c0207b.n(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        G g4 = this.f2433b;
        if (g4 != null) {
            g4.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        G g4 = this.f2433b;
        if (g4 != null && drawable != null && !this.f2434c) {
            g4.f102b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (g4 != null) {
            g4.b();
            if (this.f2434c) {
                return;
            }
            ImageView imageView = (ImageView) g4.f103c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(g4.f102b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f2434c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        G g4 = this.f2433b;
        if (g4 != null) {
            ImageView imageView = (ImageView) g4.f103c;
            if (i != 0) {
                Drawable m4 = AbstractC0106b.m(imageView.getContext(), i);
                if (m4 != null) {
                    AbstractC0463g0.a(m4);
                }
                imageView.setImageDrawable(m4);
            } else {
                imageView.setImageDrawable(null);
            }
            g4.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        G g4 = this.f2433b;
        if (g4 != null) {
            g4.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0207b c0207b = this.f2432a;
        if (c0207b != null) {
            c0207b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0207b c0207b = this.f2432a;
        if (c0207b != null) {
            c0207b.t(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        G g4 = this.f2433b;
        if (g4 != null) {
            if (((C0325k) g4.f104d) == null) {
                g4.f104d = new Object();
            }
            C0325k c0325k = (C0325k) g4.f104d;
            c0325k.f6368c = colorStateList;
            c0325k.f6367b = true;
            g4.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        G g4 = this.f2433b;
        if (g4 != null) {
            if (((C0325k) g4.f104d) == null) {
                g4.f104d = new Object();
            }
            C0325k c0325k = (C0325k) g4.f104d;
            c0325k.f6369d = mode;
            c0325k.f6366a = true;
            g4.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        L0.a(context);
        this.f2434c = false;
        K0.a(this, getContext());
        C0207b c0207b = new C0207b(this);
        this.f2432a = c0207b;
        c0207b.k(attributeSet, i);
        G g4 = new G(this);
        this.f2433b = g4;
        g4.e(attributeSet, i);
    }
}
