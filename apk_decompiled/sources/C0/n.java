package C0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f321a;

    /* renamed from: b, reason: collision with root package name */
    public m f322b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f323c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f324d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f325e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f326f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f327g;
    public PorterDuff.Mode h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f328j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f329k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f330l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f321a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
