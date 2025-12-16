package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.recyclerview.widget.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0238q0 f3863b;

    public /* synthetic */ C0234o0(AbstractC0238q0 abstractC0238q0, int i) {
        this.f3862a = i;
        this.f3863b = abstractC0238q0;
    }

    public final int a(View view) {
        switch (this.f3862a) {
            case 0:
                C0239r0 c0239r0 = (C0239r0) view.getLayoutParams();
                this.f3863b.getClass();
                return AbstractC0238q0.D(view) + ((ViewGroup.MarginLayoutParams) c0239r0).rightMargin;
            default:
                C0239r0 c0239r02 = (C0239r0) view.getLayoutParams();
                this.f3863b.getClass();
                return AbstractC0238q0.y(view) + ((ViewGroup.MarginLayoutParams) c0239r02).bottomMargin;
        }
    }

    public final int b(View view) {
        switch (this.f3862a) {
            case 0:
                C0239r0 c0239r0 = (C0239r0) view.getLayoutParams();
                this.f3863b.getClass();
                return AbstractC0238q0.A(view) - ((ViewGroup.MarginLayoutParams) c0239r0).leftMargin;
            default:
                C0239r0 c0239r02 = (C0239r0) view.getLayoutParams();
                this.f3863b.getClass();
                return AbstractC0238q0.E(view) - ((ViewGroup.MarginLayoutParams) c0239r02).topMargin;
        }
    }

    public final int c() {
        switch (this.f3862a) {
            case 0:
                AbstractC0238q0 abstractC0238q0 = this.f3863b;
                return abstractC0238q0.f3894n - abstractC0238q0.J();
            default:
                AbstractC0238q0 abstractC0238q02 = this.f3863b;
                return abstractC0238q02.f3895o - abstractC0238q02.H();
        }
    }

    public final int d() {
        switch (this.f3862a) {
            case 0:
                return this.f3863b.I();
            default:
                return this.f3863b.K();
        }
    }
}
