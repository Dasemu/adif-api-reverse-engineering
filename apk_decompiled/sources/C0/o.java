package C0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* loaded from: classes.dex */
public final class o extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f331a;

    public o(Drawable.ConstantState constantState) {
        this.f331a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f331a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f331a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        p pVar = new p();
        pVar.f286a = (VectorDrawable) this.f331a.newDrawable();
        return pVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        p pVar = new p();
        pVar.f286a = (VectorDrawable) this.f331a.newDrawable(resources);
        return pVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        p pVar = new p();
        pVar.f286a = (VectorDrawable) this.f331a.newDrawable(resources, theme);
        return pVar;
    }
}
