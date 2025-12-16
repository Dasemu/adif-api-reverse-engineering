package m;

import android.view.View;
import android.view.ViewConfiguration;
import l.InterfaceC0420C;

/* renamed from: m.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0481p0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f7721a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7722b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7723c;

    /* renamed from: d, reason: collision with root package name */
    public final View f7724d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC0479o0 f7725e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0479o0 f7726f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7727g;
    public int h;
    public final int[] i = new int[2];

    public AbstractViewOnTouchListenerC0481p0(View view) {
        this.f7724d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f7721a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f7722b = tapTimeout;
        this.f7723c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0479o0 runnableC0479o0 = this.f7726f;
        View view = this.f7724d;
        if (runnableC0479o0 != null) {
            view.removeCallbacks(runnableC0479o0);
        }
        RunnableC0479o0 runnableC0479o02 = this.f7725e;
        if (runnableC0479o02 != null) {
            view.removeCallbacks(runnableC0479o02);
        }
    }

    public abstract InterfaceC0420C b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC0420C b4 = b();
        if (b4 == null || !b4.a()) {
            return true;
        }
        b4.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.AbstractViewOnTouchListenerC0481p0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f7727g = false;
        this.h = -1;
        RunnableC0479o0 runnableC0479o0 = this.f7725e;
        if (runnableC0479o0 != null) {
            this.f7724d.removeCallbacks(runnableC0479o0);
        }
    }
}
