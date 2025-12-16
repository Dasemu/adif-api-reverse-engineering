package C0;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class c implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f275a;

    public c(f fVar) {
        this.f275a = fVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f275a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        this.f275a.scheduleSelf(runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f275a.unscheduleSelf(runnable);
    }
}
