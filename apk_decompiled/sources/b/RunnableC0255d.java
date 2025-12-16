package b;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0255d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f4111b;

    public /* synthetic */ RunnableC0255d(o oVar, int i) {
        this.f4110a = i;
        this.f4111b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4110a) {
            case 0:
                o this$0 = this.f4111b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.invalidateMenu();
                return;
            default:
                o this$02 = this.f4111b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                try {
                    o.access$onBackPressed$s1027565324(this$02);
                    return;
                } catch (IllegalStateException e4) {
                    if (!Intrinsics.areEqual(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e4;
                    }
                    return;
                } catch (NullPointerException e5) {
                    if (!Intrinsics.areEqual(e5.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e5;
                    }
                    return;
                }
        }
    }
}
