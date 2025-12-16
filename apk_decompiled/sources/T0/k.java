package T0;

import android.view.ViewTreeObserver;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f1650b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f1651c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f1652d;

    public k(f fVar, ViewTreeObserver viewTreeObserver, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f1650b = fVar;
        this.f1651c = viewTreeObserver;
        this.f1652d = cancellableContinuationImpl;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        f fVar = this.f1650b;
        h c4 = fVar.c();
        if (c4 != null) {
            ViewTreeObserver viewTreeObserver = this.f1651c;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                fVar.f1637a.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f1649a) {
                this.f1649a = true;
                this.f1652d.resumeWith(Result.m116constructorimpl(c4));
            }
        }
        return true;
    }
}
