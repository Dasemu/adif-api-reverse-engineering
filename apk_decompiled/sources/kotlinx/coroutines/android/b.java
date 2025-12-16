package kotlinx.coroutines.android;

import android.view.Choreographer;
import kotlinx.coroutines.CancellableContinuation;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7152b;

    public /* synthetic */ b(Object obj, int i) {
        this.f7151a = i;
        this.f7152b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        switch (this.f7151a) {
            case 0:
                HandlerDispatcherKt.a((CancellableContinuation) this.f7152b, j4);
                return;
            default:
                ((Runnable) this.f7152b).run();
                return;
        }
    }
}
