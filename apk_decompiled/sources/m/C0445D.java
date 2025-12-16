package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.adif.elcanomovil.R;

/* renamed from: m.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445D extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0446E f7506a;

    public C0445D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        K0.a(this, getContext());
        C0446E c0446e = new C0446E(this);
        this.f7506a = c0446e;
        c0446e.e(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0446E c0446e = this.f7506a;
        Drawable drawable = c0446e.f7508f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0445D c0445d = c0446e.f7507e;
        if (drawable.setState(c0445d.getDrawableState())) {
            c0445d.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7506a.f7508f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f7506a.j(canvas);
    }
}
