package m;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: m.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0492v0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0496x0 f7751a;

    public C0492v0(C0496x0 c0496x0) {
        this.f7751a = c0496x0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i4, int i5) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            C0496x0 c0496x0 = this.f7751a;
            if (c0496x0.f7782z.getInputMethodMode() == 2 || c0496x0.f7782z.getContentView() == null) {
                return;
            }
            Handler handler = c0496x0.f7778v;
            RunnableC0490u0 runnableC0490u0 = c0496x0.f7774r;
            handler.removeCallbacks(runnableC0490u0);
            runnableC0490u0.run();
        }
    }
}
