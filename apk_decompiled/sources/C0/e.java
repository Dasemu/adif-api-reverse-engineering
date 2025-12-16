package C0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f280a;

    public e(Drawable.ConstantState constantState) {
        this.f280a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f280a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f280a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(null);
        Drawable newDrawable = this.f280a.newDrawable();
        fVar.f286a = newDrawable;
        newDrawable.setCallback(fVar.f285f);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        f fVar = new f(null);
        Drawable newDrawable = this.f280a.newDrawable(resources);
        fVar.f286a = newDrawable;
        newDrawable.setCallback(fVar.f285f);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        f fVar = new f(null);
        Drawable newDrawable = this.f280a.newDrawable(resources, theme);
        fVar.f286a = newDrawable;
        newDrawable.setCallback(fVar.f285f);
        return fVar;
    }
}
