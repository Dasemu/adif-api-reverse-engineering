package androidx.fragment.app;

/* loaded from: classes.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f2984b;

    public /* synthetic */ B(K k4, int i) {
        this.f2983a = i;
        this.f2984b = k4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2983a) {
            case 0:
                this.f2984b.startPostponedEnterTransition();
                return;
            default:
                this.f2984b.callStartTransitionListener(false);
                return;
        }
    }
}
