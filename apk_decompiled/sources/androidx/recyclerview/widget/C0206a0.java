package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.recyclerview.widget.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206a0 extends AbstractC0208b0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0206a0(AbstractC0238q0 abstractC0238q0, int i) {
        super(abstractC0238q0);
        this.f3786d = i;
    }

    @Override // androidx.recyclerview.widget.AbstractC0208b0
    public final int b(View view) {
        switch (this.f3786d) {
            case 0:
                C0239r0 c0239r0 = (C0239r0) view.getLayoutParams();
                ((AbstractC0238q0) this.f3794b).getClass();
                return AbstractC0238q0.D(view) + ((ViewGroup.MarginLayoutParams) c0239r0).rightMargin;
            default:
                C0239r0 c0239r02 = (C0239r0) view.getLayoutParams();
                ((AbstractC0238q0) this.f3794b).getClass();
                return AbstractC0238q0.y(view) + ((ViewGroup.MarginLayoutParams) c0239r02).bottomMargin;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0208b0
    public final int c(View view) {
        switch (this.f3786d) {
            case 0:
                C0239r0 c0239r0 = (C0239r0) view.getLayoutParams();
                ((AbstractC0238q0) this.f3794b).getClass();
                return AbstractC0238q0.C(view) + ((ViewGroup.MarginLayoutParams) c0239r0).leftMargin + ((ViewGroup.MarginLayoutParams) c0239r0).rightMargin;
            default:
                C0239r0 c0239r02 = (C0239r0) view.getLayoutParams();
                ((AbstractC0238q0) this.f3794b).getClass();
                return AbstractC0238q0.B(view) + ((ViewGroup.MarginLayoutParams) c0239r02).topMargin + ((ViewGroup.MarginLayoutParams) c0239r02).bottomMargin;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0208b0
    public final int d(View view) {
        switch (this.f3786d) {
            case 0:
                C0239r0 c0239r0 = (C0239r0) view.getLayoutParams();
                ((AbstractC0238q0) this.f3794b).getClass();
                return AbstractC0238q0.B(view) + ((ViewGroup.MarginLayoutParams) c0239r0).topMargin + ((ViewGroup.MarginLayoutParams) c0239r0).bottomMargin;
            default:
                C0239r0 c0239r02 = (C0239r0) view.getLayoutParams();
                ((AbstractC0238q0) this.f3794b).getClass();
                return AbstractC0238q0.C(view) + ((ViewGroup.MarginLayoutParams) c0239r02).leftMargin + ((ViewGroup.MarginLayoutParams) c0239r02).rightMargin;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0208b0
    public final int e(View view) {
        switch (this.f3786d) {
            case 0:
                C0239r0 c0239r0 = (C0239r0) view.getLayoutParams();
                ((AbstractC0238q0) this.f3794b).getClass();
                return AbstractC0238q0.A(view) - ((ViewGroup.MarginLayoutParams) c0239r0).leftMargin;
            default:
                C0239r0 c0239r02 = (C0239r0) view.getLayoutParams();
                ((AbstractC0238q0) this.f3794b).getClass();
                return AbstractC0238q0.E(view) - ((ViewGroup.MarginLayoutParams) c0239r02).topMargin;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0208b0
    public final int f() {
        switch (this.f3786d) {
            case 0:
                return ((AbstractC0238q0) this.f3794b).f3894n;
            default:
                return ((AbstractC0238q0) this.f3794b).f3895o;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0208b0
    public final int g() {
        switch (this.f3786d) {
            case 0:
                AbstractC0238q0 abstractC0238q0 = (AbstractC0238q0) this.f3794b;
                return abstractC0238q0.f3894n - abstractC0238q0.J();
            default:
                AbstractC0238q0 abstractC0238q02 = (AbstractC0238q0) this.f3794b;
                return abstractC0238q02.f3895o - abstractC0238q02.H();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0208b0
    public final int h() {
        switch (this.f3786d) {
            case 0:
                return ((AbstractC0238q0) this.f3794b).J();
            default:
                return ((AbstractC0238q0) this.f3794b).H();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0208b0
    public final int i() {
        switch (this.f3786d) {
            case 0:
                return ((AbstractC0238q0) this.f3794b).f3892l;
            default:
                return ((AbstractC0238q0) this.f3794b).f3893m;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0208b0
    public final int j() {
        switch (this.f3786d) {
            case 0:
                return ((AbstractC0238q0) this.f3794b).f3893m;
            default:
                return ((AbstractC0238q0) this.f3794b).f3892l;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0208b0
    public final int k() {
        switch (this.f3786d) {
            case 0:
                return ((AbstractC0238q0) this.f3794b).I();
            default:
                return ((AbstractC0238q0) this.f3794b).K();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0208b0
    public final int l() {
        switch (this.f3786d) {
            case 0:
                AbstractC0238q0 abstractC0238q0 = (AbstractC0238q0) this.f3794b;
                return (abstractC0238q0.f3894n - abstractC0238q0.I()) - abstractC0238q0.J();
            default:
                AbstractC0238q0 abstractC0238q02 = (AbstractC0238q0) this.f3794b;
                return (abstractC0238q02.f3895o - abstractC0238q02.K()) - abstractC0238q02.H();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0208b0
    public final int m(View view) {
        switch (this.f3786d) {
            case 0:
                AbstractC0238q0 abstractC0238q0 = (AbstractC0238q0) this.f3794b;
                Rect rect = (Rect) this.f3795c;
                abstractC0238q0.O(rect, view);
                return rect.right;
            default:
                AbstractC0238q0 abstractC0238q02 = (AbstractC0238q0) this.f3794b;
                Rect rect2 = (Rect) this.f3795c;
                abstractC0238q02.O(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0208b0
    public final int n(View view) {
        switch (this.f3786d) {
            case 0:
                AbstractC0238q0 abstractC0238q0 = (AbstractC0238q0) this.f3794b;
                Rect rect = (Rect) this.f3795c;
                abstractC0238q0.O(rect, view);
                return rect.left;
            default:
                AbstractC0238q0 abstractC0238q02 = (AbstractC0238q0) this.f3794b;
                Rect rect2 = (Rect) this.f3795c;
                abstractC0238q02.O(rect2, view);
                return rect2.top;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0208b0
    public final void o(int i) {
        switch (this.f3786d) {
            case 0:
                ((AbstractC0238q0) this.f3794b).S(i);
                return;
            default:
                ((AbstractC0238q0) this.f3794b).T(i);
                return;
        }
    }
}
