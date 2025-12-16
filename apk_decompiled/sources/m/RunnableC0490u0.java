package m;

/* renamed from: m.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0490u0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0496x0 f7748b;

    public /* synthetic */ RunnableC0490u0(C0496x0 c0496x0, int i) {
        this.f7747a = i;
        this.f7748b = c0496x0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7747a) {
            case 0:
                C0475m0 c0475m0 = this.f7748b.f7762c;
                if (c0475m0 != null) {
                    c0475m0.setListSelectionHidden(true);
                    c0475m0.requestLayout();
                    return;
                }
                return;
            default:
                C0496x0 c0496x0 = this.f7748b;
                C0475m0 c0475m02 = c0496x0.f7762c;
                if (c0475m02 == null || !c0475m02.isAttachedToWindow() || c0496x0.f7762c.getCount() <= c0496x0.f7762c.getChildCount() || c0496x0.f7762c.getChildCount() > c0496x0.f7770m) {
                    return;
                }
                c0496x0.f7782z.setInputMethodMode(2);
                c0496x0.c();
                return;
        }
    }
}
