package m;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0452b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f7654a;

    public C0452b(ActionBarContainer actionBarContainer) {
        this.f7654a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f7654a;
        if (actionBarContainer.f2366g) {
            Drawable drawable = actionBarContainer.f2365f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f2363d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f2364e;
        if (drawable3 == null || !actionBarContainer.h) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f7654a;
        if (actionBarContainer.f2366g) {
            if (actionBarContainer.f2365f != null) {
                actionBarContainer.f2363d.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f2363d;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
