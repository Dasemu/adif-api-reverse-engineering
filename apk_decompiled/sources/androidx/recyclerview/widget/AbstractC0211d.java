package androidx.recyclerview.widget;

import android.view.View;
import java.util.concurrent.ExecutorService;

/* renamed from: androidx.recyclerview.widget.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0211d {

    /* renamed from: b, reason: collision with root package name */
    public static ExecutorService f3800b;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3799a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final r f3801c = new r(0);

    public static int c(E0 e02, AbstractC0208b0 abstractC0208b0, View view, View view2, AbstractC0238q0 abstractC0238q0, boolean z3) {
        if (abstractC0238q0.v() == 0 || e02.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return Math.abs(AbstractC0238q0.L(view) - AbstractC0238q0.L(view2)) + 1;
        }
        return Math.min(abstractC0208b0.l(), abstractC0208b0.b(view2) - abstractC0208b0.e(view));
    }

    public static int d(E0 e02, AbstractC0208b0 abstractC0208b0, View view, View view2, AbstractC0238q0 abstractC0238q0, boolean z3, boolean z4) {
        if (abstractC0238q0.v() == 0 || e02.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z4 ? Math.max(0, (e02.b() - Math.max(AbstractC0238q0.L(view), AbstractC0238q0.L(view2))) - 1) : Math.max(0, Math.min(AbstractC0238q0.L(view), AbstractC0238q0.L(view2)));
        if (z3) {
            return Math.round((max * (Math.abs(abstractC0208b0.b(view2) - abstractC0208b0.e(view)) / (Math.abs(AbstractC0238q0.L(view) - AbstractC0238q0.L(view2)) + 1))) + (abstractC0208b0.k() - abstractC0208b0.e(view)));
        }
        return max;
    }

    public static int e(E0 e02, AbstractC0208b0 abstractC0208b0, View view, View view2, AbstractC0238q0 abstractC0238q0, boolean z3) {
        if (abstractC0238q0.v() == 0 || e02.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return e02.b();
        }
        return (int) (((abstractC0208b0.b(view2) - abstractC0208b0.e(view)) / (Math.abs(AbstractC0238q0.L(view) - AbstractC0238q0.L(view2)) + 1)) * e02.b());
    }

    public abstract boolean a(Object obj, Object obj2);

    public abstract boolean b(Object obj, Object obj2);
}
