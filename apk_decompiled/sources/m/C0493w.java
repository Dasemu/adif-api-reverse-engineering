package m;

import a.AbstractC0106b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.recyclerview.widget.C0207b;
import e3.C0325k;

/* renamed from: m.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0493w extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0207b f7752a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.G f7753b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7754c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0493w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        L0.a(context);
        this.f7754c = false;
        K0.a(this, getContext());
        C0207b c0207b = new C0207b(this);
        this.f7752a = c0207b;
        c0207b.k(attributeSet, i);
        B0.G g4 = new B0.G(this);
        this.f7753b = g4;
        g4.e(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0207b c0207b = this.f7752a;
        if (c0207b != null) {
            c0207b.a();
        }
        B0.G g4 = this.f7753b;
        if (g4 != null) {
            g4.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0207b c0207b = this.f7752a;
        if (c0207b != null) {
            return c0207b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0207b c0207b = this.f7752a;
        if (c0207b != null) {
            return c0207b.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0325k c0325k;
        B0.G g4 = this.f7753b;
        if (g4 == null || (c0325k = (C0325k) g4.f104d) == null) {
            return null;
        }
        return (ColorStateList) c0325k.f6368c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0325k c0325k;
        B0.G g4 = this.f7753b;
        if (g4 == null || (c0325k = (C0325k) g4.f104d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0325k.f6369d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f7753b.f103c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0207b c0207b = this.f7752a;
        if (c0207b != null) {
            c0207b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0207b c0207b = this.f7752a;
        if (c0207b != null) {
            c0207b.n(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B0.G g4 = this.f7753b;
        if (g4 != null) {
            g4.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        B0.G g4 = this.f7753b;
        if (g4 != null && drawable != null && !this.f7754c) {
            g4.f102b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (g4 != null) {
            g4.b();
            if (this.f7754c) {
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
        this.f7754c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        B0.G g4 = this.f7753b;
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

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B0.G g4 = this.f7753b;
        if (g4 != null) {
            g4.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0207b c0207b = this.f7752a;
        if (c0207b != null) {
            c0207b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0207b c0207b = this.f7752a;
        if (c0207b != null) {
            c0207b.t(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B0.G g4 = this.f7753b;
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
        B0.G g4 = this.f7753b;
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
}
