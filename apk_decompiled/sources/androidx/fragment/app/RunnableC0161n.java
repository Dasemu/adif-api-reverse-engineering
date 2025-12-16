package androidx.fragment.app;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0161n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J0 f3183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0167q f3184c;

    public /* synthetic */ RunnableC0161n(J0 j02, C0167q c0167q, int i) {
        this.f3182a = i;
        this.f3183b = j02;
        this.f3184c = c0167q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3182a) {
            case 0:
                J0 operation = this.f3183b;
                Intrinsics.checkNotNullParameter(operation, "$operation");
                C0167q this$0 = this.f3184c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (AbstractC0158l0.M(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                }
                operation.c(this$0);
                return;
            default:
                J0 operation2 = this.f3183b;
                Intrinsics.checkNotNullParameter(operation2, "$operation");
                C0167q this$02 = this.f3184c;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (AbstractC0158l0.M(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation2 + " has completed");
                }
                operation2.c(this$02);
                return;
        }
    }
}
