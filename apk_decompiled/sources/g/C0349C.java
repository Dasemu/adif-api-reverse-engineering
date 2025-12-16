package g;

import a.AbstractC0106b;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import k.C0407d;

/* renamed from: g.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349C extends ContentFrameLayout {
    public final /* synthetic */ LayoutInflaterFactory2C0351E i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0349C(LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E, C0407d c0407d) {
        super(c0407d, null);
        this.i = layoutInflaterFactory2C0351E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.i.v(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (x3 < -5 || y3 < -5 || x3 > getWidth() + 5 || y3 > getHeight() + 5) {
                LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = this.i;
                layoutInflaterFactory2C0351E.t(layoutInflaterFactory2C0351E.A(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC0106b.m(getContext(), i));
    }
}
