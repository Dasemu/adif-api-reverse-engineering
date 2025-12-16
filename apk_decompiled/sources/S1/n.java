package S1;

import android.content.Context;
import android.widget.OverScroller;

/* loaded from: classes3.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final OverScroller f1555a;

    /* renamed from: b, reason: collision with root package name */
    public int f1556b;

    /* renamed from: c, reason: collision with root package name */
    public int f1557c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f1558d;

    public n(o oVar, Context context) {
        this.f1558d = oVar;
        this.f1555a = new OverScroller(context);
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller = this.f1555a;
        if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            o oVar = this.f1558d;
            oVar.f1569m.postTranslate(this.f1556b - currX, this.f1557c - currY);
            oVar.a();
            this.f1556b = currX;
            this.f1557c = currY;
            oVar.h.postOnAnimation(this);
        }
    }
}
