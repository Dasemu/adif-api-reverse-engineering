package androidx.recyclerview.widget;

import android.view.View;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0208b0 f3721a;

    /* renamed from: b, reason: collision with root package name */
    public int f3722b;

    /* renamed from: c, reason: collision with root package name */
    public int f3723c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3724d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3725e;

    public S() {
        d();
    }

    public final void a() {
        this.f3723c = this.f3724d ? this.f3721a.g() : this.f3721a.k();
    }

    public final void b(View view, int i) {
        if (this.f3724d) {
            int b4 = this.f3721a.b(view);
            AbstractC0208b0 abstractC0208b0 = this.f3721a;
            this.f3723c = (Integer.MIN_VALUE == abstractC0208b0.f3793a ? 0 : abstractC0208b0.l() - abstractC0208b0.f3793a) + b4;
        } else {
            this.f3723c = this.f3721a.e(view);
        }
        this.f3722b = i;
    }

    public final void c(View view, int i) {
        AbstractC0208b0 abstractC0208b0 = this.f3721a;
        int l4 = Integer.MIN_VALUE == abstractC0208b0.f3793a ? 0 : abstractC0208b0.l() - abstractC0208b0.f3793a;
        if (l4 >= 0) {
            b(view, i);
            return;
        }
        this.f3722b = i;
        if (!this.f3724d) {
            int e4 = this.f3721a.e(view);
            int k4 = e4 - this.f3721a.k();
            this.f3723c = e4;
            if (k4 > 0) {
                int g4 = (this.f3721a.g() - Math.min(0, (this.f3721a.g() - l4) - this.f3721a.b(view))) - (this.f3721a.c(view) + e4);
                if (g4 < 0) {
                    this.f3723c -= Math.min(k4, -g4);
                    return;
                }
                return;
            }
            return;
        }
        int g5 = (this.f3721a.g() - l4) - this.f3721a.b(view);
        this.f3723c = this.f3721a.g() - g5;
        if (g5 > 0) {
            int c4 = this.f3723c - this.f3721a.c(view);
            int k5 = this.f3721a.k();
            int min = c4 - (Math.min(this.f3721a.e(view) - k5, 0) + k5);
            if (min < 0) {
                this.f3723c = Math.min(g5, -min) + this.f3723c;
            }
        }
    }

    public final void d() {
        this.f3722b = -1;
        this.f3723c = IntCompanionObject.MIN_VALUE;
        this.f3724d = false;
        this.f3725e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f3722b + ", mCoordinate=" + this.f3723c + ", mLayoutFromEnd=" + this.f3724d + ", mValid=" + this.f3725e + '}';
    }
}
