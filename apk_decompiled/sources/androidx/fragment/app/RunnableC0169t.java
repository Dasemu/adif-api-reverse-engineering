package androidx.fragment.app;

/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0169t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3237b;

    public /* synthetic */ RunnableC0169t(Object obj, int i) {
        this.f3236a = i;
        this.f3237b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3236a) {
            case 0:
                DialogInterfaceOnCancelListenerC0174y dialogInterfaceOnCancelListenerC0174y = (DialogInterfaceOnCancelListenerC0174y) this.f3237b;
                DialogInterfaceOnCancelListenerC0174y.access$100(dialogInterfaceOnCancelListenerC0174y).onDismiss(DialogInterfaceOnCancelListenerC0174y.access$000(dialogInterfaceOnCancelListenerC0174y));
                return;
            case 1:
                O0 o02 = (O0) this.f3237b;
                if (o02.f3062b.isEmpty()) {
                    return;
                }
                o02.i();
                return;
            default:
                ((AbstractC0158l0) this.f3237b).A(true);
                return;
        }
    }
}
