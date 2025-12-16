package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.adif.elcanomovil.R;
import l.ViewTreeObserverOnGlobalLayoutListenerC0426d;

/* loaded from: classes.dex */
public final class K extends C0496x0 implements M {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f7576A;

    /* renamed from: B, reason: collision with root package name */
    public I f7577B;

    /* renamed from: C, reason: collision with root package name */
    public final Rect f7578C;

    /* renamed from: D, reason: collision with root package name */
    public int f7579D;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ N f7580E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(N n4, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f7580E = n4;
        this.f7578C = new Rect();
        this.f7772o = n4;
        this.f7781y = true;
        this.f7782z.setFocusable(true);
        this.p = new I2.v(this, 1);
    }

    @Override // m.M
    public final void g(CharSequence charSequence) {
        this.f7576A = charSequence;
    }

    @Override // m.M
    public final void j(int i) {
        this.f7579D = i;
    }

    @Override // m.M
    public final void l(int i, int i4) {
        ViewTreeObserver viewTreeObserver;
        C0497y c0497y = this.f7782z;
        boolean isShowing = c0497y.isShowing();
        s();
        this.f7782z.setInputMethodMode(2);
        c();
        C0475m0 c0475m0 = this.f7762c;
        c0475m0.setChoiceMode(1);
        c0475m0.setTextDirection(i);
        c0475m0.setTextAlignment(i4);
        N n4 = this.f7580E;
        int selectedItemPosition = n4.getSelectedItemPosition();
        C0475m0 c0475m02 = this.f7762c;
        if (c0497y.isShowing() && c0475m02 != null) {
            c0475m02.setListSelectionHidden(false);
            c0475m02.setSelection(selectedItemPosition);
            if (c0475m02.getChoiceMode() != 0) {
                c0475m02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = n4.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0426d viewTreeObserverOnGlobalLayoutListenerC0426d = new ViewTreeObserverOnGlobalLayoutListenerC0426d(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0426d);
        this.f7782z.setOnDismissListener(new J(this, viewTreeObserverOnGlobalLayoutListenerC0426d));
    }

    @Override // m.M
    public final CharSequence o() {
        return this.f7576A;
    }

    @Override // m.C0496x0, m.M
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.f7577B = (I) listAdapter;
    }

    public final void s() {
        int i;
        C0497y c0497y = this.f7782z;
        Drawable background = c0497y.getBackground();
        N n4 = this.f7580E;
        if (background != null) {
            background.getPadding(n4.h);
            int layoutDirection = n4.getLayoutDirection();
            Rect rect = n4.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = n4.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = n4.getPaddingLeft();
        int paddingRight = n4.getPaddingRight();
        int width = n4.getWidth();
        int i4 = n4.f7596g;
        if (i4 == -2) {
            int a2 = n4.a(this.f7577B, c0497y.getBackground());
            int i5 = n4.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = n4.h;
            int i6 = (i5 - rect3.left) - rect3.right;
            if (a2 > i6) {
                a2 = i6;
            }
            r(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i4 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i4);
        }
        this.f7765f = n4.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f7764e) - this.f7579D) + i : paddingLeft + this.f7579D + i;
    }
}
