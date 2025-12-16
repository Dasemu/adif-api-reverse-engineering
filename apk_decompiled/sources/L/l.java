package L;

import O.m0;
import O.r0;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1044a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f1045b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1046c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1047d;

    public /* synthetic */ l() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f1044a) {
            case 0:
                try {
                    obj = ((d) this.f1045b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f1047d).post(new a(1, (e) this.f1046c, obj));
                return;
            default:
                m0.h((View) this.f1045b, (F.i) this.f1046c);
                ((ValueAnimator) this.f1047d).start();
                return;
        }
    }

    public l(View view, r0 r0Var, F.i iVar, ValueAnimator valueAnimator) {
        this.f1045b = view;
        this.f1046c = iVar;
        this.f1047d = valueAnimator;
    }
}
